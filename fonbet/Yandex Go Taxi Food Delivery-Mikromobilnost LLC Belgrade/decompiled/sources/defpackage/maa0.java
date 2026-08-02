package defpackage;

import com.yandex.go.payments.paymentlist.data.c;
import com.yandex.go.zone.interactors.b;
import ru.yandex.taxi.preorder.source.userposition.repository.a;

/* loaded from: classes8.dex */
public final class maa0 implements jy60 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public maa0(c cVar) {
        this.b = cVar;
    }

    @Override // defpackage.s150
    public final String getName() {
        switch (this.a) {
            case 0:
                return "PaymentMethodsFirstContentfulPaintListener";
            default:
                return "ScootersZoneInfoInteractor";
        }
    }

    @Override // defpackage.jy60
    public final void h() {
        switch (this.a) {
            case 0:
                ((c) this.b).i();
                break;
            default:
                ((vxm0) this.b).a.getClass();
                break;
        }
    }

    public maa0(tse tseVar, b bVar, po21 po21Var, a aVar, vxm0 vxm0Var) {
        this.b = vxm0Var;
    }
}
