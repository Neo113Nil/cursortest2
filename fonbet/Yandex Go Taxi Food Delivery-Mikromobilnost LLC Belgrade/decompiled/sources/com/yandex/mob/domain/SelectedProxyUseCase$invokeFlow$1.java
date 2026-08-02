package com.yandex.mob.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ol20;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvpr;", "", "", "Liq20;", "Lcom/yandex/mob/api/model/MobProvisionMap;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.domain.SelectedProxyUseCase$invokeFlow$1", f = "SelectedProxyUseCase.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class SelectedProxyUseCase$invokeFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ ol20[] $apiNames;
    final /* synthetic */ String $contour;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectedProxyUseCase$invokeFlow$1(s sVar, String str, ol20[] ol20VarArr, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sVar;
        this.$contour = str;
        this.$apiNames = ol20VarArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectedProxyUseCase$invokeFlow$1 selectedProxyUseCase$invokeFlow$1 = new SelectedProxyUseCase$invokeFlow$1(this.this$0, this.$contour, this.$apiNames, continuation);
        selectedProxyUseCase$invokeFlow$1.L$0 = obj;
        return selectedProxyUseCase$invokeFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectedProxyUseCase$invokeFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.b.d(this.$contour);
            com.yandex.mob.data.c cVar = this.this$0.a;
            String str = this.$contour;
            ol20[] ol20VarArr = this.$apiNames;
            tpr i2 = cVar.i(str, (ol20[]) Arrays.copyOf(ol20VarArr, ol20VarArr.length));
            this.L$0 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(i2, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
