package com.yx360.design.compose.atoms.modal;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yx360.design.compose.atoms.modal.DsModalPhoneKt", f = "DsModalPhone.kt", l = {324}, m = "handleTargetExpanded")
/* loaded from: classes4.dex */
final class DsModalPhoneKt$handleTargetExpanded$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.d(null, 0.0f, this);
    }
}
