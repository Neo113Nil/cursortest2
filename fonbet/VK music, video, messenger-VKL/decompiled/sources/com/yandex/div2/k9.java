package com.yandex.div2;

import com.ironsource.X3;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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
import com.yandex.div2.DivSeparator;
import com.yandex.div2.m9;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.izs;

/* compiled from: DivSeparatorJsonParser.kt */
/* loaded from: classes8.dex */
public final class k9 {

    @Deprecated
    public static final Expression<Integer> a;

    @Deprecated
    public static final Expression<DivSeparator.DelimiterStyle.Orientation> b;

    @Deprecated
    public static final TypeHelper<DivSeparator.DelimiterStyle.Orientation> c;

    /* compiled from: DivSeparatorJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSeparator.DelimiterStyle.Orientation);
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = k9.a;
            Expression<Integer> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "color", typeHelper, izsVar, expression);
            if (readOptionalExpression == null) {
                readOptionalExpression = expression;
            }
            TypeHelper<DivSeparator.DelimiterStyle.Orientation> typeHelper2 = k9.c;
            izs<String, DivSeparator.DelimiterStyle.Orientation> izsVar2 = DivSeparator.DelimiterStyle.Orientation.FROM_STRING;
            Expression<DivSeparator.DelimiterStyle.Orientation> expression2 = k9.b;
            Expression<DivSeparator.DelimiterStyle.Orientation> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.i.n, typeHelper2, izsVar2, expression2);
            if (readOptionalExpression2 != null) {
                expression2 = readOptionalExpression2;
            }
            return new DivSeparator.DelimiterStyle(readOptionalExpression, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            DivSeparator.DelimiterStyle delimiterStyle = (DivSeparator.DelimiterStyle) obj;
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", delimiterStyle.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.i.n, delimiterStyle.b, DivSeparator.DelimiterStyle.Orientation.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            m9.a aVar = (m9.a) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new m9.a(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, aVar != null ? aVar.a : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.i.n, k9.c, allowPropertyOverride, aVar != null ? aVar.b : null, DivSeparator.DelimiterStyle.Orientation.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final Object serialize(ParsingContext parsingContext, Object obj) {
            m9.a aVar = (m9.a) obj;
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", aVar.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.i.n, aVar.b, DivSeparator.DelimiterStyle.Orientation.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, m9.a, DivSeparator.DelimiterStyle> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final DivSeparator.DelimiterStyle resolve(ParsingContext parsingContext, m9.a aVar, JSONObject jSONObject) {
            m9.a aVar2 = aVar;
            JSONObject jSONObject2 = jSONObject;
            Field<Expression<Integer>> field = aVar2.a;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = k9.a;
            Expression<Integer> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject2, "color", typeHelper, izsVar, expression);
            if (resolveOptionalExpression == null) {
                resolveOptionalExpression = expression;
            }
            Field<Expression<DivSeparator.DelimiterStyle.Orientation>> field2 = aVar2.b;
            TypeHelper<DivSeparator.DelimiterStyle.Orientation> typeHelper2 = k9.c;
            izs<String, DivSeparator.DelimiterStyle.Orientation> izsVar2 = DivSeparator.DelimiterStyle.Orientation.FROM_STRING;
            Expression<DivSeparator.DelimiterStyle.Orientation> expression2 = k9.b;
            Expression<DivSeparator.DelimiterStyle.Orientation> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, X3.i.n, typeHelper2, izsVar2, expression2);
            if (resolveOptionalExpression2 != null) {
                expression2 = resolveOptionalExpression2;
            }
            return new DivSeparator.DelimiterStyle(resolveOptionalExpression, expression2);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        DivSeparator.DelimiterStyle.Orientation orientation = DivSeparator.DelimiterStyle.Orientation.HORIZONTAL;
        b = Expression.Companion.constant$default(companion, orientation, null, 2, null);
        c = TypeHelper.Companion.from(orientation, a.i);
    }
}
