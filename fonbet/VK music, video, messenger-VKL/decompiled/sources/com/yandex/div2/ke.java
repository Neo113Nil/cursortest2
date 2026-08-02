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
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.izs;
import xsna.rl3;

/* compiled from: PropertyVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class ke {

    @Deprecated
    public static final TypeHelper<DivEvaluableType> a = TypeHelper.Companion.from(rl3.L(DivEvaluableType.values()), a.i);

    /* compiled from: PropertyVariableJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivEvaluableType);
        }
    }

    /* compiled from: PropertyVariableJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final je deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING);
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "name");
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "new_value_variable_name");
            if (str2 == null) {
                TypeHelper<DivEvaluableType> typeHelper = ke.a;
                str2 = "new_value";
            }
            return new je(readExpression, str, str2, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "set", this.a.k1), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value_type", ke.a, DivEvaluableType.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, je jeVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "get", jeVar.a);
            JsonPropertyParser.write(parsingContext, jSONObject, "name", jeVar.b);
            JsonPropertyParser.write(parsingContext, jSONObject, "new_value_variable_name", jeVar.c);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "set", jeVar.d, this.a.k1);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "property");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value_type", jeVar.e, DivEvaluableType.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: PropertyVariableJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final le deserialize(ParsingContext parsingContext, le leVar, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new le(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, leVar != null ? leVar.a : null), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, leVar != null ? leVar.b : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "new_value_variable_name", allowPropertyOverride, leVar != null ? leVar.c : null), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "set", allowPropertyOverride, leVar != null ? leVar.d : null, this.a.l1), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value_type", ke.a, allowPropertyOverride, leVar != null ? leVar.e : null, DivEvaluableType.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, le leVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "get", leVar.a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "name", leVar.b);
            JsonFieldParser.writeField(parsingContext, jSONObject, "new_value_variable_name", leVar.c);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "set", leVar.d, this.a.l1);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "property");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value_type", leVar.e, DivEvaluableType.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: PropertyVariableJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, le, je> {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final je resolve(ParsingContext parsingContext, le leVar, JSONObject jSONObject) throws ParsingException {
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, leVar.a, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING);
            String str = (String) JsonFieldResolver.resolve(parsingContext, leVar.b, jSONObject, "name");
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, leVar.c, jSONObject, "new_value_variable_name");
            if (str2 == null) {
                TypeHelper<DivEvaluableType> typeHelper = ke.a;
                str2 = "new_value";
            }
            Field<List<h0>> field = leVar.d;
            fe feVar = this.a;
            return new je(resolveExpression, str, str2, JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject, "set", feVar.m1, feVar.k1), JsonFieldResolver.resolveExpression(parsingContext, leVar.e, jSONObject, "value_type", ke.a, DivEvaluableType.FROM_STRING));
        }
    }
}
