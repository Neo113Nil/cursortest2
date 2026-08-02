package defpackage;

import com.yandex.go.payments.shared.antifraud.ui.a;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class nue extends ad5 {
    public final SharedPaymentsOpenReason A;
    public final gyc B;
    public final yfa x;
    public final a y;
    public final iue z;

    public nue(yfa yfaVar, a aVar, iue iueVar, SharedPaymentsOpenReason sharedPaymentsOpenReason, gyc gycVar) {
        super(lue.class);
        this.x = yfaVar;
        this.y = aVar;
        this.z = iueVar;
        this.A = sharedPaymentsOpenReason;
        this.B = gycVar;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        rue rueVar = (rue) this.x.a;
        String analyticsName = this.A.getAnalyticsName();
        rueVar.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        rueVar.a.a("CorpAntiFraudScreen.Closed", hashMap, 1, new HashMap());
    }
}
