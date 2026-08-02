package com.yandex.div2;

import com.ironsource.X3;
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
import com.yandex.div2.f8;
import com.yandex.div2.x8;
import org.json.JSONObject;
import xsna.iq;

/* compiled from: DivRadialGradientJsonParser.kt */
/* loaded from: classes8.dex */
public final class l8 {

    @Deprecated
    public static final iq a = new iq(9);

    /* compiled from: DivRadialGradientJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            return new f8.a(JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, X3.i.L, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, l8.a));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            f8.a aVar = (f8.a) obj;
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", aVar.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.i.L, aVar.b);
            return jSONObject;
        }
    }

    /* compiled from: DivRadialGradientJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            x8.a aVar = (x8.a) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new x8.a(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, aVar != null ? aVar.a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, X3.i.L, TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, aVar != null ? aVar.b : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, l8.a));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            x8.a aVar = (x8.a) obj;
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", aVar.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.i.L, aVar.b);
            return jSONObject;
        }
    }

    /* compiled from: DivRadialGradientJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, x8.a, f8.a> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final f8.a resolve(ParsingContext parsingContext, x8.a aVar, JSONObject jSONObject) {
            x8.a aVar2 = aVar;
            JSONObject jSONObject2 = jSONObject;
            return new f8.a(JsonFieldResolver.resolveExpression(parsingContext, aVar2.a, jSONObject2, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldResolver.resolveExpression(parsingContext, aVar2.b, jSONObject2, X3.i.L, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, l8.a));
        }
    }
}
