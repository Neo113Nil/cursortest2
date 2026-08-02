package com.yandex.div2;

import com.mbridge.msdk.foundation.entity.CampaignEx;
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
import com.yandex.div2.DivTabs;
import com.yandex.div2.mb;
import org.json.JSONObject;
import xsna.bpn0;

/* compiled from: DivTabsJsonParser.kt */
/* loaded from: classes8.dex */
public final class kb {

    @Deprecated
    public static final q4 a;

    @Deprecated
    public static final q4 b;

    /* compiled from: DivTabsJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivTabs.b bVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            q4 q4Var = bVar.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", q4Var, feVar.w3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, bVar.b, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", bVar.c, feVar.w3);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            fe feVar = this.a;
            q4 q4Var = (q4) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", feVar.w3);
            if (q4Var == null) {
                q4Var = kb.a;
            }
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            q4 q4Var2 = (q4) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", feVar.w3);
            if (q4Var2 == null) {
                q4Var2 = kb.b;
            }
            return new DivTabs.b(q4Var, readExpression, q4Var2);
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, mb.b bVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<s4> field = bVar.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field, feVar.x3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, bVar.b, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", bVar.c, feVar.x3);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            mb.b bVar = (mb.b) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<s4> field = bVar != null ? bVar.a : null;
            fe feVar = this.a;
            return new mb.b(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, field, feVar.x3), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, bVar != null ? bVar.b : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, bVar != null ? bVar.c : null, feVar.x3));
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, mb.b, DivTabs.b> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final DivTabs.b resolve(ParsingContext parsingContext, mb.b bVar, JSONObject jSONObject) {
            mb.b bVar2 = bVar;
            JSONObject jSONObject2 = jSONObject;
            Field<s4> field = bVar2.a;
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.y3;
            bpn0 bpn0Var2 = feVar.w3;
            q4 q4Var = (q4) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject2, "height", bpn0Var, bpn0Var2);
            if (q4Var == null) {
                q4Var = kb.a;
            }
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, bVar2.b, jSONObject2, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            q4 q4Var2 = (q4) JsonFieldResolver.resolveOptional(parsingContext, bVar2.c, jSONObject2, "width", feVar.y3, bpn0Var2);
            if (q4Var2 == null) {
                q4Var2 = kb.b;
            }
            return new DivTabs.b(q4Var, resolveExpression, q4Var2);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = new q4(Expression.Companion.constant$default(companion, 12L, null, 2, null));
        b = new q4(Expression.Companion.constant$default(companion, 12L, null, 2, null));
    }
}
