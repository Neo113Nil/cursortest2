package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSlideTransition;
import defpackage.exq;
import defpackage.i8l;
import defpackage.jnk;
import defpackage.kvo;
import defpackage.qfy0;
import defpackage.qkj;
import defpackage.tls;
import defpackage.tms;
import defpackage.wm11;
import defpackage.xcx;
import defpackage.yf90;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class b2 implements qfy0 {
    public final JsonParserComponent a;

    public b2(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final DivSlideTransition a(yf90 yf90Var, d2 d2Var, JSONObject jSONObject) {
        exq exqVar = d2Var.a;
        JsonParserComponent jsonParserComponent = this.a;
        jnk jnkVar = (jnk) xcx.h(yf90Var, exqVar, jSONObject, "distance", jsonParserComponent.W2, jsonParserComponent.U2);
        exq exqVar2 = d2Var.b;
        tms tmsVar = wm11.b;
        tls tlsVar = com.yandex.div.internal.parser.b.h;
        i8l i8lVar = c2.g;
        kvo kvoVar = c2.a;
        Expression n = xcx.n(yf90Var, exqVar2, jSONObject, "duration", tmsVar, tlsVar, i8lVar, kvoVar);
        if (n == null) {
            n = kvoVar;
        }
        exq exqVar3 = d2Var.c;
        qkj qkjVar = c2.e;
        tls tlsVar2 = DivSlideTransition.Edge.FROM_STRING;
        kvo kvoVar2 = c2.b;
        ?? o = xcx.o(yf90Var, exqVar3, jSONObject, "edge", qkjVar, tlsVar2, kvoVar2);
        kvo kvoVar3 = o == 0 ? kvoVar2 : o;
        exq exqVar4 = d2Var.d;
        qkj qkjVar2 = c2.f;
        tls tlsVar3 = DivAnimationInterpolator.FROM_STRING;
        kvo kvoVar4 = c2.c;
        ?? o2 = xcx.o(yf90Var, exqVar4, jSONObject, "interpolator", qkjVar2, tlsVar3, kvoVar4);
        kvo kvoVar5 = o2 == 0 ? kvoVar4 : o2;
        exq exqVar5 = d2Var.e;
        i8l i8lVar2 = c2.h;
        kvo kvoVar6 = c2.d;
        ?? n2 = xcx.n(yf90Var, exqVar5, jSONObject, "start_delay", tmsVar, tlsVar, i8lVar2, kvoVar6);
        return new DivSlideTransition(jnkVar, n, kvoVar3, kvoVar5, n2 == 0 ? kvoVar6 : n2);
    }
}
