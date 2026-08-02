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
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.izs;
import xsna.jon;
import xsna.non;
import xsna.zq;

/* compiled from: DivShadowJsonParser.kt */
/* loaded from: classes8.dex */
public final class o9 {

    @Deprecated
    public static final Expression<Double> a;

    @Deprecated
    public static final Expression<Long> b;

    @Deprecated
    public static final Expression<Integer> c;

    @Deprecated
    public static final zq d;

    @Deprecated
    public static final com.vk.movika.sdk.android.defaultplayer.interactive.c e;

    /* compiled from: DivShadowJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, n9 n9Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", n9Var.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "blur", n9Var.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", n9Var.c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, SignalingProtocol.KEY_OFFSET, n9Var.d, this.a.W5);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            zq zqVar = o9.d;
            Expression<Double> expression = o9.a;
            Expression<Double> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, izsVar, zqVar, expression);
            if (readOptionalExpression == null) {
                readOptionalExpression = expression;
            }
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            com.vk.movika.sdk.android.defaultplayer.interactive.c cVar = o9.e;
            Expression<Long> expression2 = o9.b;
            Expression<Long> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "blur", typeHelper2, izsVar2, cVar, expression2);
            if (readOptionalExpression2 != null) {
                expression2 = readOptionalExpression2;
            }
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar3 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression3 = o9.c;
            Expression<Integer> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "color", typeHelper3, izsVar3, expression3);
            if (readOptionalExpression3 != null) {
                expression3 = readOptionalExpression3;
            }
            return new n9(readOptionalExpression, expression2, expression3, (jon) JsonPropertyParser.read(parsingContext, jSONObject, SignalingProtocol.KEY_OFFSET, this.a.W5));
        }
    }

    /* compiled from: DivShadowJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, p9 p9Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", p9Var.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "blur", p9Var.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", p9Var.c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, SignalingProtocol.KEY_OFFSET, p9Var.d, this.a.X5);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            p9 p9Var = (p9) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new p9(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, p9Var != null ? p9Var.a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, o9.d), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "blur", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, p9Var != null ? p9Var.b : null, ParsingConvertersKt.NUMBER_TO_INT, o9.e), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, p9Var != null ? p9Var.c : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, SignalingProtocol.KEY_OFFSET, allowPropertyOverride, p9Var != null ? p9Var.d : null, this.a.X5));
        }
    }

    /* compiled from: DivShadowJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, p9, n9> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final n9 resolve(ParsingContext parsingContext, p9 p9Var, JSONObject jSONObject) {
            p9 p9Var2 = p9Var;
            JSONObject jSONObject2 = jSONObject;
            Field<Expression<Double>> field = p9Var2.a;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            zq zqVar = o9.d;
            Expression<Double> expression = o9.a;
            Expression<Double> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject2, "alpha", typeHelper, izsVar, zqVar, expression);
            if (resolveOptionalExpression == null) {
                resolveOptionalExpression = expression;
            }
            Field<Expression<Long>> field2 = p9Var2.b;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            com.vk.movika.sdk.android.defaultplayer.interactive.c cVar = o9.e;
            Expression<Long> expression2 = o9.b;
            Expression<Long> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "blur", typeHelper2, izsVar2, cVar, expression2);
            if (resolveOptionalExpression2 != null) {
                expression2 = resolveOptionalExpression2;
            }
            Field<Expression<Integer>> field3 = p9Var2.c;
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar3 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression3 = o9.c;
            Expression<Integer> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject2, "color", typeHelper3, izsVar3, expression3);
            if (resolveOptionalExpression3 != null) {
                expression3 = resolveOptionalExpression3;
            }
            Field<non> field4 = p9Var2.d;
            fe feVar = this.a;
            return new n9(resolveOptionalExpression, expression2, expression3, (jon) JsonFieldResolver.resolve(parsingContext, field4, jSONObject2, SignalingProtocol.KEY_OFFSET, feVar.Y5, feVar.W5));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, Double.valueOf(0.19d), null, 2, null);
        b = Expression.Companion.constant$default(companion, 2L, null, 2, null);
        c = Expression.Companion.constant$default(companion, 0, null, 2, null);
        d = new zq(14);
        e = new com.vk.movika.sdk.android.defaultplayer.interactive.c(13);
    }
}
