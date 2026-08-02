package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.o9;
import org.json.JSONObject;
import xsna.non;

/* compiled from: DivShadowTemplate.kt */
/* loaded from: classes8.dex */
public final class p9 implements JSONSerializable, JsonTemplate<n9> {
    public final Field<Expression<Double>> a;
    public final Field<Expression<Long>> b;
    public final Field<Expression<Integer>> c;
    public final Field<non> d;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(0.19d), null, 2, null);
        Expression.Companion.constant$default(companion, 2L, null, 2, null);
        Expression.Companion.constant$default(companion, 0, null, 2, null);
    }

    public p9(Field<Expression<Double>> field, Field<Expression<Long>> field2, Field<Expression<Integer>> field3, Field<non> field4) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((o9.b) BuiltInParserKt.getBuiltInParserComponent().N6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
