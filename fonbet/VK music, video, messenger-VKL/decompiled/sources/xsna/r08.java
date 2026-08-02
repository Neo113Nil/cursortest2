package xsna;

import java.util.LinkedHashMap;

/* compiled from: BookmarksManagerObservableImpl.kt */
/* loaded from: classes18.dex */
public final class r08 implements q08 {
    public final fy00 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final io.reactivex.rxjava3.core.w c = io.reactivex.rxjava3.android.schedulers.a.b();

    public r08(fy00 fy00Var) {
        this.a = fy00Var;
    }

    @Override // xsna.q08
    public final void a(Object obj) {
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.b.remove(obj);
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.q08
    public final void b(Object obj, x8a x8aVar) {
        this.b.put(obj, new io.reactivex.rxjava3.internal.operators.observable.y(hg1.c(this.a.a().a0(this.c), hy00.class).U(new q7(new ht(7), 6)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new bn3(new r7(x8aVar, 12), 3)));
    }
}
