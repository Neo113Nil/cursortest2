package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.model.GuessAmount;
import defpackage.j831;
import defpackage.jv5;
import defpackage.k831;
import defpackage.m831;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p731;
import defpackage.tse;
import defpackage.tx90;
import defpackage.wls;
import defpackage.yfa;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltu5;", "<anonymous>", "(Ltse;)Ltu5;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.data.GuessAmountInteractor$guessAmountWithVerification$2", f = "GuessAmountInteractor.kt", l = {MSException.ERROR_INVALID_PASSWORD, HProv.PP_SIGNATUREOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class GuessAmountInteractor$guessAmountWithVerification$2 extends SuspendLambda implements wls {
    final /* synthetic */ jv5 $context;
    final /* synthetic */ GuessAmount $guessAmount;
    final /* synthetic */ j831 $params;
    final /* synthetic */ tx90 $profile;
    final /* synthetic */ boolean $required3dsPolling;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuessAmountInteractor$guessAmountWithVerification$2(d dVar, jv5 jv5Var, j831 j831Var, tx90 tx90Var, GuessAmount guessAmount, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$context = jv5Var;
        this.$params = j831Var;
        this.$profile = tx90Var;
        this.$guessAmount = guessAmount;
        this.$required3dsPolling = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GuessAmountInteractor$guessAmountWithVerification$2(this.this$0, this.$context, this.$params, this.$profile, this.$guessAmount, this.$required3dsPolling, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GuessAmountInteractor$guessAmountWithVerification$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r13 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean c;
        GuessAmountInteractor$guessAmountWithVerification$2 guessAmountInteractor$guessAmountWithVerification$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c = ((c) this.this$0.b.a).c(this.$context);
            j831 j831Var = this.$params;
            m831 m831Var = j831Var.a;
            k831 k831Var = m831Var instanceof k831 ? (k831) m831Var : null;
            String str = k831Var != null ? k831Var.c : null;
            d dVar = this.this$0;
            jv5 jv5Var = this.$context;
            tx90 tx90Var = this.$profile;
            GuessAmount guessAmount = this.$guessAmount;
            boolean z = this.$required3dsPolling;
            this.L$0 = str;
            this.Z$0 = c;
            this.label = 1;
            guessAmountInteractor$guessAmountWithVerification$2 = this;
            obj = d.a(dVar, jv5Var, tx90Var, j831Var, guessAmount, z, guessAmountInteractor$guessAmountWithVerification$2);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return obj;
            }
            c = this.Z$0;
            kotlin.b.b(obj);
            guessAmountInteractor$guessAmountWithVerification$2 = this;
        }
        yfa yfaVar = guessAmountInteractor$guessAmountWithVerification$2.this$0.b;
        jv5 jv5Var2 = guessAmountInteractor$guessAmountWithVerification$2.$context;
        guessAmountInteractor$guessAmountWithVerification$2.L$0 = null;
        guessAmountInteractor$guessAmountWithVerification$2.L$1 = null;
        guessAmountInteractor$guessAmountWithVerification$2.Z$0 = c;
        guessAmountInteractor$guessAmountWithVerification$2.label = 2;
        Object h = ((c) yfaVar.a).h(jv5Var2, c, (p731) obj, guessAmountInteractor$guessAmountWithVerification$2);
        return h == coroutineSingletons ? coroutineSingletons : h;
    }
}
