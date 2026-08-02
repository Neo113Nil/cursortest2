package ru.rustore.sdk.pushclient.s;

import com.vk.push.common.messaging.NotificationAnalyticsPayload;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.k1z0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.domain.usecase.RegisterPushClickActivityCallbackUseCase", f = "RegisterPushClickActivityCallbackUseCase.kt", l = {58, 60}, m = "sendPushClickEvent")
/* loaded from: classes9.dex */
public final class i extends ContinuationImpl {
    public k1z0 a;
    public String b;
    public NotificationAnalyticsPayload c;
    public /* synthetic */ Object d;
    public final /* synthetic */ k1z0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k1z0 k1z0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = k1z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return k1z0.a(this.e, null, null, this);
    }
}
