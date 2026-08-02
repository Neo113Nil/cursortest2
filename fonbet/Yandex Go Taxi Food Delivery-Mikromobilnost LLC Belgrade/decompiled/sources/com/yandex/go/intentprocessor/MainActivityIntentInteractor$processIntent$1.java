package com.yandex.go.intentprocessor;

import android.content.Intent;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.jl40;
import defpackage.m5u;
import defpackage.mvg;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.o5u;
import defpackage.w300;
import defpackage.w511;
import defpackage.weu;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo5u;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Lo5u;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.intentprocessor.MainActivityIntentInteractor$processIntent$1", f = "MainActivityIntentInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MainActivityIntentInteractor$processIntent$1 extends SuspendLambda implements wls {
    final /* synthetic */ Intent $intent;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ w300 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityIntentInteractor$processIntent$1(w300 w300Var, Intent intent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = w300Var;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainActivityIntentInteractor$processIntent$1 mainActivityIntentInteractor$processIntent$1 = new MainActivityIntentInteractor$processIntent$1(this.this$0, this.$intent, continuation);
        mainActivityIntentInteractor$processIntent$1.L$0 = obj;
        return mainActivityIntentInteractor$processIntent$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MainActivityIntentInteractor$processIntent$1 mainActivityIntentInteractor$processIntent$1 = (MainActivityIntentInteractor$processIntent$1) create((o5u) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mainActivityIntentInteractor$processIntent$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        o5u o5uVar = (o5u) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (jl40.l(o5uVar, n5u.a)) {
            w300.a(this.this$0);
            w300 w300Var = this.this$0;
            w300Var.e.a(w300Var.a, this.$intent, new weu(4, w300Var));
        } else {
            if (!(o5uVar instanceof m5u)) {
                w511.b();
                return null;
            }
            if (!((m5u) o5uVar).a) {
                w300.a(this.this$0);
            }
        }
        return zy11.a;
    }
}
