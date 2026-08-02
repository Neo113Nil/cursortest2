package com.ybsdk.feature.transfer.internal.screens.result.domain;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.transfer.api.TransferResultScreenParams;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.wls;
import defpackage.xc8;
import defpackage.zp01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Layp0;", "Let01;", "Lcom/ybsdk/feature/transfer/internal/screens/result/domain/TransferStatusEntity2fa;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.internal.screens.result.domain.TransferStatusInteractor$callConfirm$3", f = "TransferStatusInteractor.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferStatusInteractor$callConfirm$3 extends SuspendLambda implements wls {
    final /* synthetic */ Money $money;
    final /* synthetic */ TransferResultScreenParams $screenArguments;
    final /* synthetic */ String $verificationToken;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Liyd0;", "Layp0;", "Let01;", "Lcom/ybsdk/feature/transfer/internal/screens/result/domain/TransferStatusEntity2fa;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.transfer.internal.screens.result.domain.TransferStatusInteractor$callConfirm$3$3", f = "TransferStatusInteractor.kt", l = {65}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.transfer.internal.screens.result.domain.TransferStatusInteractor$callConfirm$3$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ int $attemptNumber;
        final /* synthetic */ Money $money;
        final /* synthetic */ TransferResultScreenParams $screenArguments;
        final /* synthetic */ String $verificationToken;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(b bVar, Money money, String str, TransferResultScreenParams transferResultScreenParams, int i, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$money = money;
            this.$verificationToken = str;
            this.$screenArguments = transferResultScreenParams;
            this.$attemptNumber = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$money, this.$verificationToken, this.$screenArguments, this.$attemptNumber, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                String str = (String) this.L$0;
                b bVar = this.this$0;
                Money money = this.$money;
                String str2 = this.$verificationToken;
                String agreementId = this.$screenArguments.getAgreementId();
                int i2 = this.$attemptNumber;
                this.label = 1;
                c = b.c(bVar, money, str, str2, agreementId, i2, this);
                if (c == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                c = ((Result) obj).getValue();
            }
            return new Result(c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferStatusInteractor$callConfirm$3(b bVar, TransferResultScreenParams transferResultScreenParams, String str, Money money, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$screenArguments = transferResultScreenParams;
        this.$verificationToken = str;
        this.$money = money;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransferStatusInteractor$callConfirm$3 transferStatusInteractor$callConfirm$3 = new TransferStatusInteractor$callConfirm$3(this.this$0, this.$screenArguments, this.$verificationToken, this.$money, continuation);
        transferStatusInteractor$callConfirm$3.I$0 = ((tq11) obj).a;
        return transferStatusInteractor$callConfirm$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        TransferStatusInteractor$callConfirm$3 transferStatusInteractor$callConfirm$3 = new TransferStatusInteractor$callConfirm$3(this.this$0, this.$screenArguments, this.$verificationToken, this.$money, (Continuation) obj2);
        transferStatusInteractor$callConfirm$3.I$0 = i;
        return transferStatusInteractor$callConfirm$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object B;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = this.I$0;
            com.ybsdk.feature.transfer.internal.screens.result.presentation.b bVar = this.this$0.e;
            String transferId = this.$screenArguments.getTransferId();
            if (transferId == null) {
                transferId = "";
            }
            String str = this.$verificationToken;
            String str2 = transferId;
            xc8 xc8Var = new xc8(str, 23);
            zp01 zp01Var = new zp01(6);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$money, str, this.$screenArguments, i2, null);
            this.label = 1;
            B = bVar.B(str2, xc8Var, zp01Var, anonymousClass3, this);
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
