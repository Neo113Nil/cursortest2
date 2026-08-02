package xsna;

import xsna.hg1;
import xsna.r7q0;

/* compiled from: ArticleEditorUpdateInteractorImpl.kt */
/* loaded from: classes15.dex */
public final class vn3 implements un3 {
    public final ysg0<r7q0> a = new ysg0<>();

    @Override // xsna.un3
    public final io.reactivex.rxjava3.internal.operators.observable.i0 a() {
        io.reactivex.rxjava3.subjects.f<r7q0> fVar = this.a.a;
        hg1.e eVar = new hg1.e();
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, eVar).U(new hg1.d()), new gv(new n82(2), 3));
    }

    @Override // xsna.un3
    public final void b(String str, boolean z) {
        if (z) {
            this.a.a(new r7q0.a(str));
        }
    }
}
