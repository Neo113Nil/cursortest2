package com.yandex.div2;

import com.yandex.div2.DivAccessibility;
import defpackage.abl0;
import defpackage.d290;
import defpackage.exq;
import defpackage.hex;
import defpackage.kbs;
import defpackage.q5z;
import defpackage.tls;
import defpackage.udq0;
import defpackage.ums;
import defpackage.wcx;
import defpackage.wm11;
import defpackage.wms;
import defpackage.yey0;
import defpackage.yf90;
import defpackage.zsq0;
import org.json.JSONObject;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes.dex */
public final class d implements zsq0, yey0 {
    public static JSONObject c(yf90 yf90Var, g gVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, gVar.a);
        wcx.q(yf90Var, jSONObject, "hint", gVar.b);
        wcx.q(yf90Var, jSONObject, "is_checked", gVar.c);
        wcx.p(gVar.d, DivAccessibility.Mode.TO_STRING, yf90Var, "mode", jSONObject);
        wcx.q(yf90Var, jSONObject, "mute_after_action", gVar.e);
        wcx.q(yf90Var, jSONObject, "state_description", gVar.f);
        wcx.s(gVar.g, DivAccessibility.Type.TO_STRING, yf90Var, "type", jSONObject);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, umsVar, i, null, abl0Var, kbsVar);
        exq j2 = wcx.j(Q, jSONObject, "hint", umsVar, i, null, abl0Var, kbsVar);
        wms wmsVar = wm11.a;
        tls tlsVar = com.yandex.div.internal.parser.b.f;
        return new g(j, j2, wcx.j(Q, jSONObject, "is_checked", wmsVar, i, null, tlsVar, kbsVar), wcx.j(Q, jSONObject, "mode", f.d, i, null, DivAccessibility.Mode.FROM_STRING, kbsVar), wcx.j(Q, jSONObject, "mute_after_action", wmsVar, i, null, tlsVar, kbsVar), wcx.j(Q, jSONObject, "state_description", umsVar, i, null, abl0Var, kbsVar), wcx.h(Q, jSONObject, "type", i, null, DivAccessibility.Type.FROM_STRING));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (g) obj);
    }
}
