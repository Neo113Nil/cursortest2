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
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.izs;

/* compiled from: DivInputValidatorExpressionJsonParser.kt */
/* loaded from: classes8.dex */
public final class g6 {

    @Deprecated
    public static final Expression<Boolean> a = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* compiled from: DivInputValidatorExpressionJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public static f6 a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = g6.a;
            Expression<Boolean> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "allow_empty", typeHelper, izsVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new f6(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, BatchApiRequest.FIELD_NAME_CONDITION, typeHelper, izsVar), JsonExpressionParser.readExpression(parsingContext, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable"));
        }

        public static JSONObject b(ParsingContext parsingContext, f6 f6Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "allow_empty", f6Var.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, BatchApiRequest.FIELD_NAME_CONDITION, f6Var.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "label_id", f6Var.c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "expression");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable", f6Var.d);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (f6) obj);
        }
    }

    /* compiled from: DivInputValidatorExpressionJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public static h6 a(ParsingContext parsingContext, h6 h6Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field = h6Var != null ? h6Var.a : null;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new h6(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "allow_empty", typeHelper, allowPropertyOverride, field, izsVar), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, BatchApiRequest.FIELD_NAME_CONDITION, typeHelper, allowPropertyOverride, h6Var != null ? h6Var.b : null, izsVar), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, h6Var != null ? h6Var.c : null), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "variable", allowPropertyOverride, h6Var != null ? h6Var.d : null));
        }

        public static JSONObject b(ParsingContext parsingContext, h6 h6Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "allow_empty", h6Var.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, BatchApiRequest.FIELD_NAME_CONDITION, h6Var.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "label_id", h6Var.c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "expression");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable", h6Var.d);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (h6) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (h6) obj);
        }
    }

    /* compiled from: DivInputValidatorExpressionJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, h6, f6> {
        public static f6 a(ParsingContext parsingContext, h6 h6Var, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field = h6Var.a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = g6.a;
            Expression<Boolean> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "allow_empty", typeHelper, izsVar, expression);
            if (resolveOptionalExpression == null) {
                resolveOptionalExpression = expression;
            }
            return new f6(resolveOptionalExpression, JsonFieldResolver.resolveExpression(parsingContext, h6Var.b, jSONObject, BatchApiRequest.FIELD_NAME_CONDITION, typeHelper, izsVar), JsonFieldResolver.resolveExpression(parsingContext, h6Var.c, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolve(parsingContext, h6Var.d, jSONObject, "variable"));
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final /* bridge */ /* synthetic */ f6 resolve(ParsingContext parsingContext, h6 h6Var, JSONObject jSONObject) {
            return a(parsingContext, h6Var, jSONObject);
        }
    }
}
