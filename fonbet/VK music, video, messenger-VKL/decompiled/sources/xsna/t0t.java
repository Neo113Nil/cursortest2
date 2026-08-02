package xsna;

/* compiled from: Futures.java */
/* loaded from: classes11.dex */
public final class t0t implements Runnable {
    public final /* synthetic */ ugz b;

    public t0t(ugz ugzVar) {
        this.b = ugzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.cancel(true);
    }
}
