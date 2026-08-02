package com.yandex.plus.home.plaque.feature.internal.presentation;

import defpackage.ha2;
import defpackage.jf5;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qda0;
import defpackage.rkc0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.feature.internal.presentation.PlaqueViewControllerImpl$onViewAttached$2", f = "PlaqueViewControllerImpl.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlaqueViewControllerImpl$onViewAttached$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaqueViewControllerImpl$onViewAttached$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaqueViewControllerImpl$onViewAttached$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaqueViewControllerImpl$onViewAttached$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = (d) this.this$0.d.getValue();
            tpr F = e.F(e.t(new ha2(12, com.yandex.plus.core.coroutines.extensions.flow.b.a(new m0(new mth(dVar.l, 9), vng.l(((rkc0) dVar.a.b).e, new qda0(5), vng.c), PlaqueViewModel$plaqueModelFlow$5.a)), dVar)), dVar.j);
            jf5 jf5Var = new jf5(7, this.this$0);
            this.label = 1;
            if (F.collect(jf5Var, this) == coroutineSingletons) {
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
