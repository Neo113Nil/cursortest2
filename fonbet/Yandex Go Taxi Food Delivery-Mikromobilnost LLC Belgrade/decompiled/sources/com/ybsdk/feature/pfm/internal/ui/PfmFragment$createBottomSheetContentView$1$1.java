package com.ybsdk.feature.pfm.internal.ui;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.pfm.internal.domain.entities.FilterInnerContentEntity$Date$SelectionMode;
import defpackage.egq0;
import defpackage.g8e;
import defpackage.kdb1;
import defpackage.l0p;
import defpackage.l4r;
import defpackage.o9b0;
import defpackage.p9b0;
import defpackage.q6i0;
import defpackage.s4r;
import defpackage.tls;
import defpackage.uc5;
import defpackage.w511;
import defpackage.wcb0;
import defpackage.xpb1;
import defpackage.xv10;
import defpackage.zy11;
import java.util.Calendar;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class PfmFragment$createBottomSheetContentView$1$1 extends FunctionReferenceImpl implements tls {
    public PfmFragment$createBottomSheetContentView$1$1(uc5 uc5Var) {
        super(1, uc5Var, b.class, "onDateSelectionChanged", "onDateSelectionChanged(Lcom/ybsdk/widgets/common/rangedatepicker/RangeDatePickerCalendarView$State;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        FilterInnerContentEntity$Date$SelectionMode filterInnerContentEntity$Date$SelectionMode;
        q6i0 q6i0Var = (q6i0) obj;
        Calendar calendar = q6i0Var.d;
        Calendar calendar2 = q6i0Var.c;
        b bVar = (b) this.receiver;
        s4r s4rVar = ((wcb0) bVar.X()).h;
        if (s4rVar instanceof l4r) {
            l4r l4rVar = (l4r) s4rVar;
            bVar.I.getClass();
            Calendar calendar3 = l4rVar.f;
            Calendar calendar4 = l4rVar.g;
            int i = o9b0.b[q6i0Var.b.ordinal()];
            l4r l4rVar2 = null;
            if (i == 1) {
                filterInnerContentEntity$Date$SelectionMode = FilterInnerContentEntity$Date$SelectionMode.START_DATE;
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                filterInnerContentEntity$Date$SelectionMode = FilterInnerContentEntity$Date$SelectionMode.END_DATE;
            }
            boolean z = kdb1.k(calendar3, calendar2) && kdb1.k(calendar4, calendar);
            if (!z || l4rVar.d != filterInnerContentEntity$Date$SelectionMode) {
                egq0 egq0Var = z ? new egq0(calendar3, calendar4) : xpb1.C(calendar2, calendar, l4rVar.c);
                l4rVar2 = l4r.a(l4rVar, filterInnerContentEntity$Date$SelectionMode, egq0Var.a, egq0Var.b, 151);
            }
            if (l4rVar2 != null) {
                xv10 xv10Var = bVar.K;
                String str = l4rVar.b;
                l0p l0pVar = ((AppAnalyticsReporter) xv10Var.a).R;
                p9b0 o = xv10Var.o(l4rVar2);
                LinkedHashMap w = g8e.w(3, "filter_id", str);
                w.put(MetaDataField.DATE_FIELD, o.a());
                l0pVar.a.a("pfm.analytics.filter.details.item.click", w);
                bVar.B0(l4rVar2);
            }
        }
        return zy11.a;
    }
}
