package com.vungle.ads.internal;

import com.vungle.ads.BaseFullscreenAd$play$2;
import com.vungle.ads.VungleError;

/* loaded from: classes7.dex */
public final class a1 extends com.vungle.ads.internal.presenter.c {
    public final /* synthetic */ b1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(BaseFullscreenAd$play$2 baseFullscreenAd$play$2, b1 b1Var) {
        super(baseFullscreenAd$play$2);
        this.b = b1Var;
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdEnd(String str) {
        this.b.a(h.f);
        this.a.onAdEnd(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdImpression(String str) {
        this.b.a(h.e);
        this.a.onAdImpression(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdStart(String str) {
        this.b.a(h.d);
        this.b.l.d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        b1 b1Var = this.b;
        t1 t1Var = b1Var.l;
        analyticsClient.a(t1Var, b1Var.m, t1Var.b);
        this.a.onAdStart(str);
    }

    @Override // com.vungle.ads.internal.presenter.c, com.vungle.ads.internal.presenter.b
    public final void onFailure(VungleError vungleError) {
        this.b.a(h.g);
        super.onFailure(vungleError);
    }
}
