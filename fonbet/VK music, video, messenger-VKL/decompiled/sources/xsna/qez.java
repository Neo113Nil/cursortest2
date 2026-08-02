package xsna;

/* compiled from: ListFuture.java */
/* loaded from: classes11.dex */
public final class qez implements Runnable {
    public final /* synthetic */ sez b;

    public qez(sez sezVar) {
        this.b = sezVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sez sezVar = this.b;
        sezVar.c = null;
        sezVar.b = null;
    }
}
