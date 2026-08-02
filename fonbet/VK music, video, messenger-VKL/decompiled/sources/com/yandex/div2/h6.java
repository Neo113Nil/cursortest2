package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.g6;
import org.json.JSONObject;

/* compiled from: DivInputValidatorExpressionTemplate.kt */
/* loaded from: classes8.dex */
public final class h6 implements JSONSerializable, JsonTemplate<f6> {
    public final Field<Expression<Boolean>> a;
    public final Field<Expression<Boolean>> b;
    public final Field<Expression<String>> c;
    public final Field<String> d;

    static {
        Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);
    }

    public h6(Field<Expression<Boolean>> field, Field<Expression<Boolean>> field2, Field<Expression<String>> field3, Field<String> field4) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        g6.b bVar = (g6.b) BuiltInParserKt.getBuiltInParserComponent().y4.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return g6.b.b(builtInParsingContext, this);
    }
}
