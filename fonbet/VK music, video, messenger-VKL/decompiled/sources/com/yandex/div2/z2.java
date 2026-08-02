package com.yandex.div2;

import com.ironsource.X3;
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
import org.json.JSONObject;
import xsna.fq;
import xsna.gq;
import xsna.hq;
import xsna.iq;
import xsna.izs;

/* compiled from: DivCornersRadiusJsonParser.kt */
/* loaded from: classes8.dex */
public final class z2 {

    @Deprecated
    public static final fq a = new fq(9);

    @Deprecated
    public static final gq b = new gq(11);

    @Deprecated
    public static final hq c = new hq(11);

    @Deprecated
    public static final iq d = new iq(8);

    /* compiled from: DivCornersRadiusJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public static JSONObject a(ParsingContext parsingContext, y2 y2Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.e.e, y2Var.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.e.d, y2Var.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.e.c, y2Var.c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.e.b, y2Var.d);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new y2(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.e.e, typeHelper, izsVar, z2.a), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.e.d, typeHelper, izsVar, z2.b), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.e.c, typeHelper, izsVar, z2.c), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.e.b, typeHelper, izsVar, z2.d));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (y2) obj);
        }
    }

    /* compiled from: DivCornersRadiusJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public static JSONObject a(ParsingContext parsingContext, a3 a3Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.e.e, a3Var.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.e.d, a3Var.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.e.c, a3Var.c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.e.b, a3Var.d);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            a3 a3Var = (a3) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = a3Var != null ? a3Var.a : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new a3(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.e.e, typeHelper, allowPropertyOverride, field, izsVar, z2.a), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.e.d, typeHelper, allowPropertyOverride, a3Var != null ? a3Var.b : null, izsVar, z2.b), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.e.c, typeHelper, allowPropertyOverride, a3Var != null ? a3Var.c : null, izsVar, z2.c), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.e.b, typeHelper, allowPropertyOverride, a3Var != null ? a3Var.d : null, izsVar, z2.d));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (a3) obj);
        }
    }

    /* compiled from: DivCornersRadiusJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, a3, y2> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final y2 resolve(ParsingContext parsingContext, a3 a3Var, JSONObject jSONObject) {
            a3 a3Var2 = a3Var;
            JSONObject jSONObject2 = jSONObject;
            Field<Expression<Long>> field = a3Var2.a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new y2(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject2, X3.e.e, typeHelper, izsVar, z2.a), JsonFieldResolver.resolveOptionalExpression(parsingContext, a3Var2.b, jSONObject2, X3.e.d, typeHelper, izsVar, z2.b), JsonFieldResolver.resolveOptionalExpression(parsingContext, a3Var2.c, jSONObject2, X3.e.c, typeHelper, izsVar, z2.c), JsonFieldResolver.resolveOptionalExpression(parsingContext, a3Var2.d, jSONObject2, X3.e.b, typeHelper, izsVar, z2.d));
        }
    }
}
