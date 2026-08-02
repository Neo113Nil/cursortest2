package com.yandex.go.navigator.alt_select;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ob31;
import defpackage.vv1;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvv1;", "uiState", "Lzy11;", "<anonymous>", "(Lvv1;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.alt_select.AltSelectPresenter$renderVerticals$2", f = "AltSelectPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AltSelectPresenter$renderVerticals$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AltSelectPresenter$renderVerticals$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AltSelectPresenter$renderVerticals$2 altSelectPresenter$renderVerticals$2 = new AltSelectPresenter$renderVerticals$2(this.this$0, continuation);
        altSelectPresenter$renderVerticals$2.L$0 = obj;
        return altSelectPresenter$renderVerticals$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AltSelectPresenter$renderVerticals$2 altSelectPresenter$renderVerticals$2 = (AltSelectPresenter$renderVerticals$2) create((vv1) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        altSelectPresenter$renderVerticals$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vv1 vv1Var = (vv1) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        Iterator it = vv1Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((ob31) next).c) {
                obj2 = next;
                break;
            }
        }
        eVar.V = (ob31) obj2;
        return zy11.a;
    }
}
