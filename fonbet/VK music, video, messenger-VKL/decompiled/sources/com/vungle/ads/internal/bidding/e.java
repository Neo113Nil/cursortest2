package com.vungle.ads.internal.bidding;

import android.content.Context;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.GzipEncodeError;
import com.vungle.ads.JsonEncodeError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.l3;
import com.vungle.ads.internal.model.o3;
import com.vungle.ads.internal.model.t1;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.d0;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.LazyThreadSafetyMode;
import xsna.fpf0;
import xsna.j8y;
import xsna.msy;
import xsna.n9y;
import xsna.s1v;

/* loaded from: classes7.dex */
public final class e {
    public final Context a;
    public int c;
    public long e;
    public m2 b = new m2(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUESTED);
    public final j8y d = n9y.a(d.a);

    public e(Context context) {
        this.a = context;
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        com.vungle.ads.internal.util.a.a(new a(this));
    }

    public final String a() {
        VungleApiClient vungleApiClient = (VungleApiClient) msy.a(LazyThreadSafetyMode.SYNCHRONIZED, new c(this.a)).getValue();
        ConfigManager.INSTANCE.getClass();
        t1 a = vungleApiClient.a(!ConfigManager.r(), ConfigManager.b());
        o3 o3Var = new o3(a.a(), a.d(), a.b(), new l3(d0.d()), this.c);
        j8y j8yVar = this.d;
        return j8yVar.b(s1v.p(j8yVar.b, fpf0.d(o3.class)), o3Var);
    }

    public final b b() {
        this.c++;
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.b, (s) null, 6);
        try {
            String a = a();
            boolean z = u.a;
            t.a("BidTokenEncoder", "BidToken: " + a);
            try {
                String str = "6:" + q.a(a);
                t.a("BidTokenEncoder", "After conversion: " + str);
                return new b(str, "");
            } catch (Throwable th) {
                StringBuilder a2 = l.a("Fail to gzip token data. ");
                a2.append(th.getLocalizedMessage());
                String sb = a2.toString();
                new GzipEncodeError(sb).logErrorNoReturnValue$vungle_ads_release();
                return new b("", sb);
            }
        } catch (Throwable th2) {
            StringBuilder a3 = l.a("Failed to encode TokenParameters. ");
            a3.append(th2.getLocalizedMessage());
            String sb2 = a3.toString();
            new JsonEncodeError(sb2).logErrorNoReturnValue$vungle_ads_release();
            return new b("", sb2);
        }
    }
}
