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
import xsna.ar;
import xsna.izs;

/* compiled from: DivSizeUnitValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class ba {

    @Deprecated
    public static final Expression<DivSizeUnit> a;

    @Deprecated
    public static final TypeHelper<DivSizeUnit> b;

    @Deprecated
    public static final ar c;

    /* compiled from: DivSizeUnitValueJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivSizeUnitValueJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            TypeHelper<DivSizeUnit> typeHelper = ba.b;
            izs<String, DivSizeUnit> izsVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = ba.a;
            Expression<DivSizeUnit> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "unit", typeHelper, izsVar, expression);
            if (readOptionalExpression == null) {
                readOptionalExpression = expression;
            }
            return new aa(readOptionalExpression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, ba.c));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            aa aaVar = (aa) obj;
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "unit", aaVar.a, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", aaVar.b);
            return jSONObject;
        }
    }

    /* compiled from: DivSizeUnitValueJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            ca caVar = (ca) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new ca(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "unit", ba.b, allowPropertyOverride, caVar != null ? caVar.a : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, caVar != null ? caVar.b : null, ParsingConvertersKt.NUMBER_TO_INT, ba.c));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            ca caVar = (ca) obj;
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "unit", caVar.a, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", caVar.b);
            return jSONObject;
        }
    }

    /* compiled from: DivSizeUnitValueJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, ca, aa> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final aa resolve(ParsingContext parsingContext, ca caVar, JSONObject jSONObject) {
            ca caVar2 = caVar;
            JSONObject jSONObject2 = jSONObject;
            Field<Expression<DivSizeUnit>> field = caVar2.a;
            TypeHelper<DivSizeUnit> typeHelper = ba.b;
            izs<String, DivSizeUnit> izsVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = ba.a;
            Expression<DivSizeUnit> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject2, "unit", typeHelper, izsVar, expression);
            if (resolveOptionalExpression == null) {
                resolveOptionalExpression = expression;
            }
            return new aa(resolveOptionalExpression, JsonFieldResolver.resolveExpression(parsingContext, caVar2.b, jSONObject2, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, ba.c));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        a = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        b = TypeHelper.Companion.from(divSizeUnit, a.i);
        c = new ar(10);
    }
}
