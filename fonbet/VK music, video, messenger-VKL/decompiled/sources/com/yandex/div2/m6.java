package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;
import xsna.izs;

/* compiled from: DivInputValidatorRegexJsonParser.kt */
/* loaded from: classes8.dex */
public final class m6 {

    @Deprecated
    public static final Expression<Boolean> a = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* compiled from: DivInputValidatorRegexJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public static l6 a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = m6.a;
            Expression<Boolean> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "allow_empty", typeHelper, izsVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            return new l6(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "label_id", typeHelper2), JsonExpressionParser.readExpression(parsingContext, jSONObject, "pattern", typeHelper2), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable"));
        }

        public static JSONObject b(ParsingContext parsingContext, l6 l6Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "allow_empty", l6Var.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "label_id", l6Var.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pattern", l6Var.c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "regex");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable", l6Var.d);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (l6) obj);
        }
    }

    /* compiled from: DivInputValidatorRegexJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public static n6 a(ParsingContext parsingContext, n6 n6Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "allow_empty", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, n6Var != null ? n6Var.a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new n6(readOptionalFieldWithExpression, JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "label_id", typeHelper, allowPropertyOverride, n6Var != null ? n6Var.b : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "pattern", typeHelper, allowPropertyOverride, n6Var != null ? n6Var.c : null), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "variable", allowPropertyOverride, n6Var != null ? n6Var.d : null));
        }

        public static JSONObject b(ParsingContext parsingContext, n6 n6Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "allow_empty", n6Var.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "label_id", n6Var.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pattern", n6Var.c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "regex");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable", n6Var.d);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (n6) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (n6) obj);
        }
    }

    /* compiled from: DivInputValidatorRegexJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, n6, l6> {
        public static l6 a(ParsingContext parsingContext, n6 n6Var, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field = n6Var.a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = m6.a;
            Expression<Boolean> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "allow_empty", typeHelper, izsVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field<Expression<String>> field2 = n6Var.b;
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            return new l6(expression, JsonFieldResolver.resolveExpression(parsingContext, field2, jSONObject, "label_id", typeHelper2), JsonFieldResolver.resolveExpression(parsingContext, n6Var.c, jSONObject, "pattern", typeHelper2), (String) JsonFieldResolver.resolve(parsingContext, n6Var.d, jSONObject, "variable"));
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final /* bridge */ /* synthetic */ l6 resolve(ParsingContext parsingContext, n6 n6Var, JSONObject jSONObject) {
            return a(parsingContext, n6Var, jSONObject);
        }
    }
}
