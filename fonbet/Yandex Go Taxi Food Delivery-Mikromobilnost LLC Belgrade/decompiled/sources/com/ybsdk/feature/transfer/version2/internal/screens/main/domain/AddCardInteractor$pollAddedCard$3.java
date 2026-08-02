package com.ybsdk.feature.transfer.version2.internal.screens.main.domain;

import com.ybsdk.di.modules.features.u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "", "Luc8;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.main.domain.AddCardInteractor$pollAddedCard$3", f = "AddCardInteractor.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AddCardInteractor$pollAddedCard$3 extends SuspendLambda implements wls {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddCardInteractor$pollAddedCard$3(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddCardInteractor$pollAddedCard$3 addCardInteractor$pollAddedCard$3 = new AddCardInteractor$pollAddedCard$3(this.this$0, continuation);
        addCardInteractor$pollAddedCard$3.I$0 = ((tq11) obj).a;
        return addCardInteractor$pollAddedCard$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        AddCardInteractor$pollAddedCard$3 addCardInteractor$pollAddedCard$3 = new AddCardInteractor$pollAddedCard$3(this.this$0, (Continuation) obj2);
        addCardInteractor$pollAddedCard$3.I$0 = i;
        return addCardInteractor$pollAddedCard$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = this.I$0;
            u uVar = this.this$0.b;
            this.label = 1;
            a = uVar.a(i2, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
