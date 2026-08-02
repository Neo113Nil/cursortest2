package com.yandex.fintechsdk.features.bdui.internal.presentation.action.plus;

import android.content.Context;
import defpackage.ig5;
import defpackage.jh5;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q770;
import defpackage.tse;
import defpackage.vm50;
import defpackage.wls;
import defpackage.xk3;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.bdui.internal.presentation.action.plus.OpenPlusActionHandler$handle$1", f = "OpenPlusActionHandler.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class OpenPlusActionHandler$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ ig5 $action;
    final /* synthetic */ Context $androidContext;
    final /* synthetic */ xk3 $authState;
    final /* synthetic */ jh5 $context;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPlusActionHandler$handle$1(a aVar, xk3 xk3Var, Context context, ig5 ig5Var, jh5 jh5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$authState = xk3Var;
        this.$androidContext = context;
        this.$action = ig5Var;
        this.$context = jh5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OpenPlusActionHandler$handle$1(this.this$0, this.$authState, this.$androidContext, this.$action, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OpenPlusActionHandler$handle$1 openPlusActionHandler$handle$1 = (OpenPlusActionHandler$handle$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        openPlusActionHandler$handle$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Boolean bool = null;
        if (i == 0) {
            b.b(obj);
            this.this$0.getClass();
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            bool = (Boolean) obj;
        }
        boolean l = jl40.l(bool, Boolean.TRUE);
        ig5 ig5Var = this.$action;
        if (l) {
            vm50 vm50Var = ((q770) ig5Var).a;
            if (vm50Var != null) {
                this.$context.a.dispatch(vm50Var);
            }
        } else {
            vm50 vm50Var2 = ((q770) ig5Var).b;
            if (vm50Var2 != null) {
                this.$context.a.dispatch(vm50Var2);
            }
        }
        return zy11.a;
    }
}
