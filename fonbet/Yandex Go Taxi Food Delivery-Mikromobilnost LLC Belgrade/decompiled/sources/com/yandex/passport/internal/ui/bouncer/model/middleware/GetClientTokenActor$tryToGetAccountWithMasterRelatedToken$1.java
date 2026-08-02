package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.GetClientTokenActor", f = "GetClientTokenActor.kt", l = {128, HProv.PP_VERSION_EX}, m = "tryToGetAccountWithMasterRelatedToken")
/* loaded from: classes2.dex */
final class GetClientTokenActor$tryToGetAccountWithMasterRelatedToken$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetClientTokenActor$tryToGetAccountWithMasterRelatedToken$1(a0 a0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a0.b(this.this$0, null, null, this);
    }
}
