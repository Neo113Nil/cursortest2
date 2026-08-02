package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.qc;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskParticlesTemplate.kt */
/* loaded from: classes8.dex */
public final class rc implements JSONSerializable, JsonTemplate<pc> {
    public final Field<Expression<Integer>> a;
    public final Field<Expression<Double>> b;
    public final Field<Expression<Boolean>> c;
    public final Field<Expression<Boolean>> d;
    public final Field<s4> e;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(0.8d), null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 1L, null, 2, null);
    }

    public rc(Field<Expression<Integer>> field, Field<Expression<Double>> field2, Field<Expression<Boolean>> field3, Field<Expression<Boolean>> field4, Field<s4> field5) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((qc.b) BuiltInParserKt.getBuiltInParserComponent().m8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
