package yads;

/* loaded from: classes10.dex */
public final class ye0 implements Comparable {
    public final boolean b;
    public final boolean c;

    public ye0(int i, nx0 nx0Var) {
        this.b = (nx0Var.e & 1) != 0;
        this.c = if0.a(false, i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ye0 ye0Var = (ye0) obj;
        return fy.a(lq.a(this.c, ye0Var.c)).a(this.b, ye0Var.b).a();
    }
}
