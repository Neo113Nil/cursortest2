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

/* compiled from: DivActionSetStateJsonParser.kt */
/* loaded from: classes8.dex */
public final class y {

    @Deprecated
    public static final Expression<Boolean> a = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* compiled from: DivActionSetStateJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public static x a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "state_id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = y.a;
            Expression<Boolean> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "temporary", typeHelper, izsVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new x(readExpression, expression);
        }

        public static JSONObject b(ParsingContext parsingContext, x xVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "state_id", xVar.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "temporary", xVar.b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_state");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (x) obj);
        }
    }

    /* compiled from: DivActionSetStateJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public static z a(ParsingContext parsingContext, z zVar, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new z(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "state_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, zVar != null ? zVar.a : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "temporary", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, zVar != null ? zVar.b : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }

        public static JSONObject b(ParsingContext parsingContext, z zVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "state_id", zVar.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "temporary", zVar.b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_state");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (z) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (z) obj);
        }
    }

    /* compiled from: DivActionSetStateJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, z, x> {
        public static x a(ParsingContext parsingContext, z zVar, JSONObject jSONObject) throws ParsingException {
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, zVar.a, jSONObject, "state_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Boolean>> field = zVar.b;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = y.a;
            Expression<Boolean> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "temporary", typeHelper, izsVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new x(resolveExpression, expression);
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final /* bridge */ /* synthetic */ x resolve(ParsingContext parsingContext, z zVar, JSONObject jSONObject) {
            return a(parsingContext, zVar, jSONObject);
        }
    }
}
