package com.yandex.div2;

import com.ironsource.X3;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.s6;
import com.yandex.div2.t6;
import com.yandex.div2.u6;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivLinearGradientTemplate.kt */
/* loaded from: classes8.dex */
public final class v6 implements JSONSerializable, JsonTemplate<s6> {
    public final Field<Expression<Long>> a;
    public final Field<List<a>> b;
    public final Field<ExpressionList<Integer>> c;

    /* compiled from: DivLinearGradientTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<s6.a> {
        public final Field<Expression<Integer>> a;
        public final Field<Expression<Double>> b;

        public a(Field<Expression<Integer>> field, Field<Expression<Double>> field2) {
            this.a = field;
            this.b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            t6.b bVar = (t6.b) BuiltInParserKt.getBuiltInParserComponent().T4.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            bVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "color", this.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, X3.i.L, this.b);
            return jSONObject;
        }
    }

    static {
        Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);
    }

    public v6(Field<Expression<Long>> field, Field<List<a>> field2, Field<ExpressionList<Integer>> field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((u6.b) BuiltInParserKt.getBuiltInParserComponent().Q4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
