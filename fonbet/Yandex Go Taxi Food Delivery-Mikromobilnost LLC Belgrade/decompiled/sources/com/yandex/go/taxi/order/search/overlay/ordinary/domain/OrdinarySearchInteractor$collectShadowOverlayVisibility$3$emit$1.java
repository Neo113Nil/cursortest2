package com.yandex.go.taxi.order.search.overlay.ordinary.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.search.overlay.ordinary.domain.OrdinarySearchInteractor$collectShadowOverlayVisibility$3", f = "OrdinarySearchInteractor.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "emit", v = 2)
/* loaded from: classes14.dex */
final class OrdinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrdinarySearchInteractor$collectShadowOverlayVisibility$3$emit$1(c cVar, Continuation continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
