package com.yandex.div2;

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
import xsna.pm0;

/* compiled from: DivChangeSetTransitionJsonParser.kt */
/* loaded from: classes8.dex */
public final class b2 {

    @Deprecated
    public static final pm0 a = new pm0(12);

    /* compiled from: DivChangeSetTransitionJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a2 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new a2(JsonPropertyParser.readList(parsingContext, jSONObject, "items", this.a.U1, b2.a));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, a2 a2Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", a2Var.a, this.a.U1);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* compiled from: DivChangeSetTransitionJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c2 deserialize(ParsingContext parsingContext, c2 c2Var, JSONObject jSONObject) throws ParsingException {
            return new c2(JsonFieldParser.readListField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "items", parsingContext.getAllowPropertyOverride(), c2Var != null ? c2Var.a : null, this.a.V1, b2.a));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, c2 c2Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", c2Var.a, this.a.V1);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* compiled from: DivChangeSetTransitionJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, c2, a2> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final a2 resolve(ParsingContext parsingContext, c2 c2Var, JSONObject jSONObject) {
            Field<List<h2>> field = c2Var.a;
            fe feVar = this.a;
            return new a2(JsonFieldResolver.resolveList(parsingContext, field, jSONObject, "items", feVar.W1, feVar.U1, b2.a));
        }
    }
}
