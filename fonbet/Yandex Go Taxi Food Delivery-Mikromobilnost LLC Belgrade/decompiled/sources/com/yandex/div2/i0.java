package com.yandex.div2;

import com.yandex.div2.DivFocus;
import defpackage.exq;
import defpackage.hex;
import defpackage.qfy0;
import defpackage.ums;
import defpackage.wm11;
import defpackage.xcx;
import defpackage.yf90;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class i0 implements qfy0 {
    @Override // defpackage.qfy0
    public final Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        j0 j0Var = (j0) hexVar;
        exq exqVar = j0Var.a;
        ums umsVar = wm11.c;
        return new DivFocus.a(xcx.k(yf90Var, exqVar, jSONObject, "down", umsVar), xcx.k(yf90Var, j0Var.b, jSONObject, "forward", umsVar), xcx.k(yf90Var, j0Var.c, jSONObject, "left", umsVar), xcx.k(yf90Var, j0Var.d, jSONObject, "right", umsVar), xcx.k(yf90Var, j0Var.e, jSONObject, "up", umsVar));
    }
}
