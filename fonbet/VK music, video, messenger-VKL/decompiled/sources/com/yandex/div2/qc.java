package com.yandex.div2;

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
import xsna.vp;

/* compiled from: DivTextRangeMaskParticlesJsonParser.kt */
/* loaded from: classes8.dex */
public final class qc {

    @Deprecated
    public static final Expression<Double> a;

    @Deprecated
    public static final Expression<Boolean> b;

    @Deprecated
    public static final Expression<Boolean> c;

    @Deprecated
    public static final q4 d;

    @Deprecated
    public static final vp e;

    /* compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final pc deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            vp vpVar = qc.e;
            Expression<Double> expression = qc.a;
            Expression<Double> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "density", typeHelper, izsVar, vpVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = qc.b;
            Expression<Boolean> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_animated", typeHelper2, izsVar2, expression2);
            if (readOptionalExpression2 == null) {
                readOptionalExpression2 = expression2;
            }
            Expression<Boolean> expression3 = qc.c;
            Expression<Boolean> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper2, izsVar2, expression3);
            Expression<Boolean> expression4 = readOptionalExpression3 == null ? expression3 : readOptionalExpression3;
            q4 q4Var = (q4) JsonPropertyParser.readOptional(parsingContext, jSONObject, "particle_size", this.a.w3);
            if (q4Var == null) {
                q4Var = qc.d;
            }
            return new pc(readExpression, expression, readOptionalExpression2, expression4, q4Var);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, pc pcVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", pcVar.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "density", pcVar.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_animated", pcVar.c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", pcVar.d);
            JsonPropertyParser.write(parsingContext, jSONObject, "particle_size", pcVar.e, this.a.w3);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "particles");
            return jSONObject;
        }
    }

    /* compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rc deserialize(ParsingContext parsingContext, rc rcVar, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, rcVar != null ? rcVar.a : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "density", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, rcVar != null ? rcVar.b : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, qc.e);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field = rcVar != null ? rcVar.c : null;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new rc(readFieldWithExpression, readOptionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "is_animated", typeHelper, allowPropertyOverride, field, izsVar), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "is_enabled", typeHelper, allowPropertyOverride, rcVar != null ? rcVar.d : null, izsVar), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "particle_size", allowPropertyOverride, rcVar != null ? rcVar.e : null, this.a.x3));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, rc rcVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", rcVar.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "density", rcVar.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_animated", rcVar.c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", rcVar.d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "particle_size", rcVar.e, this.a.x3);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "particles");
            return jSONObject;
        }
    }

    /* compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, rc, pc> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final pc resolve(ParsingContext parsingContext, rc rcVar, JSONObject jSONObject) throws ParsingException {
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, rcVar.a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field<Expression<Double>> field = rcVar.b;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            vp vpVar = qc.e;
            Expression<Double> expression = qc.a;
            Expression<Double> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "density", typeHelper, izsVar, vpVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field<Expression<Boolean>> field2 = rcVar.c;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = qc.b;
            Expression<Boolean> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "is_animated", typeHelper2, izsVar2, expression2);
            if (resolveOptionalExpression2 == null) {
                resolveOptionalExpression2 = expression2;
            }
            Field<Expression<Boolean>> field3 = rcVar.d;
            Expression<Boolean> expression3 = qc.c;
            Expression<Boolean> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "is_enabled", typeHelper2, izsVar2, expression3);
            if (resolveOptionalExpression3 != null) {
                expression3 = resolveOptionalExpression3;
            }
            Field<s4> field4 = rcVar.e;
            fe feVar = this.a;
            q4 q4Var = (q4) JsonFieldResolver.resolveOptional(parsingContext, field4, jSONObject, "particle_size", feVar.y3, feVar.w3);
            if (q4Var == null) {
                q4Var = qc.d;
            }
            return new pc(resolveExpression, expression, resolveOptionalExpression2, expression3, q4Var);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, Double.valueOf(0.8d), null, 2, null);
        b = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        c = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        d = new q4(Expression.Companion.constant$default(companion, 1L, null, 2, null));
        e = new vp(14);
    }
}
