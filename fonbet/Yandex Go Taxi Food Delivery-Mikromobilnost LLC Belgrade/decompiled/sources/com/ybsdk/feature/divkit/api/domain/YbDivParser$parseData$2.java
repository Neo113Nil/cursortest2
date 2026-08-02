package com.ybsdk.feature.divkit.api.domain;

import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lrr51;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.divkit.api.domain.YbDivParser$parseData$2", f = "YbDivParser.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class YbDivParser$parseData$2 extends SuspendLambda implements wls {
    final /* synthetic */ DivDataDto $divDataDto;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YbDivParser$parseData$2(a aVar, DivDataDto divDataDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$divDataDto = divDataDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YbDivParser$parseData$2(this.this$0, this.$divDataDto, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YbDivParser$parseData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        try {
            failure = this.this$0.a(this.$divDataDto);
        } catch (Exception e) {
            failure = new Result.Failure(e);
        }
        return new Result(failure);
    }
}
