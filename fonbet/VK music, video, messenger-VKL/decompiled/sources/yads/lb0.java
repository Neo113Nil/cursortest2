package yads;

import android.view.View;

/* loaded from: classes10.dex */
public class lb0 implements pi {
    public final ll3 a;

    public lb0(ll3 ll3Var) {
        this.a = ll3Var;
    }

    @Override // yads.pi
    public final void a() {
        View b = this.a.b();
        if (b == null) {
            return;
        }
        this.a.a(b);
    }

    @Override // yads.pi
    public final boolean b() {
        return this.a.b() != null;
    }

    @Override // yads.pi
    public final dm3 c() {
        View b = this.a.b();
        if (b != null) {
            return new dm3(b.getWidth(), b.getHeight());
        }
        return null;
    }

    @Override // yads.pi
    public final boolean d() {
        return om3.a(this.a.b()) >= 100;
    }

    @Override // yads.pi
    public final boolean e() {
        return this.a.c();
    }

    @Override // yads.pi
    public final void a(oi oiVar, ol3 ol3Var) {
        this.a.a(oiVar, ol3Var, oiVar.c);
    }

    public void b(Object obj) {
        c(obj);
    }

    @Override // yads.pi
    public final void c(Object obj) {
        View b = this.a.b();
        if (b == null) {
            return;
        }
        this.a.b(b, obj);
        b.setVisibility(0);
    }

    @Override // yads.pi
    public final boolean a(Object obj) {
        View b = this.a.b();
        return b != null && this.a.a(b, obj);
    }

    @Override // yads.pi
    public final void destroy() {
    }
}
