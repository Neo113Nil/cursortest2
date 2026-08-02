package xsna;

/* compiled from: AutoDisposableDelegate.kt */
/* loaded from: classes7.dex */
public final class af5 extends wq70<io.reactivex.rxjava3.disposables.c> {
    @Override // xsna.wq70
    public final void afterChange(qcy qcyVar, io.reactivex.rxjava3.disposables.c cVar, io.reactivex.rxjava3.disposables.c cVar2) {
        io.reactivex.rxjava3.disposables.c cVar3 = cVar;
        if (cVar3 != null) {
            cVar3.dispose();
        }
    }
}
