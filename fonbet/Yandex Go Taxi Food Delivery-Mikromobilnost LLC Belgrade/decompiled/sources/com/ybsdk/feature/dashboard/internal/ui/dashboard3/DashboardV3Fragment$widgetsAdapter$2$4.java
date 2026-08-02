package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import defpackage.a9f0;
import defpackage.em3;
import defpackage.ez8;
import defpackage.g8e;
import defpackage.h791;
import defpackage.j0g;
import defpackage.nmg;
import defpackage.sls;
import defpackage.uc5;
import defpackage.ye8;
import defpackage.zlg;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class DashboardV3Fragment$widgetsAdapter$2$4 extends FunctionReferenceImpl implements sls {
    public DashboardV3Fragment$widgetsAdapter$2$4(uc5 uc5Var) {
        super(0, uc5Var, d.class, "onSkinSelectionRequest", "onSkinSelectionRequest()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ye8 ye8Var;
        a9f0 a9f0Var;
        d dVar = (d) this.receiver;
        zlg zlgVar = dVar.C;
        ez8 ez8Var = (ez8) ((nmg) dVar.X()).b.a();
        String str = (ez8Var == null || (ye8Var = ez8Var.b) == null || (a9f0Var = ye8Var.m) == null) ? null : a9f0Var.a;
        em3 em3Var = zlgVar.b.s;
        LinkedHashMap w = g8e.w(2, "product_id", zlg.f(zlgVar.a));
        if (str != null) {
            w.put("skin_id", str);
        }
        em3Var.a.a("dashboard.card_swipe", w);
        h791.e(dVar.E, ((j0g) dVar.J).n().a, false, null, 14);
        return zy11.a;
    }
}
