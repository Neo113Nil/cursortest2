package com.yandex.passport.internal.provider.communication;

import com.yandex.passport.internal.provider.communication.HostResponse;
import com.yandex.passport.internal.provider.communication.IPCCommand;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.provider.communication.MessagePerformer$DefaultImpls", f = "MessagePerformer.kt", l = {10}, m = "performMethod")
/* loaded from: classes8.dex */
final class MessagePerformer$performMethod$1<T extends IPCCommand, V extends HostResponse> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return p.b(null, null, this);
    }
}
