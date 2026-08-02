package com.yandex.div2;

import com.yandex.div2.DivSeparator;
import defpackage.kbs;
import defpackage.kvo;
import defpackage.nyi;
import defpackage.q5z;
import defpackage.qkj;
import defpackage.rms;
import defpackage.tls;
import defpackage.wm11;
import defpackage.yf90;
import defpackage.zsq0;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class p1 implements zsq0, nyi {
    public static JSONObject c(yf90 yf90Var, DivSeparator.DelimiterStyle delimiterStyle) {
        JSONObject jSONObject = new JSONObject();
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "color", delimiterStyle.a, com.yandex.div.internal.parser.b.a);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "orientation", delimiterStyle.b, DivSeparator.DelimiterStyle.Orientation.TO_STRING);
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        rms rmsVar = wm11.f;
        tls tlsVar = com.yandex.div.internal.parser.b.b;
        kvo kvoVar = s1.a;
        kbs kbsVar = q5z.b;
        ?? e = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "color", rmsVar, tlsVar, kbsVar, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        qkj qkjVar = s1.c;
        tls tlsVar2 = DivSeparator.DelimiterStyle.Orientation.FROM_STRING;
        kvo kvoVar2 = s1.b;
        ?? e2 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "orientation", qkjVar, tlsVar2, kbsVar, kvoVar2);
        if (e2 != 0) {
            kvoVar2 = e2;
        }
        return new DivSeparator.DelimiterStyle(kvoVar, kvoVar2);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (DivSeparator.DelimiterStyle) obj);
    }
}
