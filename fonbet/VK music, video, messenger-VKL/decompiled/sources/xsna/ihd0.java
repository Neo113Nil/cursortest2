package xsna;

import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.g;
import xsna.pi20;
import xsna.snw;

/* compiled from: ProcessingSurface.java */
/* loaded from: classes11.dex */
public final class ihd0 extends DeferrableSurface {
    public final Object h = new Object();
    public boolean i;
    public final pi20 j;
    public final Surface k;
    public final g.a l;

    @NonNull
    public final es9 m;
    public final pi20.a n;
    public final DeferrableSurface o;
    public final String p;

    public ihd0(int i, int i2, int i3, @Nullable Handler handler, @NonNull g.a aVar, @NonNull es9 es9Var, @NonNull DeferrableSurface deferrableSurface, @NonNull String str) {
        bk1 bk1Var = new bk1(this, 29);
        this.i = false;
        Size size = new Size(i, i2);
        mtu mtuVar = new mtu(handler);
        pi20 pi20Var = new pi20(i, i2, i3, 2);
        this.j = pi20Var;
        pi20Var.a(bk1Var, mtuVar);
        this.k = pi20Var.getSurface();
        this.n = pi20Var.b;
        this.m = es9Var;
        es9Var.c(size);
        this.l = aVar;
        this.o = deferrableSurface;
        this.p = str;
        r0t.a(deferrableSurface.c(), new hhd0(this), xo9.g());
        r0t.e(this.e).addListener(new jk9(this, 8), xo9.g());
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    @NonNull
    public final ugz<Surface> e() {
        snw.c d;
        synchronized (this.h) {
            d = r0t.d(this.k);
        }
        return d;
    }

    public final void f(hlw hlwVar) {
        alw alwVar;
        if (this.i) {
            return;
        }
        try {
            alwVar = hlwVar.b();
        } catch (IllegalStateException e) {
            s100.a("ProcessingSurfaceTextur", "Failed to acquire next image.", e);
            alwVar = null;
        }
        if (alwVar == null) {
            return;
        }
        ojw B = alwVar.B();
        if (B == null) {
            alwVar.close();
            return;
        }
        d0o0 c = B.c();
        String str = this.p;
        Integer a = c.a(str);
        if (a == null) {
            alwVar.close();
            return;
        }
        this.l.getClass();
        if (a.intValue() != 0) {
            alwVar.close();
            return;
        }
        kuj0 kuj0Var = new kuj0(alwVar, str);
        this.m.b(kuj0Var);
        kuj0Var.b.close();
    }
}
