package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
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
import xsna.kqn;
import xsna.oqn;
import xsna.v11;

/* compiled from: DivActionUpdateStructureJsonParser.kt */
/* loaded from: classes8.dex */
public final class q0 {

    @Deprecated
    public static final v11 a = new v11(11);

    /* compiled from: DivActionUpdateStructureJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new p0(JsonExpressionParser.readExpression(parsingContext, jSONObject, "path", typeHelper, q0.a), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", typeHelper), (kqn) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.a.e9));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, p0 p0Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "path", p0Var.a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "update_structure");
            JsonPropertyParser.write(parsingContext, jSONObject, "value", p0Var.b, this.a.e9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", p0Var.c);
            return jSONObject;
        }
    }

    /* compiled from: DivActionUpdateStructureJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r0 deserialize(ParsingContext parsingContext, r0 r0Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new r0(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "path", typeHelper, allowPropertyOverride, r0Var != null ? r0Var.a : null, q0.a), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "value", allowPropertyOverride, r0Var != null ? r0Var.b : null, this.a.f9), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "variable_name", typeHelper, allowPropertyOverride, r0Var != null ? r0Var.c : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, r0 r0Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "path", r0Var.a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "update_structure");
            JsonFieldParser.writeField(parsingContext, jSONObject, "value", r0Var.b, this.a.f9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", r0Var.c);
            return jSONObject;
        }
    }

    /* compiled from: DivActionUpdateStructureJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, r0, p0> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p0 resolve(ParsingContext parsingContext, r0 r0Var, JSONObject jSONObject) throws ParsingException {
            Field<Expression<String>> field = r0Var.a;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "path", typeHelper, q0.a);
            Field<oqn> field2 = r0Var.b;
            fe feVar = this.a;
            return new p0(resolveExpression, JsonFieldResolver.resolveExpression(parsingContext, r0Var.c, jSONObject, "variable_name", typeHelper), (kqn) JsonFieldResolver.resolve(parsingContext, field2, jSONObject, "value", feVar.g9, feVar.e9));
        }
    }
}
