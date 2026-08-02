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
import xsna.krn;
import xsna.or;
import xsna.pr;
import xsna.qr;
import xsna.rl3;
import xsna.rr;
import xsna.vmn;

/* compiled from: DivSwitchJsonParser.kt */
/* loaded from: classes8.dex */
public final class eb {

    @Deprecated
    public static final Expression<Double> a;

    @Deprecated
    public static final v9.c b;

    @Deprecated
    public static final Expression<Boolean> c;

    @Deprecated
    public static final Expression<DivVisibility> d;

    @Deprecated
    public static final v9.b e;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> g;

    @Deprecated
    public static final TypeHelper<DivVisibility> h;

    @Deprecated
    public static final or i;

    @Deprecated
    public static final pr j;

    @Deprecated
    public static final qr k;

    @Deprecated
    public static final rr l;

    /* compiled from: DivSwitchJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivSwitchJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivSwitchJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivSwitchJsonParser.kt */
    public static final class d implements Serializer, Deserializer {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final db deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.H;
            bpn0 bpn0Var2 = feVar.t9;
            bpn0 bpn0Var3 = feVar.z1;
            bpn0 bpn0Var4 = feVar.Y2;
            bpn0 bpn0Var5 = feVar.Y6;
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", bpn0Var);
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", eb.f, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", eb.g, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            or orVar = eb.i;
            Expression<Double> expression = eb.a;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, izsVar, orVar, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", feVar.t1);
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
            u1 u1Var = (u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, izsVar2, eb.j);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", feVar.P2);
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", feVar.b3);
            jln jlnVar = (jln) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", feVar.z3);
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", feVar.I3);
            v9 v9Var = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var5);
            if (v9Var == null) {
                v9Var = eb.b;
            }
            v9 v9Var2 = v9Var;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = eb.c;
            Expression<Boolean> readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper3, izsVar3, expression2);
            Expression<Boolean> expression3 = readOptionalExpression5 == null ? expression2 : readOptionalExpression5;
            String str2 = (String) JsonPropertyParser.read(parsingContext, jSONObject, "is_on_variable");
            vmn vmnVar = (vmn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", feVar.M4);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", bpn0Var4);
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            y3 y3Var2 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", bpn0Var4);
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, izsVar2, eb.k);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", feVar.k1);
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", feVar.V8);
            hd hdVar = (hd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", feVar.Y8);
            d2 d2Var = (d2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", feVar.U1);
            e1 e1Var = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", bpn0Var3);
            e1 e1Var2 = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", bpn0Var3);
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, eb.l);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", feVar.b9);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", feVar.h9);
            TypeHelper<DivVisibility> typeHelper4 = eb.h;
            izs<String, DivVisibility> izsVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression4 = eb.d;
            Expression<DivVisibility> readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper4, izsVar4, expression4);
            if (readOptionalExpression9 != null) {
                expression4 = readOptionalExpression9;
            }
            zd zdVar = (zd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", bpn0Var2);
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", bpn0Var2);
            v9 v9Var3 = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var5);
            if (v9Var3 == null) {
                v9Var3 = eb.e;
            }
            return new db(divAccessibility, readOptionalExpression, readOptionalExpression2, expression, readOptionalList, readOptionalList2, u1Var, readOptionalExpression4, readOptionalList3, readOptionalList4, jlnVar, readOptionalList5, v9Var2, str, expression3, str2, vmnVar, y3Var, readOptionalExpression6, y3Var2, readOptionalExpression7, readOptionalExpression8, readOptionalList6, readOptionalList7, hdVar, d2Var, e1Var, e1Var2, readOptionalList8, readOptionalList9, readOptionalList10, expression4, zdVar, readOptionalList11, v9Var3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, db dbVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAccessibility divAccessibility = dbVar.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divAccessibility, feVar.H);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", dbVar.b, DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", dbVar.c, DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", dbVar.d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", dbVar.e, feVar.t1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, dbVar.f, feVar.F1);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", dbVar.g, feVar.L1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", dbVar.h);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", dbVar.i, feVar.P2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", dbVar.j, feVar.b3);
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", dbVar.k, feVar.z3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", dbVar.l, feVar.I3);
            v9 v9Var = dbVar.m;
            bpn0 bpn0Var = feVar.Y6;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", v9Var, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", dbVar.n);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", dbVar.o);
            JsonPropertyParser.write(parsingContext, jSONObject, "is_on_variable", dbVar.p);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", dbVar.q, feVar.M4);
            y3 y3Var = dbVar.r;
            bpn0 bpn0Var2 = feVar.Y2;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, bpn0Var2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "on_color", dbVar.s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", dbVar.t, bpn0Var2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", dbVar.u);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", dbVar.v);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", dbVar.w, feVar.k1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", dbVar.x, feVar.V8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", dbVar.y, feVar.Y8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", dbVar.z, feVar.U1);
            e1 e1Var = dbVar.A;
            bpn0 bpn0Var3 = feVar.z1;
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", e1Var, bpn0Var3);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", dbVar.B, bpn0Var3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", dbVar.C, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "switch");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", dbVar.D, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", dbVar.E, feVar.h9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", dbVar.F, DivVisibility.TO_STRING);
            zd zdVar = dbVar.G;
            bpn0 bpn0Var4 = feVar.t9;
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", zdVar, bpn0Var4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", dbVar.H, bpn0Var4);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", dbVar.I, bpn0Var);
            return jSONObject;
        }
    }

    /* compiled from: DivSwitchJsonParser.kt */
    public static final class e implements Serializer, TemplateDeserializer {
        public final fe a;

        public e(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fb deserialize(ParsingContext parsingContext, fb fbVar, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<com.yandex.div2.f> field = fbVar != null ? fbVar.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, feVar.I);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", eb.f, allowPropertyOverride, fbVar != null ? fbVar.b : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", eb.g, allowPropertyOverride, fbVar != null ? fbVar.c : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, fbVar != null ? fbVar.d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, eb.i);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, fbVar != null ? fbVar.e : null, feVar.u1);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, fbVar != null ? fbVar.f : null, feVar.G1);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, fbVar != null ? fbVar.g : null, feVar.M1);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = fbVar != null ? fbVar.h : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new fb(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field2, izsVar, eb.j), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, fbVar != null ? fbVar.i : null, feVar.Q2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, fbVar != null ? fbVar.j : null, feVar.c3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, fbVar != null ? fbVar.k : null, feVar.A3), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, fbVar != null ? fbVar.l : null, feVar.J3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, fbVar != null ? fbVar.m : null, feVar.Z6), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, fbVar != null ? fbVar.n : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, fbVar != null ? fbVar.o : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "is_on_variable", allowPropertyOverride, fbVar != null ? fbVar.p : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, fbVar != null ? fbVar.q : null, feVar.N4), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, fbVar != null ? fbVar.r : null, feVar.Z2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, fbVar != null ? fbVar.s : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, fbVar != null ? fbVar.t : null, feVar.Z2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, fbVar != null ? fbVar.u : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, fbVar != null ? fbVar.v : null, izsVar, eb.k), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, fbVar != null ? fbVar.w : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, fbVar != null ? fbVar.x : null, feVar.W8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, fbVar != null ? fbVar.y : null, feVar.Z8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, fbVar != null ? fbVar.z : null, feVar.V1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, fbVar != null ? fbVar.A : null, feVar.A1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, fbVar != null ? fbVar.B : null, feVar.A1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, fbVar != null ? fbVar.C : null, DivTransitionTrigger.FROM_STRING, eb.l), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, fbVar != null ? fbVar.D : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, fbVar != null ? fbVar.E : null, feVar.i9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility", eb.h, allowPropertyOverride, fbVar != null ? fbVar.F : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, fbVar != null ? fbVar.G : null, feVar.u9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, fbVar != null ? fbVar.H : null, feVar.u9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, fbVar != null ? fbVar.I : null, feVar.Z6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, fb fbVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<com.yandex.div2.f> field = fbVar.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.I);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", fbVar.b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", fbVar.c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", fbVar.d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", fbVar.e, feVar.u1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, fbVar.f, feVar.G1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", fbVar.g, feVar.M1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", fbVar.h);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", fbVar.i, feVar.Q2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", fbVar.j, feVar.c3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", fbVar.k, feVar.A3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", fbVar.l, feVar.J3);
            Field<z9> field2 = fbVar.m;
            bpn0 bpn0Var = feVar.Z6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field2, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", fbVar.n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", fbVar.o);
            JsonFieldParser.writeField(parsingContext, jSONObject, "is_on_variable", fbVar.p);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", fbVar.q, feVar.N4);
            Field<a4> field3 = fbVar.r;
            bpn0 bpn0Var2 = feVar.Z2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field3, bpn0Var2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "on_color", fbVar.s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", fbVar.t, bpn0Var2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", fbVar.u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", fbVar.v);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", fbVar.w, feVar.l1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", fbVar.x, feVar.W8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", fbVar.y, feVar.Z8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", fbVar.z, feVar.V1);
            Field<i1> field4 = fbVar.A;
            bpn0 bpn0Var3 = feVar.A1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", field4, bpn0Var3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", fbVar.B, bpn0Var3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", fbVar.C, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "switch");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", fbVar.D, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", fbVar.E, feVar.i9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", fbVar.F, DivVisibility.TO_STRING);
            Field<be> field5 = fbVar.G;
            bpn0 bpn0Var4 = feVar.u9;
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", field5, bpn0Var4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", fbVar.H, bpn0Var4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", fbVar.I, bpn0Var);
            return jSONObject;
        }
    }

    /* compiled from: DivSwitchJsonParser.kt */
    public static final class f implements TemplateResolver<JSONObject, fb, db> {
        public final fe a;

        public f(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final db resolve(ParsingContext parsingContext, fb fbVar, JSONObject jSONObject) throws ParsingException {
            Field<com.yandex.div2.f> field = fbVar.a;
            fe feVar = this.a;
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "accessibility", feVar.J, feVar.H);
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, fbVar.b, jSONObject, "alignment_horizontal", eb.f, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, fbVar.c, jSONObject, "alignment_vertical", eb.g, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field2 = fbVar.d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            or orVar = eb.i;
            Expression<Double> expression = eb.a;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alpha", typeHelper, izsVar, orVar, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, fbVar.e, jSONObject, "animators", feVar.v1, feVar.t1);
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, fbVar.f, jSONObject, L2.g, feVar.H1, feVar.F1);
            u1 u1Var = (u1) JsonFieldResolver.resolveOptional(parsingContext, fbVar.g, jSONObject, "border", feVar.N1, feVar.L1);
            Field<Expression<Long>> field3 = fbVar.h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "column_span", typeHelper2, izsVar2, eb.j);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, fbVar.i, jSONObject, "disappear_actions", feVar.R2, feVar.P2);
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, fbVar.j, jSONObject, "extensions", feVar.d3, feVar.b3);
            jln jlnVar = (jln) JsonFieldResolver.resolveOptional(parsingContext, fbVar.k, jSONObject, "focus", feVar.B3, feVar.z3);
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, fbVar.l, jSONObject, "functions", feVar.K3, feVar.I3);
            v9 v9Var = (v9) JsonFieldResolver.resolveOptional(parsingContext, fbVar.m, jSONObject, "height", feVar.a7, feVar.Y6);
            if (v9Var == null) {
                v9Var = eb.b;
            }
            v9 v9Var2 = v9Var;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, fbVar.n, jSONObject, "id");
            Field<Expression<Boolean>> field4 = fbVar.o;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = eb.c;
            Expression<Boolean> resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "is_enabled", typeHelper3, izsVar3, expression2);
            Expression<Boolean> expression3 = resolveOptionalExpression5 == null ? expression2 : resolveOptionalExpression5;
            String str2 = (String) JsonFieldResolver.resolve(parsingContext, fbVar.p, jSONObject, "is_on_variable");
            vmn vmnVar = (vmn) JsonFieldResolver.resolveOptional(parsingContext, fbVar.q, jSONObject, "layout_provider", feVar.O4, feVar.M4);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, fbVar.r, jSONObject, "margins", feVar.a3, feVar.Y2);
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, fbVar.s, jSONObject, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            y3 y3Var2 = (y3) JsonFieldResolver.resolveOptional(parsingContext, fbVar.t, jSONObject, "paddings", feVar.a3, feVar.Y2);
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, fbVar.u, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, fbVar.v, jSONObject, "row_span", typeHelper2, izsVar2, eb.k);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, fbVar.w, jSONObject, "selected_actions", feVar.m1, feVar.k1);
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, fbVar.x, jSONObject, "tooltips", feVar.X8, feVar.V8);
            hd hdVar = (hd) JsonFieldResolver.resolveOptional(parsingContext, fbVar.y, jSONObject, "transform", feVar.a9, feVar.Y8);
            d2 d2Var = (d2) JsonFieldResolver.resolveOptional(parsingContext, fbVar.z, jSONObject, "transition_change", feVar.W1, feVar.U1);
            e1 e1Var = (e1) JsonFieldResolver.resolveOptional(parsingContext, fbVar.A, jSONObject, "transition_in", feVar.B1, feVar.z1);
            e1 e1Var2 = (e1) JsonFieldResolver.resolveOptional(parsingContext, fbVar.B, jSONObject, "transition_out", feVar.B1, feVar.z1);
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, fbVar.C, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, eb.l);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, fbVar.D, jSONObject, "variable_triggers", feVar.d9, feVar.b9);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, fbVar.E, jSONObject, "variables", feVar.j9, feVar.h9);
            Field<Expression<DivVisibility>> field5 = fbVar.F;
            TypeHelper<DivVisibility> typeHelper4 = eb.h;
            izs<String, DivVisibility> izsVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression4 = eb.d;
            Expression<DivVisibility> resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "visibility", typeHelper4, izsVar4, expression4);
            if (resolveOptionalExpression9 != null) {
                expression4 = resolveOptionalExpression9;
            }
            zd zdVar = (zd) JsonFieldResolver.resolveOptional(parsingContext, fbVar.G, jSONObject, "visibility_action", feVar.v9, feVar.t9);
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, fbVar.H, jSONObject, "visibility_actions", feVar.v9, feVar.t9);
            v9 v9Var3 = (v9) JsonFieldResolver.resolveOptional(parsingContext, fbVar.I, jSONObject, "width", feVar.a7, feVar.Y6);
            if (v9Var3 == null) {
                v9Var3 = eb.e;
            }
            return new db(divAccessibility, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList, resolveOptionalList2, u1Var, resolveOptionalExpression4, resolveOptionalList3, resolveOptionalList4, jlnVar, resolveOptionalList5, v9Var2, str, expression3, str2, vmnVar, y3Var, resolveOptionalExpression6, y3Var2, resolveOptionalExpression7, resolveOptionalExpression8, resolveOptionalList6, resolveOptionalList7, hdVar, d2Var, e1Var, e1Var2, resolveOptionalList8, resolveOptionalList9, resolveOptionalList10, expression4, zdVar, resolveOptionalList11, v9Var3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        b = new v9.c(new krn(null, null, null));
        c = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        d = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        e = new v9.b(new w6(null, null, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f = companion2.from(rl3.L(DivAlignmentHorizontal.values()), a.i);
        g = companion2.from(rl3.L(DivAlignmentVertical.values()), b.i);
        h = companion2.from(divVisibility, c.i);
        i = new or(10);
        j = new pr(14);
        k = new qr(13);
        l = new rr(14);
    }
}
