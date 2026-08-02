package xsna;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import ru.ok.gpu.SharedEglContext;

/* compiled from: GLTextureView.java */
/* loaded from: classes3.dex */
public class l2t extends TextureView implements TextureView.SurfaceTextureListener {
    public static final j l = new j();
    public final WeakReference<l2t> b;

    @Nullable
    public i c;

    @Nullable
    public GLSurfaceView.Renderer d;
    public boolean e;

    @Nullable
    public e f;

    @Nullable
    public f g;

    @Nullable
    public g h;
    public int i;
    public int j;
    public boolean k;

    /* compiled from: GLTextureView.java */
    public abstract class a implements e {
        public final int[] a;

        public a(int[] iArr) {
            if (l2t.this.j == 2) {
                int length = iArr.length;
                int[] iArr2 = new int[length + 2];
                int i = length - 1;
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr2[i] = 12352;
                iArr2[length] = 4;
                iArr2[length + 1] = 12344;
                iArr = iArr2;
            }
            this.a = iArr;
        }

        @Override // xsna.l2t.e
        public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            EGLConfig eGLConfig;
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.a, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i = 0;
            int i2 = iArr[0];
            if (i2 <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i2];
            if (!egl10.eglChooseConfig(eGLDisplay, this.a, eGLConfigArr, i2, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            b bVar = (b) this;
            while (true) {
                if (i >= i2) {
                    eGLConfig = null;
                    break;
                }
                eGLConfig = eGLConfigArr[i];
                int a = bVar.a(egl10, eGLDisplay, eGLConfig, 12325);
                int a2 = bVar.a(egl10, eGLDisplay, eGLConfig, 12326);
                if (a >= bVar.h && a2 >= 0) {
                    int a3 = bVar.a(egl10, eGLDisplay, eGLConfig, 12324);
                    int a4 = bVar.a(egl10, eGLDisplay, eGLConfig, 12323);
                    int a5 = bVar.a(egl10, eGLDisplay, eGLConfig, 12322);
                    int a6 = bVar.a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (a3 == bVar.d && a4 == bVar.e && a5 == bVar.f && a6 == bVar.g) {
                        break;
                    }
                }
                i++;
            }
            if (eGLConfig != null) {
                return eGLConfig;
            }
            throw new IllegalArgumentException("No config chosen");
        }
    }

    /* compiled from: GLTextureView.java */
    public class b extends a {
        public final int[] c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;

        public b(int i, int i2) {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, i, 12325, i2, 12326, 0, 12344});
            this.c = new int[1];
            this.d = 8;
            this.e = 8;
            this.f = 8;
            this.g = i;
            this.h = i2;
        }

        public final int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            int[] iArr = this.c;
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
                return iArr[0];
            }
            return 0;
        }
    }

    /* compiled from: GLTextureView.java */
    public class c implements f {
        public c() {
        }

        @Override // xsna.l2t.f
        public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int i = l2t.this.j;
            int[] iArr = {SharedEglContext.EGL_CONTEXT_CLIENT_VERSION, i, 12344};
            if (i == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr);
        }

        @Override // xsna.l2t.f
        public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            egl10.eglGetError();
            throw new RuntimeException("eglDestroyContex".concat(" failed"));
        }
    }

    /* compiled from: GLTextureView.java */
    public static class d implements g {
    }

    /* compiled from: GLTextureView.java */
    public interface e {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* compiled from: GLTextureView.java */
    public interface f {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* compiled from: GLTextureView.java */
    public interface g {
    }

    /* compiled from: GLTextureView.java */
    public static class h {
        public WeakReference<l2t> a;
        public EGL10 b;
        public EGLDisplay c;
        public EGLSurface d;
        public EGLConfig e;
        public EGLContext f;

        public static String c(String str) {
            return str.concat(" failed");
        }

        public final boolean a() {
            if (this.b == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.c == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.e == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            b();
            l2t l2tVar = this.a.get();
            EGLSurface eGLSurface = null;
            if (l2tVar != null) {
                g gVar = l2tVar.h;
                EGL10 egl10 = this.b;
                EGLDisplay eGLDisplay = this.c;
                EGLConfig eGLConfig = this.e;
                SurfaceTexture surfaceTexture = l2tVar.getSurfaceTexture();
                ((d) gVar).getClass();
                try {
                    eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, surfaceTexture, null);
                } catch (IllegalArgumentException e) {
                    Log.e("GLTextureView", "eglCreateWindowSurface", e);
                }
                this.d = eGLSurface;
            } else {
                this.d = null;
            }
            EGLSurface eGLSurface2 = this.d;
            if (eGLSurface2 == null || eGLSurface2 == EGL10.EGL_NO_SURFACE) {
                if (this.b.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.b.eglMakeCurrent(this.c, eGLSurface2, eGLSurface2, this.f)) {
                return true;
            }
            this.b.eglGetError();
            c("eglMakeCurrent");
            return false;
        }

        public final void b() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.b.eglMakeCurrent(this.c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            l2t l2tVar = this.a.get();
            if (l2tVar != null) {
                g gVar = l2tVar.h;
                EGL10 egl10 = this.b;
                EGLDisplay eGLDisplay = this.c;
                EGLSurface eGLSurface3 = this.d;
                ((d) gVar).getClass();
                egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
            }
            this.d = null;
        }

        public final void d() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.c = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.b.eglInitialize(eglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            l2t l2tVar = this.a.get();
            if (l2tVar == null) {
                this.e = null;
                this.f = null;
            } else {
                EGLConfig chooseConfig = l2tVar.f.chooseConfig(this.b, this.c);
                this.e = chooseConfig;
                this.f = l2tVar.g.createContext(this.b, this.c, chooseConfig);
            }
            EGLContext eGLContext = this.f;
            if (eGLContext != null && eGLContext != EGL10.EGL_NO_CONTEXT) {
                this.d = null;
            } else {
                this.f = null;
                this.b.eglGetError();
                throw new RuntimeException("createContext".concat(" failed"));
            }
        }
    }

    /* compiled from: GLTextureView.java */
    public static class i extends Thread {
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean o;
        public h r;
        public final WeakReference<l2t> s;
        public final ArrayList<Runnable> p = new ArrayList<>();
        public boolean q = true;
        public int k = 0;
        public int l = 0;
        public boolean n = true;
        public int m = 1;

        public i(WeakReference<l2t> weakReference) {
            this.s = weakReference;
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0201, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x020a, code lost:
        
            r3 = r16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x020c, code lost:
        
            if (r13 == false) goto L162;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x020e, code lost:
        
            r4 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0206, code lost:
        
            r0 = true;
            r3 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x0209, code lost:
        
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x01ec, code lost:
        
            r0 = 12288;
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x0153, code lost:
        
            r15 = xsna.l2t.l;
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x0155, code lost:
        
            monitor-enter(r15);
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x0157, code lost:
        
            r17.i = true;
            r17.e = true;
            r15.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x015e, code lost:
        
            monitor-exit(r15);
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x0133, code lost:
        
            r3 = r16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x012e, code lost:
        
            r14.run();
            r14 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x012c, code lost:
        
            if (r14 == null) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x013a, code lost:
        
            if (r8 == false) goto L193;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0142, code lost:
        
            if (r17.r.a() == false) goto L196;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
        
            r8 = xsna.l2t.l;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0146, code lost:
        
            monitor-enter(r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0148, code lost:
        
            r17.i = true;
            r8.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x014d, code lost:
        
            monitor-exit(r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x014e, code lost:
        
            r8 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0164, code lost:
        
            if (r9 == false) goto L128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0166, code lost:
        
            r0 = r17.r;
            r6 = r0.f.getGL();
            r0 = r0.a.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0176, code lost:
        
            if (r0 == null) goto L127;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0178, code lost:
        
            r9 = xsna.l2t.l;
            r0 = r0.i;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x017e, code lost:
        
            if ((r0 & 3) == 0) goto L127;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0182, code lost:
        
            if ((r0 & 1) == 0) goto L121;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0184, code lost:
        
            r9 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0189, code lost:
        
            if ((r0 & 2) == 0) goto L125;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x018b, code lost:
        
            r0 = new xsna.l2t.l();
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0192, code lost:
        
            r6 = android.opengl.GLDebugHelper.wrap(r6, (int) r9, (java.io.Writer) r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0191, code lost:
        
            r0 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0186, code lost:
        
            r9 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0196, code lost:
        
            r6 = (javax.microedition.khronos.opengles.GL10) r6;
            xsna.l2t.l.a(r6);
            r9 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x019e, code lost:
        
            if (r7 == false) goto L133;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x01a0, code lost:
        
            r0 = r17.s.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x01a8, code lost:
        
            if (r0 == null) goto L132;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x01aa, code lost:
        
            r0.d.onSurfaceCreated(r6, r17.r.e);
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x01b3, code lost:
        
            r7 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x01b4, code lost:
        
            if (r10 == false) goto L138;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x01b6, code lost:
        
            r0 = r17.s.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x01be, code lost:
        
            if (r0 == null) goto L137;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
        
            r0.d.onSurfaceChanged(r6, r11, r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x01c5, code lost:
        
            r10 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x01c6, code lost:
        
            r0 = r17.s.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x01ce, code lost:
        
            if (r0 == null) goto L141;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x01d0, code lost:
        
            r0.d.onDrawFrame(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x01d5, code lost:
        
            r0 = r17.r;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x01e3, code lost:
        
            if (r0.b.eglSwapBuffers(r0.c, r0.d) != false) goto L144;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x01e5, code lost:
        
            r0 = r0.b.eglGetError();
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x01ed, code lost:
        
            if (r0 == 12288) goto L158;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x01f1, code lost:
        
            if (r0 == 12302) goto L157;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x01f3, code lost:
        
            xsna.l2t.h.c("eglSwapBuffers");
            r2 = xsna.l2t.l;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x01fa, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x01fb, code lost:
        
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x01fc, code lost:
        
            r17.e = true;
            r2.notifyAll();
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:138:0x0214 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0114 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v43 */
        /* JADX WARN: Type inference failed for: r0v44, types: [java.io.Writer] */
        /* JADX WARN: Type inference failed for: r0v64 */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11, types: [int] */
        /* JADX WARN: Type inference failed for: r9v12 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a() throws InterruptedException {
            boolean z;
            boolean z2;
            Runnable runnable;
            WeakReference<l2t> weakReference = this.s;
            h hVar = new h();
            hVar.a = weakReference;
            this.r = hVar;
            this.g = false;
            this.h = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            int i = 0;
            int i2 = 0;
            boolean z10 = false;
            GL10 gl10 = null;
            Runnable runnable2 = null;
            loop0: while (true) {
                try {
                    synchronized (l2t.l) {
                        while (!this.b) {
                            if (this.p.isEmpty()) {
                                if (this.j) {
                                    g();
                                    f();
                                    this.j = false;
                                    z5 = true;
                                }
                                if (z3) {
                                    g();
                                    f();
                                    z3 = false;
                                }
                                if (!this.d && !this.f) {
                                    if (this.h) {
                                        g();
                                    }
                                    this.f = true;
                                    this.e = false;
                                    l2t.l.notifyAll();
                                }
                                if (this.d && this.f) {
                                    this.f = false;
                                    l2t.l.notifyAll();
                                }
                                if (z4) {
                                    this.o = true;
                                    l2t.l.notifyAll();
                                    z4 = false;
                                    z10 = false;
                                }
                                if (c()) {
                                    if (this.g) {
                                        z = z3;
                                    } else {
                                        if (z5) {
                                            z = z3;
                                            runnable = null;
                                            z5 = false;
                                        } else {
                                            j jVar = l2t.l;
                                            i iVar = jVar.d;
                                            if (iVar == this || iVar == null) {
                                                z = z3;
                                                jVar.d = this;
                                                jVar.notifyAll();
                                            } else {
                                                z = z3;
                                                if (!jVar.a) {
                                                    jVar.c = true;
                                                    jVar.a = true;
                                                }
                                                if (!jVar.c) {
                                                    if (iVar != null) {
                                                        iVar.j = true;
                                                        jVar.notifyAll();
                                                    }
                                                }
                                            }
                                            try {
                                                this.r.d();
                                                this.g = true;
                                                jVar.notifyAll();
                                                runnable = null;
                                                z6 = true;
                                            } catch (RuntimeException e) {
                                                j jVar2 = l2t.l;
                                                if (jVar2.d == this) {
                                                    jVar2.d = null;
                                                }
                                                jVar2.notifyAll();
                                                throw e;
                                            }
                                        }
                                        if (this.g && !this.h) {
                                            this.h = true;
                                            z7 = true;
                                            z8 = true;
                                            z9 = true;
                                        }
                                        if (!this.h) {
                                            if (this.q) {
                                                i = this.k;
                                                i2 = this.l;
                                                z2 = false;
                                                this.q = false;
                                                z7 = true;
                                                z9 = true;
                                                z10 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            this.n = z2;
                                            l2t.l.notifyAll();
                                        }
                                    }
                                    runnable = null;
                                    if (this.g) {
                                        this.h = true;
                                        z7 = true;
                                        z8 = true;
                                        z9 = true;
                                    }
                                    if (!this.h) {
                                    }
                                } else {
                                    z = z3;
                                }
                                l2t.l.wait();
                                z3 = z;
                            } else {
                                runnable2 = this.p.remove(0);
                                z = z3;
                                z2 = false;
                                runnable = null;
                            }
                        }
                        break loop0;
                    }
                } catch (Throwable th) {
                    synchronized (l2t.l) {
                        l2t l2tVar = this.s.get();
                        if (l2tVar != null) {
                            l2tVar.b();
                        }
                        g();
                        f();
                        throw th;
                    }
                }
            }
            synchronized (l2t.l) {
                l2t l2tVar2 = this.s.get();
                if (l2tVar2 != null) {
                    l2tVar2.b();
                }
                g();
                f();
            }
        }

        public final void b(int i, int i2) {
            j jVar = l2t.l;
            synchronized (jVar) {
                this.k = i;
                this.l = i2;
                this.q = true;
                this.n = true;
                this.o = false;
                jVar.notifyAll();
                while (!this.c && !this.o && this.g && this.h && c()) {
                    try {
                        l2t.l.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final boolean c() {
            if (!this.d || this.e || this.k <= 0 || this.l <= 0) {
                return false;
            }
            return this.n || this.m == 1;
        }

        public final void d() {
            j jVar = l2t.l;
            synchronized (jVar) {
                this.b = true;
                jVar.notifyAll();
                while (!this.c) {
                    try {
                        l2t.l.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void e(int i) {
            if (i < 0 || i > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            j jVar = l2t.l;
            synchronized (jVar) {
                this.m = i;
                jVar.notifyAll();
            }
        }

        public final void f() {
            if (this.g) {
                h hVar = this.r;
                if (hVar.f != null) {
                    l2t l2tVar = hVar.a.get();
                    if (l2tVar != null) {
                        l2tVar.g.destroyContext(hVar.b, hVar.c, hVar.f);
                    }
                    hVar.f = null;
                }
                EGLDisplay eGLDisplay = hVar.c;
                if (eGLDisplay != null) {
                    hVar.b.eglTerminate(eGLDisplay);
                    hVar.c = null;
                }
                this.g = false;
                j jVar = l2t.l;
                if (jVar.d == this) {
                    jVar.d = null;
                }
                jVar.notifyAll();
            }
        }

        public final void g() {
            if (this.h) {
                this.h = false;
                this.r.b();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            setName("GLThread " + getId());
            try {
                a();
            } catch (InterruptedException unused) {
                j jVar = l2t.l;
            } catch (Throwable th) {
                j jVar2 = l2t.l;
                l2t.l.b(this);
                throw th;
            }
            l2t.l.b(this);
        }
    }

    /* compiled from: GLTextureView.java */
    public static class j {
        public boolean a;
        public boolean b;
        public boolean c;
        public i d;

        public final synchronized void a(GL10 gl10) {
            if (!this.b) {
                if (!this.a) {
                    this.c = true;
                    this.a = true;
                }
                this.c = !gl10.glGetString(7937).startsWith("Q3Dimension MSM7500 ");
                notifyAll();
                this.b = true;
            }
        }

        public final synchronized void b(i iVar) {
            try {
                iVar.c = true;
                if (this.d == iVar) {
                    this.d = null;
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: GLTextureView.java */
    public interface k {
    }

    /* compiled from: GLTextureView.java */
    public static class l extends Writer {
        public final StringBuilder b = new StringBuilder();

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            m();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            m();
        }

        public final void m() {
            StringBuilder sb = this.b;
            if (sb.length() > 0) {
                sb.toString();
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer
        public final void write(@NonNull char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    m();
                } else {
                    this.b.append(c);
                }
            }
        }
    }

    /* compiled from: GLTextureView.java */
    public class m extends b {
        public m(boolean z) {
            super(0, z ? 16 : 0);
        }
    }

    public l2t(Context context) {
        super(context);
        this.b = new WeakReference<>(this);
        setSurfaceTextureListener(this);
    }

    public final void a() {
        if (this.c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public final void c() {
        i iVar = this.c;
        if (iVar != null) {
            iVar.getClass();
            j jVar = l;
            synchronized (jVar) {
                iVar.n = true;
                jVar.notifyAll();
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            i iVar = this.c;
            if (iVar != null) {
                iVar.d();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.i;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.k;
    }

    public int getRenderMode() {
        int i2;
        i iVar = this.c;
        if (iVar == null) {
            return 0;
        }
        synchronized (l) {
            i2 = iVar.m;
        }
        return i2;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        int i2;
        super.onAttachedToWindow();
        if (this.e && this.d != null) {
            i iVar = this.c;
            if (iVar != null) {
                synchronized (l) {
                    i2 = iVar.m;
                }
            } else {
                i2 = 1;
            }
            i iVar2 = new i(this.b);
            this.c = iVar2;
            if (i2 != 1) {
                iVar2.e(i2);
            }
            this.c.start();
        }
        this.e = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        i iVar = this.c;
        if (iVar != null) {
            iVar.d();
        }
        this.e = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        i iVar = this.c;
        if (iVar != null) {
            iVar.b(i2, i3);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        i iVar = this.c;
        if (iVar != null) {
            j jVar = l;
            synchronized (jVar) {
                iVar.d = true;
                iVar.i = false;
                jVar.notifyAll();
                while (iVar.f && !iVar.i && !iVar.c) {
                    try {
                        l.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i iVar = this.c;
        if (iVar == null) {
            return true;
        }
        j jVar = l;
        synchronized (jVar) {
            iVar.d = false;
            jVar.notifyAll();
            while (!iVar.f && !iVar.c) {
                try {
                    l.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        i iVar = this.c;
        if (iVar != null) {
            iVar.b(i2, i3);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        c();
    }

    public void setDebugFlags(int i2) {
        this.i = i2;
    }

    public void setEGLConfigChooser(e eVar) {
        a();
        this.f = eVar;
    }

    public void setEGLContextClientVersion(int i2) {
        a();
        this.j = i2;
    }

    public void setEGLContextFactory(f fVar) {
        a();
        this.g = fVar;
    }

    public void setEGLWindowSurfaceFactory(g gVar) {
        a();
        this.h = gVar;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.k = z;
    }

    public void setRenderMode(int i2) {
        i iVar = this.c;
        if (iVar != null) {
            iVar.e(i2);
        }
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        a();
        if (this.f == null) {
            this.f = new m(true);
        }
        if (this.g == null) {
            this.g = new c();
        }
        if (this.h == null) {
            this.h = new d();
        }
        this.d = renderer;
        i iVar = new i(this.b);
        this.c = iVar;
        iVar.start();
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new m(z));
    }

    public l2t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new WeakReference<>(this);
        setSurfaceTextureListener(this);
    }

    public void b() {
    }

    public void setGLWrapper(k kVar) {
    }
}
