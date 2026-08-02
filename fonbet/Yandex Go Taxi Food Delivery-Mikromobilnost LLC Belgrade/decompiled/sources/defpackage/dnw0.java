package defpackage;

import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class dnw0 extends DeferrableSurface {
    public final gl7 o;
    public final b p;
    public DeferrableSurface q;
    public snw0 r;

    public dnw0(int i, Size size) {
        super(i, size);
        b bVar = new b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            this.p = bVar;
            bVar.a = "SettableFuture hashCode: " + hashCode();
        } catch (Exception e) {
            gl7Var.a(e);
        }
        this.o = gl7Var;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public final void a() {
        super.a();
        tob1.g(new cnw0(this, 2));
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public final euy f() {
        return this.o;
    }

    public final boolean g(DeferrableSurface deferrableSurface, Runnable runnable) {
        boolean z;
        Size size = this.h;
        tob1.b();
        deferrableSurface.getClass();
        int i = deferrableSurface.i;
        Size size2 = deferrableSurface.h;
        DeferrableSurface deferrableSurface2 = this.q;
        if (deferrableSurface2 == deferrableSurface) {
            return false;
        }
        d6z.y("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", deferrableSurface2 == null);
        d6z.m("The provider's size(" + size + ") must match the parent(" + size2 + Extension.C_BRAKE, size.equals(size2));
        int i2 = this.i;
        d6z.m(b64.d(i2, i, "The provider's format(", ") must match the parent(", Extension.C_BRAKE), i2 == i);
        synchronized (this.a) {
            z = this.c;
        }
        d6z.y("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
        this.q = deferrableSurface;
        ni91.h(deferrableSurface.c(), this.p);
        deferrableSurface.d();
        ni91.g(this.e).c(new f6f0(deferrableSurface, 2), geb1.b());
        ni91.g(deferrableSurface.g).c(runnable, geb1.f());
        return true;
    }
}
