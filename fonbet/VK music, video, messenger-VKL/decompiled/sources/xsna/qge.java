package xsna;

import java.util.ArrayList;
import xsna.c63;
import xsna.pge;

/* compiled from: ClipsInterestsInteractorImpl.kt */
/* loaded from: classes16.dex */
public final class qge implements pge {
    public final qhe a;
    public final eie b;
    public io.reactivex.rxjava3.disposables.c c;
    public io.reactivex.rxjava3.disposables.c d;
    public final ArrayList e = new ArrayList();

    /* compiled from: ClipsInterestsInteractorImpl.kt */
    public static final class a extends c63.b {
        public final io.reactivex.rxjava3.disposables.c b;

        public a(io.reactivex.rxjava3.disposables.c cVar) {
            this.b = cVar;
        }

        @Override // xsna.c63.b
        public final void w() {
            c63 c63Var = c63.a;
            c63.c(this);
            this.b.dispose();
        }
    }

    public qge(qhe qheVar, eie eieVar) {
        this.a = qheVar;
        this.b = eieVar;
    }

    @Override // xsna.pge
    public final void a(pge.a aVar) {
        this.e.remove(aVar);
    }

    @Override // xsna.pge
    public final void b(pge.a aVar) {
        this.e.add(aVar);
    }

    @Override // xsna.pge
    public final void c() {
        qhe qheVar = this.a;
        qheVar.f();
        c63.a(new a(qheVar.d().subscribe()));
    }

    @Override // xsna.pge
    public final io.reactivex.rxjava3.internal.operators.single.s d() {
        return new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.completable.m(new jm9(this, 1)).e(this.a.c()), new pa(new ay0(this, 25), 10));
    }
}
