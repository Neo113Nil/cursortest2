package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.model.GuessAmount;
import defpackage.evu0;
import defpackage.j831;
import defpackage.jv5;
import defpackage.m831;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tu5;
import defpackage.tx90;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltu5;", "<anonymous>", "(Ltse;)Ltu5;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.data.ConfirmCardV2Interactor$guessAmount$2", f = "ConfirmCardV2Interactor.kt", l = {HProv.PP_BIO_STATISTICA_LEN, 105}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ConfirmCardV2Interactor$guessAmount$2 extends SuspendLambda implements wls {
    final /* synthetic */ jv5 $context;
    final /* synthetic */ GuessAmount $guessAmount;
    final /* synthetic */ j831 $params;
    final /* synthetic */ tx90 $profile;
    final /* synthetic */ boolean $required3dsPolling;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmCardV2Interactor$guessAmount$2(j831 j831Var, c cVar, jv5 jv5Var, tx90 tx90Var, GuessAmount guessAmount, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$params = j831Var;
        this.this$0 = cVar;
        this.$context = jv5Var;
        this.$profile = tx90Var;
        this.$guessAmount = guessAmount;
        this.$required3dsPolling = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmCardV2Interactor$guessAmount$2(this.$params, this.this$0, this.$context, this.$profile, this.$guessAmount, this.$required3dsPolling, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmCardV2Interactor$guessAmount$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r13 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (r13 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return (tu5) obj;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return (tu5) obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str = this.$params.b;
        if (str == null || evu0.J(str)) {
            d dVar = this.this$0.h;
            jv5 jv5Var = this.$context;
            tx90 tx90Var = this.$profile;
            m831 m831Var = this.$params.a;
            GuessAmount guessAmount = this.$guessAmount;
            boolean z = this.$required3dsPolling;
            this.label = 1;
            dVar.a.getClass();
            sjh sjhVar = uyj.a;
            obj = tje.k0(mdh.b, new GuessAmountInteractor$guessAmountNoVerification$2(m831Var, dVar, z, tx90Var, jv5Var, guessAmount, null), this);
        } else {
            d dVar2 = this.this$0.h;
            jv5 jv5Var2 = this.$context;
            tx90 tx90Var2 = this.$profile;
            j831 j831Var = this.$params;
            GuessAmount guessAmount2 = this.$guessAmount;
            boolean z2 = this.$required3dsPolling;
            this.label = 2;
            dVar2.a.getClass();
            sjh sjhVar2 = uyj.a;
            obj = tje.k0(mdh.b, new GuessAmountInteractor$guessAmountWithVerification$2(dVar2, jv5Var2, j831Var, tx90Var2, guessAmount2, z2, null), this);
        }
        return coroutineSingletons;
    }
}
