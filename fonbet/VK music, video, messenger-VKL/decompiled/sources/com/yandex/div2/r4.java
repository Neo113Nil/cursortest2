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
import xsna.ar;
import xsna.izs;
import xsna.lr;

/* compiled from: DivFixedSizeJsonParser.kt */
/* loaded from: classes8.dex */
public final class r4 {

    @Deprecated
    public static final Expression<DivSizeUnit> a;

    @Deprecated
    public static final TypeHelper<DivSizeUnit> b;

    @Deprecated
    public static final ar c;

    /* compiled from: DivFixedSizeJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivFixedSizeJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public static q4 a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<DivSizeUnit> typeHelper = r4.b;
            izs<String, DivSizeUnit> izsVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = r4.a;
            Expression<DivSizeUnit> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "unit", typeHelper, izsVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new q4(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, r4.c));
        }

        public static JSONObject b(ParsingContext parsingContext, q4 q4Var) throws ParsingException {
            JSONObject b = lr.b(parsingContext, "type", "fixed");
            JsonExpressionParser.writeExpression(parsingContext, b, "unit", q4Var.a, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, b, "value", q4Var.b);
            return b;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (q4) obj);
        }
    }

    /* compiled from: DivFixedSizeJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public static s4 a(ParsingContext parsingContext, s4 s4Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new s4(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "unit", r4.b, allowPropertyOverride, s4Var != null ? s4Var.a : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, s4Var != null ? s4Var.b : null, ParsingConvertersKt.NUMBER_TO_INT, r4.c));
        }

        public static JSONObject b(ParsingContext parsingContext, s4 s4Var) throws ParsingException {
            JSONObject b = lr.b(parsingContext, "type", "fixed");
            JsonFieldParser.writeExpressionField(parsingContext, b, "unit", s4Var.a, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, b, "value", s4Var.b);
            return b;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (s4) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (s4) obj);
        }
    }

    /* compiled from: DivFixedSizeJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, s4, q4> {
        public static q4 a(ParsingContext parsingContext, s4 s4Var, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivSizeUnit>> field = s4Var.a;
            TypeHelper<DivSizeUnit> typeHelper = r4.b;
            izs<String, DivSizeUnit> izsVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = r4.a;
            Expression<DivSizeUnit> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "unit", typeHelper, izsVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new q4(expression, JsonFieldResolver.resolveExpression(parsingContext, s4Var.b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, r4.c));
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final /* bridge */ /* synthetic */ q4 resolve(ParsingContext parsingContext, s4 s4Var, JSONObject jSONObject) {
            return a(parsingContext, s4Var, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        a = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        b = TypeHelper.Companion.from(divSizeUnit, a.i);
        c = new ar(9);
    }
}
