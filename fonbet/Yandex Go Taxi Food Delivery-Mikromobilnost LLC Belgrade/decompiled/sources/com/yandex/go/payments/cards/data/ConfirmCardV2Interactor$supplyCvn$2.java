package com.yandex.go.payments.cards.data;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.biw0;
import defpackage.j831;
import defpackage.jv5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.tx90;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltu5;", "<anonymous>", "(Ltse;)Ltu5;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.data.ConfirmCardV2Interactor$supplyCvn$2", f = "ConfirmCardV2Interactor.kt", l = {HProv.PP_VERSION_EX, PollMessageDraft.MAX_ANSWER_LENGTH}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ConfirmCardV2Interactor$supplyCvn$2 extends SuspendLambda implements wls {
    final /* synthetic */ jv5 $context;
    final /* synthetic */ j831 $params;
    final /* synthetic */ tx90 $profile;
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ boolean $required3dsPolling;
    final /* synthetic */ biw0 $supplyPaymentDataFactory;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmCardV2Interactor$supplyCvn$2(c cVar, String str, tx90 tx90Var, biw0 biw0Var, jv5 jv5Var, j831 j831Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$purchaseToken = str;
        this.$profile = tx90Var;
        this.$supplyPaymentDataFactory = biw0Var;
        this.$context = jv5Var;
        this.$params = j831Var;
        this.$required3dsPolling = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmCardV2Interactor$supplyCvn$2(this.this$0, this.$purchaseToken, this.$profile, this.$supplyPaymentDataFactory, this.$context, this.$params, this.$required3dsPolling, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmCardV2Interactor$supplyCvn$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r7.a(r1, r4, r5, r6) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0.d;
            String str = this.$purchaseToken;
            tx90 tx90Var = this.$profile;
            biw0 biw0Var = this.$supplyPaymentDataFactory;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        c cVar = this.this$0;
        jv5 jv5Var = this.$context;
        j831 j831Var = this.$params;
        boolean z = this.$required3dsPolling;
        this.label = 2;
        Object g = cVar.g(jv5Var, j831Var, z, this);
        return g == coroutineSingletons ? coroutineSingletons : g;
    }
}
