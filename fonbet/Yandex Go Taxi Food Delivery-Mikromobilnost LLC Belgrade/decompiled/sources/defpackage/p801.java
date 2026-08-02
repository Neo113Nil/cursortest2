package defpackage;

/* loaded from: classes10.dex */
public final class p801 {
    public final long a;
    public final long b;
    public final boolean c;

    public p801(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final p801 a(p801 p801Var) {
        return new p801(wu60.f(this.a, p801Var.a), Math.max(this.b, p801Var.b), this.c || p801Var.c);
    }
}
