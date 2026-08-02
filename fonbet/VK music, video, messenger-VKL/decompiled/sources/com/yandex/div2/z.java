package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.y;
import org.json.JSONObject;

/* compiled from: DivActionSetStateTemplate.kt */
/* loaded from: classes8.dex */
public final class z implements JSONSerializable, JsonTemplate<x> {
    public final Field<Expression<String>> a;
    public final Field<Expression<Boolean>> b;

    static {
        Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);
    }

    public z(Field<Expression<String>> field, Field<Expression<Boolean>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        y.b bVar = (y.b) BuiltInParserKt.getBuiltInParserComponent().E0.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return y.b.b(builtInParsingContext, this);
    }
}
