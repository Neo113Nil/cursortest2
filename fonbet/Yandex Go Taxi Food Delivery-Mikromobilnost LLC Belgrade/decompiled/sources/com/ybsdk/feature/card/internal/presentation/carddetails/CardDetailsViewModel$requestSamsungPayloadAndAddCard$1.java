package com.ybsdk.feature.card.internal.presentation.carddetails;

import com.ybsdk.feature.card.internal.interactors.d;
import com.ybsdk.feature.card.internal.samsungpay.SamsungPayState;
import defpackage.bq8;
import defpackage.bzl0;
import defpackage.fe8;
import defpackage.fzl0;
import defpackage.gao;
import defpackage.gzl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsViewModel$requestSamsungPayloadAndAddCard$1", f = "CardDetailsViewModel.kt", l = {362, 369}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardDetailsViewModel$requestSamsungPayloadAndAddCard$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $cardId;
    final /* synthetic */ gzl0 $walletInfo;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsViewModel$requestSamsungPayloadAndAddCard$1(b bVar, String str, gzl0 gzl0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$cardId = str;
        this.$walletInfo = gzl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardDetailsViewModel$requestSamsungPayloadAndAddCard$1(this.this$0, this.$cardId, this.$walletInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardDetailsViewModel$requestSamsungPayloadAndAddCard$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (com.ybsdk.feature.card.internal.presentation.carddetails.b.b0(r1, r2, r3, r20) == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r0 == r6) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0094  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        bq8 bq8Var;
        Object a;
        Throwable a2;
        pz40 Y;
        r0 r0Var2;
        Object value2;
        bq8 bq8Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pz40 Y2 = this.this$0.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
                bq8Var = (bq8) value;
            } while (!r0Var.k(value, bq8.a(bq8Var, null, null, false, null, null, null, null, SamsungPayState.a(bq8Var.j, null, null, null, true, null, null, 111), null, 15359)));
            b bVar = this.this$0;
            d dVar = bVar.R;
            String str = this.$cardId;
            fzl0 fzl0Var = (fzl0) this.$walletInfo;
            String str2 = fzl0Var.a;
            String str3 = fzl0Var.b;
            this.label = 1;
            a = dVar.a(str, str2, str3, bVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a = this.L$0;
                kotlin.b.b(obj);
                b bVar2 = this.this$0;
                a2 = Result.a(a);
                if (a2 != null) {
                    com.ybsdk.feature.card.internal.samsungpay.d.b(bVar2.M, "Failure while getting card payload from backend", null, null, a2, null, 22);
                    bVar2.Z(new fe8(gao.e(null, null, a2, 3)));
                }
                Y = this.this$0.Y();
                do {
                    r0Var2 = (r0) Y;
                    value2 = r0Var2.getValue();
                    bq8Var2 = (bq8) value2;
                } while (!r0Var2.k(value2, bq8.a(bq8Var2, null, null, false, null, null, null, null, SamsungPayState.a(bq8Var2.j, null, null, null, false, null, null, 111), null, 15359)));
                return zy11.a;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        b bVar3 = this.this$0;
        String str4 = this.$cardId;
        if (!(a instanceof Result.Failure)) {
            String str5 = ((bzl0) a).a;
            this.L$0 = a;
            this.label = 2;
        }
        b bVar22 = this.this$0;
        a2 = Result.a(a);
        if (a2 != null) {
        }
        Y = this.this$0.Y();
        do {
            r0Var2 = (r0) Y;
            value2 = r0Var2.getValue();
            bq8Var2 = (bq8) value2;
        } while (!r0Var2.k(value2, bq8.a(bq8Var2, null, null, false, null, null, null, null, SamsungPayState.a(bq8Var2.j, null, null, null, false, null, null, 111), null, 15359)));
        return zy11.a;
    }
}
