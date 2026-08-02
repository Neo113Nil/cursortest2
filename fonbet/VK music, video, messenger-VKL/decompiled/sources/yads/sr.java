package yads;

/* loaded from: classes10.dex */
public final class sr implements Runnable {
    public final /* synthetic */ qp2 b;
    public final /* synthetic */ tr c;

    public sr(tr trVar, qp2 qp2Var) {
        this.c = trVar;
        this.b = qp2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.c.c.put(this.b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
