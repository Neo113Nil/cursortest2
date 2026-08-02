package com.yandex.go.superapp.biometrics;

import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowResult;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowType;
import defpackage.ck7;
import defpackage.gcn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1u0;
import defpackage.tse;
import defpackage.w831;
import defpackage.wls;
import defpackage.x831;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.biometrics.EatsKitBiometricVerificationDelegate$startOrderVerification$1", f = "EatsKitBiometricVerificationDelegate.kt", l = {82}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class EatsKitBiometricVerificationDelegate$startOrderVerification$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    final /* synthetic */ t1u0 $request;
    final /* synthetic */ long $timeout;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EatsKitBiometricVerificationDelegate$startOrderVerification$1(a aVar, t1u0 t1u0Var, long j, gcn gcnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$request = t1u0Var;
        this.$timeout = j;
        this.$callback = gcnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EatsKitBiometricVerificationDelegate$startOrderVerification$1(this.this$0, this.$request, this.$timeout, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EatsKitBiometricVerificationDelegate$startOrderVerification$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EatsKitBiometricVerificationDelegate$startOrderVerification$1 eatsKitBiometricVerificationDelegate$startOrderVerification$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.c.b(BiometricsAnalytics$BiometricsFlowType.OrderVerification);
            a aVar = this.this$0;
            com.yandex.go.superapp.biometrics.domain.a aVar2 = aVar.e;
            String str = this.$request.b;
            String value = aVar.b.getValue();
            long j = this.$timeout;
            this.label = 1;
            eatsKitBiometricVerificationDelegate$startOrderVerification$1 = this;
            obj = aVar2.b(j, str, value, eatsKitBiometricVerificationDelegate$startOrderVerification$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            eatsKitBiometricVerificationDelegate$startOrderVerification$1 = this;
        }
        x831 x831Var = (x831) obj;
        eatsKitBiometricVerificationDelegate$startOrderVerification$1.$callback.a(new ck7(a.b(eatsKitBiometricVerificationDelegate$startOrderVerification$1.this$0, x831Var), null));
        a aVar3 = eatsKitBiometricVerificationDelegate$startOrderVerification$1.this$0;
        aVar3.c.a(BiometricsAnalytics$BiometricsFlowType.OrderVerification, x831Var instanceof w831 ? BiometricsAnalytics$BiometricsFlowResult.Success : BiometricsAnalytics$BiometricsFlowResult.Failed, a.a(aVar3, x831Var));
        return zy11.a;
    }
}
