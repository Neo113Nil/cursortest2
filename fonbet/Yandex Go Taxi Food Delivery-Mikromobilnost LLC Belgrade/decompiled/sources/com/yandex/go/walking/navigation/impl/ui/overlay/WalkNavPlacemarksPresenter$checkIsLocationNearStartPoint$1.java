package com.yandex.go.walking.navigation.impl.ui.overlay;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.walking.navigation.impl.ui.overlay.WalkNavPlacemarksPresenter", f = "WalkNavPlacemarksPresenter.kt", l = {104}, m = "checkIsLocationNearStartPoint", v = 2)
/* loaded from: classes14.dex */
final class WalkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.Mg(this.this$0, null, this);
    }
}
