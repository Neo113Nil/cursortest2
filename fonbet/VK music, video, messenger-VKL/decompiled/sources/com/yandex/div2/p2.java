package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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
import com.yandex.div2.r2;
import java.util.List;
import org.json.JSONObject;
import xsna.uf3;

/* compiled from: DivCollectionItemBuilderJsonParser.kt */
/* loaded from: classes8.dex */
public final class p2 {

    @Deprecated
    public static final uf3 a = new uf3(6);

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, o2 o2Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "data", o2Var.a);
            JsonPropertyParser.write(parsingContext, jSONObject, "data_element_name", o2Var.b);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "prototypes", o2Var.c, this.a.g2);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "data_element_name");
            if (str == null) {
                str = "it";
            }
            return new o2(readExpression, str, JsonPropertyParser.readList(parsingContext, jSONObject, "prototypes", this.a.g2, p2.a));
        }
    }

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, r2 r2Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "data", r2Var.a);
            JsonFieldParser.writeField(parsingContext, jSONObject, "data_element_name", r2Var.b);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "prototypes", r2Var.c, this.a.h2);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            r2 r2Var = (r2) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new r2(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY, allowPropertyOverride, r2Var != null ? r2Var.a : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "data_element_name", allowPropertyOverride, r2Var != null ? r2Var.b : null), JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "prototypes", allowPropertyOverride, r2Var != null ? r2Var.c : null, this.a.h2, p2.a));
        }
    }

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, r2, o2> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final o2 resolve(ParsingContext parsingContext, r2 r2Var, JSONObject jSONObject) {
            r2 r2Var2 = r2Var;
            JSONObject jSONObject2 = jSONObject;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, r2Var2.a, jSONObject2, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, r2Var2.b, jSONObject2, "data_element_name");
            if (str == null) {
                str = "it";
            }
            Field<List<r2.a>> field = r2Var2.c;
            fe feVar = this.a;
            return new o2(resolveExpression, str, JsonFieldResolver.resolveList(parsingContext, field, jSONObject2, "prototypes", feVar.i2, feVar.g2, p2.a));
        }
    }
}
