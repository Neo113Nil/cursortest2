package com.ybsdk.feature.cashback.impl.screens.categories;

import com.ybsdk.feature.cashback.impl.entities.SuggestedCashbackPromoEntity;
import com.ybsdk.feature.cashback.impl.screens.categories.CashbackCategoriesScreenParams;
import defpackage.cx7;
import defpackage.m29;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.cashback.impl.screens.categories.CashbackCategoriesViewModel$loadData$1", f = "CashbackCategoriesViewModel.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CashbackCategoriesViewModel$loadData$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashbackCategoriesViewModel$loadData$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CashbackCategoriesViewModel$loadData$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CashbackCategoriesViewModel$loadData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            if (!(aVar.B instanceof CashbackCategoriesScreenParams.Prefetched)) {
                pz40 Y = aVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, m29.a((m29) value, null, null, null, 0, 0, null, true, false, 191)));
            }
            a aVar2 = this.this$0;
            this.label = 1;
            obj = a.b0(aVar2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        this.this$0.a0(new cx7(25, (SuggestedCashbackPromoEntity) obj));
        return zy11.a;
    }
}
