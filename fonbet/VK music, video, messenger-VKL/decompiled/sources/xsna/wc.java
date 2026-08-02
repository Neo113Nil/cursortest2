package xsna;

import com.vk.cachecontrol.api.CacheTarget;
import xsna.gx8;

/* compiled from: AbstractCacheContainer.kt */
/* loaded from: classes.dex */
public final class wc implements gx8.a {
    public final CacheTarget b;
    public final String c;
    public final gzs<Long> d;
    public final gzs<s3q0> e;

    public wc(CacheTarget cacheTarget, String str, gzs<Long> gzsVar, gzs<s3q0> gzsVar2) {
        this.b = cacheTarget;
        this.c = str;
        this.d = gzsVar;
        this.e = gzsVar2;
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return this.b;
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        this.e.invoke();
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return this.c;
    }

    @Override // xsna.gx8.a
    public final long u() {
        return this.d.invoke().longValue();
    }
}
