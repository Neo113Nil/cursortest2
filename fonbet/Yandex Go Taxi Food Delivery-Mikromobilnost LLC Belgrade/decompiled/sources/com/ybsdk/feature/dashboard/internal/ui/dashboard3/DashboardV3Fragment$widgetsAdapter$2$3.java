package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import android.net.Uri;
import defpackage.em3;
import defpackage.mmg;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zlg;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class DashboardV3Fragment$widgetsAdapter$2$3 extends FunctionReferenceImpl implements tls {
    public DashboardV3Fragment$widgetsAdapter$2$3(uc5 uc5Var) {
        super(1, uc5Var, d.class, "onBackDropAction", "onBackDropAction(Landroid/net/Uri;)Z", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Uri uri = (Uri) obj;
        d dVar = (d) this.receiver;
        zlg zlgVar = dVar.C;
        em3 em3Var = zlgVar.b.s;
        mmg mmgVar = zlgVar.a;
        String f = zlg.f(mmgVar);
        String e = zlg.e(mmgVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        if (e != null) {
            linkedHashMap.put("member_id", e);
        }
        linkedHashMap.put("product_id", f);
        em3Var.a.a("dashboard.merchant_promo.click", linkedHashMap);
        return Boolean.valueOf(dVar.k0(uri));
    }
}
