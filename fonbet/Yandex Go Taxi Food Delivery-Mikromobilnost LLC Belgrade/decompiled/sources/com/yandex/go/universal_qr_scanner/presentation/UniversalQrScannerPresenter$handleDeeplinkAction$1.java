package com.yandex.go.universal_qr_scanner.presentation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.universal_qr_scanner.presentation.UniversalQrScannerPresenter", f = "UniversalQrScannerPresenter.kt", l = {HProv.PP_CACHE_SIZE}, m = "handleDeeplinkAction", v = 2)
/* loaded from: classes14.dex */
final class UniversalQrScannerPresenter$handleDeeplinkAction$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalQrScannerPresenter$handleDeeplinkAction$1(d dVar, Continuation continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.Kg(this.this$0, null, this);
    }
}
