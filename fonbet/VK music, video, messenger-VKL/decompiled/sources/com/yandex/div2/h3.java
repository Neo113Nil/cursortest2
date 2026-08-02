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
import com.yandex.div2.v9;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.izs;
import xsna.jln;
import xsna.jq;
import xsna.kq;
import xsna.krn;
import xsna.lq;
import xsna.mq;
import xsna.rl3;
import xsna.vmn;

/* compiled from: DivCustomJsonParser.kt */
/* loaded from: classes8.dex */
public final class h3 {

    @Deprecated
    public static final Expression<Double> a;

    @Deprecated
    public static final v9.c b;

    @Deprecated
    public static final Expression<DivVisibility> c;

    @Deprecated
    public static final v9.b d;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> e;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> f;

    @Deprecated
    public static final TypeHelper<DivVisibility> g;

    @Deprecated
    public static final jq h;

    @Deprecated
    public static final kq i;

    @Deprecated
    public static final lq j;

    @Deprecated
    public static final mq k;

    /* compiled from: DivCustomJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivCustomJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivCustomJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivCustomJsonParser.kt */
    public static final class d implements Serializer, Deserializer {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g3 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.H;
            bpn0 bpn0Var2 = feVar.t9;
            bpn0 bpn0Var3 = feVar.z1;
            bpn0 bpn0Var4 = feVar.Y2;
            bpn0 bpn0Var5 = feVar.Y6;
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", bpn0Var);
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", h3.e, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", h3.f, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            jq jqVar = h3.h;
            Expression<Double> expression = h3.a;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, izsVar, jqVar, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", feVar.t1);
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
            u1 u1Var = (u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, izsVar2, h3.i);
            JSONObject jSONObject2 = (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "custom_props");
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "custom_type");
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", feVar.P2);
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", feVar.b3);
            jln jlnVar = (jln) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", feVar.z3);
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", feVar.I3);
            v9 v9Var = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var5);
            if (v9Var == null) {
                v9Var = h3.b;
            }
            v9 v9Var2 = v9Var;
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", feVar.z9);
            vmn vmnVar = (vmn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", feVar.M4);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", bpn0Var4);
            y3 y3Var2 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", bpn0Var4);
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, izsVar2, h3.j);
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", feVar.k1);
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", feVar.V8);
            hd hdVar = (hd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", feVar.Y8);
            d2 d2Var = (d2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", feVar.U1);
            e1 e1Var = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", bpn0Var3);
            e1 e1Var2 = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", bpn0Var3);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, h3.k);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", feVar.b9);
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", feVar.h9);
            TypeHelper<DivVisibility> typeHelper3 = h3.g;
            izs<String, DivVisibility> izsVar3 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression2 = h3.c;
            Expression<DivVisibility> readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper3, izsVar3, expression2);
            if (readOptionalExpression7 != null) {
                expression2 = readOptionalExpression7;
            }
            zd zdVar = (zd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", bpn0Var2);
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", bpn0Var2);
            v9 v9Var3 = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var5);
            if (v9Var3 == null) {
                v9Var3 = h3.d;
            }
            return new g3(divAccessibility, readOptionalExpression, readOptionalExpression2, expression, readOptionalList, readOptionalList2, u1Var, readOptionalExpression4, jSONObject2, str, readOptionalList3, readOptionalList4, jlnVar, readOptionalList5, v9Var2, str2, readOptionalList6, vmnVar, y3Var, y3Var2, readOptionalExpression5, readOptionalExpression6, readOptionalList7, readOptionalList8, hdVar, d2Var, e1Var, e1Var2, readOptionalList9, readOptionalList10, readOptionalList11, expression2, zdVar, readOptionalList12, v9Var3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, g3 g3Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAccessibility divAccessibility = g3Var.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divAccessibility, feVar.H);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", g3Var.b, DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", g3Var.c, DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", g3Var.d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", g3Var.e, feVar.t1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, g3Var.f, feVar.F1);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", g3Var.g, feVar.L1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", g3Var.h);
            JsonPropertyParser.write(parsingContext, jSONObject, "custom_props", g3Var.i);
            JsonPropertyParser.write(parsingContext, jSONObject, "custom_type", g3Var.j);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", g3Var.k, feVar.P2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", g3Var.l, feVar.b3);
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", g3Var.m, feVar.z3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", g3Var.n, feVar.I3);
            v9 v9Var = g3Var.o;
            bpn0 bpn0Var = feVar.Y6;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", v9Var, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", g3Var.p);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", g3Var.q, feVar.z9);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", g3Var.r, feVar.M4);
            y3 y3Var = g3Var.s;
            bpn0 bpn0Var2 = feVar.Y2;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, bpn0Var2);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", g3Var.t, bpn0Var2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", g3Var.u);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", g3Var.v);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", g3Var.w, feVar.k1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", g3Var.x, feVar.V8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", g3Var.y, feVar.Y8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", g3Var.z, feVar.U1);
            e1 e1Var = g3Var.A;
            bpn0 bpn0Var3 = feVar.z1;
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", e1Var, bpn0Var3);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", g3Var.B, bpn0Var3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", g3Var.C, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "custom");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", g3Var.D, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", g3Var.E, feVar.h9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", g3Var.F, DivVisibility.TO_STRING);
            zd zdVar = g3Var.G;
            bpn0 bpn0Var4 = feVar.t9;
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", zdVar, bpn0Var4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", g3Var.H, bpn0Var4);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", g3Var.I, bpn0Var);
            return jSONObject;
        }
    }

    /* compiled from: DivCustomJsonParser.kt */
    public static final class e implements Serializer, TemplateDeserializer {
        public final fe a;

        public e(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i3 deserialize(ParsingContext parsingContext, i3 i3Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<com.yandex.div2.f> field = i3Var != null ? i3Var.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, feVar.I);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", h3.e, allowPropertyOverride, i3Var != null ? i3Var.b : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", h3.f, allowPropertyOverride, i3Var != null ? i3Var.c : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, i3Var != null ? i3Var.d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, h3.h);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, i3Var != null ? i3Var.e : null, feVar.u1);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, i3Var != null ? i3Var.f : null, feVar.G1);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, i3Var != null ? i3Var.g : null, feVar.M1);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = i3Var != null ? i3Var.h : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new i3(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field2, izsVar, h3.i), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "custom_props", allowPropertyOverride, i3Var != null ? i3Var.i : null), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "custom_type", allowPropertyOverride, i3Var != null ? i3Var.j : null), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, i3Var != null ? i3Var.k : null, feVar.Q2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, i3Var != null ? i3Var.l : null, feVar.c3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, i3Var != null ? i3Var.m : null, feVar.A3), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, i3Var != null ? i3Var.n : null, feVar.J3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, i3Var != null ? i3Var.o : null, feVar.Z6), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, i3Var != null ? i3Var.p : null), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "items", allowPropertyOverride, i3Var != null ? i3Var.q : null, feVar.A9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, i3Var != null ? i3Var.r : null, feVar.N4), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, i3Var != null ? i3Var.s : null, feVar.Z2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, i3Var != null ? i3Var.t : null, feVar.Z2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, i3Var != null ? i3Var.u : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, i3Var != null ? i3Var.v : null, izsVar, h3.j), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, i3Var != null ? i3Var.w : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, i3Var != null ? i3Var.x : null, feVar.W8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, i3Var != null ? i3Var.y : null, feVar.Z8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, i3Var != null ? i3Var.z : null, feVar.V1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, i3Var != null ? i3Var.A : null, feVar.A1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, i3Var != null ? i3Var.B : null, feVar.A1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, i3Var != null ? i3Var.C : null, DivTransitionTrigger.FROM_STRING, h3.k), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, i3Var != null ? i3Var.D : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, i3Var != null ? i3Var.E : null, feVar.i9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility", h3.g, allowPropertyOverride, i3Var != null ? i3Var.F : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, i3Var != null ? i3Var.G : null, feVar.u9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, i3Var != null ? i3Var.H : null, feVar.u9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, i3Var != null ? i3Var.I : null, feVar.Z6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, i3 i3Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<com.yandex.div2.f> field = i3Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.I);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", i3Var.b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", i3Var.c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", i3Var.d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", i3Var.e, feVar.u1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, i3Var.f, feVar.G1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", i3Var.g, feVar.M1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", i3Var.h);
            JsonFieldParser.writeField(parsingContext, jSONObject, "custom_props", i3Var.i);
            JsonFieldParser.writeField(parsingContext, jSONObject, "custom_type", i3Var.j);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", i3Var.k, feVar.Q2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", i3Var.l, feVar.c3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", i3Var.m, feVar.A3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", i3Var.n, feVar.J3);
            Field<z9> field2 = i3Var.o;
            bpn0 bpn0Var = feVar.Z6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field2, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", i3Var.p);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", i3Var.q, feVar.A9);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", i3Var.r, feVar.N4);
            Field<a4> field3 = i3Var.s;
            bpn0 bpn0Var2 = feVar.Z2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field3, bpn0Var2);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", i3Var.t, bpn0Var2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", i3Var.u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", i3Var.v);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", i3Var.w, feVar.l1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", i3Var.x, feVar.W8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", i3Var.y, feVar.Z8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", i3Var.z, feVar.V1);
            Field<i1> field4 = i3Var.A;
            bpn0 bpn0Var3 = feVar.A1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", field4, bpn0Var3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", i3Var.B, bpn0Var3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", i3Var.C, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "custom");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", i3Var.D, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", i3Var.E, feVar.i9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", i3Var.F, DivVisibility.TO_STRING);
            Field<be> field5 = i3Var.G;
            bpn0 bpn0Var4 = feVar.u9;
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", field5, bpn0Var4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", i3Var.H, bpn0Var4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", i3Var.I, bpn0Var);
            return jSONObject;
        }
    }

    /* compiled from: DivCustomJsonParser.kt */
    public static final class f implements TemplateResolver<JSONObject, i3, g3> {
        public final fe a;

        public f(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g3 resolve(ParsingContext parsingContext, i3 i3Var, JSONObject jSONObject) throws ParsingException {
            Field<com.yandex.div2.f> field = i3Var.a;
            fe feVar = this.a;
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "accessibility", feVar.J, feVar.H);
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, i3Var.b, jSONObject, "alignment_horizontal", h3.e, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, i3Var.c, jSONObject, "alignment_vertical", h3.f, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field2 = i3Var.d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            jq jqVar = h3.h;
            Expression<Double> expression = h3.a;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alpha", typeHelper, izsVar, jqVar, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, i3Var.e, jSONObject, "animators", feVar.v1, feVar.t1);
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, i3Var.f, jSONObject, L2.g, feVar.H1, feVar.F1);
            u1 u1Var = (u1) JsonFieldResolver.resolveOptional(parsingContext, i3Var.g, jSONObject, "border", feVar.N1, feVar.L1);
            Field<Expression<Long>> field3 = i3Var.h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "column_span", typeHelper2, izsVar2, h3.i);
            JSONObject jSONObject2 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, i3Var.i, jSONObject, "custom_props");
            String str = (String) JsonFieldResolver.resolve(parsingContext, i3Var.j, jSONObject, "custom_type");
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, i3Var.k, jSONObject, "disappear_actions", feVar.R2, feVar.P2);
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, i3Var.l, jSONObject, "extensions", feVar.d3, feVar.b3);
            jln jlnVar = (jln) JsonFieldResolver.resolveOptional(parsingContext, i3Var.m, jSONObject, "focus", feVar.B3, feVar.z3);
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, i3Var.n, jSONObject, "functions", feVar.K3, feVar.I3);
            v9 v9Var = (v9) JsonFieldResolver.resolveOptional(parsingContext, i3Var.o, jSONObject, "height", feVar.a7, feVar.Y6);
            if (v9Var == null) {
                v9Var = h3.b;
            }
            v9 v9Var2 = v9Var;
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, i3Var.p, jSONObject, "id");
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, i3Var.q, jSONObject, "items", feVar.B9, feVar.z9);
            vmn vmnVar = (vmn) JsonFieldResolver.resolveOptional(parsingContext, i3Var.r, jSONObject, "layout_provider", feVar.O4, feVar.M4);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, i3Var.s, jSONObject, "margins", feVar.a3, feVar.Y2);
            y3 y3Var2 = (y3) JsonFieldResolver.resolveOptional(parsingContext, i3Var.t, jSONObject, "paddings", feVar.a3, feVar.Y2);
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, i3Var.u, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, i3Var.v, jSONObject, "row_span", typeHelper2, izsVar2, h3.j);
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, i3Var.w, jSONObject, "selected_actions", feVar.m1, feVar.k1);
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, i3Var.x, jSONObject, "tooltips", feVar.X8, feVar.V8);
            hd hdVar = (hd) JsonFieldResolver.resolveOptional(parsingContext, i3Var.y, jSONObject, "transform", feVar.a9, feVar.Y8);
            d2 d2Var = (d2) JsonFieldResolver.resolveOptional(parsingContext, i3Var.z, jSONObject, "transition_change", feVar.W1, feVar.U1);
            e1 e1Var = (e1) JsonFieldResolver.resolveOptional(parsingContext, i3Var.A, jSONObject, "transition_in", feVar.B1, feVar.z1);
            e1 e1Var2 = (e1) JsonFieldResolver.resolveOptional(parsingContext, i3Var.B, jSONObject, "transition_out", feVar.B1, feVar.z1);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, i3Var.C, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, h3.k);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, i3Var.D, jSONObject, "variable_triggers", feVar.d9, feVar.b9);
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, i3Var.E, jSONObject, "variables", feVar.j9, feVar.h9);
            Field<Expression<DivVisibility>> field4 = i3Var.F;
            TypeHelper<DivVisibility> typeHelper3 = h3.g;
            izs<String, DivVisibility> izsVar3 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression2 = h3.c;
            Expression<DivVisibility> resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "visibility", typeHelper3, izsVar3, expression2);
            if (resolveOptionalExpression7 != null) {
                expression2 = resolveOptionalExpression7;
            }
            zd zdVar = (zd) JsonFieldResolver.resolveOptional(parsingContext, i3Var.G, jSONObject, "visibility_action", feVar.v9, feVar.t9);
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, i3Var.H, jSONObject, "visibility_actions", feVar.v9, feVar.t9);
            v9 v9Var3 = (v9) JsonFieldResolver.resolveOptional(parsingContext, i3Var.I, jSONObject, "width", feVar.a7, feVar.Y6);
            if (v9Var3 == null) {
                v9Var3 = h3.d;
            }
            return new g3(divAccessibility, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList, resolveOptionalList2, u1Var, resolveOptionalExpression4, jSONObject2, str, resolveOptionalList3, resolveOptionalList4, jlnVar, resolveOptionalList5, v9Var2, str2, resolveOptionalList6, vmnVar, y3Var, y3Var2, resolveOptionalExpression5, resolveOptionalExpression6, resolveOptionalList7, resolveOptionalList8, hdVar, d2Var, e1Var, e1Var2, resolveOptionalList9, resolveOptionalList10, resolveOptionalList11, expression2, zdVar, resolveOptionalList12, v9Var3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        b = new v9.c(new krn(null, null, null));
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        c = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        d = new v9.b(new w6(null, null, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        e = companion2.from(rl3.L(DivAlignmentHorizontal.values()), a.i);
        f = companion2.from(rl3.L(DivAlignmentVertical.values()), b.i);
        g = companion2.from(divVisibility, c.i);
        h = new jq(13);
        i = new kq(12);
        j = new lq(13);
        k = new mq(14);
    }
}
