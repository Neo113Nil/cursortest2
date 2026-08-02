package com.yandex.go.sdk_registry;

import androidx.lifecycle.Lifecycle;
import defpackage.hnp0;
import defpackage.tls;
import defpackage.tse;

/* loaded from: classes13.dex */
public final class a implements hnp0 {
    public final Lifecycle a;
    public final tse b;

    public a(Lifecycle lifecycle, tse tseVar) {
        this.a = lifecycle;
        this.b = tseVar;
    }

    public final void a(tls tlsVar) {
        com.yandex.go.coroutines.b.g(this.b, null, null, new AndroidSdkHostLifecycleAdapter$repeatOnResumed$1(this, tlsVar, null), 3);
    }
}
