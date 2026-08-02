package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: EasterEggsUi.kt */
/* loaded from: classes14.dex */
public final class mvo implements androidx.lifecycle.l {
    public final /* synthetic */ sq9 b;

    public mvo(sq9 sq9Var) {
        this.b = sq9Var;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.b.cancel();
        }
    }
}
