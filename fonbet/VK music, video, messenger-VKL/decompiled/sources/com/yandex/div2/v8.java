package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.izs;
import xsna.lr;
import xsna.rl3;

/* compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
/* loaded from: classes8.dex */
public final class v8 {

    @Deprecated
    public static final TypeHelper<DivRadialGradientRelativeRadius.Value> a = TypeHelper.Companion.from(rl3.L(DivRadialGradientRelativeRadius.Value.values()), a.i);

    /* compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivRadialGradientRelativeRadius.Value);
        }
    }

    /* compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public static JSONObject a(ParsingContext parsingContext, DivRadialGradientRelativeRadius divRadialGradientRelativeRadius) throws ParsingException {
            JSONObject b = lr.b(parsingContext, "type", "relative");
            JsonExpressionParser.writeExpression(parsingContext, b, "value", divRadialGradientRelativeRadius.a, DivRadialGradientRelativeRadius.Value.TO_STRING);
            return b;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            return new DivRadialGradientRelativeRadius(JsonExpressionParser.readExpression(parsingContext, (JSONObject) obj, "value", v8.a, DivRadialGradientRelativeRadius.Value.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (DivRadialGradientRelativeRadius) obj);
        }
    }

    /* compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public static JSONObject a(ParsingContext parsingContext, w8 w8Var) throws ParsingException {
            JSONObject b = lr.b(parsingContext, "type", "relative");
            JsonFieldParser.writeExpressionField(parsingContext, b, "value", w8Var.a, DivRadialGradientRelativeRadius.Value.TO_STRING);
            return b;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            w8 w8Var = (w8) entityTemplate;
            return new w8(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, "value", v8.a, parsingContext.getAllowPropertyOverride(), w8Var != null ? w8Var.a : null, DivRadialGradientRelativeRadius.Value.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (w8) obj);
        }
    }

    /* compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, w8, DivRadialGradientRelativeRadius> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final DivRadialGradientRelativeRadius resolve(ParsingContext parsingContext, w8 w8Var, JSONObject jSONObject) {
            return new DivRadialGradientRelativeRadius(JsonFieldResolver.resolveExpression(parsingContext, w8Var.a, jSONObject, "value", v8.a, DivRadialGradientRelativeRadius.Value.FROM_STRING));
        }
    }
}
