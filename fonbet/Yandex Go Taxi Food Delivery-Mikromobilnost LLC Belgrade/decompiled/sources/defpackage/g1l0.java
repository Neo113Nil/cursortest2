package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.search.router.Origin;
import java.util.ArrayList;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes13.dex */
public final class g1l0 implements l51 {
    public final /* synthetic */ k1l0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ o2y0 c;
    public final /* synthetic */ int w;

    public g1l0(int i, k1l0 k1l0Var, o2y0 o2y0Var, ArrayList arrayList) {
        this.a = k1l0Var;
        this.b = arrayList;
        this.c = o2y0Var;
        this.w = i;
    }

    @Override // defpackage.sy60
    public final void a() {
        o2y0 o2y0Var = this.c;
        this.a.Q(this.b, o2y0Var);
    }

    @Override // defpackage.l51
    public final void a1(pv0 pv0Var) {
        ArrayList arrayList = new ArrayList(this.b);
        arrayList.set(this.w, pv0Var.a);
        this.a.Q(arrayList, this.c);
    }

    @Override // defpackage.l51
    public final void h(PointType pointType, Address address, pv0 pv0Var) {
        k1l0 k1l0Var = this.a;
        k1l0Var.E((m950) k1l0Var.L.get(), new m41(kyh0.select_address_to, null, PointType.DESTINATION, Origin.ORDER, pv0Var, address != null ? address.B() : null, true, true, null, null, null, 523520), new f1l0(this.w, k1l0Var, this.c, this.b), hxx.a);
    }
}
