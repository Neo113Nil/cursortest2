package com.yandex.go.account.upgrade;

import defpackage.co40;
import defpackage.i921;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.account.upgrade.UpgradeAccountModalRouterImpl$provideModalView$2$1", f = "UpgradeAccountModalRouterImpl.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class UpgradeAccountModalRouterImpl$provideModalView$2$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ i921 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeAccountModalRouterImpl$provideModalView$2$1(i921 i921Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = i921Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpgradeAccountModalRouterImpl$provideModalView$2$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpgradeAccountModalRouterImpl$provideModalView$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            co40 co40Var = this.this$0.H;
            co40Var.getClass();
            co40Var.a.a("UpgradeAccountModal.Tapped", new HashMap(), 1, new HashMap());
            ru.yandex.taxi.am.j jVar = this.this$0.I;
            this.label = 1;
            b = ru.yandex.taxi.am.j.b(jVar, this);
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
        i921 i921Var = this.this$0;
        if (!(b instanceof Result.Failure)) {
            co40 co40Var2 = i921Var.H;
            co40Var2.getClass();
            co40Var2.a.a("UpgradeAccountModal.UpgradeAccountSuccess", new HashMap(), 1, new HashMap());
            i921Var.r(new qu(9));
        }
        i921 i921Var2 = this.this$0;
        Throwable a = Result.a(b);
        if (a != null) {
            xby.l(jst.e, "Account Manager: Upgrade account from modal failed", null, a, "Failed to upgrade account to portal", 2);
            i921Var2.r(new qu(9));
        }
        return zy11.a;
    }
}
