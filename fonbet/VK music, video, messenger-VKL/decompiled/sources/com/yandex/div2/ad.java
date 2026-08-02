package com.yandex.div2;

import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
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
import com.yandex.div2.DivTooltip;
import com.yandex.div2.bd;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bpn0;
import xsna.eq;
import xsna.izs;
import xsna.jon;
import xsna.rl3;
import xsna.zpn;

/* compiled from: DivTooltipJsonParser.kt */
/* loaded from: classes8.dex */
public final class ad {

    @Deprecated
    public static final Expression<Boolean> a;

    @Deprecated
    public static final Expression<Long> b;

    @Deprecated
    public static final bd.a c;

    @Deprecated
    public static final TypeHelper<DivTooltip.Position> d;

    @Deprecated
    public static final eq e;

    /* compiled from: DivTooltipJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivTooltip.Position);
        }
    }

    /* compiled from: DivTooltipJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivTooltip divTooltip) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAnimation divAnimation = divTooltip.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "animation_in", divAnimation, feVar.q1);
            JsonPropertyParser.write(parsingContext, jSONObject, "animation_out", divTooltip.b, feVar.q1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "background_accessibility_description", divTooltip.c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "close_by_tap_outside", divTooltip.d);
            JsonPropertyParser.write(parsingContext, jSONObject, TtmlNode.TAG_DIV, divTooltip.e, feVar.z9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divTooltip.f);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divTooltip.g);
            JsonPropertyParser.write(parsingContext, jSONObject, X3.a.t, divTooltip.h, feVar.S8);
            JsonPropertyParser.write(parsingContext, jSONObject, SignalingProtocol.KEY_OFFSET, divTooltip.i, feVar.W5);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.i.L, divTooltip.j, DivTooltip.Position.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tap_outside_actions", divTooltip.k, feVar.k1);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            fe feVar = this.a;
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_in", feVar.q1);
            DivAnimation divAnimation2 = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_out", feVar.q1);
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = ad.a;
            Expression<Boolean> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "close_by_tap_outside", typeHelper, izsVar, expression);
            Expression<Boolean> expression2 = readOptionalExpression2 == null ? expression : readOptionalExpression2;
            com.yandex.div2.a aVar = (com.yandex.div2.a) JsonPropertyParser.read(parsingContext, jSONObject, TtmlNode.TAG_DIV, feVar.z9);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            eq eqVar = ad.e;
            Expression<Long> expression3 = ad.b;
            Expression<Long> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper2, izsVar2, eqVar, expression3);
            if (readOptionalExpression3 != null) {
                expression3 = readOptionalExpression3;
            }
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "id");
            bd bdVar = (bd) JsonPropertyParser.readOptional(parsingContext, jSONObject, X3.a.t, feVar.S8);
            if (bdVar == null) {
                bdVar = ad.c;
            }
            return new DivTooltip(divAnimation, divAnimation2, readOptionalExpression, expression2, aVar, expression3, str, bdVar, (jon) JsonPropertyParser.readOptional(parsingContext, jSONObject, SignalingProtocol.KEY_OFFSET, feVar.W5), JsonExpressionParser.readExpression(parsingContext, jSONObject, X3.i.L, ad.d, DivTooltip.Position.FROM_STRING), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tap_outside_actions", feVar.k1));
        }
    }

    /* compiled from: DivTooltipJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, gd gdVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<v0> field = gdVar.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "animation_in", field, feVar.r1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "animation_out", gdVar.b, feVar.r1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "background_accessibility_description", gdVar.c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "close_by_tap_outside", gdVar.d);
            JsonFieldParser.writeField(parsingContext, jSONObject, TtmlNode.TAG_DIV, gdVar.e, feVar.A9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", gdVar.f);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", gdVar.g);
            JsonFieldParser.writeField(parsingContext, jSONObject, X3.a.t, gdVar.h, feVar.T8);
            JsonFieldParser.writeField(parsingContext, jSONObject, SignalingProtocol.KEY_OFFSET, gdVar.i, feVar.X5);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.i.L, gdVar.j, DivTooltip.Position.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tap_outside_actions", gdVar.k, feVar.l1);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            gd gdVar = (gd) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<v0> field = gdVar != null ? gdVar.a : null;
            fe feVar = this.a;
            return new gd(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "animation_in", allowPropertyOverride, field, feVar.r1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "animation_out", allowPropertyOverride, gdVar != null ? gdVar.b : null, feVar.r1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, gdVar != null ? gdVar.c : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "close_by_tap_outside", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, gdVar != null ? gdVar.d : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, TtmlNode.TAG_DIV, allowPropertyOverride, gdVar != null ? gdVar.e : null, feVar.A9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "duration", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, gdVar != null ? gdVar.f : null, ParsingConvertersKt.NUMBER_TO_INT, ad.e), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, gdVar != null ? gdVar.g : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, X3.a.t, allowPropertyOverride, gdVar != null ? gdVar.h : null, feVar.T8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, SignalingProtocol.KEY_OFFSET, allowPropertyOverride, gdVar != null ? gdVar.i : null, feVar.X5), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, X3.i.L, ad.d, allowPropertyOverride, gdVar != null ? gdVar.j : null, DivTooltip.Position.FROM_STRING), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tap_outside_actions", allowPropertyOverride, gdVar != null ? gdVar.k : null, feVar.l1));
        }
    }

    /* compiled from: DivTooltipJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, gd, DivTooltip> {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final DivTooltip resolve(ParsingContext parsingContext, gd gdVar, JSONObject jSONObject) {
            gd gdVar2 = gdVar;
            JSONObject jSONObject2 = jSONObject;
            Field<v0> field = gdVar2.a;
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.s1;
            bpn0 bpn0Var2 = feVar.q1;
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject2, "animation_in", bpn0Var, bpn0Var2);
            DivAnimation divAnimation2 = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, gdVar2.b, jSONObject2, "animation_out", feVar.s1, bpn0Var2);
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, gdVar2.c, jSONObject2, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Boolean>> field2 = gdVar2.d;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = ad.a;
            Expression<Boolean> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "close_by_tap_outside", typeHelper, izsVar, expression);
            Expression<Boolean> expression2 = resolveOptionalExpression2 == null ? expression : resolveOptionalExpression2;
            com.yandex.div2.a aVar = (com.yandex.div2.a) JsonFieldResolver.resolve(parsingContext, gdVar2.e, jSONObject2, TtmlNode.TAG_DIV, feVar.B9, feVar.z9);
            Field<Expression<Long>> field3 = gdVar2.f;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            eq eqVar = ad.e;
            Expression<Long> expression3 = ad.b;
            Expression<Long> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject2, "duration", typeHelper2, izsVar2, eqVar, expression3);
            if (resolveOptionalExpression3 != null) {
                expression3 = resolveOptionalExpression3;
            }
            String str = (String) JsonFieldResolver.resolve(parsingContext, gdVar2.g, jSONObject2, "id");
            bd bdVar = (bd) JsonFieldResolver.resolveOptional(parsingContext, gdVar2.h, jSONObject2, X3.a.t, feVar.U8, feVar.S8);
            if (bdVar == null) {
                bdVar = ad.c;
            }
            return new DivTooltip(divAnimation, divAnimation2, resolveOptionalExpression, expression2, aVar, expression3, str, bdVar, (jon) JsonFieldResolver.resolveOptional(parsingContext, gdVar2.i, jSONObject2, SignalingProtocol.KEY_OFFSET, feVar.Y5, feVar.W5), JsonFieldResolver.resolveExpression(parsingContext, gdVar2.j, jSONObject2, X3.i.L, ad.d, DivTooltip.Position.FROM_STRING), JsonFieldResolver.resolveOptionalList(parsingContext, gdVar2.k, jSONObject2, "tap_outside_actions", feVar.m1, feVar.k1));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        b = Expression.Companion.constant$default(companion, 5000L, null, 2, null);
        c = new bd.a(new zpn());
        d = TypeHelper.Companion.from(rl3.L(DivTooltip.Position.values()), a.i);
        e = new eq(11);
    }
}
