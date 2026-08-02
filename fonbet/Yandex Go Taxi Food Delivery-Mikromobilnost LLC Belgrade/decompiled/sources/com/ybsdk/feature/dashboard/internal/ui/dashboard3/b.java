package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Params;
import defpackage.kmg;
import defpackage.lmg;
import defpackage.mmg;
import defpackage.w511;

/* loaded from: classes3.dex */
public abstract class b {
    public static final mmg a(DashboardV3Params dashboardV3Params) {
        if (dashboardV3Params instanceof DashboardV3Params.Products) {
            DashboardV3Params.Products products = (DashboardV3Params.Products) dashboardV3Params;
            return new lmg(products.getInitialProductId(), products.getProducts());
        }
        if (dashboardV3Params instanceof DashboardV3Params.External) {
            return new kmg(((DashboardV3Params.External) dashboardV3Params).getMemberId());
        }
        w511.b();
        return null;
    }
}
