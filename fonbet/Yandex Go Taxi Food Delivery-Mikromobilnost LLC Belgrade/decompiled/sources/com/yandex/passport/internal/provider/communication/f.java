package com.yandex.passport.internal.provider.communication;

import com.yandex.passport.api.PushPlatform;
import com.yandex.passport.internal.provider.communication.IPCCommand;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class f implements q {
    public final e a;

    public f(e eVar) {
        this.a = eVar;
    }

    @Override // com.yandex.passport.internal.provider.communication.q
    public final Object a(IPCCommand iPCCommand, Continuation continuation) {
        PushPlatform platform = ((IPCCommand.PushTokenCommand) iPCCommand).getPlatform();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new HostPushTokenPerformer$getToken$2(this, platform, null), continuation);
    }

    public final Object b(IPCCommand iPCCommand, Continuation continuation) {
        return p.b(this, (IPCCommand.PushTokenCommand) iPCCommand, (ContinuationImpl) continuation);
    }
}
