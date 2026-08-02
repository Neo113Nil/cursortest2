package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import defpackage.exq;
import defpackage.hex;
import defpackage.kvo;
import defpackage.qfy0;
import defpackage.qkj;
import defpackage.tls;
import defpackage.ums;
import defpackage.wm11;
import defpackage.wms;
import defpackage.xcx;
import defpackage.yf90;
import org.json.JSONObject;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes.dex */
public final class e implements qfy0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    public final Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        g gVar = (g) hexVar;
        exq exqVar = gVar.a;
        ums umsVar = wm11.c;
        Expression k = xcx.k(yf90Var, exqVar, jSONObject, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, umsVar);
        Expression k2 = xcx.k(yf90Var, gVar.b, jSONObject, "hint", umsVar);
        exq exqVar2 = gVar.c;
        wms wmsVar = wm11.a;
        tls tlsVar = com.yandex.div.internal.parser.b.f;
        Expression l = xcx.l(yf90Var, exqVar2, jSONObject, "is_checked", wmsVar, tlsVar);
        exq exqVar3 = gVar.d;
        qkj qkjVar = f.d;
        tls tlsVar2 = DivAccessibility.Mode.FROM_STRING;
        kvo kvoVar = f.a;
        ?? o = xcx.o(yf90Var, exqVar3, jSONObject, "mode", qkjVar, tlsVar2, kvoVar);
        kvo kvoVar2 = o == 0 ? kvoVar : o;
        exq exqVar4 = gVar.e;
        kvo kvoVar3 = f.b;
        ?? o2 = xcx.o(yf90Var, exqVar4, jSONObject, "mute_after_action", wmsVar, tlsVar, kvoVar3);
        kvo kvoVar4 = o2 == 0 ? kvoVar3 : o2;
        Expression k3 = xcx.k(yf90Var, gVar.f, jSONObject, "state_description", umsVar);
        DivAccessibility.Type type = (DivAccessibility.Type) xcx.i(gVar.g, DivAccessibility.Type.FROM_STRING, yf90Var, "type", jSONObject);
        if (type == null) {
            type = f.c;
        }
        return new DivAccessibility(k, k2, l, kvoVar2, kvoVar4, k3, type);
    }
}
