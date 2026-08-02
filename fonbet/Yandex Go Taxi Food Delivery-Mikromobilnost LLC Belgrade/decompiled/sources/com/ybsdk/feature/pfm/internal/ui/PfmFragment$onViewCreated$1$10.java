package com.ybsdk.feature.pfm.internal.ui;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.bbb0;
import defpackage.dbb0;
import defpackage.dpf;
import defpackage.g8e;
import defpackage.l0p;
import defpackage.tls;
import defpackage.uc5;
import defpackage.wcb0;
import defpackage.xv10;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class PfmFragment$onViewCreated$1$10 extends FunctionReferenceImpl implements tls {
    public PfmFragment$onViewCreated$1$10(uc5 uc5Var) {
        super(1, uc5Var, b.class, "onFilterResetButtonClick", "onFilterResetButtonClick(Lcom/ybsdk/feature/pfm/internal/ui/viewitems/PfmFilterViewItem;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        dbb0 dbb0Var = (dbb0) obj;
        b bVar = (b) this.receiver;
        if (dbb0Var instanceof bbb0) {
            xv10 xv10Var = bVar.K;
            String str = ((bbb0) dbb0Var).d;
            l0p l0pVar = ((AppAnalyticsReporter) xv10Var.a).R;
            l0pVar.a.a("pfm.analytics.filter.reset", g8e.w(1, "filter_id", str));
            Set e = ((wcb0) bVar.X()).e();
            if (e == null) {
                e = EmptySet.a;
            }
            Set set = ((wcb0) bVar.X()).g;
            String str2 = ((wcb0) bVar.X()).e;
            boolean j0 = bVar.j0(str);
            bVar.g0(PfmTransactionsDataSkeletonType.CUSTOM_FILTERS, ((wcb0) bVar.X()).i.a, new dpf(j0, bVar, dbb0Var, e, set, str2));
        } else {
            bVar.getClass();
        }
        return zy11.a;
    }
}
