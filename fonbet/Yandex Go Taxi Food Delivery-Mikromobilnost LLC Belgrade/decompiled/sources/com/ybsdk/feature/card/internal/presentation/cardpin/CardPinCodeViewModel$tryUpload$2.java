package com.ybsdk.feature.card.internal.presentation.cardpin;

import com.ybsdk.core.utils.d;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.card.internal.interactors.h;
import defpackage.b64;
import defpackage.mf8;
import defpackage.mvg;
import defpackage.nl8;
import defpackage.ny61;
import defpackage.pk11;
import defpackage.pz40;
import defpackage.qk11;
import defpackage.ql8;
import defpackage.qn8;
import defpackage.rk11;
import defpackage.sk11;
import defpackage.tfl0;
import defpackage.tse;
import defpackage.vk11;
import defpackage.w511;
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
@mvg(c = "com.ybsdk.feature.card.internal.presentation.cardpin.CardPinCodeViewModel$tryUpload$2", f = "CardPinCodeViewModel.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardPinCodeViewModel$tryUpload$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $pin;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lsk11;", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.card.internal.presentation.cardpin.CardPinCodeViewModel$tryUpload$2$1", f = "CardPinCodeViewModel.kt", l = {114}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.card.internal.presentation.cardpin.CardPinCodeViewModel$tryUpload$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $operationId;
        final /* synthetic */ String $pin;
        final /* synthetic */ String $verificationToken;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$pin = str;
            this.$verificationToken = str2;
            this.$operationId = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$pin, this.$verificationToken, this.$operationId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            Object a;
            r0 r0Var;
            Object value;
            r0 r0Var2;
            Object value2;
            r0 r0Var3;
            Object value3;
            r0 r0Var4;
            Object value4;
            nl8 nl8Var = nl8.d;
            nl8 nl8Var2 = nl8.b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                String str = (String) this.L$0;
                a aVar = this.this$0;
                h hVar = aVar.B;
                String cardId = aVar.E.getCardId();
                String str2 = this.$pin;
                String str3 = this.$verificationToken;
                String str4 = this.$operationId;
                this.label = 1;
                anonymousClass1 = this;
                a = hVar.a(cardId, str2, str, str3, str4, anonymousClass1);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                a = ((Result) obj).getValue();
                anonymousClass1 = this;
            }
            a aVar2 = anonymousClass1.this$0;
            String str5 = anonymousClass1.$pin;
            if (!(a instanceof Result.Failure)) {
                sk11 sk11Var = (sk11) a;
                if (sk11Var instanceof rk11) {
                    pz40 Y = aVar2.Y();
                    do {
                        r0Var4 = (r0) Y;
                        value4 = r0Var4.getValue();
                    } while (!r0Var4.k(value4, nl8Var));
                } else if (sk11Var instanceof qk11) {
                    qk11 qk11Var = (qk11) sk11Var;
                    x4c.g("Set card pin error", null, b64.l("error=", qk11Var.a, " description=", qk11Var.b), null, 10);
                    pz40 Y2 = aVar2.Y();
                    do {
                        r0Var3 = (r0) Y2;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, nl8Var2));
                } else {
                    if (!(sk11Var instanceof pk11)) {
                        w511.b();
                        return null;
                    }
                    tfl0 tfl0Var = aVar2.C;
                    qn8 qn8Var = aVar2.D;
                    Text.Empty empty = Text.Empty.INSTANCE;
                    pk11 pk11Var = (pk11) sk11Var;
                    tfl0Var.h(((mf8) qn8Var).b(pk11Var.a, CardSecondFactorHelper$Request.SET_PIN));
                    pz40 Y3 = aVar2.Y();
                    do {
                        r0Var2 = (r0) Y3;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, new ql8(new vk11(str5, pk11Var.b))));
                }
            }
            a aVar3 = anonymousClass1.this$0;
            Throwable a2 = Result.a(a);
            if (a2 != null) {
                x4c.g("Set card pin failed", a2, null, null, 12);
                pz40 Y4 = aVar3.Y();
                do {
                    r0Var = (r0) Y4;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, nl8Var2));
            }
            return new Result(a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardPinCodeViewModel$tryUpload$2(a aVar, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$pin = str;
        this.$verificationToken = str2;
        this.$operationId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardPinCodeViewModel$tryUpload$2(this.this$0, this.$pin, this.$verificationToken, this.$operationId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardPinCodeViewModel$tryUpload$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, this.$pin, this.$verificationToken, this.$operationId, null);
            this.label = 1;
            if (d.a(aVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            ((Result) obj).getClass();
        }
        return zy11.a;
    }
}
