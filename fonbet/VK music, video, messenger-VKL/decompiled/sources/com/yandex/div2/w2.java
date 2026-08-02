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
import com.yandex.div2.DivContainer;
import com.yandex.div2.x2;
import org.json.JSONObject;
import xsna.izs;
import xsna.ukn;

/* compiled from: DivContainerJsonParser.kt */
/* loaded from: classes8.dex */
public final class w2 {

    @Deprecated
    public static final Expression<Boolean> a;

    @Deprecated
    public static final Expression<Boolean> b;

    @Deprecated
    public static final Expression<Boolean> c;

    /* compiled from: DivContainerJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivContainer.a aVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            y3 y3Var = aVar.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, feVar.Y2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "show_at_end", aVar.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "show_at_start", aVar.c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "show_between", aVar.d);
            JsonPropertyParser.write(parsingContext, jSONObject, TtmlNode.TAG_STYLE, aVar.e, feVar.V2);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            fe feVar = this.a;
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", feVar.Y2);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = w2.a;
            Expression<Boolean> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_at_end", typeHelper, izsVar, expression);
            if (readOptionalExpression == null) {
                readOptionalExpression = expression;
            }
            Expression<Boolean> expression2 = w2.b;
            Expression<Boolean> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_at_start", typeHelper, izsVar, expression2);
            Expression<Boolean> expression3 = readOptionalExpression2 == null ? expression2 : readOptionalExpression2;
            Expression<Boolean> expression4 = w2.c;
            Expression<Boolean> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_between", typeHelper, izsVar, expression4);
            if (readOptionalExpression3 != null) {
                expression4 = readOptionalExpression3;
            }
            return new DivContainer.a(y3Var, readOptionalExpression, expression3, expression4, (ukn) JsonPropertyParser.read(parsingContext, jSONObject, TtmlNode.TAG_STYLE, feVar.V2));
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, x2.a aVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<a4> field = aVar.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field, feVar.Z2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "show_at_end", aVar.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "show_at_start", aVar.c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "show_between", aVar.d);
            JsonFieldParser.writeField(parsingContext, jSONObject, TtmlNode.TAG_STYLE, aVar.e, feVar.W2);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            x2.a aVar = (x2.a) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<a4> field = aVar != null ? aVar.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, field, feVar.Z2);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field2 = aVar != null ? aVar.b : null;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new x2.a(readOptionalField, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "show_at_end", typeHelper, allowPropertyOverride, field2, izsVar), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "show_at_start", typeHelper, allowPropertyOverride, aVar != null ? aVar.c : null, izsVar), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "show_between", typeHelper, allowPropertyOverride, aVar != null ? aVar.d : null, izsVar), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, TtmlNode.TAG_STYLE, allowPropertyOverride, aVar != null ? aVar.e : null, feVar.W2));
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, x2.a, DivContainer.a> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final DivContainer.a resolve(ParsingContext parsingContext, x2.a aVar, JSONObject jSONObject) {
            x2.a aVar2 = aVar;
            JSONObject jSONObject2 = jSONObject;
            Field<a4> field = aVar2.a;
            fe feVar = this.a;
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject2, "margins", feVar.a3, feVar.Y2);
            Field<Expression<Boolean>> field2 = aVar2.b;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = w2.a;
            Expression<Boolean> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "show_at_end", typeHelper, izsVar, expression);
            Expression<Boolean> expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field<Expression<Boolean>> field3 = aVar2.c;
            Expression<Boolean> expression3 = w2.b;
            Expression<Boolean> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject2, "show_at_start", typeHelper, izsVar, expression3);
            Expression<Boolean> expression4 = resolveOptionalExpression2 == null ? expression3 : resolveOptionalExpression2;
            Field<Expression<Boolean>> field4 = aVar2.d;
            Expression<Boolean> expression5 = w2.c;
            Expression<Boolean> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject2, "show_between", typeHelper, izsVar, expression5);
            if (resolveOptionalExpression3 != null) {
                expression5 = resolveOptionalExpression3;
            }
            return new DivContainer.a(y3Var, expression2, expression4, expression5, (ukn) JsonFieldResolver.resolve(parsingContext, aVar2.e, jSONObject2, TtmlNode.TAG_STYLE, feVar.X2, feVar.V2));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Boolean bool = Boolean.FALSE;
        a = Expression.Companion.constant$default(companion, bool, null, 2, null);
        b = Expression.Companion.constant$default(companion, bool, null, 2, null);
        c = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
    }
}
