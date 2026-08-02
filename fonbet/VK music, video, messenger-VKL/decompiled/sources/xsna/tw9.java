package xsna;

import androidx.lifecycle.Lifecycle;
import xsna.gkj;

/* compiled from: CartEventsManagerImpl.kt */
/* loaded from: classes18.dex */
public final class tw9 implements rw9 {
    public gkj.d a;
    public final io.reactivex.rxjava3.disposables.b b;
    public final io.reactivex.rxjava3.disposables.c c;
    public final io.reactivex.rxjava3.disposables.c d;

    /* compiled from: CartEventsManagerImpl.kt */
    public final class a implements androidx.lifecycle.l {
        public a() {
        }

        @Override // androidx.lifecycle.l
        public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                tw9 tw9Var = tw9.this;
                tw9Var.a = null;
                tw9Var.b.dispose();
            }
        }
    }

    public tw9(f5z f5zVar, fy00 fy00Var) {
        a aVar = new a();
        io.reactivex.rxjava3.core.w b = io.reactivex.rxjava3.android.schedulers.a.b();
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.b = bVar;
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.y(hg1.c(fy00Var.a().a0(b), hu00.class, gu00.class, iu00.class).U(new tt0(new jt(7), 6)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new f60(new za(this, 17), 9));
        this.c = subscribe;
        io.reactivex.rxjava3.disposables.c subscribe2 = hg1.c(fy00Var.a().a0(b), fu00.class).subscribe(new com.vk.im.ui.components.dialogs_list.b(new g60(this, 16), 10));
        this.d = subscribe2;
        f5zVar.getLifecycle().addObserver(aVar);
        bVar.b(subscribe);
        bVar.b(subscribe2);
    }

    @Override // xsna.rw9
    public final void a(gkj.d dVar) {
        this.a = dVar;
    }
}
