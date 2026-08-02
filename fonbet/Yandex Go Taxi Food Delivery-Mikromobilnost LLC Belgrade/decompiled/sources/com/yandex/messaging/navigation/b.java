package com.yandex.messaging.navigation;

import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.hjt;
import defpackage.pey;
import defpackage.tje;

/* loaded from: classes15.dex */
public final class b implements DefaultLifecycleObserver {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        c cVar = this.a;
        cVar.b.getClass();
        tje.N(hjt.a, cVar.c.b, null, new MessengerFragmentScope$DestroyObserver$onDestroy$1(cVar, null), 2);
    }
}
