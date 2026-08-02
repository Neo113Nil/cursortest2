package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.common.VideoController;
import java.util.ArrayList;
import java.util.List;
import xsna.c5g;
import yads.br3;
import yads.c00;
import yads.d4;
import yads.e00;
import yads.er3;
import yads.g9;
import yads.gc;
import yads.hq2;
import yads.i00;
import yads.is3;
import yads.j22;
import yads.jm;
import yads.jq2;
import yads.km;
import yads.lm;
import yads.mm;
import yads.mv3;
import yads.oc1;
import yads.pi3;
import yads.si0;
import yads.sm;
import yads.tm;
import yads.w5;
import yads.wc1;
import yads.xr3;

/* loaded from: classes8.dex */
public final class BannerAdView extends wc1 {
    private final er3 k;
    private final tm l;
    private final br3 m;
    private String n;
    private final VideoController o;

    public BannerAdView(Context context) {
        this(context, null);
    }

    @Override // yads.wc1
    public final km a(Context context, d4 d4Var, jm jmVar, w5 w5Var) {
        return new km(context, this, jmVar, w5Var, new pi3(), new mm(), new lm(getSdkEnvironmentModule$mobileads_externalRelease()), new j22(d4Var), new si0());
    }

    @Override // yads.wc1
    public void destroy() {
        super.destroy();
    }

    public final List<Object> getAdAttributes() {
        List<gc> b = b();
        ArrayList arrayList = new ArrayList(c5g.u(b, 10));
        for (gc gcVar : b) {
            this.l.getClass();
            arrayList.add(new sm(gcVar));
        }
        return arrayList;
    }

    public final AdInfo getAdInfo() {
        String str = this.n;
        if (str == null) {
            str = "";
        }
        c00 a = a(str);
        this.m.getClass();
        return br3.a(a);
    }

    public final BannerAdSize getAdSize() {
        i00 c = c();
        if (c != null) {
            return new BannerAdSize(c.a);
        }
        return null;
    }

    public final String getInfo() {
        return d();
    }

    public final VideoController getVideoController() {
        return this.o;
    }

    public final void loadAd(AdRequest adRequest) {
        hq2 hq2Var;
        String str = this.n;
        if (str == null || str.length() <= 0) {
            oc1.a("Failed to load ad with empty ad unit id", new Object[0]);
            return;
        }
        er3 er3Var = this.k;
        er3Var.getClass();
        AdTheme preferredTheme = adRequest.getPreferredTheme();
        if (preferredTheme != null) {
            er3Var.a.getClass();
            hq2Var = jq2.a(preferredTheme);
        } else {
            hq2Var = null;
        }
        hq2 hq2Var2 = hq2Var;
        a(new g9(str, adRequest.getAge(), adRequest.getGender(), adRequest.getContextQuery(), adRequest.getContextTags(), adRequest.getLocation(), adRequest.getParameters(), adRequest.getBiddingData(), null, hq2Var2, false, null));
    }

    public final void setAdSize(BannerAdSize bannerAdSize) {
        a(a.a(bannerAdSize));
    }

    @Override // yads.wc1
    public void setAdUnitId(String str) {
        this.n = str;
        super.setAdUnitId(str);
    }

    public final void setBannerAdEventListener(BannerAdEventListener bannerAdEventListener) {
        a(bannerAdEventListener instanceof ClosableBannerAdEventListener ? new is3((ClosableBannerAdEventListener) bannerAdEventListener) : bannerAdEventListener != null ? new xr3(bannerAdEventListener) : null);
    }

    public BannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, new d4(e00.d), new mv3(context));
        this.k = new er3();
        this.l = new tm();
        this.m = new br3();
        this.o = new VideoController(e());
    }
}
