package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSlideTransition;
import defpackage.i8l;
import defpackage.jnk;
import defpackage.kbs;
import defpackage.kvo;
import defpackage.nyi;
import defpackage.q5z;
import defpackage.qkj;
import defpackage.tls;
import defpackage.tms;
import defpackage.wm11;
import defpackage.wwg;
import defpackage.yf90;
import defpackage.zsq0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z1 implements zsq0, nyi {
    public final JsonParserComponent a;

    public z1(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final DivSlideTransition a(yf90 yf90Var, JSONObject jSONObject) {
        jnk jnkVar = (jnk) wwg.M(yf90Var, jSONObject, "distance", this.a.U2);
        tms tmsVar = wm11.b;
        tls tlsVar = com.yandex.div.internal.parser.b.h;
        i8l i8lVar = c2.g;
        kvo kvoVar = c2.a;
        Expression e = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "duration", tmsVar, tlsVar, i8lVar, kvoVar);
        if (e == null) {
            e = kvoVar;
        }
        qkj qkjVar = c2.e;
        tls tlsVar2 = DivSlideTransition.Edge.FROM_STRING;
        kvo kvoVar2 = c2.b;
        kbs kbsVar = q5z.b;
        ?? e2 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "edge", qkjVar, tlsVar2, kbsVar, kvoVar2);
        kvo kvoVar3 = e2 == 0 ? kvoVar2 : e2;
        qkj qkjVar2 = c2.f;
        tls tlsVar3 = DivAnimationInterpolator.FROM_STRING;
        kvo kvoVar4 = c2.c;
        ?? e3 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "interpolator", qkjVar2, tlsVar3, kbsVar, kvoVar4);
        kvo kvoVar5 = e3 == 0 ? kvoVar4 : e3;
        i8l i8lVar2 = c2.h;
        kvo kvoVar6 = c2.d;
        ?? e4 = com.yandex.div.internal.parser.a.e(yf90Var, jSONObject, "start_delay", tmsVar, tlsVar, i8lVar2, kvoVar6);
        return new DivSlideTransition(jnkVar, e, kvoVar3, kvoVar5, e4 == 0 ? kvoVar6 : e4);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, DivSlideTransition divSlideTransition) {
        JSONObject jSONObject = new JSONObject();
        wwg.b0(yf90Var, jSONObject, "distance", divSlideTransition.a, this.a.U2);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "duration", divSlideTransition.b);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "edge", divSlideTransition.c, DivSlideTransition.Edge.TO_STRING);
        com.yandex.div.internal.parser.a.h(yf90Var, jSONObject, "interpolator", divSlideTransition.d, DivAnimationInterpolator.TO_STRING);
        com.yandex.div.internal.parser.a.g(yf90Var, jSONObject, "start_delay", divSlideTransition.e);
        wwg.Z(yf90Var, jSONObject, "type", "slide");
        return jSONObject;
    }
}
