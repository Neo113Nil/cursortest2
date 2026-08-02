package defpackage;

import com.yandex.go.chargers.e;
import com.yandex.go.chargers.offer.ChargersOfferOpenReason;
import com.yandex.go.chargers.offer.ChargersOfferStationOpenReason;
import com.yandex.go.chargers.order.ChargersOrderStationOpenReason;

/* loaded from: classes12.dex */
public final /* synthetic */ class ps9 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tsa b;

    public /* synthetic */ ps9(tsa tsaVar, int i) {
        this.a = i;
        this.b = tsaVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 14;
        tsa tsaVar = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((jv9) obj).a.r(new ps9(tsaVar, 1));
                break;
            case 1:
                ((kw9) obj).a.r(new ps9(tsaVar, 2));
                break;
            case 2:
                ((mu9) obj).a0(tsaVar);
                break;
            case 3:
                ((lda) obj).a.r(new ps9(tsaVar, 6));
                break;
            case 4:
                ((c9a) obj).a.r(new cs8(i2, tsaVar, ChargersOfferStationOpenReason.Map));
                break;
            case 5:
                ((c9a) obj).a.r(new cs8(i2, tsaVar, ChargersOfferStationOpenReason.DiscountsAndPromocodes));
                break;
            case 6:
                ((zca) obj).O0(tsaVar, ChargersOrderStationOpenReason.DiscountsAndPromocodes);
                break;
            case 7:
                ((sj9) obj).c0(tsaVar);
                break;
            default:
                dpa dpaVar = (dpa) obj;
                e.c0(dpaVar.a, dpaVar.b, this.b, ChargersOfferOpenReason.Qr, dpaVar.c, null, 16);
                break;
        }
        return zy11Var;
    }
}
