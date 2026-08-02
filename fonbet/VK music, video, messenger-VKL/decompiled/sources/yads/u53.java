package yads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class u53 implements v53 {
    public final o20[] b;
    public final long[] c;

    public u53(o20[] o20VarArr, long[] jArr) {
        this.b = o20VarArr;
        this.c = jArr;
    }

    @Override // yads.v53
    public final long a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        long[] jArr = this.c;
        if (i < jArr.length) {
            return jArr[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.v53
    public final List b(long j) {
        o20 o20Var;
        int b = mc3.b(this.c, j, false);
        return (b == -1 || (o20Var = this.b[b]) == o20.s) ? Collections.EMPTY_LIST : Collections.singletonList(o20Var);
    }

    @Override // yads.v53
    public final int a() {
        return this.c.length;
    }

    @Override // yads.v53
    public final int a(long j) {
        int a = mc3.a(this.c, j, false);
        if (a < this.c.length) {
            return a;
        }
        return -1;
    }
}
