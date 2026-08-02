package com.yandex.div2;

import com.yandex.div2.DivText$Image$Accessibility;
import defpackage.c4x;
import defpackage.exq;
import defpackage.ft6;
import defpackage.hex;
import defpackage.lb7;
import defpackage.wcx;
import org.json.JSONObject;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes11.dex */
public final class y2 implements c4x, hex {
    public final exq a;
    public final exq b;

    static {
        q2 q2Var = DivText$Image$Accessibility.Type.Converter;
    }

    public y2(exq exqVar, exq exqVar2) {
        this.a = exqVar;
        this.b = exqVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        s2 s2Var = (s2) ft6.b.U8.getValue();
        lb7 lb7Var = ft6.a;
        s2Var.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.q(lb7Var, jSONObject, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, this.a);
        wcx.s(this.b, DivText$Image$Accessibility.Type.TO_STRING, lb7Var, "type", jSONObject);
        return jSONObject;
    }
}
