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
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;
import xsna.izs;

/* compiled from: DivInputValidatorBaseJsonParser.kt */
/* loaded from: classes8.dex */
public final class d6 {

    @Deprecated
    public static final Expression<Boolean> a = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* compiled from: DivInputValidatorBaseJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = d6.a;
            Expression<Boolean> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "allow_empty", typeHelper, izsVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new c6(expression, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            c6 c6Var = (c6) obj;
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "allow_empty", c6Var.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "label_id", c6Var.b);
            JsonPropertyParser.write(parsingContext, jSONObject, "variable", c6Var.c);
            return jSONObject;
        }
    }

    /* compiled from: DivInputValidatorBaseJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            e6 e6Var = (e6) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new e6(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "allow_empty", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, e6Var != null ? e6Var.a : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, e6Var != null ? e6Var.b : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "variable", allowPropertyOverride, e6Var != null ? e6Var.c : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            e6 e6Var = (e6) obj;
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "allow_empty", e6Var.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "label_id", e6Var.b);
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable", e6Var.c);
            return jSONObject;
        }
    }

    /* compiled from: DivInputValidatorBaseJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, e6, c6> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final c6 resolve(ParsingContext parsingContext, e6 e6Var, JSONObject jSONObject) {
            e6 e6Var2 = e6Var;
            JSONObject jSONObject2 = jSONObject;
            Field<Expression<Boolean>> field = e6Var2.a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = d6.a;
            Expression<Boolean> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject2, "allow_empty", typeHelper, izsVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new c6(expression, JsonFieldResolver.resolveOptionalExpression(parsingContext, e6Var2.b, jSONObject2, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolveOptional(parsingContext, e6Var2.c, jSONObject2, "variable"));
        }
    }
}
