package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.v;
import org.json.JSONObject;

/* compiled from: DivActionScrollToTemplate.kt */
/* loaded from: classes8.dex */
public final class w implements JSONSerializable, JsonTemplate<u> {
    public final Field<Expression<Boolean>> a;
    public final Field<t> b;
    public final Field<Expression<String>> c;

    static {
        Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);
    }

    public w(Field<Expression<Boolean>> field, Field<t> field2, Field<Expression<String>> field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((v.b) BuiltInParserKt.getBuiltInParserComponent().B0.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
