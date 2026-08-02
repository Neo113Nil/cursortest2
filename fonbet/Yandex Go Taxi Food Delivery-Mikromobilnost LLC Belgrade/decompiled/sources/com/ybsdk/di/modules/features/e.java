package com.ybsdk.di.modules.features;

import com.ybsdk.feature.dashboard.api.model.ProductId;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.DefaultOriginValues;
import defpackage.j3h;
import defpackage.ju01;
import defpackage.l3h;
import defpackage.np41;
import defpackage.rkg;
import defpackage.w511;
import defpackage.zig;

/* loaded from: classes3.dex */
public final class e implements rkg {
    public final /* synthetic */ j3h a;
    public final /* synthetic */ np41 b;
    public final /* synthetic */ ju01 c;
    public final /* synthetic */ com.ybsdk.rconfig.b d;

    public e(j3h j3hVar, np41 np41Var, ju01 ju01Var, com.ybsdk.rconfig.b bVar) {
        this.a = j3hVar;
        this.b = np41Var;
        this.c = ju01Var;
        this.d = bVar;
    }

    public final void a(ProductId productId, String str) {
        String value;
        switch (productId == null ? -1 : zig.a[productId.ordinal()]) {
            case -1:
            case 5:
            case 6:
                value = DefaultOriginValues.Unknown.getValue();
                break;
            case 0:
            default:
                w511.b();
                return;
            case 1:
                value = DashboardOrigins.PayDashboard.getValue();
                break;
            case 2:
                value = DashboardOrigins.ProDashboard.getValue();
                break;
            case 3:
            case 4:
                value = DashboardOrigins.SplitDashboard.getValue();
                break;
        }
        ((l3h) this.a).d(com.ybsdk.feature.deeplink.api.a.a(new DeeplinkAction.ShowQrScan(value, str, null), DeeplinkNavigation.Add.INSTANCE));
    }
}
