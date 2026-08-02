package com.yandex.mobile.ads.common;

import android.content.Context;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.banner.a;
import defpackage.a081;
import defpackage.a271;
import defpackage.ij81;
import defpackage.k171;
import defpackage.n291;
import defpackage.p471;
import defpackage.tje;
import defpackage.u981;
import defpackage.w511;
import java.util.Map;
import kotlin.Metadata;
import yads.qr2;
import yads.xz;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/mobile/ads/common/BidderTokenLoader;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/yandex/mobile/ads/common/BidderTokenRequest;", "request", "Lcom/yandex/mobile/ads/common/BidderTokenLoadListener;", "listener", "Lzy11;", "loadBidderToken", "(Lcom/yandex/mobile/ads/common/BidderTokenRequest;Lcom/yandex/mobile/ads/common/BidderTokenLoadListener;)V", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BidderTokenLoader {
    private final Context a;

    public BidderTokenLoader(Context context) {
        this.a = context;
    }

    public final void loadBidderToken(BidderTokenRequest request, BidderTokenLoadListener listener) {
        xz xzVar;
        n291 n291Var = new n291(this.a);
        k171 k171Var = new k171(listener);
        int i = p471.a[request.getAdType().ordinal()];
        if (i == 1) {
            xzVar = xz.d;
        } else if (i == 2) {
            xzVar = xz.e;
        } else if (i == 3) {
            xzVar = xz.f;
        } else if (i == 4) {
            xzVar = xz.g;
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            xzVar = xz.i;
        }
        BannerAdSize bannerAdSize = request.getBannerAdSize();
        a271 a271Var = bannerAdSize != null ? a.a(bannerAdSize).a : null;
        Map<String, String> parameters = request.getParameters();
        if (a081.g == null) {
            synchronized (a081.f) {
                if (a081.g == null) {
                    a081.g = new a081();
                }
            }
        }
        a081.b();
        ij81 ij81Var = new ij81(xzVar, a271Var, parameters);
        u981 u981Var = new u981(this.a, n291Var);
        tje.N(u981Var.a, null, null, new qr2(u981Var, ij81Var, k171Var, null), 3);
    }
}
