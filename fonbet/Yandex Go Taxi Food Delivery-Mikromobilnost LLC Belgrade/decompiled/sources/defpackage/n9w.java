package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes14.dex */
public final class n9w implements i61 {
    public final /* synthetic */ wjw a;
    public final /* synthetic */ wjw b;
    public final /* synthetic */ wjw c;

    public n9w(wjw wjwVar, wjw wjwVar2, wjw wjwVar3) {
        this.a = wjwVar;
        this.b = wjwVar2;
        this.c = wjwVar3;
    }

    @Override // defpackage.i61
    public final void F5(pv0 pv0Var) {
    }

    @Override // defpackage.i61
    public final void K1() {
    }

    @Override // defpackage.i61
    public final void la(PointType pointType, Address address, pv0 pv0Var, boolean z) {
        Address address2;
        zzs zzsVar = null;
        if (pointType == PointType.SOURCE) {
            if (address != null) {
                zzsVar = address.B();
            }
        } else if (pv0Var != null && (address2 = pv0Var.a) != null) {
            zzsVar = address2.B();
        }
        this.a.a.r(new rfw(pointType, zzsVar, pv0Var, 1));
    }

    @Override // defpackage.i61
    public final void n6(boolean z, dw1 dw1Var) {
        this.c.a.r(new xuv(21));
    }

    @Override // defpackage.i61
    public final void setMapToPoint(zzs zzsVar) {
        this.b.a.r(new xuv(22));
    }
}
