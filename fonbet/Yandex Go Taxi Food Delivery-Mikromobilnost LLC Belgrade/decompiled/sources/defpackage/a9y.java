package defpackage;

import java.util.TreeSet;

/* loaded from: classes.dex */
public final class a9y implements ib7 {
    public final long a;
    public final TreeSet b = new TreeSet(new o2f(4));
    public long c;

    public a9y(long j) {
        this.a = j;
    }

    @Override // defpackage.ib7
    public final void onCacheInitialized() {
    }

    @Override // defpackage.oa7
    public final void onSpanAdded(ra7 ra7Var, lc7 lc7Var) {
        TreeSet treeSet = this.b;
        treeSet.add(lc7Var);
        this.c += lc7Var.c;
        eds0 eds0Var = (eds0) ra7Var;
        while (this.c > this.a && !treeSet.isEmpty()) {
            eds0Var.removeSpan((lc7) treeSet.first());
        }
    }

    @Override // defpackage.oa7
    public final void onSpanRemoved(ra7 ra7Var, lc7 lc7Var) {
        this.b.remove(lc7Var);
        this.c -= lc7Var.c;
    }

    @Override // defpackage.oa7
    public final void onSpanTouched(ra7 ra7Var, lc7 lc7Var, lc7 lc7Var2) {
        onSpanRemoved(ra7Var, lc7Var);
        onSpanAdded(ra7Var, lc7Var2);
    }

    @Override // defpackage.ib7
    public final void onStartFile(ra7 ra7Var, String str, long j, long j2) {
        if (j2 != -1) {
            eds0 eds0Var = (eds0) ra7Var;
            while (this.c + j2 > this.a) {
                TreeSet treeSet = this.b;
                if (treeSet.isEmpty()) {
                    return;
                } else {
                    eds0Var.removeSpan((lc7) treeSet.first());
                }
            }
        }
    }

    @Override // defpackage.ib7
    public final boolean requiresCacheSpanTouches() {
        return true;
    }
}
