package com.yx360.design.compose.atoms.modal;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yx360.design.compose.atoms.modal.ModalNestedScrollConnection", f = "DsModalPhone.kt", l = {393}, m = "onPreFling-QWom1Mo")
/* loaded from: classes4.dex */
final class ModalNestedScrollConnection$onPreFling$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalNestedScrollConnection$onPreFling$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo33onPreFlingQWom1Mo(0L, this);
    }
}
