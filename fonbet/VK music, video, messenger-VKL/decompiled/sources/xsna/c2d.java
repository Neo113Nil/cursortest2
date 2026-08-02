package xsna;

import kotlin.Lazy;

/* compiled from: ClipItemOverlayRedesignRenderLayer.kt */
/* loaded from: classes17.dex */
public final class c2d implements h2d {
    public final Object a;
    public final Object b;
    public final Object c;
    public final gzs<Integer> d;

    public c2d(Lazy<q0d> lazy, Lazy<e2d> lazy2, Lazy<x6d> lazy3, gzs<Integer> gzsVar) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = gzsVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.q0d>] */
    @Override // xsna.h2d
    public final Lazy<q0d> a() {
        return this.a;
    }

    @Override // xsna.h2d
    public final int b() {
        return this.d.invoke().intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.x6d>] */
    @Override // xsna.h2d
    public final Lazy<x6d> c() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy<xsna.e2d>] */
    @Override // xsna.h2d
    public final Lazy<e2d> getRenderer() {
        return this.b;
    }
}
