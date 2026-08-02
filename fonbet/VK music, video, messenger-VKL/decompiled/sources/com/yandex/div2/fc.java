package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;
import xsna.gp;

/* compiled from: DivTextRangeBorderJsonParser.kt */
/* loaded from: classes8.dex */
public final class fc {

    @Deprecated
    public static final gp a = new gp(14);

    /* compiled from: DivTextRangeBorderJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            return new ec(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, fc.a), (va) JsonPropertyParser.readOptional(parsingContext, jSONObject, "stroke", this.a.I7));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            ec ecVar = (ec) obj;
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", ecVar.a);
            JsonPropertyParser.write(parsingContext, jSONObject, "stroke", ecVar.b, this.a.I7);
            return jSONObject;
        }
    }

    /* compiled from: DivTextRangeBorderJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            gc gcVar = (gc) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new gc(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, gcVar != null ? gcVar.a : null, ParsingConvertersKt.NUMBER_TO_INT, fc.a), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "stroke", allowPropertyOverride, gcVar != null ? gcVar.b : null, this.a.J7));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            gc gcVar = (gc) obj;
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", gcVar.a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "stroke", gcVar.b, this.a.J7);
            return jSONObject;
        }
    }

    /* compiled from: DivTextRangeBorderJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, gc, ec> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final ec resolve(ParsingContext parsingContext, gc gcVar, JSONObject jSONObject) {
            gc gcVar2 = gcVar;
            JSONObject jSONObject2 = jSONObject;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, gcVar2.a, jSONObject2, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, fc.a);
            Field<cb> field = gcVar2.b;
            fe feVar = this.a;
            return new ec(resolveOptionalExpression, (va) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject2, "stroke", feVar.K7, feVar.I7));
        }
    }
}
