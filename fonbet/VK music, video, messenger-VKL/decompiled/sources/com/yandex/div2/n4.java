package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
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
import com.yandex.div2.p4;
import java.util.List;
import org.json.JSONObject;
import xsna.izs;

/* compiled from: DivFixedLengthInputMaskJsonParser.kt */
/* loaded from: classes8.dex */
public final class n4 {

    @Deprecated
    public static final Expression<Boolean> a = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    @Deprecated
    public static final io.reactivex.rxjava3.internal.operators.mixed.n b = new io.reactivex.rxjava3.internal.operators.mixed.n(9);

    /* compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m4 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = n4.a;
            Expression<Boolean> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "always_visible", typeHelper, izsVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new m4(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING), JsonPropertyParser.readList(parsingContext, jSONObject, "pattern_elements", this.a.t3, n4.b), (String) JsonPropertyParser.read(parsingContext, jSONObject, "raw_text_variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, m4 m4Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "always_visible", m4Var.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pattern", m4Var.b);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "pattern_elements", m4Var.c, this.a.t3);
            JsonPropertyParser.write(parsingContext, jSONObject, "raw_text_variable", m4Var.d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed_length");
            return jSONObject;
        }
    }

    /* compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p4 deserialize(ParsingContext parsingContext, p4 p4Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new p4(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "always_visible", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, p4Var != null ? p4Var.a : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, p4Var != null ? p4Var.b : null), JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "pattern_elements", allowPropertyOverride, p4Var != null ? p4Var.c : null, this.a.u3, n4.b), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "raw_text_variable", allowPropertyOverride, p4Var != null ? p4Var.d : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, p4 p4Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "always_visible", p4Var.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pattern", p4Var.b);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "pattern_elements", p4Var.c, this.a.u3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "raw_text_variable", p4Var.d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed_length");
            return jSONObject;
        }
    }

    /* compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, p4, m4> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m4 resolve(ParsingContext parsingContext, p4 p4Var, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field = p4Var.a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = n4.a;
            Expression<Boolean> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "always_visible", typeHelper, izsVar, expression);
            Expression<Boolean> expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, p4Var.b, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<List<p4.a>> field2 = p4Var.c;
            fe feVar = this.a;
            return new m4(expression2, resolveExpression, JsonFieldResolver.resolveList(parsingContext, field2, jSONObject, "pattern_elements", feVar.v3, feVar.t3, n4.b), (String) JsonFieldResolver.resolve(parsingContext, p4Var.d, jSONObject, "raw_text_variable"));
        }
    }
}
