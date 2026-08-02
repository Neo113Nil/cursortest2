package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.kc;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskBaseTemplate.kt */
/* loaded from: classes8.dex */
public final class lc implements JSONSerializable, JsonTemplate<jc> {
    public final Field<Expression<Boolean>> a;

    static {
        Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);
    }

    public lc(Field<Expression<Boolean>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        kc.b bVar = (kc.b) BuiltInParserKt.getBuiltInParserComponent().k8.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "is_enabled", this.a);
        return jSONObject;
    }
}
