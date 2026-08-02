package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.izs;

/* compiled from: DivDimensionJsonParser.kt */
/* loaded from: classes8.dex */
public final class t3 {

    @Deprecated
    public static final Expression<DivSizeUnit> a;

    @Deprecated
    public static final TypeHelper<DivSizeUnit> b;

    /* compiled from: DivDimensionJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivDimensionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            TypeHelper<DivSizeUnit> typeHelper = t3.b;
            izs<String, DivSizeUnit> izsVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = t3.a;
            Expression<DivSizeUnit> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "unit", typeHelper, izsVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new s3(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            s3 s3Var = (s3) obj;
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "unit", s3Var.a, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", s3Var.b);
            return jSONObject;
        }
    }

    /* compiled from: DivDimensionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            u3 u3Var = (u3) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new u3(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "unit", t3.b, allowPropertyOverride, u3Var != null ? u3Var.a : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, u3Var != null ? u3Var.b : null, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            u3 u3Var = (u3) obj;
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "unit", u3Var.a, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", u3Var.b);
            return jSONObject;
        }
    }

    /* compiled from: DivDimensionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, u3, s3> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final s3 resolve(ParsingContext parsingContext, u3 u3Var, JSONObject jSONObject) {
            u3 u3Var2 = u3Var;
            JSONObject jSONObject2 = jSONObject;
            Field<Expression<DivSizeUnit>> field = u3Var2.a;
            TypeHelper<DivSizeUnit> typeHelper = t3.b;
            izs<String, DivSizeUnit> izsVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = t3.a;
            Expression<DivSizeUnit> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject2, "unit", typeHelper, izsVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new s3(expression, JsonFieldResolver.resolveExpression(parsingContext, u3Var2.b, jSONObject2, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        a = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        b = TypeHelper.Companion.from(divSizeUnit, a.i);
    }
}
