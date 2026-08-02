package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.Creative;
import com.yandex.mobile.ads.common.VideoController;
import defpackage.dj61;
import defpackage.fe81;
import defpackage.fk61;
import defpackage.i171;
import defpackage.n291;
import defpackage.tcc;
import defpackage.xn61;
import defpackage.yd81;
import defpackage.zi61;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import yads.oa1;
import yads.xz;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/yandex/mobile/ads/banner/BannerAdView;", "Lyads/oa1;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yandex/mobile/ads/common/AdRequest;", "adRequest", "Lzy11;", "loadAd", "(Lcom/yandex/mobile/ads/common/AdRequest;)V", "Lcom/yandex/mobile/ads/banner/BannerAdEventListener;", "bannerAdEventListener", "setBannerAdEventListener", "(Lcom/yandex/mobile/ads/banner/BannerAdEventListener;)V", "Lcom/yandex/mobile/ads/banner/BannerAdSize;", "adSize", "setAdSize", "(Lcom/yandex/mobile/ads/banner/BannerAdSize;)V", "destroy", "()V", "Lcom/yandex/mobile/ads/common/VideoController;", "n", "Lcom/yandex/mobile/ads/common/VideoController;", "getVideoController", "()Lcom/yandex/mobile/ads/common/VideoController;", "videoController", "getAdSize", "()Lcom/yandex/mobile/ads/banner/BannerAdSize;", "Lcom/yandex/mobile/ads/common/AdInfo;", "getAdInfo", "()Lcom/yandex/mobile/ads/common/AdInfo;", "adInfo", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BannerAdView extends oa1 {
    private final i171 l;
    private final zi61 m;

    /* renamed from: n, reason: from kotlin metadata */
    private final VideoController videoController;

    public BannerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, new fe81(xz.d), new n291(context));
        this.l = new i171();
        this.m = new zi61();
        this.videoController = new VideoController(d());
    }

    @Override // yads.oa1
    public void destroy() {
        super.destroy();
    }

    public final AdInfo getAdInfo() {
        yd81 c = c();
        this.m.getClass();
        String str = c.a;
        String str2 = c.b;
        String str3 = c.c;
        List<xn61> list = c.d;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (xn61 xn61Var : list) {
            String str4 = null;
            String str5 = xn61Var != null ? xn61Var.a : null;
            String str6 = xn61Var != null ? xn61Var.b : null;
            String str7 = xn61Var != null ? xn61Var.c : null;
            if (xn61Var != null) {
                str4 = xn61Var.d;
            }
            arrayList.add(new Creative(str5, str6, str7, str4));
        }
        return new AdInfo(str, str2, str3, arrayList);
    }

    public final BannerAdSize getAdSize() {
        fk61 b = b();
        if (b != null) {
            return new BannerAdSize(b.a);
        }
        return null;
    }

    public final VideoController getVideoController() {
        return this.videoController;
    }

    public final void loadAd(AdRequest adRequest) {
        throw null;
    }

    public final void setAdSize(BannerAdSize adSize) {
        a(a.a(adSize));
    }

    public final void setBannerAdEventListener(BannerAdEventListener bannerAdEventListener) {
        a(bannerAdEventListener != null ? new dj61() : null);
    }

    public BannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerAdView(Context context) {
        this(context, null);
    }
}
