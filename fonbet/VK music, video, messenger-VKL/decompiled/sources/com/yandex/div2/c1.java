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
import xsna.bt;

/* compiled from: DivAppearanceSetTransitionJsonParser.kt */
/* loaded from: classes8.dex */
public final class c1 {

    @Deprecated
    public static final bt a = new bt(9);

    /* compiled from: DivAppearanceSetTransitionJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b1 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new b1(JsonPropertyParser.readList(parsingContext, jSONObject, "items", this.a.z1, c1.a));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, b1 b1Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", b1Var.a, this.a.z1);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* compiled from: DivAppearanceSetTransitionJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d1 deserialize(ParsingContext parsingContext, d1 d1Var, JSONObject jSONObject) throws ParsingException {
            return new d1(JsonFieldParser.readListField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "items", parsingContext.getAllowPropertyOverride(), d1Var != null ? d1Var.a : null, this.a.A1, c1.a));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, d1 d1Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", d1Var.a, this.a.A1);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* compiled from: DivAppearanceSetTransitionJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, d1, b1> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final b1 resolve(ParsingContext parsingContext, d1 d1Var, JSONObject jSONObject) {
            Field<List<i1>> field = d1Var.a;
            fe feVar = this.a;
            return new b1(JsonFieldResolver.resolveList(parsingContext, field, jSONObject, "items", feVar.B1, feVar.z1, c1.a));
        }
    }
}
