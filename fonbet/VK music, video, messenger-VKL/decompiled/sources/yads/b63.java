package yads;

import java.util.List;

/* loaded from: classes10.dex */
public abstract class b63 extends ua0 implements v53 {
    public v53 d;
    public long e;

    @Override // yads.v53
    public final long a(int i) {
        v53 v53Var = this.d;
        v53Var.getClass();
        return v53Var.a(i) + this.e;
    }

    @Override // yads.v53
    public final List b(long j) {
        v53 v53Var = this.d;
        v53Var.getClass();
        return v53Var.b(j - this.e);
    }

    @Override // yads.v53
    public final int a() {
        v53 v53Var = this.d;
        v53Var.getClass();
        return v53Var.a();
    }

    @Override // yads.v53
    public final int a(long j) {
        v53 v53Var = this.d;
        v53Var.getClass();
        return v53Var.a(j - this.e);
    }
}
