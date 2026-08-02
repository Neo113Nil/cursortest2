package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.TextureView;
import androidx.fragment.app.FragmentActivity;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.i18;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.common.liveness.a;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.entities.exceptions.CameraException;
import ru.rt.ebs.cryptosdk.entities.models.VideoResolutionRestrictions;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording.VideoRecordingFragment;
import ru.rt.ebs.cryptosdk.presentation.customView.CameraPreview;

/* loaded from: classes4.dex */
public final class pn7 {
    public static final SparseIntArray n;
    public static final SparseIntArray o;
    public final s2v a;
    public final File b;
    public MediaRecorder c;
    public CameraDevice d;
    public CameraCaptureSession e;
    public CaptureRequest.Builder f;
    public CaptureRequest.Builder g;
    public int h;
    public zis0 i = new zis0(0, 0);
    public VideoResolutionRestrictions j;
    public ExecutorService k;
    public HandlerThread l;
    public Handler m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, SubsamplingScaleImageView.ORIENTATION_270);
        sparseIntArray.append(3, SubsamplingScaleImageView.ORIENTATION_180);
        n = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.append(0, SubsamplingScaleImageView.ORIENTATION_270);
        sparseIntArray2.append(1, SubsamplingScaleImageView.ORIENTATION_180);
        sparseIntArray2.append(2, 90);
        sparseIntArray2.append(3, 0);
        o = sparseIntArray2;
    }

    public pn7(s2v s2vVar, gwy gwyVar, File file) {
        this.a = s2vVar;
        this.b = file;
    }

    public static zis0 a(List list, tls tlsVar) {
        Object obj;
        Object obj2;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            zis0 zis0Var = (zis0) obj;
            if (((Boolean) tlsVar.invoke(zis0Var)).booleanValue()) {
                int i = zis0Var.a;
                int i2 = zis0Var.b;
                if (i == (i2 * 16) / 9) {
                    if (i2 == (i * 9) / 16) {
                        break;
                    }
                }
                if (i == (i2 * 4) / 3 && i2 == (i * 3) / 4) {
                    break;
                }
            }
        }
        zis0 zis0Var2 = (zis0) obj;
        if (zis0Var2 != null) {
            return zis0Var2;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((Boolean) tlsVar.invoke((zis0) obj2)).booleanValue()) {
                break;
            }
        }
        zis0 zis0Var3 = (zis0) obj2;
        if (zis0Var3 != null) {
            return zis0Var3;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x028a, code lost:
    
        if (r1 == r3) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x028c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0082, code lost:
    
        if (r1 == r3) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, ContinuationImpl continuationImpl) {
        a aVar;
        int i2;
        int i3;
        FragmentActivity activity;
        String str;
        Object obj;
        Object obj2;
        int i4;
        pn7 pn7Var = this;
        if (continuationImpl instanceof a) {
            aVar = (a) continuationImpl;
            int i5 = aVar.e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.e = i5 - Integer.MIN_VALUE;
                Object obj3 = aVar.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = aVar.e;
                zis0 zis0Var = null;
                zy11 zy11Var = zy11.a;
                if (i2 != 0) {
                    b.b(obj3);
                    CameraPreview cameraPreview = VideoRecordingFragment.access$getViewBinding((VideoRecordingFragment) ((aj31) pn7Var.a).b).j;
                    if (cameraPreview.isAvailable()) {
                        i3 = i;
                    } else {
                        aVar.a = pn7Var;
                        i3 = i;
                        aVar.b = i3;
                        aVar.e = 1;
                        final j18 j18Var = new j18(1, dvw.b(aVar));
                        j18Var.u();
                        cameraPreview.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: ru.rt.ebs.cryptosdk.common.liveness.Camera2Controller$setSurfaceTextureListener$2$surfaceTextureListener$1
                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int width, int height) {
                                if (i18.this.isActive()) {
                                    i18.this.resumeWith(zy11.a);
                                }
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                                return true;
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int width, int height) {
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                            }
                        });
                        Object s = j18Var.s();
                        if (s != coroutineSingletons) {
                            s = zy11Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pn7Var = aVar.a;
                        b.b(obj3);
                        pn7Var.d = (CameraDevice) obj3;
                        return zy11Var;
                    }
                    int i6 = aVar.b;
                    pn7 pn7Var2 = aVar.a;
                    b.b(obj3);
                    i3 = i6;
                    pn7Var = pn7Var2;
                }
                activity = ((VideoRecordingFragment) ((aj31) pn7Var.a).b).getActivity();
                if (activity != null) {
                    CameraManager cameraManager = (CameraManager) activity.getSystemService("camera");
                    String[] cameraIdList = cameraManager.getCameraIdList();
                    int length = cameraIdList.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            str = null;
                            break;
                        }
                        str = cameraIdList[i7];
                        Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                        if (num != null && num.intValue() == i3) {
                            break;
                        }
                        i7++;
                    }
                    if (str == null) {
                        kbs.g("Front camera id is null.");
                        return null;
                    }
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                    Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                    pn7Var.h = num2 != null ? num2.intValue() : 0;
                    if (streamConfigurationMap == null) {
                        kbs.g("Cannot get available preview/video size");
                        return null;
                    }
                    Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
                    ArrayList arrayList = new ArrayList(outputSizes.length);
                    for (Size size : outputSizes) {
                        arrayList.add(new zis0(size.getWidth(), size.getHeight()));
                    }
                    VideoResolutionRestrictions videoResolutionRestrictions = pn7Var.j;
                    if (videoResolutionRestrictions == null) {
                        videoResolutionRestrictions = null;
                    }
                    int height = videoResolutionRestrictions.getMinResolution().getHeight();
                    VideoResolutionRestrictions videoResolutionRestrictions2 = pn7Var.j;
                    if (videoResolutionRestrictions2 == null) {
                        videoResolutionRestrictions2 = null;
                    }
                    int width = videoResolutionRestrictions2.getMinResolution().getWidth();
                    VideoResolutionRestrictions videoResolutionRestrictions3 = pn7Var.j;
                    if (videoResolutionRestrictions3 == null) {
                        videoResolutionRestrictions3 = null;
                    }
                    int height2 = videoResolutionRestrictions3.getMaxResolution().getHeight();
                    VideoResolutionRestrictions videoResolutionRestrictions4 = pn7Var.j;
                    if (videoResolutionRestrictions4 == null) {
                        videoResolutionRestrictions4 = null;
                    }
                    zis0 zis0Var2 = new zis0(height2, videoResolutionRestrictions4.getMaxResolution().getWidth());
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        zis0 zis0Var3 = zis0Var;
                        zis0 zis0Var4 = (zis0) next;
                        int i8 = zis0Var4.a;
                        if (640 <= i8 && i8 <= 1920 && 480 <= (i4 = zis0Var4.b) && i4 <= 1080) {
                            arrayList2.add(next);
                        }
                        zis0Var = zis0Var3;
                    }
                    zis0 zis0Var5 = zis0Var;
                    List w0 = kotlin.collections.a.w0(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : w0) {
                        zis0 zis0Var6 = (zis0) obj4;
                        zis0Var6.getClass();
                        int i9 = height * width;
                        int i10 = height;
                        int i11 = zis0Var6.b * zis0Var6.a;
                        if ((i9 < i11 || i9 <= i11) && zis0Var6.compareTo(zis0Var2) <= 0) {
                            arrayList3.add(obj4);
                        }
                        height = i10;
                    }
                    int i12 = height;
                    zis0 a = a(arrayList3, new wk6(17));
                    if (a == null) {
                        ListIterator listIterator = w0.listIterator(w0.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                obj = zis0Var5;
                                break;
                            }
                            obj = listIterator.previous();
                            zis0 zis0Var7 = (zis0) obj;
                            int i13 = i12 * width;
                            int i14 = zis0Var7.a;
                            int i15 = zis0Var7.b;
                            if (i13 >= i14 * i15 && ((i14 == (i15 * 16) / 9 && i15 == (i14 * 9) / 16) || (i14 == (i15 * 4) / 3 && i15 == (i14 * 3) / 4))) {
                                break;
                            }
                        }
                        zis0 zis0Var8 = (zis0) obj;
                        if (zis0Var8 == null) {
                            ListIterator listIterator2 = w0.listIterator(w0.size());
                            while (true) {
                                if (!listIterator2.hasPrevious()) {
                                    obj2 = zis0Var5;
                                    break;
                                }
                                obj2 = listIterator2.previous();
                                zis0 zis0Var9 = (zis0) obj2;
                                if (i12 * width >= zis0Var9.a * zis0Var9.b) {
                                    break;
                                }
                            }
                            zis0Var8 = (zis0) obj2;
                            if (zis0Var8 == null) {
                                zis0Var8 = zis0Var5;
                            }
                        }
                        if (zis0Var8 != null) {
                            a = zis0Var8;
                        } else {
                            a = a(w0, new kv5(26, zis0Var2));
                            if (a == null && (a = (zis0) kotlin.collections.a.R(w0)) == null) {
                                a = (zis0) kotlin.collections.a.P(arrayList);
                            }
                        }
                    }
                    pn7Var.i = a;
                    CameraPreview cameraPreview2 = VideoRecordingFragment.access$getViewBinding((VideoRecordingFragment) ((aj31) pn7Var.a).b).j;
                    zis0 zis0Var10 = pn7Var.i;
                    cameraPreview2.setAspectRatio(zis0Var10.b, zis0Var10.a);
                    Handler handler = pn7Var.m;
                    if (handler != null) {
                        aVar.a = pn7Var;
                        aVar.e = 2;
                        final j18 j18Var2 = new j18(1, dvw.b(aVar));
                        j18Var2.u();
                        cameraManager.openCamera(str, new CameraDevice.StateCallback() { // from class: ru.rt.ebs.cryptosdk.common.liveness.Camera2Controller$openCamera$4$1
                            @Override // android.hardware.camera2.CameraDevice.StateCallback
                            public void onDisconnected(CameraDevice device) {
                                device.close();
                                if (i18.this.isActive()) {
                                    CameraException cameraException = new CameraException("Camera device disconnected");
                                    EbsLogger.INSTANCE.warning(cameraException);
                                    i18.this.resumeWith(new Result.Failure(cameraException));
                                }
                            }

                            @Override // android.hardware.camera2.CameraDevice.StateCallback
                            public void onError(CameraDevice device, int error) {
                                String str2 = error != 1 ? error != 2 ? error != 3 ? error != 4 ? error != 5 ? "Unknown" : "Fatal (service)" : "Fatal (device)" : "Device policy" : "Maximum cameras in use" : "Camera in use";
                                if (i18.this.isActive()) {
                                    i18.this.resumeWith(new Result.Failure(new CameraException("Camera open error: ".concat(str2))));
                                }
                            }

                            @Override // android.hardware.camera2.CameraDevice.StateCallback
                            public void onOpened(CameraDevice device) {
                                if (i18.this.isActive()) {
                                    i18.this.resumeWith(device);
                                }
                            }
                        }, handler);
                        obj3 = j18Var2.s();
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    }
                }
                return zy11Var;
            }
        }
        aVar = new a(pn7Var, continuationImpl);
        Object obj32 = aVar.c;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = aVar.e;
        zis0 zis0Var11 = null;
        zy11 zy11Var2 = zy11.a;
        if (i2 != 0) {
        }
        activity = ((VideoRecordingFragment) ((aj31) pn7Var.a).b).getActivity();
        if (activity != null) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ru.rt.ebs.cryptosdk.common.liveness.b bVar;
        int i;
        SurfaceTexture surfaceTexture;
        int i2;
        Object obj;
        pn7 pn7Var;
        CaptureRequest.Builder builder;
        if (continuationImpl instanceof ru.rt.ebs.cryptosdk.common.liveness.b) {
            bVar = (ru.rt.ebs.cryptosdk.common.liveness.b) continuationImpl;
            int i3 = bVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.e = i3 - Integer.MIN_VALUE;
                Object obj2 = bVar.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.e;
                if (i != 0) {
                    b.b(obj2);
                    aj31 aj31Var = (aj31) this.a;
                    FragmentActivity activity = ((VideoRecordingFragment) aj31Var.b).getActivity();
                    if (activity != null && (surfaceTexture = VideoRecordingFragment.access$getViewBinding((VideoRecordingFragment) aj31Var.b).j.getSurfaceTexture()) != null) {
                        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
                        int i4 = this.h;
                        if (i4 != 90) {
                            i2 = SubsamplingScaleImageView.ORIENTATION_270;
                            if (i4 == 270) {
                                i2 = o.get(rotation);
                            }
                        } else {
                            i2 = n.get(rotation);
                        }
                        zis0 zis0Var = this.i;
                        Surface createPersistentInputSurface = MediaCodec.createPersistentInputSurface();
                        MediaRecorder mediaRecorder = this.c;
                        if (mediaRecorder != null) {
                            mediaRecorder.reset();
                            mediaRecorder.setAudioSource(5);
                            mediaRecorder.setVideoSource(2);
                            mediaRecorder.setOutputFormat(2);
                            mediaRecorder.setOutputFile(this.b);
                            mediaRecorder.setVideoEncoder(2);
                            mediaRecorder.setAudioEncoder(3);
                            mediaRecorder.setVideoEncodingBitRate(4608000);
                            mediaRecorder.setVideoFrameRate(30);
                            mediaRecorder.setVideoSize(zis0Var.a, zis0Var.b);
                            mediaRecorder.setAudioChannels(1);
                            mediaRecorder.setAudioSamplingRate(44100);
                            mediaRecorder.setAudioEncodingBitRate(96000);
                            mediaRecorder.setOrientationHint(i2);
                            mediaRecorder.setMaxDuration(0);
                            mediaRecorder.setMaxFileSize(0L);
                            mediaRecorder.setInputSurface(createPersistentInputSurface);
                            mediaRecorder.prepare();
                        }
                        zis0 zis0Var2 = this.i;
                        surfaceTexture.setDefaultBufferSize(zis0Var2.a, zis0Var2.b);
                        CameraDevice cameraDevice = this.d;
                        this.f = cameraDevice != null ? cameraDevice.createCaptureRequest(1) : null;
                        CameraDevice cameraDevice2 = this.d;
                        this.g = cameraDevice2 != null ? cameraDevice2.createCaptureRequest(3) : null;
                        Surface surface = new Surface(surfaceTexture);
                        List g = scc.g(surface, createPersistentInputSurface);
                        CaptureRequest.Builder builder2 = this.f;
                        if (builder2 != null) {
                            builder2.addTarget(surface);
                        }
                        CaptureRequest.Builder builder3 = this.g;
                        if (builder3 != null) {
                            builder3.addTarget(surface);
                        }
                        CaptureRequest.Builder builder4 = this.g;
                        if (builder4 != null) {
                            builder4.addTarget(createPersistentInputSurface);
                        }
                        bVar.a = this;
                        bVar.b = this;
                        bVar.e = 1;
                        final j18 j18Var = new j18(1, dvw.b(bVar));
                        j18Var.u();
                        CameraCaptureSession.StateCallback stateCallback = new CameraCaptureSession.StateCallback() { // from class: ru.rt.ebs.cryptosdk.common.liveness.Camera2Controller$createCaptureSession$2$captureStateCallback$1
                            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                            public void onConfigureFailed(CameraCaptureSession session) {
                                CameraException cameraException = new CameraException("Camera preview error - failed configure preview session");
                                EbsLogger.INSTANCE.warning(cameraException);
                                if (i18.this.isActive()) {
                                    i18.this.resumeWith(new Result.Failure(cameraException));
                                }
                            }

                            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                            public void onConfigured(CameraCaptureSession session) {
                                if (i18.this.isActive()) {
                                    i18.this.resumeWith(session);
                                }
                            }
                        };
                        ExecutorService executorService = this.k;
                        if (executorService != null) {
                            ArrayList arrayList = new ArrayList(tcc.n(g, 10));
                            Iterator it = g.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new OutputConfiguration((Surface) it.next()));
                            }
                            SessionConfiguration sessionConfiguration = new SessionConfiguration(0, arrayList, executorService, stateCallback);
                            CameraDevice cameraDevice3 = this.d;
                            if (cameraDevice3 != null) {
                                cameraDevice3.createCaptureSession(sessionConfiguration);
                            }
                        }
                        Object s = j18Var.s();
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (s == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = s;
                        pn7Var = this;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pn7 pn7Var2 = bVar.b;
                pn7 pn7Var3 = bVar.a;
                b.b(obj2);
                pn7Var = pn7Var2;
                this = pn7Var3;
                obj = obj2;
                pn7Var.e = (CameraCaptureSession) obj;
                builder = this.f;
                if (builder != null) {
                    builder.set(CaptureRequest.CONTROL_MODE, 1);
                    CameraCaptureSession cameraCaptureSession = this.e;
                    if (cameraCaptureSession != null) {
                        qje.e(cameraCaptureSession.setRepeatingRequest(builder.build(), null, this.m));
                    }
                }
                return zy11.a;
            }
        }
        bVar = new ru.rt.ebs.cryptosdk.common.liveness.b(this, continuationImpl);
        Object obj22 = bVar.c;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.e;
        if (i != 0) {
        }
        pn7Var.e = (CameraCaptureSession) obj;
        builder = this.f;
        if (builder != null) {
        }
        return zy11.a;
    }
}
