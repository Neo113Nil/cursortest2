package com.yandex.go.account.activity;

import com.yandex.go.account.upgrade.k;
import defpackage.hxx;
import defpackage.m921;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.account.activity.UpgradeAccountLifecycleListener$onLargestContentfulPaint$1", f = "UpgradeAccountLifecycleListener.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class UpgradeAccountLifecycleListener$onLargestContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeAccountLifecycleListener$onLargestContentfulPaint$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpgradeAccountLifecycleListener$onLargestContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpgradeAccountLifecycleListener$onLargestContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m0 a = ((k) this.this$0.b.get()).a();
            UpgradeAccountLifecycleListener$onLargestContentfulPaint$1$state$1 upgradeAccountLifecycleListener$onLargestContentfulPaint$1$state$1 = new UpgradeAccountLifecycleListener$onLargestContentfulPaint$1$state$1(2, null);
            this.label = 1;
            obj = e.x(a, upgradeAccountLifecycleListener$onLargestContentfulPaint$1$state$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        b bVar = this.this$0;
        oep0 oep0Var = bVar.d;
        ((pep0) oep0Var).f((m950) bVar.a.get(), (m921) obj, hxx.a);
        return zy11.a;
    }
}
