package xsna;

import com.vkontakte.android.R;
import kotlin.Lazy;

/* compiled from: StaticAdsItemOverlayDefaultRenderLayer.kt */
/* loaded from: classes17.dex */
public final class cwk0 implements hwk0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final d14 d;

    public cwk0(Lazy lazy, Lazy lazy2, Lazy lazy3, d14 d14Var) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = d14Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.gwk0>] */
    @Override // xsna.hwk0
    public final Lazy<gwk0> a() {
        return this.a;
    }

    @Override // xsna.hwk0
    public final int b() {
        this.d.invoke();
        return Integer.valueOf(R.layout.fullscreen_static_ads_item_controls).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.zvk0>] */
    @Override // xsna.hwk0
    public final Lazy<zvk0> c() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.dwk0>] */
    @Override // xsna.hwk0
    public final Lazy<dwk0> getRenderer() {
        return this.b;
    }
}
