package com.yandex.go.sdk_registry;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.sdk_registry.api.SdkLifecycleStage;
import defpackage.jy60;
import defpackage.lz60;
import defpackage.tje;
import defpackage.tse;
import defpackage.vw60;

/* loaded from: classes13.dex */
public final class b implements vw60, jy60, lz60 {
    public final com.yandex.go.sdk_registry.runtime.b a;
    public final Lifecycle b;
    public final tse c;

    public b(com.yandex.go.sdk_registry.runtime.b bVar, Lifecycle lifecycle, tse tseVar) {
        this.a = bVar;
        this.b = lifecycle;
        this.c = tseVar;
    }

    @Override // defpackage.vw60
    public final void c() {
        tje.N(this.c, null, null, new SdkRegistryActivityLifecycleInitializer$initializeStage$1(this, SdkLifecycleStage.ACTIVITY_CREATED, null), 3);
    }

    @Override // defpackage.lz60
    public final void g() {
        tje.N(this.c, null, null, new SdkRegistryActivityLifecycleInitializer$initializeStage$1(this, SdkLifecycleStage.LCP, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "SdkRegistryActivityLifecycleInitializer";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.c, null, null, new SdkRegistryActivityLifecycleInitializer$initializeStage$1(this, SdkLifecycleStage.FCP, null), 3);
    }
}
