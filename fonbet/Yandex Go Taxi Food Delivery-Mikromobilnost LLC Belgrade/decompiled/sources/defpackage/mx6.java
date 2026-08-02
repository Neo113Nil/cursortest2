package defpackage;

import android.net.Uri;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import defpackage.shs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes8.dex */
public final class mx6 {
    public static Promotion a(Promotion promotion, SharedPaymentsOpenReason sharedPaymentsOpenReason) {
        if (!(promotion instanceof shs)) {
            return promotion;
        }
        Iterator it = ((shs) promotion).l.iterator();
        while (it.hasNext()) {
            BannerWidgets bannerWidgets = ((shs.a) it.next()).e;
            List list = bannerWidgets.c;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(b((BannerWidgets.b) it2.next(), sharedPaymentsOpenReason));
            }
            bannerWidgets.c = arrayList;
        }
        return promotion;
    }

    public static BannerWidgets.b b(BannerWidgets.b bVar, SharedPaymentsOpenReason sharedPaymentsOpenReason) {
        try {
            BannerWidgets.a aVar = bVar.g;
            if (aVar == null) {
                xby.l(jst.e, "B2B.TOKEN_ERROR:ONBOARDING_URL", null, new IllegalArgumentException(), "Action not found", 2);
                return bVar;
            }
            BannerWidgets.c cVar = aVar.b;
            if (cVar == null) {
                xby.l(jst.e, "B2B.TOKEN_ERROR:ONBOARDING_URL", null, new IllegalArgumentException(), "Payload not found", 2);
                return bVar;
            }
            String str = cVar.a;
            if (str.length() == 0) {
                xby.l(jst.e, "B2B.TOKEN_ERROR:ONBOARDING_URL", null, new IllegalArgumentException(), "Deeplink not found", 2);
                return bVar;
            }
            return new BannerWidgets.b(bVar.a, bVar.c, bVar.d, bVar.e, bVar.f, new BannerWidgets.a(aVar.a, new BannerWidgets.c(Uri.parse(str).buildUpon().appendQueryParameter("open_reason", sharedPaymentsOpenReason.getAnalyticsName()).build().toString(), cVar.b, 1020)), 3970);
        } catch (Throwable th) {
            xby.l(jst.e, "B2B.TOKEN_ERROR:ONBOARDING_URL", null, th, "Error adding open reason", 2);
            return bVar;
        }
    }
}
