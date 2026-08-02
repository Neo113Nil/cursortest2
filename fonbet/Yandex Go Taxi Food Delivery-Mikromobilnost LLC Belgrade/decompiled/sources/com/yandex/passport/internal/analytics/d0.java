package com.yandex.passport.internal.analytics;

import androidx.lifecycle.Lifecycle;
import defpackage.oey;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d0 implements oey {
    public final t a;
    public final Map b;
    public final a0 c = new a0(1, this);

    public d0(t tVar, Map map) {
        this.a = tVar;
        this.b = map;
    }

    @androidx.lifecycle.w(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        this.a.b.add(this.c);
    }

    @androidx.lifecycle.w(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.a.b.remove(this.c);
    }
}
