package xsna;

import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.SurfaceView;
import com.vk.clips.design.view.recording.StopwatchView;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.camera.CameraObject$CameraMode;
import com.vk.media.recorder.RecorderBase;
import com.vk.media.render.RenderBase;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.text.Regex;
import ru.ok.gl.util.ThreadHelper;
import xsna.jhu0;
import xsna.mo9;
import xsna.sk9;

/* compiled from: CameraPreviewBase.kt */
/* loaded from: classes13.dex */
public abstract class kk9 extends q96 {
    public static final b F = new b();
    public boolean A;
    public final e B;
    public int C;
    public float D;
    public final f E;
    public final a k;
    public Runnable l;
    public jhu0 m;
    public Integer n;
    public boolean o;
    public boolean p;
    public int q;
    public rit0 r;
    public mo9.b s;
    public oo9 t;
    public int u;
    public boolean v;
    public d w;
    public long x;
    public float y;
    public float z;

    /* compiled from: CameraPreviewBase.kt */
    public interface a {
        boolean a();
    }

    /* compiled from: CameraPreviewBase.kt */
    public static final class b {
    }

    /* compiled from: CameraPreviewBase.kt */
    public static final class c {
        public static void a(jhu0 jhu0Var) {
            try {
                aj9 aj9Var = ij9.a;
                sj9 e = aj9Var.e();
                if (e != null) {
                    jhu0Var.e(e);
                    return;
                }
                StringBuilder sb = new StringBuilder("getParameters returned null, cameraId=");
                jhu0 jhu0Var2 = ((fj9) aj9Var.a.getValue()).a;
                sb.append(jhu0Var2 != null ? jhu0Var2.a() : -1);
                sb.append(", isCamera2=");
                sb.append(aj9Var.g());
                throw new IllegalStateException(sb.toString());
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.a(th);
            }
        }
    }

    /* compiled from: CameraPreviewBase.kt */
    public final class d implements jhu0.d {
        public boolean a;

        public d() {
        }

        @Override // xsna.jhu0.d
        public final void a() {
            kk9 kk9Var = kk9.this;
            if (kk9Var.m != null) {
                kk9Var.m = null;
                kk9Var.v(false, false);
            }
        }

        @Override // xsna.jhu0.d
        public final void b(jhu0 jhu0Var) {
            Handler handler = kk9.this.b;
            if (handler.getLooper().isCurrentThread()) {
                c(jhu0Var);
            } else {
                handler.postDelayed(new ne9(1, this, jhu0Var), 0L);
            }
        }

        public final void c(jhu0 jhu0Var) {
            if (this.a) {
                return;
            }
            StringBuilder sb = new StringBuilder("start preview, cam exists: ");
            int i = 1;
            sb.append(jhu0Var != null);
            sb.append(", surf exists: ");
            kk9 kk9Var = kk9.this;
            sb.append(kk9Var.p);
            L.e("CameraPreviewBase", sb.toString());
            if (!kk9Var.p) {
                if (jhu0Var != null) {
                    jhu0Var.release(true);
                    return;
                }
                return;
            }
            if (jhu0Var == null) {
                StringBuilder sb2 = new StringBuilder("Can't open camera ");
                sb2.append(kk9Var.n);
                sb2.append(", camera type used: ");
                sb2.append(ij9.a.g() ? "2" : "1");
                L.l(sb2.toString());
                kk9Var.m = jhu0Var;
                return;
            }
            kk9Var.m = jhu0Var;
            b bVar = kk9.F;
            jhu0Var.l();
            kk9Var.q();
            kk9Var.t();
            mo9.b bVar2 = kk9Var.s;
            if (bVar2 != null) {
                jhu0 jhu0Var2 = kk9Var.m;
                if (epx.f(bVar2.b, jhu0Var2)) {
                    Objects.toString(jhu0Var2);
                } else {
                    Objects.toString(jhu0Var2);
                    bVar2.b = jhu0Var2;
                    if (bVar2.a == null || jhu0Var2 == null) {
                        Log.e("CameraRecorder", "error: can't setup on empty camera, recorder!");
                    }
                }
                com.vk.media.recorder.f fVar = bVar2.a;
                if (fVar != null) {
                    fVar.h(jhu0Var2);
                }
            }
            kk9Var.post(new n44(kk9Var, i));
        }
    }

    /* compiled from: CameraPreviewBase.kt */
    public static final class e implements soo0 {
        public e() {
        }

        @Override // xsna.soo0
        public final void a() {
            L.A("CameraPreviewBase", "surfaceCreated");
            kk9 kk9Var = kk9.this;
            kk9Var.p = true;
            if (kk9Var.k.a()) {
                kk9Var.s();
            }
        }

        @Override // xsna.soo0
        public final void b() {
            L.A("CameraPreviewBase", "surfaceDestroyed");
            kk9 kk9Var = kk9.this;
            kk9Var.p = false;
            kk9Var.o(false, true);
        }
    }

    /* compiled from: CameraPreviewBase.kt */
    public static final class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            mo9.b bVar = kk9.this.s;
            if (bVar == null || !bVar.a()) {
                kk9 kk9Var = kk9.this;
                kk9Var.b.removeCallbacks(kk9Var.E);
                return;
            }
            com.vk.media.recorder.f fVar = kk9.this.s.a;
            if (fVar == null || fVar.z < 0) {
                qj9 qj9Var = kk9.this.s.d;
                if (qj9Var != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    kk9 kk9Var2 = kk9.this;
                    qj9Var.a(currentTimeMillis - kk9Var2.x, kk9Var2.s.a != null ? r3.s : 0);
                }
                kk9.this.b.postDelayed(this, 16L);
            }
        }
    }

    public kk9(Context context, a aVar, boolean z) {
        super(context);
        this.k = aVar;
        this.q = 30;
        this.y = 1.0f;
        this.z = 1.0f;
        this.A = true;
        this.B = new e();
        aj9 aj9Var = ij9.a;
        this.n = aj9Var.a() ? aj9Var.d() : aj9Var.b();
        this.f = z;
        this.E = new f();
    }

    private final Size getPreviewSize() {
        sj9 e2;
        if (this.m == null || (e2 = ij9.a.e()) == null) {
            return null;
        }
        return ((tj9) e2).i();
    }

    @Override // xsna.q96
    public final boolean e() {
        return getPreviewSize() != null;
    }

    @Override // xsna.q96
    public final void f(int i, int i2) {
        mk9 mk9Var = ((mo9) getCameraPreview()).g;
        mk9Var.getClass();
        mk9Var.d(new cyf0(i, i2, 0, mk9Var));
    }

    public final Activity getActivity() {
        Context context = getContext();
        bpn0 bpn0Var = enj.a;
        return e3m.h(context);
    }

    public final oo9 getCameraPreview() {
        oo9 oo9Var = this.t;
        if (oo9Var != null) {
            return oo9Var;
        }
        return null;
    }

    @Override // xsna.q96
    public int getCameraPreviewHeight() {
        Size previewSize = getPreviewSize();
        if (previewSize != null) {
            return previewSize.getHeight();
        }
        return 0;
    }

    @Override // xsna.q96
    public int getCameraPreviewWidth() {
        Size previewSize = getPreviewSize();
        if (previewSize != null) {
            return previewSize.getWidth();
        }
        return 0;
    }

    @Override // xsna.q96
    public oo9 getCameraView() {
        return getCameraPreview();
    }

    public float getCameraZoomLevel() {
        return this.D;
    }

    public CameraObject$CameraMode getCurrentMode() {
        return this.i;
    }

    public float getDesiredCameraFps() {
        return 30.0f;
    }

    @Override // xsna.q96
    public int getDisplayOrientation() {
        return this.u;
    }

    public int getFlashMode() {
        return this.C;
    }

    public long getMaxRecordingLengthMs() {
        mo9.b bVar = this.s;
        if (bVar == null) {
            return 0L;
        }
        return bVar.a != null ? r0.s : 0;
    }

    public final oom0 getRecorderAnalytics() {
        com.vk.media.recorder.f fVar;
        mo9.b bVar = this.s;
        if (bVar == null || (fVar = bVar.a) == null) {
            return null;
        }
        return fVar.d();
    }

    public final RecorderBase.State getRecorderState() {
        com.vk.media.recorder.f fVar;
        mo9.b bVar = this.s;
        if (bVar == null || (fVar = bVar.a) == null) {
            return null;
        }
        return fVar.r;
    }

    public final RecorderBase.RecordingType getRecordingType() {
        mo9.b bVar = this.s;
        if (bVar != null) {
            return bVar.c;
        }
        return null;
    }

    public final void h() {
        if (ij9.a.f()) {
            CameraObject$CameraMode currentMode = getCurrentMode();
            CameraObject$CameraMode cameraObject$CameraMode = CameraObject$CameraMode.BACK;
            boolean z = currentMode == cameraObject$CameraMode;
            Preference.I("camera_prefs", "use_front_camera", z);
            if (z) {
                cameraObject$CameraMode = CameraObject$CameraMode.FRONT;
            }
            r(cameraObject$CameraMode);
        }
    }

    public final void i(boolean z) {
        com.vk.media.recorder.f fVar;
        com.vk.media.recorder.f fVar2;
        this.b.removeCallbacks(this.E);
        if (z) {
            mo9.b bVar = this.s;
            if (bVar != null && (fVar2 = bVar.a) != null) {
                fVar2.B();
            }
        } else {
            mo9.b bVar2 = this.s;
            if (bVar2 != null && (fVar = bVar2.a) != null) {
                fVar.A();
            }
        }
        ho9.e(getActivity(), false);
        this.x = 0L;
    }

    public final void j() {
        aj9 aj9Var = ij9.a;
        aj9 aj9Var2 = ij9.a;
        if (aj9Var2.f()) {
            this.i = CameraObject$CameraMode.BACK;
            this.n = aj9Var2.b();
        }
    }

    public final void k() {
        aj9 aj9Var = ij9.a;
        aj9 aj9Var2 = ij9.a;
        if (aj9Var2.f()) {
            this.i = CameraObject$CameraMode.FRONT;
            this.n = aj9Var2.d();
        }
    }

    public MediaUtils.d l(boolean z) {
        CamcorderProfile camcorderProfile;
        oo9 cameraPreview = getCameraPreview();
        int intValue = this.n.intValue();
        mk9 mk9Var = ((mo9) cameraPreview).g;
        mk9Var.o(intValue);
        MediaUtils.e eVar = null;
        if (z) {
            sk9.a aVar = mk9Var.l0;
            if (aVar != null) {
                eVar = aVar.a.f();
            }
        } else {
            sk9.a aVar2 = mk9Var.l0;
            if (aVar2 != null) {
                eVar = aVar2.b.f();
            }
        }
        if (eVar != null) {
            return eVar;
        }
        if (z) {
            bpn0 bpn0Var = t5m.a;
            if (!"Meizu".equalsIgnoreCase(Build.MANUFACTURER) && CamcorderProfile.hasProfile(this.n.intValue(), 6)) {
                camcorderProfile = CamcorderProfile.get(this.n.intValue(), 6);
                return new MediaUtils.d(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            }
        }
        bpn0 bpn0Var2 = t5m.a;
        camcorderProfile = ("Meizu".equalsIgnoreCase(Build.MANUFACTURER) || !CamcorderProfile.hasProfile(this.n.intValue(), 5)) ? CamcorderProfile.hasProfile(this.n.intValue(), 4) ? CamcorderProfile.get(this.n.intValue(), 4) : CamcorderProfile.get(this.n.intValue(), 0) : CamcorderProfile.get(this.n.intValue(), 5);
        return new MediaUtils.d(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
    }

    public final boolean m() {
        Integer num = this.n;
        aj9 aj9Var = ij9.a;
        return num == ij9.a.b();
    }

    public final boolean n() {
        return this.v;
    }

    public final void o(boolean z, boolean z2) {
        jhu0 jhu0Var;
        if (this.m != null) {
            L.e(zhy0.a(" keepRecording=", z));
            v(z, z2);
            bpn0 bpn0Var = ij9.a.a;
            if (bpn0Var.isInitialized() && (jhu0Var = ((fj9) bpn0Var.getValue()).a) != null) {
                jhu0Var.release(z2);
            }
            this.m = null;
        }
        d dVar = this.w;
        if (dVar != null) {
            dVar.a = true;
        }
        this.w = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RenderBase.d dVar;
        syf0 syf0Var;
        mk9 mk9Var = ((mo9) getCameraPreview()).g;
        if (mk9Var != null && (dVar = mk9Var.l) != null && (syf0Var = (syf0) dVar.b) != null) {
            syf0Var.sendMessage(syf0Var.obtainMessage(-2));
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        sj9 e2;
        boolean z;
        com.vk.media.ok.b bVar;
        Size i;
        Size a2;
        Size a3;
        int[] iArr;
        int i2;
        jhu0 jhu0Var = this.m;
        if (jhu0Var == null || (e2 = ij9.a.e()) == null) {
            return;
        }
        tj9 tj9Var = (tj9) e2;
        int i3 = tj9Var.c;
        ol9 ol9Var = tj9Var.b;
        Camera.Parameters parameters = tj9Var.a;
        List<String> supportedSceneModes = parameters != null ? parameters.getSupportedSceneModes() : null;
        if (supportedSceneModes != null && supportedSceneModes.contains("auto") && parameters != null) {
            parameters.setSceneMode("auto");
        }
        if (parameters != null) {
            parameters.setPictureFormat(256);
        }
        if (parameters != null) {
            parameters.setPreviewFormat(17);
        }
        List<String> supportedAntibanding = parameters != null ? parameters.getSupportedAntibanding() : null;
        if (supportedAntibanding != null && supportedAntibanding.contains("auto") && parameters != null) {
            parameters.setAntibanding("auto");
        }
        List<String> supportedWhiteBalance = parameters != null ? parameters.getSupportedWhiteBalance() : null;
        if (supportedWhiteBalance != null && supportedWhiteBalance.contains("auto") && parameters != null) {
            parameters.setWhiteBalance("auto");
        }
        try {
            Camera.Parameters parameters2 = ((tj9) e2).a;
            if (parameters2 != null) {
                parameters2.set("rear-lens-distortion-correction", "off");
            }
        } catch (Throwable unused) {
        }
        if (tj9Var.l()) {
            bpn0 bpn0Var = t5m.a;
            "volantis".equalsIgnoreCase(Build.PRODUCT);
            tj9Var.q(true);
        }
        boolean booleanValue = ((Boolean) ni9.a.getValue()).booleanValue();
        bpn0 bpn0Var2 = t5m.a;
        if (!"Meizu".equalsIgnoreCase(Build.MANUFACTURER) && CamcorderProfile.hasProfile(jhu0Var.a(), 6)) {
            for (Size size : tj9Var.k()) {
                if ((size.getWidth() == 1080 && size.getHeight() == 1920) || (size.getHeight() == 1080 && size.getWidth() == 1920)) {
                    if (booleanValue) {
                        L.p("Camera fullhd preview enabled");
                        z = true;
                        this.v = z;
                        oo9 cameraPreview = getCameraPreview();
                        boolean z2 = this.v;
                        mk9 mk9Var = ((mo9) cameraPreview).g;
                        mk9Var.w = z2;
                        bVar = mk9Var.B;
                        if (bVar != null) {
                            ThreadHelper.queueOnMain(new m9p(bVar, z2, 1));
                        }
                        i = tj9Var.i();
                        MediaUtils.d l = l(this.v);
                        if (i != null) {
                            float width = (i.getWidth() * 1.0f) / i.getHeight();
                            int i4 = l.a;
                            int i5 = l.b;
                            float f2 = (i4 * 1.0f) / i5;
                            if ((width <= 1.0f || f2 <= 1.0f) && (width >= 1.0f || f2 >= 1.0f)) {
                                l.a = i5;
                                l.b = i4;
                            }
                        }
                        int i6 = l.a;
                        int i7 = l.b;
                        a2 = ho9.a(tj9Var.k(), i6, i7, Math.min(i6, i7), true);
                        if (a2 != null) {
                            L.p("set camera preview size=" + a2.getWidth() + 'x' + a2.getHeight());
                            int width2 = a2.getWidth();
                            int height = a2.getHeight();
                            if (parameters != null) {
                                parameters.setPreviewSize(width2, height);
                            } else if (ol9Var != null) {
                                ol9Var.b = new Size(width2, height);
                            }
                        }
                        a3 = ho9.a(tj9Var.a(), l.a, l.b, -1, false);
                        if (a3 != null) {
                            int width3 = a3.getWidth();
                            int height2 = a3.getHeight();
                            if (parameters != null) {
                                parameters.setPictureSize(width3, height2);
                            }
                        }
                        float desiredCameraFps = getDesiredCameraFps();
                        int i8 = ((int) desiredCameraFps) * i3;
                        List<int[]> j = tj9Var.j();
                        int i9 = Integer.MAX_VALUE;
                        iArr = null;
                        for (int[] iArr2 : j) {
                            int abs = Math.abs(i8 - iArr2[1]) + Math.abs(i8 - iArr2[0]);
                            if (abs < i9) {
                                iArr = iArr2;
                                i9 = abs;
                            }
                        }
                        if (iArr != null) {
                            char c2 = 0;
                            char c3 = 1;
                            int[] iArr3 = {iArr[0], iArr[1]};
                            for (int[] iArr4 : j) {
                                int i10 = iArr4[c2];
                                int i11 = iArr[c2];
                                if (i10 != i11 && iArr4[c3] == iArr[c3] && ((i2 = iArr3[c2]) == i11 || i2 < i10)) {
                                    iArr3 = iArr4;
                                }
                                c2 = 0;
                                c3 = 1;
                            }
                            iArr = iArr3;
                        }
                        if (iArr == null) {
                            int i12 = iArr[1];
                            this.q = i12 / i3;
                            int i13 = iArr[0];
                            if (parameters != null) {
                                parameters.setPreviewFpsRange(i13, i12);
                            } else if (ol9Var != null) {
                                int[] iArr5 = ol9Var.d;
                                iArr5[0] = i13;
                                iArr5[1] = i12;
                            }
                            L.p("fps=" + desiredCameraFps + ", frameRate=" + this.q + " in " + Arrays.toString(iArr));
                        } else {
                            com.vk.metrics.eventtracking.b.a.a(new RuntimeException(n23.a(desiredCameraFps, "Failed to select preview fps range, fps=")));
                        }
                        if (this.n == ij9.a.d() || getFlashMode() == 0) {
                            tj9Var.n("off");
                        } else if (getFlashMode() != 1) {
                            tj9Var.n("auto");
                        } else if (getFlashMode() == 2) {
                            tj9Var.n("torch");
                        }
                        y();
                        if (tj9Var.m()) {
                            tj9Var.r((int) (getCameraZoomLevel() * tj9Var.g()));
                        }
                        c.a(jhu0Var);
                    }
                }
            }
        }
        z = false;
        this.v = z;
        oo9 cameraPreview2 = getCameraPreview();
        boolean z22 = this.v;
        mk9 mk9Var2 = ((mo9) cameraPreview2).g;
        mk9Var2.w = z22;
        bVar = mk9Var2.B;
        if (bVar != null) {
        }
        i = tj9Var.i();
        MediaUtils.d l2 = l(this.v);
        if (i != null) {
        }
        int i62 = l2.a;
        int i72 = l2.b;
        a2 = ho9.a(tj9Var.k(), i62, i72, Math.min(i62, i72), true);
        if (a2 != null) {
        }
        a3 = ho9.a(tj9Var.a(), l2.a, l2.b, -1, false);
        if (a3 != null) {
        }
        float desiredCameraFps2 = getDesiredCameraFps();
        int i82 = ((int) desiredCameraFps2) * i3;
        List<int[]> j2 = tj9Var.j();
        int i92 = Integer.MAX_VALUE;
        iArr = null;
        while (r11.hasNext()) {
        }
        if (iArr != null) {
        }
        if (iArr == null) {
        }
        if (this.n == ij9.a.d()) {
            if (getFlashMode() != 1) {
            }
            y();
            if (tj9Var.m()) {
            }
            c.a(jhu0Var);
        }
        tj9Var.n("off");
        y();
        if (tj9Var.m()) {
        }
        c.a(jhu0Var);
    }

    public void q() {
        p();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r0.a() == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(CameraObject$CameraMode cameraObject$CameraMode) {
        boolean z;
        d();
        if (this.m != null && cameraObject$CameraMode != getCurrentMode()) {
            mo9.b bVar = this.s;
            if (bVar != null) {
                z = true;
            }
            z = false;
            w(z, false);
        }
        this.n = cameraObject$CameraMode == CameraObject$CameraMode.BACK ? ij9.a.b() : ij9.a.d();
        this.i = cameraObject$CameraMode;
        s();
    }

    public final void s() {
        if (this.p && this.m == null) {
            d dVar = this.w;
            if (dVar != null) {
                dVar.a = true;
            }
            this.w = null;
            d dVar2 = new d();
            aj9 aj9Var = ij9.a;
            int intValue = this.n.intValue();
            jhu0 jhu0Var = ((fj9) aj9Var.a.getValue()).a;
            if (jhu0Var != null) {
                jhu0Var.k(intValue, dVar2);
            }
            this.w = dVar2;
        }
    }

    public final void setCameraPreviewSurfaceHolder(oo9 oo9Var) {
        this.t = oo9Var;
        SurfaceView surfaceView = oo9Var.d;
        if (surfaceView == null) {
            surfaceView = null;
        }
        c(surfaceView);
    }

    public void setCameraZoomLevel(float f2) {
        sj9 e2;
        if (this.D == f2) {
            return;
        }
        this.D = f2;
        jhu0 jhu0Var = this.m;
        if (jhu0Var == null || (e2 = ij9.a.e()) == null) {
            return;
        }
        tj9 tj9Var = (tj9) e2;
        if (tj9Var.m()) {
            tj9Var.r((int) (getCameraZoomLevel() * tj9Var.g()));
        }
        c.a(jhu0Var);
    }

    public void setEffectSilence(boolean z) {
        mo9.b bVar = this.s;
        if (bVar != null) {
            bVar.o = z;
            com.vk.media.recorder.f fVar = bVar.a;
            if (fVar != null) {
                fVar.u(bVar.p || z);
            }
        }
    }

    public void setFlashMode(int i) {
        if (this.C == i) {
            return;
        }
        this.C = i;
        p();
        jhu0 jhu0Var = this.m;
        if (jhu0Var != null) {
            c.a(jhu0Var);
        }
    }

    public final void setFullHd(boolean z) {
        this.v = z;
        mk9 mk9Var = ((mo9) getCameraPreview()).g;
        mk9Var.w = z;
        com.vk.media.ok.b bVar = mk9Var.B;
        if (bVar != null) {
            ThreadHelper.queueOnMain(new m9p(bVar, z, 1));
        }
    }

    public void setMaxRecordingLengthMs(int i) {
        mo9.b bVar = this.s;
        if (bVar != null) {
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            bVar.g = i;
            com.vk.media.recorder.f fVar = bVar.a;
            if (fVar != null) {
                fVar.p(i);
            }
        }
    }

    public void setMusicSelected(boolean z) {
        mo9.b bVar = this.s;
        if (bVar != null) {
            bVar.p = z;
            com.vk.media.recorder.f fVar = bVar.a;
            if (fVar != null) {
                fVar.u(z || bVar.o);
            }
        }
    }

    public void setPitch(float f2) {
        this.z = f2;
    }

    public void setRecordingCallback(qj9 qj9Var) {
        mo9.b bVar = this.s;
        if (bVar != null) {
            bVar.d = qj9Var;
        }
    }

    public final void setRecordingType(RecorderBase.RecordingType recordingType) {
        mo9.b bVar;
        if (recordingType == null || (bVar = this.s) == null || bVar.c == recordingType) {
            return;
        }
        bVar.c = recordingType;
        com.vk.media.recorder.f fVar = bVar.a;
        if (fVar == null || !fVar.a(recordingType)) {
            bVar.f();
        }
    }

    public void setSpeed(float f2) {
        this.y = f2;
    }

    public void setVideoFirstKeyframesIntervalMs(long j) {
        mo9.b bVar = this.s;
        if (bVar != null) {
            bVar.m = j;
            com.vk.media.recorder.f fVar = bVar.a;
            if (fVar != null) {
                fVar.y(j);
            }
        }
    }

    public void t() {
        SurfaceView surfaceView = getCameraPreview().d;
        if (surfaceView == null) {
            surfaceView = null;
        }
        if (surfaceView != null) {
            surfaceView.requestLayout();
        }
        oo9 cameraPreview = getCameraPreview();
        jhu0 jhu0Var = this.m;
        this.n.intValue();
        mo9 mo9Var = (mo9) cameraPreview;
        mo9Var.n = jhu0Var;
        mo9Var.d();
        this.o = true;
    }

    public final void u(File file) {
        mo9.b bVar = this.s;
        if (bVar != null) {
            jhu0 jhu0Var = this.m;
            bVar.b = jhu0Var;
            com.vk.media.recorder.f fVar = bVar.a;
            if (fVar == null || jhu0Var == null) {
                Log.e("CameraRecorder", "error: can't setup on empty camera, recorder!");
                return;
            }
            if (bVar != null) {
                float f2 = this.y;
                bVar.j = f2;
                if (fVar != null) {
                    fVar.v(f2);
                }
            }
            mo9.b bVar2 = this.s;
            if (bVar2 != null) {
                float f3 = this.z;
                bVar2.k = f3;
                com.vk.media.recorder.f fVar2 = bVar2.a;
                if (fVar2 != null) {
                    fVar2.q(f3);
                }
            }
            mo9.b bVar3 = this.s;
            if (bVar3 != null) {
                float f4 = this.q;
                bVar3.l = f4;
                com.vk.media.recorder.f fVar3 = bVar3.a;
                if (fVar3 != null) {
                    fVar3.o(f4);
                }
            }
            mo9.b bVar4 = this.s;
            com.vk.media.recorder.f fVar4 = bVar4 != null ? bVar4.a : null;
            if (fVar4 != null) {
                fVar4.i = null;
            }
            if (bVar4 != null) {
                Float valueOf = Float.valueOf(1.0f);
                com.vk.media.recorder.f fVar5 = bVar4.a;
                if (fVar5 == null) {
                    return;
                }
                if (TextUtils.isEmpty(fVar5.n)) {
                    com.vk.media.recorder.f fVar6 = bVar4.a;
                    if (fVar6 != null) {
                        fVar6.m = file;
                    }
                    com.vk.media.recorder.f fVar7 = bVar4.a;
                    if (fVar7 != null) {
                        fVar7.w(Float.valueOf(file != null ? bVar4.j : 1.0f), Float.valueOf(file != null ? bVar4.k : 1.0f));
                    }
                    com.vk.media.recorder.f fVar8 = bVar4.a;
                    if (fVar8 != null) {
                        fVar8.o(bVar4.l);
                    }
                    com.vk.media.recorder.f fVar9 = bVar4.a;
                    if (fVar9 != null) {
                        fVar9.y(file != null ? bVar4.m : -1L);
                    }
                } else {
                    com.vk.media.recorder.f fVar10 = bVar4.a;
                    if (fVar10 != null) {
                        fVar10.w(valueOf, valueOf);
                    }
                    com.vk.media.recorder.f fVar11 = bVar4.a;
                    if (fVar11 != null) {
                        fVar11.o(30.0f);
                    }
                    com.vk.media.recorder.f fVar12 = bVar4.a;
                    if (fVar12 != null) {
                        fVar12.y(-1L);
                    }
                }
                com.vk.media.recorder.f fVar13 = bVar4.a;
                if (fVar13 != null) {
                    fVar13.l();
                }
                bVar4.a.z();
            }
        }
    }

    public void v(boolean z, boolean z2) {
        if (this.o) {
            try {
                getCameraPreview().b(z);
                this.o = false;
                jhu0 jhu0Var = this.m;
                if (jhu0Var != null) {
                    if (z2) {
                        jhu0Var.q();
                    } else {
                        jhu0Var.u();
                    }
                }
            } catch (Exception e2) {
                e2.toString();
            }
        }
    }

    public void w(boolean z, boolean z2) {
        i0q0.h(null);
        if (!z) {
            i(false);
        }
        o(z, z2);
    }

    public final void x(final boolean z) {
        L.e("stop recording: force=" + z + " recordStart=" + this.x);
        this.r = null;
        StopwatchView stopwatchView = ((mo9) getCameraPreview()).g.D;
        if (stopwatchView != null) {
            stopwatchView.c();
            s3q0 s3q0Var = s3q0.a;
        }
        RecorderBase.RecordingType recordingType = RecorderBase.RecordingType.LIVE;
        mo9.b bVar = this.s;
        if ((bVar != null ? bVar.c : null) == recordingType) {
            i(false);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.x != 0 || bVar.a()) {
            RecorderBase.RecordingType recordingType2 = RecorderBase.RecordingType.LOOP;
            mo9.b bVar2 = this.s;
            if ((bVar2 != null ? bVar2.c : null) == recordingType2) {
                i(z);
                return;
            }
            final com.vk.media.recorder.f fVar = bVar.a;
            final qj9 qj9Var = bVar.d;
            if (fVar != null && fVar.i == null) {
                fVar.i = new RecorderBase.d() { // from class: xsna.ik9
                    @Override // com.vk.media.recorder.RecorderBase.d
                    public final void a(File file, boolean z2) {
                        RecorderBase recorderBase = fVar;
                        kk9 kk9Var = this;
                        boolean z3 = z;
                        qj9 qj9Var2 = qj9Var;
                        long j = recorderBase.z;
                        if (j < 0) {
                            j = System.currentTimeMillis() - kk9Var.x;
                        }
                        if (z2 || z3 || j < recorderBase.e()) {
                            if (qj9Var2 != null) {
                                qj9Var2.f(file, z3 && !z2);
                            } else {
                                Regex regex = com.vk.core.files.a.a;
                                vhk0.b(file);
                            }
                        } else if (qj9Var2 != null) {
                            qj9Var2.onStop();
                            qj9Var2.onFinish(file);
                        }
                        recorderBase.i = null;
                    }
                };
            }
            i(z);
        }
    }

    public int y() {
        Integer num = this.n;
        if (num == null) {
            return 0;
        }
        int intValue = num.intValue();
        int d2 = ho9.d(getActivity());
        khu0 c2 = ij9.a.c(intValue);
        int orientation = c2 != null ? c2.a() == 1 ? (360 - ((c2.getOrientation() + d2) % 360)) % 360 : ((c2.getOrientation() - d2) + 360) % 360 : 0;
        this.u = orientation;
        jhu0 jhu0Var = this.m;
        if (jhu0Var != null) {
            jhu0Var.o(orientation);
        }
        return d2;
    }
}
