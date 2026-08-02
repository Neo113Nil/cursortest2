package com.yandex.go.chargers.plus;

import com.yandex.go.chargers.domain.ChargersCompositePaymentInteractor$ChargersCompositePaymentState;
import com.yandex.go.chargers.plus.api.ChargersPlusPlaqueExperiment;
import defpackage.d6z;
import defpackage.hma;
import defpackage.ima;
import defpackage.jma;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/yandex/go/chargers/domain/ChargersCompositePaymentInteractor$ChargersCompositePaymentState;", ClidProvider.STATE, "Lkotlin/Pair;", "Lhma;", "<anonymous>", "(Lcom/yandex/go/chargers/domain/ChargersCompositePaymentInteractor$ChargersCompositePaymentState;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.plus.ChargersPlusToggleDelegateImpl$collectPlusEnabledNotification$1", f = "ChargersPlusToggleDelegateImpl.kt", l = {74}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPlusToggleDelegateImpl$collectPlusEnabledNotification$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPlusToggleDelegateImpl$collectPlusEnabledNotification$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersPlusToggleDelegateImpl$collectPlusEnabledNotification$1 chargersPlusToggleDelegateImpl$collectPlusEnabledNotification$1 = new ChargersPlusToggleDelegateImpl$collectPlusEnabledNotification$1(this.this$0, continuation);
        chargersPlusToggleDelegateImpl$collectPlusEnabledNotification$1.L$0 = obj;
        return chargersPlusToggleDelegateImpl$collectPlusEnabledNotification$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersPlusToggleDelegateImpl$collectPlusEnabledNotification$1) create((ChargersCompositePaymentInteractor$ChargersCompositePaymentState) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hma hmaVar;
        ChargersCompositePaymentInteractor$ChargersCompositePaymentState chargersCompositePaymentInteractor$ChargersCompositePaymentState = (ChargersCompositePaymentInteractor$ChargersCompositePaymentState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            jma jmaVar = this.this$0.f;
            this.L$0 = chargersCompositePaymentInteractor$ChargersCompositePaymentState;
            this.label = 1;
            obj = jmaVar.a.b(this);
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
        ChargersPlusPlaqueExperiment chargersPlusPlaqueExperiment = (ChargersPlusPlaqueExperiment) obj;
        if (chargersPlusPlaqueExperiment.b) {
            ima imaVar = this.this$0.d;
            imaVar.getClass();
            ChargersPlusPlaqueExperiment.CompositePaymentNotification compositePaymentNotification = chargersPlusPlaqueExperiment.d;
            if (compositePaymentNotification != null) {
                String Y = d6z.Y(chargersPlusPlaqueExperiment, compositePaymentNotification.a);
                String str = compositePaymentNotification.b;
                hmaVar = new hma(Y, str != null ? ((m7x0) imaVar.a).a(str) : null);
            } else {
                hmaVar = null;
            }
            if (hmaVar != null) {
                return new Pair(chargersCompositePaymentInteractor$ChargersCompositePaymentState, hmaVar);
            }
        }
        return null;
    }
}
