package com.yandex.go.chargers.qr;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersQrScanCloseReason;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.poa;
import defpackage.tsa;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.qr.ChargersQrPresenter$onNewQr$2", f = "ChargersQrPresenter.kt", l = {119}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersQrPresenter$onNewQr$2 extends SuspendLambda implements wls {
    final /* synthetic */ tsa $chargersStationNumber;
    int label;
    final /* synthetic */ poa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersQrPresenter$onNewQr$2(poa poaVar, tsa tsaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = poaVar;
        this.$chargersStationNumber = tsaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersQrPresenter$onNewQr$2(this.this$0, this.$chargersStationNumber, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersQrPresenter$onNewQr$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.label = 1;
            if (kotlinx.coroutines.a.i(500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        poa.Kg(this.this$0, this.$chargersStationNumber, ChargersAnalytics$ChargersQrScanCloseReason.QrScanned);
        return zy11.a;
    }
}
