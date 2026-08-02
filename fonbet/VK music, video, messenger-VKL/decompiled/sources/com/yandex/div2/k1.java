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
import xsna.ct;

/* compiled from: DivAspectJsonParser.kt */
/* loaded from: classes8.dex */
public final class k1 {

    @Deprecated
    public static final ct a = new ct(7);

    /* compiled from: DivAspectJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            return new j1(JsonExpressionParser.readExpression(parsingContext, (JSONObject) obj, "ratio", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, k1.a));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "ratio", ((j1) obj).a);
            return jSONObject;
        }
    }

    /* compiled from: DivAspectJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            l1 l1Var = (l1) entityTemplate;
            return new l1(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, "ratio", TypeHelpersKt.TYPE_HELPER_DOUBLE, parsingContext.getAllowPropertyOverride(), l1Var != null ? l1Var.a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, k1.a));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "ratio", ((l1) obj).a);
            return jSONObject;
        }
    }

    /* compiled from: DivAspectJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, l1, j1> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final j1 resolve(ParsingContext parsingContext, l1 l1Var, JSONObject jSONObject) {
            return new j1(JsonFieldResolver.resolveExpression(parsingContext, l1Var.a, jSONObject, "ratio", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, k1.a));
        }
    }
}
