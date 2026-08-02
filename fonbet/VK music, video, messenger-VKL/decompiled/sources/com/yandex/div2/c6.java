package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.d6;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivInputValidatorBase.kt */
/* loaded from: classes8.dex */
public final class c6 implements JSONSerializable, Hashable {
    public static final Expression<Boolean> e = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);
    public final Expression<Boolean> a;
    public final Expression<String> b;
    public final String c;
    public Integer d;

    public c6(Expression<Boolean> expression, Expression<String> expression2, String str) {
        this.a = expression;
        this.b = expression2;
        this.c = str;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(c6.class).hashCode();
        Expression<String> expression = this.b;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        String str = this.c;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.d = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        d6.a aVar = (d6.a) BuiltInParserKt.getBuiltInParserComponent().v4.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        aVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "allow_empty", this.a);
        JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "label_id", this.b);
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "variable", this.c);
        return jSONObject;
    }

    public c6() {
        this(e, null, null);
    }
}
