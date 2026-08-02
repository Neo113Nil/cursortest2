package xsna;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import xsna.kk9;

/* compiled from: VkCamera.kt */
/* loaded from: classes16.dex */
public interface jhu0 {

    /* compiled from: VkCamera.kt */
    public interface a {
        void a(boolean z);
    }

    /* compiled from: VkCamera.kt */
    public interface b {
        void a(byte[] bArr);
    }

    /* compiled from: VkCamera.kt */
    public interface c {
        void f(byte[] bArr);
    }

    /* compiled from: VkCamera.kt */
    public interface d {
        void a();

        void b(jhu0 jhu0Var);
    }

    int a();

    khu0 b();

    boolean c();

    boolean d();

    void e(sj9 sj9Var);

    void f();

    void g();

    tj9 getParameters();

    void h(SurfaceTexture surfaceTexture);

    void i(a aVar);

    boolean j();

    void k(int i, kk9.d dVar);

    void l();

    boolean m();

    khu0 n(int i);

    void o(int i);

    boolean p();

    void q();

    Camera r();

    void release(boolean z);

    Integer s();

    Integer t();

    void u();

    void v(c cVar);

    void w(byte[] bArr);
}
