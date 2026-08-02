package xsna;

/* compiled from: DisposableExtensions.kt */
/* loaded from: classes3.dex */
public final class mgn implements fq9 {
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c a;

    public mgn(io.reactivex.rxjava3.disposables.c cVar) {
        this.a = cVar;
    }

    @Override // xsna.fq9
    public final void cancel() {
        this.a.dispose();
    }
}
