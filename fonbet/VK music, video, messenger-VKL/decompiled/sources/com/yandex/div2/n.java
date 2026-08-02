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
import com.yandex.div2.DivActionScrollBy;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.izs;

/* compiled from: DivActionScrollByJsonParser.kt */
/* loaded from: classes8.dex */
public final class n {

    @Deprecated
    public static final Expression<Boolean> a;

    @Deprecated
    public static final Expression<Long> b;

    @Deprecated
    public static final Expression<Long> c;

    @Deprecated
    public static final Expression<DivActionScrollBy.Overflow> d;

    @Deprecated
    public static final TypeHelper<DivActionScrollBy.Overflow> e;

    /* compiled from: DivActionScrollByJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivActionScrollBy.Overflow);
        }
    }

    /* compiled from: DivActionScrollByJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public static DivActionScrollBy a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = n.a;
            Expression<Boolean> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animated", typeHelper, izsVar, expression);
            Expression<Boolean> expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression<Long> expression3 = n.b;
            Expression<Long> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_count", typeHelper2, izsVar2, expression3);
            Expression<Long> expression4 = readOptionalExpression2 == null ? expression3 : readOptionalExpression2;
            Expression<Long> expression5 = n.c;
            Expression<Long> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, SignalingProtocol.KEY_OFFSET, typeHelper2, izsVar2, expression5);
            Expression<Long> expression6 = readOptionalExpression3 == null ? expression5 : readOptionalExpression3;
            TypeHelper<DivActionScrollBy.Overflow> typeHelper3 = n.e;
            izs<String, DivActionScrollBy.Overflow> izsVar3 = DivActionScrollBy.Overflow.FROM_STRING;
            Expression<DivActionScrollBy.Overflow> expression7 = n.d;
            Expression<DivActionScrollBy.Overflow> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "overflow", typeHelper3, izsVar3, expression7);
            return new DivActionScrollBy(expression2, readExpression, expression4, expression6, readOptionalExpression4 == null ? expression7 : readOptionalExpression4);
        }

        public static JSONObject b(ParsingContext parsingContext, DivActionScrollBy divActionScrollBy) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animated", divActionScrollBy.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", divActionScrollBy.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "item_count", divActionScrollBy.c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, SignalingProtocol.KEY_OFFSET, divActionScrollBy.d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "overflow", divActionScrollBy.e, DivActionScrollBy.Overflow.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_by");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (DivActionScrollBy) obj);
        }
    }

    /* compiled from: DivActionScrollByJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public static o a(ParsingContext parsingContext, o oVar, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "animated", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, oVar != null ? oVar.a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, oVar != null ? oVar.b : null);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = oVar != null ? oVar.c : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new o(readOptionalFieldWithExpression, readFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "item_count", typeHelper, allowPropertyOverride, field, izsVar), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, SignalingProtocol.KEY_OFFSET, typeHelper, allowPropertyOverride, oVar != null ? oVar.d : null, izsVar), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "overflow", n.e, allowPropertyOverride, oVar != null ? oVar.e : null, DivActionScrollBy.Overflow.FROM_STRING));
        }

        public static JSONObject b(ParsingContext parsingContext, o oVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animated", oVar.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", oVar.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "item_count", oVar.c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, SignalingProtocol.KEY_OFFSET, oVar.d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "overflow", oVar.e, DivActionScrollBy.Overflow.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_by");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (o) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (o) obj);
        }
    }

    /* compiled from: DivActionScrollByJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, o, DivActionScrollBy> {
        public static DivActionScrollBy a(ParsingContext parsingContext, o oVar, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Boolean>> field = oVar.a;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = n.a;
            Expression<Boolean> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "animated", typeHelper, izsVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, oVar.b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Long>> field2 = oVar.c;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression<Long> expression2 = n.b;
            Expression<Long> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "item_count", typeHelper2, izsVar2, expression2);
            if (resolveOptionalExpression2 == null) {
                resolveOptionalExpression2 = expression2;
            }
            Field<Expression<Long>> field3 = oVar.d;
            Expression<Long> expression3 = n.c;
            Expression<Long> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, SignalingProtocol.KEY_OFFSET, typeHelper2, izsVar2, expression3);
            if (resolveOptionalExpression3 == null) {
                resolveOptionalExpression3 = expression3;
            }
            Field<Expression<DivActionScrollBy.Overflow>> field4 = oVar.e;
            TypeHelper<DivActionScrollBy.Overflow> typeHelper3 = n.e;
            izs<String, DivActionScrollBy.Overflow> izsVar3 = DivActionScrollBy.Overflow.FROM_STRING;
            Expression<DivActionScrollBy.Overflow> expression4 = n.d;
            Expression<DivActionScrollBy.Overflow> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "overflow", typeHelper3, izsVar3, expression4);
            return new DivActionScrollBy(expression, resolveExpression, resolveOptionalExpression2, resolveOptionalExpression3, resolveOptionalExpression4 == null ? expression4 : resolveOptionalExpression4);
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final /* bridge */ /* synthetic */ DivActionScrollBy resolve(ParsingContext parsingContext, o oVar, JSONObject jSONObject) {
            return a(parsingContext, oVar, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        b = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivActionScrollBy.Overflow overflow = DivActionScrollBy.Overflow.CLAMP;
        d = Expression.Companion.constant$default(companion, overflow, null, 2, null);
        e = TypeHelper.Companion.from(overflow, a.i);
    }
}
