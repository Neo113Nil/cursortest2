package xsna;

import java.util.List;

/* compiled from: LazyListScrollScope.kt */
/* loaded from: classes11.dex */
public final class pvy implements guy, ggh0 {
    public final /* synthetic */ ggh0 a;
    public final /* synthetic */ xvy b;

    public pvy(ggh0 ggh0Var, xvy xvyVar) {
        this.b = xvyVar;
        this.a = ggh0Var;
    }

    @Override // xsna.guy
    public final int a() {
        return this.b.i();
    }

    @Override // xsna.guy
    public final int b() {
        return this.b.h();
    }

    @Override // xsna.guy
    public final int c() {
        xuy xuyVar = (xuy) j5g.k0(this.b.j().f());
        if (xuyVar != null) {
            return xuyVar.getIndex();
        }
        return 0;
    }

    @Override // xsna.guy
    public final void d(int i, int i2) {
        this.b.l(i, i2, true);
    }

    @Override // xsna.guy
    public final int e(int i) {
        xuy xuyVar;
        xvy xvyVar = this.b;
        fvy j = xvyVar.j();
        if (!j.f().isEmpty()) {
            int h = xvyVar.h();
            if (i > c() || h > i) {
                return ((i - xvyVar.h()) * hpt0.w(j)) - xvyVar.i();
            }
            List<xuy> f = j.f();
            int size = f.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    xuyVar = null;
                    break;
                }
                xuyVar = f.get(i2);
                if (xuyVar.getIndex() == i) {
                    break;
                }
                i2++;
            }
            xuy xuyVar2 = xuyVar;
            if (xuyVar2 != null) {
                return xuyVar2.getOffset();
            }
        }
        return 0;
    }

    @Override // xsna.ggh0
    public final float f(float f) {
        return this.a.f(f);
    }

    @Override // xsna.guy
    public final int getItemCount() {
        return this.b.j().d();
    }
}
