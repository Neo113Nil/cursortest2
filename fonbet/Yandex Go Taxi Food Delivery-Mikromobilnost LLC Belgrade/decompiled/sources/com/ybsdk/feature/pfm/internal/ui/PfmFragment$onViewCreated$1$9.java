package com.ybsdk.feature.pfm.internal.ui;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.bbb0;
import defpackage.dbb0;
import defpackage.g8e;
import defpackage.j4r;
import defpackage.l0p;
import defpackage.l4r;
import defpackage.s4r;
import defpackage.tdb0;
import defpackage.tls;
import defpackage.uc5;
import defpackage.vab0;
import defpackage.wcb0;
import defpackage.xv10;
import defpackage.yab0;
import defpackage.zy11;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class PfmFragment$onViewCreated$1$9 extends FunctionReferenceImpl implements tls {
    public PfmFragment$onViewCreated$1$9(uc5 uc5Var) {
        super(1, uc5Var, b.class, "onFilterClick", "onFilterClick(Lcom/ybsdk/feature/pfm/internal/ui/viewitems/PfmFilterViewItem;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Set e;
        Object obj2;
        Calendar calendar;
        dbb0 dbb0Var = (dbb0) obj;
        b bVar = (b) this.receiver;
        xv10 xv10Var = bVar.K;
        if ((dbb0Var instanceof bbb0) && (e = ((wcb0) bVar.X()).e()) != null) {
            Iterator it = e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((j4r) obj2).a.equals(((bbb0) dbb0Var).d)) {
                    break;
                }
            }
            j4r j4rVar = (j4r) obj2;
            if (j4rVar != null) {
                String str = j4rVar.a;
                ((AppAnalyticsReporter) xv10Var.a).R.a.a("pfm.analytics.filter.click", g8e.w(1, "filter_id", str));
                String str2 = ((wcb0) bVar.X()).f;
                if (str2 == null) {
                    str2 = ((wcb0) bVar.X()).e;
                }
                vab0 vab0Var = bVar.I;
                Set set = ((wcb0) bVar.X()).g;
                vab0Var.getClass();
                s4r a = vab0.a(j4rVar, set, str2);
                bVar.B0(a);
                Set set2 = ((wcb0) bVar.X()).g;
                l0p l0pVar = ((AppAnalyticsReporter) xv10Var.a).R;
                yab0 q = xv10Var.q(j4rVar, set2, str2);
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put("filter", q.a());
                l0pVar.a.a("pfm.analytics.filter.details.shown", linkedHashMap);
                if ((a instanceof l4r) && (calendar = ((l4r) a).f) != null) {
                    bVar.Z(new tdb0(calendar));
                }
            }
        }
        return zy11.a;
    }
}
