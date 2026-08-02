package xsna;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
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
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: GLTextureView.java */
/* loaded from: classes4.dex */
public class m2t extends TextureView implements TextureView.SurfaceTextureListener {
    public static final j l = new j();
    public final WeakReference<m2t> b;

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
            if (m2t.this.j == 2) {
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
    }

    /* compiled from: GLTextureView.java */
    public static class d implements g {
    }

    /* compiled from: GLTextureView.java */
    public interface e {
    }

    /* compiled from: GLTextureView.java */
    public interface f {
    }

    /* compiled from: GLTextureView.java */
    public interface g {
    }

    /* compiled from: GLTextureView.java */
    public static class h {
        public WeakReference<m2t> a;
        public EGL10 b;
        public EGLDisplay c;
        public EGLSurface d;
        public EGLConfig e;
        public EGLContext f;

        public static String d(String str) {
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
            m2t m2tVar = this.a.get();
            EGLSurface eGLSurface = null;
            if (m2tVar != null) {
                g gVar = m2tVar.h;
                EGL10 egl10 = this.b;
                EGLDisplay eGLDisplay = this.c;
                EGLConfig eGLConfig = this.e;
                SurfaceTexture surfaceTexture = m2tVar.getSurfaceTexture();
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
            d("eglMakeCurrent");
            return false;
        }

        public final void b() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.b.eglMakeCurrent(this.c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            m2t m2tVar = this.a.get();
            if (m2tVar != null) {
                g gVar = m2tVar.h;
                EGL10 egl10 = this.b;
                EGLDisplay eGLDisplay = this.c;
                EGLSurface eGLSurface3 = this.d;
                ((d) gVar).getClass();
                egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
            }
            this.d = null;
        }

        public final void c() {
            if (this.f != null) {
                m2t m2tVar = this.a.get();
                if (m2tVar != null) {
                    f fVar = m2tVar.g;
                    EGL10 egl10 = this.b;
                    EGLDisplay eGLDisplay = this.c;
                    EGLContext eGLContext = this.f;
                    ((c) fVar).getClass();
                    if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                        Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
                        egl10.eglGetError();
                        throw new RuntimeException("eglDestroyContex".concat(" failed"));
                    }
                }
                this.f = null;
            }
            EGLDisplay eGLDisplay2 = this.c;
            if (eGLDisplay2 != null) {
                this.b.eglTerminate(eGLDisplay2);
                this.c = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r17v0 */
        /* JADX WARN: Type inference failed for: r17v1 */
        /* JADX WARN: Type inference failed for: r17v2 */
        /* JADX WARN: Type inference failed for: r17v3 */
        /* JADX WARN: Type inference failed for: r17v4 */
        /* JADX WARN: Type inference failed for: r18v0 */
        /* JADX WARN: Type inference failed for: r18v1 */
        /* JADX WARN: Type inference failed for: r18v2 */
        /* JADX WARN: Type inference failed for: r18v3 */
        /* JADX WARN: Type inference failed for: r18v4 */
        public final void e() {
            char c;
            ?? r17;
            ?? r18;
            EGLConfig eGLConfig;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.c = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            char c2 = 2;
            if (!this.b.eglInitialize(eglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            m2t m2tVar = this.a.get();
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (m2tVar == null) {
                this.e = null;
                this.f = null;
            } else {
                e eVar = m2tVar.f;
                EGL10 egl102 = this.b;
                EGLDisplay eGLDisplay = this.c;
                a aVar = (a) eVar;
                boolean z = true;
                int[] iArr = new int[1];
                if (!egl102.eglChooseConfig(eGLDisplay, aVar.a, null, 0, iArr)) {
                    throw new IllegalArgumentException("eglChooseConfig failed");
                }
                boolean z2 = false;
                int i = iArr[0];
                if (i <= 0) {
                    throw new IllegalArgumentException("No configs match configSpec");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                if (!egl102.eglChooseConfig(eGLDisplay, aVar.a, eGLConfigArr, i, iArr)) {
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                b bVar = (b) aVar;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        c = c2;
                        r17 = z;
                        r18 = z2;
                        eGLConfig = null;
                        break;
                    }
                    eGLConfig = eGLConfigArr[i2];
                    int a = bVar.a(egl102, eGLDisplay, eGLConfig, 12325);
                    int a2 = bVar.a(egl102, eGLDisplay, eGLConfig, 12326);
                    c = c2;
                    if (a >= bVar.h && a2 >= 0) {
                        int a3 = bVar.a(egl102, eGLDisplay, eGLConfig, 12324);
                        int a4 = bVar.a(egl102, eGLDisplay, eGLConfig, 12323);
                        int a5 = bVar.a(egl102, eGLDisplay, eGLConfig, 12322);
                        r17 = z;
                        int a6 = bVar.a(egl102, eGLDisplay, eGLConfig, 12321);
                        r18 = z2;
                        if (a3 == bVar.d && a4 == bVar.e && a5 == bVar.f && a6 == bVar.g) {
                            break;
                        }
                    } else {
                        r17 = z;
                        r18 = z2;
                    }
                    i2++;
                    c2 = c;
                    z = r17;
                    z2 = r18;
                }
                if (eGLConfig == null) {
                    throw new IllegalArgumentException("No config chosen");
                }
                this.e = eGLConfig;
                f fVar = m2tVar.g;
                EGL10 egl103 = this.b;
                EGLDisplay eGLDisplay2 = this.c;
                c cVar = (c) fVar;
                int[] iArr2 = new int[3];
                cVar.getClass();
                iArr2[r18] = 12440;
                int i3 = m2t.this.j;
                iArr2[r17] = i3;
                iArr2[c] = 12344;
                if (i3 == 0) {
                    iArr2 = null;
                }
                this.f = egl103.eglCreateContext(eGLDisplay2, eGLConfig, eGLContext, iArr2);
            }
            EGLContext eGLContext2 = this.f;
            if (eGLContext2 != null && eGLContext2 != eGLContext) {
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
        public boolean k;
        public boolean l;
        public boolean q;
        public h t;
        public final WeakReference<m2t> u;
        public final ArrayList<Runnable> r = new ArrayList<>();
        public boolean s = true;
        public int m = 0;
        public int n = 0;
        public boolean p = true;
        public int o = 1;

        public i(WeakReference<m2t> weakReference) {
            this.u = weakReference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:126:0x0258  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x025e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:173:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:214:0x026d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x015e A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v42 */
        /* JADX WARN: Type inference failed for: r0v43, types: [java.io.Writer] */
        /* JADX WARN: Type inference failed for: r0v80 */
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
            boolean z3;
            boolean z4;
            WeakReference<m2t> weakReference = this.u;
            h hVar = new h();
            hVar.a = weakReference;
            this.t = hVar;
            this.i = false;
            this.j = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            int i = 0;
            int i2 = 0;
            boolean z12 = false;
            GL10 gl10 = null;
            Runnable runnable2 = null;
            while (true) {
                try {
                    synchronized (m2t.l) {
                        while (!this.b) {
                            if (this.r.isEmpty()) {
                                boolean z13 = this.e;
                                boolean z14 = this.d;
                                if (z13 != z14) {
                                    this.e = z14;
                                    m2t.l.notifyAll();
                                } else {
                                    z14 = false;
                                }
                                if (this.l) {
                                    g();
                                    f();
                                    this.l = false;
                                    z7 = true;
                                }
                                if (z5) {
                                    g();
                                    f();
                                    z5 = false;
                                }
                                if (z14 && this.j) {
                                    g();
                                }
                                if (z14 && this.i) {
                                    m2t m2tVar = this.u.get();
                                    if (!(m2tVar == null ? false : m2tVar.k) || m2t.l.b()) {
                                        f();
                                    }
                                }
                                if (z14 && m2t.l.c()) {
                                    this.t.c();
                                }
                                if (!this.f && !this.h) {
                                    if (this.j) {
                                        g();
                                    }
                                    this.h = true;
                                    this.g = false;
                                    m2t.l.notifyAll();
                                }
                                if (this.f && this.h) {
                                    this.h = false;
                                    m2t.l.notifyAll();
                                }
                                if (z6) {
                                    this.q = true;
                                    m2t.l.notifyAll();
                                    z6 = false;
                                    z12 = false;
                                }
                                if (c()) {
                                    if (this.i) {
                                        z = z5;
                                    } else {
                                        if (z7) {
                                            z = z5;
                                            runnable = null;
                                            z7 = false;
                                        } else {
                                            j jVar = m2t.l;
                                            i iVar = jVar.e;
                                            if (iVar == this || iVar == null) {
                                                z = z5;
                                                jVar.e = this;
                                                jVar.notifyAll();
                                            } else {
                                                z = z5;
                                                if (!jVar.a) {
                                                    jVar.c = true;
                                                    jVar.a = true;
                                                }
                                                if (!jVar.c) {
                                                    if (iVar != null) {
                                                        iVar.l = true;
                                                        jVar.notifyAll();
                                                    }
                                                    z4 = false;
                                                    if (z4) {
                                                        try {
                                                            this.t.e();
                                                            this.i = true;
                                                            jVar.notifyAll();
                                                            runnable = null;
                                                            z8 = true;
                                                        } catch (RuntimeException e) {
                                                            j jVar2 = m2t.l;
                                                            if (jVar2.e == this) {
                                                                jVar2.e = null;
                                                            }
                                                            jVar2.notifyAll();
                                                            throw e;
                                                        }
                                                    }
                                                }
                                            }
                                            z4 = true;
                                            if (z4) {
                                            }
                                        }
                                        if (this.i && !this.j) {
                                            this.j = true;
                                            z9 = true;
                                            z10 = true;
                                            z11 = true;
                                        }
                                        if (!this.j) {
                                            if (this.s) {
                                                i = this.m;
                                                i2 = this.n;
                                                z2 = false;
                                                this.s = false;
                                                z9 = true;
                                                z11 = true;
                                                z12 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            this.p = z2;
                                            m2t.l.notifyAll();
                                        }
                                    }
                                    runnable = null;
                                    if (this.i) {
                                        this.j = true;
                                        z9 = true;
                                        z10 = true;
                                        z11 = true;
                                    }
                                    if (!this.j) {
                                    }
                                } else {
                                    z = z5;
                                }
                                m2t.l.wait();
                                z5 = z;
                            } else {
                                runnable2 = this.r.remove(0);
                                z = z5;
                                z2 = false;
                                runnable = null;
                            }
                        }
                        synchronized (m2t.l) {
                            this.u.get();
                            g();
                            f();
                        }
                        return;
                    }
                } catch (Throwable th) {
                    synchronized (m2t.l) {
                    }
                }
                if (runnable2 != null) {
                    runnable2.run();
                    runnable2 = runnable;
                } else {
                    if (z9) {
                        if (this.t.a()) {
                            j jVar3 = m2t.l;
                            synchronized (jVar3) {
                                this.k = true;
                                jVar3.notifyAll();
                            }
                            z9 = z2;
                        } else {
                            j jVar4 = m2t.l;
                            synchronized (jVar4) {
                                this.k = true;
                                this.g = true;
                                jVar4.notifyAll();
                            }
                        }
                        synchronized (m2t.l) {
                            this.u.get();
                            g();
                            f();
                            throw th;
                        }
                    }
                    if (z10) {
                        h hVar2 = this.t;
                        GL gl = hVar2.f.getGL();
                        m2t m2tVar2 = hVar2.a.get();
                        if (m2tVar2 != null) {
                            j jVar5 = m2t.l;
                            int i3 = m2tVar2.i;
                            if ((i3 & 3) != 0) {
                                gl = GLDebugHelper.wrap(gl, (int) ((i3 & 1) != 0 ? 1 : z2), (Writer) ((i3 & 2) != 0 ? new l() : runnable));
                            }
                        }
                        gl10 = (GL10) gl;
                        m2t.l.a(gl10);
                        z10 = z2;
                    }
                    if (z8) {
                        m2t m2tVar3 = this.u.get();
                        if (m2tVar3 != null) {
                            m2tVar3.d.onSurfaceCreated(gl10, this.t.e);
                        }
                        z8 = z2;
                    }
                    if (z11) {
                        m2t m2tVar4 = this.u.get();
                        if (m2tVar4 != null) {
                            m2tVar4.d.onSurfaceChanged(gl10, i, i2);
                        }
                        z11 = z2;
                    }
                    m2t m2tVar5 = this.u.get();
                    if (m2tVar5 != null) {
                        m2tVar5.d.onDrawFrame(gl10);
                    }
                    h hVar3 = this.t;
                    int eglGetError = !hVar3.b.eglSwapBuffers(hVar3.c, hVar3.d) ? hVar3.b.eglGetError() : 12288;
                    if (eglGetError == 12288) {
                        z3 = true;
                    } else if (eglGetError != 12302) {
                        h.d("eglSwapBuffers");
                        j jVar6 = m2t.l;
                        synchronized (jVar6) {
                            z3 = true;
                            this.g = true;
                            jVar6.notifyAll();
                        }
                    } else {
                        z3 = true;
                        z5 = true;
                        if (z12) {
                            z6 = z3;
                        }
                    }
                    z5 = z;
                    if (z12) {
                    }
                }
                z5 = z;
            }
        }

        public final void b(int i, int i2) {
            j jVar = m2t.l;
            synchronized (jVar) {
                this.m = i;
                this.n = i2;
                this.s = true;
                this.p = true;
                this.q = false;
                jVar.notifyAll();
                while (!this.c && !this.e && !this.q && this.i && this.j && c()) {
                    try {
                        m2t.l.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final boolean c() {
            if (this.e || !this.f || this.g || this.m <= 0 || this.n <= 0) {
                return false;
            }
            return this.p || this.o == 1;
        }

        public final void d() {
            j jVar = m2t.l;
            synchronized (jVar) {
                this.b = true;
                jVar.notifyAll();
                while (!this.c) {
                    try {
                        m2t.l.wait();
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
            j jVar = m2t.l;
            synchronized (jVar) {
                this.o = i;
                jVar.notifyAll();
            }
        }

        public final void f() {
            if (this.i) {
                this.t.c();
                this.i = false;
                j jVar = m2t.l;
                if (jVar.e == this) {
                    jVar.e = null;
                }
                jVar.notifyAll();
            }
        }

        public final void g() {
            if (this.j) {
                this.j = false;
                this.t.b();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            setName("GLThread " + getId());
            try {
                a();
            } catch (InterruptedException unused) {
                j jVar = m2t.l;
            } catch (Throwable th) {
                j jVar2 = m2t.l;
                m2t.l.d(this);
                throw th;
            }
            m2t.l.d(this);
        }
    }

    /* compiled from: GLTextureView.java */
    public static class j {
        public boolean a;
        public boolean b;
        public boolean c;
        public boolean d;
        public i e;

        public final synchronized void a(GL10 gl10) {
            if (!this.b) {
                if (!this.a) {
                    this.c = true;
                    this.a = true;
                }
                this.c = !gl10.glGetString(7937).startsWith("Q3Dimension MSM7500 ");
                notifyAll();
                this.d = !this.c;
                this.b = true;
            }
        }

        public final synchronized boolean b() {
            return this.d;
        }

        public final synchronized boolean c() {
            if (!this.a) {
                this.c = true;
                this.a = true;
            }
            return !this.c;
        }

        public final synchronized void d(i iVar) {
            try {
                iVar.c = true;
                if (this.e == iVar) {
                    this.e = null;
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

    public m2t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new WeakReference<>(this);
        setSurfaceTextureListener(this);
    }

    public final void a() {
        if (this.c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public final void b() {
        i iVar = this.c;
        if (iVar != null) {
            iVar.getClass();
            j jVar = l;
            synchronized (jVar) {
                iVar.p = true;
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
            i2 = iVar.o;
        }
        return i2;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        int i2;
        super.onAttachedToWindow();
        if (this.e && this.d != null) {
            i iVar = this.c;
            if (iVar != null) {
                synchronized (l) {
                    i2 = iVar.o;
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
    public final void onDetachedFromWindow() {
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
                iVar.f = true;
                iVar.k = false;
                jVar.notifyAll();
                while (iVar.h && !iVar.k && !iVar.c) {
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
            iVar.f = false;
            jVar.notifyAll();
            while (!iVar.h && !iVar.c) {
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
        b();
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

    public void setGLWrapper(k kVar) {
    }
}
