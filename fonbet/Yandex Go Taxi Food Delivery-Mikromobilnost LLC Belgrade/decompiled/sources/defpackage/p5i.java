package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes5.dex */
public final class p5i implements isd {
    public final /* synthetic */ r5i a;
    public final /* synthetic */ q5i b;
    public final /* synthetic */ jo0 c;

    public p5i(r5i r5iVar, q5i q5iVar, jo0 jo0Var) {
        this.a = r5iVar;
        this.b = q5iVar;
        this.c = jo0Var;
    }

    @Override // defpackage.isd
    public final void X0(boolean z, dw1 dw1Var) {
        this.c.invoke();
    }

    @Override // defpackage.sy60
    public final void a() {
    }

    @Override // defpackage.isd
    public final void h(PointType pointType, Address address, pv0 pv0Var) {
        r5i r5iVar = this.a;
        r5iVar.E((m950) r5iVar.T.get(), new z3i(pointType, address, pv0Var), new o5i(pointType, this.b, this.c), hxx.a);
    }

    @Override // defpackage.isd
    public final void o(String str) {
        ((a60) this.b.a.Q).c(str, v770.c);
    }
}
