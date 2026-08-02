package xsna;

import com.vkontakte.android.R;
import kotlin.Lazy;

/* compiled from: MarketAdsItemOverlayDefaultRenderLayer.kt */
/* loaded from: classes17.dex */
public final class fq00 implements kq00 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final fn4 d;

    public fq00(Lazy lazy, Lazy lazy2, Lazy lazy3, fn4 fn4Var) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = fn4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.eq00>] */
    @Override // xsna.kq00
    public final Lazy<eq00> a() {
        return this.a;
    }

    @Override // xsna.kq00
    public final int b() {
        this.d.invoke();
        return Integer.valueOf(R.layout.fullscreen_market_ads_item_controls).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.cq00>] */
    @Override // xsna.kq00
    public final Lazy<cq00> c() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.gq00>] */
    @Override // xsna.kq00
    public final Lazy<gq00> getRenderer() {
        return this.b;
    }
}
