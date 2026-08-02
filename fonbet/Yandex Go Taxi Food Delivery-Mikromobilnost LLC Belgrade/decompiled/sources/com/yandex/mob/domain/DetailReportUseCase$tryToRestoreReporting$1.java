package com.yandex.mob.domain;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mob.domain.DetailReportUseCase", f = "DetailReportUseCase.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "tryToRestoreReporting")
/* loaded from: classes8.dex */
final class DetailReportUseCase$tryToRestoreReporting$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailReportUseCase$tryToRestoreReporting$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
