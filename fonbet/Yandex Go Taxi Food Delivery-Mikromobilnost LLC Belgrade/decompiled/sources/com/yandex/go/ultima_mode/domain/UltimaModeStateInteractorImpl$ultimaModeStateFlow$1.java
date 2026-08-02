package com.yandex.go.ultima_mode.domain;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import defpackage.hv11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "manuallyDisabled", "Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse;", "response", "Lhv11;", "<anonymous>", "(ZLcom/yandex/go/ultima_mode/api/data/UltimaModeResponse;)Lhv11;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ultima_mode.domain.UltimaModeStateInteractorImpl$ultimaModeStateFlow$1", f = "UltimaModeStateInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UltimaModeStateInteractorImpl$ultimaModeStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public UltimaModeStateInteractorImpl$ultimaModeStateFlow$1() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        UltimaModeStateInteractorImpl$ultimaModeStateFlow$1 ultimaModeStateInteractorImpl$ultimaModeStateFlow$1 = new UltimaModeStateInteractorImpl$ultimaModeStateFlow$1(3, (Continuation) obj3);
        ultimaModeStateInteractorImpl$ultimaModeStateFlow$1.Z$0 = booleanValue;
        ultimaModeStateInteractorImpl$ultimaModeStateFlow$1.L$0 = (UltimaModeResponse) obj2;
        return ultimaModeStateInteractorImpl$ultimaModeStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        UltimaModeResponse ultimaModeResponse = (UltimaModeResponse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new hv11(ultimaModeResponse.a, z, ultimaModeResponse.b, ultimaModeResponse);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
