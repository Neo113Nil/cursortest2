package com.yandex.go.walking.navigation.impl.ui.overlay;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.walking.navigation.impl.ui.overlay.WalkNavPlacemarksPresenter", f = "WalkNavPlacemarksPresenter.kt", l = {192}, m = "getPinIcon", v = 2)
/* loaded from: classes14.dex */
final class WalkNavPlacemarksPresenter$getPinIcon$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavPlacemarksPresenter$getPinIcon$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.Ng(this.this$0, 0, 0, 0, null, null, this);
    }
}
