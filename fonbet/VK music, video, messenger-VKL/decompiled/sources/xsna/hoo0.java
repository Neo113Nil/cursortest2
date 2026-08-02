package xsna;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.android.grafika.EncoderConfig;
import java.io.IOException;
import javax.microedition.khronos.opengles.GL10;
import ru.ok.gpu.SharedEglContext;
import ru.ok.media.logging.LoggerInterface;
import ru.ok.media.utils.TimeSampler;
import ru.ok.media.utils.TimedEvent;

/* compiled from: TextureMovieEncoder.java */
/* loaded from: classes12.dex */
public final class hoo0 {
    public final String a;
    public yis0 b;
    public com.android.grafika.a c;
    public EncoderConfig d;
    public EncoderConfig e;
    public final cyo0 f;
    public volatile boolean h;
    public final LoggerInterface j;
    public volatile boolean k;
    public zds0 m;
    public long g = -1;
    public final TimedEvent i = new TimedEvent();
    public volatile boolean l = true;
    public final ias n = new ias();

    public hoo0(cyo0 cyo0Var, String str, LoggerInterface loggerInterface) {
        this.f = cyo0Var;
        this.a = str;
        this.j = loggerInterface;
    }

    public final boolean a(Context context, GL10 gl10) {
        long a;
        yis0 yis0Var;
        int i;
        int i2;
        if (this.l && !this.h) {
            b();
            return false;
        }
        EncoderConfig encoderConfig = this.d;
        EncoderConfig encoderConfig2 = this.e;
        if (encoderConfig != encoderConfig2) {
            if (encoderConfig == null || !encoderConfig.equals(encoderConfig2)) {
                try {
                    if (encoderConfig == null) {
                        com.android.grafika.a aVar = this.c;
                        if (aVar != null) {
                            aVar.c();
                            this.c = null;
                        }
                    } else {
                        if (this.c == null) {
                            this.c = l370.u(context, this.a, this.j);
                        }
                        if (!this.l) {
                            this.c.c = this.m;
                        }
                        this.c.f(encoderConfig);
                        this.k = false;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            this.e = encoderConfig;
        }
        if (this.e != null) {
            zds0 zds0Var = this.m;
            if (this.h || zds0Var != null) {
                com.android.grafika.a aVar2 = this.c;
                if (aVar2 == null) {
                    ne7.m("xsna.hoo0", "frameAvailable() - exit (encoder == null)");
                    return false;
                }
                if ((zds0Var != null && zds0Var.isKeyFrameRequested()) || this.k) {
                    this.k = false;
                    ne7.m("com.android.grafika.a", "requestKeyFrame()");
                    aVar2.f(aVar2.p);
                }
                aVar2.c = zds0Var;
                if (this.h) {
                    this.i.signalOnce();
                    a = this.i.elapsed() + 1;
                } else {
                    a = this.f.a();
                }
                long j = this.g;
                if (a < j) {
                    StringBuilder b = fp.b(a, "Non-monotonous timestamp, will backtrack lastTimestampMS (", " < ");
                    b.append(this.g);
                    b.append("), benchMode=");
                    b.append(this.h);
                    ne7.J("xsna.hoo0", b.toString());
                } else if (a == j) {
                    StringBuilder b2 = fp.b(a, "Non-monotonous timestamp, dropping frame (", " == ");
                    b2.append(this.g);
                    b2.append("), benchMode=");
                    b2.append(this.h);
                    ne7.J("xsna.hoo0", b2.toString());
                    return false;
                }
                this.g = a;
                ias iasVar = this.n;
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (iasVar) {
                    if (iasVar.a > 0) {
                        if (iasVar.b.isEmpty() || iasVar.b.getLast().longValue() <= currentTimeMillis) {
                            iasVar.b.addLast(Long.valueOf(currentTimeMillis));
                            long j2 = iasVar.a;
                            if (currentTimeMillis > j2) {
                                long j3 = currentTimeMillis - j2;
                                while (iasVar.b.getFirst().longValue() < j3) {
                                    iasVar.b.pop();
                                }
                            }
                            iasVar.c.set(Double.valueOf((iasVar.b.size() * 1000.0d) / iasVar.a));
                        }
                    }
                }
                if (this.c != null) {
                    EncoderConfig encoderConfig3 = this.e;
                    gl10.glViewport(0, 0, encoderConfig3.a, encoderConfig3.b);
                }
                long j4 = a * 1000000;
                if (this.c != null && (yis0Var = this.b) != null && yis0Var.a()) {
                    com.android.grafika.a aVar3 = this.c;
                    yis0 yis0Var2 = this.b;
                    aVar3.b(false);
                    EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                    EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                    EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(SharedEglContext.EGL_DRAW);
                    if (eglGetCurrentContext.equals(aVar3.n) && yis0Var2.d == aVar3.l) {
                        i2 = 0;
                        i = 12344;
                    } else {
                        ne7.m("com.android.grafika.a", "pushFrame() - re-init GL");
                        aVar3.l = yis0Var2.d;
                        aVar3.g();
                        Context context2 = aVar3.h;
                        aVar3.n = eglGetCurrentContext;
                        hap hapVar = new hap();
                        i = 12344;
                        hapVar.b = EGL14.EGL_NO_DISPLAY;
                        hapVar.c = EGL14.EGL_NO_CONTEXT;
                        hapVar.d = null;
                        hap.a("before eglCreateContext");
                        if (((EGLDisplay) hapVar.b) != EGL14.EGL_NO_DISPLAY) {
                            throw new RuntimeException("EGL already set up");
                        }
                        EGLDisplay eglGetDisplay2 = EGL14.eglGetDisplay(0);
                        hapVar.b = eglGetDisplay2;
                        if (eglGetDisplay2 == EGL14.EGL_NO_DISPLAY) {
                            throw new RuntimeException("unable to get EGL14 display");
                        }
                        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12344, 0, 12344};
                        iArr[14] = 12610;
                        iArr[15] = 1;
                        i2 = 0;
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        EGLConfig eGLConfig = !EGL14.eglChooseConfig(eglGetDisplay2, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0) ? null : eGLConfigArr[0];
                        if (eGLConfig == null) {
                            throw new RuntimeException("Unable to find a suitable EGLConfig");
                        }
                        hapVar.d = eGLConfig;
                        hapVar.c = eglGetCurrentContext;
                        aVar3.j = hapVar;
                        aVar3.m = aVar3.l ? new vl9(context2) : new ul9(context2);
                    }
                    if (aVar3.k == null) {
                        ne7.m("com.android.grafika.a", "pushFrame() - creating inputWindowSurface");
                        hap hapVar2 = aVar3.j;
                        Surface surface = aVar3.i;
                        zrx0 zrx0Var = new zrx0();
                        zrx0Var.b = EGL14.EGL_NO_SURFACE;
                        zrx0Var.a = hapVar2;
                        hapVar2.getClass();
                        if (surface == null) {
                            throw new RuntimeException("invalid surface: " + surface);
                        }
                        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface((EGLDisplay) hapVar2.b, (EGLConfig) hapVar2.d, surface, new int[]{i}, i2);
                        hap.a("eglCreateWindowSurface");
                        if (eglCreateWindowSurface == null) {
                            throw new RuntimeException("surface was null");
                        }
                        zrx0Var.b = eglCreateWindowSurface;
                        zrx0Var.c = surface;
                        aVar3.k = zrx0Var;
                    }
                    TimeSampler timeSampler = aVar3.o;
                    timeSampler.start();
                    zrx0 zrx0Var2 = aVar3.k;
                    hap hapVar3 = (hap) zrx0Var2.a;
                    EGLSurface eGLSurface = (EGLSurface) zrx0Var2.b;
                    EGLDisplay eGLDisplay = (EGLDisplay) hapVar3.b;
                    EGLDisplay eGLDisplay2 = EGL14.EGL_NO_DISPLAY;
                    if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, (EGLContext) hapVar3.c)) {
                        throw new RuntimeException("eglMakeCurrent failed");
                    }
                    ul9 ul9Var = aVar3.m;
                    ul9Var.k = yis0Var2.f;
                    ul9Var.j = yis0Var2.e;
                    EncoderConfig encoderConfig4 = aVar3.p;
                    gl10.glViewport(0, 0, encoderConfig4.a, encoderConfig4.b);
                    ul9 ul9Var2 = aVar3.m;
                    int i3 = yis0Var2.b;
                    int i4 = yis0Var2.c;
                    ul9Var2.n = i3;
                    ul9Var2.o = i4;
                    int i5 = yis0Var2.a;
                    EncoderConfig encoderConfig5 = aVar3.p;
                    ul9Var2.s(i5, encoderConfig5.a, encoderConfig5.b);
                    zrx0 zrx0Var3 = aVar3.k;
                    EGLExt.eglPresentationTimeANDROID((EGLDisplay) ((hap) zrx0Var3.a).b, (EGLSurface) zrx0Var3.b, j4);
                    zrx0 zrx0Var4 = aVar3.k;
                    if (!EGL14.eglSwapBuffers((EGLDisplay) ((hap) zrx0Var4.a).b, (EGLSurface) zrx0Var4.b)) {
                        hap.a("swapBuffers");
                    }
                    if (!EGL14.eglMakeCurrent(eglGetDisplay, eglGetCurrentSurface, eglGetCurrentSurface, eglGetCurrentContext)) {
                        throw new RuntimeException("eglMakeCurrent failed");
                    }
                    aVar3.b(false);
                    timeSampler.stop();
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ne7.m("xsna.hoo0", "handleStopRecording()");
        try {
            com.android.grafika.a aVar = this.c;
            if (aVar != null) {
                aVar.b(true);
            }
        } catch (Exception unused) {
        }
        com.android.grafika.a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.c();
            this.c = null;
        }
    }

    public final void c() {
        ne7.m("xsna.hoo0", "start() - stopped= " + this.l + " videoEncoder= " + this.c);
        if (this.l) {
            com.android.grafika.a aVar = this.c;
            if (aVar != null) {
                aVar.c();
                this.c = null;
            }
            this.e = null;
            this.l = false;
        }
    }

    public final void d() {
        ne7.m("xsna.hoo0", "stop() - stopped= " + this.l + " videoEncoder= " + this.c);
        this.l = true;
        this.d = null;
        this.e = null;
        com.android.grafika.a aVar = this.c;
        if (aVar != null) {
            aVar.c();
            this.c = null;
        }
    }

    public final void e() {
        if (!this.l || this.h) {
            return;
        }
        b();
    }
}
