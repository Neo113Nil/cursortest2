package com.yandex.go.account.upgrade;

import defpackage.g921;
import defpackage.i20;
import defpackage.jl40;
import defpackage.m921;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o921;
import defpackage.p921;
import defpackage.q921;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq921;", "strategy", "Li20;", "profileState", "Lm921;", "<anonymous>", "(Lq921;Li20;)Lm921;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.account.upgrade.UpgradeAccountModalViewUiStateRepositoryImpl$uiStateFlow$1", f = "UpgradeAccountModalViewUiStateRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class UpgradeAccountModalViewUiStateRepositoryImpl$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UpgradeAccountModalViewUiStateRepositoryImpl$uiStateFlow$1 upgradeAccountModalViewUiStateRepositoryImpl$uiStateFlow$1 = new UpgradeAccountModalViewUiStateRepositoryImpl$uiStateFlow$1(3, (Continuation) obj3);
        upgradeAccountModalViewUiStateRepositoryImpl$uiStateFlow$1.L$0 = (q921) obj;
        upgradeAccountModalViewUiStateRepositoryImpl$uiStateFlow$1.L$1 = (i20) obj2;
        return upgradeAccountModalViewUiStateRepositoryImpl$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q921 q921Var = (q921) this.L$0;
        i20 i20Var = (i20) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (i20Var.b && !jl40.l(q921Var, o921.a)) {
            if (!(q921Var instanceof p921)) {
                w511.b();
                return null;
            }
            g921 b = ((p921) q921Var).b();
            if (b != null) {
                return new m921(true, b.c(), b.b(), b.a());
            }
        }
        return m921.e;
    }
}
