package com.yandex.go.preorder.suggested.menu.presenter;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.preorder.suggested.menu.presenter.SuggestMenuPresenter", f = "SuggestMenuPresenter.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "isNeedShowMap", v = 2)
/* loaded from: classes13.dex */
final class SuggestMenuPresenter$isNeedShowMap$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestMenuPresenter$isNeedShowMap$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.Sg(this);
    }
}
