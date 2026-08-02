package xsna;

import com.facebook.common.internal.ImmutableMap;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DiskCachesStoreFactory.kt */
/* loaded from: classes12.dex */
public final class gbn implements fbn {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public gbn(hbn hbnVar) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        int i = 6;
        this.a = msy.a(lazyThreadSafetyMode, new m2j(hbnVar, i));
        this.b = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.k(i, this, hbnVar));
        this.c = msy.a(lazyThreadSafetyMode, new tvj(hbnVar, i));
        this.d = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.m(i, this, hbnVar));
        this.e = msy.a(lazyThreadSafetyMode, new ozf(hbnVar, this));
        this.f = msy.a(lazyThreadSafetyMode, new ww(9, this, hbnVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fbn
    public final y7r a() {
        return (y7r) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fbn
    public final ym8 b() {
        return (ym8) this.b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fbn
    public final y7r c() {
        return (y7r) this.a.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fbn
    public final ym8 d() {
        return (ym8) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fbn
    public final ImmutableMap<String, ym8> e() {
        return (ImmutableMap) this.f.getValue();
    }
}
