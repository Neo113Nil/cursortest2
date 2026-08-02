package com.yandex.go.superapp.biometrics;

import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowFailureReason;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowResult;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowType;
import defpackage.ck7;
import defpackage.f931;
import defpackage.gcn;
import defpackage.jl40;
import defpackage.jqq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppq0;
import defpackage.qpq0;
import defpackage.rpq0;
import defpackage.spq0;
import defpackage.tse;
import defpackage.ty5;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.eatskit.dto.BleError;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.biometrics.EatsKitBiometricVerificationDelegate$sendVerificationResultToCourier$1", f = "EatsKitBiometricVerificationDelegate.kt", l = {223}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class EatsKitBiometricVerificationDelegate$sendVerificationResultToCourier$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    final /* synthetic */ f931 $verificationStatus;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EatsKitBiometricVerificationDelegate$sendVerificationResultToCourier$1(a aVar, f931 f931Var, gcn gcnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$verificationStatus = f931Var;
        this.$callback = gcnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EatsKitBiometricVerificationDelegate$sendVerificationResultToCourier$1(this.this$0, this.$verificationStatus, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EatsKitBiometricVerificationDelegate$sendVerificationResultToCourier$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        jqq0 jqq0Var;
        ppq0 ppq0Var = ppq0.b;
        ppq0 ppq0Var2 = ppq0.d;
        ppq0 ppq0Var3 = ppq0.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        BiometricsAnalytics$BiometricsFlowFailureReason biometricsAnalytics$BiometricsFlowFailureReason = null;
        if (i == 0) {
            b.b(obj);
            this.this$0.c.b(BiometricsAnalytics$BiometricsFlowType.SendResult);
            com.yandex.go.superapp.biometrics.domain.b bVar = this.this$0.f;
            f931 f931Var = this.$verificationStatus;
            this.label = 1;
            obj = bVar.d(f931Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        spq0 spq0Var = (spq0) obj;
        gcn gcnVar = this.$callback;
        this.this$0.getClass();
        ppq0 ppq0Var4 = ppq0.a;
        boolean l = jl40.l(spq0Var, ppq0Var4);
        qpq0 qpq0Var = qpq0.a;
        if (l || jl40.l(spq0Var, ppq0Var3) || jl40.l(spq0Var, ppq0Var2) || jl40.l(spq0Var, ppq0Var)) {
            jqq0Var = new jqq0(Boolean.FALSE, BleError.NOT_CONNECTED);
        } else if (spq0Var instanceof rpq0) {
            jqq0Var = new jqq0(Boolean.FALSE, BleError.WRITE_ERROR);
        } else {
            if (!jl40.l(spq0Var, qpq0Var)) {
                w511.b();
                return null;
            }
            jqq0Var = new jqq0(Boolean.TRUE, null);
        }
        gcnVar.a(new ck7(jqq0Var, null));
        a aVar = this.this$0;
        ty5 ty5Var = aVar.c;
        BiometricsAnalytics$BiometricsFlowType biometricsAnalytics$BiometricsFlowType = BiometricsAnalytics$BiometricsFlowType.SendResult;
        BiometricsAnalytics$BiometricsFlowResult biometricsAnalytics$BiometricsFlowResult = spq0Var instanceof qpq0 ? BiometricsAnalytics$BiometricsFlowResult.Success : BiometricsAnalytics$BiometricsFlowResult.Failed;
        aVar.getClass();
        if (jl40.l(spq0Var, ppq0Var3)) {
            biometricsAnalytics$BiometricsFlowFailureReason = BiometricsAnalytics$BiometricsFlowFailureReason.PermissionDenied;
        } else if (jl40.l(spq0Var, ppq0Var4)) {
            biometricsAnalytics$BiometricsFlowFailureReason = BiometricsAnalytics$BiometricsFlowFailureReason.BtOff;
        } else if (jl40.l(spq0Var, ppq0Var) || jl40.l(spq0Var, ppq0Var2)) {
            biometricsAnalytics$BiometricsFlowFailureReason = BiometricsAnalytics$BiometricsFlowFailureReason.CourierNotFound;
        } else if (jl40.l(spq0Var, rpq0.a)) {
            biometricsAnalytics$BiometricsFlowFailureReason = BiometricsAnalytics$BiometricsFlowFailureReason.SendFailed;
        } else if (!jl40.l(spq0Var, qpq0Var)) {
            w511.b();
            return null;
        }
        ty5Var.a(biometricsAnalytics$BiometricsFlowType, biometricsAnalytics$BiometricsFlowResult, biometricsAnalytics$BiometricsFlowFailureReason);
        return zy11.a;
    }
}
