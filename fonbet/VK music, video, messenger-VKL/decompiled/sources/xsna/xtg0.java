package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: RxExt.kt */
/* loaded from: classes.dex */
public final class xtg0 implements androidx.lifecycle.l {
    public final /* synthetic */ Object b;

    public xtg0(Object obj) {
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [io.reactivex.rxjava3.disposables.c, java.lang.Object] */
    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.b.dispose();
        }
    }
}
