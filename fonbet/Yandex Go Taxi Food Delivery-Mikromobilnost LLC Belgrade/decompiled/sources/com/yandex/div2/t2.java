package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivText$Image$Accessibility;
import defpackage.hex;
import defpackage.qfy0;
import defpackage.wm11;
import defpackage.xcx;
import defpackage.yf90;
import org.json.JSONObject;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes11.dex */
public final class t2 implements qfy0 {
    @Override // defpackage.qfy0
    public final Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        y2 y2Var = (y2) hexVar;
        Expression k = xcx.k(yf90Var, y2Var.a, jSONObject, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, wm11.c);
        DivText$Image$Accessibility.Type type = (DivText$Image$Accessibility.Type) xcx.i(y2Var.b, DivText$Image$Accessibility.Type.FROM_STRING, yf90Var, "type", jSONObject);
        if (type == null) {
            type = u2.a;
        }
        return new DivText$Image$Accessibility(k, type);
    }
}
