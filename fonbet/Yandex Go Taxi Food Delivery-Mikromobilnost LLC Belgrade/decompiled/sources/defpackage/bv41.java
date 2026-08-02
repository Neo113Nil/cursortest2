package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.web.TaxiWebView;

/* loaded from: classes14.dex */
public final class bv41 {
    public final String a;

    public bv41(String str) {
        this.a = str;
    }

    public final void a(TaxiWebView taxiWebView, List list) {
        String userAgentString = taxiWebView.getSettings().getUserAgentString();
        String str = this.a;
        if (userAgentString != null && !evu0.J(userAgentString)) {
            str = g8e.p(userAgentString, " ", str);
        }
        if (!list.isEmpty()) {
            str = g8e.p(str, " ", a.X(list, " ", null, null, null, 62));
        }
        hst hstVar = jst.e;
        String.format("User-Agent: %s", Arrays.copyOf(new Object[]{str}, 1));
        hstVar.getClass();
        taxiWebView.getSettings().setUserAgentString(str);
    }
}
