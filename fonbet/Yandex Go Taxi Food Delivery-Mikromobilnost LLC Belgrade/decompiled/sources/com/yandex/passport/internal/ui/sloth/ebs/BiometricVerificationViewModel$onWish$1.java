package com.yandex.passport.internal.ui.sloth.ebs;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.ebs.BiometricVerificationViewModel$onWish$1", f = "BiometricVerificationViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BiometricVerificationViewModel$onWish$1 extends SuspendLambda implements wls {
    final /* synthetic */ z0 $wish;
    int label;
    final /* synthetic */ b1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricVerificationViewModel$onWish$1(b1 b1Var, z0 z0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = b1Var;
        this.$wish = z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BiometricVerificationViewModel$onWish$1(this.this$0, this.$wish, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BiometricVerificationViewModel$onWish$1 biometricVerificationViewModel$onWish$1 = (BiometricVerificationViewModel$onWish$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        biometricVerificationViewModel$onWish$1.invokeSuspend(zy11Var);
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
        this.this$0.b.a(this.$wish);
        return zy11.a;
    }
}
