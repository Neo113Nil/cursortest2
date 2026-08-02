package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import defpackage.bcl;
import defpackage.c4x;
import defpackage.ft6;
import defpackage.jkk;
import defpackage.jl40;
import defpackage.kvo;
import defpackage.m8l;
import defpackage.qoi0;
import defpackage.rgk;
import defpackage.rvo;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class DivBorder implements c4x {
    public static final kvo g = new kvo(Boolean.FALSE);
    public final Expression a;
    public final jkk b;
    public final Expression c;
    public final m8l d;
    public final bcl e;
    public Integer f;

    public DivBorder(Expression expression, jkk jkkVar, Expression expression2, m8l m8lVar, bcl bclVar) {
        this.a = expression;
        this.b = jkkVar;
        this.c = expression2;
        this.d = m8lVar;
        this.e = bclVar;
    }

    public final boolean a(DivBorder divBorder, rvo rvoVar, rvo rvoVar2) {
        if (divBorder == null) {
            return false;
        }
        Expression expression = this.a;
        Long l = expression != null ? (Long) expression.a(rvoVar) : null;
        Expression expression2 = divBorder.a;
        if (jl40.l(l, expression2 != null ? (Long) expression2.a(rvoVar2) : null)) {
            jkk jkkVar = divBorder.b;
            jkk jkkVar2 = this.b;
            if ((jkkVar2 != null ? jkkVar2.a(jkkVar, rvoVar, rvoVar2) : jkkVar == null) && ((Boolean) this.c.a(rvoVar)).booleanValue() == ((Boolean) divBorder.c.a(rvoVar2)).booleanValue()) {
                m8l m8lVar = divBorder.d;
                m8l m8lVar2 = this.d;
                if (m8lVar2 != null ? m8lVar2.a(m8lVar, rvoVar, rvoVar2) : m8lVar == null) {
                    bcl bclVar = divBorder.e;
                    bcl bclVar2 = this.e;
                    if (bclVar2 != null ? bclVar2.a(bclVar, rvoVar, rvoVar2) : bclVar == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(DivBorder.class).hashCode();
        Expression expression = this.a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        jkk jkkVar = this.b;
        int hashCode3 = this.c.hashCode() + hashCode2 + (jkkVar != null ? jkkVar.b() : 0);
        m8l m8lVar = this.d;
        int b = hashCode3 + (m8lVar != null ? m8lVar.b() : 0);
        bcl bclVar = this.e;
        int b2 = b + (bclVar != null ? bclVar.b() : 0);
        this.f = Integer.valueOf(b2);
        return b2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((rgk) ft6.b.U1.getValue()).b(ft6.a, this);
    }

    public DivBorder() {
        this(null, null, g, null, null);
    }
}
