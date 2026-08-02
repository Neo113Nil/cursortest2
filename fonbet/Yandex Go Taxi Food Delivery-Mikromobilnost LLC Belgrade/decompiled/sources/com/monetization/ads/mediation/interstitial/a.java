package com.monetization.ads.mediation.interstitial;

import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import defpackage.aj81;
import defpackage.bq71;
import defpackage.f171;
import defpackage.kgx;
import defpackage.kh61;
import defpackage.qha1;
import defpackage.qoi0;
import defpackage.r581;
import defpackage.sg61;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes7.dex */
public final class a implements MediatedInterstitialAdapter.MediatedInterstitialAdapterListener {
    public static final /* synthetic */ kgx[] g;
    public final aj81 a;
    public final f171 b;
    public final sg61 c;
    public final r581 d;
    public final r581 e;
    public final r581 f;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("contentController", 0, "getContentController()Lcom/monetization/ads/fullscreen/FullscreenContentController;", a.class);
        qoi0.a.getClass();
        g = new kgx[]{mutablePropertyReference1Impl, qha1.a(a.class, "loadController", "getLoadController()Lcom/monetization/ads/fullscreen/FullScreenLoadController;"), qha1.a(a.class, "adQualityVerifierController", "getAdQualityVerifierController()Lcom/monetization/ads/base/quality/AdQualityVerifierController;")};
    }

    public a(kh61 kh61Var, bq71 bq71Var, aj81 aj81Var, f171 f171Var) {
        sg61 sg61Var = new sg61();
        this.a = aj81Var;
        this.b = f171Var;
        this.c = sg61Var;
        this.d = new r581(null);
        this.e = new r581(kh61Var);
        this.f = new r581(bq71Var.d);
    }
}
