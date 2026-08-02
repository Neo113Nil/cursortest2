package com.yandex.go.taxi.order.cancel.similar.view;

import com.yandex.go.taxi.order.cancel.similar.interactor.h;
import defpackage.j08;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.similar.view.CancelSimilarOrdersPresenter$onTap$1", f = "CancelSimilarOrdersPresenter.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class CancelSimilarOrdersPresenter$onTap$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ j08 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelSimilarOrdersPresenter$onTap$1(j08 j08Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = j08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CancelSimilarOrdersPresenter$onTap$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CancelSimilarOrdersPresenter$onTap$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            j08 j08Var = this.this$0;
            h hVar = j08Var.z;
            List list = j08Var.x.c;
            this.label = 1;
            if (hVar.a(list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
