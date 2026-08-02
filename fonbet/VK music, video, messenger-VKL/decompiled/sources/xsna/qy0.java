package xsna;

import kotlin.Lazy;

/* compiled from: AdsItemOverlayDefaultRenderLayer.kt */
/* loaded from: classes17.dex */
public final class qy0 implements cz0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final gzs<Integer> d;

    public qy0(Lazy<py0> lazy, Lazy<uy0> lazy2, Lazy<w01> lazy3, gzs<Integer> gzsVar) {
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.w01>] */
    @Override // xsna.cz0
    public final Lazy<w01> c() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.uy0>] */
    @Override // xsna.cz0
    public final Lazy<uy0> getRenderer() {
        return this.b;
    }
}
