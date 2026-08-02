package xsna;

/* compiled from: OneVideoImageLoader.kt */
/* loaded from: classes17.dex */
public final class il80 implements gq9 {
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c a;

    public il80(io.reactivex.rxjava3.disposables.c cVar) {
        this.a = cVar;
    }

    @Override // xsna.gq9
    public final void cancel() {
        this.a.dispose();
    }
}
