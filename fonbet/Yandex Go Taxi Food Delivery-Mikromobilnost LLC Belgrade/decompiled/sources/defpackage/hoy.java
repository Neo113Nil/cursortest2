package defpackage;

import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.linked_order.interactor.f0;
import ru.yandex.taxi.linked_order.map.utils.a;

/* loaded from: classes5.dex */
public final class hoy extends ad5 {
    public final kly A;
    public final f0 B;
    public final h3y C;
    public final r0 D;
    public final r0 E;
    public l8x F;
    public g18 G;
    public final a x;
    public final r1s y;
    public final reu z;

    public hoy(a aVar, r1s r1sVar, reu reuVar, kly klyVar, f0 f0Var, h3y h3yVar) {
        super(foy.class);
        this.x = aVar;
        this.y = r1sVar;
        this.z = reuVar;
        this.A = klyVar;
        this.B = f0Var;
        this.C = h3yVar;
        Boolean bool = Boolean.FALSE;
        this.D = bvf0.c(bool);
        this.E = bvf0.c(bool);
        this.G = g18.u1;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        l8x l8xVar = this.F;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.F = null;
        this.G.cancel();
        jiu jiuVar = ik91.a;
        a aVar = this.x;
        aVar.c = jiuVar;
        aVar.b();
        r1s r1sVar = this.y;
        ((gh00) ((ah00) r1sVar.b)).u((b01) r1sVar.w);
        cpy cpyVar = (cpy) this.C.get();
        pzt0 pzt0Var = cpyVar.l;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        cpyVar.l = null;
        super.Cg();
    }

    @Override // defpackage.zc5
    public final void Fg() {
        Boolean bool = Boolean.FALSE;
        r0 r0Var = this.E;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // defpackage.zc5
    public final void Gg() {
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.E;
        r0Var.getClass();
        r0Var.m(null, bool);
    }
}
