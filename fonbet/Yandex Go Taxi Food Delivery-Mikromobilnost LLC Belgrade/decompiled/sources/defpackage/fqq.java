package defpackage;

import android.content.Context;
import androidx.lifecycle.DefaultLifecycleObserver;

/* loaded from: classes.dex */
public final class fqq implements DefaultLifecycleObserver {
    public final /* synthetic */ gqq a;
    public final /* synthetic */ Context b;

    public fqq(gqq gqqVar, Context context) {
        this.a = gqqVar;
        this.b = context;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        this.a.c.remove(this.b);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(pey peyVar) {
    }
}
