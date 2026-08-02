package com.yandex.go.payments.cards.nfc.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.cards.nfc.data.NfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2", f = "NfcBankCardRepositoryImpl.kt", l = {HProv.PP_REBOOT}, m = "emit", v = 2)
/* loaded from: classes13.dex */
public final class NfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1(a aVar, Continuation continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
