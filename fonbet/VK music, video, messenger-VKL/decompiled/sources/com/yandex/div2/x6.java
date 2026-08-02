package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;
import xsna.at;

/* compiled from: DivMatchParentSizeJsonParser.kt */
/* loaded from: classes8.dex */
public final class x6 {

    @Deprecated
    public static final at a = new at(15);

    /* compiled from: DivMatchParentSizeJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w6 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            fe feVar = this.a;
            return new w6(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "weight", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, x6.a), (aa) JsonPropertyParser.readOptional(parsingContext, jSONObject, "max_size", feVar.V6), (aa) JsonPropertyParser.readOptional(parsingContext, jSONObject, "min_size", feVar.V6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, w6 w6Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            aa aaVar = w6Var.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "max_size", aaVar, feVar.V6);
            JsonPropertyParser.write(parsingContext, jSONObject, "min_size", w6Var.b, feVar.V6);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "match_parent");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "weight", w6Var.c);
            return jSONObject;
        }
    }

    /* compiled from: DivMatchParentSizeJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y6 deserialize(ParsingContext parsingContext, y6 y6Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<ca> field = y6Var != null ? y6Var.a : null;
            fe feVar = this.a;
            return new y6(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "max_size", allowPropertyOverride, field, feVar.W6), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "min_size", allowPropertyOverride, y6Var != null ? y6Var.b : null, feVar.W6), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "weight", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, y6Var != null ? y6Var.c : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, x6.a));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, y6 y6Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<ca> field = y6Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "max_size", field, feVar.W6);
            JsonFieldParser.writeField(parsingContext, jSONObject, "min_size", y6Var.b, feVar.W6);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "match_parent");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "weight", y6Var.c);
            return jSONObject;
        }
    }

    /* compiled from: DivMatchParentSizeJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, y6, w6> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w6 resolve(ParsingContext parsingContext, y6 y6Var, JSONObject jSONObject) throws ParsingException {
            Field<ca> field = y6Var.a;
            fe feVar = this.a;
            return new w6(JsonFieldResolver.resolveOptionalExpression(parsingContext, y6Var.c, jSONObject, "weight", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, x6.a), (aa) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "max_size", feVar.X6, feVar.V6), (aa) JsonFieldResolver.resolveOptional(parsingContext, y6Var.b, jSONObject, "min_size", feVar.X6, feVar.V6));
        }
    }
}
