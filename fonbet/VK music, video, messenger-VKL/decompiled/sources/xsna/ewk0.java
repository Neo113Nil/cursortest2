package xsna;

import com.vkontakte.android.R;
import kotlin.Lazy;

/* compiled from: StaticAdsItemOverlayRedesignRenderLayer.kt */
/* loaded from: classes17.dex */
public final class ewk0 implements hwk0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final w9 d;

    public ewk0(Lazy lazy, Lazy lazy2, Lazy lazy3, w9 w9Var) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = w9Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.gwk0>] */
    @Override // xsna.hwk0
    public final Lazy<gwk0> a() {
        return this.a;
    }

    @Override // xsna.hwk0
    public final int b() {
        this.d.invoke();
        return Integer.valueOf(R.layout.fullscreen_static_ads_item_controls_redesign).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.awk0>] */
    @Override // xsna.hwk0
    public final Lazy<awk0> c() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.fwk0>] */
    @Override // xsna.hwk0
    public final Lazy<fwk0> getRenderer() {
        return this.b;
    }
}
