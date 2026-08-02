package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class k12 implements Comparable {
    public static final k12 w = new k12(Integer.MAX_VALUE, Integer.MAX_VALUE, EmptyList.a);
    public final List a;
    public final int b;
    public final int c;

    public k12(int i, int i2, List list) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k12 k12Var = (k12) obj;
        int q = jl40.q(this.c, k12Var.c);
        return q != 0 ? q : jl40.q(this.b, k12Var.b);
    }
}
