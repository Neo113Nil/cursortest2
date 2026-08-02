package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.g8;
import com.yandex.div2.q8;
import java.util.List;
import org.json.JSONObject;
import xsna.jq;
import xsna.kq;
import xsna.pon;

/* compiled from: DivRadialGradientJsonParser.kt */
/* loaded from: classes8.dex */
public final class p8 {

    @Deprecated
    public static final g8.b a;

    @Deprecated
    public static final g8.b b;

    @Deprecated
    public static final q8.b c;

    @Deprecated
    public static final jq d;

    @Deprecated
    public static final kq e;

    /* compiled from: DivRadialGradientJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f8 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            fe feVar = this.a;
            g8 g8Var = (g8) JsonPropertyParser.readOptional(parsingContext, jSONObject, "center_x", feVar.Z5);
            if (g8Var == null) {
                g8Var = p8.a;
            }
            g8 g8Var2 = (g8) JsonPropertyParser.readOptional(parsingContext, jSONObject, "center_y", feVar.Z5);
            if (g8Var2 == null) {
                g8Var2 = p8.b;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "color_map", feVar.r6, p8.e);
            ExpressionList readOptionalExpressionList = JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, p8.d);
            q8 q8Var = (q8) JsonPropertyParser.readOptional(parsingContext, jSONObject, "radius", feVar.f6);
            if (q8Var == null) {
                q8Var = p8.c;
            }
            return new f8(g8Var, g8Var2, readOptionalList, readOptionalExpressionList, q8Var);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, f8 f8Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            g8 g8Var = f8Var.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "center_x", g8Var, feVar.Z5);
            JsonPropertyParser.write(parsingContext, jSONObject, "center_y", f8Var.b, feVar.Z5);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "color_map", f8Var.c, feVar.r6);
            JsonExpressionParser.writeExpressionList(parsingContext, jSONObject, "colors", f8Var.d, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "radius", f8Var.e, feVar.f6);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "radial_gradient");
            return jSONObject;
        }
    }

    /* compiled from: DivRadialGradientJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8 deserialize(ParsingContext parsingContext, x8 x8Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<k8> field = x8Var != null ? x8Var.a : null;
            fe feVar = this.a;
            return new x8(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "center_x", allowPropertyOverride, field, feVar.a6), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "center_y", allowPropertyOverride, x8Var != null ? x8Var.b : null, feVar.a6), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "color_map", allowPropertyOverride, x8Var != null ? x8Var.c : null, feVar.s6, p8.e), JsonFieldParser.readOptionalExpressionListField(restrictPropertyOverride, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, x8Var != null ? x8Var.d : null, ParsingConvertersKt.STRING_TO_COLOR_INT, p8.d), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "radius", allowPropertyOverride, x8Var != null ? x8Var.e : null, feVar.g6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, x8 x8Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<k8> field = x8Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "center_x", field, feVar.a6);
            JsonFieldParser.writeField(parsingContext, jSONObject, "center_y", x8Var.b, feVar.a6);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "color_map", x8Var.c, feVar.s6);
            JsonFieldParser.writeExpressionListField(parsingContext, jSONObject, "colors", x8Var.d, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "radius", x8Var.e, feVar.g6);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "radial_gradient");
            return jSONObject;
        }
    }

    /* compiled from: DivRadialGradientJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, x8, f8> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f8 resolve(ParsingContext parsingContext, x8 x8Var, JSONObject jSONObject) throws ParsingException {
            Field<k8> field = x8Var.a;
            fe feVar = this.a;
            g8 g8Var = (g8) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "center_x", feVar.b6, feVar.Z5);
            if (g8Var == null) {
                g8Var = p8.a;
            }
            g8 g8Var2 = (g8) JsonFieldResolver.resolveOptional(parsingContext, x8Var.b, jSONObject, "center_y", feVar.b6, feVar.Z5);
            if (g8Var2 == null) {
                g8Var2 = p8.b;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, x8Var.c, jSONObject, "color_map", feVar.t6, feVar.r6, p8.e);
            ExpressionList resolveOptionalExpressionList = JsonFieldResolver.resolveOptionalExpressionList(parsingContext, x8Var.d, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, p8.d);
            q8 q8Var = (q8) JsonFieldResolver.resolveOptional(parsingContext, x8Var.e, jSONObject, "radius", feVar.h6, feVar.f6);
            if (q8Var == null) {
                q8Var = p8.c;
            }
            return new f8(g8Var, g8Var2, resolveOptionalList, resolveOptionalExpressionList, q8Var);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double valueOf = Double.valueOf(0.5d);
        a = new g8.b(new pon(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        b = new g8.b(new pon(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        c = new q8.b(new DivRadialGradientRelativeRadius(Expression.Companion.constant$default(companion, DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER, null, 2, null)));
        d = new jq(14);
        e = new kq(13);
    }
}
