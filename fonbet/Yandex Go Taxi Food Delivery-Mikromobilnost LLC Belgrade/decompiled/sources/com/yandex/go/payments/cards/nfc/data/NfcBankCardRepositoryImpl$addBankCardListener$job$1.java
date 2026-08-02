package com.yandex.go.payments.cards.nfc.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.r760;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.cards.nfc.data.NfcBankCardRepositoryImpl$addBankCardListener$job$1", f = "NfcBankCardRepositoryImpl.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class NfcBankCardRepositoryImpl$addBankCardListener$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ r760 $listener;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcBankCardRepositoryImpl$addBankCardListener$job$1(b bVar, r760 r760Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$listener = r760Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NfcBankCardRepositoryImpl$addBankCardListener$job$1(this.this$0, this.$listener, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NfcBankCardRepositoryImpl$addBankCardListener$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            n0 n0Var = bVar.a.c;
            r760 r760Var = this.$listener;
            o oVar = new o(n0Var, new NfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            a aVar = new a(bVar, r760Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
