package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivFocus;
import defpackage.abl0;
import defpackage.kbs;
import defpackage.nyi;
import defpackage.q5z;
import defpackage.ums;
import defpackage.wm11;
import defpackage.yf90;
import defpackage.zsq0;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class h0 implements zsq0, nyi {
    public static JSONObject c(yf90 yf90Var, DivFocus.a aVar) {
        JSONObject jSONObject = new JSONObject();
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "down", aVar.a);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "forward", aVar.b);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "left", aVar.c);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "right", aVar.d);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "up", aVar.e);
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        ums umsVar = wm11.c;
        Expression c = com.yandex.div.internal.parser.a.c(yf90Var, jSONObject, "down");
        abl0 abl0Var = q5z.c;
        kbs kbsVar = q5z.b;
        return new DivFocus.a(c, com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "forward", umsVar, abl0Var, kbsVar, null), com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "left", umsVar, abl0Var, kbsVar, null), com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "right", umsVar, abl0Var, kbsVar, null), com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "up", umsVar, abl0Var, kbsVar, null));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (DivFocus.a) obj);
    }
}
