package com.ybsdk.feature.card.api;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.card.api.CardAgreementProvider$DefaultImpls", f = "CardFeature.kt", l = {130, HProv.PP_CONTAINER_EXTENSION, HProv.PP_ENUM_LOG}, m = "getExistedOrDefault-gIAlu-s")
/* loaded from: classes3.dex */
final class CardAgreementProvider$getExistedOrDefault$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = a.a(null, null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
