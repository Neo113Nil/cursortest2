package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivText$Image$Accessibility;
import defpackage.nyi;
import defpackage.wm11;
import defpackage.wms;
import defpackage.wwg;
import defpackage.yf90;
import defpackage.zsq0;
import org.json.JSONObject;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes11.dex */
public final class r2 implements zsq0, nyi {
    public static JSONObject c(yf90 yf90Var, DivText$Image$Accessibility divText$Image$Accessibility) {
        JSONObject jSONObject = new JSONObject();
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, divText$Image$Accessibility.a);
        wwg.a0(yf90Var, jSONObject, "type", divText$Image$Accessibility.b, DivText$Image$Accessibility.Type.TO_STRING);
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        wms wmsVar = wm11.a;
        Expression c = com.yandex.div.internal.parser.a.c(yf90Var, jSONObject, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        DivText$Image$Accessibility.Type type = (DivText$Image$Accessibility.Type) wwg.K(yf90Var, jSONObject, DivText$Image$Accessibility.Type.FROM_STRING);
        if (type == null) {
            type = u2.a;
        }
        return new DivText$Image$Accessibility(c, type);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (DivText$Image$Accessibility) obj);
    }
}
