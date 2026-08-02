package com.yandex.go.superapp.biometrics;

import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowResult;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowType;
import defpackage.ck7;
import defpackage.e3n;
import defpackage.gcn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p0u0;
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
@mvg(c = "com.yandex.go.superapp.biometrics.EatsKitBiometricVerificationDelegate$startCourierVerification$1", f = "EatsKitBiometricVerificationDelegate.kt", l = {174}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class EatsKitBiometricVerificationDelegate$startCourierVerification$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    final /* synthetic */ p0u0 $request;
    final /* synthetic */ Integer $rssiThreshold;
    final /* synthetic */ e3n $timeout;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EatsKitBiometricVerificationDelegate$startCourierVerification$1(a aVar, p0u0 p0u0Var, Integer num, e3n e3nVar, gcn gcnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$request = p0u0Var;
        this.$rssiThreshold = num;
        this.$timeout = e3nVar;
        this.$callback = gcnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EatsKitBiometricVerificationDelegate$startCourierVerification$1(this.this$0, this.$request, this.$rssiThreshold, this.$timeout, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EatsKitBiometricVerificationDelegate$startCourierVerification$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EatsKitBiometricVerificationDelegate$startCourierVerification$1 eatsKitBiometricVerificationDelegate$startCourierVerification$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.c.b(BiometricsAnalytics$BiometricsFlowType.CourierVerification);
            a aVar = this.this$0;
            com.yandex.go.superapp.biometrics.domain.a aVar2 = aVar.e;
            String str = this.$request.c;
            String value = aVar.b.getValue();
            int intValue = this.$rssiThreshold.intValue();
            long j = this.$timeout.a;
            this.label = 1;
            eatsKitBiometricVerificationDelegate$startCourierVerification$1 = this;
            obj = aVar2.c(str, value, intValue, j, eatsKitBiometricVerificationDelegate$startCourierVerification$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            eatsKitBiometricVerificationDelegate$startCourierVerification$1 = this;
        }
        x831 x831Var = (x831) obj;
        eatsKitBiometricVerificationDelegate$startCourierVerification$1.$callback.a(new ck7(a.b(eatsKitBiometricVerificationDelegate$startCourierVerification$1.this$0, x831Var), null));
        a aVar3 = eatsKitBiometricVerificationDelegate$startCourierVerification$1.this$0;
        aVar3.c.a(BiometricsAnalytics$BiometricsFlowType.CourierVerification, x831Var instanceof w831 ? BiometricsAnalytics$BiometricsFlowResult.Success : BiometricsAnalytics$BiometricsFlowResult.Failed, a.a(aVar3, x831Var));
        return zy11.a;
    }
}
