package xsna;

/* compiled from: JobScheduler.java */
/* loaded from: classes12.dex */
public final class lyx implements Runnable {
    public final /* synthetic */ myx b;

    public lyx(myx myxVar) {
        this.b = myxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        myx myxVar = this.b;
        myxVar.a.execute(myxVar.c);
    }
}
