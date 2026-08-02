package com.ybsdk.feature.passes.widget.internal;

import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.passes.widget.internal.data.PassesWidgetResponseDto;
import defpackage.hm90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rr51;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/passes/widget/internal/data/PassesWidgetResponseDto;", "successData", "Lhm90;", "<anonymous>", "(Lcom/ybsdk/feature/passes/widget/internal/data/PassesWidgetResponseDto;)Lhm90;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.passes.widget.internal.PassesWidgetRepository$getPassesWidgetData$2$1", f = "PassesWidgetRepository.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PassesWidgetRepository$getPassesWidgetData$2$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PassesWidgetRepository$getPassesWidgetData$2$1 passesWidgetRepository$getPassesWidgetData$2$1 = new PassesWidgetRepository$getPassesWidgetData$2$1(2, continuation);
        passesWidgetRepository$getPassesWidgetData$2$1.L$0 = obj;
        return passesWidgetRepository$getPassesWidgetData$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PassesWidgetRepository$getPassesWidgetData$2$1) create((PassesWidgetResponseDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PassesWidgetResponseDto passesWidgetResponseDto;
        Object a;
        PassesWidgetResponseDto passesWidgetResponseDto2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        rr51 rr51Var = null;
        if (i == 0) {
            kotlin.b.b(obj);
            passesWidgetResponseDto = (PassesWidgetResponseDto) this.L$0;
            DivDataDto widget = passesWidgetResponseDto.getWidget();
            if (widget != null) {
                this.L$0 = passesWidgetResponseDto;
                this.label = 1;
                a = com.ybsdk.feature.divkit.internal.a.a(widget, new com.ybsdk.feature.divkit.api.domain.a(null), this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = a;
                passesWidgetResponseDto2 = passesWidgetResponseDto;
            }
            return new hm90(rr51Var, passesWidgetResponseDto.isAgreementAccepted());
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        passesWidgetResponseDto2 = (PassesWidgetResponseDto) this.L$0;
        kotlin.b.b(obj);
        rr51Var = (rr51) obj;
        passesWidgetResponseDto = passesWidgetResponseDto2;
        return new hm90(rr51Var, passesWidgetResponseDto.isAgreementAccepted());
    }
}
