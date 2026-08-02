package com.yandex.go.scooters.domain;

import android.content.Context;
import defpackage.cwn0;
import defpackage.qxm0;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes13.dex */
public final class j0 implements cwn0 {
    public final Context a;
    public final tse b;
    public final qxm0 c;
    public volatile boolean d;

    public j0(Context context, tse tseVar, qxm0 qxm0Var) {
        this.a = context;
        this.b = tseVar;
        this.c = qxm0Var;
    }

    @Override // defpackage.cwn0
    public final void b() {
        if (this.d) {
            return;
        }
        tje.N(this.b, null, null, new ScootersWearOsAnalyticsLifecycleInteractor$onLaunch$1(this, null), 3);
    }

    @Override // defpackage.cwn0
    public final void onDismiss() {
    }
}
