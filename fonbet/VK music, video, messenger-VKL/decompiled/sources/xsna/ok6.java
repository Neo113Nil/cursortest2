package xsna;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.ur6;

/* compiled from: BasePresenter.java */
@Deprecated
/* loaded from: classes2.dex */
public abstract class ok6<VC extends ur6> {
    public boolean a = false;
    public boolean b = false;
    public VC c = null;

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be called from a UI-thread");
        }
    }

    public final void b() {
        if (this.a) {
            throw new IllegalStateException("Presenter is destroyed");
        }
    }

    public final void c(@NonNull VC vc) {
        a();
        b();
        if (this.c != null) {
            throw new IllegalStateException("ViewController is already attached");
        }
        this.c = vc;
        l(vc);
        if (this.b) {
            VC vc2 = this.c;
            vc2.getClass();
            ur6.a();
            vc2.b();
            if (!vc2.a) {
                throw new IllegalStateException("ViewController is not initialized/created");
            }
            if (vc2.c) {
                return;
            }
            vc2.c = true;
            vc2.g();
        }
    }

    public final void d() {
        a();
        b();
        if (this.c != null) {
            throw new IllegalStateException("ViewController is already attached");
        }
        i();
        this.a = true;
    }

    public final VC e() {
        a();
        b();
        VC vc = this.c;
        if (vc == null) {
            throw new IllegalStateException("ViewController is not attached");
        }
        if (vc.c) {
            ur6.a();
            vc.b();
            if (!vc.a) {
                throw new IllegalStateException("ViewController is not initialized/created");
            }
            if (vc.c) {
                vc.c = false;
                vc.f();
            }
        }
        m(this.c);
        VC vc2 = this.c;
        this.c = null;
        return vc2;
    }

    @Nullable
    public final VC f() {
        a();
        b();
        return this.c;
    }

    public final void g() {
        a();
        b();
        if (this.b) {
            this.b = false;
            j();
            VC vc = this.c;
            if (vc != null) {
                ur6.a();
                vc.b();
                if (!vc.a) {
                    throw new IllegalStateException("ViewController is not initialized/created");
                }
                if (vc.c) {
                    vc.c = false;
                    vc.f();
                }
            }
        }
    }

    public final void h() {
        a();
        b();
        if (this.b) {
            return;
        }
        this.b = true;
        k();
        VC vc = this.c;
        if (vc != null) {
            ur6.a();
            vc.b();
            if (!vc.a) {
                throw new IllegalStateException("ViewController is not initialized/created");
            }
            if (vc.c) {
                return;
            }
            vc.c = true;
            vc.g();
        }
    }

    public abstract void i();

    public abstract void k();

    public abstract void l(@NonNull VC vc);

    public abstract void m(@NonNull VC vc);

    public void j() {
    }
}
