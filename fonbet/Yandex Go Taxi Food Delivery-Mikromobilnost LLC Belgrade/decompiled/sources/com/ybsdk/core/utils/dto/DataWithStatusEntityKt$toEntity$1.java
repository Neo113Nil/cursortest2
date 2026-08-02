package com.ybsdk.core.utils.dto;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.core.utils.dto.DataWithStatusEntityKt", f = "DataWithStatusEntity.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "toEntity")
/* loaded from: classes2.dex */
final class DataWithStatusEntityKt$toEntity$1<Response, Entity> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object e = b.e(null, null, this);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : new Result(e);
    }
}
