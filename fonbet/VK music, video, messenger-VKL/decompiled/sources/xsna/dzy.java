package xsna;

import java.util.TreeSet;

/* compiled from: LeastRecentlyUsedCacheEvictor.java */
/* loaded from: classes.dex */
public final class dzy implements androidx.media3.datasource.cache.b {
    public final long a;
    public final TreeSet<qx8> b = new TreeSet<>(new czy());
    public long c;

    public dzy(long j) {
        this.a = j;
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
        this.b.remove(qx8Var);
        this.c -= qx8Var.d;
    }

    @Override // androidx.media3.datasource.cache.b
    public final void d(androidx.media3.datasource.cache.c cVar, String str, long j, long j2) {
        if (j2 != -1) {
            while (this.c + j2 > this.a) {
                TreeSet<qx8> treeSet = this.b;
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
        TreeSet<qx8> treeSet = this.b;
        treeSet.add(qpj0Var);
        this.c += qpj0Var.d;
        while (this.c > this.a && !treeSet.isEmpty()) {
            cVar.p(treeSet.first());
        }
    }

    @Override // androidx.media3.datasource.cache.b
    public final void onCacheInitialized() {
    }
}
