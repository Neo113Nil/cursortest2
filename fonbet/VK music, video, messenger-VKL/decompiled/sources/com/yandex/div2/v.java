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

/* compiled from: DivActionScrollToJsonParser.kt */
/* loaded from: classes8.dex */
public final class v {

    @Deprecated
    public static final Expression<Boolean> a = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* compiled from: DivActionScrollToJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = v.a;
            Expression<Boolean> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animated", typeHelper, izsVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new u(expression, (p) JsonPropertyParser.read(parsingContext, jSONObject, "destination", this.a.x0), JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, u uVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animated", uVar.a);
            JsonPropertyParser.write(parsingContext, jSONObject, "destination", uVar.b, this.a.x0);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", uVar.c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_to");
            return jSONObject;
        }
    }

    /* compiled from: DivActionScrollToJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w deserialize(ParsingContext parsingContext, w wVar, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new w(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "animated", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, wVar != null ? wVar.a : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "destination", allowPropertyOverride, wVar != null ? wVar.b : null, this.a.y0), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, wVar != null ? wVar.c : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, w wVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animated", wVar.a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "destination", wVar.b, this.a.y0);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", wVar.c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_to");
            return jSONObject;
        }
    }

    /* compiled from: DivActionScrollToJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, w, u> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u resolve(ParsingContext parsingContext, w wVar, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field = wVar.a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = v.a;
            Expression<Boolean> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "animated", typeHelper, izsVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field<t> field2 = wVar.b;
            fe feVar = this.a;
            return new u(expression, (p) JsonFieldResolver.resolve(parsingContext, field2, jSONObject, "destination", feVar.z0, feVar.x0), JsonFieldResolver.resolveExpression(parsingContext, wVar.c, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }
    }
}
