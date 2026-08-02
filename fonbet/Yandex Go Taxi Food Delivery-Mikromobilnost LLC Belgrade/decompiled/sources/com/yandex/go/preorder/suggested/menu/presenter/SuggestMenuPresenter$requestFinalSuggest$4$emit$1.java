package com.yandex.go.preorder.suggested.menu.presenter;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.preorder.suggested.menu.presenter.SuggestMenuPresenter$requestFinalSuggest$4", f = "SuggestMenuPresenter.kt", l = {HProv.PP_EXPORT_CSP, 173, 174}, m = "emit", v = 2)
/* loaded from: classes13.dex */
final class SuggestMenuPresenter$requestFinalSuggest$4$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestMenuPresenter$requestFinalSuggest$4$emit$1(a aVar, Continuation continuation) {
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
