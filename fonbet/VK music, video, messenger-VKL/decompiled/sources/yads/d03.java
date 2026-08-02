package yads;

/* loaded from: classes10.dex */
public final class d03 extends Thread {
    public final /* synthetic */ e03 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d03(j03 j03Var) {
        super("ExoPlayer:SimpleDecoder");
        this.b = j03Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        e03 e03Var = this.b;
        e03Var.getClass();
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (e03Var.e());
    }
}
