package com.ybsdk.core.utils.dto;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Entity", "Response", "response"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.core.utils.dto.DataWithStatusEntityKt$toEntity$4", f = "DataWithStatusEntity.kt", l = {207}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DataWithStatusEntityKt$toEntity$4 extends SuspendLambda implements wls {
    final /* synthetic */ wls $mapper;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataWithStatusEntityKt$toEntity$4(wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$mapper = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataWithStatusEntityKt$toEntity$4 dataWithStatusEntityKt$toEntity$4 = new DataWithStatusEntityKt$toEntity$4(this.$mapper, continuation);
        dataWithStatusEntityKt$toEntity$4.L$0 = obj;
        return dataWithStatusEntityKt$toEntity$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DataWithStatusEntityKt$toEntity$4) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = this.L$0;
            wls wlsVar = this.$mapper;
            this.label = 1;
            obj = wlsVar.invoke(obj2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return new Result(obj);
    }
}
