package xsna;

/* compiled from: ClipsDiskCacheStorage.kt */
/* loaded from: classes3.dex */
public final class crd implements Runnable {
    public final /* synthetic */ dbn b;

    public crd(dbn dbnVar) {
        this.b = dbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.reactivex.rxjava3.subjects.e eVar = frd.a;
        asu0.a.getClass();
        asu0.n().execute(new ard(this.b));
    }
}
