package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.j2;
import org.json.JSONObject;

/* compiled from: DivCircleShapeTemplate.kt */
/* loaded from: classes8.dex */
public final class k2 implements JSONSerializable, JsonTemplate<i2> {
    public final Field<Expression<Integer>> a;
    public final Field<s4> b;
    public final Field<cb> c;

    static {
        Expression.Companion.constant$default(Expression.Companion, 10L, null, 2, null);
    }

    public k2(Field<Expression<Integer>> field, Field<s4> field2, Field<cb> field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((j2.b) BuiltInParserKt.getBuiltInParserComponent().Y1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
