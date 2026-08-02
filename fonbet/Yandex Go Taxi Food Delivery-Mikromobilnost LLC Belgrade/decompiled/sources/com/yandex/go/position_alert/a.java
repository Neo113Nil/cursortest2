package com.yandex.go.position_alert;

import com.yandex.go.position_alert.WarningModalView;
import defpackage.oce0;
import defpackage.qu;
import defpackage.sq1;
import defpackage.sta1;
import defpackage.u8w;
import defpackage.x4e;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class a implements WarningModalView.a {
    public final /* synthetic */ b a;
    public final /* synthetic */ oce0 b;

    public a(b bVar, oce0 oce0Var) {
        this.a = bVar;
        this.b = oce0Var;
    }

    @Override // com.yandex.go.position_alert.WarningModalView.a
    public final void f() {
        b bVar = this.a;
        u8w u8wVar = bVar.G.a;
        oce0 oce0Var = this.b;
        String str = oce0Var.a;
        String str2 = oce0Var.e;
        String a = sta1.a(oce0Var.h);
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("alert_id", str);
        }
        if (str2 != null) {
            hashMap.put("pin_zone_id", str2);
        }
        if (a != null) {
            hashMap.put("point_type", a);
        }
        x4e.B(u8wVar.a, "PositionAlertDidSelectButton", hashMap, 1);
        sq1 a2 = bVar.F.a(str);
        bVar.r(new qu(9));
        a2.a();
    }

    @Override // com.yandex.go.position_alert.WarningModalView.a
    public final void onBackPressed() {
        b bVar = this.a;
        u8w u8wVar = bVar.G.a;
        oce0 oce0Var = this.b;
        String str = oce0Var.a;
        String str2 = oce0Var.e;
        String a = sta1.a(oce0Var.h);
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("alert_id", str);
        }
        if (str2 != null) {
            hashMap.put("pin_zone_id", str2);
        }
        if (a != null) {
            hashMap.put("point_type", a);
        }
        u8wVar.a.a("PositionAlertDidBackPressed", hashMap, 1, new HashMap());
        bVar.r(new qu(9));
    }

    @Override // com.yandex.go.position_alert.WarningModalView.a
    public final void onDismiss() {
        this.a.J = null;
    }
}
