package com.yandex.div2;

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
import com.yandex.div2.fa;
import com.yandex.div2.ka;
import com.yandex.div2.v9;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.bpn0;
import xsna.dr;
import xsna.er;
import xsna.izs;
import xsna.jln;
import xsna.krn;
import xsna.rl3;
import xsna.ukn;
import xsna.vmn;
import xsna.ykn;

/* compiled from: DivSliderJsonParser.kt */
/* loaded from: classes8.dex */
public final class ga {

    @Deprecated
    public static final Expression<Double> a;

    @Deprecated
    public static final v9.c b;

    @Deprecated
    public static final Expression<Boolean> c;

    @Deprecated
    public static final Expression<Long> d;

    @Deprecated
    public static final Expression<Long> e;

    @Deprecated
    public static final Expression<DivVisibility> f;

    @Deprecated
    public static final v9.b g;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> h;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> i;

    @Deprecated
    public static final TypeHelper<DivVisibility> j;

    @Deprecated
    public static final io.reactivex.rxjava3.internal.operators.observable.n0 k;

    @Deprecated
    public static final dr l;

    @Deprecated
    public static final com.vk.movika.sdk.android.defaultplayer.view.a m;

    @Deprecated
    public static final er n;

    /* compiled from: DivSliderJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class d implements Serializer, Deserializer {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fa deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.H;
            bpn0 bpn0Var2 = feVar.t9;
            bpn0 bpn0Var3 = feVar.z1;
            bpn0 bpn0Var4 = feVar.h7;
            bpn0 bpn0Var5 = feVar.Y2;
            bpn0 bpn0Var6 = feVar.Y6;
            bpn0 bpn0Var7 = feVar.V2;
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", bpn0Var);
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", ga.h, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", ga.i, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            io.reactivex.rxjava3.internal.operators.observable.n0 n0Var = ga.k;
            Expression<Double> expression = ga.a;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, izsVar, n0Var, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", feVar.t1);
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
            u1 u1Var = (u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, izsVar2, ga.l);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", feVar.P2);
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", feVar.b3);
            jln jlnVar = (jln) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", feVar.z3);
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", feVar.I3);
            v9 v9Var = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var6);
            if (v9Var == null) {
                v9Var = ga.b;
            }
            v9 v9Var2 = v9Var;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = ga.c;
            Expression<Boolean> readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper3, izsVar3, expression2);
            Expression<Boolean> expression3 = readOptionalExpression5 == null ? expression2 : readOptionalExpression5;
            vmn vmnVar = (vmn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", feVar.M4);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", bpn0Var5);
            Expression<Long> expression4 = ga.d;
            Expression<Long> readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, StatCustomFieldKey.MAX_VALUE, typeHelper2, izsVar2, expression4);
            Expression<Long> expression5 = readOptionalExpression6 == null ? expression4 : readOptionalExpression6;
            Expression<Long> expression6 = ga.e;
            Expression<Long> readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, StatCustomFieldKey.MIN_VALUE, typeHelper2, izsVar2, expression6);
            Expression<Long> expression7 = readOptionalExpression7 == null ? expression6 : readOptionalExpression7;
            y3 y3Var2 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", bpn0Var5);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "ranges", feVar.k7);
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, izsVar2, ga.m);
            DivAccessibility divAccessibility2 = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "secondary_value_accessibility", feVar.H);
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", feVar.k1);
            ukn uknVar = (ukn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_secondary_style", bpn0Var7);
            fa.b bVar = (fa.b) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_secondary_text_style", bpn0Var4);
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_secondary_value_variable");
            ukn uknVar2 = (ukn) JsonPropertyParser.read(parsingContext, jSONObject, "thumb_style", bpn0Var7);
            fa.b bVar2 = (fa.b) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_text_style", bpn0Var4);
            String str3 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_value_variable");
            ukn uknVar3 = (ukn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tick_mark_active_style", bpn0Var7);
            ukn uknVar4 = (ukn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tick_mark_inactive_style", bpn0Var7);
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", feVar.V8);
            ukn uknVar5 = (ukn) JsonPropertyParser.read(parsingContext, jSONObject, "track_active_style", bpn0Var7);
            ukn uknVar6 = (ukn) JsonPropertyParser.read(parsingContext, jSONObject, "track_inactive_style", bpn0Var7);
            hd hdVar = (hd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", feVar.Y8);
            d2 d2Var = (d2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", feVar.U1);
            e1 e1Var = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", bpn0Var3);
            e1 e1Var2 = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", bpn0Var3);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, ga.n);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", feVar.b9);
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", feVar.h9);
            TypeHelper<DivVisibility> typeHelper4 = ga.j;
            izs<String, DivVisibility> izsVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression8 = ga.f;
            Expression<DivVisibility> readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper4, izsVar4, expression8);
            if (readOptionalExpression10 != null) {
                expression8 = readOptionalExpression10;
            }
            zd zdVar = (zd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", bpn0Var2);
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", bpn0Var2);
            v9 v9Var3 = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var6);
            if (v9Var3 == null) {
                v9Var3 = ga.g;
            }
            return new fa(divAccessibility, readOptionalExpression, readOptionalExpression2, expression, readOptionalList, readOptionalList2, u1Var, readOptionalExpression4, readOptionalList3, readOptionalList4, jlnVar, readOptionalList5, v9Var2, str, expression3, vmnVar, y3Var, expression5, expression7, y3Var2, readOptionalList6, readOptionalExpression8, readOptionalExpression9, divAccessibility2, readOptionalList7, uknVar, bVar, str2, uknVar2, bVar2, str3, uknVar3, uknVar4, readOptionalList8, uknVar5, uknVar6, hdVar, d2Var, e1Var, e1Var2, readOptionalList9, readOptionalList10, readOptionalList11, expression8, zdVar, readOptionalList12, v9Var3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, fa faVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAccessibility divAccessibility = faVar.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divAccessibility, feVar.H);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", faVar.b, DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", faVar.c, DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", faVar.d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", faVar.e, feVar.t1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, faVar.f, feVar.F1);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", faVar.g, feVar.L1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", faVar.h);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", faVar.i, feVar.P2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", faVar.j, feVar.b3);
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", faVar.k, feVar.z3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", faVar.l, feVar.I3);
            v9 v9Var = faVar.m;
            bpn0 bpn0Var = feVar.Y6;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", v9Var, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", faVar.n);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", faVar.o);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", faVar.p, feVar.M4);
            y3 y3Var = faVar.q;
            bpn0 bpn0Var2 = feVar.Y2;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, bpn0Var2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, StatCustomFieldKey.MAX_VALUE, faVar.r);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, StatCustomFieldKey.MIN_VALUE, faVar.s);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", faVar.t, bpn0Var2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "ranges", faVar.u, feVar.k7);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", faVar.v);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", faVar.w);
            JsonPropertyParser.write(parsingContext, jSONObject, "secondary_value_accessibility", faVar.x, feVar.H);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", faVar.y, feVar.k1);
            ukn uknVar = faVar.z;
            bpn0 bpn0Var3 = feVar.V2;
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_secondary_style", uknVar, bpn0Var3);
            fa.b bVar = faVar.A;
            bpn0 bpn0Var4 = feVar.h7;
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_secondary_text_style", bVar, bpn0Var4);
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_secondary_value_variable", faVar.B);
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_style", faVar.C, bpn0Var3);
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_text_style", faVar.D, bpn0Var4);
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_value_variable", faVar.E);
            JsonPropertyParser.write(parsingContext, jSONObject, "tick_mark_active_style", faVar.F, bpn0Var3);
            JsonPropertyParser.write(parsingContext, jSONObject, "tick_mark_inactive_style", faVar.G, bpn0Var3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", faVar.H, feVar.V8);
            JsonPropertyParser.write(parsingContext, jSONObject, "track_active_style", faVar.I, bpn0Var3);
            JsonPropertyParser.write(parsingContext, jSONObject, "track_inactive_style", faVar.J, bpn0Var3);
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", faVar.K, feVar.Y8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", faVar.L, feVar.U1);
            e1 e1Var = faVar.M;
            bpn0 bpn0Var5 = feVar.z1;
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", e1Var, bpn0Var5);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", faVar.N, bpn0Var5);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", faVar.O, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slider");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", faVar.P, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", faVar.Q, feVar.h9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", faVar.R, DivVisibility.TO_STRING);
            zd zdVar = faVar.S;
            bpn0 bpn0Var6 = feVar.t9;
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", zdVar, bpn0Var6);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", faVar.T, bpn0Var6);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", faVar.U, bpn0Var);
            return jSONObject;
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class e implements Serializer, TemplateDeserializer {
        public final fe a;

        public e(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ka deserialize(ParsingContext parsingContext, ka kaVar, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<com.yandex.div2.f> field = kaVar != null ? kaVar.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, feVar.I);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", ga.h, allowPropertyOverride, kaVar != null ? kaVar.b : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", ga.i, allowPropertyOverride, kaVar != null ? kaVar.c : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, kaVar != null ? kaVar.d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, ga.k);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, kaVar != null ? kaVar.e : null, feVar.u1);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, kaVar != null ? kaVar.f : null, feVar.G1);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, kaVar != null ? kaVar.g : null, feVar.M1);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = kaVar != null ? kaVar.h : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new ka(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field2, izsVar, ga.l), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, kaVar != null ? kaVar.i : null, feVar.Q2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, kaVar != null ? kaVar.j : null, feVar.c3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, kaVar != null ? kaVar.k : null, feVar.A3), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, kaVar != null ? kaVar.l : null, feVar.J3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, kaVar != null ? kaVar.m : null, feVar.Z6), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, kaVar != null ? kaVar.n : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, kaVar != null ? kaVar.o : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, kaVar != null ? kaVar.p : null, feVar.N4), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, kaVar != null ? kaVar.q : null, feVar.Z2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, StatCustomFieldKey.MAX_VALUE, typeHelper, allowPropertyOverride, kaVar != null ? kaVar.r : null, izsVar), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, StatCustomFieldKey.MIN_VALUE, typeHelper, allowPropertyOverride, kaVar != null ? kaVar.s : null, izsVar), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, kaVar != null ? kaVar.t : null, feVar.Z2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "ranges", allowPropertyOverride, kaVar != null ? kaVar.u : null, feVar.l7), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, kaVar != null ? kaVar.v : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, kaVar != null ? kaVar.w : null, izsVar, ga.m), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "secondary_value_accessibility", allowPropertyOverride, kaVar != null ? kaVar.x : null, feVar.I), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, kaVar != null ? kaVar.y : null, feVar.l1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "thumb_secondary_style", allowPropertyOverride, kaVar != null ? kaVar.z : null, feVar.W2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "thumb_secondary_text_style", allowPropertyOverride, kaVar != null ? kaVar.A : null, feVar.i7), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "thumb_secondary_value_variable", allowPropertyOverride, kaVar != null ? kaVar.B : null), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "thumb_style", allowPropertyOverride, kaVar != null ? kaVar.C : null, feVar.W2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "thumb_text_style", allowPropertyOverride, kaVar != null ? kaVar.D : null, feVar.i7), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "thumb_value_variable", allowPropertyOverride, kaVar != null ? kaVar.E : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "tick_mark_active_style", allowPropertyOverride, kaVar != null ? kaVar.F : null, feVar.W2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "tick_mark_inactive_style", allowPropertyOverride, kaVar != null ? kaVar.G : null, feVar.W2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, kaVar != null ? kaVar.H : null, feVar.W8), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "track_active_style", allowPropertyOverride, kaVar != null ? kaVar.I : null, feVar.W2), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "track_inactive_style", allowPropertyOverride, kaVar != null ? kaVar.J : null, feVar.W2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, kaVar != null ? kaVar.K : null, feVar.Z8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, kaVar != null ? kaVar.L : null, feVar.V1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, kaVar != null ? kaVar.M : null, feVar.A1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, kaVar != null ? kaVar.N : null, feVar.A1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, kaVar != null ? kaVar.O : null, DivTransitionTrigger.FROM_STRING, ga.n), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, kaVar != null ? kaVar.P : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, kaVar != null ? kaVar.Q : null, feVar.i9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility", ga.j, allowPropertyOverride, kaVar != null ? kaVar.R : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, kaVar != null ? kaVar.S : null, feVar.u9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, kaVar != null ? kaVar.T : null, feVar.u9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, kaVar != null ? kaVar.U : null, feVar.Z6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, ka kaVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<com.yandex.div2.f> field = kaVar.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.I);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", kaVar.b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", kaVar.c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", kaVar.d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", kaVar.e, feVar.u1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, kaVar.f, feVar.G1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", kaVar.g, feVar.M1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", kaVar.h);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", kaVar.i, feVar.Q2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", kaVar.j, feVar.c3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", kaVar.k, feVar.A3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", kaVar.l, feVar.J3);
            Field<z9> field2 = kaVar.m;
            bpn0 bpn0Var = feVar.Z6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field2, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", kaVar.n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", kaVar.o);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", kaVar.p, feVar.N4);
            Field<a4> field3 = kaVar.q;
            bpn0 bpn0Var2 = feVar.Z2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field3, bpn0Var2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, StatCustomFieldKey.MAX_VALUE, kaVar.r);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, StatCustomFieldKey.MIN_VALUE, kaVar.s);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", kaVar.t, bpn0Var2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "ranges", kaVar.u, feVar.l7);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", kaVar.v);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", kaVar.w);
            JsonFieldParser.writeField(parsingContext, jSONObject, "secondary_value_accessibility", kaVar.x, feVar.I);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", kaVar.y, feVar.l1);
            Field<ykn> field4 = kaVar.z;
            bpn0 bpn0Var3 = feVar.W2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_secondary_style", field4, bpn0Var3);
            Field<ka.b> field5 = kaVar.A;
            bpn0 bpn0Var4 = feVar.i7;
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_secondary_text_style", field5, bpn0Var4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_secondary_value_variable", kaVar.B);
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_style", kaVar.C, bpn0Var3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_text_style", kaVar.D, bpn0Var4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_value_variable", kaVar.E);
            JsonFieldParser.writeField(parsingContext, jSONObject, "tick_mark_active_style", kaVar.F, bpn0Var3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "tick_mark_inactive_style", kaVar.G, bpn0Var3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", kaVar.H, feVar.W8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "track_active_style", kaVar.I, bpn0Var3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "track_inactive_style", kaVar.J, bpn0Var3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", kaVar.K, feVar.Z8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", kaVar.L, feVar.V1);
            Field<i1> field6 = kaVar.M;
            bpn0 bpn0Var5 = feVar.A1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", field6, bpn0Var5);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", kaVar.N, bpn0Var5);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", kaVar.O, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slider");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", kaVar.P, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", kaVar.Q, feVar.i9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", kaVar.R, DivVisibility.TO_STRING);
            Field<be> field7 = kaVar.S;
            bpn0 bpn0Var6 = feVar.u9;
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", field7, bpn0Var6);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", kaVar.T, bpn0Var6);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", kaVar.U, bpn0Var);
            return jSONObject;
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class f implements TemplateResolver<JSONObject, ka, fa> {
        public final fe a;

        public f(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fa resolve(ParsingContext parsingContext, ka kaVar, JSONObject jSONObject) throws ParsingException {
            Field<com.yandex.div2.f> field = kaVar.a;
            fe feVar = this.a;
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "accessibility", feVar.J, feVar.H);
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, kaVar.b, jSONObject, "alignment_horizontal", ga.h, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, kaVar.c, jSONObject, "alignment_vertical", ga.i, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field2 = kaVar.d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            io.reactivex.rxjava3.internal.operators.observable.n0 n0Var = ga.k;
            Expression<Double> expression = ga.a;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alpha", typeHelper, izsVar, n0Var, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, kaVar.e, jSONObject, "animators", feVar.v1, feVar.t1);
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, kaVar.f, jSONObject, L2.g, feVar.H1, feVar.F1);
            u1 u1Var = (u1) JsonFieldResolver.resolveOptional(parsingContext, kaVar.g, jSONObject, "border", feVar.N1, feVar.L1);
            Field<Expression<Long>> field3 = kaVar.h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "column_span", typeHelper2, izsVar2, ga.l);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, kaVar.i, jSONObject, "disappear_actions", feVar.R2, feVar.P2);
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, kaVar.j, jSONObject, "extensions", feVar.d3, feVar.b3);
            jln jlnVar = (jln) JsonFieldResolver.resolveOptional(parsingContext, kaVar.k, jSONObject, "focus", feVar.B3, feVar.z3);
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, kaVar.l, jSONObject, "functions", feVar.K3, feVar.I3);
            v9 v9Var = (v9) JsonFieldResolver.resolveOptional(parsingContext, kaVar.m, jSONObject, "height", feVar.a7, feVar.Y6);
            if (v9Var == null) {
                v9Var = ga.b;
            }
            v9 v9Var2 = v9Var;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, kaVar.n, jSONObject, "id");
            Field<Expression<Boolean>> field4 = kaVar.o;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = ga.c;
            Expression<Boolean> resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "is_enabled", typeHelper3, izsVar3, expression2);
            Expression<Boolean> expression3 = resolveOptionalExpression5 == null ? expression2 : resolveOptionalExpression5;
            vmn vmnVar = (vmn) JsonFieldResolver.resolveOptional(parsingContext, kaVar.p, jSONObject, "layout_provider", feVar.O4, feVar.M4);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, kaVar.q, jSONObject, "margins", feVar.a3, feVar.Y2);
            Field<Expression<Long>> field5 = kaVar.r;
            Expression<Long> expression4 = ga.d;
            Expression<Long> resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, StatCustomFieldKey.MAX_VALUE, typeHelper2, izsVar2, expression4);
            Expression<Long> expression5 = resolveOptionalExpression6 == null ? expression4 : resolveOptionalExpression6;
            Field<Expression<Long>> field6 = kaVar.s;
            Expression<Long> expression6 = ga.e;
            Expression<Long> resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, StatCustomFieldKey.MIN_VALUE, typeHelper2, izsVar2, expression6);
            Expression<Long> expression7 = resolveOptionalExpression7 == null ? expression6 : resolveOptionalExpression7;
            y3 y3Var2 = (y3) JsonFieldResolver.resolveOptional(parsingContext, kaVar.t, jSONObject, "paddings", feVar.a3, feVar.Y2);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, kaVar.u, jSONObject, "ranges", feVar.m7, feVar.k7);
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, kaVar.v, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, kaVar.w, jSONObject, "row_span", typeHelper2, izsVar2, ga.m);
            DivAccessibility divAccessibility2 = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, kaVar.x, jSONObject, "secondary_value_accessibility", feVar.J, feVar.H);
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, kaVar.y, jSONObject, "selected_actions", feVar.m1, feVar.k1);
            ukn uknVar = (ukn) JsonFieldResolver.resolveOptional(parsingContext, kaVar.z, jSONObject, "thumb_secondary_style", feVar.X2, feVar.V2);
            fa.b bVar = (fa.b) JsonFieldResolver.resolveOptional(parsingContext, kaVar.A, jSONObject, "thumb_secondary_text_style", feVar.j7, feVar.h7);
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, kaVar.B, jSONObject, "thumb_secondary_value_variable");
            ukn uknVar2 = (ukn) JsonFieldResolver.resolve(parsingContext, kaVar.C, jSONObject, "thumb_style", feVar.X2, feVar.V2);
            fa.b bVar2 = (fa.b) JsonFieldResolver.resolveOptional(parsingContext, kaVar.D, jSONObject, "thumb_text_style", feVar.j7, feVar.h7);
            String str3 = (String) JsonFieldResolver.resolveOptional(parsingContext, kaVar.E, jSONObject, "thumb_value_variable");
            ukn uknVar3 = (ukn) JsonFieldResolver.resolveOptional(parsingContext, kaVar.F, jSONObject, "tick_mark_active_style", feVar.X2, feVar.V2);
            ukn uknVar4 = (ukn) JsonFieldResolver.resolveOptional(parsingContext, kaVar.G, jSONObject, "tick_mark_inactive_style", feVar.X2, feVar.V2);
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, kaVar.H, jSONObject, "tooltips", feVar.X8, feVar.V8);
            ukn uknVar5 = (ukn) JsonFieldResolver.resolve(parsingContext, kaVar.I, jSONObject, "track_active_style", feVar.X2, feVar.V2);
            ukn uknVar6 = (ukn) JsonFieldResolver.resolve(parsingContext, kaVar.J, jSONObject, "track_inactive_style", feVar.X2, feVar.V2);
            hd hdVar = (hd) JsonFieldResolver.resolveOptional(parsingContext, kaVar.K, jSONObject, "transform", feVar.a9, feVar.Y8);
            d2 d2Var = (d2) JsonFieldResolver.resolveOptional(parsingContext, kaVar.L, jSONObject, "transition_change", feVar.W1, feVar.U1);
            e1 e1Var = (e1) JsonFieldResolver.resolveOptional(parsingContext, kaVar.M, jSONObject, "transition_in", feVar.B1, feVar.z1);
            e1 e1Var2 = (e1) JsonFieldResolver.resolveOptional(parsingContext, kaVar.N, jSONObject, "transition_out", feVar.B1, feVar.z1);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, kaVar.O, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, ga.n);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, kaVar.P, jSONObject, "variable_triggers", feVar.d9, feVar.b9);
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, kaVar.Q, jSONObject, "variables", feVar.j9, feVar.h9);
            Field<Expression<DivVisibility>> field7 = kaVar.R;
            TypeHelper<DivVisibility> typeHelper4 = ga.j;
            izs<String, DivVisibility> izsVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression8 = ga.f;
            Expression<DivVisibility> resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "visibility", typeHelper4, izsVar4, expression8);
            if (resolveOptionalExpression10 != null) {
                expression8 = resolveOptionalExpression10;
            }
            zd zdVar = (zd) JsonFieldResolver.resolveOptional(parsingContext, kaVar.S, jSONObject, "visibility_action", feVar.v9, feVar.t9);
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, kaVar.T, jSONObject, "visibility_actions", feVar.v9, feVar.t9);
            v9 v9Var3 = (v9) JsonFieldResolver.resolveOptional(parsingContext, kaVar.U, jSONObject, "width", feVar.a7, feVar.Y6);
            if (v9Var3 == null) {
                v9Var3 = ga.g;
            }
            return new fa(divAccessibility, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList, resolveOptionalList2, u1Var, resolveOptionalExpression4, resolveOptionalList3, resolveOptionalList4, jlnVar, resolveOptionalList5, v9Var2, str, expression3, vmnVar, y3Var, expression5, expression7, y3Var2, resolveOptionalList6, resolveOptionalExpression8, resolveOptionalExpression9, divAccessibility2, resolveOptionalList7, uknVar, bVar, str2, uknVar2, bVar2, str3, uknVar3, uknVar4, resolveOptionalList8, uknVar5, uknVar6, hdVar, d2Var, e1Var, e1Var2, resolveOptionalList9, resolveOptionalList10, resolveOptionalList11, expression8, zdVar, resolveOptionalList12, v9Var3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        b = new v9.c(new krn(null, null, null));
        c = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        d = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        e = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        f = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        g = new v9.b(new w6(null, null, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        h = companion2.from(rl3.L(DivAlignmentHorizontal.values()), a.i);
        i = companion2.from(rl3.L(DivAlignmentVertical.values()), b.i);
        j = companion2.from(divVisibility, c.i);
        k = new io.reactivex.rxjava3.internal.operators.observable.n0(19);
        l = new dr(14);
        m = new com.vk.movika.sdk.android.defaultplayer.view.a(15);
        n = new er(15);
    }
}
