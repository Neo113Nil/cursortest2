package yads;

import java.util.List;

/* loaded from: classes10.dex */
public final class vp0 implements v53 {
    public final long b;
    public final s51 c;

    public vp0(long j, tn2 tn2Var) {
        this.b = j;
        this.c = tn2Var;
    }

    @Override // yads.v53
    public final int a() {
        return 1;
    }

    @Override // yads.v53
    public final List b(long j) {
        if (j >= this.b) {
            return this.c;
        }
        p51 p51Var = s51.c;
        return tn2.f;
    }

    @Override // yads.v53
    public final long a(int i) {
        if (i == 0) {
            return this.b;
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.v53
    public final int a(long j) {
        return this.b > j ? 0 : -1;
    }
}
