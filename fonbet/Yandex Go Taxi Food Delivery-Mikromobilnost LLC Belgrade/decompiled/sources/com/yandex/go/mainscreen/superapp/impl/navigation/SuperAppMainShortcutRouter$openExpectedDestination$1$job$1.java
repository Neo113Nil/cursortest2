package com.yandex.go.mainscreen.superapp.impl.navigation;

import com.yandex.go.dto.response.Action$TaxiExpectedDestination;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o820;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.navigation.SuperAppMainShortcutRouter$openExpectedDestination$1$job$1", f = "SuperAppMainShortcutRouter.kt", l = {243}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainShortcutRouter$openExpectedDestination$1$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ Action$TaxiExpectedDestination $action;
    final /* synthetic */ Runnable $onComplete;
    final /* synthetic */ Consumer<Throwable> $onError;
    final /* synthetic */ o820 $shortcutAnalyticsInfo;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainShortcutRouter$openExpectedDestination$1$job$1(c cVar, Action$TaxiExpectedDestination action$TaxiExpectedDestination, o820 o820Var, Consumer consumer, Runnable runnable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$action = action$TaxiExpectedDestination;
        this.$shortcutAnalyticsInfo = o820Var;
        this.$onError = consumer;
        this.$onComplete = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainShortcutRouter$openExpectedDestination$1$job$1(this.this$0, this.$action, this.$shortcutAnalyticsInfo, this.$onError, this.$onComplete, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainShortcutRouter$openExpectedDestination$1$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.shortcuts.router.a aVar = (ru.yandex.taxi.shortcuts.router.a) this.this$0.f.get();
            Action$TaxiExpectedDestination action$TaxiExpectedDestination = this.$action;
            o820 o820Var = this.$shortcutAnalyticsInfo;
            this.label = 1;
            b = aVar.b(action$TaxiExpectedDestination, o820Var, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        Runnable runnable = this.$onComplete;
        if (!(b instanceof Result.Failure)) {
            runnable.run();
        }
        Consumer<Throwable> consumer = this.$onError;
        Throwable a = Result.a(b);
        if (a != null) {
            consumer.accept(a);
        }
        return zy11.a;
    }
}
