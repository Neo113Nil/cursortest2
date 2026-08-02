package com.yandex.mobile.ads.common;

import android.content.Context;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.common.BidderTokenRequestConfiguration;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.d;
import xsna.bdn;
import xsna.hpj;
import xsna.myc0;
import xsna.vhn0;
import xsna.wgl;
import xsna.whn0;
import xsna.zvj;
import yads.as3;
import yads.dp;
import yads.dw2;
import yads.e00;
import yads.eu2;
import yads.lm0;
import yads.lu2;
import yads.mm0;
import yads.mu2;
import yads.mv3;
import yads.ob2;
import yads.q53;
import yads.rd;
import yads.w5;
import yads.y10;

/* loaded from: classes8.dex */
public final class BidderTokenLoader {
    public static final void loadBidderToken(Context context, BidderTokenRequestConfiguration bidderTokenRequestConfiguration, BidderTokenLoadListener bidderTokenLoadListener) {
        e00 e00Var;
        BannerAdSize bannerAdSize;
        mv3 mv3Var = new mv3(context);
        as3 as3Var = new as3(bidderTokenLoadListener);
        boolean z = bidderTokenRequestConfiguration instanceof BidderTokenRequestConfiguration.Banner;
        if (z) {
            e00Var = e00.d;
        } else if (bidderTokenRequestConfiguration instanceof BidderTokenRequestConfiguration.Interstitial) {
            e00Var = e00.e;
        } else if (bidderTokenRequestConfiguration instanceof BidderTokenRequestConfiguration.Rewarded) {
            e00Var = e00.f;
        } else if (bidderTokenRequestConfiguration instanceof BidderTokenRequestConfiguration.Native) {
            e00Var = e00.g;
        } else {
            if (!(bidderTokenRequestConfiguration instanceof BidderTokenRequestConfiguration.AppOpenAd)) {
                throw new NoWhenBranchMatchedException();
            }
            e00Var = e00.i;
        }
        dp dpVar = new dp(e00Var, (!z || (bannerAdSize = bidderTokenRequestConfiguration.getBannerAdSize()) == null) ? null : com.yandex.mobile.ads.banner.a.a(bannerAdSize).a, bidderTokenRequestConfiguration.getParameters());
        y10 y10Var = new y10(mv3Var.a());
        vhn0 a = whn0.a();
        bdn bdnVar = bdn.a;
        hpj a2 = zvj.a(d.a.a(a, wgl.c).plus(y10Var));
        Context applicationContext = context.getApplicationContext();
        w5 w5Var = new w5();
        mm0 a3 = lm0.a(applicationContext);
        rd rdVar = new rd();
        myc0.h(a2, null, null, new lu2(new mu2(a2, applicationContext, w5Var, a3, rdVar, new dw2(applicationContext, mv3Var, a2, w5Var, a3, rdVar, 4194240), q53.a(), new eu2(w5Var), new ob2(w5Var, mv3Var.a())), dpVar, as3Var, null), 3);
    }
}
