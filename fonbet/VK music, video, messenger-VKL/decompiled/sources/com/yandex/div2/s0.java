package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionVideo;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.izs;
import xsna.rl3;

/* compiled from: DivActionVideoJsonParser.kt */
/* loaded from: classes8.dex */
public final class s0 {

    @Deprecated
    public static final TypeHelper<DivActionVideo.Action> a = TypeHelper.Companion.from(rl3.L(DivActionVideo.Action.values()), a.i);

    /* compiled from: DivActionVideoJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivActionVideo.Action);
        }
    }

    /* compiled from: DivActionVideoJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public static DivActionVideo a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new DivActionVideo(JsonExpressionParser.readExpression(parsingContext, jSONObject, "action", s0.a, DivActionVideo.Action.FROM_STRING), JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        public static JSONObject b(ParsingContext parsingContext, DivActionVideo divActionVideo) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "action", divActionVideo.a, DivActionVideo.Action.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", divActionVideo.b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (DivActionVideo) obj);
        }
    }

    /* compiled from: DivActionVideoJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public static t0 a(ParsingContext parsingContext, t0 t0Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new t0(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "action", s0.a, allowPropertyOverride, t0Var != null ? t0Var.a : null, DivActionVideo.Action.FROM_STRING), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, t0Var != null ? t0Var.b : null));
        }

        public static JSONObject b(ParsingContext parsingContext, t0 t0Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "action", t0Var.a, DivActionVideo.Action.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", t0Var.b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (t0) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (t0) obj);
        }
    }

    /* compiled from: DivActionVideoJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, t0, DivActionVideo> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final DivActionVideo resolve(ParsingContext parsingContext, t0 t0Var, JSONObject jSONObject) {
            t0 t0Var2 = t0Var;
            JSONObject jSONObject2 = jSONObject;
            return new DivActionVideo(JsonFieldResolver.resolveExpression(parsingContext, t0Var2.a, jSONObject2, "action", s0.a, DivActionVideo.Action.FROM_STRING), JsonFieldResolver.resolveExpression(parsingContext, t0Var2.b, jSONObject2, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }
    }
}
