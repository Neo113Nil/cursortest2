package com.yandex.go.intentprocessor;

import android.content.Intent;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.w300;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.intentprocessor.IntentProcessorOnCreateListener$onFirstContentfulPaint$1", f = "MainActivityIntentInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class IntentProcessorOnCreateListener$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentProcessorOnCreateListener$onFirstContentfulPaint$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntentProcessorOnCreateListener$onFirstContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        IntentProcessorOnCreateListener$onFirstContentfulPaint$1 intentProcessorOnCreateListener$onFirstContentfulPaint$1 = (IntentProcessorOnCreateListener$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        intentProcessorOnCreateListener$onFirstContentfulPaint$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Intent intent = this.this$0.b.getIntent();
        if (intent != null) {
            w300 w300Var = (w300) this.this$0.c.get();
            k kVar = w300Var.b;
            MainActivityIntentInteractor$processIntent$1 mainActivityIntentInteractor$processIntent$1 = new MainActivityIntentInteractor$processIntent$1(w300Var, intent, null);
            pzt0 pzt0Var = kVar.g;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            kVar.g = com.yandex.go.coroutines.b.g(kVar.b, null, null, new NewIntentInteractorImpl$processIntentAsync$1(kVar, intent, mainActivityIntentInteractor$processIntent$1, null), 3);
            tje.N(w300Var.a, null, null, new MainActivityIntentInteractor$processIntent$2(w300Var, intent, null), 3);
        }
        return zy11.a;
    }
}
