package defpackage;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;

/* loaded from: classes.dex */
public final class q0d implements q {
    public final /* synthetic */ ComponentActivity a;

    public q0d(ComponentActivity componentActivity) {
        this.a = componentActivity;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        ComponentActivity componentActivity = this.a;
        componentActivity.ensureViewModelStore();
        componentActivity.getLifecycle().d(this);
    }
}
