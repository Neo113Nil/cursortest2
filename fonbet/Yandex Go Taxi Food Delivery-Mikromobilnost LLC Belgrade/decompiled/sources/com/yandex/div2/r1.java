package com.yandex.div2;

import com.yandex.div2.DivSeparator;
import defpackage.exq;
import defpackage.hex;
import defpackage.kvo;
import defpackage.qfy0;
import defpackage.qkj;
import defpackage.rms;
import defpackage.tls;
import defpackage.wm11;
import defpackage.xcx;
import defpackage.yf90;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r1 implements qfy0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    public final Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        w1 w1Var = (w1) hexVar;
        exq exqVar = w1Var.a;
        rms rmsVar = wm11.f;
        tls tlsVar = com.yandex.div.internal.parser.b.b;
        kvo kvoVar = s1.a;
        ?? o = xcx.o(yf90Var, exqVar, jSONObject, "color", rmsVar, tlsVar, kvoVar);
        if (o != 0) {
            kvoVar = o;
        }
        exq exqVar2 = w1Var.b;
        qkj qkjVar = s1.c;
        tls tlsVar2 = DivSeparator.DelimiterStyle.Orientation.FROM_STRING;
        kvo kvoVar2 = s1.b;
        ?? o2 = xcx.o(yf90Var, exqVar2, jSONObject, "orientation", qkjVar, tlsVar2, kvoVar2);
        if (o2 != 0) {
            kvoVar2 = o2;
        }
        return new DivSeparator.DelimiterStyle(kvoVar, kvoVar2);
    }
}
