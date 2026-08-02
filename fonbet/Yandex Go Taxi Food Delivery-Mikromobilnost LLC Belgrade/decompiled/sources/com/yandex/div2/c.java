package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import defpackage.abl0;
import defpackage.kbs;
import defpackage.kvo;
import defpackage.nyi;
import defpackage.q5z;
import defpackage.qkj;
import defpackage.tls;
import defpackage.ums;
import defpackage.wm11;
import defpackage.wms;
import defpackage.wwg;
import defpackage.yf90;
import defpackage.zsq0;
import org.json.JSONObject;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes.dex */
public final class c implements zsq0, nyi {
    public static JSONObject c(yf90 yf90Var, DivAccessibility divAccessibility) {
        JSONObject jSONObject = new JSONObject();
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, divAccessibility.a);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "hint", divAccessibility.b);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "is_checked", divAccessibility.c);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "mode", divAccessibility.d, DivAccessibility.Mode.TO_STRING);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "mute_after_action", divAccessibility.e);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "state_description", divAccessibility.f);
        wwg.a0(yf90Var, jSONObject, "type", divAccessibility.g, DivAccessibility.Type.TO_STRING);
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        ums umsVar = wm11.c;
        Expression c = com.yandex.div.internal.parser.a.c(yf90Var, jSONObject, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        abl0 abl0Var = q5z.c;
        kbs kbsVar = q5z.b;
        Expression e = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "hint", umsVar, abl0Var, kbsVar, null);
        wms wmsVar = wm11.a;
        tls tlsVar = com.yandex.div.internal.parser.b.f;
        Expression e2 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "is_checked", wmsVar, tlsVar, kbsVar, null);
        qkj qkjVar = f.d;
        tls tlsVar2 = DivAccessibility.Mode.FROM_STRING;
        kvo kvoVar = f.a;
        ?? e3 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "mode", qkjVar, tlsVar2, kbsVar, kvoVar);
        kvo kvoVar2 = e3 == 0 ? kvoVar : e3;
        kvo kvoVar3 = f.b;
        ?? e4 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "mute_after_action", wmsVar, tlsVar, kbsVar, kvoVar3);
        kvo kvoVar4 = e4 == 0 ? kvoVar3 : e4;
        Expression e5 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "state_description", umsVar, abl0Var, kbsVar, null);
        DivAccessibility.Type type = (DivAccessibility.Type) wwg.K(yf90Var, jSONObject, DivAccessibility.Type.FROM_STRING);
        if (type == null) {
            type = f.c;
        }
        return new DivAccessibility(c, e, e2, kvoVar2, kvoVar4, e5, type);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (DivAccessibility) obj);
    }
}
