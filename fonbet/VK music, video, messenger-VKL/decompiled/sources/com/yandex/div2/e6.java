package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.d6;
import org.json.JSONObject;

/* compiled from: DivInputValidatorBaseTemplate.kt */
/* loaded from: classes8.dex */
public final class e6 implements JSONSerializable, JsonTemplate<c6> {
    public final Field<Expression<Boolean>> a;
    public final Field<Expression<String>> b;
    public final Field<String> c;

    static {
        Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);
    }

    public e6(Field<Expression<Boolean>> field, Field<Expression<String>> field2, Field<String> field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        d6.b bVar = (d6.b) BuiltInParserKt.getBuiltInParserComponent().w4.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "allow_empty", this.a);
        JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "label_id", this.b);
        JsonFieldParser.writeField(builtInParsingContext, jSONObject, "variable", this.c);
        return jSONObject;
    }
}
