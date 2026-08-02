package com.yandex.div2;

import com.yandex.div2.DivText$Image$Accessibility;
import defpackage.d290;
import defpackage.hex;
import defpackage.q5z;
import defpackage.udq0;
import defpackage.wcx;
import defpackage.wm11;
import defpackage.yey0;
import defpackage.yf90;
import defpackage.zsq0;
import org.json.JSONObject;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes11.dex */
public final class s2 implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new y2(wcx.j(Q, jSONObject, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, wm11.c, i, null, q5z.c, q5z.b), wcx.h(Q, jSONObject, "type", i, null, DivText$Image$Accessibility.Type.FROM_STRING));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        y2 y2Var = (y2) obj;
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, y2Var.a);
        wcx.s(y2Var.b, DivText$Image$Accessibility.Type.TO_STRING, yf90Var, "type", jSONObject);
        return jSONObject;
    }
}
