package defpackage;

/* loaded from: classes.dex */
public abstract class j5u0 {
    public long a;
    public j5u0 b;

    public j5u0() {
        this(q2t0.j().g());
    }

    public abstract void a(j5u0 j5u0Var);

    public abstract j5u0 b();

    public j5u0 c(long j) {
        j5u0 b = b();
        b.a = j;
        return b;
    }

    public j5u0(long j) {
        this.a = j;
    }
}
