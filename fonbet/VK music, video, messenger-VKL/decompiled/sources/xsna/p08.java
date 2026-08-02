package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: BookmarksManagerImpl.kt */
/* loaded from: classes18.dex */
public final class p08 implements m08 {
    public l08 a;
    public final io.reactivex.rxjava3.disposables.c b;

    /* compiled from: BookmarksManagerImpl.kt */
    public final class a implements androidx.lifecycle.l {
        public a() {
        }

        @Override // androidx.lifecycle.l
        public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                p08 p08Var = p08.this;
                p08Var.a = null;
                p08Var.b.dispose();
            }
        }
    }

    public p08(f5z f5zVar, fy00 fy00Var) {
        a aVar = new a();
        this.b = new io.reactivex.rxjava3.internal.operators.observable.y(hg1.c(fy00Var.a().a0(io.reactivex.rxjava3.android.schedulers.a.b()), hy00.class).U(new n7(new vt1(3), 6)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new b60(new gr3(this, 4), 6));
        f5zVar.getLifecycle().addObserver(aVar);
    }

    @Override // xsna.m08
    public final void a(l08 l08Var) {
        this.a = l08Var;
    }
}
