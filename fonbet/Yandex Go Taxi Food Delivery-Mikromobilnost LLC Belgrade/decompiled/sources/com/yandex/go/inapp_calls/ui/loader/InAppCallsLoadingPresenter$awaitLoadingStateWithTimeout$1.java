package com.yandex.go.inapp_calls.ui.loader;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.inapp_calls.ui.loader.InAppCallsLoadingPresenter", f = "InAppCallsLoadingPresenter.kt", l = {HProv.PP_HASHOID}, m = "awaitLoadingStateWithTimeout", v = 2)
/* loaded from: classes12.dex */
final class InAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.Kg(this.this$0, this);
    }
}
