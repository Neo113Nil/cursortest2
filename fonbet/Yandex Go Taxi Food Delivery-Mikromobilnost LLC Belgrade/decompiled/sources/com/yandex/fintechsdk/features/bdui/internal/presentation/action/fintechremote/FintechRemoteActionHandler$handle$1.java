package com.yandex.fintechsdk.features.bdui.internal.presentation.action.fintechremote;

import defpackage.an11;
import defpackage.ig5;
import defpackage.jh5;
import defpackage.lfh;
import defpackage.mvg;
import defpackage.nbr;
import defpackage.ny61;
import defpackage.obr;
import defpackage.qoi0;
import defpackage.tse;
import defpackage.vm50;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.bdui.internal.presentation.action.fintechremote.FintechRemoteActionHandler$handle$1", f = "FintechRemoteActionHandler.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FintechRemoteActionHandler$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ ig5 $action;
    final /* synthetic */ jh5 $context;
    final /* synthetic */ obr $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FintechRemoteActionHandler$handle$1(a aVar, obr obrVar, ig5 ig5Var, jh5 jh5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$request = obrVar;
        this.$action = ig5Var;
        this.$context = jh5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FintechRemoteActionHandler$handle$1(this.this$0, this.$request, this.$action, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FintechRemoteActionHandler$handle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        vm50 vm50Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            lfh lfhVar = this.this$0.b;
            obr obrVar = this.$request;
            an11 e = qoi0.e(c.class);
            this.label = 1;
            com.yandex.fintechsdk.core.network.impl.internal.network.a aVar = (com.yandex.fintechsdk.core.network.impl.internal.network.a) lfhVar;
            aVar.getClass();
            d = com.yandex.fintechsdk.core.network.impl.internal.network.a.d(aVar, obrVar, e, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            d = ((Result) obj).getValue();
        }
        ig5 ig5Var = this.$action;
        jh5 jh5Var = this.$context;
        if (!(d instanceof Result.Failure)) {
            vm50 vm50Var2 = ((nbr) ig5Var).c;
            if (vm50Var2 != null) {
                jh5Var.a.dispatch(vm50Var2);
            }
        }
        ig5 ig5Var2 = this.$action;
        jh5 jh5Var2 = this.$context;
        if (Result.a(d) != null && (vm50Var = ((nbr) ig5Var2).b) != null) {
            jh5Var2.a.dispatch(vm50Var);
        }
        return zy11.a;
    }
}
