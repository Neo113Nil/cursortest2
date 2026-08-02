package com.yandex.payment.sdk.nfcscanner.tools;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.payment.sdk.nfcscanner.tools.NfcController$collectNfcHardwareState$1$1", f = "NfcController.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "emit", v = 1)
/* loaded from: classes2.dex */
final class NfcController$collectNfcHardwareState$1$1$emit$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcController$collectNfcHardwareState$1$1$emit$1(b bVar, Continuation continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(false, this);
    }
}
