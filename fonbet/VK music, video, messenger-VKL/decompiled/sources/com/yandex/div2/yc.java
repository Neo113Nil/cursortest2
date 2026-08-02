package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
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
import java.util.List;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.cq;
import xsna.izs;
import xsna.wp;

/* compiled from: DivTimerJsonParser.kt */
/* loaded from: classes8.dex */
public final class yc {

    @Deprecated
    public static final Expression<Long> a = Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);

    @Deprecated
    public static final wp b = new wp(11);

    @Deprecated
    public static final cq c = new cq(12);

    /* compiled from: DivTimerJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, xc xcVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", xcVar.a);
            List<DivAction> list = xcVar.b;
            fe feVar = this.a;
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", list, feVar.k1);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", xcVar.c);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tick_actions", xcVar.d, feVar.k1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tick_interval", xcVar.e);
            JsonPropertyParser.write(parsingContext, jSONObject, "value_variable", xcVar.f);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            wp wpVar = yc.b;
            Expression<Long> expression = yc.a;
            Expression<Long> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, izsVar, wpVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            fe feVar = this.a;
            return new xc(expression, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", feVar.k1), (String) JsonPropertyParser.read(parsingContext, jSONObject, "id"), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tick_actions", feVar.k1), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tick_interval", typeHelper, izsVar, yc.c), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "value_variable"));
        }
    }

    /* compiled from: DivTimerJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, zc zcVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", zcVar.a);
            Field<List<h0>> field = zcVar.b;
            fe feVar = this.a;
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", field, feVar.l1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", zcVar.c);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tick_actions", zcVar.d, feVar.l1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tick_interval", zcVar.e);
            JsonFieldParser.writeField(parsingContext, jSONObject, "value_variable", zcVar.f);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            zc zcVar = (zc) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = zcVar != null ? zcVar.a : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, izsVar, yc.b);
            Field<List<h0>> field2 = zcVar != null ? zcVar.b : null;
            fe feVar = this.a;
            return new zc(readOptionalFieldWithExpression, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, field2, feVar.l1), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, zcVar != null ? zcVar.c : null), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tick_actions", allowPropertyOverride, zcVar != null ? zcVar.d : null, feVar.l1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "tick_interval", typeHelper, allowPropertyOverride, zcVar != null ? zcVar.e : null, izsVar, yc.c), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "value_variable", allowPropertyOverride, zcVar != null ? zcVar.f : null));
        }
    }

    /* compiled from: DivTimerJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, zc, xc> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final xc resolve(ParsingContext parsingContext, zc zcVar, JSONObject jSONObject) {
            zc zcVar2 = zcVar;
            JSONObject jSONObject2 = jSONObject;
            Field<Expression<Long>> field = zcVar2.a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            wp wpVar = yc.b;
            Expression<Long> expression = yc.a;
            Expression<Long> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject2, "duration", typeHelper, izsVar, wpVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field<List<h0>> field2 = zcVar2.b;
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.m1;
            bpn0 bpn0Var2 = feVar.k1;
            return new xc(expression, JsonFieldResolver.resolveOptionalList(parsingContext, field2, jSONObject2, "end_actions", bpn0Var, bpn0Var2), (String) JsonFieldResolver.resolve(parsingContext, zcVar2.c, jSONObject2, "id"), JsonFieldResolver.resolveOptionalList(parsingContext, zcVar2.d, jSONObject2, "tick_actions", feVar.m1, bpn0Var2), JsonFieldResolver.resolveOptionalExpression(parsingContext, zcVar2.e, jSONObject2, "tick_interval", typeHelper, izsVar, yc.c), (String) JsonFieldResolver.resolveOptional(parsingContext, zcVar2.f, jSONObject2, "value_variable"));
        }
    }
}
