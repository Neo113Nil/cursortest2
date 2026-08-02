package yads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import xsna.ifu;

/* loaded from: classes10.dex */
public final class xp3 implements v53 {
    public final List b;
    public final long[] c;
    public final long[] d;

    public xp3(ArrayList arrayList) {
        this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            pp3 pp3Var = (pp3) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.c;
            jArr[i2] = pp3Var.b;
            jArr[i2 + 1] = pp3Var.c;
        }
        long[] jArr2 = this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // yads.v53
    public final long a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        long[] jArr = this.d;
        if (i < jArr.length) {
            return jArr[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.v53
    public final List b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.b.size(); i++) {
            long[] jArr = this.c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                pp3 pp3Var = (pp3) this.b.get(i);
                o20 o20Var = pp3Var.a;
                if (o20Var.f == -3.4028235E38f) {
                    arrayList2.add(pp3Var);
                } else {
                    arrayList.add(o20Var);
                }
            }
        }
        Collections.sort(arrayList2, new ifu(1));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            o20 o20Var2 = ((pp3) arrayList2.get(i3)).a;
            o20Var2.getClass();
            arrayList.add(new o20(o20Var2.b, o20Var2.c, o20Var2.d, o20Var2.e, (-1) - i3, 1, o20Var2.h, o20Var2.i, o20Var2.j, o20Var2.o, o20Var2.p, o20Var2.k, o20Var2.l, o20Var2.m, o20Var2.n, o20Var2.q, o20Var2.r));
        }
        return arrayList;
    }

    @Override // yads.v53
    public final int a() {
        return this.d.length;
    }

    @Override // yads.v53
    public final int a(long j) {
        int a = mc3.a(this.d, j, false);
        if (a < this.d.length) {
            return a;
        }
        return -1;
    }
}
