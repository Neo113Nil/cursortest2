package com.yandex.go.chargers.qr;

import com.yandex.go.chargers.qr.data.model.ChargersQrMode;
import com.yandex.go.chargers.qr.experiment.ChargersManualEnterExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.roa;
import defpackage.soa;
import defpackage.toa;
import defpackage.voa;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/chargers/qr/data/model/ChargersQrMode;", "qrMode", "Lcom/yandex/go/chargers/qr/experiment/ChargersManualEnterExperiment$ChargersManualEnterLimitations;", "limitations", "Luoa;", "<anonymous>", "(Lcom/yandex/go/chargers/qr/data/model/ChargersQrMode;Lcom/yandex/go/chargers/qr/experiment/ChargersManualEnterExperiment$ChargersManualEnterLimitations;)Luoa;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.qr.ChargersQrUiStateInteractor$uiState$1", f = "ChargersQrUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersQrUiStateInteractor$uiState$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersQrUiStateInteractor$uiState$1(f fVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersQrUiStateInteractor$uiState$1 chargersQrUiStateInteractor$uiState$1 = new ChargersQrUiStateInteractor$uiState$1(this.this$0, (Continuation) obj3);
        chargersQrUiStateInteractor$uiState$1.L$0 = (ChargersQrMode) obj;
        chargersQrUiStateInteractor$uiState$1.L$1 = (ChargersManualEnterExperiment.ChargersManualEnterLimitations) obj2;
        return chargersQrUiStateInteractor$uiState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChargersQrMode chargersQrMode = (ChargersQrMode) this.L$0;
        ChargersManualEnterExperiment.ChargersManualEnterLimitations chargersManualEnterLimitations = (ChargersManualEnterExperiment.ChargersManualEnterLimitations) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean a = ((com.yandex.go.permission.b) this.this$0.a).a(3);
        int i = voa.a[chargersQrMode.ordinal()];
        if (i == 1) {
            return a ? roa.a : soa.a;
        }
        if (i == 2) {
            return new toa(chargersManualEnterLimitations.b, chargersManualEnterLimitations.a);
        }
        w511.b();
        return null;
    }
}
