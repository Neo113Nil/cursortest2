package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.view.e;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.net.taxi.dto.objects.Dialog;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.OrderMvpView;
import ru.yandex.taxi.order.f;

/* loaded from: classes14.dex */
public final class p480 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ p480(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.Og();
                return zy11.a;
            case 1:
                e eVar = this.b;
                x980 x980Var = eVar.D;
                o2y0 o2y0Var = eVar.B;
                Dialog dialog = ((TaxiOrder) obj).V().X.a;
                rp70 rp70Var = ((f) x980Var).C1;
                rp70Var.getClass();
                String str = dialog.b;
                if (str != null && !evu0.J(str)) {
                    TaxiOrder b = o2y0Var.b();
                    if (!b.l.m) {
                        synchronized (b) {
                            TaxiOrderLocalData taxiOrderLocalData = b.l;
                            taxiOrderLocalData.getClass();
                            b.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -4097, 16777215);
                        }
                        tdj tdjVar = new tdj(o2y0Var);
                        tdjVar.b = dialog.a;
                        tdjVar.c = kub1.d(rp70Var.e, b.V().K, dialog.b);
                        tdjVar.a(new h2r(21, dialog, rp70Var));
                        rp70Var.c.n(tdjVar, new pp70(o2y0Var, "paidOptionsDiscountDialog"));
                    }
                }
                return zy11.a;
            case 2:
                e eVar2 = this.b;
                x980 x980Var2 = eVar2.D;
                f fVar = (f) x980Var2;
                fVar.v0(eVar2.B, (lpx0) obj);
                return zy11.a;
            default:
                ((OrderMvpView) this.b.Dg()).updateArrowViewBehaviour((DriveState) obj);
                return zy11.a;
        }
    }
}
