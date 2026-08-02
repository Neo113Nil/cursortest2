package defpackage;

import androidx.compose.animation.core.a;

/* loaded from: classes10.dex */
public final class me2 implements rfd {
    public final ne2 a;
    public Object b;
    public final lax0 c;

    public me2(ne2 ne2Var) {
        this.a = ne2Var;
        Object e = ne2Var.c.e();
        Object e2 = ne2Var.c.e();
        this.b = ne2Var.a.a.getValue();
        jj2 jj2Var = ne2Var.b;
        a aVar = ne2Var.c;
        gl11 gl11Var = aVar.a;
        this.c = new lax0(jj2Var, gl11Var, e, e2, (sj2) gl11Var.a.invoke(gl11Var.b.invoke(aVar.d.c)));
    }

    @Override // defpackage.rfd
    public final long a() {
        long d = this.c.d();
        int i = yx21.a;
        return (d + 999999) / 1000000;
    }

    @Override // defpackage.rfd
    public final void b() {
        Object f = this.c.f(0L);
        this.b = f;
        this.a.a.a.setValue(f);
    }
}
