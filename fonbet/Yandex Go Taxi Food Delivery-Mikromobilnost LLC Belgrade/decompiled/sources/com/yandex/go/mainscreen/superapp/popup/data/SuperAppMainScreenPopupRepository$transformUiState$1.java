package com.yandex.go.mainscreen.superapp.popup.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.mainscreen.superapp.popup.data.SuperAppMainScreenPopupRepository", f = "SuperAppMainScreenPopupRepository.kt", l = {HProv.ALG_SID_GR3410_12_256, HProv.ALG_SID_SHA3_256, HProv.ALG_SID_SHA3_224, HProv.PP_RESERVED1, HProv.PP_DHOID, 101, 103, 102, HProv.PP_NK_SYNC}, m = "transformUiState", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainScreenPopupRepository$transformUiState$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenPopupRepository$transformUiState$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.b(this.this$0, null, null, this);
    }
}
