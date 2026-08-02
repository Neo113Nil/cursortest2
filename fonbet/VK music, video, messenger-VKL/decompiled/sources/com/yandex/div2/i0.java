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
import com.yandex.div2.DivActionTimer;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.izs;
import xsna.rl3;

/* compiled from: DivActionTimerJsonParser.kt */
/* loaded from: classes8.dex */
public final class i0 {

    @Deprecated
    public static final TypeHelper<DivActionTimer.Action> a = TypeHelper.Companion.from(rl3.L(DivActionTimer.Action.values()), a.i);

    /* compiled from: DivActionTimerJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivActionTimer.Action);
        }
    }

    /* compiled from: DivActionTimerJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public static DivActionTimer a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new DivActionTimer(JsonExpressionParser.readExpression(parsingContext, jSONObject, "action", i0.a, DivActionTimer.Action.FROM_STRING), JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        public static JSONObject b(ParsingContext parsingContext, DivActionTimer divActionTimer) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "action", divActionTimer.a, DivActionTimer.Action.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", divActionTimer.b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "timer");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (DivActionTimer) obj);
        }
    }

    /* compiled from: DivActionTimerJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public static j0 a(ParsingContext parsingContext, j0 j0Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new j0(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "action", i0.a, allowPropertyOverride, j0Var != null ? j0Var.a : null, DivActionTimer.Action.FROM_STRING), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, j0Var != null ? j0Var.b : null));
        }

        public static JSONObject b(ParsingContext parsingContext, j0 j0Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "action", j0Var.a, DivActionTimer.Action.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", j0Var.b);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "timer");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (j0) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (j0) obj);
        }
    }

    /* compiled from: DivActionTimerJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, j0, DivActionTimer> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final DivActionTimer resolve(ParsingContext parsingContext, j0 j0Var, JSONObject jSONObject) {
            j0 j0Var2 = j0Var;
            JSONObject jSONObject2 = jSONObject;
            return new DivActionTimer(JsonFieldResolver.resolveExpression(parsingContext, j0Var2.a, jSONObject2, "action", i0.a, DivActionTimer.Action.FROM_STRING), JsonFieldResolver.resolveExpression(parsingContext, j0Var2.b, jSONObject2, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }
    }
}
