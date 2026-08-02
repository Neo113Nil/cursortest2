package com.ybsdk.feature.pdf.internal.data;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.pdf.internal.data.PdfRepository", f = "PdfRepository.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA, 80}, m = "getDocumentStatus-0hPOyJY")
/* loaded from: classes3.dex */
final class PdfRepository$getDocumentStatus$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfRepository$getDocumentStatus$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object f = this.this$0.f(0, null, this);
        return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : new Result(f);
    }
}
