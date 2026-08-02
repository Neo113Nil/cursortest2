package com.ybsdk.feature.divkit.internal.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.divkit.internal.ui.DivCustomPlusBadgeView", f = "DivCustomPlusBadgeViewAdapter.kt", l = {91}, m = "createAndAddPlusPlaqueView")
/* loaded from: classes3.dex */
public final class DivCustomPlusBadgeView$createAndAddPlusPlaqueView$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DivCustomPlusBadgeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivCustomPlusBadgeView$createAndAddPlusPlaqueView$1(DivCustomPlusBadgeView divCustomPlusBadgeView, Continuation continuation) {
        super(continuation);
        this.this$0 = divCustomPlusBadgeView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object createAndAddPlusPlaqueView;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        createAndAddPlusPlaqueView = this.this$0.createAndAddPlusPlaqueView(null, this);
        return createAndAddPlusPlaqueView;
    }
}
