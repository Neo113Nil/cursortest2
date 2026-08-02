package ru.ok.pattern.pipeline;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.posting.donut_teaser.domain.interactor.a;
import io.reactivex.rxjava3.internal.operators.observable.n0;
import io.reactivex.rxjava3.internal.operators.observable.q1;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.opencv.core.Mat;
import ru.ok.FrameConsumer;
import ru.ok.TFFrameType;
import ru.ok.gl.util.FrameHolder;
import ru.ok.pattern.entity.PatternMatch;
import ru.ok.pattern.entity.PatternMatchRaw;
import ru.ok.pattern.keypoints.KeypointPatternMatcher;
import ru.ok.pattern.smoothing.RotationSmoother;
import ru.ok.tensorflow.detection.Detector;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.smoothing.Smoother;
import ru.ok.tensorflow.tracking.TrackerWrapper;
import ru.ok.tensorflow.util.Functional;
import ru.ok.tensorflow.util.ImageUtils;
import ru.ok.tensorflow.util.MatUtils;
import ru.ok.wrapper.AsyncWrapper;
import xsna.b9;
import xsna.do3;
import xsna.dr;
import xsna.er;
import xsna.qj7;
import xsna.rj7;
import xsna.sj7;
import xsna.v34;

/* loaded from: classes9.dex */
public class BodyPatternMatchingPipeline implements Closeable, FrameConsumer {
    private float detectionSizeMult;
    private Smoother detectionSmoother;
    private float detectionVerticalShift;
    private final Detector detector;
    private float focalLength;
    private Matrix inverseTransform;
    private int matchedPointsCutoff;
    private KeypointPatternMatcher matcher;
    private int maxMatchRemovalDelay;
    private RotationSmoother rotationSmoother;
    private Bitmap scaledBitmap;
    private Canvas scaledBitmapCanvas;
    private float templateToCropSizeRatio;
    private TrackerWrapper tracker;
    private Matrix transform;
    private int lastMatchRemovalDelay = 0;
    private List<PatternMatchRaw> lastMatches = new ArrayList();
    private AsyncWrapper<PatternMatchesAsync> matcherAsync = new AsyncWrapper<>(0, new PatternMatchesAsync(new ArrayList(), null));

    /* renamed from: ru.ok.pattern.pipeline.BodyPatternMatchingPipeline$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ru$ok$TFFrameType;

        static {
            int[] iArr = new int[TFFrameType.values().length];
            $SwitchMap$ru$ok$TFFrameType = iArr;
            try {
                iArr[TFFrameType.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$ok$TFFrameType[TFFrameType.BIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public BodyPatternMatchingPipeline(Detector detector, float f, float f2, KeypointPatternMatcher keypointPatternMatcher, int i, int i2, TrackerWrapper trackerWrapper, Smoother smoother, RotationSmoother rotationSmoother, float f3, float f4) {
        this.detector = detector;
        this.detectionSizeMult = f;
        this.detectionVerticalShift = f2;
        this.matcher = keypointPatternMatcher;
        this.matchedPointsCutoff = i;
        this.maxMatchRemovalDelay = i2;
        this.focalLength = f3;
        this.templateToCropSizeRatio = f4;
        this.tracker = trackerWrapper;
        this.detectionSmoother = smoother;
        this.rotationSmoother = rotationSmoother;
        this.scaledBitmap = Bitmap.createBitmap(detector.getInputWidth(), detector.getInputHeight(), Bitmap.Config.ARGB_8888);
        this.scaledBitmapCanvas = new Canvas(this.scaledBitmap);
    }

    private PatternMatch inferParameters(PatternMatchRaw patternMatchRaw, int i, int i2, float f) {
        Matrix matrix = new Matrix(patternMatchRaw.homography);
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        matrix.mapPoints(fArr);
        matrix.postTranslate(-fArr[0], -fArr[1]);
        Detection detection = this.detectionSmoother.smooth(Collections.singletonList(patternMatchRaw.patternDetectionOriginal)).get(0);
        PointF centerPoint = detection.getCenterPoint();
        matrix.postTranslate(centerPoint.x, centerPoint.y);
        Mat i3 = Mat.i();
        double d = f;
        i3.q(0, 0, d);
        i3.q(1, 1, d);
        float f2 = i;
        i3.q(0, 2, f2 / 2.0f);
        float f3 = i2;
        i3.q(1, 2, f3 / 2.0f);
        Pair<Mat, Mat> homography2projection = MatUtils.homography2projection(MatUtils.multiplyMatrices(i3.p(), ImageUtils.matrix2Mat(matrix, 6)));
        Mat mat = (Mat) homography2projection.first;
        Mat mat2 = (Mat) homography2projection.second;
        float[] rotationMat2eulerAngles = MatUtils.rotationMat2eulerAngles(this.rotationSmoother.smooth(mat));
        return new PatternMatch(centerPoint.x / f2, centerPoint.y / f3, detection.getSize() / f2, rotationMat2eulerAngles[0], rotationMat2eulerAngles[1], rotationMat2eulerAngles[2], matrix, mat2, patternMatchRaw.areaDetectionOriginal, detection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ PatternMatchRaw lambda$matchAsync$10(Bitmap bitmap, Detection detection) {
        return this.matcher.run(bitmap, detection, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ PatternMatchRaw lambda$matchAsync$8(Bitmap bitmap, Detection detection) {
        return this.matcher.run(bitmap, detection, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Detection lambda$matchAsync$9(Detection detection) {
        float width = detection.getWidth();
        PointF centerPoint = detection.getCenterPoint();
        PointF pointF = new PointF(centerPoint.x, (this.detectionVerticalShift * width) + centerPoint.y);
        return Detection.fromAlignmentPoints(pointF, new PointF(pointF.x, pointF.y - ((width / 2.0f) * this.detectionSizeMult))).transform(this.inverseTransform);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ PatternMatchesAsync lambda$process$0(Bitmap bitmap, Bitmap bitmap2, Mat mat) {
        return new PatternMatchesAsync(matchAsync(bitmap, bitmap2), mat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$process$1(PatternMatchRaw patternMatchRaw) {
        return Boolean.valueOf(patternMatchRaw.patternDetectionOriginal == null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$process$3(PatternMatchRaw patternMatchRaw) {
        return Boolean.valueOf(patternMatchRaw.patternDetectionOriginal != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Detection lambda$process$5(Detection detection) {
        return detection.transform(this.transform);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ PatternMatchRaw lambda$process$6(PatternMatchRaw patternMatchRaw) {
        return new PatternMatchRaw(patternMatchRaw.areaDetectionOriginal, patternMatchRaw.patternDetectionOriginal.transform(this.inverseTransform), patternMatchRaw.homography, patternMatchRaw.score.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ PatternMatch lambda$process$7(Bitmap bitmap, PatternMatchRaw patternMatchRaw) {
        return inferParameters(patternMatchRaw, bitmap.getWidth(), bitmap.getHeight(), this.focalLength);
    }

    private List<PatternMatchRaw> matchAsync(Bitmap bitmap, Bitmap bitmap2) {
        try {
            if (this.lastMatches.isEmpty() || this.lastMatches.get(0).patternDetectionOriginal == null) {
                List<Detection> detectCPU = this.detector.detectCPU(new FrameHolder(bitmap2));
                if (!detectCPU.isEmpty()) {
                    detectCPU = Arrays.asList((Detection) Functional.max(detectCPU, new q1(7)));
                }
                return Functional.map(Functional.map(detectCPU, new b9(this, 3)), new rj7(this, bitmap));
            }
            Detection detection = this.lastMatches.get(0).patternDetectionOriginal;
            float f = 1.0f / this.templateToCropSizeRatio;
            PointF centerPoint = detection.getCenterPoint();
            return Functional.map(Arrays.asList(Detection.fromAlignmentPoints(centerPoint, new PointF(centerPoint.x, centerPoint.y - ((detection.getHeight() / 2.0f) * f)))), new a(this, bitmap));
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.EMPTY_LIST;
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
    }

    public List<PatternMatch> process(Bitmap bitmap) {
        this.scaledBitmapCanvas.drawBitmap(bitmap, this.transform, null);
        return process(bitmap, this.scaledBitmap);
    }

    public void setInputSize(int i, int i2) {
        setTransform(ImageUtils.getTransformationMatrix(i, i2, this.detector.getInputWidth(), this.detector.getInputHeight(), false, true, true));
    }

    @Override // ru.ok.FrameConsumer
    public int useFrame(TFFrameType tFFrameType) {
        int i = AnonymousClass1.$SwitchMap$ru$ok$TFFrameType[tFFrameType.ordinal()];
        return (i == 1 || i == 2) ? 1 : 0;
    }

    public List<PatternMatch> process(Bitmap bitmap, Bitmap bitmap2) {
        if (this.matcherAsync.isReady()) {
            PatternMatchesAsync fetchResult = this.matcherAsync.fetchResult();
            Mat bitmapToMat = ImageUtils.bitmapToMat(bitmap2);
            boolean z = false;
            this.matcherAsync.submitTask(new qj7(this, bitmap.copy(bitmap.getConfig(), false), bitmap2.copy(bitmap2.getConfig(), false), bitmapToMat));
            boolean any = Functional.any(fetchResult.matches, new n0(7));
            PatternMatchRaw patternMatchRaw = (PatternMatchRaw) Functional.max(fetchResult.matches, new dr(5));
            if (patternMatchRaw != null && patternMatchRaw.score.intValue() < this.matchedPointsCutoff) {
                z = true;
            }
            if (any && (!z || this.lastMatchRemovalDelay < this.maxMatchRemovalDelay)) {
                this.lastMatchRemovalDelay++;
            } else {
                List<PatternMatchRaw> filter = Functional.filter(fetchResult.matches, new com.vk.movika.sdk.android.defaultplayer.view.a(7));
                this.lastMatches = filter;
                Mat mat = fetchResult.frameMatScaled;
                List<Detection> map = Functional.map(Functional.map(filter, new er(6)), new do3(this, 2));
                TrackerWrapper trackerWrapper = this.tracker;
                if (mat != null) {
                    bitmapToMat = mat;
                }
                trackerWrapper.intialize(bitmapToMat, map);
            }
        }
        List<PatternMatchRaw> trackPatternMatches = this.tracker.trackPatternMatches(bitmap2, this.lastMatches);
        this.lastMatches = trackPatternMatches;
        List<PatternMatchRaw> map2 = Functional.map(trackPatternMatches, new v34(this, 3));
        this.lastMatches = map2;
        return Functional.map(map2, new sj7(0, this, bitmap));
    }
}
