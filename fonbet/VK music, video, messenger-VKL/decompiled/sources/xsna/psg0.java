package xsna;

/* compiled from: RxAnimators.kt */
/* loaded from: classes16.dex */
public abstract class psg0 extends io.reactivex.rxjava3.core.q<Float> implements io.reactivex.rxjava3.disposables.c {
    public io.reactivex.rxjava3.observers.a<Long> b;

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        io.reactivex.rxjava3.observers.a<Long> aVar = this.b;
        if (aVar != null) {
            aVar.dispose();
        }
        this.b = null;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        io.reactivex.rxjava3.observers.a<Long> aVar = this.b;
        if (aVar != null) {
            return aVar.h();
        }
        return false;
    }
}
