package com.yandex.div2;

import com.ironsource.X3;
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
import com.yandex.div2.DivAccessibility;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.izs;

/* compiled from: DivAccessibilityJsonParser.kt */
/* loaded from: classes8.dex */
public final class e {

    @Deprecated
    public static final Expression<DivAccessibility.Mode> a;

    @Deprecated
    public static final Expression<Boolean> b;

    @Deprecated
    public static final DivAccessibility.Type c;

    @Deprecated
    public static final TypeHelper<DivAccessibility.Mode> d;

    /* compiled from: DivAccessibilityJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAccessibility.Mode);
        }
    }

    /* compiled from: DivAccessibilityJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public static JSONObject a(ParsingContext parsingContext, DivAccessibility divAccessibility) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "description", divAccessibility.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint", divAccessibility.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_checked", divAccessibility.c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.a.t, divAccessibility.d, DivAccessibility.Mode.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "mute_after_action", divAccessibility.e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "state_description", divAccessibility.f);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", divAccessibility.g, (izs<DivAccessibility.Type, R>) DivAccessibility.Type.TO_STRING);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "description", typeHelper);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint", typeHelper);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_checked", typeHelper2, izsVar);
            TypeHelper<DivAccessibility.Mode> typeHelper3 = e.d;
            izs<String, DivAccessibility.Mode> izsVar2 = DivAccessibility.Mode.FROM_STRING;
            Expression<DivAccessibility.Mode> expression = e.a;
            Expression<DivAccessibility.Mode> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.a.t, typeHelper3, izsVar2, expression);
            if (readOptionalExpression4 == null) {
                readOptionalExpression4 = expression;
            }
            Expression<Boolean> expression2 = e.b;
            Expression<Boolean> readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "mute_after_action", typeHelper2, izsVar, expression2);
            if (readOptionalExpression5 != null) {
                expression2 = readOptionalExpression5;
            }
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "state_description", typeHelper);
            DivAccessibility.Type type = (DivAccessibility.Type) JsonPropertyParser.readOptional(parsingContext, jSONObject, "type", DivAccessibility.Type.FROM_STRING);
            if (type == null) {
                type = e.c;
            }
            return new DivAccessibility(readOptionalExpression, readOptionalExpression2, readOptionalExpression3, readOptionalExpression4, expression2, readOptionalExpression6, type);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (DivAccessibility) obj);
        }
    }

    /* compiled from: DivAccessibilityJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public static JSONObject a(ParsingContext parsingContext, f fVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "description", fVar.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint", fVar.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_checked", fVar.c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.a.t, fVar.d, DivAccessibility.Mode.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "mute_after_action", fVar.e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "state_description", fVar.f);
            JsonFieldParser.writeField(parsingContext, jSONObject, "type", fVar.g, DivAccessibility.Type.TO_STRING);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            f fVar = (f) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "description", typeHelper, allowPropertyOverride, fVar != null ? fVar.a : null);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "hint", typeHelper, allowPropertyOverride, fVar != null ? fVar.b : null);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field = fVar != null ? fVar.c : null;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new f(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "is_checked", typeHelper2, allowPropertyOverride, field, izsVar), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.a.t, e.d, allowPropertyOverride, fVar != null ? fVar.d : null, DivAccessibility.Mode.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "mute_after_action", typeHelper2, allowPropertyOverride, fVar != null ? fVar.e : null, izsVar), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "state_description", typeHelper, allowPropertyOverride, fVar != null ? fVar.f : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "type", allowPropertyOverride, fVar != null ? fVar.g : null, DivAccessibility.Type.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (f) obj);
        }
    }

    /* compiled from: DivAccessibilityJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, f, DivAccessibility> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final DivAccessibility resolve(ParsingContext parsingContext, f fVar, JSONObject jSONObject) {
            f fVar2 = fVar;
            JSONObject jSONObject2 = jSONObject;
            Field<Expression<String>> field = fVar2.a;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject2, "description", typeHelper);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, fVar2.b, jSONObject2, "hint", typeHelper);
            Field<Expression<Boolean>> field2 = fVar2.c;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "is_checked", typeHelper2, izsVar);
            Field<Expression<DivAccessibility.Mode>> field3 = fVar2.d;
            TypeHelper<DivAccessibility.Mode> typeHelper3 = e.d;
            izs<String, DivAccessibility.Mode> izsVar2 = DivAccessibility.Mode.FROM_STRING;
            Expression<DivAccessibility.Mode> expression = e.a;
            Expression<DivAccessibility.Mode> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject2, X3.a.t, typeHelper3, izsVar2, expression);
            Expression<DivAccessibility.Mode> expression2 = resolveOptionalExpression4 == null ? expression : resolveOptionalExpression4;
            Field<Expression<Boolean>> field4 = fVar2.e;
            Expression<Boolean> expression3 = e.b;
            Expression<Boolean> resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject2, "mute_after_action", typeHelper2, izsVar, expression3);
            Expression<Boolean> expression4 = resolveOptionalExpression5 == null ? expression3 : resolveOptionalExpression5;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, fVar2.f, jSONObject2, "state_description", typeHelper);
            DivAccessibility.Type type = (DivAccessibility.Type) JsonFieldResolver.resolveOptional(parsingContext, fVar2.g, jSONObject2, "type", DivAccessibility.Type.FROM_STRING);
            if (type == null) {
                type = e.c;
            }
            return new DivAccessibility(resolveOptionalExpression, resolveOptionalExpression2, resolveOptionalExpression3, expression2, expression4, resolveOptionalExpression6, type);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivAccessibility.Mode mode = DivAccessibility.Mode.DEFAULT;
        a = Expression.Companion.constant$default(companion, mode, null, 2, null);
        b = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        c = DivAccessibility.Type.AUTO;
        d = TypeHelper.Companion.from(mode, a.i);
    }
}
