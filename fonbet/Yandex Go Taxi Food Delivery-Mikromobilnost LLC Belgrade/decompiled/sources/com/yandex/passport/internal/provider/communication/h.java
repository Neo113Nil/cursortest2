package com.yandex.passport.internal.provider.communication;

import com.yandex.passport.internal.provider.communication.HostResponse;
import com.yandex.passport.internal.provider.communication.IPCCommand;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class h implements q {
    public final e a;

    public h(e eVar) {
        this.a = eVar;
    }

    @Override // com.yandex.passport.internal.provider.communication.q
    public final Object a(IPCCommand iPCCommand, Continuation continuation) {
        this.a.a.g(((IPCCommand.VpnStatusChangedCommand) iPCCommand).getStatus());
        return HostResponse.Ok.INSTANCE;
    }
}
