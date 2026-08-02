package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.z8;
import org.json.JSONObject;

/* compiled from: DivRoundedRectangleShapeTemplate.kt */
/* loaded from: classes8.dex */
public final class a9 implements JSONSerializable, JsonTemplate<y8> {
    public final Field<Expression<Integer>> a;
    public final Field<s4> b;
    public final Field<s4> c;
    public final Field<s4> d;
    public final Field<cb> e;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 5L, null, 2, null);
        Expression.Companion.constant$default(companion, 10L, null, 2, null);
        Expression.Companion.constant$default(companion, 10L, null, 2, null);
    }

    public a9(Field<Expression<Integer>> field, Field<s4> field2, Field<s4> field3, Field<s4> field4, Field<cb> field5) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((z8.b) BuiltInParserKt.getBuiltInParserComponent().v6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
