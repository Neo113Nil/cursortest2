package xsna;

/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public abstract class puk0 {
    public long a;
    public puk0 b;

    public puk0(long j) {
        this.a = j;
    }

    public abstract void a(puk0 puk0Var);

    public abstract puk0 b();

    public puk0 c(long j) {
        puk0 b = b();
        b.a = j;
        return b;
    }

    public puk0() {
        this(qak0.j().g());
    }
}
