package com.yandex.go.navigator.alt_select;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.alt_select.AltSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2", f = "AltSelectPresenter.kt", l = {HProv.PP_RESERVED1}, m = "emit", v = 2)
/* loaded from: classes12.dex */
public final class AltSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AltSelectPresenter$handleFocusOnRoute$$inlined$safeCollectIn$1$2$1(b bVar, Continuation continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
