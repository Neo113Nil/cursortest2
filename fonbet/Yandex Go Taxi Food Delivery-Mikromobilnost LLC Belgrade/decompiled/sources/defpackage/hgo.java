package defpackage;

/* loaded from: classes9.dex */
public final class hgo extends igo {
    public final Runnable c;

    public hgo(long j, Runnable runnable) {
        super(j);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // defpackage.igo
    public final String toString() {
        return super.toString() + this.c;
    }
}
