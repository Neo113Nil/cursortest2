package defpackage;

import com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.CitySuggest;
import com.yandex.go.payments.shared.y;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class hwb implements ax4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hwb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ax4
    public final void t(pv0 pv0Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                c4f c4fVar = (c4f) obj;
                Object extraData = pv0Var.a.getExtraData();
                if (!(extraData instanceof CitySuggest)) {
                    g8e.B(jst.e, "B2B.TOKEN_ERROR:CITY_SUGGEST_DIALOG", null, "returned type is not CitySuggest", 2);
                    break;
                } else {
                    ej6 ej6Var = ((iwb) obj2).c;
                    SharedPaymentsOpenReason sharedPaymentsOpenReason = c4fVar.a;
                    o61 o61Var = ej6Var.b;
                    String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
                    o61Var.getClass();
                    HashMap hashMap = new HashMap();
                    if (analyticsName != null) {
                        hashMap.put("open_reason", analyticsName);
                    }
                    o61Var.a.a("CitySuggestScreen.CityChosen", hashMap, 1, new HashMap());
                    vbb vbbVar = c4fVar.b;
                    ((d4f) vbbVar.a).c = (CitySuggest) extraData;
                    ((y) vbbVar.b).d();
                    break;
                }
            default:
                ((tls) obj2).invoke(pv0Var);
                ((zc) obj).r(new qu(9));
                break;
        }
    }
}
