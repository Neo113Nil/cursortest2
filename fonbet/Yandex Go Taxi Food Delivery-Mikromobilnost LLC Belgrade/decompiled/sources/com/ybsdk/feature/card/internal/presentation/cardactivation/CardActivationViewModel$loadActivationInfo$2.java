package com.ybsdk.feature.card.internal.presentation.cardactivation;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardActivationInitialLoadingResultResult;
import defpackage.bp8;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.p98;
import defpackage.pz40;
import defpackage.qoh;
import defpackage.s98;
import defpackage.tje;
import defpackage.tse;
import defpackage.u98;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationViewModel$loadActivationInfo$2", f = "CardActivationViewModel.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, 65}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardActivationViewModel$loadActivationInfo$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardActivationViewModel$loadActivationInfo$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardActivationViewModel$loadActivationInfo$2 cardActivationViewModel$loadActivationInfo$2 = new CardActivationViewModel$loadActivationInfo$2(this.this$0, continuation);
        cardActivationViewModel$loadActivationInfo$2.L$0 = obj;
        return cardActivationViewModel$loadActivationInfo$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardActivationViewModel$loadActivationInfo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        if (r4 == r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        Object s;
        Object value;
        a aVar;
        Object k;
        Object obj2;
        p98 p98Var;
        Throwable a;
        r0 r0Var;
        Object value2;
        YBProduct yBProduct;
        pz40 Y;
        r0 r0Var2;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tse tseVar = (tse) this.L$0;
            qoh h2 = tje.h(tseVar, null, null, new CardActivationViewModel$loadActivationInfo$2$deferredActivation$1(this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new CardActivationViewModel$loadActivationInfo$2$deferredProduct$1(this.this$0, null), 3);
            this.L$0 = h;
            this.label = 1;
            s = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p98 p98Var2 = (p98) this.L$2;
                a aVar2 = (a) this.L$1;
                obj2 = this.L$0;
                b.b(obj);
                p98Var = p98Var2;
                aVar = aVar2;
                k = obj;
                yBProduct = (YBProduct) k;
                aVar.D.k.e(CardCommonEvents$CardActivationInitialLoadingResultResult.OK, null);
                Y = aVar.Y();
                do {
                    r0Var2 = (r0) Y;
                    value3 = r0Var2.getValue();
                } while (!r0Var2.k(value3, s98.a((s98) value3, null, null, null, p98Var, null, null, null, yBProduct, new bp8(p98Var.f, p98Var.g), p98Var.i, p98Var.h, p98Var.j, p98Var.k, p98Var.l, null, 16487)));
                value = obj2;
                a aVar3 = this.this$0;
                a = Result.a(value);
                if (a != null) {
                    aVar3.D.k.e(CardCommonEvents$CardActivationInitialLoadingResultResult.ERROR, a.getMessage());
                    x4c.g("Card activation static info request failed", a, null, null, 12);
                    pz40 Y2 = aVar3.Y();
                    do {
                        r0Var = (r0) Y2;
                        value2 = r0Var.getValue();
                    } while (!r0Var.k(value2, s98.a((s98) value2, null, null, null, null, new u98(a), null, null, null, null, null, null, null, null, null, null, 32751)));
                }
                return zy11.a;
            }
            h = (noh) this.L$0;
            b.b(obj);
            s = obj;
        }
        value = ((Result) s).getValue();
        aVar = this.this$0;
        if (!(value instanceof Result.Failure)) {
            p98 p98Var3 = (p98) value;
            this.L$0 = value;
            this.L$1 = aVar;
            this.L$2 = p98Var3;
            this.label = 2;
            k = h.k(this);
            if (k != coroutineSingletons) {
                obj2 = value;
                p98Var = p98Var3;
                yBProduct = (YBProduct) k;
                aVar.D.k.e(CardCommonEvents$CardActivationInitialLoadingResultResult.OK, null);
                Y = aVar.Y();
                do {
                    r0Var2 = (r0) Y;
                    value3 = r0Var2.getValue();
                } while (!r0Var2.k(value3, s98.a((s98) value3, null, null, null, p98Var, null, null, null, yBProduct, new bp8(p98Var.f, p98Var.g), p98Var.i, p98Var.h, p98Var.j, p98Var.k, p98Var.l, null, 16487)));
                value = obj2;
            }
            return coroutineSingletons;
        }
        a aVar32 = this.this$0;
        a = Result.a(value);
        if (a != null) {
        }
        return zy11.a;
    }
}
