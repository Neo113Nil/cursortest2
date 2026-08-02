package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivText;
import com.yandex.div2.wc;
import org.json.JSONObject;
import xsna.izs;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes8.dex */
public final class wb {

    @Deprecated
    public static final DivText.Image.Accessibility.Type a = DivText.Image.Accessibility.Type.AUTO;

    /* compiled from: DivTextJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "description", TypeHelpersKt.TYPE_HELPER_STRING);
            DivText.Image.Accessibility.Type type = (DivText.Image.Accessibility.Type) JsonPropertyParser.readOptional(parsingContext, jSONObject, "type", DivText.Image.Accessibility.Type.FROM_STRING);
            if (type == null) {
                type = wb.a;
            }
            return new DivText.Image.Accessibility(readOptionalExpression, type);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            DivText.Image.Accessibility accessibility = (DivText.Image.Accessibility) obj;
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "description", accessibility.a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", accessibility.b, (izs<DivText.Image.Accessibility.Type, R>) DivText.Image.Accessibility.Type.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            wc.b.a aVar = (wc.b.a) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new wc.b.a(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "description", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, aVar != null ? aVar.a : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "type", allowPropertyOverride, aVar != null ? aVar.b : null, DivText.Image.Accessibility.Type.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            wc.b.a aVar = (wc.b.a) obj;
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "description", aVar.a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "type", aVar.b, DivText.Image.Accessibility.Type.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, wc.b.a, DivText.Image.Accessibility> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final DivText.Image.Accessibility resolve(ParsingContext parsingContext, wc.b.a aVar, JSONObject jSONObject) {
            wc.b.a aVar2 = aVar;
            JSONObject jSONObject2 = jSONObject;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, aVar2.a, jSONObject2, "description", TypeHelpersKt.TYPE_HELPER_STRING);
            DivText.Image.Accessibility.Type type = (DivText.Image.Accessibility.Type) JsonFieldResolver.resolveOptional(parsingContext, aVar2.b, jSONObject2, "type", DivText.Image.Accessibility.Type.FROM_STRING);
            if (type == null) {
                type = wb.a;
            }
            return new DivText.Image.Accessibility(resolveOptionalExpression, type);
        }
    }
}
