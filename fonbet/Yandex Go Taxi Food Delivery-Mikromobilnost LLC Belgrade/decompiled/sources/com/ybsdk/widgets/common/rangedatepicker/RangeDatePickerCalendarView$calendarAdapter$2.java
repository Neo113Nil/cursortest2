package com.ybsdk.widgets.common.rangedatepicker;

import defpackage.tls;
import defpackage.zy11;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class RangeDatePickerCalendarView$calendarAdapter$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((RangeDatePickerCalendarView) this.receiver).onDaySelected((Calendar) obj);
        return zy11.a;
    }
}
