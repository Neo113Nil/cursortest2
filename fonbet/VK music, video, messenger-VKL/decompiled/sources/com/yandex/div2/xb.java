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
import com.yandex.div2.DivText;
import com.yandex.div2.wc;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.izs;
import xsna.to;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes8.dex */
public final class xb {

    @Deprecated
    public static final Expression<DivTextAlignmentVertical> a;

    @Deprecated
    public static final q4 b;

    @Deprecated
    public static final Expression<DivText.Image.IndexingDirection> c;

    @Deprecated
    public static final Expression<Boolean> d;

    @Deprecated
    public static final Expression<DivBlendMode> e;

    @Deprecated
    public static final q4 f;

    @Deprecated
    public static final TypeHelper<DivTextAlignmentVertical> g;

    @Deprecated
    public static final TypeHelper<DivText.Image.IndexingDirection> h;

    @Deprecated
    public static final TypeHelper<DivBlendMode> i;

    @Deprecated
    public static final to j;

    /* compiled from: DivTextJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivTextAlignmentVertical);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivText.Image.IndexingDirection);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivBlendMode);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class d implements Serializer, Deserializer {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivText.Image image) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivText.Image.Accessibility accessibility = image.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", accessibility, feVar.D8);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", image.b, DivTextAlignmentVertical.TO_STRING);
            q4 q4Var = image.c;
            bpn0 bpn0Var = feVar.w3;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", q4Var, bpn0Var);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "indexing_direction", image.d, DivText.Image.IndexingDirection.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", image.e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", image.f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tint_color", image.g, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tint_mode", image.h, DivBlendMode.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", image.i, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", image.j, bpn0Var);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.D8;
            bpn0 bpn0Var2 = feVar.w3;
            DivText.Image.Accessibility accessibility = (DivText.Image.Accessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", bpn0Var);
            TypeHelper<DivTextAlignmentVertical> typeHelper = xb.g;
            izs<String, DivTextAlignmentVertical> izsVar = DivTextAlignmentVertical.FROM_STRING;
            Expression<DivTextAlignmentVertical> expression = xb.a;
            Expression<DivTextAlignmentVertical> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper, izsVar, expression);
            if (readOptionalExpression == null) {
                readOptionalExpression = expression;
            }
            q4 q4Var = (q4) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var2);
            if (q4Var == null) {
                q4Var = xb.b;
            }
            q4 q4Var2 = q4Var;
            TypeHelper<DivText.Image.IndexingDirection> typeHelper2 = xb.h;
            izs<String, DivText.Image.IndexingDirection> izsVar2 = DivText.Image.IndexingDirection.FROM_STRING;
            Expression<DivText.Image.IndexingDirection> expression2 = xb.c;
            Expression<DivText.Image.IndexingDirection> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "indexing_direction", typeHelper2, izsVar2, expression2);
            Expression<DivText.Image.IndexingDirection> expression3 = readOptionalExpression2 == null ? expression2 : readOptionalExpression2;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression4 = xb.d;
            Expression<Boolean> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper3, izsVar3, expression4);
            Expression<Boolean> expression5 = readOptionalExpression3 == null ? expression4 : readOptionalExpression3;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "start", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, xb.j);
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            TypeHelper<DivBlendMode> typeHelper4 = xb.i;
            izs<String, DivBlendMode> izsVar4 = DivBlendMode.FROM_STRING;
            Expression<DivBlendMode> expression6 = xb.e;
            Expression<DivBlendMode> readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tint_mode", typeHelper4, izsVar4, expression6);
            if (readOptionalExpression5 != null) {
                expression6 = readOptionalExpression5;
            }
            Expression readExpression2 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            q4 q4Var3 = (q4) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var2);
            if (q4Var3 == null) {
                q4Var3 = xb.f;
            }
            return new DivText.Image(accessibility, readOptionalExpression, q4Var2, expression3, expression5, readExpression, readOptionalExpression4, expression6, readExpression2, q4Var3);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class e implements Serializer, TemplateDeserializer {
        public final fe a;

        public e(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, wc.b bVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<wc.b.a> field = bVar.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.E8);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", bVar.b, DivTextAlignmentVertical.TO_STRING);
            Field<s4> field2 = bVar.c;
            bpn0 bpn0Var = feVar.x3;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field2, bpn0Var);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "indexing_direction", bVar.d, DivText.Image.IndexingDirection.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", bVar.e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", bVar.f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tint_color", bVar.g, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tint_mode", bVar.h, DivBlendMode.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", bVar.i, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", bVar.j, bpn0Var);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            wc.b bVar = (wc.b) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<wc.b.a> field = bVar != null ? bVar.a : null;
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.E8;
            bpn0 bpn0Var2 = feVar.x3;
            return new wc.b(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, bpn0Var), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", xb.g, allowPropertyOverride, bVar != null ? bVar.b : null, DivTextAlignmentVertical.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, bVar != null ? bVar.c : null, bpn0Var2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "indexing_direction", xb.h, allowPropertyOverride, bVar != null ? bVar.d : null, DivText.Image.IndexingDirection.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "preload_required", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, bVar != null ? bVar.e : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "start", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, bVar != null ? bVar.f : null, ParsingConvertersKt.NUMBER_TO_INT, xb.j), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, bVar != null ? bVar.g : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "tint_mode", xb.i, allowPropertyOverride, bVar != null ? bVar.h : null, DivBlendMode.FROM_STRING), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, bVar != null ? bVar.i : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, bVar != null ? bVar.j : null, bpn0Var2));
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class f implements TemplateResolver<JSONObject, wc.b, DivText.Image> {
        public final fe a;

        public f(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final DivText.Image resolve(ParsingContext parsingContext, wc.b bVar, JSONObject jSONObject) {
            wc.b bVar2 = bVar;
            JSONObject jSONObject2 = jSONObject;
            Field<wc.b.a> field = bVar2.a;
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.F8;
            bpn0 bpn0Var2 = feVar.w3;
            bpn0 bpn0Var3 = feVar.y3;
            DivText.Image.Accessibility accessibility = (DivText.Image.Accessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject2, "accessibility", bpn0Var, feVar.D8);
            Field<Expression<DivTextAlignmentVertical>> field2 = bVar2.b;
            TypeHelper<DivTextAlignmentVertical> typeHelper = xb.g;
            izs<String, DivTextAlignmentVertical> izsVar = DivTextAlignmentVertical.FROM_STRING;
            Expression<DivTextAlignmentVertical> expression = xb.a;
            Expression<DivTextAlignmentVertical> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "alignment_vertical", typeHelper, izsVar, expression);
            Expression<DivTextAlignmentVertical> expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            q4 q4Var = (q4) JsonFieldResolver.resolveOptional(parsingContext, bVar2.c, jSONObject2, "height", bpn0Var3, bpn0Var2);
            if (q4Var == null) {
                q4Var = xb.b;
            }
            q4 q4Var2 = q4Var;
            Field<Expression<DivText.Image.IndexingDirection>> field3 = bVar2.d;
            TypeHelper<DivText.Image.IndexingDirection> typeHelper2 = xb.h;
            izs<String, DivText.Image.IndexingDirection> izsVar2 = DivText.Image.IndexingDirection.FROM_STRING;
            Expression<DivText.Image.IndexingDirection> expression3 = xb.c;
            Expression<DivText.Image.IndexingDirection> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject2, "indexing_direction", typeHelper2, izsVar2, expression3);
            Expression<DivText.Image.IndexingDirection> expression4 = resolveOptionalExpression2 == null ? expression3 : resolveOptionalExpression2;
            Field<Expression<Boolean>> field4 = bVar2.e;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression5 = xb.d;
            Expression<Boolean> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject2, "preload_required", typeHelper3, izsVar3, expression5);
            Expression<Boolean> expression6 = resolveOptionalExpression3 == null ? expression5 : resolveOptionalExpression3;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, bVar2.f, jSONObject2, "start", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, xb.j);
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, bVar2.g, jSONObject2, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field<Expression<DivBlendMode>> field5 = bVar2.h;
            TypeHelper<DivBlendMode> typeHelper4 = xb.i;
            izs<String, DivBlendMode> izsVar4 = DivBlendMode.FROM_STRING;
            Expression<DivBlendMode> expression7 = xb.e;
            Expression<DivBlendMode> resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject2, "tint_mode", typeHelper4, izsVar4, expression7);
            if (resolveOptionalExpression5 != null) {
                expression7 = resolveOptionalExpression5;
            }
            Expression resolveExpression2 = JsonFieldResolver.resolveExpression(parsingContext, bVar2.i, jSONObject2, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            q4 q4Var3 = (q4) JsonFieldResolver.resolveOptional(parsingContext, bVar2.j, jSONObject2, "width", bpn0Var3, bpn0Var2);
            if (q4Var3 == null) {
                q4Var3 = xb.f;
            }
            return new DivText.Image(accessibility, expression2, q4Var2, expression4, expression6, resolveExpression, resolveOptionalExpression4, expression7, resolveExpression2, q4Var3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivTextAlignmentVertical divTextAlignmentVertical = DivTextAlignmentVertical.CENTER;
        a = Expression.Companion.constant$default(companion, divTextAlignmentVertical, null, 2, null);
        b = new q4(Expression.Companion.constant$default(companion, 20L, null, 2, null));
        DivText.Image.IndexingDirection indexingDirection = DivText.Image.IndexingDirection.NORMAL;
        c = Expression.Companion.constant$default(companion, indexingDirection, null, 2, null);
        d = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
        e = Expression.Companion.constant$default(companion, divBlendMode, null, 2, null);
        f = new q4(Expression.Companion.constant$default(companion, 20L, null, 2, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        g = companion2.from(divTextAlignmentVertical, a.i);
        h = companion2.from(indexingDirection, b.i);
        i = companion2.from(divBlendMode, c.i);
        j = new to(12);
    }
}
