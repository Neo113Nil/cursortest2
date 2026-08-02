package com.ybsdk.widgets.common.bottomsheet.daychoosers;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public /* synthetic */ class MonthDayChooserView$adapter$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((MonthDayChooserView) this.receiver).onDayClick(((Number) obj).intValue());
        return zy11.a;
    }
}
