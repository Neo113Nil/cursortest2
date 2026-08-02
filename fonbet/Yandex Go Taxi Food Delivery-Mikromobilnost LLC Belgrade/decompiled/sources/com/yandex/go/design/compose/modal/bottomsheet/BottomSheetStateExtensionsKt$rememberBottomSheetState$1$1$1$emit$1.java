package com.yandex.go.design.compose.modal.bottomsheet;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.design.compose.modal.bottomsheet.BottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1", f = "BottomSheetStateExtensions.kt", l = {HProv.ALG_SID_NO_HASH, HProv.ALG_SID_KECCAK_256}, m = "emit", v = 2)
/* loaded from: classes12.dex */
final class BottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1(a aVar, Continuation continuation) {
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
