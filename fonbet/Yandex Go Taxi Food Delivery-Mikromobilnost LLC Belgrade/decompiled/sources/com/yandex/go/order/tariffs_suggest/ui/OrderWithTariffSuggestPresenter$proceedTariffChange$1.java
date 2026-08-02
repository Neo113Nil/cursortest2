package com.yandex.go.order.tariffs_suggest.ui;

import defpackage.gci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.tariffs_suggest.ui.OrderWithTariffSuggestPresenter$proceedTariffChange$1", f = "OrderWithTariffSuggestPresenter.kt", l = {110, 311, 141}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class OrderWithTariffSuggestPresenter$proceedTariffChange$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderWithTariffSuggestPresenter$proceedTariffChange$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderWithTariffSuggestPresenter$proceedTariffChange$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderWithTariffSuggestPresenter$proceedTariffChange$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        a aVar3 = this.label;
        zy11 zy11Var = zy11.a;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            a.Kg(aVar3);
            aVar3.x.f();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
            aVar3.C.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(o400.a, new OrderWithTariffSuggestPresenter$showFailedNotification$2(aVar3, null, null), this);
            if (k0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                k0 = zy11Var;
            }
            if (k0 != coroutineSingletons) {
                return zy11Var;
            }
        }
        if (aVar3 == 0) {
            kotlin.b.b(obj);
            com.yandex.go.order.tariffs_suggest.repository.a aVar4 = this.this$0.x;
            r0 r0Var = aVar4.k;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
            aVar4.l.g(zy11Var);
            a aVar5 = this.this$0;
            com.yandex.go.order.tariffs_suggest.repository.a aVar6 = aVar5.x;
            this.L$0 = aVar5;
            this.L$1 = aVar5;
            this.label = 1;
            if (aVar6.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = aVar5;
            aVar2 = aVar5;
        } else {
            if (aVar3 != 1) {
                if (aVar3 != 2) {
                    if (aVar3 != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                a aVar7 = (a) this.L$0;
                kotlin.b.b(obj);
                aVar3 = aVar7;
                throw new IllegalStateException("SharedFlow never completes, this call should never return.");
            }
            a aVar8 = (a) this.L$1;
            aVar = (a) this.L$0;
            kotlin.b.b(obj);
            aVar2 = aVar8;
        }
        gci0 gci0Var = aVar.x.h;
        OrderWithTariffSuggestPresenter$proceedTariffChange$1$1$1 orderWithTariffSuggestPresenter$proceedTariffChange$1$1$1 = new OrderWithTariffSuggestPresenter$proceedTariffChange$1$1$1(aVar, null);
        this.L$0 = aVar2;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        aVar3 = aVar2;
        if (e.k(gci0Var, orderWithTariffSuggestPresenter$proceedTariffChange$1$1$1, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        throw new IllegalStateException("SharedFlow never completes, this call should never return.");
    }
}
