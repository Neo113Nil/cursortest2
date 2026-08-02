package xsna;

import com.vk.cachecontrol.api.CacheTarget;

/* compiled from: CacheContainerWithMultiAccountTagImpl.kt */
/* loaded from: classes.dex */
public final class sv8 implements rv8 {
    public final CacheTarget b;
    public final String c;
    public final gzs<Long> d;
    public final izs<Boolean, s3q0> e;

    /* JADX WARN: Multi-variable type inference failed */
    public sv8(CacheTarget cacheTarget, String str, gzs<Long> gzsVar, izs<? super Boolean, s3q0> izsVar) {
        this.b = cacheTarget;
        this.c = str;
        this.d = gzsVar;
        this.e = izsVar;
    }

    @Override // xsna.rv8
    public final CacheTarget a() {
        return this.b;
    }

    @Override // xsna.rv8
    public final void b(boolean z) {
        this.e.invoke(Boolean.valueOf(z));
    }

    @Override // xsna.rv8
    public final long e() {
        return this.d.invoke().longValue();
    }

    @Override // xsna.rv8
    public final String getDescription() {
        return this.c;
    }
}
