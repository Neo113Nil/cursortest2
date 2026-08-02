package com.yandex.go.sdk_registry;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.sdk_registry.api.SdkLifecycleStage;
import defpackage.g6u;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.ww60;
import defpackage.yw60;

/* loaded from: classes13.dex */
public final class c implements ww60, yw60 {
    public final com.yandex.go.sdk_registry.runtime.b a;
    public final Lifecycle b;
    public final tse c;
    public final g6u d;
    public final String e;

    public c(com.yandex.go.sdk_registry.runtime.b bVar, Lifecycle lifecycle, tse tseVar) {
        this.a = bVar;
        this.b = lifecycle;
        this.c = tseVar;
        sjh sjhVar = uyj.a;
        this.d = o400.a.x;
        this.e = "SdkRegistryLifecycleInitializer";
    }

    @Override // defpackage.yw60
    public final void e() {
        tje.N(this.c, this.d, null, new SdkRegistryLifecycleInitializer$initializeStage$1(this, SdkLifecycleStage.APP_CREATED, null), 2);
    }

    @Override // defpackage.ww60
    public final void f() {
        tje.N(this.c, this.d, null, new SdkRegistryLifecycleInitializer$initializeStage$1(this, SdkLifecycleStage.APP_CONFIGURATION, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return this.e;
    }
}
