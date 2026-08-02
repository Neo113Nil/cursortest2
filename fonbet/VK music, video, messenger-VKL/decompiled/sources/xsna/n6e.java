package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: ClipsFeedEngineLifeCycleOwner.kt */
/* loaded from: classes17.dex */
public final class n6e implements androidx.lifecycle.l {
    public final /* synthetic */ o6e b;

    public n6e(o6e o6eVar) {
        this.b = o6eVar;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        this.b.c(event, f5zVar.getLifecycle().getCurrentState());
    }
}
