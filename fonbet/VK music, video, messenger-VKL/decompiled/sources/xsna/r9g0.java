package xsna;

import java.util.TreeSet;

/* compiled from: ResizableLeastRecentlyUsedCacheEvictor.kt */
/* loaded from: classes3.dex */
public final class r9g0 implements androidx.media3.datasource.cache.b {
    public final TreeSet<qx8> a = new TreeSet<>(new q9g0());
    public long b;
    public final long c;

    /* compiled from: ResizableLeastRecentlyUsedCacheEvictor.kt */
    public static final class a {
    }

    public r9g0(long j) {
        this.c = j;
    }

    @Override // androidx.media3.datasource.cache.b
    public final boolean a() {
        return true;
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public final void b(androidx.media3.datasource.cache.c cVar, qpj0 qpj0Var, qpj0 qpj0Var2) {
        c(cVar, qpj0Var);
        e(cVar, qpj0Var2);
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public final void c(androidx.media3.datasource.cache.c cVar, qx8 qx8Var) {
        this.a.remove(qx8Var);
        this.b -= qx8Var.d;
    }

    @Override // androidx.media3.datasource.cache.b
    public final void d(androidx.media3.datasource.cache.c cVar, String str, long j, long j2) {
        if (j2 != -1) {
            while (this.b + j2 > this.c) {
                TreeSet<qx8> treeSet = this.a;
                if (treeSet.isEmpty()) {
                    return;
                } else {
                    cVar.p(treeSet.first());
                }
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public final void e(androidx.media3.datasource.cache.c cVar, qpj0 qpj0Var) {
        TreeSet<qx8> treeSet = this.a;
        treeSet.add(qpj0Var);
        this.b += qpj0Var.d;
        while (this.b > this.c && !treeSet.isEmpty()) {
            cVar.p(treeSet.first());
        }
    }

    @Override // androidx.media3.datasource.cache.b
    public final void onCacheInitialized() {
    }
}
