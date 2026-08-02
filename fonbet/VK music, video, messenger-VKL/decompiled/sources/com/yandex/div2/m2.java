package com.yandex.div2;

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
import org.json.JSONObject;
import xsna.tf3;

/* compiled from: DivCloudBackgroundJsonParser.kt */
/* loaded from: classes8.dex */
public final class m2 {

    @Deprecated
    public static final tf3 a = new tf3(9);

    /* compiled from: DivCloudBackgroundJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l2 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new l2(JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, m2.a), (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.a.Y2));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, l2 l2Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", l2Var.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", l2Var.b);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", l2Var.c, this.a.Y2);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "cloud");
            return jSONObject;
        }
    }

    /* compiled from: DivCloudBackgroundJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n2 deserialize(ParsingContext parsingContext, n2 n2Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new n2(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, n2Var != null ? n2Var.a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, n2Var != null ? n2Var.b : null, ParsingConvertersKt.NUMBER_TO_INT, m2.a), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, n2Var != null ? n2Var.c : null, this.a.Z2));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, n2 n2Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", n2Var.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", n2Var.b);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", n2Var.c, this.a.Z2);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "cloud");
            return jSONObject;
        }
    }

    /* compiled from: DivCloudBackgroundJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, n2, l2> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l2 resolve(ParsingContext parsingContext, n2 n2Var, JSONObject jSONObject) throws ParsingException {
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, n2Var.a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Expression resolveExpression2 = JsonFieldResolver.resolveExpression(parsingContext, n2Var.b, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, m2.a);
            Field<a4> field = n2Var.c;
            fe feVar = this.a;
            return new l2(resolveExpression, resolveExpression2, (y3) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "paddings", feVar.a3, feVar.Y2));
        }
    }
}
