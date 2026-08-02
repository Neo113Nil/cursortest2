package com.ybsdk.screens.divbottomsheet;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.screens.divbottomsheet.DivBottomSheetResponseKt", f = "DivBottomSheetResponse.kt", l = {15}, m = "toEntity")
/* loaded from: classes2.dex */
final class DivBottomSheetResponseKt$toEntity$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.a(null, this);
    }
}
