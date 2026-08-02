package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
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
import xsna.izs;
import xsna.wr;
import xsna.xr;

/* compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
/* loaded from: classes8.dex */
public final class c {

    @Deprecated
    public static final Expression<Long> a;

    @Deprecated
    public static final Expression<Long> b;

    @Deprecated
    public static final Expression<Long> c;

    @Deprecated
    public static final Expression<Long> d;

    @Deprecated
    public static final wr e;

    @Deprecated
    public static final xr f;

    @Deprecated
    public static final io.reactivex.rxjava3.processors.b g;

    @Deprecated
    public static final io.reactivex.rxjava3.subjects.b h;

    /* compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public static JSONObject a(ParsingContext parsingContext, com.yandex.div2.b bVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "bottom", bVar.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, TtmlNode.LEFT, bVar.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, TtmlNode.RIGHT, bVar.c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "top", bVar.d);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            wr wrVar = c.e;
            Expression<Long> expression = c.a;
            Expression<Long> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "bottom", typeHelper, izsVar, wrVar, expression);
            if (readOptionalExpression == null) {
                readOptionalExpression = expression;
            }
            xr xrVar = c.f;
            Expression<Long> expression2 = c.b;
            Expression<Long> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, TtmlNode.LEFT, typeHelper, izsVar, xrVar, expression2);
            Expression<Long> expression3 = readOptionalExpression2 == null ? expression2 : readOptionalExpression2;
            io.reactivex.rxjava3.processors.b bVar = c.g;
            Expression<Long> expression4 = c.c;
            Expression<Long> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, TtmlNode.RIGHT, typeHelper, izsVar, bVar, expression4);
            Expression<Long> expression5 = readOptionalExpression3 == null ? expression4 : readOptionalExpression3;
            io.reactivex.rxjava3.subjects.b bVar2 = c.h;
            Expression<Long> expression6 = c.d;
            Expression<Long> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "top", typeHelper, izsVar, bVar2, expression6);
            if (readOptionalExpression4 != null) {
                expression6 = readOptionalExpression4;
            }
            return new com.yandex.div2.b(readOptionalExpression, expression3, expression5, expression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (com.yandex.div2.b) obj);
        }
    }

    /* compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public static JSONObject a(ParsingContext parsingContext, d dVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "bottom", dVar.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, TtmlNode.LEFT, dVar.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, TtmlNode.RIGHT, dVar.c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "top", dVar.d);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            d dVar = (d) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = dVar != null ? dVar.a : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new d(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "bottom", typeHelper, allowPropertyOverride, field, izsVar, c.e), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, TtmlNode.LEFT, typeHelper, allowPropertyOverride, dVar != null ? dVar.b : null, izsVar, c.f), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, TtmlNode.RIGHT, typeHelper, allowPropertyOverride, dVar != null ? dVar.c : null, izsVar, c.g), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "top", typeHelper, allowPropertyOverride, dVar != null ? dVar.d : null, izsVar, c.h));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (d) obj);
        }
    }

    /* compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
    /* renamed from: com.yandex.div2.c$c, reason: collision with other inner class name */
    public static final class C2111c implements TemplateResolver<JSONObject, d, com.yandex.div2.b> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final com.yandex.div2.b resolve(ParsingContext parsingContext, d dVar, JSONObject jSONObject) {
            d dVar2 = dVar;
            JSONObject jSONObject2 = jSONObject;
            Field<Expression<Long>> field = dVar2.a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            wr wrVar = c.e;
            Expression<Long> expression = c.a;
            Expression<Long> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject2, "bottom", typeHelper, izsVar, wrVar, expression);
            if (resolveOptionalExpression == null) {
                resolveOptionalExpression = expression;
            }
            Field<Expression<Long>> field2 = dVar2.b;
            xr xrVar = c.f;
            Expression<Long> expression2 = c.b;
            Expression<Long> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, TtmlNode.LEFT, typeHelper, izsVar, xrVar, expression2);
            Expression<Long> expression3 = resolveOptionalExpression2 == null ? expression2 : resolveOptionalExpression2;
            Field<Expression<Long>> field3 = dVar2.c;
            io.reactivex.rxjava3.processors.b bVar = c.g;
            Expression<Long> expression4 = c.c;
            Expression<Long> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject2, TtmlNode.RIGHT, typeHelper, izsVar, bVar, expression4);
            Expression<Long> expression5 = resolveOptionalExpression3 == null ? expression4 : resolveOptionalExpression3;
            Field<Expression<Long>> field4 = dVar2.d;
            io.reactivex.rxjava3.subjects.b bVar2 = c.h;
            Expression<Long> expression6 = c.d;
            Expression<Long> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject2, "top", typeHelper, izsVar, bVar2, expression6);
            if (resolveOptionalExpression4 != null) {
                expression6 = resolveOptionalExpression4;
            }
            return new com.yandex.div2.b(resolveOptionalExpression, expression3, expression5, expression6);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        b = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        e = new wr(14);
        f = new xr(14);
        g = new io.reactivex.rxjava3.processors.b(11);
        h = new io.reactivex.rxjava3.subjects.b(13);
    }
}
