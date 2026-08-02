package com.yandex.div2;

import com.huawei.hms.adapter.internal.CommonCode;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
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
import com.yandex.div2.td;
import com.yandex.div2.xd;
import org.json.JSONObject;
import xsna.izs;
import xsna.mq;

/* compiled from: DivVideoSourceJsonParser.kt */
/* loaded from: classes8.dex */
public final class wd {

    @Deprecated
    public static final mq a = new mq(16);

    @Deprecated
    public static final xsna.l4 b = new xsna.l4(16);

    /* compiled from: DivVideoSourceJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new td.a(JsonExpressionParser.readExpression(parsingContext, jSONObject, "height", typeHelper, izsVar, wd.a), JsonExpressionParser.readExpression(parsingContext, jSONObject, "width", typeHelper, izsVar, wd.b));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            td.a aVar = (td.a) obj;
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "height", aVar.a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", CommonCode.MapKey.HAS_RESOLUTION);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "width", aVar.b);
            return jSONObject;
        }
    }

    /* compiled from: DivVideoSourceJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            xd.a aVar = (xd.a) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = aVar != null ? aVar.a : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new xd.a(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "height", typeHelper, allowPropertyOverride, field, izsVar, wd.a), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "width", typeHelper, allowPropertyOverride, aVar != null ? aVar.b : null, izsVar, wd.b));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            xd.a aVar = (xd.a) obj;
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "height", aVar.a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", CommonCode.MapKey.HAS_RESOLUTION);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "width", aVar.b);
            return jSONObject;
        }
    }

    /* compiled from: DivVideoSourceJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, xd.a, td.a> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final td.a resolve(ParsingContext parsingContext, xd.a aVar, JSONObject jSONObject) {
            xd.a aVar2 = aVar;
            JSONObject jSONObject2 = jSONObject;
            Field<Expression<Long>> field = aVar2.a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new td.a(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject2, "height", typeHelper, izsVar, wd.a), JsonFieldResolver.resolveExpression(parsingContext, aVar2.b, jSONObject2, "width", typeHelper, izsVar, wd.b));
        }
    }
}
