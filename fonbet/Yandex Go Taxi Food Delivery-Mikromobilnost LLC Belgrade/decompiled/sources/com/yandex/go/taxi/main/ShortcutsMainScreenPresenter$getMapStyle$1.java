package com.yandex.go.taxi.main;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.main.ShortcutsMainScreenPresenter", f = "ShortcutsMainScreenPresenter.kt", l = {149}, m = "getMapStyle", v = 2)
/* loaded from: classes14.dex */
final class ShortcutsMainScreenPresenter$getMapStyle$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutsMainScreenPresenter$getMapStyle$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return h.Kg(this.this$0, this);
    }
}
