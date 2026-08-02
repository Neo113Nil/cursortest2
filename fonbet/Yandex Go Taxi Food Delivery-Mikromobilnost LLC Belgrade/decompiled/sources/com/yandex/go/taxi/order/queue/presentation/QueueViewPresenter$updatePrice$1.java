package com.yandex.go.taxi.order.queue.presentation;

import com.yandex.go.taxi.order.queue.interactor.l;
import defpackage.alg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tkg0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.queue.presentation.QueueViewPresenter$updatePrice$1", f = "QueueViewPresenter.kt", l = {HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class QueueViewPresenter$updatePrice$1 extends SuspendLambda implements wls {
    final /* synthetic */ tkg0 $state;
    int label;
    final /* synthetic */ alg0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueueViewPresenter$updatePrice$1(alg0 alg0Var, tkg0 tkg0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = alg0Var;
        this.$state = tkg0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QueueViewPresenter$updatePrice$1(this.this$0, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QueueViewPresenter$updatePrice$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            alg0 alg0Var = this.this$0;
            l lVar = alg0Var.z;
            tkg0 tkg0Var = this.$state;
            String str = alg0Var.B;
            this.label = 1;
            obj = lVar.b(tkg0Var, str, this);
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
        tkg0 tkg0Var2 = (tkg0) obj;
        if (tkg0Var2 != null) {
            this.this$0.Kg(tkg0Var2);
        }
        return zy11.a;
    }
}
