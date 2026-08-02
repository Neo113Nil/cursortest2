package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: VKRxExt.kt */
/* loaded from: classes18.dex */
public final class uer0 implements androidx.lifecycle.l {
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c b;

    public uer0(io.reactivex.rxjava3.disposables.c cVar) {
        this.b = cVar;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.b.dispose();
        }
    }
}
