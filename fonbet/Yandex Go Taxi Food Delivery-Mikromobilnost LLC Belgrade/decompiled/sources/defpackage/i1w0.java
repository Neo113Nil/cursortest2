package defpackage;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes.dex */
public final class i1w0 {
    public final lx4 a;

    public i1w0(lx4 lx4Var) {
        this.a = lx4Var;
    }

    public final void a(String str) {
        b(str, DetailsOpenReason.HEADER.alias).m();
    }

    public final w3j0 b(String str, String str2) {
        w3j0 j;
        i d = ((j) this.a).d("SuperappMain.Order.WillOpen");
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put(Constants.KEY_SERVICE, str);
        linkedHashMap.put(CRLReasonCodeExtension.REASON, str2);
        j = d.j((r2 & 1) == 0);
        return j;
    }
}
