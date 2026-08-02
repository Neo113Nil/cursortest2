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
import xsna.nr;

/* compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
/* loaded from: classes8.dex */
public final class ta {

    @Deprecated
    public static final q4 a;

    @Deprecated
    public static final Expression<Long> b;

    @Deprecated
    public static final nr c;

    /* compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sa deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            q4 q4Var = (q4) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_spacing", this.a.w3);
            if (q4Var == null) {
                q4Var = ta.a;
            }
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            nr nrVar = ta.c;
            Expression<Long> expression = ta.b;
            Expression<Long> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_visible_items", typeHelper, izsVar, nrVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new sa(q4Var, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, sa saVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "item_spacing", saVar.a, this.a.w3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_visible_items", saVar.b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "stretch");
            return jSONObject;
        }
    }

    /* compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ua deserialize(ParsingContext parsingContext, ua uaVar, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new ua(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "item_spacing", allowPropertyOverride, uaVar != null ? uaVar.a : null, this.a.x3), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "max_visible_items", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, uaVar != null ? uaVar.b : null, ParsingConvertersKt.NUMBER_TO_INT, ta.c));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, ua uaVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_spacing", uaVar.a, this.a.x3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_visible_items", uaVar.b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "stretch");
            return jSONObject;
        }
    }

    /* compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, ua, sa> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sa resolve(ParsingContext parsingContext, ua uaVar, JSONObject jSONObject) throws ParsingException {
            Field<s4> field = uaVar.a;
            fe feVar = this.a;
            q4 q4Var = (q4) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "item_spacing", feVar.y3, feVar.w3);
            if (q4Var == null) {
                q4Var = ta.a;
            }
            Field<Expression<Long>> field2 = uaVar.b;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            nr nrVar = ta.c;
            Expression<Long> expression = ta.b;
            Expression<Long> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "max_visible_items", typeHelper, izsVar, nrVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new sa(q4Var, expression);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = new q4(Expression.Companion.constant$default(companion, 5L, null, 2, null));
        b = Expression.Companion.constant$default(companion, 10L, null, 2, null);
        c = new nr(12);
    }
}
