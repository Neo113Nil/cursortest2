package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
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
import com.yandex.div2.xa;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.izs;
import xsna.qpn;

/* compiled from: DivStrokeJsonParser.kt */
/* loaded from: classes8.dex */
public final class wa {

    @Deprecated
    public static final xa.b a = new xa.b(new qpn());

    @Deprecated
    public static final Expression<DivSizeUnit> b;

    @Deprecated
    public static final Expression<Double> c;

    @Deprecated
    public static final TypeHelper<DivSizeUnit> d;

    @Deprecated
    public static final defpackage.j0 e;

    /* compiled from: DivStrokeJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivStrokeJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, va vaVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", vaVar.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, TtmlNode.TAG_STYLE, vaVar.b, this.a.F7);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "unit", vaVar.c, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "width", vaVar.d);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            xa xaVar = (xa) JsonPropertyParser.readOptional(parsingContext, jSONObject, TtmlNode.TAG_STYLE, this.a.F7);
            if (xaVar == null) {
                xaVar = wa.a;
            }
            xa xaVar2 = xaVar;
            TypeHelper<DivSizeUnit> typeHelper = wa.d;
            izs<String, DivSizeUnit> izsVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = wa.b;
            Expression<DivSizeUnit> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "unit", typeHelper, izsVar, expression);
            if (readOptionalExpression == null) {
                readOptionalExpression = expression;
            }
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            defpackage.j0 j0Var = wa.e;
            Expression<Double> expression2 = wa.c;
            Expression<Double> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "width", typeHelper2, izsVar2, j0Var, expression2);
            if (readOptionalExpression2 != null) {
                expression2 = readOptionalExpression2;
            }
            return new va(readExpression, xaVar2, readOptionalExpression, expression2);
        }
    }

    /* compiled from: DivStrokeJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, cb cbVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", cbVar.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, TtmlNode.TAG_STYLE, cbVar.b, this.a.G7);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "unit", cbVar.c, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "width", cbVar.d);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            cb cbVar = (cb) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new cb(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, cbVar != null ? cbVar.a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, TtmlNode.TAG_STYLE, allowPropertyOverride, cbVar != null ? cbVar.b : null, this.a.G7), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "unit", wa.d, allowPropertyOverride, cbVar != null ? cbVar.c : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "width", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, cbVar != null ? cbVar.d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, wa.e));
        }
    }

    /* compiled from: DivStrokeJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, cb, va> {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final va resolve(ParsingContext parsingContext, cb cbVar, JSONObject jSONObject) {
            cb cbVar2 = cbVar;
            JSONObject jSONObject2 = jSONObject;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, cbVar2.a, jSONObject2, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field<bb> field = cbVar2.b;
            fe feVar = this.a;
            xa xaVar = (xa) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject2, TtmlNode.TAG_STYLE, feVar.H7, feVar.F7);
            if (xaVar == null) {
                xaVar = wa.a;
            }
            xa xaVar2 = xaVar;
            Field<Expression<DivSizeUnit>> field2 = cbVar2.c;
            TypeHelper<DivSizeUnit> typeHelper = wa.d;
            izs<String, DivSizeUnit> izsVar = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression = wa.b;
            Expression<DivSizeUnit> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "unit", typeHelper, izsVar, expression);
            Expression<DivSizeUnit> expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field<Expression<Double>> field3 = cbVar2.d;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            defpackage.j0 j0Var = wa.e;
            Expression<Double> expression3 = wa.c;
            Expression<Double> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject2, "width", typeHelper2, izsVar2, j0Var, expression3);
            if (resolveOptionalExpression2 != null) {
                expression3 = resolveOptionalExpression2;
            }
            return new va(resolveExpression, xaVar2, expression2, expression3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        b = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        c = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        d = TypeHelper.Companion.from(divSizeUnit, a.i);
        e = new defpackage.j0(15);
    }
}
