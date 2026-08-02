package com.yandex.plus.home.api.lifecycle;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.plus.home.api.lifecycle.ActivityLifecycle;
import defpackage.d40;
import defpackage.fdy;
import defpackage.pey;

/* loaded from: classes8.dex */
public final class b extends ActivityLifecycle {
    public final pey d;
    public final fdy e = new fdy(2, this);

    public b(ComponentActivity componentActivity) {
        this.d = componentActivity;
    }

    @Override // com.yandex.plus.home.api.lifecycle.ActivityLifecycle
    public final void a(d40 d40Var) {
        if (this.b.isEmpty()) {
            pey peyVar = this.d;
            Lifecycle.State b = peyVar.getLifecycle().b();
            b(b.a(Lifecycle.State.RESUMED) ? ActivityLifecycle.LifecycleState.RESUMED : b.a(Lifecycle.State.STARTED) ? ActivityLifecycle.LifecycleState.STARTED : ActivityLifecycle.LifecycleState.UNDEFINED);
            peyVar.getLifecycle().a(this.e);
        }
        super.a(d40Var);
    }

    @Override // com.yandex.plus.home.api.lifecycle.ActivityLifecycle
    public final void d(d40 d40Var) {
        super.d(d40Var);
        if (this.b.isEmpty()) {
            this.d.getLifecycle().d(this.e);
        }
    }
}
