package xsna;

/* compiled from: PriorityRunnable.kt */
/* loaded from: classes.dex */
public final class ecd0 implements Runnable {
    public static final ccd0 d = new ccd0();
    public static final dcd0 e = new dcd0();
    public final /* synthetic */ qbd0 b;
    public final int c;

    public ecd0(int i, qbd0 qbd0Var) {
        this.b = qbd0Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.run();
    }
}
