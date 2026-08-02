package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import org.json.JSONObject;
import xsna.cr;
import xsna.izs;
import xsna.vln;

/* compiled from: DivFunctionJsonParser.kt */
/* loaded from: classes8.dex */
public final class u4 {

    @Deprecated
    public static final cr a = new cr(9);

    /* compiled from: DivFunctionJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, t4 t4Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "arguments", t4Var.a, this.a.F3);
            JsonPropertyParser.write(parsingContext, jSONObject, "body", t4Var.b);
            JsonPropertyParser.write(parsingContext, jSONObject, "name", t4Var.c);
            JsonPropertyParser.write(parsingContext, jSONObject, "return_type", t4Var.d, (izs<DivEvaluableType, R>) DivEvaluableType.TO_STRING);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            return new t4(JsonPropertyParser.readList(parsingContext, jSONObject, "arguments", this.a.F3), (String) JsonPropertyParser.read(parsingContext, jSONObject, "body"), (String) JsonPropertyParser.read(parsingContext, jSONObject, "name", u4.a), (DivEvaluableType) JsonPropertyParser.read(parsingContext, jSONObject, "return_type", DivEvaluableType.FROM_STRING));
        }
    }

    /* compiled from: DivFunctionJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, v4 v4Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "arguments", v4Var.a, this.a.G3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "body", v4Var.b);
            JsonFieldParser.writeField(parsingContext, jSONObject, "name", v4Var.c);
            JsonFieldParser.writeField(parsingContext, jSONObject, "return_type", v4Var.d, DivEvaluableType.TO_STRING);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            v4 v4Var = (v4) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new v4(JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "arguments", allowPropertyOverride, v4Var != null ? v4Var.a : null, this.a.G3), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "body", allowPropertyOverride, v4Var != null ? v4Var.b : null), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, v4Var != null ? v4Var.c : null, u4.a), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "return_type", allowPropertyOverride, v4Var != null ? v4Var.d : null, DivEvaluableType.FROM_STRING));
        }
    }

    /* compiled from: DivFunctionJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, v4, t4> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final t4 resolve(ParsingContext parsingContext, v4 v4Var, JSONObject jSONObject) {
            v4 v4Var2 = v4Var;
            JSONObject jSONObject2 = jSONObject;
            Field<List<vln>> field = v4Var2.a;
            fe feVar = this.a;
            return new t4(JsonFieldResolver.resolveList(parsingContext, field, jSONObject2, "arguments", feVar.H3, feVar.F3), (String) JsonFieldResolver.resolve(parsingContext, v4Var2.b, jSONObject2, "body"), (String) JsonFieldResolver.resolve(parsingContext, v4Var2.c, jSONObject2, "name", u4.a), (DivEvaluableType) JsonFieldResolver.resolve(parsingContext, v4Var2.d, jSONObject2, "return_type", DivEvaluableType.FROM_STRING));
        }
    }
}
