package com.ybsdk.feature.savings.internal.views.diffrate;

import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class DiffRateCalendarView$calendarAdapter$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        boolean isLoading;
        isLoading = ((DiffRateCalendarView) this.receiver).isLoading();
        return Boolean.valueOf(isLoading);
    }
}
