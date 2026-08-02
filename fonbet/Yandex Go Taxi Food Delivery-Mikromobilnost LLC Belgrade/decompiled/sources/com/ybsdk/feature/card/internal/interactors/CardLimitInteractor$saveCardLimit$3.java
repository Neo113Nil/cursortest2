package com.ybsdk.feature.card.internal.interactors;

import defpackage.d6v;
import defpackage.il8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sd8;
import defpackage.tq11;
import defpackage.wls;
import defpackage.xc8;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Layp0;", "Lggy;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.interactors.CardLimitInteractor$saveCardLimit$3", f = "CardLimitInteractor.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardLimitInteractor$saveCardLimit$3 extends SuspendLambda implements wls {
    final /* synthetic */ BigDecimal $amountInput;
    final /* synthetic */ String $cardId;
    final /* synthetic */ d6v $idempotencyTokenProvider;
    final /* synthetic */ il8 $selectedLimit;
    final /* synthetic */ String $verificationToken;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Liyd0;", "Layp0;", "Lggy;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.card.internal.interactors.CardLimitInteractor$saveCardLimit$3$3", f = "CardLimitInteractor.kt", l = {36}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.card.internal.interactors.CardLimitInteractor$saveCardLimit$3$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ BigDecimal $amountInput;
        final /* synthetic */ int $attemptNumber;
        final /* synthetic */ String $cardId;
        final /* synthetic */ il8 $selectedLimit;
        final /* synthetic */ String $verificationToken;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(g gVar, String str, il8 il8Var, BigDecimal bigDecimal, String str2, int i, Continuation continuation) {
            super(2, continuation);
            this.this$0 = gVar;
            this.$cardId = str;
            this.$selectedLimit = il8Var;
            this.$amountInput = bigDecimal;
            this.$verificationToken = str2;
            this.$attemptNumber = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$cardId, this.$selectedLimit, this.$amountInput, this.$verificationToken, this.$attemptNumber, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                String str = (String) this.L$0;
                com.ybsdk.feature.card.internal.data.a aVar = this.this$0.a;
                String str2 = this.$cardId;
                String str3 = this.$selectedLimit.a;
                BigDecimal bigDecimal = this.$amountInput;
                String str4 = this.$verificationToken;
                int i2 = this.$attemptNumber;
                this.label = 1;
                b = aVar.b(str2, str3, bigDecimal, str, str4, i2, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                b = ((Result) obj).getValue();
            }
            return new Result(b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardLimitInteractor$saveCardLimit$3(d6v d6vVar, String str, String str2, g gVar, il8 il8Var, BigDecimal bigDecimal, Continuation continuation) {
        super(2, continuation);
        this.$idempotencyTokenProvider = d6vVar;
        this.$cardId = str;
        this.$verificationToken = str2;
        this.this$0 = gVar;
        this.$selectedLimit = il8Var;
        this.$amountInput = bigDecimal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardLimitInteractor$saveCardLimit$3 cardLimitInteractor$saveCardLimit$3 = new CardLimitInteractor$saveCardLimit$3(this.$idempotencyTokenProvider, this.$cardId, this.$verificationToken, this.this$0, this.$selectedLimit, this.$amountInput, continuation);
        cardLimitInteractor$saveCardLimit$3.I$0 = ((tq11) obj).a;
        return cardLimitInteractor$saveCardLimit$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        CardLimitInteractor$saveCardLimit$3 cardLimitInteractor$saveCardLimit$3 = new CardLimitInteractor$saveCardLimit$3(this.$idempotencyTokenProvider, this.$cardId, this.$verificationToken, this.this$0, this.$selectedLimit, this.$amountInput, (Continuation) obj2);
        cardLimitInteractor$saveCardLimit$3.I$0 = i;
        return cardLimitInteractor$saveCardLimit$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object B;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = this.I$0;
            d6v d6vVar = this.$idempotencyTokenProvider;
            String str = this.$cardId;
            String str2 = this.$verificationToken;
            xc8 xc8Var = new xc8(str2, 2);
            sd8 sd8Var = new sd8(11);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, str, this.$selectedLimit, this.$amountInput, str2, i2, null);
            this.label = 1;
            B = d6vVar.B(str, xc8Var, sd8Var, anonymousClass3, this);
            if (B == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            B = ((Result) obj).getValue();
        }
        return new Result(B);
    }
}
