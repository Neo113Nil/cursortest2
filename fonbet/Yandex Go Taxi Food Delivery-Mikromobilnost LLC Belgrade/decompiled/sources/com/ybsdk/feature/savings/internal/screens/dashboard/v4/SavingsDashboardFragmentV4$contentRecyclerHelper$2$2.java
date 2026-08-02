package com.ybsdk.feature.savings.internal.screens.dashboard.v4;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.SavingsDragAndDropWidgetTypeSavings;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsDashboardDragAndDropMovedType;
import com.ybsdk.feature.savings.internal.entities.SavingsDivEntity$ProductType;
import defpackage.ds31;
import defpackage.fbm0;
import defpackage.gc5;
import defpackage.kam0;
import defpackage.lam0;
import defpackage.ldm0;
import defpackage.o8g0;
import defpackage.pzt0;
import defpackage.qbm0;
import defpackage.rt1;
import defpackage.scm0;
import defpackage.ssa1;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsDashboardFragmentV4$contentRecyclerHelper$2$2 extends FunctionReferenceImpl implements tls {
    public SavingsDashboardFragmentV4$contentRecyclerHelper$2$2(uc5 uc5Var) {
        super(1, uc5Var, c.class, "setFinalOrder", "setFinalOrder(Z)V", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(boolean z) {
        lam0 lam0Var;
        pzt0 pzt0Var;
        String str;
        String str2;
        c cVar = (c) this.receiver;
        qbm0 qbm0Var = z ? cVar.L : cVar.M;
        if (qbm0Var == null) {
            return;
        }
        String str3 = qbm0Var.c;
        if (str3 != null) {
            lam0 lam0Var2 = ((fbm0) cVar.X()).d;
            kam0 b = lam0Var2 != null ? lam0Var2.b(str3) : null;
            if (b != null) {
                List<gc5> list = b.g;
                ArrayList arrayList = new ArrayList();
                for (gc5 gc5Var : list) {
                    scm0 scm0Var = gc5Var instanceof scm0 ? (scm0) gc5Var : null;
                    String b2 = (scm0Var == null || (str2 = scm0Var.e) == null) ? null : ssa1.b(str2);
                    if (b2 != null) {
                        arrayList.add(b2);
                    }
                }
                if (z) {
                    rt1.L(((AppAnalyticsReporter) cVar.H.a).f0, null, qbm0Var.a, qbm0Var.b, SavingsEvents$SavingsDashboardDragAndDropMovedType.NONE, list.size(), arrayList, SavingsDragAndDropWidgetTypeSavings.SHELF, 65);
                    cVar.L = null;
                } else {
                    Object S = kotlin.collections.a.S(qbm0Var.b, list);
                    scm0 scm0Var2 = S instanceof scm0 ? (scm0) S : null;
                    o8g0 o8g0Var = cVar.H;
                    int i = qbm0Var.a;
                    int i2 = qbm0Var.b;
                    int size = list.size();
                    SavingsDivEntity$ProductType savingsDivEntity$ProductType = scm0Var2 != null ? scm0Var2.j : null;
                    String b3 = (scm0Var2 == null || (str = scm0Var2.e) == null) ? null : ssa1.b(str);
                    if (b3 == null) {
                        b3 = "";
                    }
                    o8g0Var.m(b3, arrayList, i, i2, savingsDivEntity$ProductType, size);
                    cVar.M = null;
                }
                lam0Var = ((fbm0) cVar.X()).d;
                if (lam0Var == null) {
                    List<kam0> list2 = lam0Var.e;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                    for (kam0 kam0Var : list2) {
                        String str4 = kam0Var.a;
                        List<gc5> list3 = kam0Var.g;
                        ArrayList arrayList3 = new ArrayList();
                        for (gc5 gc5Var2 : list3) {
                            scm0 scm0Var3 = gc5Var2 instanceof scm0 ? (scm0) gc5Var2 : null;
                            String str5 = scm0Var3 != null ? scm0Var3.e : null;
                            if (str5 != null) {
                                arrayList3.add(str5);
                            }
                        }
                        arrayList2.add(new ldm0(str4, arrayList3));
                    }
                    pzt0 pzt0Var2 = cVar.K;
                    if (pzt0Var2 != null) {
                        pzt0Var2.a(null);
                    }
                    pzt0 pzt0Var3 = cVar.I;
                    if (pzt0Var3 != null && pzt0Var3.isActive() && (pzt0Var = cVar.I) != null) {
                        pzt0Var.a(null);
                    }
                    cVar.K = tje.N(ds31.a(cVar), null, null, new SavingsDashboardViewModelV4$setFinalOrder$1(cVar, arrayList2, null), 3);
                    return;
                }
                return;
            }
        }
        c.l0(cVar, "Shelf by swappedInfo is null", null);
        lam0Var = ((fbm0) cVar.X()).d;
        if (lam0Var == null) {
        }
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i(((Boolean) obj).booleanValue());
        return zy11.a;
    }
}
