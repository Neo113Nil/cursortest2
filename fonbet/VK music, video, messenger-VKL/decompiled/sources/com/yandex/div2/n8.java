package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.izs;
import xsna.lr;

/* compiled from: DivRadialGradientFixedCenterJsonParser.kt */
/* loaded from: classes8.dex */
public final class n8 {

    @Deprecated
    public static final Expression<DivSizeUnit> a;

    @Deprecated
    public static final TypeHelper<DivSizeUnit> b;

    /* compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public static m8 a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<DivSizeUnit> typeHelper = n8.b;
            izs<String, DivSizeUnit> izsVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = n8.a;
            Expression<DivSizeUnit> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "unit", typeHelper, izsVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new m8(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }

        public static JSONObject b(ParsingContext parsingContext, m8 m8Var) throws ParsingException {
            JSONObject b = lr.b(parsingContext, "type", "fixed");
            JsonExpressionParser.writeExpression(parsingContext, b, "unit", m8Var.a, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, b, "value", m8Var.b);
            return b;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (m8) obj);
        }
    }

    /* compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public static o8 a(ParsingContext parsingContext, o8 o8Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new o8(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "unit", n8.b, allowPropertyOverride, o8Var != null ? o8Var.a : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, o8Var != null ? o8Var.b : null, ParsingConvertersKt.NUMBER_TO_INT));
        }

        public static JSONObject b(ParsingContext parsingContext, o8 o8Var) throws ParsingException {
            JSONObject b = lr.b(parsingContext, "type", "fixed");
            JsonFieldParser.writeExpressionField(parsingContext, b, "unit", o8Var.a, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, b, "value", o8Var.b);
            return b;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (o8) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (o8) obj);
        }
    }

    /* compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, o8, m8> {
        public static m8 a(ParsingContext parsingContext, o8 o8Var, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivSizeUnit>> field = o8Var.a;
            TypeHelper<DivSizeUnit> typeHelper = n8.b;
            izs<String, DivSizeUnit> izsVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = n8.a;
            Expression<DivSizeUnit> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "unit", typeHelper, izsVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new m8(expression, JsonFieldResolver.resolveExpression(parsingContext, o8Var.b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final /* bridge */ /* synthetic */ m8 resolve(ParsingContext parsingContext, o8 o8Var, JSONObject jSONObject) {
            return a(parsingContext, o8Var, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        a = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        b = TypeHelper.Companion.from(divSizeUnit, a.i);
    }
}
