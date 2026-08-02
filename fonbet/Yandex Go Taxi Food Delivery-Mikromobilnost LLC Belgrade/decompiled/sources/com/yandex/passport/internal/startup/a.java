package com.yandex.passport.internal.startup;

import androidx.lifecycle.DefaultLifecycleObserver;
import com.yandex.passport.internal.methods.requester.f;
import defpackage.pey;
import defpackage.tje;

/* loaded from: classes15.dex */
public final class a implements DefaultLifecycleObserver {
    public final /* synthetic */ f a;

    public a(f fVar) {
        this.a = fVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(pey peyVar) {
        tje.N(b.d, null, null, new HostProcessForegroundObserver$start$1$2$1$onStart$1(this.a, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(pey peyVar) {
        tje.N(b.d, null, null, new HostProcessForegroundObserver$start$1$2$1$onStop$1(this.a, null), 3);
    }
}
