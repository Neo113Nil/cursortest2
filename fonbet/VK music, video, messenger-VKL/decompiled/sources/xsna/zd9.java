package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Size;
import android.util.SizeF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.services.UnityAdsConstants;
import com.vk.cameraui.impl.QrScannerUi;
import com.vk.clips.design.view.recording.StopwatchView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.core.preference.Preference;
import com.vk.dto.masks.Mask;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.camera.CameraObject$CameraMode;
import com.vk.media.ok.b;
import com.vk.media.ok.recording.GesturedRecording;
import com.vk.media.ok.recording.RecognitionView;
import com.vk.media.recorder.RecorderBase;
import com.vk.media.render.RenderBase;
import com.vk.media.rotation.Rotation;
import com.vk.permission.PermissionHelper;
import com.vk.toggle.Features;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.EffectRegistry;
import xsna.bi10;
import xsna.dwr;
import xsna.dwr.a;
import xsna.io9;
import xsna.jhu0;
import xsna.kk9;
import xsna.ky6;
import xsna.mo9;
import xsna.q96;
import xsna.rl9;
import xsna.sj9;
import xsna.xk9;
import xsna.zmg0;

/* compiled from: Camera1View.java */
/* loaded from: classes13.dex */
public class zd9 extends kk9 implements jhu0.a, pj9 {
    public View.OnTouchListener G;
    public View.OnClickListener H;
    public q96.c I;
    public b.C1263b J;
    public final f K;
    public final Matrix L;
    public hvr M;
    public final String N;
    public final String O;
    public c P;
    public d Q;
    public final a1y R;
    public dwr S;
    public io9.c T;
    public final b1y U;

    @NonNull
    public final zn9 V;
    public long W;
    public AppCompatTextView a0;
    public final a b0;
    public final xl0 c0;
    public final b d0;

    /* compiled from: Camera1View.java */
    public class a implements Runnable {
        public final /* synthetic */ xn9 b;

        public a(xn9 xn9Var) {
            this.b = xn9Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            xn9 xn9Var = this.b;
            if (xn9Var.a0 != null) {
                zd9.z(xn9Var);
                xn9Var.b.postDelayed(this, 500L);
            }
        }
    }

    /* compiled from: Camera1View.java */
    public class b implements Runnable {
        public final /* synthetic */ xn9 b;

        public b(xn9 xn9Var) {
            this.b = xn9Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            xn9 xn9Var = this.b;
            if (xn9Var.getVisibility() == 0) {
                xn9Var.A();
                return;
            }
            AppCompatTextView appCompatTextView = xn9Var.a0;
            if (appCompatTextView != null) {
                xn9Var.removeView(appCompatTextView);
                xn9Var.a0 = null;
                xn9Var.b.removeCallbacks(xn9Var.b0);
            }
        }
    }

    /* compiled from: Camera1View.java */
    public interface c {
        void a();

        void b();

        void c();

        void d(boolean z);
    }

    /* compiled from: Camera1View.java */
    public interface d {
    }

    /* compiled from: Camera1View.java */
    public static class f extends OrientationEventListener {
        public final int a;
        public final boolean b;
        public int c;
        public final e8 d;
        public final ft0 e;
        public final rw70 f;

        public f(Context context, RecorderBase.RecordingType recordingType, e8 e8Var, ft0 ft0Var, rw70 rw70Var, boolean z) {
            super(context);
            this.c = -1;
            this.b = recordingType == RecorderBase.RecordingType.LIVE && z;
            this.a = iah0.d(context) != 1 ? 90 : 0;
            super.disable();
            this.d = e8Var;
            this.e = ft0Var;
            this.f = rw70Var;
        }

        @Override // android.view.OrientationEventListener
        public final void onOrientationChanged(int i) {
            jhu0 jhu0Var = ((xn9) this.e.c).m;
            if (jhu0Var == null || i == -1) {
                return;
            }
            rw70 rw70Var = this.f;
            if (rw70Var.c && 70 <= i && i < 291) {
                rw70Var.b.invoke(rw70Var.a);
            }
            CameraUIView cameraUIView = (CameraUIView) this.d.c;
            float f = CameraUIView.w1;
            bm9 presenter = cameraUIView.getPresenter();
            if (presenter != null) {
                presenter.l3(i);
            }
            if (!this.b) {
                i = this.a;
            }
            int c = ho9.c(i, jhu0Var.a());
            if (c != this.c) {
                this.c = c;
                try {
                    sj9 e = ij9.a.e();
                    if (e != null) {
                        ((tj9) e).p(this.c);
                    }
                } catch (Throwable unused) {
                }
                kk9.b bVar = kk9.F;
                kk9.c.a(jhu0Var);
            }
        }
    }

    public zd9(@NonNull Context context, @NonNull doe0 doe0Var, @NonNull b1y b1yVar, @NonNull zn9 zn9Var, @Nullable h3g0 h3g0Var, @NonNull e8 e8Var, @NonNull bo9 bo9Var, @NonNull rw70 rw70Var, @NonNull rj9 rj9Var, @NonNull a1y a1yVar, @NonNull sc4 sc4Var, @NonNull String str, @NonNull String str2, @Nullable RecorderBase.RecordingType recordingType, boolean z, boolean z2) {
        super(context, zn9Var, false);
        this.L = new Matrix();
        this.W = -1L;
        xn9 xn9Var = (xn9) this;
        this.b0 = new a(xn9Var);
        this.c0 = new xl0(xn9Var, 8);
        this.d0 = new b(xn9Var);
        this.N = str;
        this.O = str2;
        this.K = new f(context.getApplicationContext(), getRecordingType(), e8Var, new ft0(xn9Var, 6), rw70Var, z2);
        this.U = b1yVar;
        this.V = zn9Var;
        this.R = a1yVar;
        aj9 aj9Var = ij9.a;
        kk9.e eVar = this.B;
        Context context2 = e43.a;
        Point j = iah0.j(context2);
        asu0.a.getClass();
        mo9 mo9Var = new mo9(aj9Var, context2, eVar, j, doe0Var, asu0.h(), new eoz(context), false, true);
        mk9 mk9Var = mo9Var.g;
        mk9Var.i = true;
        mo9.b bVar = new mo9.b(mk9Var, this, mo9Var.c, recordingType, mo9Var.i, true);
        mo9Var.r = bVar;
        this.s = bVar;
        bVar.f = ni9.b;
        if (!bVar.n) {
            bVar.n = true;
            com.vk.media.recorder.f fVar = bVar.a;
            if (fVar != null) {
                fVar.b(true);
            }
        }
        ExtraAudioSupplier extraAudioSupplier = this.s.h;
        mk9 mk9Var2 = mo9Var.g;
        mk9Var2.getClass();
        mk9Var2.G = bo9Var;
        mk9Var2.I = extraAudioSupplier;
        mk9Var2.J = rw70Var;
        mk9Var2.Z = sc4Var;
        mk9Var2.H = rj9Var;
        mk9Var2.K = z;
        mo9Var.e = h3g0Var;
        setCameraPreviewSurfaceHolder(mo9Var);
        int i = hh9.b;
        A();
    }

    private int getCameraRotation() {
        khu0 n;
        jhu0 jhu0Var = this.m;
        if (jhu0Var == null || (n = jhu0Var.n(this.n.intValue())) == null) {
            return -1;
        }
        return n.getOrientation();
    }

    public static void z(xn9 xn9Var) {
        AppCompatTextView appCompatTextView = xn9Var.a0;
        if (appCompatTextView != null) {
            if (xn9Var.s == null) {
                appCompatTextView.setText("");
                return;
            }
            Object recordingType = xn9Var.getRecordingType();
            Object recorderState = xn9Var.getRecorderState();
            oom0 recorderAnalytics = xn9Var.getRecorderAnalytics();
            StringBuilder sb = new StringBuilder();
            if (recordingType == null) {
                recordingType = "<null>";
            }
            sb.append(recordingType);
            sb.append("\n");
            if (recorderState == null) {
                recorderState = "<null>";
            }
            sb.append(recorderState);
            if (recorderAnalytics != null) {
                int i = recorderAnalytics.n;
                int i2 = recorderAnalytics.m;
                String str = recorderAnalytics.a;
                String str2 = recorderAnalytics.q;
                if (TextUtils.isEmpty(str2)) {
                    if (str != "") {
                        sb.append("\n");
                        sb.append(str);
                    }
                    if (i2 > 0 && i >= 0) {
                        dgn.a(i2, i, "\n", "x", sb);
                    }
                    sb.append("\nFps: ");
                    sb.append(recorderAnalytics.g);
                    Activity activity = xn9Var.getActivity();
                    sb.append("\nDevice: ");
                    sb.append(activity != null ? Integer.valueOf(ho9.d(activity)) : "???");
                    sb.append("°, Camera: ");
                    sb.append(xn9Var.getCameraRotation());
                    sb.append("°\nVideo: ");
                    sb.append(recorderAnalytics.o);
                    sb.append("°\nBitrate: ");
                    sb.append(MediaUtils.a(recorderAnalytics.j, "bps"));
                    sb.append("\nAudio: ");
                    sb.append(MediaUtils.a(recorderAnalytics.k, "bps"));
                    sb.append("\nVidio: ");
                    sb.append(MediaUtils.a(recorderAnalytics.l, "bps"));
                    sb.append("\nBytes sent: ");
                    sb.append(MediaUtils.a(recorderAnalytics.c, "B"));
                    long j = recorderAnalytics.h;
                    long j2 = recorderAnalytics.e;
                    if (j > 0 || j2 > 0) {
                        tj0.d(sb, "\nPkts lost (a/v): ", j2, DomExceptionUtils.SEPARATOR);
                        sb.append(j);
                    }
                } else {
                    sb.append("\n");
                    sb.append(str2);
                }
            }
            xn9Var.a0.setText(sb.toString());
        }
    }

    public final void A() {
        int visibility = getVisibility();
        Objects.toString(this.a0);
        AppCompatTextView appCompatTextView = this.a0;
        if (appCompatTextView != null) {
            appCompatTextView.bringToFront();
            return;
        }
        bpn0 bpn0Var = ni9.a;
        Features.Type type = Features.Type.FEATURE_CLIPS_CAMERA_DEBUG_OVERLAY;
        type.getClass();
        if (com.vk.toggle.b.A.a(type) && visibility == 0) {
            AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext());
            this.a0 = appCompatTextView2;
            appCompatTextView2.setTextColor(-1);
            this.a0.setBackgroundColor(Color.parseColor("#88000000"));
            int a2 = iah0.a(4);
            this.a0.setPadding(a2, a2, a2, a2);
            addView(this.a0, new FrameLayout.LayoutParams(-2, -2, 8388611));
            this.a0.bringToFront();
            this.b.post(this.b0);
        }
    }

    public final void B(boolean z, boolean z2) {
        StopwatchView stopwatchView;
        mo9.b bVar;
        L.p(zy60.c("isClipsTab=", ", focused=", z, z2));
        mk9 mk9Var = ((mo9) getCameraPreview()).g;
        mk9Var.getClass();
        if (z2) {
            mk9Var.L = z;
        }
        if ((!z || !z2) && (stopwatchView = mk9Var.D) != null) {
            stopwatchView.c();
        }
        com.vk.media.ok.b bVar2 = mk9Var.B;
        if (bVar2 != null) {
            boolean z3 = z2 && mk9Var.L;
            if (bVar2.j0) {
                bVar2.i0 = z3;
                GesturedRecording gesturedRecording = bVar2.f0;
                if (gesturedRecording != null) {
                    gesturedRecording.l(z3, bVar2.n);
                }
            }
        }
        if (z2 && (bVar = this.s) != null) {
            if (z) {
                long j = this.W;
                bVar.m = j;
                com.vk.media.recorder.f fVar = bVar.a;
                if (fVar != null) {
                    fVar.y(j);
                }
            } else {
                bVar.m = -1L;
                com.vk.media.recorder.f fVar2 = bVar.a;
                if (fVar2 != null) {
                    fVar2.y(-1L);
                }
            }
        }
        if (this.q != ((int) getDesiredCameraFps())) {
            L();
        }
    }

    public final void C() {
        com.vk.media.ok.b bVar = ((mo9) getCameraPreview()).g.B;
        if (bVar != null) {
            EffectRegistry effectRegistry = bVar.H.getEffectRegistry();
            Long effectHandle = effectRegistry.getEffectHandle(bVar.p0);
            if (effectRegistry.restartingEffectAfterDeletingSingleSegmentRequired(effectHandle) || effectRegistry.duetEffect(effectHandle)) {
                bVar.w();
            }
        }
    }

    public final void D() {
        com.vk.media.recorder.f fVar;
        Rotation rotation;
        L();
        oo9 cameraPreview = getCameraPreview();
        if (cameraPreview != null) {
            mo9 mo9Var = (mo9) cameraPreview;
            mk9 mk9Var = mo9Var.g;
            if (mk9Var != null) {
                if (mk9Var.s.g()) {
                    int d2 = io9.d();
                    rotation = d2 != 1 ? d2 != 2 ? d2 != 3 ? Rotation.ROTATION_0 : Rotation.ROTATION_270 : Rotation.ROTATION_180 : Rotation.ROTATION_90;
                } else {
                    rotation = null;
                }
                Objects.toString(rotation);
                com.vk.media.gles.a aVar = mk9Var.z;
                if (aVar != null) {
                    aVar.i(rotation);
                }
                com.vk.media.ok.b bVar = mk9Var.B;
                if (bVar != null) {
                    bVar.i(rotation);
                }
                hts0 hts0Var = mk9Var.S;
                if (hts0Var != null) {
                    hts0Var.i(rotation);
                }
            }
            mo9.b bVar2 = mo9Var.r;
            if (bVar2 == null || (fVar = bVar2.a) == null) {
                return;
            }
            fVar.k();
        }
    }

    public void E(boolean z) {
        I(null, null, false);
    }

    public final void F(boolean z) {
        mk9 mk9Var = ((mo9) getCameraPreview()).g;
        if (mk9Var.m0 != z) {
            mk9Var.m0 = z;
            if (mk9Var.k0) {
                mk9Var.n();
            }
        }
    }

    public final void G(@Nullable StopwatchView stopwatchView, @Nullable RecognitionView recognitionView, @Nullable o9e o9eVar) {
        mk9 mk9Var = ((mo9) getCameraPreview()).g;
        mk9Var.D = stopwatchView;
        mk9Var.E = recognitionView;
        mk9Var.F = o9eVar;
        com.vk.media.ok.b bVar = mk9Var.B;
        if (bVar != null) {
            bVar.C(stopwatchView, recognitionView, o9eVar);
        }
    }

    public void H(@Nullable Mask mask, @Nullable String str, boolean z) {
        I(mask, str, z);
    }

    public final void I(@Nullable Mask mask, @Nullable String str, boolean z) {
        boolean z2 = mask != null && mask.u;
        int i = mask != null ? mask.d : Integer.MIN_VALUE;
        String Db = mask != null ? mask.Db() : null;
        oo9 cameraPreview = getCameraPreview();
        ii9 ii9Var = str != null ? new ii9(i, str, Db, z2) : null;
        mo9 mo9Var = (mo9) cameraPreview;
        if (!z) {
            mo9Var.q = null;
        }
        if (!z) {
            mo9Var.q = ii9Var;
        }
        if (mo9Var.o) {
            mo9Var.g.s(mo9Var.n, ii9Var, new rl9.c[0]);
        }
        if (mask != null) {
            final oo9 cameraPreview2 = getCameraPreview();
            Objects.requireNonNull(cameraPreview2);
            setExternalTouchListener(new View.OnTouchListener() { // from class: xsna.yd9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    mk9 mk9Var = ((mo9) oo9.this).g;
                    com.vk.media.ok.b bVar = mk9Var.B;
                    if (bVar != null) {
                        EffectHolder effectHolder = bVar.H;
                        EffectRegistry effectRegistry = effectHolder.getEffectRegistry();
                        Long effectHandle = effectRegistry.getEffectHandle(effectHolder.getCurrentEffectName());
                        boolean z3 = motionEvent.getAction() == 0;
                        if (effectRegistry.inputTouchesRequired(effectHandle) && !effectRegistry.inputDuetsTouchEventsRequired(effectHandle)) {
                            effectHolder.onTouch(motionEvent);
                        }
                        if (z3 && effectRegistry.inputClicksRequired(effectHandle)) {
                            effectHolder.onClick(motionEvent);
                        }
                    }
                    return mk9Var.B != null;
                }
            });
        } else {
            setExternalTouchListener(null);
        }
        mo9.b bVar = this.s;
        boolean z3 = mask != null;
        bVar.q = z3;
        com.vk.media.recorder.f fVar = bVar.a;
        if (fVar != null) {
            fVar.x(z3);
        }
    }

    public final void J() {
        if (this.m == null || this.S == null) {
            return;
        }
        sj9 e2 = ij9.a.e();
        if (e2 != null) {
            String d2 = this.S.d();
            tj9 tj9Var = (tj9) e2;
            tj9Var.o(d2);
            if (!TextUtils.equals(d2, "continuous-video") && !TextUtils.equals(d2, "continuous-picture")) {
                hvr hvrVar = new hvr();
                hvrVar.g = true;
                hvrVar.h = this;
                SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
                hvrVar.b = sensorManager;
                if (sensorManager != null) {
                    hvrVar.c = sensorManager.getDefaultSensor(1);
                }
                this.M = hvrVar;
            }
            if (tj9Var.e() > 0 && tj9Var.c().indexOf("auto") >= 0) {
                ArrayList arrayList = this.S.i;
                Camera.Parameters parameters = tj9Var.a;
                if (parameters != null) {
                    parameters.setFocusAreas(tj9.d(arrayList));
                }
                ol9 ol9Var = tj9Var.b;
                if (ol9Var != null) {
                    ol9Var.e = arrayList;
                }
            }
            if (tj9Var.f() > 0) {
                ArrayList arrayList2 = this.S.j;
                Camera.Parameters parameters2 = tj9Var.a;
                if (parameters2 != null) {
                    parameters2.setMeteringAreas(tj9.d(arrayList2));
                }
            }
        }
        kk9.c.a(this.m);
    }

    public final void K(@Nullable File file, long j) {
        long j2 = file != null ? 1500L : -1L;
        this.W = j2;
        mo9.b bVar = this.s;
        bVar.m = j2;
        com.vk.media.recorder.f fVar = bVar.a;
        if (fVar != null) {
            fVar.y(j2);
        }
        mk9 mk9Var = ((mo9) getCameraPreview()).g;
        mk9Var.M = file;
        mk9Var.N = j;
        com.vk.media.ok.b bVar2 = mk9Var.B;
        if (bVar2 != null) {
            bVar2.E(file, j);
        }
        setMusicSelected(file != null);
    }

    public final void L() {
        aj9 aj9Var;
        sj9 e2;
        if (this.m == null || (e2 = (aj9Var = ij9.a).e()) == null) {
            return;
        }
        p();
        Activity activity = getActivity();
        int intValue = this.n.intValue();
        int displayOrientation = getDisplayOrientation();
        if (activity != null) {
            khu0 c2 = aj9Var.c(intValue);
            if (activity.getRequestedOrientation() != -1 || displayOrientation == -1) {
                displayOrientation = ho9.c(ho9.d(activity), intValue);
            } else if (c2.a() == 1) {
                displayOrientation = (360 - displayOrientation) % 360;
            }
            this.K.c = displayOrientation;
            L.e(lhg.a(displayOrientation, "Rotation output: "));
            try {
                ((tj9) e2).p(displayOrientation);
            } catch (Throwable th) {
                L.G("can't set rotation " + displayOrientation + " e=" + th);
            }
            L.e(lhg.a(displayOrientation, "Rotation camera: "));
        } else {
            L.G("incorrect camera input parameters!");
        }
        kk9.c.a(this.m);
    }

    public final void M() {
        new Exception();
        r(this.i);
        A();
    }

    public final void N() {
        new Exception();
        AppCompatTextView appCompatTextView = this.a0;
        if (appCompatTextView != null) {
            removeView(appCompatTextView);
            this.a0 = null;
            this.b.removeCallbacks(this.b0);
        }
        w(false, true);
    }

    public final void O(boolean z) {
        ((mo9) getCameraPreview()).g.V = z;
    }

    public final void P(ArrayList<Long> arrayList, boolean z) {
        mk9 mk9Var = ((mo9) getCameraPreview()).g;
        mk9Var.U = arrayList;
        com.vk.media.ok.b bVar = mk9Var.B;
        if (bVar != null) {
            if (bVar.o() || bVar.q()) {
                bVar.queueEvent(new jx70(bVar, arrayList, z));
            }
        }
    }

    @Override // xsna.jhu0.a
    public final void a(boolean z) {
        dwr dwrVar = this.S;
        int i = dwrVar.a;
        if (i == 2) {
            if (z) {
                dwrVar.a = 3;
            } else {
                dwrVar.a = 4;
            }
            dwrVar.f();
            dwrVar.c();
            return;
        }
        if (i == 1) {
            if (z) {
                dwrVar.a = 3;
            } else {
                dwrVar.a = 4;
            }
            dwrVar.f();
            if (dwrVar.i != null) {
                dwrVar.m.sendEmptyMessageDelayed(0, 3000L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // xsna.pj9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(@NonNull oj9 oj9Var) {
        boolean z;
        rit0 rit0Var;
        d dVar = this.Q;
        if (dVar != null) {
            CameraUIView cameraUIView = (CameraUIView) ((l8) dVar).c;
            float f2 = CameraUIView.w1;
            if (cameraUIView.getStoriesSettingsController().c()) {
                z = true;
                oj9Var.a = z;
                oj9Var.c = this.K.c;
                oj9Var.d = !m() ? CameraObject$CameraMode.BACK : CameraObject$CameraMode.FRONT;
                rit0Var = this.r;
                if (rit0Var == null) {
                    oj9Var.b = rit0Var.a;
                    return;
                }
                return;
            }
        }
        z = false;
        oj9Var.a = z;
        oj9Var.c = this.K.c;
        oj9Var.d = !m() ? CameraObject$CameraMode.BACK : CameraObject$CameraMode.FRONT;
        rit0Var = this.r;
        if (rit0Var == null) {
        }
    }

    @Override // xsna.q96
    @NonNull
    public final q96.b c(View view) {
        q96.b c2 = super.c(view);
        c2.setOnTouchListener(new e(getContext()));
        return c2;
    }

    @Override // xsna.kk9
    public float getDesiredCameraFps() {
        bm9 presenter = this.V.a.getPresenter();
        if (presenter == null || !presenter.J3()) {
            return 30.0f;
        }
        bpn0 bpn0Var = ni9.a;
        return Preference.f("clips_camera_settings").getBoolean("clips_camera_60_fps", true) ? 60.0f : 30.0f;
    }

    public g0m0 getFinishListener() {
        return this.U;
    }

    @Override // xsna.kk9
    public int getFlashMode() {
        return super.getFlashMode();
    }

    public float getZoomLevel() {
        return getCameraZoomLevel();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01c3  */
    @Override // xsna.kk9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        sj9 e2;
        Camera.Size previewSize;
        Integer num;
        double atan;
        SizeF sizeF;
        Size size;
        p();
        this.K.enable();
        L();
        aj9 aj9Var = ij9.a;
        sj9 e3 = aj9Var.e();
        if (e3 != null) {
            tj9 tj9Var = (tj9) e3;
            Size i = tj9Var.i();
            if (i != null) {
                boolean z = this.n == aj9Var.d();
                Looper mainLooper = getContext().getMainLooper();
                dwr dwrVar = new dwr();
                dwrVar.a = 0;
                dwrVar.m = dwrVar.new a(mainLooper);
                dwrVar.d = new Matrix();
                dwrVar.l = e3;
                dwrVar.b = tj9Var.e() > 0 && tj9Var.c().indexOf("auto") >= 0;
                dwrVar.c = tj9Var.f() > 0;
                if (!"true".equals(dwrVar.l.get("auto-exposure-lock-supported"))) {
                    "true".equals(dwrVar.l.get("auto-whitebalance-lock-supported"));
                }
                dwrVar.n = this;
                dwrVar.g = z;
                dwrVar.e();
                this.S = dwrVar;
                int width = i.getWidth();
                int height = i.getHeight();
                if (dwrVar.e != width || dwrVar.f != height) {
                    dwrVar.e = width;
                    dwrVar.f = height;
                    dwrVar.e();
                }
                this.S.o = this;
            }
            oo9 cameraPreview = getCameraPreview();
            ol9 ol9Var = tj9Var.b;
            r10 = null;
            Size size2 = null;
            if (ol9Var != null) {
                CameraCharacteristics cameraCharacteristics = ol9Var.a;
                float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                if (fArr != null) {
                    if (fArr.length == 0) {
                        fArr = null;
                    }
                    if (fArr != null && (sizeF = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)) != null) {
                        if (sizeF.getWidth() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || sizeF.getHeight() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            sizeF = null;
                        }
                        if (sizeF != null && (size = ol9Var.b) != null) {
                            if (size.getWidth() > 0 && size.getHeight() > 0) {
                                size2 = size;
                            }
                            if (size2 != null) {
                                float f2 = fArr[0];
                                atan = Math.atan(((sizeF.getWidth() / sizeF.getHeight() > Math.min(size2.getWidth(), size2.getHeight()) / Math.max(size2.getWidth(), size2.getHeight()) ? sizeF.getHeight() * r5 : sizeF.getWidth()) / 2) / f2) * 2.0d;
                                final float degrees = atan != -1.0d ? (float) Math.toDegrees(atan) : -1.0f;
                                final mk9 mk9Var = ((mo9) cameraPreview).g;
                                mk9Var.getClass();
                                mk9Var.d(new Runnable() { // from class: xsna.wk9
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        float f3 = degrees;
                                        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            xk9 xk9Var = mk9Var;
                                            if (xk9Var.Q == f3) {
                                                return;
                                            }
                                            xk9Var.Q = f3;
                                            com.vk.media.ok.b bVar = xk9Var.B;
                                            if (bVar != null) {
                                                bVar.H.setCameraFOVDeg(f3);
                                            }
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
                atan = -1.0d;
                if (atan != -1.0d) {
                }
                final mk9 mk9Var2 = ((mo9) cameraPreview).g;
                mk9Var2.getClass();
                mk9Var2.d(new Runnable() { // from class: xsna.wk9
                    @Override // java.lang.Runnable
                    public final void run() {
                        float f3 = degrees;
                        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            xk9 xk9Var = mk9Var2;
                            if (xk9Var.Q == f3) {
                                return;
                            }
                            xk9Var.Q = f3;
                            com.vk.media.ok.b bVar = xk9Var.B;
                            if (bVar != null) {
                                bVar.H.setCameraFOVDeg(f3);
                            }
                        }
                    }
                });
            } else {
                Camera.Parameters parameters = tj9Var.a;
                if (parameters != null && (previewSize = parameters.getPreviewSize()) != null) {
                    if (previewSize.width <= 0 || previewSize.height <= 0) {
                        previewSize = null;
                    }
                    if (previewSize != null) {
                        float verticalViewAngle = parameters.getVerticalViewAngle();
                        Float valueOf = Float.valueOf(verticalViewAngle);
                        if (verticalViewAngle == -1.0f) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            float floatValue = valueOf.floatValue();
                            parameters.isZoomSupported();
                            List<Integer> zoomRatios = parameters.getZoomRatios();
                            if (zoomRatios != null) {
                                List<Integer> list = parameters.getZoom() < zoomRatios.size() ? zoomRatios : null;
                                if (list != null && (num = list.get(parameters.getZoom())) != null) {
                                    atan = Math.atan((Math.tan((Math.atan(Math.tan(Math.toRadians(floatValue) / 2) * (previewSize.width / previewSize.height)) * 2.0d) / 2.0d) * 100.0d) / num.intValue()) * 2.0d;
                                    if (atan != -1.0d) {
                                    }
                                    final mk9 mk9Var22 = ((mo9) cameraPreview).g;
                                    mk9Var22.getClass();
                                    mk9Var22.d(new Runnable() { // from class: xsna.wk9
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            float f3 = degrees;
                                            if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                xk9 xk9Var = mk9Var22;
                                                if (xk9Var.Q == f3) {
                                                    return;
                                                }
                                                xk9Var.Q = f3;
                                                com.vk.media.ok.b bVar = xk9Var.B;
                                                if (bVar != null) {
                                                    bVar.H.setCameraFOVDeg(f3);
                                                }
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    }
                }
                atan = -1.0d;
                if (atan != -1.0d) {
                }
                final mk9 mk9Var222 = ((mo9) cameraPreview).g;
                mk9Var222.getClass();
                mk9Var222.d(new Runnable() { // from class: xsna.wk9
                    @Override // java.lang.Runnable
                    public final void run() {
                        float f3 = degrees;
                        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            xk9 xk9Var = mk9Var222;
                            if (xk9Var.Q == f3) {
                                return;
                            }
                            xk9Var.Q = f3;
                            com.vk.media.ok.b bVar = xk9Var.B;
                            if (bVar != null) {
                                bVar.H.setCameraFOVDeg(f3);
                            }
                        }
                    }
                });
            }
        }
        J();
        Context context = e43.a;
        PermissionHelper.a.getClass();
        if (!PermissionHelper.b(context, PermissionHelper.l) || (e2 = aj9Var.e()) == null) {
            return;
        }
        if (this.n == aj9Var.d()) {
            ky6.a aVar = (ky6.a) Preference.j().edit();
            aVar.putLong(this.N, io9.b(e2));
            aVar.a();
        } else {
            ky6.a aVar2 = (ky6.a) Preference.j().edit();
            aVar2.putLong(this.O, io9.b(e2));
            aVar2.a();
        }
    }

    public void setCameraTracker(@Nullable c cVar) {
        this.P = cVar;
    }

    public void setClipSpeed(final float f2) {
        final mk9 mk9Var = ((mo9) getCameraPreview()).g;
        mk9Var.T = f2;
        mk9Var.d(new Runnable() { // from class: xsna.uk9
            @Override // java.lang.Runnable
            public final void run() {
                com.vk.media.ok.b bVar = mk9Var.B;
                if (bVar != null) {
                    float f3 = bVar.v;
                    float f4 = f2;
                    if (f3 == f4) {
                        return;
                    }
                    bVar.v = f4;
                    bVar.G.setDuetSpeed(1.0f / f4, true);
                    bVar.x = false;
                }
            }
        });
        mo9.b bVar = this.s;
        bVar.j = f2;
        com.vk.media.recorder.f fVar = bVar.a;
        if (fVar != null) {
            fVar.v(f2);
        }
    }

    public void setDuetsTouchListener(b.C1263b c1263b) {
        this.J = c1263b;
    }

    public void setExternalTouchListener(View.OnTouchListener onTouchListener) {
        this.G = onTouchListener;
    }

    public void setFeatureCallback(@Nullable d dVar) {
        this.Q = dVar;
    }

    @Override // xsna.kk9
    public void setFlashMode(int i) {
        super.setFlashMode(i);
        c cVar = this.P;
        if (cVar != null) {
            cVar.d(i == 2);
        }
    }

    public void setFrameDetector(@Nullable xk9.b bVar) {
        RenderBase.d dVar = ((mo9) getCameraPreview()).g.l;
        if (dVar != null) {
            dVar.j = bVar;
        }
    }

    public void setMLDetectorEnabled(boolean z) {
        if (getCameraPreview() != null) {
            getCameraPreview().getClass();
        }
    }

    public void setOnCameraResultListener(io9.c cVar) {
        this.T = cVar;
    }

    public void setOnDoubleClickListener(View.OnClickListener onClickListener) {
        this.H = onClickListener;
    }

    public void setPreferredVideoRecordQuality(@Nullable MediaUtils.g gVar) {
        getCameraPreview().a(gVar);
    }

    public void setPreviewCallback(rl9.c cVar) {
        oo9 cameraPreview = getCameraPreview();
        if (cameraPreview instanceof mo9) {
            ((mo9) cameraPreview).g.g0.a.j = cVar;
        }
    }

    public void setTrySingleTapCallback(q96.c cVar) {
        this.I = cVar;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        new Exception();
        this.b.post(this.d0);
    }

    public void setZoomLevel(float f2) {
        an9 state;
        bm9 presenter = ((CameraUIView) this.R.c).getPresenter();
        if ((presenter == null || (state = presenter.getState()) == null) ? true : state.P) {
            setCameraZoomLevel(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, f2)));
        }
    }

    @Override // xsna.kk9
    public final void t() {
        Sensor sensor;
        super.t();
        hvr hvrVar = this.M;
        if (hvrVar != null) {
            i0q0.d(750L, hvrVar);
            if (hvrVar.h.m() && (sensor = hvrVar.c) != null) {
                hvrVar.b.registerListener(hvrVar, sensor, 2);
            }
        }
        c cVar = this.P;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // xsna.kk9
    public final void v(boolean z, boolean z2) {
        super.v(z, z2);
        if (!z) {
            setZoomLevel(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        hvr hvrVar = this.M;
        if (hvrVar != null) {
            i0q0.g(hvrVar);
            Sensor sensor = hvrVar.c;
            if (sensor != null) {
                hvrVar.b.unregisterListener(hvrVar, sensor);
            }
        }
        c cVar = this.P;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // xsna.kk9
    public final void w(boolean z, boolean z2) {
        super.w(z, z2);
        this.K.disable();
    }

    @Override // xsna.kk9
    public final int y() {
        int y = super.y();
        dwr dwrVar = this.S;
        if (dwrVar != null) {
            dwrVar.h = y + 90;
            dwrVar.e();
        }
        return y;
    }

    /* compiled from: Camera1View.java */
    public class e implements View.OnTouchListener, ScaleGestureDetector.OnScaleGestureListener {
        public final fot b;
        public final ScaleGestureDetector c;
        public final zmg0 d = new zmg0(new a());

        /* compiled from: Camera1View.java */
        public class a extends zmg0.a {
            public a() {
            }

            @Override // xsna.zmg0.b
            public final void a(float f, float f2, float f3) {
                b.C1263b c1263b = zd9.this.J;
                if (c1263b != null) {
                    com.vk.media.ok.b bVar = com.vk.media.ok.b.this;
                    EffectHolder effectHolder = bVar.I;
                    EffectHolder effectHolder2 = bVar.H;
                    effectHolder.onRotation(f);
                    if (effectHolder2.getEffectRegistry().inputDuetsTouchEventsRequired(effectHolder2.getEffectRegistry().getEffectHandle(effectHolder2.getCurrentEffectName()))) {
                        effectHolder2.onRotation(f);
                    }
                }
            }
        }

        /* compiled from: Camera1View.java */
        public class b extends GestureDetector.SimpleOnGestureListener {
            public b() {
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                e eVar = e.this;
                zd9 zd9Var = zd9.this;
                View.OnClickListener onClickListener = zd9Var.H;
                if (onClickListener != null) {
                    onClickListener.onClick(zd9Var);
                }
                return zd9.this.H != null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
            
                if (r6 == false) goto L34;
             */
            /* JADX WARN: Removed duplicated region for block: B:70:0x013f  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x01ba  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x01d1  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x01ac  */
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                bm9 presenter;
                int i;
                int i2;
                int i3;
                Point point;
                zd9 zd9Var;
                jhu0 jhu0Var;
                int i4;
                int i5;
                an9 state;
                Mask selectedMask;
                cme0 cme0Var;
                zd9 zd9Var2 = zd9.this;
                q96.c cVar = zd9Var2.I;
                if (cVar != null) {
                    CameraUIView cameraUIView = (CameraUIView) ((lh3) cVar).c;
                    MasksWrap masksWrap = cameraUIView.b0;
                    boolean z = (masksWrap != null ? masksWrap.getSelectedMask() : null) != null;
                    bm9 presenter2 = cameraUIView.getPresenter();
                    if (presenter2 != null) {
                        if (presenter2.getState().r) {
                            presenter2.A();
                            z = true;
                        } else {
                            MasksWrap masksWrap2 = cameraUIView.b0;
                            if (masksWrap2 != null) {
                                boolean i6 = presenter2.c4().i();
                                boolean z2 = presenter2.getState().v;
                                xg10 xg10Var = masksWrap2.R;
                                if (!z2 && i6 && masksWrap2.T && xg10Var.getItemCount() > 0) {
                                    int itemCount = (masksWrap2.S + 1) % xg10Var.getItemCount();
                                    masksWrap2.S = itemCount;
                                    masksWrap2.Q.c(0, ((bi10.b) xg10Var.c.c(itemCount)).a);
                                }
                            }
                        }
                    }
                    QrScannerUi qrScannerUi = cameraUIView.Q0;
                    if (qrScannerUi != null && (cme0Var = qrScannerUi.f) != null) {
                        cme0Var.f = true;
                    }
                }
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (zd9Var2.S != null) {
                    CameraUIView cameraUIView2 = zd9Var2.V.a;
                    MasksWrap masksWrap3 = cameraUIView2.b0;
                    if ((masksWrap3 != null && (selectedMask = masksWrap3.getSelectedMask()) != null && selectedMask.s) || ((presenter = cameraUIView2.getPresenter()) != null && (state = presenter.getState()) != null && state.M)) {
                        return true;
                    }
                    dwr dwrVar = zd9Var2.S;
                    dwr.a aVar = dwrVar.m;
                    zd9 zd9Var3 = dwrVar.n;
                    if (dwrVar.d != null && dwrVar.o != null && (i = dwrVar.a) != 2) {
                        if (dwrVar.i != null && (i == 1 || i == 3 || i == 4)) {
                            dwrVar.b();
                        }
                        int i7 = dwrVar.e;
                        int i8 = (int) (i7 * 0.05f);
                        int i9 = dwrVar.f;
                        int i10 = (int) (i9 * 0.05f);
                        Matrix matrix = zd9Var3.L;
                        sj9 e = ij9.a.e();
                        if (zd9Var3.S != null && e != null) {
                            tj9 tj9Var = (tj9) e;
                            if (tj9Var.i() != null) {
                                float width = tj9Var.i().getWidth();
                                i3 = 1;
                                float height = tj9Var.i().getHeight();
                                matrix.reset();
                                i2 = 0;
                                matrix.setScale(width / zd9Var3.getWidth(), height / zd9Var3.getHeight());
                                float[] fArr = {x, y};
                                matrix.mapPoints(fArr);
                                point = new Point((int) fArr[0], (int) fArr[1]);
                                if (point == null) {
                                    if (dwrVar.b) {
                                        zd9Var = zd9Var3;
                                        i4 = i8;
                                        i5 = i10;
                                        int i11 = point.x;
                                        int i12 = point.y;
                                        if (dwrVar.i == null) {
                                            ArrayList arrayList = new ArrayList();
                                            dwrVar.i = arrayList;
                                            arrayList.add(new sj9.a(new Rect()));
                                        }
                                        dwrVar.a(i4, i5, 1.0f, i11, i12, i7, i9, ((sj9.a) dwrVar.i.get(i2)).a);
                                    } else {
                                        zd9Var = zd9Var3;
                                        i4 = i8;
                                        i5 = i10;
                                    }
                                    if (dwrVar.c) {
                                        int i13 = point.x;
                                        int i14 = point.y;
                                        if (dwrVar.j == null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            dwrVar.j = arrayList2;
                                            arrayList2.add(new sj9.a(new Rect()));
                                        }
                                        dwrVar.a(i4, i5, 1.5f, i13, i14, i7, i9, ((sj9.a) dwrVar.j.get(0)).a);
                                    }
                                } else {
                                    zd9Var = zd9Var3;
                                }
                                zd9 zd9Var4 = dwrVar.o;
                                zd9Var4.g = x;
                                zd9Var4.h = y;
                                zd9Var.J();
                                if (dwrVar.b) {
                                    dwrVar.f();
                                    aVar.removeMessages(0);
                                    aVar.sendEmptyMessageDelayed(0, 3000L);
                                } else {
                                    if (zd9Var.o && (jhu0Var = zd9Var.m) != null) {
                                        jhu0Var.i(zd9Var);
                                    }
                                    dwrVar.a = i3;
                                    dwrVar.f();
                                    aVar.removeMessages(0);
                                }
                            }
                        }
                        i2 = 0;
                        i3 = 1;
                        point = null;
                        if (point == null) {
                        }
                        zd9 zd9Var42 = dwrVar.o;
                        zd9Var42.g = x;
                        zd9Var42.h = y;
                        zd9Var.J();
                        if (dwrVar.b) {
                        }
                    }
                    c cVar2 = zd9Var2.P;
                    if (cVar2 == null) {
                        return true;
                    }
                    cVar2.c();
                    return true;
                }
                return true;
            }
        }

        public e(Context context) {
            this.b = new fot(context, new b(), null);
            this.c = new ScaleGestureDetector(context, this);
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            zd9 zd9Var = zd9.this;
            b.C1263b c1263b = zd9Var.J;
            if (c1263b == null) {
                zd9Var.setZoomLevel((scaleGestureDetector.getScaleFactor() - 1.0f) + zd9Var.getZoomLevel());
                return true;
            }
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            com.vk.media.ok.b bVar = com.vk.media.ok.b.this;
            EffectHolder effectHolder = bVar.I;
            EffectHolder effectHolder2 = bVar.H;
            effectHolder.onPinch(scaleFactor);
            if (!effectHolder2.getEffectRegistry().inputDuetsTouchEventsRequired(effectHolder2.getEffectRegistry().getEffectHandle(effectHolder2.getCurrentEffectName()))) {
                return true;
            }
            effectHolder2.onPinch(scaleFactor);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            float x;
            float y;
            int i;
            float f;
            float f2;
            int i2;
            this.b.a(motionEvent);
            this.c.onTouchEvent(motionEvent);
            this.d.a(motionEvent);
            zd9 zd9Var = zd9.this;
            View.OnTouchListener onTouchListener = zd9Var.G;
            if (onTouchListener != null) {
                onTouchListener.onTouch(view, motionEvent);
            }
            b.C1263b c1263b = zd9Var.J;
            if (c1263b != null) {
                com.vk.media.ok.b bVar = com.vk.media.ok.b.this;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    c1263b.a = motionEvent.getPointerId(motionEvent.getActionIndex());
                    x = motionEvent.getX();
                    y = motionEvent.getY();
                    i = 0;
                } else if (actionMasked != 1) {
                    i = 2;
                    if (actionMasked != 2) {
                        i = 3;
                        if (actionMasked == 3) {
                            x = motionEvent.getX();
                            y = motionEvent.getY();
                            c1263b.a = -1;
                        }
                        f2 = 0.0f;
                        f = 0.0f;
                        i2 = -1;
                        if (i2 != -1) {
                            EffectHolder effectHolder = bVar.I;
                            EffectHolder effectHolder2 = bVar.H;
                            effectHolder.onTouch(MotionEvent.obtain(0L, 0L, i2, f2, f, 0));
                            if (effectHolder2.getEffectRegistry().inputDuetsTouchEventsRequired(effectHolder2.getEffectRegistry().getEffectHandle(effectHolder2.getCurrentEffectName()))) {
                                effectHolder2.onTouch(MotionEvent.obtain(0L, 0L, i2, f2, f, 0));
                            }
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(c1263b.a);
                        if (findPointerIndex >= 0 && findPointerIndex < motionEvent.getPointerCount()) {
                            x = motionEvent.getX(findPointerIndex);
                            y = motionEvent.getY(findPointerIndex);
                        }
                        f2 = 0.0f;
                        f = 0.0f;
                        i2 = -1;
                        if (i2 != -1) {
                        }
                    }
                } else {
                    float x2 = motionEvent.getX();
                    y = motionEvent.getY();
                    c1263b.a = -1;
                    i2 = 1;
                    f2 = x2;
                    f = y;
                    if (i2 != -1) {
                    }
                }
                f2 = x;
                i2 = i;
                f = y;
                if (i2 != -1) {
                }
            }
            if (motionEvent.getAction() == 0 && zd9Var.getCameraView() != null) {
                oo9 cameraView = zd9Var.getCameraView();
                int x3 = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                mo9 mo9Var = (mo9) cameraView;
                MediaUtils.d dVar = mo9Var.h;
                int i3 = dVar.b;
                int i4 = dVar.a;
                if (i3 * i4 != 0 && x3 <= i4 && y2 <= i3) {
                    mo9Var.g.getClass();
                }
            }
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public void setOnPhotoCaptureStartedListener(io9.b bVar) {
    }
}
