package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput;

import com.yandex.fintechsdk.data.payment.method.api.model.TokenizeMethod;
import defpackage.g6u;
import defpackage.hoz0;
import defpackage.ig8;
import defpackage.mvg;
import defpackage.nnz0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xb8;
import defpackage.yg8;
import defpackage.zh5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lhoz0;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.CardInputViewController$submitForm$3", f = "CardInputViewController.kt", l = {326, 348, 356}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CardInputViewController$submitForm$3 extends SuspendLambda implements wls {
    final /* synthetic */ nnz0 $data;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardInputViewController$submitForm$3(a aVar, nnz0 nnz0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$data = nnz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardInputViewController$submitForm$3(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardInputViewController$submitForm$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a4, code lost:
    
        if (defpackage.tje.k0(r1, r4, r12) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        if (defpackage.tje.k0(r14, r5, r12) == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CardInputViewController$submitForm$3 cardInputViewController$submitForm$3;
        Object obj2;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            xb8 xb8Var = aVar.b;
            String str = aVar.w;
            TokenizeMethod tokenizeMethod = TokenizeMethod.CARD;
            yg8 yg8Var = aVar.f.a;
            c cVar = yg8Var.e;
            boolean z = yg8Var.b;
            nnz0 nnz0Var = this.$data;
            this.label = 1;
            cardInputViewController$submitForm$3 = this;
            Object b = ((com.yandex.fintechsdk.data.payment.method.impl.internal.card.a) xb8Var).b(str, cVar, nnz0Var, z, tokenizeMethod, cardInputViewController$submitForm$3);
            if (b != coroutineSingletons) {
                obj2 = b;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj3 = this.L$0;
                b.b(obj);
                return new Result(obj3);
            }
            obj2 = this.L$0;
            b.b(obj);
            cardInputViewController$submitForm$3 = this;
            obj3 = obj2;
            a aVar2 = cardInputViewController$submitForm$3.this$0;
            if (Result.a(obj3) != null) {
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                CardInputViewController$submitForm$3$2$1 cardInputViewController$submitForm$3$2$1 = new CardInputViewController$submitForm$3$2$1(aVar2, null);
                cardInputViewController$submitForm$3.L$0 = obj3;
                cardInputViewController$submitForm$3.label = 3;
            }
            return new Result(obj3);
        }
        b.b(obj);
        cardInputViewController$submitForm$3 = this;
        obj2 = ((Result) obj).getValue();
        a aVar3 = cardInputViewController$submitForm$3.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            hoz0 hoz0Var = (hoz0) obj2;
            zh5 zh5Var = aVar3.l;
            ig8 ig8Var = aVar3.f;
            zh5Var.setVariable(ig8Var.a.c, hoz0Var.a);
            String str2 = hoz0Var.b;
            if (str2 != null) {
                aVar3.l.setVariable(ig8Var.a.d, str2);
            }
            sjh sjhVar2 = uyj.a;
            g6u g6uVar2 = o400.a;
            CardInputViewController$submitForm$3$1$2 cardInputViewController$submitForm$3$1$2 = new CardInputViewController$submitForm$3$1$2(aVar3, null);
            cardInputViewController$submitForm$3.L$0 = obj2;
            cardInputViewController$submitForm$3.label = 2;
        }
        obj3 = obj2;
        a aVar22 = cardInputViewController$submitForm$3.this$0;
        if (Result.a(obj3) != null) {
        }
        return new Result(obj3);
    }
}
