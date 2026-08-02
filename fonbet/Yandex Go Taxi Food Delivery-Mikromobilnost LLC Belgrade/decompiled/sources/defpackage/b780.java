package defpackage;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;

/* loaded from: classes14.dex */
public final /* synthetic */ class b780 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DetailsOpenReason b;

    public /* synthetic */ b780(DetailsOpenReason detailsOpenReason, int i) {
        this.a = i;
        this.b = detailsOpenReason;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String str;
        String str2;
        int i = this.a;
        DetailsOpenReason detailsOpenReason = this.b;
        switch (i) {
            case 0:
                str = detailsOpenReason.alias;
                str2 = "No active order found to open details, open reason=";
                break;
            default:
                str = detailsOpenReason.alias;
                str2 = "No active order found to open order with feed details, open reason=";
                break;
        }
        return g8e.o(str2, str);
    }
}
