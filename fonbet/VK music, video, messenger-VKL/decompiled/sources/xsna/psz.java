package xsna;

import xsna.drz;
import xsna.frz;

/* compiled from: LoaderStub.kt */
/* loaded from: classes3.dex */
public final class psz<Data extends frz> implements drz<Data> {
    public final io.reactivex.rxjava3.subjects.d a;

    public psz(xrm xrmVar) {
        this.a = io.reactivex.rxjava3.subjects.d.O0(new drz.a(xrmVar, false));
    }

    @Override // xsna.drz
    public final io.reactivex.rxjava3.core.q<drz.a<Data>> getState() {
        return this.a;
    }

    @Override // xsna.drz
    public final void onDestroy() {
    }

    @Override // xsna.drz
    public final void a(int i) {
    }

    @Override // xsna.drz
    public final void b(String str) {
    }
}
