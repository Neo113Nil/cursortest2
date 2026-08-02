package xsna;

import com.google.android.gms.maps.model.MarkerOptions;

/* compiled from: DeliveryPointsClusterRenderer.kt */
/* loaded from: classes18.dex */
public final class rwl implements bxf<lwl>, zwf<lwl> {
    public final zwf<lwl> a;
    public final qwl b = new qwl();
    public final uwl c = new uwl(1);

    public rwl(zwf<lwl> zwfVar) {
        this.a = zwfVar;
    }

    @Override // xsna.zwf
    public final void a(twf twfVar, qdr0 qdr0Var) {
        sb7 h = this.c.h((lwl) twfVar);
        if (h != null) {
            qdr0Var.c(h);
        }
    }

    @Override // xsna.zwf
    public final boolean b(xwf xwfVar) {
        return xwfVar.c >= 2;
    }

    @Override // xsna.zwf
    public final void c(xwf xwfVar, qdr0 qdr0Var) {
        sb7 h = this.b.h(xwfVar);
        if (h != null) {
            qdr0Var.c(h);
            qdr0Var.a.b(0.5f, 0.5f);
        }
    }

    @Override // xsna.zwf
    public final void d(twf twfVar, rdr0 rdr0Var) {
        rdr0Var.a(this.c.h((lwl) twfVar));
    }

    @Override // xsna.zwf
    public final void e(xwf xwfVar, rdr0 rdr0Var) {
        rdr0Var.a(this.b.h(xwfVar));
        MarkerOptions markerOptions = rdr0Var.a;
        markerOptions.f = 0.5f;
        markerOptions.g = 0.5f;
    }

    @Override // xsna.zwf
    public final fo00 f(jwf<? extends lwl> jwfVar) {
        return this.a.f(jwfVar);
    }

    @Override // xsna.bxf
    public final zwf<lwl> getParent() {
        return this.a;
    }
}
