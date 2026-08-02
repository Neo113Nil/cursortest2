package com.ybsdk.feature.savings.internal.entities;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.savings.internal.entities.DivkitDashboardItemKt", f = "DivkitDashboardItem.kt", l = {16}, m = "toDashboardItem")
/* loaded from: classes3.dex */
final class DivkitDashboardItemKt$toDashboardItem$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(null, null, this);
    }
}
