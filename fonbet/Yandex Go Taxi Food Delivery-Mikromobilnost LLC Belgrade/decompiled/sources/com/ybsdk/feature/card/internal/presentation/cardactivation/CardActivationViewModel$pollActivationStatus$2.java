package com.ybsdk.feature.card.internal.presentation.cardactivation;

import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardActivationClaimingStatusResultResult;
import com.ybsdk.feature.card.api.CardScenarioEventsReceiver$ActivationResult;
import defpackage.aa8;
import defpackage.ba8;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.s98;
import defpackage.tse;
import defpackage.w511;
import defpackage.w98;
import defpackage.wls;
import defpackage.x98;
import defpackage.y98;
import defpackage.z98;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationViewModel$pollActivationStatus$2", f = "CardActivationViewModel.kt", l = {222}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardActivationViewModel$pollActivationStatus$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $applicationId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardActivationViewModel$pollActivationStatus$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$applicationId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardActivationViewModel$pollActivationStatus$2(this.this$0, this.$applicationId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardActivationViewModel$pollActivationStatus$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.ybsdk.feature.card.internal.interactors.b bVar = this.this$0.K;
            String str = this.$applicationId;
            this.label = 1;
            Object d = bVar.d(str, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = d;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        a aVar = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            ba8 ba8Var = (ba8) obj2;
            if (ba8Var instanceof aa8) {
                aVar.D.k.d(CardCommonEvents$CardActivationClaimingStatusResultResult.OK, null);
                aVar.J.a(CardScenarioEventsReceiver$ActivationResult.SUCCESS);
                pz40 Y = aVar.Y();
                do {
                    r0Var3 = (r0) Y;
                    value3 = r0Var3.getValue();
                } while (!r0Var3.k(value3, s98.a((s98) value3, null, null, null, null, new x98(((aa8) ba8Var).a), null, null, null, null, null, null, null, null, null, null, 32751)));
            } else if (ba8Var instanceof y98) {
                aVar.D.k.d(CardCommonEvents$CardActivationClaimingStatusResultResult.ERROR, null);
                aVar.J.a(CardScenarioEventsReceiver$ActivationResult.FAIL);
                pz40 Y2 = aVar.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, s98.a((s98) value2, null, null, null, null, new w98(6, null, new Throwable("Card activation status is failure")), null, null, null, null, null, null, null, null, null, null, 32751)));
            } else if (!jl40.l(ba8Var, z98.a)) {
                w511.b();
                return null;
            }
        }
        a aVar2 = this.this$0;
        String str2 = this.$applicationId;
        Throwable a = Result.a(obj2);
        if (a != null) {
            aVar2.D.k.d(CardCommonEvents$CardActivationClaimingStatusResultResult.ERROR, a.getLocalizedMessage());
            aVar2.J.a(CardScenarioEventsReceiver$ActivationResult.FAIL);
            pz40 Y3 = aVar2.Y();
            do {
                r0Var = (r0) Y3;
                value = r0Var.getValue();
            } while (!r0Var.k(value, s98.a((s98) value, null, null, null, null, new w98(4, str2, a), null, null, null, null, null, null, null, null, null, null, 32751)));
        }
        return zy11.a;
    }
}
