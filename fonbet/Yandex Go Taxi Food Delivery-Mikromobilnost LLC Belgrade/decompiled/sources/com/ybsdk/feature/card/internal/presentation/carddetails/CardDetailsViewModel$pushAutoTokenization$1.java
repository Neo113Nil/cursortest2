package com.ybsdk.feature.card.internal.presentation.carddetails;

import defpackage.bq8;
import defpackage.g92;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qa60;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsViewModel$pushAutoTokenization$1", f = "CardDetailsViewModel.kt", l = {933}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardDetailsViewModel$pushAutoTokenization$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsViewModel$pushAutoTokenization$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardDetailsViewModel$pushAutoTokenization$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardDetailsViewModel$pushAutoTokenization$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String c = ((bq8) this.this$0.X()).c();
            if (c != null) {
                b bVar2 = this.this$0;
                bVar2.O.getClass();
                g92 g92Var = new g92(2, Boolean.FALSE);
                this.L$0 = bVar2;
                this.L$1 = c;
                this.label = 1;
                obj = e.y(g92Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                bVar = bVar2;
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar = (b) this.L$0;
        kotlin.b.b(obj);
        if (!((Boolean) obj).booleanValue() && !((bq8) bVar.X()).m && bVar.B.isNeedAutoStartTokenization()) {
            pz40 Y = bVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, bq8.a((bq8) value, null, null, false, null, null, null, null, null, null, 8191)));
            qa60 qa60Var = bVar.P.a;
        }
        return zy11.a;
    }
}
