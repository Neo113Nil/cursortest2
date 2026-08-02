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

/* compiled from: DivPivotFixedJsonParser.kt */
/* loaded from: classes8.dex */
public final class z7 {

    @Deprecated
    public static final Expression<DivSizeUnit> a;

    @Deprecated
    public static final TypeHelper<DivSizeUnit> b;

    /* compiled from: DivPivotFixedJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivPivotFixedJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public static y7 a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<DivSizeUnit> typeHelper = z7.b;
            izs<String, DivSizeUnit> izsVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = z7.a;
            Expression<DivSizeUnit> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "unit", typeHelper, izsVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new y7(expression, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }

        public static JSONObject b(ParsingContext parsingContext, y7 y7Var) throws ParsingException {
            JSONObject b = lr.b(parsingContext, "type", "pivot-fixed");
            JsonExpressionParser.writeExpression(parsingContext, b, "unit", y7Var.a, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, b, "value", y7Var.b);
            return b;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (y7) obj);
        }
    }

    /* compiled from: DivPivotFixedJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public static a8 a(ParsingContext parsingContext, a8 a8Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new a8(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "unit", z7.b, allowPropertyOverride, a8Var != null ? a8Var.a : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, a8Var != null ? a8Var.b : null, ParsingConvertersKt.NUMBER_TO_INT));
        }

        public static JSONObject b(ParsingContext parsingContext, a8 a8Var) throws ParsingException {
            JSONObject b = lr.b(parsingContext, "type", "pivot-fixed");
            JsonFieldParser.writeExpressionField(parsingContext, b, "unit", a8Var.a, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, b, "value", a8Var.b);
            return b;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (a8) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (a8) obj);
        }
    }

    /* compiled from: DivPivotFixedJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, a8, y7> {
        public static y7 a(ParsingContext parsingContext, a8 a8Var, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivSizeUnit>> field = a8Var.a;
            TypeHelper<DivSizeUnit> typeHelper = z7.b;
            izs<String, DivSizeUnit> izsVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = z7.a;
            Expression<DivSizeUnit> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "unit", typeHelper, izsVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new y7(expression, JsonFieldResolver.resolveOptionalExpression(parsingContext, a8Var.b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final /* bridge */ /* synthetic */ y7 resolve(ParsingContext parsingContext, a8 a8Var, JSONObject jSONObject) {
            return a(parsingContext, a8Var, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        a = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        b = TypeHelper.Companion.from(divSizeUnit, a.i);
    }
}
