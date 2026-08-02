package defpackage;

import com.yandex.go.analytics.b;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadSetReason;

/* loaded from: classes9.dex */
public final class moz0 {
    public final b a;

    public moz0(b bVar) {
        this.a = bVar;
    }

    public final void a(boolean z, TollRoadSetReason tollRoadSetReason) {
        b bVar = this.a;
        bVar.getClass();
        vug vugVar = new vug(bVar, "TollRoad.onSetTollRoadUsing");
        vugVar.g("isTollRoad", z);
        vugVar.a.put(CRLReasonCodeExtension.REASON, tollRoadSetReason.getAnalyticsName());
        vugVar.m();
    }
}
