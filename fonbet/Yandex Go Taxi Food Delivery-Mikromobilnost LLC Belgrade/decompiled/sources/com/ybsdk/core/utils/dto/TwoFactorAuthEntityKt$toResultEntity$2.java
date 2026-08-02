package com.ybsdk.core.utils.dto;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.core.utils.dto.TwoFactorAuthEntityKt", f = "TwoFactorAuthEntity.kt", l = {HProv.PP_SIGNATUREOID}, m = "toResultEntity")
/* loaded from: classes2.dex */
final class TwoFactorAuthEntityKt$toResultEntity$2<Response, Entity> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = f.c(null, null, this);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : new Result(c);
    }
}
