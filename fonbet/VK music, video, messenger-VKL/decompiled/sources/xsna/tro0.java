package xsna;

/* compiled from: Thread.kt */
/* loaded from: classes8.dex */
public final class tro0 extends Thread {
    public final /* synthetic */ x5i b;

    public tro0(x5i x5iVar) {
        this.b = x5iVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.b.invoke();
    }
}
