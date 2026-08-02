package xsna;

import xsna.ao50;
import xsna.kj50;

/* compiled from: BaseMviView.kt */
/* loaded from: classes2.dex */
public abstract class ei6<S extends ao50, A extends kj50> implements wn50<S, A> {
    public final io.reactivex.rxjava3.subjects.f<A> a = new io.reactivex.rxjava3.subjects.f<>();

    @Override // xsna.wn50
    public final /* bridge */ /* synthetic */ io.reactivex.rxjava3.subjects.f E() {
        return this.a;
    }

    public final void O(A a) {
        this.a.onNext(a);
    }

    @Override // xsna.wn50
    public void j(yn50 yn50Var) {
    }
}
