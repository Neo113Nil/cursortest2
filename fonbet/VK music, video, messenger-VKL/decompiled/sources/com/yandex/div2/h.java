package com.yandex.div2;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
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
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.as;
import xsna.izs;
import xsna.kqn;
import xsna.oqn;
import xsna.rl3;

/* compiled from: DivActionAnimatorStartJsonParser.kt */
/* loaded from: classes8.dex */
public final class h {

    @Deprecated
    public static final TypeHelper<DivAnimationDirection> a;

    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> b;

    @Deprecated
    public static final io.reactivex.rxjava3.subjects.c c;

    @Deprecated
    public static final as d;

    /* compiled from: DivActionAnimatorStartJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationDirection);
        }
    }

    /* compiled from: DivActionAnimatorStartJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
        }
    }

    /* compiled from: DivActionAnimatorStartJsonParser.kt */
    public static final class c implements Serializer, Deserializer {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "animator_id");
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, h.a, DivAnimationDirection.FROM_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, izsVar, h.c);
            fe feVar = this.a;
            return new g(str, readOptionalExpression, readOptionalExpression2, (kqn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "end_value", feVar.e9), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", h.b, DivAnimationInterpolator.FROM_STRING), (b3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat_count", feVar.v2), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, izsVar, h.d), (kqn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "start_value", feVar.e9));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, g gVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "animator_id", gVar.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, gVar.b, DivAnimationDirection.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", gVar.c);
            kqn kqnVar = gVar.d;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "end_value", kqnVar, feVar.e9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", gVar.e, DivAnimationInterpolator.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat_count", gVar.f, feVar.v2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", gVar.g);
            JsonPropertyParser.write(parsingContext, jSONObject, "start_value", gVar.h, feVar.e9);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "animator_start");
            return jSONObject;
        }
    }

    /* compiled from: DivActionAnimatorStartJsonParser.kt */
    public static final class d implements Serializer, TemplateDeserializer {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i deserialize(ParsingContext parsingContext, i iVar, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "animator_id", allowPropertyOverride, iVar != null ? iVar.a : null);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, h.a, allowPropertyOverride, iVar != null ? iVar.b : null, DivAnimationDirection.FROM_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = iVar != null ? iVar.c : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, izsVar, h.c);
            Field<oqn> field2 = iVar != null ? iVar.d : null;
            fe feVar = this.a;
            return new i(readField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "end_value", allowPropertyOverride, field2, feVar.f9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", h.b, allowPropertyOverride, iVar != null ? iVar.e : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "repeat_count", allowPropertyOverride, iVar != null ? iVar.f : null, feVar.w2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, iVar != null ? iVar.g : null, izsVar, h.d), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "start_value", allowPropertyOverride, iVar != null ? iVar.h : null, feVar.f9));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, i iVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "animator_id", iVar.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, iVar.b, DivAnimationDirection.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", iVar.c);
            Field<oqn> field = iVar.d;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "end_value", field, feVar.f9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", iVar.e, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat_count", iVar.f, feVar.w2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", iVar.g);
            JsonFieldParser.writeField(parsingContext, jSONObject, "start_value", iVar.h, feVar.f9);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "animator_start");
            return jSONObject;
        }
    }

    /* compiled from: DivActionAnimatorStartJsonParser.kt */
    public static final class e implements TemplateResolver<JSONObject, i, g> {
        public final fe a;

        public e(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g resolve(ParsingContext parsingContext, i iVar, JSONObject jSONObject) throws ParsingException {
            String str = (String) JsonFieldResolver.resolve(parsingContext, iVar.a, jSONObject, "animator_id");
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, iVar.b, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, h.a, DivAnimationDirection.FROM_STRING);
            Field<Expression<Long>> field = iVar.c;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, izsVar, h.c);
            Field<oqn> field2 = iVar.d;
            fe feVar = this.a;
            return new g(str, resolveOptionalExpression, resolveOptionalExpression2, (kqn) JsonFieldResolver.resolveOptional(parsingContext, field2, jSONObject, "end_value", feVar.g9, feVar.e9), JsonFieldResolver.resolveOptionalExpression(parsingContext, iVar.e, jSONObject, "interpolator", h.b, DivAnimationInterpolator.FROM_STRING), (b3) JsonFieldResolver.resolveOptional(parsingContext, iVar.f, jSONObject, "repeat_count", feVar.x2, feVar.v2), JsonFieldResolver.resolveOptionalExpression(parsingContext, iVar.g, jSONObject, "start_delay", typeHelper, izsVar, h.d), (kqn) JsonFieldResolver.resolveOptional(parsingContext, iVar.h, jSONObject, "start_value", feVar.g9, feVar.e9));
        }
    }

    static {
        TypeHelper.Companion companion = TypeHelper.Companion;
        a = companion.from(rl3.L(DivAnimationDirection.values()), a.i);
        b = companion.from(rl3.L(DivAnimationInterpolator.values()), b.i);
        c = new io.reactivex.rxjava3.subjects.c(13);
        d = new as(13);
    }
}
