package com.ybsdk.feature.card.internal.presentation.processing;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardReissueDeletionScreenResultErrorType;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardReissueDeletionScreenResultResult;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardReissueDeletionScreenResultSuccessType;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.network.retryPolicy.RetryTimeoutException;
import com.ybsdk.di.modules.features.c;
import com.ybsdk.feature.card.internal.entities.SetCardStatusScreenEntity$SetResultState$StateType;
import defpackage.bo8;
import defpackage.c06;
import defpackage.co8;
import defpackage.h2r0;
import defpackage.i2r0;
import defpackage.j2r0;
import defpackage.k2r0;
import defpackage.mrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pk11;
import defpackage.pz40;
import defpackage.qk11;
import defpackage.r8j0;
import defpackage.rk11;
import defpackage.rt1;
import defpackage.s8j0;
import defpackage.sd8;
import defpackage.sk11;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xc8;
import defpackage.zy11;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.presentation.processing.CardSetStatusProcessingViewModel$loadScreen$2", f = "CardSetStatusProcessingViewModel.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardSetStatusProcessingViewModel$loadScreen$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lsk11;", "Lk2r0;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.card.internal.presentation.processing.CardSetStatusProcessingViewModel$loadScreen$2$3", f = "CardSetStatusProcessingViewModel.kt", l = {102}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.card.internal.presentation.processing.CardSetStatusProcessingViewModel$loadScreen$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ String $operationId;
        final /* synthetic */ String $verificationToken;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(a aVar, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$verificationToken = str;
            this.$operationId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$verificationToken, this.$operationId, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object j;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                String str = (String) this.L$0;
                a aVar = this.this$0;
                com.ybsdk.feature.card.internal.repositories.b bVar = aVar.B;
                String cardId = aVar.E.getCardId();
                String setCardStatusActionType = this.this$0.E.getSetCardStatusActionType();
                String str2 = this.$verificationToken;
                String str3 = this.$operationId;
                this.label = 1;
                j = bVar.j(cardId, setCardStatusActionType, str, str2, str3, this);
                if (j == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                j = ((Result) obj).getValue();
            }
            return new Result(j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSetStatusProcessingViewModel$loadScreen$2(a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$verificationToken = str;
        this.$operationId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardSetStatusProcessingViewModel$loadScreen$2(this.this$0, this.$verificationToken, this.$operationId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardSetStatusProcessingViewModel$loadScreen$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object B;
        r0 r0Var;
        Object value;
        CardCommonEvents$CardReissueDeletionScreenResultSuccessType cardCommonEvents$CardReissueDeletionScreenResultSuccessType;
        CardCommonEvents$CardReissueDeletionScreenResultSuccessType cardCommonEvents$CardReissueDeletionScreenResultSuccessType2;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            String cardId = aVar.E.getCardId();
            String str = this.$verificationToken;
            xc8 xc8Var = new xc8(str, 3);
            sd8 sd8Var = new sd8(21);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, str, this.$operationId, null);
            this.label = 1;
            B = aVar.B(cardId, xc8Var, sd8Var, anonymousClass3, this);
            if (B == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            B = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        boolean z = B instanceof Result.Failure;
        mrp0 mrp0Var = mrp0.b;
        if (!z) {
            sk11 sk11Var = (sk11) B;
            c06 c06Var = aVar2.H;
            AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) c06Var.b;
            CardSetStatusScreenParams cardSetStatusScreenParams = (CardSetStatusScreenParams) c06Var.a;
            if (sk11Var instanceof pk11) {
                appAnalyticsReporter.k.g(null, null, CardCommonEvents$CardReissueDeletionScreenResultResult.TWO_FACTOR, cardSetStatusScreenParams.getSetCardStatusActionType(), cardSetStatusScreenParams.getCardType());
            } else if (sk11Var instanceof qk11) {
                appAnalyticsReporter.k.g(null, CardCommonEvents$CardReissueDeletionScreenResultErrorType.ANTIFRAUD, CardCommonEvents$CardReissueDeletionScreenResultResult.ERROR, cardSetStatusScreenParams.getSetCardStatusActionType(), cardSetStatusScreenParams.getCardType());
            } else {
                if (!(sk11Var instanceof rk11)) {
                    w511.b();
                    return null;
                }
                rt1 rt1Var = appAnalyticsReporter.k;
                k2r0 k2r0Var = (k2r0) ((rk11) sk11Var).a;
                if (k2r0Var instanceof h2r0) {
                    cardCommonEvents$CardReissueDeletionScreenResultSuccessType = CardCommonEvents$CardReissueDeletionScreenResultSuccessType.DEEPLINK;
                } else if (k2r0Var instanceof i2r0) {
                    cardCommonEvents$CardReissueDeletionScreenResultSuccessType = CardCommonEvents$CardReissueDeletionScreenResultSuccessType.DIVKIT;
                } else {
                    if (!(k2r0Var instanceof j2r0)) {
                        w511.b();
                        return null;
                    }
                    cardCommonEvents$CardReissueDeletionScreenResultSuccessType = CardCommonEvents$CardReissueDeletionScreenResultSuccessType.SET_STATE;
                    if (((j2r0) k2r0Var).a != SetCardStatusScreenEntity$SetResultState$StateType.SUCCESS) {
                        cardCommonEvents$CardReissueDeletionScreenResultSuccessType2 = null;
                        boolean z2 = k2r0Var instanceof j2r0;
                        rt1Var.g(cardCommonEvents$CardReissueDeletionScreenResultSuccessType2, (z2 || ((j2r0) k2r0Var).a != SetCardStatusScreenEntity$SetResultState$StateType.FAIL) ? null : CardCommonEvents$CardReissueDeletionScreenResultErrorType.SET_STATE, (z2 || ((j2r0) k2r0Var).a != SetCardStatusScreenEntity$SetResultState$StateType.FAIL) ? CardCommonEvents$CardReissueDeletionScreenResultResult.SUCCESS : CardCommonEvents$CardReissueDeletionScreenResultResult.ERROR, cardSetStatusScreenParams.getSetCardStatusActionType(), cardSetStatusScreenParams.getCardType());
                    }
                }
                cardCommonEvents$CardReissueDeletionScreenResultSuccessType2 = cardCommonEvents$CardReissueDeletionScreenResultSuccessType;
                boolean z22 = k2r0Var instanceof j2r0;
                rt1Var.g(cardCommonEvents$CardReissueDeletionScreenResultSuccessType2, (z22 || ((j2r0) k2r0Var).a != SetCardStatusScreenEntity$SetResultState$StateType.FAIL) ? null : CardCommonEvents$CardReissueDeletionScreenResultErrorType.SET_STATE, (z22 || ((j2r0) k2r0Var).a != SetCardStatusScreenEntity$SetResultState$StateType.FAIL) ? CardCommonEvents$CardReissueDeletionScreenResultResult.SUCCESS : CardCommonEvents$CardReissueDeletionScreenResultResult.ERROR, cardSetStatusScreenParams.getSetCardStatusActionType(), cardSetStatusScreenParams.getCardType());
            }
            if (sk11Var instanceof rk11) {
                k2r0 k2r0Var2 = (k2r0) ((rk11) sk11Var).a;
                pz40 Y = aVar2.Y();
                do {
                    r0Var3 = (r0) Y;
                    value3 = r0Var3.getValue();
                } while (!r0Var3.k(value3, bo8.a((bo8) value3, new r8j0(k2r0Var2, null, 14))));
                if (k2r0Var2 instanceof h2r0) {
                    ((c) aVar2.C).a(((h2r0) k2r0Var2).a);
                }
            } else if (sk11Var instanceof pk11) {
                pk11 pk11Var = (pk11) sk11Var;
                aVar2.Z(new co8(pk11Var.a, pk11Var.b));
            } else {
                if (!(sk11Var instanceof qk11)) {
                    w511.b();
                    return null;
                }
                List singletonList = Collections.singletonList(mrp0Var);
                String str2 = ((qk11) sk11Var).a;
                x4c.g("SetCardStatus 2FA failed", new Exception(str2), null, singletonList, 4);
                pz40 Y2 = aVar2.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, bo8.a((bo8) value2, new s8j0(new Exception(str2)))));
            }
        }
        a aVar3 = this.this$0;
        Throwable a = Result.a(B);
        if (a != null) {
            c06 c06Var2 = aVar3.H;
            CardSetStatusScreenParams cardSetStatusScreenParams2 = (CardSetStatusScreenParams) c06Var2.a;
            ((AppAnalyticsReporter) c06Var2.b).k.g(null, a instanceof FailDataException ? CardCommonEvents$CardReissueDeletionScreenResultErrorType.SERVER_ERROR : ((a instanceof IOException) || (a instanceof RetryTimeoutException.Network)) ? CardCommonEvents$CardReissueDeletionScreenResultErrorType.NETWORK_ERROR : CardCommonEvents$CardReissueDeletionScreenResultErrorType.UNKNOWN, CardCommonEvents$CardReissueDeletionScreenResultResult.ERROR, cardSetStatusScreenParams2.getSetCardStatusActionType(), cardSetStatusScreenParams2.getCardType());
            x4c.g("SetCardStatus load error", a, null, Collections.singletonList(mrp0Var), 4);
            pz40 Y3 = aVar3.Y();
            do {
                r0Var = (r0) Y3;
                value = r0Var.getValue();
            } while (!r0Var.k(value, bo8.a((bo8) value, new s8j0(a))));
        }
        return zy11.a;
    }
}
