package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: DisposableSubLifecycleOwner.kt */
/* loaded from: classes5.dex */
public final class vgn implements f5z {
    public final Lifecycle b;
    public final androidx.lifecycle.m c;
    public final a d;
    public final androidx.lifecycle.m e;

    /* compiled from: DisposableSubLifecycleOwner.kt */
    public static final class a implements androidx.lifecycle.l {
        public a() {
        }

        @Override // androidx.lifecycle.l
        public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
            vgn.this.c.c(event);
            if (event == Lifecycle.Event.ON_DESTROY) {
                f5zVar.getLifecycle().removeObserver(this);
            }
        }
    }

    public vgn(f5z f5zVar) {
        Lifecycle lifecycle = f5zVar.getLifecycle();
        this.b = lifecycle;
        androidx.lifecycle.m mVar = new androidx.lifecycle.m(this, true);
        mVar.e(lifecycle.getCurrentState());
        this.c = mVar;
        a aVar = new a();
        this.d = aVar;
        lifecycle.addObserver(aVar);
        this.e = mVar;
    }

    @Override // xsna.f5z
    public final Lifecycle getLifecycle() {
        return this.e;
    }
}
