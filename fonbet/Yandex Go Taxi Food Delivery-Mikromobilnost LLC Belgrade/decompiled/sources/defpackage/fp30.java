package defpackage;

import ru.yandex.taxi.masstransit.api.model.OpenReason;
import ru.yandex.taxi.masstransit.router.MtModeRouter$onLaunch$$inlined$safeCollectIn$1;

/* loaded from: classes6.dex */
public final class fp30 extends h55 {
    public final gyc D;
    public final ah00 E;
    public kv1 F;
    public b2w G;

    public fp30(gyc gycVar, ah00 ah00Var) {
        super(null);
        this.D = gycVar;
        this.E = ah00Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        kv1 kv1Var = this.F;
        if (kv1Var != null) {
            xm00 xm00Var = (xm00) kv1Var.f;
            xm00Var.m();
            xm00Var.d();
        }
        this.F = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        xm00 p = ((gh00) this.E).i.p();
        gyc gycVar = this.D;
        gycVar.getClass();
        kv1 kv1Var = new kv1((i3g) gycVar.a, p);
        this.F = kv1Var;
        n140 n140Var = (n140) ((n3w) kv1Var.q).a;
        k140 k140Var = ((dp30) obj).b;
        n140Var.a.getClass();
        b2w b2wVar = new b2w(k140Var);
        this.G = b2wVar;
        gci0 gci0Var = b2wVar.b;
        if (gci0Var != null) {
            tje.N(o(), null, null, new MtModeRouter$onLaunch$$inlined$safeCollectIn$1(gci0Var, null, this), 3);
        }
    }

    public final void P(k140 k140Var) {
        if (k140Var instanceof i140) {
            b2w b2wVar = this.G;
            if (b2wVar != null) {
                igu0 igu0Var = ((i140) k140Var).a;
                b2wVar.a.l(new i140(new igu0(igu0Var.a, igu0Var.b, igu0Var.c, OpenReason.ROUTE_CARD)));
                return;
            }
            return;
        }
        if (k140Var instanceof j140) {
            P(((j140) k140Var).a);
            return;
        }
        if (k140Var instanceof h140) {
            P(((h140) k140Var).a);
        } else if (k140Var == null) {
            r(new qu(9));
        } else {
            w511.b();
        }
    }
}
