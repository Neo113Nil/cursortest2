package androidx.lifecycle;

/* loaded from: classes10.dex */
public final class j0 implements Runnable {
    public final /* synthetic */ Lifecycle a;
    public final /* synthetic */ l0 b;

    public j0(Lifecycle lifecycle, l0 l0Var) {
        this.a = lifecycle;
        this.b = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
