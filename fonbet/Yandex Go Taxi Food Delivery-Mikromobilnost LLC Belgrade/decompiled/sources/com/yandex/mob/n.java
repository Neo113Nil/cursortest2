package com.yandex.mob;

import defpackage.tje;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes8.dex */
public final class n {
    public final com.yandex.mob.domain.l a;

    public n(com.yandex.mob.domain.l lVar) {
        this.a = lVar;
    }

    public final List a(String str) {
        return (List) tje.Y(EmptyCoroutineContext.a, new MobProxyIpToHostProvider$getHostsByIp$1(this, str, null));
    }
}
