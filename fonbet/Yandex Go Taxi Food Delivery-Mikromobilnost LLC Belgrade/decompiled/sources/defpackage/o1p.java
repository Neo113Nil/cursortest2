package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes15.dex */
public final class o1p implements DefaultLifecycleObserver {
    public final /* synthetic */ q7w0 a;
    public final /* synthetic */ Lifecycle b;

    public o1p(q7w0 q7w0Var, x1p x1pVar) {
        this.a = q7w0Var;
        this.b = x1pVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        this.b.d(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
        this.a.onPause();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
        this.a.onResume();
    }
}
