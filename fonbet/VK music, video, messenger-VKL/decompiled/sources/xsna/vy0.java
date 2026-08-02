package xsna;

import kotlin.Lazy;

/* compiled from: AdsItemOverlayRedesignRenderLayer.kt */
/* loaded from: classes17.dex */
public final class vy0 implements cz0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final gzs<Integer> d;

    public vy0(Lazy<py0> lazy, Lazy<zy0> lazy2, Lazy<b11> lazy3, gzs<Integer> gzsVar) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = gzsVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.py0>] */
    @Override // xsna.cz0
    public final Lazy<py0> a() {
        return this.a;
    }

    @Override // xsna.cz0
    public final int b() {
        return this.d.invoke().intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.b11>] */
    @Override // xsna.cz0
    public final Lazy<b11> c() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.zy0>] */
    @Override // xsna.cz0
    public final Lazy<zy0> getRenderer() {
        return this.b;
    }
}
