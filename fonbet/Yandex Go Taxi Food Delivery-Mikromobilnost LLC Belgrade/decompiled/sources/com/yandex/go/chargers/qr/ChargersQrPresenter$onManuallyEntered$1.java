package com.yandex.go.chargers.qr;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersQrScanCloseReason;
import defpackage.l6a;
import defpackage.m6a;
import defpackage.moa;
import defpackage.mvg;
import defpackage.n6a;
import defpackage.ny61;
import defpackage.poa;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.qr.ChargersQrPresenter$onManuallyEntered$1", f = "ChargersQrPresenter.kt", l = {HProv.PP_FAST_CODE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class ChargersQrPresenter$onManuallyEntered$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $number;
    int label;
    final /* synthetic */ poa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersQrPresenter$onManuallyEntered$1(poa poaVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = poaVar;
        this.$number = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersQrPresenter$onManuallyEntered$1(this.this$0, this.$number, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersQrPresenter$onManuallyEntered$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ((moa) this.this$0.Dg()).r8();
            com.yandex.go.chargers.qr.domain.a aVar = this.this$0.E;
            String str = this.$number;
            this.label = 1;
            obj = aVar.a(str, this);
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
        n6a n6aVar = (n6a) obj;
        if (n6aVar instanceof m6a) {
            poa.Kg(this.this$0, ((m6a) n6aVar).a, ChargersAnalytics$ChargersQrScanCloseReason.EnteredNumber);
        } else {
            if (!(n6aVar instanceof l6a)) {
                w511.b();
                return null;
            }
            ((moa) this.this$0.Dg()).q5(((l6a) n6aVar).a);
        }
        return zy11.a;
    }
}
