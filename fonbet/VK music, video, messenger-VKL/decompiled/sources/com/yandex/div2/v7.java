package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;
import xsna.lr;

/* compiled from: DivPercentageSizeJsonParser.kt */
/* loaded from: classes8.dex */
public final class v7 {

    @Deprecated
    public static final com.vk.movika.sdk.base.model.history.b a = new com.vk.movika.sdk.base.model.history.b(10);

    /* compiled from: DivPercentageSizeJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            return new u7(JsonExpressionParser.readExpression(parsingContext, (JSONObject) obj, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, v7.a));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            JSONObject b = lr.b(parsingContext, "type", "percentage");
            JsonExpressionParser.writeExpression(parsingContext, b, "value", ((u7) obj).a);
            return b;
        }
    }

    /* compiled from: DivPercentageSizeJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            w7 w7Var = (w7) entityTemplate;
            return new w7(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, parsingContext.getAllowPropertyOverride(), w7Var != null ? w7Var.a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, v7.a));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            JSONObject b = lr.b(parsingContext, "type", "percentage");
            JsonFieldParser.writeExpressionField(parsingContext, b, "value", ((w7) obj).a);
            return b;
        }
    }

    /* compiled from: DivPercentageSizeJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, w7, u7> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final u7 resolve(ParsingContext parsingContext, w7 w7Var, JSONObject jSONObject) {
            return new u7(JsonFieldResolver.resolveExpression(parsingContext, w7Var.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, v7.a));
        }
    }
}
