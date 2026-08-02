package com.yandex.go.summary.interactor.common.state;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.summary.interactor.common.state.SelectorUiStateInteractor", f = "SelectorUiStateInteractor.kt", l = {HProv.PP_VERSION_EX}, m = "toDefaultSelectorUiState", v = 2)
/* loaded from: classes14.dex */
final class SelectorUiStateInteractor$toDefaultSelectorUiState$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorUiStateInteractor$toDefaultSelectorUiState$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.e(this.this$0, null, this);
    }
}
