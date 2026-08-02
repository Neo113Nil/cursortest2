package com.yandex.mob.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mob.domain.RemoteNotificationUseCase", f = "RemoteNotificationUseCase.kt", l = {70, HProv.ALG_SID_SHA3_224, HProv.ALG_SID_NO_HASH, HProv.PP_HASHOID, HProv.PP_REBOOT}, m = "handleAddToConfig")
/* loaded from: classes15.dex */
final class RemoteNotificationUseCase$handleAddToConfig$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteNotificationUseCase$handleAddToConfig$1(r rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
