package com.yandex.go.summary.ui.compose.common.layout;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.summary.ui.compose.common.layout.FirstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2", f = "FirstHeightSecondDrawLayout.kt", l = {HProv.PP_DHOID, HProv.PP_BIO_STATISTICA_LEN}, m = "emit", v = 2)
/* loaded from: classes14.dex */
public final class FirstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1$invokeSuspend$$inlined$safeCollect$2$1(a aVar, Continuation continuation) {
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
