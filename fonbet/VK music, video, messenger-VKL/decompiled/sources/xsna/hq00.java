package xsna;

import com.vkontakte.android.R;
import kotlin.Lazy;

/* compiled from: MarketAdsItemOverlayRedesignRenderLayer.kt */
/* loaded from: classes17.dex */
public final class hq00 implements kq00 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final vv0 d;

    public hq00(Lazy lazy, Lazy lazy2, Lazy lazy3, vv0 vv0Var) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = vv0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.eq00>] */
    @Override // xsna.kq00
    public final Lazy<eq00> a() {
        return this.a;
    }

    @Override // xsna.kq00
    public final int b() {
        this.d.invoke();
        return Integer.valueOf(R.layout.fullscreen_market_ads_item_controls_redesign).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.dq00>] */
    @Override // xsna.kq00
    public final Lazy<dq00> c() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.iq00>] */
    @Override // xsna.kq00
    public final Lazy<iq00> getRenderer() {
        return this.b;
    }
}
