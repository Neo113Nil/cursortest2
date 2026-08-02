package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
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
import com.yandex.div2.x7;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.eon;

/* compiled from: DivTransformJsonParser.kt */
/* loaded from: classes8.dex */
public final class id {

    @Deprecated
    public static final x7.b a;

    @Deprecated
    public static final x7.b b;

    /* compiled from: DivTransformJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, hd hdVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            x7 x7Var = hdVar.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "pivot_x", x7Var, feVar.T5);
            JsonPropertyParser.write(parsingContext, jSONObject, "pivot_y", hdVar.b, feVar.T5);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "rotation", hdVar.c);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            fe feVar = this.a;
            x7 x7Var = (x7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "pivot_x", feVar.T5);
            if (x7Var == null) {
                x7Var = id.a;
            }
            x7 x7Var2 = (x7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "pivot_y", feVar.T5);
            if (x7Var2 == null) {
                x7Var2 = id.b;
            }
            return new hd(x7Var, x7Var2, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "rotation", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }
    }

    /* compiled from: DivTransformJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, jd jdVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<e8> field = jdVar.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "pivot_x", field, feVar.U5);
            JsonFieldParser.writeField(parsingContext, jSONObject, "pivot_y", jdVar.b, feVar.U5);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "rotation", jdVar.c);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            jd jdVar = (jd) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<e8> field = jdVar != null ? jdVar.a : null;
            fe feVar = this.a;
            return new jd(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "pivot_x", allowPropertyOverride, field, feVar.U5), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "pivot_y", allowPropertyOverride, jdVar != null ? jdVar.b : null, feVar.U5), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "rotation", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, jdVar != null ? jdVar.c : null, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }
    }

    /* compiled from: DivTransformJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, jd, hd> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final hd resolve(ParsingContext parsingContext, jd jdVar, JSONObject jSONObject) {
            jd jdVar2 = jdVar;
            JSONObject jSONObject2 = jSONObject;
            Field<e8> field = jdVar2.a;
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.V5;
            bpn0 bpn0Var2 = feVar.T5;
            x7 x7Var = (x7) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject2, "pivot_x", bpn0Var, bpn0Var2);
            if (x7Var == null) {
                x7Var = id.a;
            }
            x7 x7Var2 = (x7) JsonFieldResolver.resolveOptional(parsingContext, jdVar2.b, jSONObject2, "pivot_y", feVar.V5, bpn0Var2);
            if (x7Var2 == null) {
                x7Var2 = id.b;
            }
            return new hd(x7Var, x7Var2, JsonFieldResolver.resolveOptionalExpression(parsingContext, jdVar2.c, jSONObject2, "rotation", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double valueOf = Double.valueOf(50.0d);
        a = new x7.b(new eon(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        b = new x7.b(new eon(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
    }
}
