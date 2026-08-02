package xsna;

/* compiled from: Tasks.kt */
/* loaded from: classes11.dex */
public final class d6o0 extends b5o0 {
    public final Runnable d;

    public d6o0(long j, Runnable runnable, boolean z) {
        super(j, z);
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.d;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(y6l.a(runnable));
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        return ho8.a(sb, this.c ? "Blocking" : "Non-blocking", ']');
    }
}
