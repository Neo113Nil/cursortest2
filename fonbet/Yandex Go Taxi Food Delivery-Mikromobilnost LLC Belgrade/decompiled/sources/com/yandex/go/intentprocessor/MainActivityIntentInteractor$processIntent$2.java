package com.yandex.go.intentprocessor;

import android.content.Intent;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w300;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.intentprocessor.MainActivityIntentInteractor$processIntent$2", f = "MainActivityIntentInteractor.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MainActivityIntentInteractor$processIntent$2 extends SuspendLambda implements wls {
    final /* synthetic */ Intent $intent;
    int label;
    final /* synthetic */ w300 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityIntentInteractor$processIntent$2(w300 w300Var, Intent intent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = w300Var;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainActivityIntentInteractor$processIntent$2(this.this$0, this.$intent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainActivityIntentInteractor$processIntent$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.messenger_native.d dVar = this.this$0.c;
            Intent intent = this.$intent;
            this.label = 1;
            if (dVar.a(intent, this) == coroutineSingletons) {
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
