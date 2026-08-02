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
import xsna.hq;
import xsna.iq;
import xsna.izs;
import xsna.jln;
import xsna.jq;
import xsna.kq;
import xsna.krn;
import xsna.lq;
import xsna.rl3;
import xsna.vmn;

/* compiled from: DivVideoJsonParser.kt */
/* loaded from: classes8.dex */
public final class sd {

    @Deprecated
    public static final Expression<Double> a;

    @Deprecated
    public static final Expression<Boolean> b;

    @Deprecated
    public static final v9.c c;

    @Deprecated
    public static final Expression<Boolean> d;

    @Deprecated
    public static final Expression<Boolean> e;

    @Deprecated
    public static final Expression<Boolean> f;

    @Deprecated
    public static final Expression<DivVideoScale> g;

    @Deprecated
    public static final Expression<DivVisibility> h;

    @Deprecated
    public static final v9.b i;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> j;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> k;

    @Deprecated
    public static final TypeHelper<DivVideoScale> l;

    @Deprecated
    public static final TypeHelper<DivVisibility> m;

    @Deprecated
    public static final hq n;

    @Deprecated
    public static final iq o;

    @Deprecated
    public static final jq p;

    @Deprecated
    public static final kq q;

    @Deprecated
    public static final lq r;

    /* compiled from: DivVideoJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivVideoJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivVideoJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVideoScale);
        }
    }

    /* compiled from: DivVideoJsonParser.kt */
    public static final class d extends Lambda implements izs<Object, Boolean> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivVideoJsonParser.kt */
    public static final class e implements Serializer, Deserializer {
        public final fe a;

        public e(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rd deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.H;
            bpn0 bpn0Var2 = feVar.t9;
            bpn0 bpn0Var3 = feVar.z1;
            bpn0 bpn0Var4 = feVar.Y2;
            bpn0 bpn0Var5 = feVar.Y6;
            bpn0 bpn0Var6 = feVar.k1;
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", bpn0Var);
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", sd.j, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", sd.k, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            hq hqVar = sd.n;
            Expression<Double> expression = sd.a;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, izsVar, hqVar, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", feVar.t1);
            j1 j1Var = (j1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", feVar.C1);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = sd.b;
            Expression<Boolean> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "autostart", typeHelper2, izsVar2, expression2);
            Expression<Boolean> expression3 = readOptionalExpression4 == null ? expression2 : readOptionalExpression4;
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
            u1 u1Var = (u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "buffering_actions", bpn0Var6);
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, izsVar3, sd.o);
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", feVar.P2);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "elapsed_time_variable");
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", bpn0Var6);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", feVar.b3);
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "fatal_actions", bpn0Var6);
            jln jlnVar = (jln) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", feVar.z3);
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", feVar.I3);
            v9 v9Var = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var5);
            if (v9Var == null) {
                v9Var = sd.c;
            }
            v9 v9Var2 = v9Var;
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            vmn vmnVar = (vmn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", feVar.M4);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", bpn0Var4);
            Expression<Boolean> expression4 = sd.d;
            Expression<Boolean> readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "muted", typeHelper2, izsVar2, expression4);
            Expression<Boolean> expression5 = readOptionalExpression6 == null ? expression4 : readOptionalExpression6;
            y3 y3Var2 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", bpn0Var4);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "pause_actions", bpn0Var6);
            JSONObject jSONObject2 = (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "player_settings_payload");
            Expression<Boolean> expression6 = sd.e;
            Expression<Boolean> readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper2, izsVar2, expression6);
            Expression<Boolean> expression7 = readOptionalExpression7 == null ? expression6 : readOptionalExpression7;
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preview", typeHelper4);
            Expression<Boolean> expression8 = sd.f;
            Expression<Double> expression9 = expression;
            Expression<Boolean> readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "repeatable", typeHelper2, izsVar2, expression8);
            Expression<Boolean> expression10 = readOptionalExpression9 == null ? expression8 : readOptionalExpression9;
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "resume_actions", bpn0Var6);
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper4);
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, izsVar3, sd.p);
            TypeHelper<DivVideoScale> typeHelper5 = sd.l;
            izs<String, DivVideoScale> izsVar4 = DivVideoScale.FROM_STRING;
            Expression<DivVideoScale> expression11 = sd.g;
            Expression<DivVideoScale> readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper5, izsVar4, expression11);
            Expression<DivVideoScale> expression12 = readOptionalExpression12 == null ? expression11 : readOptionalExpression12;
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", bpn0Var6);
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", feVar.V8);
            hd hdVar = (hd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", feVar.Y8);
            d2 d2Var = (d2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", feVar.U1);
            e1 e1Var = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", bpn0Var3);
            e1 e1Var2 = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", bpn0Var3);
            List readOptionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, sd.q);
            List readOptionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", feVar.b9);
            List readOptionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", feVar.h9);
            List readList = JsonPropertyParser.readList(parsingContext, jSONObject, "video_sources", feVar.k9, sd.r);
            TypeHelper<DivVisibility> typeHelper6 = sd.m;
            izs<String, DivVisibility> izsVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression13 = sd.h;
            Expression<DivVisibility> readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper6, izsVar5, expression13);
            if (readOptionalExpression13 != null) {
                expression13 = readOptionalExpression13;
            }
            zd zdVar = (zd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", bpn0Var2);
            List readOptionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", bpn0Var2);
            v9 v9Var3 = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var5);
            if (v9Var3 == null) {
                v9Var3 = sd.i;
            }
            return new rd(divAccessibility, readOptionalExpression, readOptionalExpression2, expression9, readOptionalList, j1Var, expression3, readOptionalList2, u1Var, readOptionalList3, readOptionalExpression5, readOptionalList4, str, readOptionalList5, readOptionalList6, readOptionalList7, jlnVar, readOptionalList8, v9Var2, str2, vmnVar, y3Var, expression5, y3Var2, readOptionalList9, jSONObject2, expression7, readOptionalExpression8, expression10, readOptionalList10, readOptionalExpression10, readOptionalExpression11, expression12, readOptionalList11, readOptionalList12, hdVar, d2Var, e1Var, e1Var2, readOptionalList13, readOptionalList14, readOptionalList15, readList, expression13, zdVar, readOptionalList16, v9Var3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, rd rdVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAccessibility divAccessibility = rdVar.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divAccessibility, feVar.H);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", rdVar.b, DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", rdVar.c, DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", rdVar.d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", rdVar.e, feVar.t1);
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", rdVar.f, feVar.C1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "autostart", rdVar.g);
            JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, rdVar.h, feVar.F1);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", rdVar.i, feVar.L1);
            List<DivAction> list = rdVar.j;
            bpn0 bpn0Var = feVar.k1;
            JsonPropertyParser.writeList(parsingContext, jSONObject, "buffering_actions", list, bpn0Var);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", rdVar.k);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", rdVar.l, feVar.P2);
            JsonPropertyParser.write(parsingContext, jSONObject, "elapsed_time_variable", rdVar.m);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", rdVar.n, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", rdVar.o, feVar.b3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "fatal_actions", rdVar.p, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", rdVar.q, feVar.z3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", rdVar.r, feVar.I3);
            v9 v9Var = rdVar.s;
            bpn0 bpn0Var2 = feVar.Y6;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", v9Var, bpn0Var2);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", rdVar.t);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", rdVar.u, feVar.M4);
            y3 y3Var = rdVar.v;
            bpn0 bpn0Var3 = feVar.Y2;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, bpn0Var3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "muted", rdVar.w);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", rdVar.x, bpn0Var3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "pause_actions", rdVar.y, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "player_settings_payload", rdVar.z);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", rdVar.A);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preview", rdVar.B);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "repeatable", rdVar.C);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "resume_actions", rdVar.D, bpn0Var);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", rdVar.E);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", rdVar.F);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", rdVar.G, DivVideoScale.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", rdVar.H, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", rdVar.I, feVar.V8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", rdVar.J, feVar.Y8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", rdVar.K, feVar.U1);
            e1 e1Var = rdVar.L;
            bpn0 bpn0Var4 = feVar.z1;
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", e1Var, bpn0Var4);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", rdVar.M, bpn0Var4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", rdVar.N, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", rdVar.O, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", rdVar.P, feVar.h9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "video_sources", rdVar.Q, feVar.k9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", rdVar.R, DivVisibility.TO_STRING);
            zd zdVar = rdVar.S;
            bpn0 bpn0Var5 = feVar.t9;
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", zdVar, bpn0Var5);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", rdVar.T, bpn0Var5);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", rdVar.U, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivVideoJsonParser.kt */
    public static final class f implements Serializer, TemplateDeserializer {
        public final fe a;

        public f(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final yd deserialize(ParsingContext parsingContext, yd ydVar, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<com.yandex.div2.f> field = ydVar != null ? ydVar.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, feVar.I);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", sd.j, allowPropertyOverride, ydVar != null ? ydVar.b : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", sd.k, allowPropertyOverride, ydVar != null ? ydVar.c : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, ydVar != null ? ydVar.d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, sd.n);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, ydVar != null ? ydVar.e : null, feVar.u1);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, ydVar != null ? ydVar.f : null, feVar.D1);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field2 = ydVar != null ? ydVar.g : null;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "autostart", typeHelper, allowPropertyOverride, field2, izsVar);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, ydVar != null ? ydVar.h : null, feVar.G1);
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, ydVar != null ? ydVar.i : null, feVar.M1);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "buffering_actions", allowPropertyOverride, ydVar != null ? ydVar.j : null, feVar.l1);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field3 = ydVar != null ? ydVar.k : null;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field3, izsVar2, sd.o);
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, ydVar != null ? ydVar.l : null, feVar.Q2);
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "elapsed_time_variable", allowPropertyOverride, ydVar != null ? ydVar.m : null);
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, ydVar != null ? ydVar.n : null, feVar.l1);
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, ydVar != null ? ydVar.o : null, feVar.c3);
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "fatal_actions", allowPropertyOverride, ydVar != null ? ydVar.p : null, feVar.l1);
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, ydVar != null ? ydVar.q : null, feVar.A3);
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, ydVar != null ? ydVar.r : null, feVar.J3);
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, ydVar != null ? ydVar.s : null, feVar.Z6);
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, ydVar != null ? ydVar.t : null);
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, ydVar != null ? ydVar.u : null, feVar.N4);
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, ydVar != null ? ydVar.v : null, feVar.Z2);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "muted", typeHelper, allowPropertyOverride, ydVar != null ? ydVar.w : null, izsVar);
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, ydVar != null ? ydVar.x : null, feVar.Z2);
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "pause_actions", allowPropertyOverride, ydVar != null ? ydVar.y : null, feVar.l1);
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "player_settings_payload", allowPropertyOverride, ydVar != null ? ydVar.z : null);
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "preload_required", typeHelper, allowPropertyOverride, ydVar != null ? ydVar.A : null, izsVar);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            return new yd(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalField2, readOptionalFieldWithExpression4, readOptionalListField2, readOptionalField3, readOptionalListField3, readOptionalFieldWithExpression5, readOptionalListField4, readOptionalField4, readOptionalListField5, readOptionalListField6, readOptionalListField7, readOptionalField5, readOptionalListField8, readOptionalField6, readOptionalField7, readOptionalField8, readOptionalField9, readOptionalFieldWithExpression6, readOptionalField10, readOptionalListField9, readOptionalField11, readOptionalFieldWithExpression7, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "preview", typeHelper3, allowPropertyOverride, ydVar != null ? ydVar.B : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "repeatable", typeHelper, allowPropertyOverride, ydVar != null ? ydVar.C : null, izsVar), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "resume_actions", allowPropertyOverride, ydVar != null ? ydVar.D : null, feVar.l1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", typeHelper3, allowPropertyOverride, ydVar != null ? ydVar.E : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, ydVar != null ? ydVar.F : null, izsVar2, sd.p), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "scale", sd.l, allowPropertyOverride, ydVar != null ? ydVar.G : null, DivVideoScale.FROM_STRING), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, ydVar != null ? ydVar.H : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, ydVar != null ? ydVar.I : null, feVar.W8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, ydVar != null ? ydVar.J : null, feVar.Z8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, ydVar != null ? ydVar.K : null, feVar.V1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, ydVar != null ? ydVar.L : null, feVar.A1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, ydVar != null ? ydVar.M : null, feVar.A1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, ydVar != null ? ydVar.N : null, DivTransitionTrigger.FROM_STRING, sd.q), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, ydVar != null ? ydVar.O : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, ydVar != null ? ydVar.P : null, feVar.i9), JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "video_sources", allowPropertyOverride, ydVar != null ? ydVar.Q : null, feVar.l9, sd.r), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility", sd.m, allowPropertyOverride, ydVar != null ? ydVar.R : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, ydVar != null ? ydVar.S : null, feVar.u9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, ydVar != null ? ydVar.T : null, feVar.u9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, ydVar != null ? ydVar.U : null, feVar.Z6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, yd ydVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<com.yandex.div2.f> field = ydVar.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.I);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", ydVar.b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", ydVar.c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", ydVar.d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", ydVar.e, feVar.u1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", ydVar.f, feVar.D1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "autostart", ydVar.g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, ydVar.h, feVar.G1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", ydVar.i, feVar.M1);
            Field<List<h0>> field2 = ydVar.j;
            bpn0 bpn0Var = feVar.l1;
            JsonFieldParser.writeListField(parsingContext, jSONObject, "buffering_actions", field2, bpn0Var);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", ydVar.k);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", ydVar.l, feVar.Q2);
            JsonFieldParser.writeField(parsingContext, jSONObject, "elapsed_time_variable", ydVar.m);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", ydVar.n, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", ydVar.o, feVar.c3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "fatal_actions", ydVar.p, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", ydVar.q, feVar.A3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", ydVar.r, feVar.J3);
            Field<z9> field3 = ydVar.s;
            bpn0 bpn0Var2 = feVar.Z6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field3, bpn0Var2);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", ydVar.t);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", ydVar.u, feVar.N4);
            Field<a4> field4 = ydVar.v;
            bpn0 bpn0Var3 = feVar.Z2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field4, bpn0Var3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "muted", ydVar.w);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", ydVar.x, bpn0Var3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "pause_actions", ydVar.y, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "player_settings_payload", ydVar.z);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", ydVar.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preview", ydVar.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "repeatable", ydVar.C);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "resume_actions", ydVar.D, bpn0Var);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", ydVar.E);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", ydVar.F);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", ydVar.G, DivVideoScale.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", ydVar.H, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", ydVar.I, feVar.W8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", ydVar.J, feVar.Z8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", ydVar.K, feVar.V1);
            Field<i1> field5 = ydVar.L;
            bpn0 bpn0Var4 = feVar.A1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", field5, bpn0Var4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", ydVar.M, bpn0Var4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", ydVar.N, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", ydVar.O, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", ydVar.P, feVar.i9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "video_sources", ydVar.Q, feVar.l9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", ydVar.R, DivVisibility.TO_STRING);
            Field<be> field6 = ydVar.S;
            bpn0 bpn0Var5 = feVar.u9;
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", field6, bpn0Var5);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", ydVar.T, bpn0Var5);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", ydVar.U, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivVideoJsonParser.kt */
    public static final class g implements TemplateResolver<JSONObject, yd, rd> {
        public final fe a;

        public g(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rd resolve(ParsingContext parsingContext, yd ydVar, JSONObject jSONObject) throws ParsingException {
            Field<com.yandex.div2.f> field = ydVar.a;
            fe feVar = this.a;
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "accessibility", feVar.J, feVar.H);
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, ydVar.b, jSONObject, "alignment_horizontal", sd.j, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, ydVar.c, jSONObject, "alignment_vertical", sd.k, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field2 = ydVar.d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            hq hqVar = sd.n;
            Expression<Double> expression = sd.a;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alpha", typeHelper, izsVar, hqVar, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, ydVar.e, jSONObject, "animators", feVar.v1, feVar.t1);
            j1 j1Var = (j1) JsonFieldResolver.resolveOptional(parsingContext, ydVar.f, jSONObject, "aspect", feVar.E1, feVar.C1);
            Field<Expression<Boolean>> field3 = ydVar.g;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = sd.b;
            Expression<Boolean> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "autostart", typeHelper2, izsVar2, expression2);
            Expression<Boolean> expression3 = resolveOptionalExpression4 == null ? expression2 : resolveOptionalExpression4;
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, ydVar.h, jSONObject, L2.g, feVar.H1, feVar.F1);
            u1 u1Var = (u1) JsonFieldResolver.resolveOptional(parsingContext, ydVar.i, jSONObject, "border", feVar.N1, feVar.L1);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, ydVar.j, jSONObject, "buffering_actions", feVar.m1, feVar.k1);
            Field<Expression<Long>> field4 = ydVar.k;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "column_span", typeHelper3, izsVar3, sd.o);
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, ydVar.l, jSONObject, "disappear_actions", feVar.R2, feVar.P2);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, ydVar.m, jSONObject, "elapsed_time_variable");
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, ydVar.n, jSONObject, "end_actions", feVar.m1, feVar.k1);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, ydVar.o, jSONObject, "extensions", feVar.d3, feVar.b3);
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, ydVar.p, jSONObject, "fatal_actions", feVar.m1, feVar.k1);
            jln jlnVar = (jln) JsonFieldResolver.resolveOptional(parsingContext, ydVar.q, jSONObject, "focus", feVar.B3, feVar.z3);
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, ydVar.r, jSONObject, "functions", feVar.K3, feVar.I3);
            v9 v9Var = (v9) JsonFieldResolver.resolveOptional(parsingContext, ydVar.s, jSONObject, "height", feVar.a7, feVar.Y6);
            if (v9Var == null) {
                v9Var = sd.c;
            }
            v9 v9Var2 = v9Var;
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, ydVar.t, jSONObject, "id");
            vmn vmnVar = (vmn) JsonFieldResolver.resolveOptional(parsingContext, ydVar.u, jSONObject, "layout_provider", feVar.O4, feVar.M4);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, ydVar.v, jSONObject, "margins", feVar.a3, feVar.Y2);
            Field<Expression<Boolean>> field5 = ydVar.w;
            Expression<Boolean> expression4 = sd.d;
            Expression<Boolean> resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "muted", typeHelper2, izsVar2, expression4);
            Expression<Boolean> expression5 = resolveOptionalExpression6 == null ? expression4 : resolveOptionalExpression6;
            y3 y3Var2 = (y3) JsonFieldResolver.resolveOptional(parsingContext, ydVar.x, jSONObject, "paddings", feVar.a3, feVar.Y2);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, ydVar.y, jSONObject, "pause_actions", feVar.m1, feVar.k1);
            JSONObject jSONObject2 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, ydVar.z, jSONObject, "player_settings_payload");
            Field<Expression<Boolean>> field6 = ydVar.A;
            Expression<Boolean> expression6 = sd.e;
            Expression<Boolean> resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "preload_required", typeHelper2, izsVar2, expression6);
            Expression<Boolean> expression7 = resolveOptionalExpression7 == null ? expression6 : resolveOptionalExpression7;
            Field<Expression<String>> field7 = ydVar.B;
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "preview", typeHelper4);
            Field<Expression<Boolean>> field8 = ydVar.C;
            Expression<Boolean> expression8 = sd.f;
            Expression<Double> expression9 = expression;
            Expression<Boolean> resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "repeatable", typeHelper2, izsVar2, expression8);
            Expression<Boolean> expression10 = resolveOptionalExpression9 == null ? expression8 : resolveOptionalExpression9;
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, ydVar.D, jSONObject, "resume_actions", feVar.m1, feVar.k1);
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, ydVar.E, jSONObject, "reuse_id", typeHelper4);
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, ydVar.F, jSONObject, "row_span", typeHelper3, izsVar3, sd.p);
            Field<Expression<DivVideoScale>> field9 = ydVar.G;
            TypeHelper<DivVideoScale> typeHelper5 = sd.l;
            izs<String, DivVideoScale> izsVar4 = DivVideoScale.FROM_STRING;
            Expression<DivVideoScale> expression11 = sd.g;
            Expression<DivVideoScale> resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "scale", typeHelper5, izsVar4, expression11);
            Expression<DivVideoScale> expression12 = resolveOptionalExpression12 == null ? expression11 : resolveOptionalExpression12;
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, ydVar.H, jSONObject, "selected_actions", feVar.m1, feVar.k1);
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, ydVar.I, jSONObject, "tooltips", feVar.X8, feVar.V8);
            hd hdVar = (hd) JsonFieldResolver.resolveOptional(parsingContext, ydVar.J, jSONObject, "transform", feVar.a9, feVar.Y8);
            d2 d2Var = (d2) JsonFieldResolver.resolveOptional(parsingContext, ydVar.K, jSONObject, "transition_change", feVar.W1, feVar.U1);
            e1 e1Var = (e1) JsonFieldResolver.resolveOptional(parsingContext, ydVar.L, jSONObject, "transition_in", feVar.B1, feVar.z1);
            e1 e1Var2 = (e1) JsonFieldResolver.resolveOptional(parsingContext, ydVar.M, jSONObject, "transition_out", feVar.B1, feVar.z1);
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, ydVar.N, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, sd.q);
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, ydVar.O, jSONObject, "variable_triggers", feVar.d9, feVar.b9);
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, ydVar.P, jSONObject, "variables", feVar.j9, feVar.h9);
            List resolveList = JsonFieldResolver.resolveList(parsingContext, ydVar.Q, jSONObject, "video_sources", feVar.m9, feVar.k9, sd.r);
            Field<Expression<DivVisibility>> field10 = ydVar.R;
            TypeHelper<DivVisibility> typeHelper6 = sd.m;
            izs<String, DivVisibility> izsVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression13 = sd.h;
            Expression<DivVisibility> resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "visibility", typeHelper6, izsVar5, expression13);
            if (resolveOptionalExpression13 != null) {
                expression13 = resolveOptionalExpression13;
            }
            zd zdVar = (zd) JsonFieldResolver.resolveOptional(parsingContext, ydVar.S, jSONObject, "visibility_action", feVar.v9, feVar.t9);
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, ydVar.T, jSONObject, "visibility_actions", feVar.v9, feVar.t9);
            v9 v9Var3 = (v9) JsonFieldResolver.resolveOptional(parsingContext, ydVar.U, jSONObject, "width", feVar.a7, feVar.Y6);
            if (v9Var3 == null) {
                v9Var3 = sd.i;
            }
            return new rd(divAccessibility, resolveOptionalExpression, resolveOptionalExpression2, expression9, resolveOptionalList, j1Var, expression3, resolveOptionalList2, u1Var, resolveOptionalList3, resolveOptionalExpression5, resolveOptionalList4, str, resolveOptionalList5, resolveOptionalList6, resolveOptionalList7, jlnVar, resolveOptionalList8, v9Var2, str2, vmnVar, y3Var, expression5, y3Var2, resolveOptionalList9, jSONObject2, expression7, resolveOptionalExpression8, expression10, resolveOptionalList10, resolveOptionalExpression10, resolveOptionalExpression11, expression12, resolveOptionalList11, resolveOptionalList12, hdVar, d2Var, e1Var, e1Var2, resolveOptionalList13, resolveOptionalList14, resolveOptionalList15, resolveList, expression13, zdVar, resolveOptionalList16, v9Var3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        b = Expression.Companion.constant$default(companion, bool, null, 2, null);
        c = new v9.c(new krn(null, null, null));
        d = Expression.Companion.constant$default(companion, bool, null, 2, null);
        e = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivVideoScale divVideoScale = DivVideoScale.FIT;
        g = Expression.Companion.constant$default(companion, divVideoScale, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        h = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        i = new v9.b(new w6(null, null, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        j = companion2.from(rl3.L(DivAlignmentHorizontal.values()), a.i);
        k = companion2.from(rl3.L(DivAlignmentVertical.values()), b.i);
        l = companion2.from(divVideoScale, c.i);
        m = companion2.from(divVisibility, d.i);
        n = new hq(12);
        o = new iq(10);
        p = new jq(15);
        q = new kq(14);
        r = new lq(14);
    }
}
