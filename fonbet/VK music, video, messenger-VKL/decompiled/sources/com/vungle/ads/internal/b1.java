package com.vungle.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.BaseFullscreenAd$play$2;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public abstract class b1 extends s {
    public WeakReference q;

    public b1(Context context) {
        super(context);
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(VungleAdSize vungleAdSize) {
        return true;
    }

    @Override // com.vungle.ads.internal.s
    public final VungleAdSize b() {
        return null;
    }

    public com.vungle.ads.internal.presenter.z m() {
        return null;
    }

    public final void a(Context context, BaseFullscreenAd$play$2 baseFullscreenAd$play$2) {
        com.vungle.ads.internal.util.s e;
        Long a;
        Long a2;
        com.vungle.ads.internal.util.s e2 = e();
        if ((e2 != null && (a2 = e2.a()) != null && a2.longValue() == 3) || ((e = e()) != null && (a = e.a()) != null && a.longValue() == 4)) {
            l();
        }
        g().e();
        this.q = context != null ? new WeakReference(context) : null;
        VungleError a3 = a(true);
        if (a3 != null) {
            baseFullscreenAd$play$2.onFailure(a3);
            if (a(a3.getCode())) {
                a(h.g);
                return;
            }
            return;
        }
        com.vungle.ads.internal.model.h0 c = c();
        i3 f = f();
        if (c != null && f != null) {
            a1 a1Var = new a1(baseFullscreenAd$play$2, this);
            a();
            Handler handler = com.vungle.ads.internal.util.y.a;
            com.vungle.ads.internal.util.y.a(new z0(this, a1Var, c, f));
            return;
        }
        baseFullscreenAd$play$2.onFailure(new AdNotLoadedCantPlay("Ad or Placement is null: pl=" + f + " adv=" + c).setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release());
    }

    public static final void a(b1 b1Var, a1 a1Var, com.vungle.ads.internal.model.h0 h0Var, i3 i3Var) {
        Context d;
        WeakReference weakReference = b1Var.q;
        if (weakReference == null || (d = (Context) weakReference.get()) == null) {
            d = b1Var.d();
        }
        com.vungle.ads.internal.presenter.a aVar = new com.vungle.ads.internal.presenter.a(a1Var, i3Var);
        y0 y0Var = new y0(h0Var, i3Var, b1Var.m());
        y0 y0Var2 = com.vungle.ads.internal.ui.l.h;
        com.vungle.ads.internal.ui.a.a(y0Var);
        com.vungle.ads.internal.ui.a.a(aVar);
        Intent a = com.vungle.ads.internal.ui.a.a(d, i3Var.b(), h0Var.h());
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        if (!com.vungle.ads.internal.util.a.a()) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("FullscreenAdInternal", "The ad activity is in background on play, log AD_VISIBILITY_INVISIBLE.");
            a.putExtra("ad_invisible_logged", true);
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            m2Var.a((Long) 1L);
            AnalyticsClient.a(analyticsClient, m2Var, b1Var.e(), 4);
        }
        b1Var.g().d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, b1Var.g(), b1Var.e());
        b1Var.h().e();
        com.vungle.ads.internal.util.a.a(d, null, a, null);
    }
}
