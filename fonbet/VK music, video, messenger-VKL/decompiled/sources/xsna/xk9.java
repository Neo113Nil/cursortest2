package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.util.Log;
import android.util.Size;
import com.huawei.hms.framework.common.BundleUtil;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.recording.StopwatchView;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.gles.a;
import com.vk.media.ok.IClipsGalleryPicker;
import com.vk.media.ok.InitStage;
import com.vk.media.ok.b;
import com.vk.media.ok.recording.GesturedRecording;
import com.vk.media.ok.recording.RecognitionView;
import com.vk.media.ok.utils.DuetAction;
import com.vk.media.recorder.f;
import com.vk.media.render.RenderBase;
import com.vk.media.render.RenderTexture;
import com.vk.media.rotation.Flip;
import com.vk.media.rotation.Rotation;
import com.vk.medianative.MediaNative;
import com.vk.ml.api.tf.TensorflowFacade;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.TFFrameType;
import ru.ok.face.entity.CatFigure;
import ru.ok.face.entity.FaceFigure;
import ru.ok.face.entity.FaceMorphingFigure;
import ru.ok.gl.GlBitmapReader;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gl.objects.SimpleGLProgram;
import ru.ok.gl.objects.TrivialFragmentShader;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.gl.tf.TensorflowFaceLandmarksType;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.tf.TensorflowSegmentationType;
import ru.ok.gl.tf.gestures.Figure;
import ru.ok.gl.tf.gestures.FiguresConsumer;
import ru.ok.gl.tf.gestures.TensorflowGestureDetector;
import ru.ok.gl.util.Consumer;
import ru.ok.gl.util.FrameHolder;
import ru.ok.gl.util.ThreadHelper;
import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.gleffects.recognition.CatData;
import ru.ok.gleffects.recognition.FaceData;
import ru.ok.gleffects.recognition.FaceMorphingData;
import ru.ok.gleffects.recognition.PatternMatchData;
import ru.ok.pattern.entity.PatternMatch;
import ru.ok.tensorflow.customview.FpsView;
import ru.ok.tensorflow.entity.Gesture;
import ru.ok.videomessages.exceptions.SOLibLoadException;
import xsna.ci9;
import xsna.ezf0;
import xsna.io9;
import xsna.jhu0;
import xsna.ky6;
import xsna.map;
import xsna.pes;

/* compiled from: CameraRenderBase.kt */
/* loaded from: classes3.dex */
public class xk9 extends RenderBase {
    public ci9.b A;
    public com.vk.media.ok.b B;
    public volatile boolean C;
    public StopwatchView D;
    public RecognitionView E;
    public IClipsGalleryPicker F;
    public com.vk.media.ok.a G;
    public kx70 H;
    public ExtraAudioSupplier I;
    public rw70 J;
    public boolean K;
    public boolean L;
    public File M;
    public long N;
    public kno O;
    public DuetAction P;
    public float Q;
    public Bitmap R;
    public hts0 S;
    public volatile float T;
    public volatile ArrayList<Long> U;
    public volatile boolean V;
    public final Flip W;
    public final int X;
    public boolean Y;
    public Runnable Z;
    public String a0;
    public volatile o9p b0;
    public jhu0.b c0;
    public f.a d0;
    public final yk9 e0;
    public final aj9 s;
    public final Context t;
    public final String u;
    public final boolean v;
    public boolean w;
    public final pes.a x;
    public final io9.d y;
    public com.vk.media.gles.a z;

    /* compiled from: CameraRenderBase.kt */
    public interface a {
    }

    /* compiled from: CameraRenderBase.kt */
    public interface b {
        void a(long j);
    }

    /* compiled from: CameraRenderBase.kt */
    public interface c {
    }

    public xk9(aj9 aj9Var, Context context, mo9 mo9Var, Point point, String str, boolean z) {
        super(mo9Var);
        this.s = aj9Var;
        this.t = context;
        this.u = str;
        this.v = z;
        pes.a aVar = new pes.a();
        aVar.a = 0L;
        this.x = aVar;
        this.y = new io9.d(point.x, point.y);
        this.P = DuetAction.CANCEL;
        this.Q = -1.0f;
        this.T = 1.0f;
        this.U = new ArrayList<>();
        this.W = Flip.NO_FLIP;
        this.a0 = new String();
        this.e0 = new yk9(this);
        try {
            this.X = (int) (4 * context.getResources().getDisplayMetrics().density);
        } catch (Exception e) {
            Log.e("CameraRenderBase", "can't calc xOffset " + e);
        }
    }

    public final void e() {
        jhu0.b bVar = this.c0;
        if (bVar != null) {
            GLES20.glFinish();
            MediaUtils.d dVar = this.d;
            ByteBuffer allocate = ByteBuffer.allocate(dVar.a * dVar.b * 4);
            GLES20.glReadPixels(0, 0, dVar.a, dVar.b, 6408, 5121, allocate);
            Bitmap createBitmap = Bitmap.createBitmap(dVar.a, dVar.b, Bitmap.Config.ARGB_8888);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                createBitmap.copyPixelsFromBuffer(allocate);
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                createBitmap.recycle();
                bVar.a(byteArray);
            } catch (Throwable th) {
                byteArrayOutputStream.close();
                createBitmap.recycle();
                throw th;
            }
        }
        this.c0 = null;
    }

    public final boolean f() {
        f.a aVar;
        boolean z;
        RenderTexture.b bVar;
        boolean z2 = false;
        if (this.h != RenderBase.RenderingState.STOP) {
            nap.b();
            RenderTexture renderTexture = this.b;
            float[] fArr = this.c;
            synchronized (renderTexture.b) {
                try {
                    if (renderTexture.d) {
                        synchronized (fap.f) {
                            RenderTexture.b bVar2 = renderTexture.c;
                            if (bVar2 != null) {
                                bVar2.updateTexImage();
                                s3q0 s3q0Var = s3q0.a;
                            }
                        }
                        if (fArr != null && (bVar = renderTexture.c) != null) {
                            bVar.getTransformMatrix(fArr);
                        }
                    }
                    renderTexture.d = false;
                } catch (Throwable th) {
                    renderTexture.a.b("RenderTexture", "can't update texture", th);
                }
                s3q0 s3q0Var2 = s3q0.a;
            }
            if (this.h != RenderBase.RenderingState.PAUSE) {
                if (this.d.d()) {
                    L.A("Empty frame size");
                    nap.b();
                    return false;
                }
                System.currentTimeMillis();
                ci9.b bVar3 = this.A;
                pes pesVar = null;
                if (bVar3 != null && bVar3.g) {
                    ci9.a aVar2 = bVar3.e;
                    synchronized (aVar2.a) {
                        try {
                            if (aVar2.d) {
                                pes.b bVar4 = aVar2.b;
                                pes.b bVar5 = aVar2.c;
                                pes pesVar2 = bVar4.a;
                                bVar4.a = bVar5.a;
                                bVar5.a = pesVar2;
                                aVar2.d = false;
                            }
                        } finally {
                        }
                    }
                    if (aVar2.c.a.i() != null) {
                        pesVar = aVar2.c.a;
                    }
                }
                RenderBase.e eVar = this.f;
                if (eVar != null) {
                    f.a aVar3 = this.d0;
                    boolean z3 = aVar3 != null ? com.vk.media.recorder.f.this.q : false;
                    com.vk.media.ok.b bVar6 = this.B;
                    if (bVar6 == null || bVar6.s == z3) {
                        z = false;
                    } else {
                        bVar6.s = z3;
                        ThreadHelper.queueOnMain(new tw70(z3, bVar6));
                        EffectRegistry effectRegistry = bVar6.H.getEffectRegistry();
                        boolean inputRecordingEventsRequired = effectRegistry.inputRecordingEventsRequired(effectRegistry.getEffectHandle(bVar6.H.getCurrentEffectName()));
                        if (inputRecordingEventsRequired || bVar6.o() || bVar6.q()) {
                            if (z3) {
                                if (inputRecordingEventsRequired && !bVar6.u()) {
                                    bVar6.H.onStartRecording();
                                }
                                if (bVar6.o()) {
                                    if (bVar6.u()) {
                                        bVar6.F.setPlayWhenReady(true);
                                    }
                                    if (bVar6.u) {
                                        bVar6.G.setPlayWhenReady(true);
                                    }
                                }
                            } else {
                                bVar6.H.onStopRecording();
                                if (bVar6.u) {
                                    bVar6.I.onStopRecording();
                                }
                                if (bVar6.o()) {
                                    bVar6.i.stop(bVar6.A);
                                    bVar6.G.setPlayWhenReady(false);
                                    bVar6.y.add(Long.valueOf(bVar6.G.getCurrentVideoTimestampMs()));
                                    bVar6.queueEvent(new wc2(bVar6, 9));
                                } else if (bVar6.q()) {
                                    bVar6.y.add(Long.valueOf(bVar6.F.getCurrentVideoTimestampMs()));
                                }
                                com.vk.media.ok.a aVar4 = bVar6.h;
                                if (aVar4 != null) {
                                    aVar4.e(bVar6.y);
                                }
                            }
                        }
                        if (bVar6.H.getEffectRegistry().inputGalleryVideoRequired(bVar6.p())) {
                            bVar6.F.setPlayWhenReady(z3);
                        }
                        z = true;
                    }
                    hts0 hts0Var = this.S;
                    boolean z4 = z || (hts0Var != null ? hts0Var.i.notifyRecording(z3) : false);
                    MediaUtils.d dVar = this.d;
                    h(dVar.a, dVar.b);
                    try {
                        map.b bVar7 = eVar.c;
                        if (bVar7 != null) {
                            bVar7.b();
                            z2 = true;
                        }
                        if (z2) {
                            g(Flip.NO_FLIP, true);
                            e();
                            map.b bVar8 = eVar.c;
                            if (bVar8 != null) {
                                fap fapVar = bVar8.a;
                                EGLSurface eGLSurface = bVar8.b;
                                if (fapVar.b != EGL14.EGL_NO_DISPLAY) {
                                    synchronized (fap.f) {
                                        EGL14.eglSwapBuffers(fapVar.b, eGLSurface);
                                    }
                                }
                            }
                            pes.a aVar5 = this.x;
                            aVar5.getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis - aVar5.a >= 1000) {
                                aVar5.a = currentTimeMillis;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    z2 = z4;
                }
                if (!z2 && (aVar = this.d0) != null) {
                    aVar.a(pesVar, this.j);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04c4, code lost:
    
        if (r12 <= 0) goto L257;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0908 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x090f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0922 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x093b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0b66  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0b75 A[Catch: SOLibLoadException -> 0x0b92, TryCatch #2 {SOLibLoadException -> 0x0b92, blocks: (B:565:0x0b6a, B:567:0x0b75, B:569:0x0b7d, B:570:0x0b7f, B:572:0x0b86, B:573:0x0b8f), top: B:564:0x0b6a }] */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0b7d A[Catch: SOLibLoadException -> 0x0b92, TryCatch #2 {SOLibLoadException -> 0x0b92, blocks: (B:565:0x0b6a, B:567:0x0b75, B:569:0x0b7d, B:570:0x0b7f, B:572:0x0b86, B:573:0x0b8f), top: B:564:0x0b6a }] */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0b86 A[Catch: SOLibLoadException -> 0x0b92, TryCatch #2 {SOLibLoadException -> 0x0b92, blocks: (B:565:0x0b6a, B:567:0x0b75, B:569:0x0b7d, B:570:0x0b7f, B:572:0x0b86, B:573:0x0b8f), top: B:564:0x0b6a }] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0b7a  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0b9f  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0bb6  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0bbb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g(Flip flip, boolean z) {
        long j;
        float f;
        float f2;
        final com.vk.media.ok.b bVar;
        hts0 hts0Var;
        RenderTexture.b bVar2;
        Rotation b2;
        Bitmap bitmap;
        int i;
        int i2;
        int i3;
        InitStage initStage;
        InitStage initStage2;
        Tensorflow tensorflow;
        TensorflowGestureDetector tensorflowGestureDetector;
        int i4;
        int i5;
        GesturedRecording gesturedRecording;
        FrameBuffer frameBuffer;
        LinkedHashMap linkedHashMap;
        int e;
        Iterator it;
        LinkedHashMap linkedHashMap2;
        Tensorflow tensorflow2;
        Map map;
        boolean z2;
        Integer num;
        boolean z3;
        boolean z4;
        boolean z5;
        LinkedHashMap linkedHashMap3;
        FpsView fpsView;
        GesturedRecording gesturedRecording2;
        PrivateFiles.a b3;
        int i6;
        int i7;
        TensorflowModel[] tensorflowModelArr;
        Tensorflow tensorflow3;
        Tensorflow tensorflow4;
        Tensorflow tensorflow5;
        Tensorflow tensorflow6;
        kx70 kx70Var;
        int i8 = 1;
        if (this.V) {
            com.vk.media.ok.b bVar3 = this.B;
            if (bVar3 != null) {
                bVar3.s0 = true;
            }
            RenderTexture.b bVar4 = this.b.c;
            if (bVar4 != null) {
                return bVar4.getTimestamp();
            }
            return 0L;
        }
        com.vk.media.gles.a aVar = this.z;
        if (aVar != null) {
            aVar.g(this.b.e, this.g, this.c, flip);
        }
        int i9 = 4;
        int i10 = 0;
        if (this.C && this.B == null) {
            try {
                kx70Var = this.H;
                if (kx70Var == null) {
                    kx70Var = null;
                }
            } catch (Throwable th) {
                th = th;
                j = 0;
                f = 1.0f;
            }
            if (!kx70Var.d()) {
                L.l("Effects are not supported. Failed to create OkEffects");
            } else {
                if (MediaNative.isGLEffectsLibSupported()) {
                    Context context = this.t;
                    syf0 syf0Var = (syf0) this.l.b;
                    MediaUtils.d dVar = this.d;
                    com.vk.media.ok.a aVar2 = this.G;
                    ExtraAudioSupplier extraAudioSupplier = this.I;
                    ExtraAudioSupplier extraAudioSupplier2 = extraAudioSupplier == null ? null : extraAudioSupplier;
                    rw70 rw70Var = this.J;
                    kx70 kx70Var2 = this.H;
                    if (kx70Var2 == null) {
                        kx70Var2 = null;
                    }
                    TensorflowFacade.a c2 = kx70Var2.c();
                    kx70 kx70Var3 = this.H;
                    if (kx70Var3 == null) {
                        kx70Var3 = null;
                    }
                    TensorflowFacade.OkEngineConfig a2 = kx70Var3.a();
                    Runnable runnable = this.Z;
                    f = 1.0f;
                    try {
                        boolean z6 = this.K;
                        f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        try {
                            kx70 kx70Var4 = this.H;
                            if (kx70Var4 == null) {
                                kx70Var4 = null;
                            }
                            TensorflowSegmentationType f3 = kx70Var4.f();
                            kx70 kx70Var5 = this.H;
                            if (kx70Var5 == null) {
                                kx70Var5 = null;
                            }
                            TensorflowFaceLandmarksType b4 = kx70Var5.b();
                            String str = this.u;
                            j = 0;
                            try {
                                kx70 kx70Var6 = this.H;
                                if (kx70Var6 == null) {
                                    kx70Var6 = null;
                                }
                                com.vk.media.ok.b bVar5 = new com.vk.media.ok.b(context, dVar, syf0Var, aVar2, extraAudioSupplier2, rw70Var, c2, a2, runnable, z6, f3, b4, str, kx70Var6.e());
                                a.C1262a c1262a = bVar5.b;
                                Rotation b5 = c1262a != null ? c1262a.b() : null;
                                if (b5 == null) {
                                    b5 = Rotation.ROTATION_0;
                                }
                                bVar5.i(b5);
                                bVar5.C(this.D, this.E, this.F);
                                DuetAction duetAction = this.P;
                                if (duetAction != DuetAction.CANCEL) {
                                    bVar5.I.presetDuetRenderMode(duetAction.h());
                                }
                                bVar5.y = this.U;
                                bVar5.D(this.O);
                                float f4 = this.T;
                                if (bVar5.v != f4) {
                                    bVar5.v = f4;
                                    bVar5.G.setDuetSpeed(1.0f / f4, true);
                                    bVar5.x = false;
                                }
                                bVar5.E(this.M, this.N);
                                ThreadHelper.queueOnMain(new m9p(bVar5, this.w, i8));
                                if (this.a0.length() > 0) {
                                    bVar5.K0 = this.a0;
                                }
                                o9p o9pVar = this.b0;
                                if (o9pVar != null) {
                                    bVar5.B(o9pVar.a, o9pVar.b);
                                    this.b0 = null;
                                }
                                this.B = bVar5;
                                float f5 = this.Q;
                                if (f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    bVar5.H.setCameraFOVDeg(f5);
                                }
                                ThreadHelper.executeOnMain(new a72(this, i9));
                            } catch (Throwable th2) {
                                th = th2;
                                this.C = false;
                                L.f("CameraRenderBase", "OkEffects init error", th);
                                bVar = this.B;
                                if (bVar != null) {
                                }
                                if (this.v) {
                                }
                                hts0Var = this.S;
                                if (hts0Var != null) {
                                }
                                bVar2 = this.b.c;
                                if (bVar2 == null) {
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            j = 0;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        j = 0;
                        f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        this.C = false;
                        L.f("CameraRenderBase", "OkEffects init error", th);
                        bVar = this.B;
                        if (bVar != null) {
                        }
                        if (this.v) {
                        }
                        hts0Var = this.S;
                        if (hts0Var != null) {
                        }
                        bVar2 = this.b.c;
                        if (bVar2 == null) {
                        }
                    }
                    bVar = this.B;
                    if (bVar != null) {
                        int i11 = this.b.e;
                        float[] fArr = this.g;
                        float[] fArr2 = this.c;
                        boolean z7 = !this.Y;
                        y930 y930Var = bVar.r;
                        long a3 = y930Var != null ? y930Var.a() : j;
                        int i12 = 2;
                        if (bVar.O0 && bVar.U0 == j && a3 > j) {
                            bVar.T0.a(bVar.g, new rfx(bVar, a3, i12));
                        }
                        if (!bVar.R0 && bVar.p() != null && bVar.H.getEffectRegistry().inputMorphingRequired(bVar.p()) && bVar.P0 != j) {
                            if (bVar.S0) {
                                bVar.Q0++;
                                if (System.currentTimeMillis() - bVar.P0 > 5000) {
                                    i = 2;
                                    i2 = i11;
                                    long currentTimeMillis = (bVar.Q0 * 1000) / (System.currentTimeMillis() - bVar.P0);
                                    bVar.R0 = true;
                                    ky6.a aVar3 = (ky6.a) Preference.j().edit();
                                    aVar3.putBoolean("key_morphing_fps_sent", true);
                                    aVar3.apply();
                                    L.p("Morphing fps = " + currentTimeMillis);
                                } else {
                                    i = 2;
                                    i2 = i11;
                                }
                                bVar.S0 = false;
                                bVar.o0.i(bVar.f.c(), bVar.f.a(), bVar.f.c(), bVar.f.a(), flip == Flip.NO_FLIP);
                                boolean z8 = bVar.X;
                                boolean z9 = bVar.p() == null && bVar.H.getEffectRegistry().inputMorphingRequired(bVar.p());
                                if (!bVar.D0 && !z9) {
                                    tensorflow3 = bVar.M;
                                    if (tensorflow3 == null && tensorflow3.isPersonSegmentationGpued() && (tensorflow6 = bVar.M) != null && tensorflow6.isCatsGpued()) {
                                        bVar.D0 = true;
                                        ThreadHelper.queueOnMain(new r44(bVar, 15));
                                    } else if (bVar.F0 && bVar.E0 && (tensorflow5 = bVar.M) != null && tensorflow5.isPersonSegmentationGpued()) {
                                        ThreadHelper.queueOnMain(new kv3(bVar, 13));
                                        bVar.E0 = false;
                                    } else if (!bVar.E0 && bVar.F0 && (tensorflow4 = bVar.M) != null && tensorflow4.isCatsGpued()) {
                                        ThreadHelper.queueOnMain(new wk(bVar, 14));
                                        bVar.F0 = false;
                                    }
                                }
                                int i13 = 10;
                                if (bVar.p() == null && bVar.H.getEffectRegistry().inputMorphingRequired(bVar.p()) && (tensorflowModelArr = bVar.N0) != null) {
                                    int length = tensorflowModelArr.length;
                                    int i14 = 0;
                                    while (i14 < length) {
                                        TensorflowModel tensorflowModel = tensorflowModelArr[i14];
                                        i3 = i;
                                        Tensorflow tensorflow7 = bVar.M;
                                        if (tensorflow7 == null || !tensorflow7.isMorphingGpued(tensorflowModel)) {
                                            float f6 = (f / (30 * 30.0f)) + bVar.V0;
                                            if (f6 > 0.9f) {
                                                f6 = 0.9f;
                                            }
                                            bVar.V0 = f6;
                                            ThreadHelper.queueOnMain(new io.reactivex.rxjava3.android.a(bVar, i13));
                                        } else {
                                            i14++;
                                            i = i3;
                                        }
                                    }
                                    i3 = i;
                                    ThreadHelper.queueOnMain(new z27(bVar, 8));
                                    TensorflowModel[] tensorflowModelArr2 = bVar.N0;
                                    if (tensorflowModelArr2 != null && tensorflowModelArr2.length != 0) {
                                        tensorflowModelArr2[0].name();
                                    }
                                    bVar.N0 = null;
                                } else {
                                    i3 = i;
                                }
                                initStage = bVar.Z;
                                initStage2 = InitStage.DONE;
                                if (initStage != initStage2 && System.currentTimeMillis() - bVar.a0 > bVar.Y) {
                                    bVar.a0 = System.currentTimeMillis();
                                    switch (b.e.$EnumSwitchMapping$0[bVar.Z.ordinal()]) {
                                        case 1:
                                            bVar.Z = InitStage.TENS1;
                                            bVar.R = com.vk.media.ok.b.l(bVar.R, bVar.f.c(), bVar.f.a());
                                            break;
                                        case 2:
                                            bVar.Z = InitStage.TENS2;
                                            bVar.S = com.vk.media.ok.b.l(bVar.S, bVar.o0.f(), bVar.o0.e());
                                            break;
                                        case 3:
                                            bVar.Z = InitStage.BUFFER1;
                                            for (TFFrameType tFFrameType : TFFrameType.values()) {
                                                if (tFFrameType != TFFrameType.BIG) {
                                                    FrameBuffer frameBuffer2 = (FrameBuffer) bVar.T.get(tFFrameType);
                                                    if (tFFrameType != TFFrameType.ORIGINAL) {
                                                        LinkedHashMap linkedHashMap4 = bVar.T;
                                                        FrameBuffer l = com.vk.media.ok.b.l(frameBuffer2, tFFrameType.frameWidth, tFFrameType.frameHeight);
                                                        if (l != null) {
                                                            linkedHashMap4.put(tFFrameType, l);
                                                        }
                                                    } else {
                                                        LinkedHashMap linkedHashMap5 = bVar.T;
                                                        FrameBuffer l2 = com.vk.media.ok.b.l(frameBuffer2, bVar.o0.c(), bVar.o0.b());
                                                        if (l2 != null) {
                                                            linkedHashMap5.put(tFFrameType, l2);
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 4:
                                            if (z8) {
                                                bVar.Z = InitStage.BUFFER2;
                                                FrameBuffer[] frameBufferArr = bVar.V;
                                                frameBufferArr[0] = com.vk.media.ok.b.l(frameBufferArr[0], bVar.f.c(), bVar.f.a());
                                                break;
                                            }
                                            break;
                                        case 5:
                                            bVar.Z = initStage2;
                                            FrameBuffer[] frameBufferArr2 = bVar.V;
                                            frameBufferArr2[1] = com.vk.media.ok.b.l(frameBufferArr2[1], bVar.f.c(), bVar.f.a());
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            throw new NoWhenBranchMatchedException();
                                    }
                                }
                                if (MediaNative.isOpenCVLibSupported()) {
                                    if (bVar.l == TensorflowFacade.OkEngineConfig.OFF) {
                                        bVar.n0 = true;
                                    } else if (!bVar.z0 && !bVar.n0) {
                                        TensorflowFacade.a aVar4 = bVar.k;
                                        if (aVar4 == null || bVar.o == null || bVar.p == null) {
                                            bVar.z0 = true;
                                        } else if (aVar4.isReady()) {
                                            boolean z10 = bVar.M == null;
                                            if (bVar.M == null) {
                                                if (bVar.x0.a() > 1) {
                                                    L.G("giving up on tf");
                                                    bVar.z0 = true;
                                                    ThreadHelper.queueOnMain(new kyc(bVar, 4));
                                                } else {
                                                    bVar.x0.c();
                                                    b3 = e8r.a.b(r10, PrivateSubdir.GPU_TFL_CACHE.h(), true);
                                                    File file = new File(b3.a.getAbsolutePath());
                                                    if (!file.exists()) {
                                                        file.mkdir();
                                                    }
                                                    Tensorflow.FeatureRequirements featureRequirements = Tensorflow.FeatureRequirements.CAMERA_CLIPS;
                                                    if (bVar.K0.length() > 0) {
                                                        Tensorflow.FeatureRequirements featureRequirements2 = Tensorflow.FeatureRequirements.CAMERA_EFFECT;
                                                        List c0 = drm0.c0(bVar.K0, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
                                                        if (c0.size() > 1) {
                                                            try {
                                                                i7 = Integer.parseInt((String) c0.get(1));
                                                            } catch (Throwable unused) {
                                                                i7 = 0;
                                                            }
                                                        }
                                                        EffectRegistry effectRegistry = bVar.H.getEffectRegistry();
                                                        List<k9x> list = pw70.a;
                                                        try {
                                                            i6 = Integer.parseInt((String) c0.get(1));
                                                        } catch (Throwable unused2) {
                                                            i6 = 0;
                                                        }
                                                        EffectRegistry.EffectId b6 = pw70.b(i6);
                                                        if (b6 != null) {
                                                            Long effectHandle = effectRegistry.getEffectHandle(b6);
                                                            if (effectRegistry.inputFullSegmentationRequired(effectHandle)) {
                                                                featureRequirements2 = featureRequirements2.getWithPersonSegmentationRequired(true);
                                                            }
                                                            if (effectRegistry.inputFaceMeshesRequired(effectHandle) || effectRegistry.inputFacesRequired(effectHandle)) {
                                                                featureRequirements2 = featureRequirements2.getWithFaceDetectionRequired(true);
                                                            }
                                                            if (effectRegistry.inputCatFaceRequired(effectHandle)) {
                                                                featureRequirements2 = featureRequirements2.getWithCatDetectionRequired(true);
                                                            }
                                                            if (effectRegistry.inputWhitePatternMatchRequired(effectHandle) || effectRegistry.inputBlackPatternMatchRequired(effectHandle)) {
                                                                featureRequirements2 = featureRequirements2.getWithPatterMatchDetectionRequired(true);
                                                            }
                                                            if (effectRegistry.inputSkySegmentationRequired(effectHandle)) {
                                                                featureRequirements2 = featureRequirements2.getWithSkyPersonSegmentationRequired(true);
                                                            }
                                                            Tensorflow.FeatureRequirements featureRequirements3 = featureRequirements2;
                                                            if (effectRegistry.inputMorphingRequired(effectHandle)) {
                                                                featureRequirements3 = featureRequirements3.getWithMorphingRequired(true, null);
                                                            }
                                                            featureRequirements = featureRequirements3;
                                                        }
                                                        featureRequirements = featureRequirements2;
                                                    }
                                                    if (!o25.a().b()) {
                                                        featureRequirements = Tensorflow.FeatureRequirements.CAMERA_CLIPS_ANON;
                                                    }
                                                    Tensorflow.FeatureRequirements featureRequirements4 = featureRequirements;
                                                    bVar.F0 = featureRequirements4.hasCatDetectionRequired();
                                                    bVar.E0 = featureRequirements4.hasPersonSegmentationRequired();
                                                    bVar.M = new Tensorflow(bVar.e.getApplicationContext(), bVar.k, bVar.n ? bVar.c0 : null, bVar.l == TensorflowFacade.OkEngineConfig.GPU, true, file, bVar.x0.b(), bVar.y0.a(), 15, null, featureRequirements4, bVar.o, bVar.p, new xw70(bVar, i10));
                                                }
                                            }
                                            if (z10 && (gesturedRecording2 = bVar.f0) != null) {
                                                gesturedRecording2.c();
                                            }
                                            TensorflowGestureDetector tensorflowGestureDetector2 = bVar.N;
                                            if (tensorflowGestureDetector2 == null) {
                                                tensorflowGestureDetector2 = new TensorflowGestureDetector.Builder(bVar.M).setOverlayView(bVar.c0).build();
                                                tensorflowGestureDetector2.addFigureConsumer(new FiguresConsumer() { // from class: xsna.yw70
                                                    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
                                                    @Override // ru.ok.gl.tf.gestures.FiguresConsumer
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                    */
                                                    public final void accept(Collection collection) {
                                                        GesturedRecording gesturedRecording3;
                                                        boolean z11;
                                                        boolean z12;
                                                        com.vk.media.ok.b bVar6 = com.vk.media.ok.b.this;
                                                        EffectHolder effectHolder = bVar6.H;
                                                        if (bVar6.i0 && !bVar6.k0 && (gesturedRecording3 = bVar6.f0) != null) {
                                                            Handler handler = gesturedRecording3.j;
                                                            com.vk.media.ok.b bVar7 = gesturedRecording3.i;
                                                            HashSet<Figure<Gesture>> hashSet = gesturedRecording3.h;
                                                            hashSet.clear();
                                                            hashSet.addAll(collection);
                                                            List<Gesture> list2 = gesturedRecording3.g;
                                                            long[] jArr = gesturedRecording3.c;
                                                            PointF pointF = gesturedRecording3.f;
                                                            PointF pointF2 = gesturedRecording3.e;
                                                            PointF pointF3 = gesturedRecording3.d;
                                                            gesturedRecording3.b();
                                                            if (collection != null) {
                                                                Iterator it2 = collection.iterator();
                                                                while (it2.hasNext()) {
                                                                    Figure figure = (Figure) it2.next();
                                                                    z11 = false;
                                                                    if (list2.contains(figure.getGesture()) || list2.contains(figure.getLastGesture())) {
                                                                        figure.getForeFingerBase(pointF3);
                                                                        figure.getForefinger(pointF2);
                                                                        float f7 = pointF3.x;
                                                                        float b7 = u11.b(pointF2.x, f7, 0.3f, f7);
                                                                        float f8 = pointF3.y;
                                                                        pointF.set(b7, u11.b(pointF2.y, f8, 0.3f, f8));
                                                                        RecognitionView recognitionView = gesturedRecording3.b;
                                                                        int maxRadius = (int) (figure.getMaxRadius() * 1.5f);
                                                                        if (recognitionView.h) {
                                                                            z12 = true;
                                                                        } else {
                                                                            RectF rectF = recognitionView.e;
                                                                            float f9 = pointF.x;
                                                                            float f10 = maxRadius;
                                                                            z12 = true;
                                                                            float f11 = pointF.y;
                                                                            rectF.set(f9 - f10, f11 - f10, f9 + f10, f11 + f10);
                                                                        }
                                                                        RectF rectF2 = recognitionView.f;
                                                                        float f12 = pointF.x;
                                                                        float f13 = maxRadius;
                                                                        float f14 = pointF.y;
                                                                        rectF2.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
                                                                        recognitionView.i = System.currentTimeMillis();
                                                                        long currentTimeMillis2 = System.currentTimeMillis();
                                                                        jArr[0] = currentTimeMillis2;
                                                                        if (jArr[z12 ? 1 : 0] == -1) {
                                                                            jArr[z12 ? 1 : 0] = currentTimeMillis2;
                                                                        }
                                                                        if (!gesturedRecording3.A) {
                                                                            bVar7.getClass();
                                                                            if (System.currentTimeMillis() - bVar7.g0 >= 1400) {
                                                                                if (gesturedRecording3.a.getVisibility() == 0) {
                                                                                    boolean z13 = gesturedRecording3.s;
                                                                                    GesturedRecording.Answers b8 = gesturedRecording3.b();
                                                                                    GesturedRecording.Answers answers = GesturedRecording.Answers.YES;
                                                                                    boolean z14 = z13 & (b8 == answers ? z12 : z11);
                                                                                    gesturedRecording3.s = z14;
                                                                                    if (!z14 && gesturedRecording3.b() == answers) {
                                                                                        gesturedRecording3.j();
                                                                                    }
                                                                                } else if (!bVar7.s) {
                                                                                    GesturedRecording.Answers b9 = gesturedRecording3.b();
                                                                                    if (b9 == GesturedRecording.Answers.YES) {
                                                                                        gesturedRecording3.s = z12;
                                                                                        gesturedRecording3.e(z11);
                                                                                        handler.removeCallbacksAndMessages(null);
                                                                                        gesturedRecording3.j();
                                                                                    } else {
                                                                                        boolean z15 = z11;
                                                                                        if (b9 == GesturedRecording.Answers.FIRST) {
                                                                                            gesturedRecording3.e(z15);
                                                                                            handler.postDelayed(new tw3(gesturedRecording3, 9), 500L);
                                                                                        }
                                                                                    }
                                                                                } else if (bVar7.s) {
                                                                                    if (!gesturedRecording3.m || ((gesturedRecording3.l && !gesturedRecording3.k) || System.currentTimeMillis() - bVar7.h0 <= 300 || gesturedRecording3.b() == GesturedRecording.Answers.NO)) {
                                                                                        GesturedRecording.Answers b10 = gesturedRecording3.b();
                                                                                        if (!gesturedRecording3.s && b10 == GesturedRecording.Answers.YES) {
                                                                                            gesturedRecording3.j();
                                                                                        } else if (b10 == GesturedRecording.Answers.NO) {
                                                                                            gesturedRecording3.s = false;
                                                                                            if (!gesturedRecording3.l) {
                                                                                                gesturedRecording3.m = true;
                                                                                                gesturedRecording3.c();
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        gesturedRecording3.e(false);
                                                                                        gesturedRecording3.j();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            z11 = false;
                                                            z12 = true;
                                                            if (!gesturedRecording3.A) {
                                                            }
                                                        }
                                                        EffectRegistry effectRegistry2 = effectHolder.getEffectRegistry();
                                                        if (effectRegistry2.inputGesturesRequired(effectRegistry2.getEffectHandle(effectHolder.getCurrentEffectName())) || bVar6.M0.gesturesRequired) {
                                                            bVar6.v(collection, false);
                                                        }
                                                    }
                                                });
                                                tensorflowGestureDetector2.addCompositeFigureConsumer(new FiguresConsumer() { // from class: xsna.zw70
                                                    @Override // ru.ok.gl.tf.gestures.FiguresConsumer
                                                    public final void accept(Collection collection) {
                                                        com.vk.media.ok.b bVar6 = com.vk.media.ok.b.this;
                                                        EffectHolder effectHolder = bVar6.H;
                                                        EffectRegistry effectRegistry2 = effectHolder.getEffectRegistry();
                                                        if (effectRegistry2.inputCompositeGesturesRequired(effectRegistry2.getEffectHandle(effectHolder.getCurrentEffectName()))) {
                                                            bVar6.v(collection, true);
                                                        }
                                                    }
                                                });
                                                tensorflowGestureDetector2.addFaceConsumer(new FiguresConsumer() { // from class: xsna.ax70
                                                    @Override // ru.ok.gl.tf.gestures.FiguresConsumer
                                                    public final void accept(Collection collection) {
                                                        com.vk.media.ok.b bVar6 = com.vk.media.ok.b.this;
                                                        EffectHolder effectHolder = bVar6.H;
                                                        EffectRegistry effectRegistry2 = effectHolder.getEffectRegistry();
                                                        Long effectHandle2 = effectRegistry2.getEffectHandle(effectHolder.getCurrentEffectName());
                                                        GesturedRecording gesturedRecording3 = bVar6.f0;
                                                        int i15 = gesturedRecording3 != null ? gesturedRecording3.t : 0;
                                                        boolean inputFacesRequired = effectRegistry2.inputFacesRequired(effectHandle2);
                                                        int i16 = 1;
                                                        boolean z11 = inputFacesRequired && i15 != 0;
                                                        if (z11 || collection.isEmpty()) {
                                                            ArrayList arrayList = new ArrayList();
                                                            Iterator it2 = collection.iterator();
                                                            while (it2.hasNext()) {
                                                                FaceFigure faceFigure = (FaceFigure) it2.next();
                                                                PointF r = com.vk.media.ok.b.r(faceFigure.mesh, 145, 158);
                                                                PointF r2 = com.vk.media.ok.b.r(faceFigure.mesh, 374, 385);
                                                                PointF r3 = com.vk.media.ok.b.r(faceFigure.mesh, i16, 2);
                                                                PointF r4 = com.vk.media.ok.b.r(faceFigure.mesh, 13, 12);
                                                                int i17 = i16;
                                                                PointF r5 = com.vk.media.ok.b.r(faceFigure.mesh, 127, 34);
                                                                PointF r6 = com.vk.media.ok.b.r(faceFigure.mesh, 356, 264);
                                                                float f7 = r.x;
                                                                float f8 = r2.x;
                                                                float f9 = r3.x;
                                                                float f10 = r4.x;
                                                                float f11 = r5.x;
                                                                float f12 = r6.x;
                                                                float f13 = r.y;
                                                                float f14 = r2.y;
                                                                float f15 = r3.y;
                                                                float f16 = r4.y;
                                                                float f17 = r5.y;
                                                                float f18 = r6.y;
                                                                float[] fArr3 = new float[12];
                                                                fArr3[0] = f7;
                                                                fArr3[i17] = f8;
                                                                fArr3[2] = f9;
                                                                fArr3[3] = f10;
                                                                fArr3[4] = f11;
                                                                fArr3[5] = f12;
                                                                fArr3[6] = f13;
                                                                fArr3[7] = f14;
                                                                fArr3[8] = f15;
                                                                fArr3[9] = f16;
                                                                fArr3[10] = f17;
                                                                fArr3[11] = f18;
                                                                arrayList.add(new FaceData(faceFigure.position, fArr3, faceFigure.rotationMatrix));
                                                                i16 = i17;
                                                            }
                                                            if (z11) {
                                                                effectHolder.handleFaces(arrayList);
                                                            }
                                                        }
                                                    }
                                                });
                                                tensorflowGestureDetector2.addFaceConsumer(new FiguresConsumer() { // from class: xsna.bx70
                                                    @Override // ru.ok.gl.tf.gestures.FiguresConsumer
                                                    public final void accept(Collection collection) {
                                                        EffectHolder effectHolder = com.vk.media.ok.b.this.H;
                                                        EffectRegistry effectRegistry2 = effectHolder.getEffectRegistry();
                                                        if (!effectRegistry2.inputFaceMeshesRequired(effectRegistry2.getEffectHandle(effectHolder.getCurrentEffectName())) || collection.isEmpty()) {
                                                            return;
                                                        }
                                                        Collection collection2 = collection;
                                                        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
                                                        Iterator it2 = collection2.iterator();
                                                        while (it2.hasNext()) {
                                                            arrayList.add(((FaceFigure) it2.next()).mesh);
                                                        }
                                                        effectHolder.handleFaceMeshes(arrayList);
                                                    }
                                                });
                                                tensorflowGestureDetector2.addCatConsumer(new FiguresConsumer() { // from class: xsna.cx70
                                                    @Override // ru.ok.gl.tf.gestures.FiguresConsumer
                                                    public final void accept(Collection collection) {
                                                        EffectHolder effectHolder = com.vk.media.ok.b.this.H;
                                                        EffectRegistry effectRegistry2 = effectHolder.getEffectRegistry();
                                                        if (!effectRegistry2.inputCatFaceRequired(effectRegistry2.getEffectHandle(effectHolder.getCurrentEffectName())) || collection.isEmpty()) {
                                                            return;
                                                        }
                                                        ArrayList arrayList = new ArrayList();
                                                        Iterator it2 = collection.iterator();
                                                        while (it2.hasNext()) {
                                                            CatFigure catFigure = (CatFigure) it2.next();
                                                            arrayList.add(new CatData(catFigure.position, catFigure.mesh, catFigure.angles));
                                                        }
                                                        effectHolder.handleCats(arrayList);
                                                    }
                                                });
                                                tensorflowGestureDetector2.addMorphConsumer(new Consumer() { // from class: xsna.ex70
                                                    @Override // ru.ok.gl.util.Consumer
                                                    public final void accept(Object obj) {
                                                        FaceMorphingFigure faceMorphingFigure = (FaceMorphingFigure) obj;
                                                        com.vk.media.ok.b bVar6 = com.vk.media.ok.b.this;
                                                        bVar6.getClass();
                                                        int width = faceMorphingFigure.outputImg.texture.getWidth();
                                                        RectF rectF = faceMorphingFigure.position;
                                                        float floatValue = faceMorphingFigure.detection.angleDegrees.floatValue() - 90;
                                                        float width2 = rectF.width() / faceMorphingFigure.cropScaleFactor;
                                                        float height = rectF.height() / faceMorphingFigure.cropScaleFactor;
                                                        double d = floatValue * 0.017453292519943295d;
                                                        double d2 = (-rectF.height()) * faceMorphingFigure.cropTranslateFactor;
                                                        float sin = (float) (Math.sin(d) * d2);
                                                        float cos = (float) (Math.cos(d) * d2);
                                                        float centerX = rectF.centerX() + sin;
                                                        float centerY = rectF.centerY() + cos;
                                                        float f7 = width2 / 2.0f;
                                                        float f8 = height / 2.0f;
                                                        RectF rectF2 = new RectF(centerX - f7, centerY - f8, centerX + f7, centerY + f8);
                                                        EffectHolder effectHolder = bVar6.H;
                                                        effectHolder.handleMorph(new FaceMorphingData(rectF2, new FaceMorphingData.ImageBuffer(faceMorphingFigure.outputImg.texture.getTextureId()), new FaceMorphingData.ImageBuffer(faceMorphingFigure.outputMask.texture.getTextureId()), new FaceMorphingData.ImageBuffer(faceMorphingFigure.outputWarpMap.texture.getTextureId()), floatValue, width, width));
                                                        if (bVar6.R0 || bVar6.p() == null || !effectHolder.getEffectRegistry().inputMorphingRequired(bVar6.p())) {
                                                            return;
                                                        }
                                                        if (bVar6.P0 == 0 && !bVar6.R0) {
                                                            bVar6.P0 = System.currentTimeMillis();
                                                            bVar6.Q0 = 0L;
                                                        }
                                                        bVar6.S0 = true;
                                                    }
                                                });
                                                tensorflowGestureDetector2.addFullSegmentationConsumer(new Consumer() { // from class: xsna.fx70
                                                    @Override // ru.ok.gl.util.Consumer
                                                    public final void accept(Object obj) {
                                                        Bitmap bitmap2 = (Bitmap) obj;
                                                        com.vk.media.ok.b bVar6 = com.vk.media.ok.b.this;
                                                        EffectHolder effectHolder = bVar6.H;
                                                        EffectRegistry effectRegistry2 = effectHolder.getEffectRegistry();
                                                        if (effectRegistry2.inputFullSegmentationRequired(effectRegistry2.getEffectHandle(effectHolder.getCurrentEffectName())) || bVar6.M0.personSegmentationRequired) {
                                                            effectHolder.handleFullSegmentation(bitmap2);
                                                        }
                                                    }
                                                });
                                                tensorflowGestureDetector2.addSkySegmentationConsumer(new Consumer() { // from class: xsna.gx70
                                                    @Override // ru.ok.gl.util.Consumer
                                                    public final void accept(Object obj) {
                                                        Bitmap bitmap2 = (Bitmap) obj;
                                                        EffectHolder effectHolder = com.vk.media.ok.b.this.H;
                                                        EffectRegistry effectRegistry2 = effectHolder.getEffectRegistry();
                                                        if (effectRegistry2.inputSkySegmentationRequired(effectRegistry2.getEffectHandle(effectHolder.getCurrentEffectName()))) {
                                                            effectHolder.handleSkySegmentation(bitmap2);
                                                        }
                                                    }
                                                });
                                                tensorflowGestureDetector2.addBodyPatternMatchConsumer(new FiguresConsumer() { // from class: xsna.ww70
                                                    @Override // ru.ok.gl.tf.gestures.FiguresConsumer
                                                    public final void accept(Collection collection) {
                                                        EffectHolder effectHolder = com.vk.media.ok.b.this.H;
                                                        EffectRegistry effectRegistry2 = effectHolder.getEffectRegistry();
                                                        Long effectHandle2 = effectRegistry2.getEffectHandle(effectHolder.getCurrentEffectName());
                                                        if (effectRegistry2.inputWhitePatternMatchRequired(effectHandle2) || effectRegistry2.inputBlackPatternMatchRequired(effectHandle2)) {
                                                            ArrayList arrayList = new ArrayList();
                                                            Iterator it2 = collection.iterator();
                                                            while (it2.hasNext()) {
                                                                PatternMatch patternMatch = (PatternMatch) it2.next();
                                                                arrayList.add(new PatternMatchData(patternMatch.x, patternMatch.y, patternMatch.size, patternMatch.angleX, patternMatch.angleY, patternMatch.angleZ));
                                                            }
                                                            effectHolder.handleBodyPatternMatches(arrayList);
                                                        }
                                                    }
                                                });
                                            }
                                            bVar.N = tensorflowGestureDetector2;
                                            bVar.n0 = true;
                                        }
                                    }
                                }
                                tensorflow = bVar.M;
                                if (tensorflow != null) {
                                    tensorflow.tryStartInitGpu();
                                }
                                if (!bVar.Q) {
                                    Tensorflow tensorflow8 = bVar.M;
                                    if (tensorflow8 != null && tensorflow8.isAllowedToRecognize()) {
                                        bVar.Q = true;
                                        ThreadHelper.queueOnMain(new kv2(bVar, 7));
                                    }
                                }
                                if (z && (fpsView = bVar.I0) != null) {
                                    fpsView.updateFps();
                                }
                                tensorflowGestureDetector = bVar.N;
                                if (tensorflowGestureDetector != null) {
                                    tensorflowGestureDetector.setSize(new Size(bVar.f.c(), bVar.f.a()));
                                }
                                int i15 = 16640;
                                if (bVar.Z.compareTo(InitStage.TENS2) > 0 && z) {
                                    gesturedRecording = bVar.f0;
                                    if (gesturedRecording == null && gesturedRecording.k()) {
                                        Tensorflow tensorflow9 = bVar.M;
                                        if (tensorflow9 != null && tensorflow9.isReady()) {
                                            if (bVar.U == null) {
                                                bVar.U = new SimpleGLProgram();
                                            }
                                            LinkedHashMap linkedHashMap6 = bVar.T;
                                            if (!linkedHashMap6.isEmpty()) {
                                                for (Map.Entry entry : linkedHashMap6.entrySet()) {
                                                    Tensorflow tensorflow10 = bVar.M;
                                                    if (tensorflow10 == null || !tensorflow10.isFrameRequired((TFFrameType) entry.getKey())) {
                                                        i2 = i2;
                                                        f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                                    } else {
                                                        FrameBuffer l3 = com.vk.media.ok.b.l(bVar.S, bVar.o0.f(), bVar.o0.e());
                                                        if (l3 != null) {
                                                            l3.bind();
                                                            float f7 = f2;
                                                            GLES20.glClearColor(f7, f7, f7, f7);
                                                            GLES20.glClear(16640);
                                                            GLES20.glViewport(0, 0, l3.getWidth(), l3.getHeight());
                                                            i5 = i2;
                                                            bVar.g(i5, bVar.o0.d(), fArr2, Flip.NO_FLIP);
                                                            l3.unbind();
                                                            frameBuffer = l3;
                                                        } else {
                                                            i5 = i2;
                                                            frameBuffer = null;
                                                        }
                                                        bVar.S = frameBuffer;
                                                        linkedHashMap = new LinkedHashMap();
                                                        FrameBuffer frameBuffer3 = bVar.S;
                                                        if (frameBuffer3 != null) {
                                                            linkedHashMap.put(TFFrameType.BIG, frameBuffer3);
                                                        }
                                                        for (Map.Entry entry2 : bVar.T.entrySet()) {
                                                            TFFrameType tFFrameType2 = (TFFrameType) entry2.getKey();
                                                            FrameBuffer frameBuffer4 = (FrameBuffer) entry2.getValue();
                                                            Tensorflow tensorflow11 = bVar.M;
                                                            if (tensorflow11 != null && tensorflow11.isFrameRequired(tFFrameType2)) {
                                                                frameBuffer4.bind();
                                                                GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                                                GLES20.glClear(16640);
                                                                GLES20.glViewport(0, 0, frameBuffer4.getWidth(), frameBuffer4.getHeight());
                                                                if (tFFrameType2 != TFFrameType.ORIGINAL) {
                                                                    SimpleGLProgram simpleGLProgram = bVar.U;
                                                                    if (simpleGLProgram != null) {
                                                                        FrameBuffer frameBuffer5 = bVar.S;
                                                                        simpleGLProgram.setTextureId(frameBuffer5 != null ? frameBuffer5.getTextureId() : 0);
                                                                    }
                                                                    SimpleGLProgram simpleGLProgram2 = bVar.U;
                                                                    if (simpleGLProgram2 != null) {
                                                                        simpleGLProgram2.setMVPMat(bVar.o0.g().get(tFFrameType2));
                                                                    }
                                                                    SimpleGLProgram simpleGLProgram3 = bVar.U;
                                                                    if (simpleGLProgram3 != null) {
                                                                        simpleGLProgram3.setTexMat(bVar.o0.a());
                                                                    }
                                                                    SimpleGLProgram simpleGLProgram4 = bVar.U;
                                                                    if (simpleGLProgram4 != null) {
                                                                        simpleGLProgram4.render();
                                                                    }
                                                                } else {
                                                                    bVar.g(i5, bVar.o0.d(), fArr2, Flip.NO_FLIP);
                                                                }
                                                                frameBuffer4.unbind();
                                                                GlUtil.checkGlError("render tf frame " + tFFrameType2);
                                                                linkedHashMap.put(tFFrameType2, frameBuffer4);
                                                            }
                                                        }
                                                        Set keySet = linkedHashMap.keySet();
                                                        e = on00.e(c5g.u(keySet, 10));
                                                        if (e < 16) {
                                                            e = 16;
                                                        }
                                                        LinkedHashMap linkedHashMap7 = new LinkedHashMap(e);
                                                        for (Object obj : keySet) {
                                                            TFFrameType tFFrameType3 = (TFFrameType) obj;
                                                            Tensorflow tensorflow12 = bVar.M;
                                                            linkedHashMap7.put(obj, Integer.valueOf(tensorflow12 != null ? tensorflow12.useFrame(tFFrameType3) : 0));
                                                        }
                                                        GlBitmapReader glBitmapReader = bVar.P;
                                                        GlBitmapReader glBitmapReader2 = bVar.O;
                                                        boolean z11 = bVar.L0;
                                                        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                                                        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                                                            int i16 = i15;
                                                            Integer num2 = (Integer) linkedHashMap7.get((TFFrameType) entry3.getKey());
                                                            if (((num2 == null || (num2.intValue() & 1) != 1) ? i10 : 1) != 0) {
                                                                linkedHashMap8.put(entry3.getKey(), entry3.getValue());
                                                                i15 = i16;
                                                                i10 = 0;
                                                            } else {
                                                                i15 = i16;
                                                            }
                                                        }
                                                        i4 = i15;
                                                        ArrayList arrayList = new ArrayList();
                                                        it = linkedHashMap8.entrySet().iterator();
                                                        while (it.hasNext()) {
                                                            Map.Entry entry4 = (Map.Entry) it.next();
                                                            int i17 = i8;
                                                            TFFrameType tFFrameType4 = (TFFrameType) entry4.getKey();
                                                            FrameBuffer frameBuffer6 = (FrameBuffer) entry4.getValue();
                                                            GlBitmapReader glBitmapReader3 = glBitmapReader;
                                                            GlBitmapReader glBitmapReader4 = (z11 && tFFrameType4 == TFFrameType.SMALL) ? glBitmapReader3 : glBitmapReader2;
                                                            frameBuffer6.bind();
                                                            Iterator it2 = it;
                                                            GlBitmapReader glBitmapReader5 = glBitmapReader2;
                                                            Bitmap bitmap2 = glBitmapReader4.getBitmap(frameBuffer6.getWidth(), frameBuffer6.getHeight());
                                                            frameBuffer6.unbind();
                                                            Pair pair = bitmap2 != null ? new Pair(tFFrameType4, bitmap2) : null;
                                                            if (pair != null) {
                                                                arrayList.add(pair);
                                                            }
                                                            glBitmapReader = glBitmapReader3;
                                                            i8 = i17;
                                                            it = it2;
                                                            glBitmapReader2 = glBitmapReader5;
                                                        }
                                                        int i18 = i8;
                                                        Map s = pn00.s(arrayList);
                                                        linkedHashMap2 = new LinkedHashMap();
                                                        for (TFFrameType tFFrameType5 : linkedHashMap.keySet()) {
                                                            Bitmap bitmap3 = (Bitmap) s.get(tFFrameType5);
                                                            FrameBuffer frameBuffer7 = (FrameBuffer) linkedHashMap.get(tFFrameType5);
                                                            Integer num3 = (Integer) linkedHashMap7.get(tFFrameType5);
                                                            if (num3 != null) {
                                                                map = s;
                                                                if ((num3.intValue() & 1) == i18) {
                                                                    z2 = true;
                                                                    boolean z12 = (z2 || bitmap3 == null) ? false : true;
                                                                    num = (Integer) linkedHashMap7.get(tFFrameType5);
                                                                    if (num == null) {
                                                                        z3 = z12;
                                                                        if ((num.intValue() & 2) == i3) {
                                                                            z4 = true;
                                                                            z5 = (z4 || frameBuffer7 == null) ? false : true;
                                                                            if (!z3 && !z5) {
                                                                                linkedHashMap2.put(tFFrameType5, new FrameHolder(bitmap3));
                                                                            } else if (z5 || z3) {
                                                                                if (z5 || !z3) {
                                                                                    linkedHashMap3 = linkedHashMap;
                                                                                    linkedHashMap2.remove(tFFrameType5);
                                                                                } else {
                                                                                    linkedHashMap3 = linkedHashMap;
                                                                                    linkedHashMap2.put(tFFrameType5, new FrameHolder(bitmap3, frameBuffer7.getTextureId(), frameBuffer7.getWidth(), frameBuffer7.getHeight()));
                                                                                }
                                                                                s = map;
                                                                                linkedHashMap = linkedHashMap3;
                                                                                i18 = 1;
                                                                                i3 = 2;
                                                                            } else {
                                                                                linkedHashMap2.put(tFFrameType5, new FrameHolder(frameBuffer7.getTextureId(), frameBuffer7.getWidth(), frameBuffer7.getHeight()));
                                                                            }
                                                                            s = map;
                                                                            i18 = 1;
                                                                            i3 = 2;
                                                                        }
                                                                    } else {
                                                                        z3 = z12;
                                                                    }
                                                                    z4 = false;
                                                                    if (z4) {
                                                                    }
                                                                    if (!z3) {
                                                                    }
                                                                    if (z5) {
                                                                    }
                                                                    if (z5) {
                                                                    }
                                                                    linkedHashMap3 = linkedHashMap;
                                                                    linkedHashMap2.remove(tFFrameType5);
                                                                    s = map;
                                                                    linkedHashMap = linkedHashMap3;
                                                                    i18 = 1;
                                                                    i3 = 2;
                                                                }
                                                            } else {
                                                                map = s;
                                                            }
                                                            z2 = false;
                                                            if (z2) {
                                                            }
                                                            num = (Integer) linkedHashMap7.get(tFFrameType5);
                                                            if (num == null) {
                                                            }
                                                            z4 = false;
                                                            if (z4) {
                                                            }
                                                            if (!z3) {
                                                            }
                                                            if (z5) {
                                                            }
                                                            if (z5) {
                                                            }
                                                            linkedHashMap3 = linkedHashMap;
                                                            linkedHashMap2.remove(tFFrameType5);
                                                            s = map;
                                                            linkedHashMap = linkedHashMap3;
                                                            i18 = 1;
                                                            i3 = 2;
                                                        }
                                                        if (!linkedHashMap2.isEmpty() && (tensorflow2 = bVar.M) != null) {
                                                            tensorflow2.acceptTens(linkedHashMap2);
                                                        }
                                                        if (bVar.Z.compareTo(InitStage.EFFECT) > 0) {
                                                            if ((bVar.H.getCurrentEffectName() == null && bVar.I.getCurrentEffectName() == null) ? false : true) {
                                                                if (bVar.u0) {
                                                                    bVar.a0 = System.currentTimeMillis();
                                                                    bVar.u0 = false;
                                                                }
                                                                i6m i6mVar = bVar.C0;
                                                                if (i6mVar != null) {
                                                                    int rotation = bVar.B0.getDefaultDisplay().getRotation();
                                                                    if (rotation == 0) {
                                                                        rotation = 0;
                                                                    } else if (rotation == 1) {
                                                                        rotation = 90;
                                                                    } else if (rotation == 2) {
                                                                        rotation = 180;
                                                                    } else if (rotation == 3) {
                                                                        rotation = atv0.b;
                                                                    }
                                                                    float[] a4 = i6mVar.a(rotation);
                                                                    Matrix.rotateM(a4, 0, 90.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                                                    bVar.H.receiveDeviceRotationMatrix(a4);
                                                                }
                                                                if (!bVar.X || bVar.Z.compareTo(InitStage.BUFFER2) <= 0 || (!z && bVar.t0)) {
                                                                    bVar.t0 = true;
                                                                    bVar.W = 0;
                                                                    if (z || bVar.s0) {
                                                                        FrameBuffer l4 = com.vk.media.ok.b.l(bVar.R, bVar.f.c(), bVar.f.a());
                                                                        if (l4 != null) {
                                                                            l4.bind();
                                                                            GLES20.glViewport(0, 0, bVar.f.c(), bVar.f.a());
                                                                            GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                                                            GLES20.glClear(i4);
                                                                            bVar.g(i5, fArr, fArr2, flip);
                                                                            l4.unbind();
                                                                            bVar.x(l4, flip, z7);
                                                                            Rect rect = bVar.w0;
                                                                            GLES20.glViewport(rect.left, rect.bottom, rect.right, rect.top);
                                                                            bVar.K.setTextureId(l4.getTextureId());
                                                                            bVar.K.render();
                                                                            bVar.H.renderTip();
                                                                            bVar.s0 = false;
                                                                        } else {
                                                                            l4 = null;
                                                                        }
                                                                        bVar.R = l4;
                                                                        GlUtil.checkGlError("OkEffects after drawFrame");
                                                                    } else {
                                                                        Rect rect2 = bVar.w0;
                                                                        GLES20.glViewport(rect2.left, rect2.bottom, rect2.right, rect2.top);
                                                                        FrameBuffer frameBuffer8 = bVar.R;
                                                                        if (frameBuffer8 != null) {
                                                                            bVar.K.setTextureId(frameBuffer8.getTextureId());
                                                                            bVar.K.render();
                                                                        }
                                                                    }
                                                                } else {
                                                                    Rect rect3 = bVar.w0;
                                                                    FrameBuffer[] frameBufferArr3 = bVar.V;
                                                                    TrivialFragmentShader trivialFragmentShader = bVar.K;
                                                                    if (z) {
                                                                        int i19 = (bVar.W + 1) % 2;
                                                                        bVar.W = i19;
                                                                        FrameBuffer l5 = com.vk.media.ok.b.l(frameBufferArr3[i19], bVar.f.c(), bVar.f.a());
                                                                        if (l5 != null) {
                                                                            l5.bind();
                                                                            GLES20.glViewport(0, 0, bVar.f.c(), bVar.f.a());
                                                                            GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                                                            GLES20.glClear(i4);
                                                                            bVar.g(i5, fArr, fArr2, flip);
                                                                            l5.unbind();
                                                                            s3q0 s3q0Var = s3q0.a;
                                                                        } else {
                                                                            l5 = null;
                                                                        }
                                                                        frameBufferArr3[i19] = l5;
                                                                        FrameBuffer l6 = com.vk.media.ok.b.l(bVar.R, bVar.f.c(), bVar.f.a());
                                                                        if (l6 != null) {
                                                                            l6.bind();
                                                                            GLES20.glViewport(0, 0, bVar.f.c(), bVar.f.a());
                                                                            GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                                                            GLES20.glClear(i4);
                                                                            if (bVar.t0) {
                                                                                bVar.g(i5, fArr, fArr2, flip);
                                                                            } else {
                                                                                trivialFragmentShader.setTextureId(frameBufferArr3[(bVar.W + 1) % 2].getTextureId());
                                                                                trivialFragmentShader.render();
                                                                            }
                                                                            l6.unbind();
                                                                            bVar.x(l6, flip, z7);
                                                                            GLES20.glViewport(rect3.left, rect3.bottom, rect3.right, rect3.top);
                                                                            trivialFragmentShader.setTextureId(l6.getTextureId());
                                                                            trivialFragmentShader.render();
                                                                            bVar.H.renderTip();
                                                                            bVar.t0 = false;
                                                                        } else {
                                                                            l6 = null;
                                                                        }
                                                                        bVar.R = l6;
                                                                    } else {
                                                                        GLES20.glViewport(rect3.left, rect3.bottom, rect3.right, rect3.top);
                                                                        FrameBuffer frameBuffer9 = bVar.R;
                                                                        if (frameBuffer9 != null) {
                                                                            trivialFragmentShader.setTextureId(frameBuffer9.getTextureId());
                                                                            trivialFragmentShader.render();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        bVar.s0 = true;
                                                        bVar.t0 = true;
                                                        bVar.W = 0;
                                                        GlUtil.checkGlError("OkEffects after drawFrame");
                                                    }
                                                }
                                            }
                                            i5 = i2;
                                            linkedHashMap = new LinkedHashMap();
                                            Set keySet2 = linkedHashMap.keySet();
                                            e = on00.e(c5g.u(keySet2, 10));
                                            if (e < 16) {
                                            }
                                            LinkedHashMap linkedHashMap72 = new LinkedHashMap(e);
                                            while (r4.hasNext()) {
                                            }
                                            GlBitmapReader glBitmapReader6 = bVar.P;
                                            GlBitmapReader glBitmapReader22 = bVar.O;
                                            boolean z112 = bVar.L0;
                                            LinkedHashMap linkedHashMap82 = new LinkedHashMap();
                                            while (r16.hasNext()) {
                                            }
                                            i4 = i15;
                                            ArrayList arrayList2 = new ArrayList();
                                            it = linkedHashMap82.entrySet().iterator();
                                            while (it.hasNext()) {
                                            }
                                            int i182 = i8;
                                            Map s2 = pn00.s(arrayList2);
                                            linkedHashMap2 = new LinkedHashMap();
                                            while (r5.hasNext()) {
                                            }
                                            if (!linkedHashMap2.isEmpty()) {
                                                tensorflow2.acceptTens(linkedHashMap2);
                                            }
                                            if (bVar.Z.compareTo(InitStage.EFFECT) > 0) {
                                            }
                                            bVar.s0 = true;
                                            bVar.t0 = true;
                                            bVar.W = 0;
                                            GlUtil.checkGlError("OkEffects after drawFrame");
                                        }
                                    }
                                }
                                i4 = 16640;
                                i5 = i2;
                                if (bVar.Z.compareTo(InitStage.EFFECT) > 0) {
                                }
                                bVar.s0 = true;
                                bVar.t0 = true;
                                bVar.W = 0;
                                GlUtil.checkGlError("OkEffects after drawFrame");
                            } else {
                                long j2 = j;
                                bVar.Q0 = j2;
                                bVar.P0 = j2;
                                bVar.S0 = false;
                            }
                        }
                        i = 2;
                        i2 = i11;
                        bVar.o0.i(bVar.f.c(), bVar.f.a(), bVar.f.c(), bVar.f.a(), flip == Flip.NO_FLIP);
                        boolean z82 = bVar.X;
                        if (bVar.p() == null) {
                        }
                        if (!bVar.D0) {
                            tensorflow3 = bVar.M;
                            if (tensorflow3 == null) {
                            }
                            if (bVar.F0) {
                            }
                            if (!bVar.E0) {
                                ThreadHelper.queueOnMain(new wk(bVar, 14));
                                bVar.F0 = false;
                            }
                        }
                        int i132 = 10;
                        if (bVar.p() == null) {
                        }
                        i3 = i;
                        initStage = bVar.Z;
                        initStage2 = InitStage.DONE;
                        if (initStage != initStage2) {
                            bVar.a0 = System.currentTimeMillis();
                            switch (b.e.$EnumSwitchMapping$0[bVar.Z.ordinal()]) {
                            }
                        }
                        if (MediaNative.isOpenCVLibSupported()) {
                        }
                        tensorflow = bVar.M;
                        if (tensorflow != null) {
                        }
                        if (!bVar.Q) {
                        }
                        if (z) {
                            fpsView.updateFps();
                        }
                        tensorflowGestureDetector = bVar.N;
                        if (tensorflowGestureDetector != null) {
                        }
                        int i152 = 16640;
                        if (bVar.Z.compareTo(InitStage.TENS2) > 0) {
                            gesturedRecording = bVar.f0;
                            if (gesturedRecording == null && gesturedRecording.k()) {
                            }
                        }
                        i4 = 16640;
                        i5 = i2;
                        if (bVar.Z.compareTo(InitStage.EFFECT) > 0) {
                        }
                        bVar.s0 = true;
                        bVar.t0 = true;
                        bVar.W = 0;
                        GlUtil.checkGlError("OkEffects after drawFrame");
                    }
                    if (this.v && this.S == null) {
                        try {
                            hts0 hts0Var2 = new hts0(this.d);
                            a.C1262a c1262a2 = hts0Var2.b;
                            b2 = c1262a2 == null ? c1262a2.b() : null;
                            if (b2 == null) {
                                b2 = Rotation.ROTATION_0;
                            }
                            hts0Var2.i(b2);
                            bitmap = this.R;
                            if (bitmap != null) {
                                hts0Var2.i.setStencilBitmap(bitmap, true);
                            }
                            this.S = hts0Var2;
                        } catch (SOLibLoadException e2) {
                            this.S = null;
                            L.g("Failed to load video message renderer .so library", e2);
                        }
                    }
                    hts0Var = this.S;
                    if (hts0Var != null) {
                        hts0Var.j(this.b.e, this.g, this.c, flip, !this.Y);
                    }
                    bVar2 = this.b.c;
                    if (bVar2 == null) {
                        return bVar2.getTimestamp();
                    }
                    return 0L;
                }
                L.l("GLEffects lib isn't attached. Failed to create OkEffects");
            }
        }
        j = 0;
        f = 1.0f;
        f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar = this.B;
        if (bVar != null) {
        }
        if (this.v) {
            hts0 hts0Var22 = new hts0(this.d);
            a.C1262a c1262a22 = hts0Var22.b;
            if (c1262a22 == null) {
            }
            if (b2 == null) {
            }
            hts0Var22.i(b2);
            bitmap = this.R;
            if (bitmap != null) {
            }
            this.S = hts0Var22;
        }
        hts0Var = this.S;
        if (hts0Var != null) {
        }
        bVar2 = this.b.c;
        if (bVar2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i, int i2) {
        int i3;
        int i4;
        com.vk.media.ok.b bVar;
        hts0 hts0Var;
        ci9.b bVar2 = this.A;
        if (bVar2 == null || !bVar2.g) {
            i3 = i;
        } else {
            int i5 = this.X;
            i3 = i + i5;
            if (!this.Y) {
                i4 = 0 - i5;
                GLES20.glViewport(i4, 0, i3, i2);
                bVar = this.B;
                if (bVar != null) {
                    bVar.w0.set(ezf0.a.a(i, i2, bVar.f));
                }
                hts0Var = this.S;
                if (hts0Var == null) {
                    hts0Var.h.set(ezf0.a.a(i, i2, hts0Var.e));
                    return;
                }
                return;
            }
        }
        i4 = 0;
        GLES20.glViewport(i4, 0, i3, i2);
        bVar = this.B;
        if (bVar != null) {
        }
        hts0Var = this.S;
        if (hts0Var == null) {
        }
    }
}
