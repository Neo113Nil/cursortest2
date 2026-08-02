package ru.ok.face.pipeline_frugal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.opencv.calib3d.Calib3d;
import org.opencv.core.Mat;
import ru.ok.FrameConsumer;
import ru.ok.TFFrameType;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.face.entity.FaceFigure;
import ru.ok.face.mesh.IFaceMeshRegressor;
import ru.ok.face.pipeline_frugal.FrugalKeypointPipeline;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gl.util.FrameHolder;
import ru.ok.gpu.GlThreadWithSharedContext;
import ru.ok.tensorflow.detection.Detector;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.smoothing.ArraySmoother;
import ru.ok.tensorflow.smoothing.SmootherSimple;
import ru.ok.tensorflow.ssd.Util;
import ru.ok.tensorflow.util.Function;
import ru.ok.tensorflow.util.Functional;
import ru.ok.tensorflow.util.ImageUtils;
import ru.ok.tensorflow.util.Trigonometry;
import ru.ok.wrapper.AsyncWrapper;
import xsna.flb0;
import xsna.fq1;
import xsna.hlb0;
import xsna.j8;
import xsna.lh3;
import xsna.lus;
import xsna.mus;
import xsna.nus;
import xsna.qk10;
import xsna.sk10;
import xsna.tk10;
import xsna.yi2;

/* loaded from: classes9.dex */
public class FrugalKeypointPipeline implements Closeable, FrameConsumer {
    private ArraySmoother angleSmoother;
    private final float cropSizeMult;
    private final int detectionRotationEndIdx;
    private final int detectionRotationStartIdx;
    private final Detector detector;
    private final AsyncWrapper<List<Detection>> detectorAsync;
    private Matrix inverseTransform;
    private final IFaceMeshRegressor landmarkNet;
    private final float landmarkNetPresenceThreshold;
    private final int landmarkRotationEndIdx;
    private final float landmarkRotationOffset;
    private final int landmarkRotationStartIdx;
    private List<Detection> lastDetections = new ArrayList();
    private List<Detection> lastDetectionsPure = new ArrayList();
    private int maxDetections;
    private Bitmap scaledBitmap;
    private Canvas scaledBitmapCanvas;
    private final float similarityThreshold;
    private final SmootherSimple smoother;
    private Matrix transform;

    public FrugalKeypointPipeline(Detector detector, int i, int i2, IFaceMeshRegressor iFaceMeshRegressor, float f, float f2, SmootherSimple smootherSimple, ArraySmoother arraySmoother, int i3, int i4, int i5, int i6, float f3, float f4) {
        this.detector = detector;
        this.detectorAsync = new AsyncWrapper<>(i2, new ArrayList());
        this.landmarkNet = iFaceMeshRegressor;
        this.similarityThreshold = f2;
        this.smoother = smootherSimple;
        this.angleSmoother = arraySmoother;
        this.detectionRotationStartIdx = i3;
        this.detectionRotationEndIdx = i4;
        this.landmarkRotationStartIdx = i5;
        this.landmarkRotationEndIdx = i6;
        this.landmarkRotationOffset = f3;
        this.landmarkNetPresenceThreshold = f;
        this.maxDetections = i;
        this.cropSizeMult = f4;
        this.scaledBitmap = Bitmap.createBitmap(detector.getInputWidth(), detector.getInputHeight(), Bitmap.Config.ARGB_8888);
        this.scaledBitmapCanvas = new Canvas(this.scaledBitmap);
    }

    private static Mat getFaceRotationVector(FaceFigure faceFigure) {
        Detection detection = faceFigure.detection;
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.46317f, 7.58658f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.473255f, 5.788627f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.261778f, 4.481535f, -4.445859f, 2.663991f, 3.173422f, -6.279331f, 6.615427f, 1.42585f, -3.523964f, 8.005976f, 3.729163f, -5.258659f, 0.945811f, 2.974312f, -3.300681f, 0.861641f, 3.872784f, -1.820731f, 1.467954f, 4.224124f, -7.743095f, 2.364999f, -2.005167f, -1.785794f, -0.978284f, 4.85047f, -7.270895f, -2.890917f, -2.252455f, -1.856432f, 2.585245f, 3.757904f, -5.085276f, -7.17859f, 0.714711f, -6.407571f, 2.236021f, 1.560843f, -6.234883f, -1.94443f, 1.663542f, -1.246815f, 0.230297f, 5.681036f, -3.832928f, -1.537326f, 4.137731f, 4.445859f, 2.663991f, 3.173422f, 6.279331f, 6.615427f, 1.42585f, 3.523964f, 8.005976f, 3.729163f, 5.258659f, 0.945811f, 2.974312f, 3.300681f, 0.861641f, 3.872784f, 1.820731f, 1.467954f, 4.224124f, 7.743095f, 2.364999f, -2.005167f, 1.785794f, -0.978284f, 4.85047f, 7.270895f, -2.890917f, -2.252455f, 1.856432f, 2.585245f, 3.757904f, 5.085276f, -7.17859f, 0.714711f, 6.407571f, 2.236021f, 1.560843f, 6.234883f, -1.94443f, 1.663542f, 1.246815f, 0.230297f, 5.681036f, 3.832928f, -1.537326f, 4.137731f};
        float[] fArr2 = faceFigure.mesh;
        ArrayList arrayList = new ArrayList();
        int i = faceFigure.is3DMesh ? 3 : 2;
        int i2 = i * 4;
        arrayList.add(new hlb0(fArr2[i2], fArr2[i2 + 1]));
        int i3 = i * 6;
        arrayList.add(new hlb0(fArr2[i3], fArr2[i3 + 1]));
        int i4 = i * 10;
        arrayList.add(new hlb0(fArr2[i4], fArr2[i4 + 1]));
        int i5 = i * 33;
        arrayList.add(new hlb0(fArr2[i5], fArr2[i5 + 1]));
        int i6 = i * 54;
        arrayList.add(new hlb0(fArr2[i6], fArr2[i6 + 1]));
        int i7 = i * 67;
        arrayList.add(new hlb0(fArr2[i7], fArr2[i7 + 1]));
        int i8 = i * Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        arrayList.add(new hlb0(fArr2[i8], fArr2[i8 + 1]));
        int i9 = i * Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        arrayList.add(new hlb0(fArr2[i9], fArr2[i9 + 1]));
        int i10 = i * Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        arrayList.add(new hlb0(fArr2[i10], fArr2[i10 + 1]));
        int i11 = i * 127;
        arrayList.add(new hlb0(fArr2[i11], fArr2[i11 + 1]));
        int i12 = i * 129;
        arrayList.add(new hlb0(fArr2[i12], fArr2[i12 + 1]));
        int i13 = i * Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE;
        arrayList.add(new hlb0(fArr2[i13], fArr2[i13 + 1]));
        int i14 = i * Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE;
        arrayList.add(new hlb0(fArr2[i14], fArr2[i14 + 1]));
        int i15 = i * Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
        arrayList.add(new hlb0(fArr2[i15], fArr2[i15 + 1]));
        int i16 = i * 143;
        arrayList.add(new hlb0(fArr2[i16], fArr2[i16 + 1]));
        int i17 = i * 147;
        arrayList.add(new hlb0(fArr2[i17], fArr2[i17 + 1]));
        int i18 = i * 198;
        arrayList.add(new hlb0(fArr2[i18], fArr2[i18 + 1]));
        int i19 = i * 205;
        arrayList.add(new hlb0(fArr2[i19], fArr2[i19 + 1]));
        int i20 = i * 263;
        arrayList.add(new hlb0(fArr2[i20], fArr2[i20 + 1]));
        int i21 = i * 284;
        arrayList.add(new hlb0(fArr2[i21], fArr2[i21 + 1]));
        int i22 = i * 297;
        arrayList.add(new hlb0(fArr2[i22], fArr2[i22 + 1]));
        int i23 = i * 346;
        arrayList.add(new hlb0(fArr2[i23], fArr2[i23 + 1]));
        int i24 = i * 348;
        arrayList.add(new hlb0(fArr2[i24], fArr2[i24 + 1]));
        int i25 = i * 350;
        arrayList.add(new hlb0(fArr2[i25], fArr2[i25 + 1]));
        int i26 = i * 356;
        arrayList.add(new hlb0(fArr2[i26], fArr2[i26 + 1]));
        int i27 = i * 358;
        arrayList.add(new hlb0(fArr2[i27], fArr2[i27 + 1]));
        int i28 = i * 361;
        arrayList.add(new hlb0(fArr2[i28], fArr2[i28 + 1]));
        int i29 = i * 362;
        arrayList.add(new hlb0(fArr2[i29], fArr2[i29 + 1]));
        int i30 = i * 365;
        arrayList.add(new hlb0(fArr2[i30], fArr2[i30 + 1]));
        int i31 = i * 372;
        arrayList.add(new hlb0(fArr2[i31], fArr2[i31 + 1]));
        int i32 = i * 376;
        arrayList.add(new hlb0(fArr2[i32], fArr2[i32 + 1]));
        int i33 = i * 420;
        arrayList.add(new hlb0(fArr2[i33], fArr2[i33 + 1]));
        int i34 = i * 425;
        arrayList.add(new hlb0(fArr2[i34], fArr2[i34 + 1]));
        sk10 sk10Var = new sk10();
        sk10Var.A(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int i35 = 0;
        for (int i36 = 99; i35 < i36; i36 = 99) {
            arrayList2.add(new flb0(fArr[i35], fArr[i35 + 1], fArr[i35 + 2]));
            i35 += 3;
            fArr = fArr;
        }
        tk10 tk10Var = new tk10();
        tk10Var.A(arrayList2);
        qk10 qk10Var = new qk10(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        Mat mat = new Mat(3, 1, 6);
        Mat mat2 = new Mat(3, 1, 6);
        Mat i37 = Mat.i();
        i37.q(0, 0, 99999.0d);
        i37.q(1, 1, 99999.0d);
        i37.q(0, 2, detection.getCenterPoint().x);
        i37.q(1, 2, detection.getCenterPoint().y);
        Calib3d.d(i37, mat, mat2, qk10Var, sk10Var, tk10Var);
        return mat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Detection lambda$process$0(Detection detection) {
        Detection makeSquare = detection.makeSquare(false);
        Matrix matrix = this.inverseTransform;
        if (matrix != null) {
            makeSquare = makeSquare.transform(matrix);
        }
        return makeSquare.updateAngleDegrees(makeSquare.getRotationDegrees(this.detectionRotationStartIdx, this.detectionRotationEndIdx, 90.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$process$1(boolean z, FrameHolder frameHolder) {
        return Functional.map(z ? this.detector.detectGPU(frameHolder, Boolean.TRUE) : this.detector.detectCPU(frameHolder), new yi2(this, 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$process$2(Detection detection, Detection detection2) {
        return (int) (-Math.signum(detection.score - detection2.score));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$process$3(Detection detection, Detection detection2) {
        return (int) Math.signum(detection.id - detection2.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ FaceFigure lambda$process$4(FrameHolder frameHolder, boolean z, Detection detection) {
        return this.landmarkNet.run(frameHolder, detection, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$process$5(FaceFigure faceFigure) {
        return Boolean.valueOf(faceFigure.score > this.landmarkNetPresenceThreshold);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Detection lambda$process$6(boolean z, FaceFigure faceFigure) {
        Detection updateSpeed = Detection.fromLandmarks(faceFigure.mesh, this.cropSizeMult, z).updateId(faceFigure.detection.id).updateSpeed(faceFigure.detection.speed);
        int i = faceFigure.is3DMesh ? 3 : 2;
        float[] fArr = faceFigure.mesh;
        int i2 = this.landmarkRotationStartIdx;
        PointF pointF = new PointF(fArr[i2 * i], fArr[(i2 * i) + 1]);
        float[] fArr2 = faceFigure.mesh;
        int i3 = this.landmarkRotationEndIdx;
        return updateSpeed.updateAngleDegrees(Trigonometry.make0to360(Trigonometry.getRotationDegrees(pointF, new PointF(fArr2[i3 * i], fArr2[(i3 * i) + 1])) + this.landmarkRotationOffset)).addLocations(faceFigure.mesh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ FaceFigure lambda$process$7(Detection detection, FaceFigure faceFigure) {
        float[] extractKeypoints = detection.extractKeypoints(4);
        Detection removeKeypoints = detection.removeKeypoints(4);
        float[] fArr = faceFigure.rotationMatrix;
        ArraySmoother arraySmoother = this.angleSmoother;
        if (arraySmoother != null) {
            fArr = arraySmoother.filter(fArr);
        }
        return new FaceFigure(removeKeypoints, extractKeypoints, faceFigure.score, fArr, faceFigure.is3DMesh);
    }

    public static void processFaceAngles(FaceFigure faceFigure) {
        Mat faceRotationVector = getFaceRotationVector(faceFigure);
        Mat i = Mat.i();
        Calib3d.a(faceRotationVector, i);
        Mat w = i.w();
        double[] dArr = new double[w.d() * w.v()];
        w.k(dArr);
        int i2 = 0;
        while (true) {
            float[] fArr = faceFigure.rotationMatrix;
            if (i2 >= fArr.length) {
                return;
            }
            fArr[i2] = (float) dArr[i2];
            i2++;
        }
    }

    private void setTransform(Matrix matrix) {
        this.transform = matrix;
        Matrix matrix2 = new Matrix();
        this.inverseTransform = matrix2;
        this.transform.invert(matrix2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.detector.close();
        this.landmarkNet.close();
    }

    public boolean isGpued() {
        return this.landmarkNet.isGPUInited();
    }

    public List<FaceFigure> process(FrameHolder frameHolder) {
        this.scaledBitmapCanvas.drawBitmap(frameHolder.getCPUFrame(), this.transform, null);
        return process(frameHolder, new FrameHolder(this.scaledBitmap), false);
    }

    public List<Detection> removeSimilarDetectionFor2Faces(List<Detection> list) {
        if (Util.embeddingSimilarity(list.get(0), list.get(1)) > this.similarityThreshold / 1.5d) {
            list.remove(1);
        }
        return list;
    }

    public void setInputSize(int i, int i2) {
        setTransform(ImageUtils.getTransformationMatrix(i, i2, this.detector.getInputWidth(), this.detector.getInputHeight(), false, true, true));
    }

    public void setMaxDetections(int i) {
        this.maxDetections = i;
    }

    public void startInitGPU(GlThreadWithSharedContext glThreadWithSharedContext) {
        this.detector.startInitGPU(glThreadWithSharedContext);
        this.landmarkNet.startInitGPU(glThreadWithSharedContext);
    }

    @Override // ru.ok.FrameConsumer
    public int useFrame(TFFrameType tFFrameType) {
        return this.detector.useFrame(tFFrameType) | this.landmarkNet.useFrame(tFFrameType);
    }

    public List<FaceFigure> process(final FrameHolder frameHolder, FrameHolder frameHolder2, final boolean z) {
        if (frameHolder2 != null) {
            if (this.detectorAsync.isReady()) {
                boolean z2 = this.detector.wantRunWithGPUPass() && frameHolder2.hasGPU();
                if (z2) {
                    this.detector.copyInput(frameHolder2);
                    GlUtil.syncGL();
                }
                this.detectorAsync.submitTask(new lus(this, z2, frameHolder2));
            }
            List<Detection> removeSimilar = Util.removeSimilar(this.detectorAsync.fetchResult(), this.lastDetections, this.similarityThreshold);
            Collections.sort(removeSimilar, new mus());
            this.lastDetections.addAll(removeSimilar);
            List<Detection> list = this.lastDetections;
            List<Detection> subList = list.subList(0, Math.min(list.size(), this.maxDetections));
            this.lastDetections = subList;
            if (this.maxDetections == 2 && subList.size() == 2) {
                this.lastDetections = removeSimilarDetectionFor2Faces(this.lastDetections);
            }
        }
        List<Detection> nms = Util.nms(this.lastDetections, this.similarityThreshold, false);
        this.lastDetections = nms;
        Collections.sort(nms, new nus());
        List filter = Functional.filter(Functional.map(this.lastDetections, new Function() { // from class: xsna.ous
            @Override // ru.ok.tensorflow.util.Function
            public final Object apply(Object obj) {
                FaceFigure lambda$process$4;
                lambda$process$4 = FrugalKeypointPipeline.this.lambda$process$4(frameHolder, z, (Detection) obj);
                return lambda$process$4;
            }
        }), new fq1(this, 18));
        List<Detection> calculateSpeedByPoints = Util.calculateSpeedByPoints(Functional.map(filter, new Function() { // from class: xsna.pus
            @Override // ru.ok.tensorflow.util.Function
            public final Object apply(Object obj) {
                Detection lambda$process$6;
                lambda$process$6 = FrugalKeypointPipeline.this.lambda$process$6(z, (FaceFigure) obj);
                return lambda$process$6;
            }
        }), this.lastDetectionsPure);
        this.lastDetectionsPure.clear();
        this.lastDetectionsPure.addAll(calculateSpeedByPoints);
        SmootherSimple smootherSimple = this.smoother;
        if (smootherSimple != null) {
            calculateSpeedByPoints = smootherSimple.smooth(calculateSpeedByPoints);
        }
        List<FaceFigure> map2 = Functional.map2(calculateSpeedByPoints, filter, new lh3(this, 18));
        this.lastDetections = Functional.map(map2, new j8(11));
        return map2;
    }
}
