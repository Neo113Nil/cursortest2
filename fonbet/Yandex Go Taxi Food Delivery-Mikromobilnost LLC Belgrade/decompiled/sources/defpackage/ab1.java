package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.api.AdjustEventsHelper$AdjustEnvironment;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.AdjustEventTokenData;
import com.ybsdk.rconfig.configs.AdjustEventsMapping;

/* loaded from: classes2.dex */
public final class ab1 {
    public final b a;
    public final ums b;
    public final AppAnalyticsReporter c;

    public ab1(b bVar, ums umsVar, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = bVar;
        this.b = umsVar;
        this.c = appAnalyticsReporter;
    }

    public final void a(String str) {
        String prodToken;
        AdjustEventTokenData adjustEventTokenData = ((AdjustEventsMapping) this.a.d(ya1.a).getData()).getEventsMapping().get(str);
        if (adjustEventTokenData == null) {
            trp0 trp0Var = trp0.a;
            trp0.e(new fqp0(str));
            return;
        }
        ums umsVar = this.b;
        umsVar.getClass();
        int i = za1.a[AdjustEventsHelper$AdjustEnvironment.PROD.ordinal()];
        if (i == 1) {
            prodToken = adjustEventTokenData.getProdToken();
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            prodToken = adjustEventTokenData.getDevToken();
        }
        umsVar.getClass();
        fcy0 fcy0Var = this.c.m0;
        fcy0Var.a.a("tech.adjust_event_sent", x4e.t(2, "name", str, AuthSdkActivity.RESPONSE_TYPE_TOKEN, prodToken));
    }
}
