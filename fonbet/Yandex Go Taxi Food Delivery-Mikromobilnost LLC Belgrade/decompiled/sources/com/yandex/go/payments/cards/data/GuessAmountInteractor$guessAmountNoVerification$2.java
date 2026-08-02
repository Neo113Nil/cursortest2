package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.model.GuessAmount;
import com.yandex.go.payments.cards.data.model.Verification;
import defpackage.evu0;
import defpackage.j831;
import defpackage.jv5;
import defpackage.m831;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p731;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tx90;
import defpackage.uyj;
import defpackage.wls;
import defpackage.yfa;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.payments.cards.dto.VerificationStatus;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltu5;", "<anonymous>", "(Ltse;)Ltu5;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.data.GuessAmountInteractor$guessAmountNoVerification$2", f = "GuessAmountInteractor.kt", l = {47, 71}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class GuessAmountInteractor$guessAmountNoVerification$2 extends SuspendLambda implements wls {
    final /* synthetic */ jv5 $context;
    final /* synthetic */ GuessAmount $guessAmount;
    final /* synthetic */ m831 $payment;
    final /* synthetic */ tx90 $profile;
    final /* synthetic */ boolean $required3dsPolling;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuessAmountInteractor$guessAmountNoVerification$2(m831 m831Var, d dVar, boolean z, tx90 tx90Var, jv5 jv5Var, GuessAmount guessAmount, Continuation continuation) {
        super(2, continuation);
        this.$payment = m831Var;
        this.this$0 = dVar;
        this.$required3dsPolling = z;
        this.$profile = tx90Var;
        this.$context = jv5Var;
        this.$guessAmount = guessAmount;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GuessAmountInteractor$guessAmountNoVerification$2(this.$payment, this.this$0, this.$required3dsPolling, this.$profile, this.$context, this.$guessAmount, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GuessAmountInteractor$guessAmountNoVerification$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r2 == r1) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object a;
        VerificationStatus verificationStatus;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            str = "random_amt";
            j831 j831Var = new j831(this.$payment, null, "random_amt", null, false, null, null, null, null, UUID.randomUUID().toString(), null, null, 14328);
            yfa yfaVar = this.this$0.b;
            boolean z = this.$required3dsPolling;
            this.L$0 = "random_amt";
            this.L$1 = null;
            this.label = 1;
            a = ((c) yfaVar.a).f.a(j831Var, z, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return obj;
            }
            String str2 = (String) this.L$0;
            kotlin.b.b(obj);
            str = str2;
            a = obj;
        }
        p731 p731Var = (p731) a;
        if (p731Var == null) {
            ny61.r("VerificationData must be not null");
            return null;
        }
        Verification verification = p731Var.b;
        String str3 = verification.a;
        if (str3 == null || evu0.J(str3) || (verificationStatus = verification.c) != VerificationStatus.AMOUNT_EXPECTED) {
            ny61.r("Verification for random amount is in invalid state");
            return null;
        }
        j831 j831Var2 = new j831(this.$payment, verification.a, str, p731Var.c, false, verificationStatus, verification.i, null, null, null, this.$profile, null, 8192);
        ((c) this.this$0.b.a).i = j831Var2;
        d dVar = this.this$0;
        jv5 jv5Var = this.$context;
        tx90 tx90Var = this.$profile;
        GuessAmount guessAmount = this.$guessAmount;
        boolean z2 = this.$required3dsPolling;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
        dVar.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new GuessAmountInteractor$guessAmountWithVerification$2(dVar, jv5Var, j831Var2, tx90Var, guessAmount, z2, null), this);
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
