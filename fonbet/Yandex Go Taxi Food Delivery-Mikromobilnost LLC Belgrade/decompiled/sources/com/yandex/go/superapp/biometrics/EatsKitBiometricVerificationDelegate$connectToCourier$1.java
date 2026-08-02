package com.yandex.go.superapp.biometrics;

import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowFailureReason;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowResult;
import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowType;
import defpackage.ck7;
import defpackage.e3n;
import defpackage.gcn;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q4e;
import defpackage.tse;
import defpackage.ty5;
import defpackage.vbo;
import defpackage.w511;
import defpackage.wbo;
import defpackage.wls;
import defpackage.xbo;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.eatskit.dto.ConnectionError;
import ru.yandex.taxi.eatskit.dto.ConnectionStatus;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.biometrics.EatsKitBiometricVerificationDelegate$connectToCourier$1", f = "EatsKitBiometricVerificationDelegate.kt", l = {128}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class EatsKitBiometricVerificationDelegate$connectToCourier$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    final /* synthetic */ String $serviceUuid;
    final /* synthetic */ e3n $timeout;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EatsKitBiometricVerificationDelegate$connectToCourier$1(a aVar, String str, e3n e3nVar, gcn gcnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$serviceUuid = str;
        this.$timeout = e3nVar;
        this.$callback = gcnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EatsKitBiometricVerificationDelegate$connectToCourier$1(this.this$0, this.$serviceUuid, this.$timeout, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EatsKitBiometricVerificationDelegate$connectToCourier$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q4e q4eVar;
        vbo vboVar = vbo.g;
        vbo vboVar2 = vbo.d;
        vbo vboVar3 = vbo.b;
        vbo vboVar4 = vbo.e;
        vbo vboVar5 = vbo.c;
        vbo vboVar6 = vbo.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        BiometricsAnalytics$BiometricsFlowFailureReason biometricsAnalytics$BiometricsFlowFailureReason = null;
        if (i == 0) {
            b.b(obj);
            this.this$0.c.b(BiometricsAnalytics$BiometricsFlowType.CourierConnect);
            com.yandex.go.superapp.biometrics.domain.b bVar = this.this$0.f;
            String str = this.$serviceUuid;
            long j = this.$timeout.a;
            this.label = 1;
            obj = bVar.a(j, str, this);
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
        xbo xboVar = (xbo) obj;
        gcn gcnVar = this.$callback;
        this.this$0.getClass();
        vbo vboVar7 = vbo.a;
        boolean l = jl40.l(xboVar, vboVar7);
        wbo wboVar = wbo.a;
        if (l || jl40.l(xboVar, vboVar6) || jl40.l(xboVar, vboVar5)) {
            q4eVar = new q4e(ConnectionStatus.UNKNOWN, ConnectionError.UNKNOWN);
        } else if (jl40.l(xboVar, vboVar4)) {
            q4eVar = new q4e(ConnectionStatus.PERMISSION_ERROR, ConnectionError.PERMISSION_DENIED);
        } else if (jl40.l(xboVar, vboVar3)) {
            q4eVar = new q4e(ConnectionStatus.UNKNOWN, ConnectionError.BLUETOOTH_OFF);
        } else if (jl40.l(xboVar, vboVar2)) {
            q4eVar = new q4e(ConnectionStatus.UNKNOWN, ConnectionError.COURIER_NOT_FOUND);
        } else if (jl40.l(xboVar, vboVar)) {
            q4eVar = new q4e(ConnectionStatus.TIMEOUT, ConnectionError.COURIER_NOT_FOUND);
        } else {
            if (!jl40.l(xboVar, wboVar)) {
                w511.b();
                return null;
            }
            q4eVar = new q4e(ConnectionStatus.CONNECTED, null);
        }
        gcnVar.a(new ck7(q4eVar, null));
        a aVar = this.this$0;
        ty5 ty5Var = aVar.c;
        BiometricsAnalytics$BiometricsFlowType biometricsAnalytics$BiometricsFlowType = BiometricsAnalytics$BiometricsFlowType.CourierConnect;
        BiometricsAnalytics$BiometricsFlowResult biometricsAnalytics$BiometricsFlowResult = xboVar instanceof wbo ? BiometricsAnalytics$BiometricsFlowResult.Success : BiometricsAnalytics$BiometricsFlowResult.Failed;
        aVar.getClass();
        if (jl40.l(xboVar, vboVar7) || jl40.l(xboVar, vboVar3) || jl40.l(xboVar, vboVar5)) {
            biometricsAnalytics$BiometricsFlowFailureReason = BiometricsAnalytics$BiometricsFlowFailureReason.BtOff;
        } else if (jl40.l(xboVar, vboVar4) || jl40.l(xboVar, vboVar6)) {
            biometricsAnalytics$BiometricsFlowFailureReason = BiometricsAnalytics$BiometricsFlowFailureReason.PermissionDenied;
        } else if (jl40.l(xboVar, vboVar2)) {
            biometricsAnalytics$BiometricsFlowFailureReason = BiometricsAnalytics$BiometricsFlowFailureReason.CourierNotFound;
        } else if (jl40.l(xboVar, vboVar)) {
            biometricsAnalytics$BiometricsFlowFailureReason = BiometricsAnalytics$BiometricsFlowFailureReason.Timeout;
        } else if (!jl40.l(xboVar, wboVar)) {
            w511.b();
            return null;
        }
        ty5Var.a(biometricsAnalytics$BiometricsFlowType, biometricsAnalytics$BiometricsFlowResult, biometricsAnalytics$BiometricsFlowFailureReason);
        return zy11.a;
    }
}
