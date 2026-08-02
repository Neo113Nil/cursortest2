package com.yandex.div2;

import com.huawei.hms.framework.common.BundleUtil;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.m4;
import com.yandex.div2.p4;
import org.json.JSONObject;
import xsna.zq;

/* compiled from: DivFixedLengthInputMaskJsonParser.kt */
/* loaded from: classes8.dex */
public final class o4 {

    @Deprecated
    public static final Expression<String> a = Expression.Companion.constant$default(Expression.Companion, BundleUtil.UNDERLINE_TAG, null, 2, null);

    @Deprecated
    public static final zq b = new zq(13);

    @Deprecated
    public static final com.vk.movika.sdk.android.defaultplayer.interactive.c c = new com.vk.movika.sdk.android.defaultplayer.interactive.c(12);

    /* compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "key", typeHelper, o4.b);
            com.vk.movika.sdk.android.defaultplayer.interactive.c cVar = o4.c;
            Expression<String> expression = o4.a;
            Expression<String> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "placeholder", typeHelper, cVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new m4.a(readExpression, expression, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "regex", typeHelper));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            m4.a aVar = (m4.a) obj;
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "key", aVar.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "placeholder", aVar.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "regex", aVar.c);
            return jSONObject;
        }
    }

    /* compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            p4.a aVar = (p4.a) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new p4.a(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "key", typeHelper, allowPropertyOverride, aVar != null ? aVar.a : null, o4.b), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "placeholder", typeHelper, allowPropertyOverride, aVar != null ? aVar.b : null, o4.c), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "regex", typeHelper, allowPropertyOverride, aVar != null ? aVar.c : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            p4.a aVar = (p4.a) obj;
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "key", aVar.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "placeholder", aVar.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "regex", aVar.c);
            return jSONObject;
        }
    }

    /* compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, p4.a, m4.a> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final m4.a resolve(ParsingContext parsingContext, p4.a aVar, JSONObject jSONObject) {
            p4.a aVar2 = aVar;
            JSONObject jSONObject2 = jSONObject;
            Field<Expression<String>> field = aVar2.a;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject2, "key", typeHelper, o4.b);
            Field<Expression<String>> field2 = aVar2.b;
            com.vk.movika.sdk.android.defaultplayer.interactive.c cVar = o4.c;
            Expression<String> expression = o4.a;
            Expression<String> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "placeholder", typeHelper, cVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new m4.a(resolveExpression, expression, JsonFieldResolver.resolveOptionalExpression(parsingContext, aVar2.c, jSONObject2, "regex", typeHelper));
        }
    }
}
