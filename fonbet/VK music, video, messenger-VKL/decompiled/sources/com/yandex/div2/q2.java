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
import com.yandex.div2.o2;
import com.yandex.div2.r2;
import org.json.JSONObject;
import xsna.izs;

/* compiled from: DivCollectionItemBuilderJsonParser.kt */
/* loaded from: classes8.dex */
public final class q2 {

    @Deprecated
    public static final Expression<Boolean> a = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, o2.a aVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, TtmlNode.TAG_DIV, aVar.a, this.a.z9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", aVar.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "selector", aVar.c);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            com.yandex.div2.a aVar = (com.yandex.div2.a) JsonPropertyParser.read(parsingContext, jSONObject, TtmlNode.TAG_DIV, this.a.z9);
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = q2.a;
            Expression<Boolean> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "selector", typeHelper, izsVar, expression);
            if (readOptionalExpression2 != null) {
                expression = readOptionalExpression2;
            }
            return new o2.a(aVar, readOptionalExpression, expression);
        }
    }

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, r2.a aVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, TtmlNode.TAG_DIV, aVar.a, this.a.A9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", aVar.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "selector", aVar.c);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            r2.a aVar = (r2.a) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new r2.a(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, TtmlNode.TAG_DIV, allowPropertyOverride, aVar != null ? aVar.a : null, this.a.A9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, aVar != null ? aVar.b : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "selector", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, aVar != null ? aVar.c : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }
    }

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, r2.a, o2.a> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final o2.a resolve(ParsingContext parsingContext, r2.a aVar, JSONObject jSONObject) {
            r2.a aVar2 = aVar;
            JSONObject jSONObject2 = jSONObject;
            Field<nb> field = aVar2.a;
            fe feVar = this.a;
            com.yandex.div2.a aVar3 = (com.yandex.div2.a) JsonFieldResolver.resolve(parsingContext, field, jSONObject2, TtmlNode.TAG_DIV, feVar.B9, feVar.z9);
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, aVar2.b, jSONObject2, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Boolean>> field2 = aVar2.c;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = q2.a;
            Expression<Boolean> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "selector", typeHelper, izsVar, expression);
            if (resolveOptionalExpression2 != null) {
                expression = resolveOptionalExpression2;
            }
            return new o2.a(aVar3, resolveOptionalExpression, expression);
        }
    }
}
