package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.qc;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivTextRangeMaskParticles.kt */
/* loaded from: classes8.dex */
public final class pc implements JSONSerializable, Hashable {
    public final Expression<Integer> a;
    public final Expression<Double> b;
    public final Expression<Boolean> c;
    public final Expression<Boolean> d;
    public final q4 e;
    public Integer f;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(0.8d), null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 1L, null, 2, null);
    }

    public pc(Expression<Integer> expression, Expression<Double> expression2, Expression<Boolean> expression3, Expression<Boolean> expression4, q4 q4Var) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
        this.e = q4Var;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int hash = this.e.hash() + this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + fpf0.a(pc.class).hashCode();
        this.f = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((qc.a) BuiltInParserKt.getBuiltInParserComponent().l8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
