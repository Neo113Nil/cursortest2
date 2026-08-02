package defpackage;

import ru.yandex.taxi.masstransit.d;

/* loaded from: classes6.dex */
public final class a010 implements nd30 {
    public final /* synthetic */ d a;
    public final /* synthetic */ e310 b;
    public final /* synthetic */ yq30 c;
    public final /* synthetic */ je30 w;

    public a010(d dVar, e310 e310Var, yq30 yq30Var, je30 je30Var) {
        this.a = dVar;
        this.b = e310Var;
        this.c = yq30Var;
        this.w = je30Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        yq30 yq30Var = this.c;
        boolean z = yq30Var instanceof xq30;
        if (z && ((xq30) yq30Var).b) {
            this.w.i();
            return;
        }
        boolean z2 = yq30Var instanceof wq30;
        e310 e310Var = this.b;
        d dVar = this.a;
        if (z2) {
            dVar.c0(e310Var);
        } else if (z) {
            d.Z(dVar, e310Var, ((xq30) yq30Var).a, null, 6);
        }
    }

    @Override // defpackage.nd30
    public final void m() {
        this.a.c0(this.b);
    }
}
