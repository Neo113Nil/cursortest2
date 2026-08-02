package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.network;

import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import defpackage.osu;
import defpackage.su00;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public /* synthetic */ class FlexMapiModule$provideMapiClient$1 implements su00, jms {
    final /* synthetic */ osu $tmp0;

    public FlexMapiModule$provideMapiClient$1(osu osuVar) {
        this.$tmp0 = osuVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof su00) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new AdaptedFunctionReference(1, this.$tmp0, osu.class, "getHostUrl", "getHostUrl()Ljava/lang/String;", 4);
    }

    @Override // defpackage.su00
    public final Object getHost(Continuation<? super String> continuation) {
        Object provideMapiClient$getHostUrl;
        provideMapiClient$getHostUrl = FlexMapiModule.provideMapiClient$getHostUrl(this.$tmp0, continuation);
        return provideMapiClient$getHostUrl;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
