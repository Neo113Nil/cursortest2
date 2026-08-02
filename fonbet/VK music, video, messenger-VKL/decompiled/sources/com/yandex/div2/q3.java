package com.yandex.div2;

import com.unity3d.ads.BuildConfig;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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

/* compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
/* loaded from: classes8.dex */
public final class q3 {

    @Deprecated
    public static final q4 a = new q4(Expression.Companion.constant$default(Expression.Companion, 15L, null, 2, null));

    /* compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p3 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            q4 q4Var = (q4) JsonPropertyParser.readOptional(parsingContext, jSONObject, "space_between_centers", this.a.w3);
            if (q4Var == null) {
                q4Var = q3.a;
            }
            return new p3(q4Var);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, p3 p3Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "space_between_centers", p3Var.a, this.a.w3);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", BuildConfig.FLAVOR);
            return jSONObject;
        }
    }

    /* compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, r3 r3Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "space_between_centers", r3Var.a, this.a.x3);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", BuildConfig.FLAVOR);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            r3 r3Var = (r3) entityTemplate;
            return new r3(JsonFieldParser.readOptionalField(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, "space_between_centers", parsingContext.getAllowPropertyOverride(), r3Var != null ? r3Var.a : null, this.a.x3));
        }
    }

    /* compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, r3, p3> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final p3 resolve(ParsingContext parsingContext, r3 r3Var, JSONObject jSONObject) {
            Field<s4> field = r3Var.a;
            fe feVar = this.a;
            q4 q4Var = (q4) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "space_between_centers", feVar.y3, feVar.w3);
            if (q4Var == null) {
                q4Var = q3.a;
            }
            return new p3(q4Var);
        }
    }
}
