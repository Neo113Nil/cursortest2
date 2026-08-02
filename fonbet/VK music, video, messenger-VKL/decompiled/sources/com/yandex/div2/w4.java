package com.yandex.div2;

import com.ironsource.X3;
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
import com.yandex.div2.DivGallery;
import com.yandex.div2.v9;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.dn;
import xsna.dr;
import xsna.en;
import xsna.er;
import xsna.fr;
import xsna.gr;
import xsna.izs;
import xsna.jln;
import xsna.krn;
import xsna.rl3;
import xsna.vmn;

/* compiled from: DivGalleryJsonParser.kt */
/* loaded from: classes8.dex */
public final class w4 {

    @Deprecated
    public static final Expression<Double> a;

    @Deprecated
    public static final Expression<DivGallery.CrossContentAlignment> b;

    @Deprecated
    public static final Expression<Long> c;

    @Deprecated
    public static final v9.c d;

    @Deprecated
    public static final Expression<Long> e;

    @Deprecated
    public static final Expression<DivGallery.Orientation> f;

    @Deprecated
    public static final Expression<Boolean> g;

    @Deprecated
    public static final Expression<DivGallery.ScrollMode> h;

    @Deprecated
    public static final Expression<DivGallery.Scrollbar> i;

    @Deprecated
    public static final Expression<DivVisibility> j;

    @Deprecated
    public static final v9.b k;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> l;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> m;

    @Deprecated
    public static final TypeHelper<DivGallery.CrossContentAlignment> n;

    @Deprecated
    public static final TypeHelper<DivGallery.Orientation> o;

    @Deprecated
    public static final TypeHelper<DivGallery.ScrollMode> p;

    @Deprecated
    public static final TypeHelper<DivGallery.Scrollbar> q;

    @Deprecated
    public static final TypeHelper<DivVisibility> r;

    @Deprecated
    public static final io.reactivex.rxjava3.internal.operators.observable.n0 s;

    @Deprecated
    public static final dr t;

    @Deprecated
    public static final com.vk.movika.sdk.android.defaultplayer.view.a u;

    @Deprecated
    public static final er v;

    @Deprecated
    public static final fr w;

    @Deprecated
    public static final gr x;

    @Deprecated
    public static final dn y;

    @Deprecated
    public static final en z;

    /* compiled from: DivGalleryJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivGalleryJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivGalleryJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivGallery.CrossContentAlignment);
        }
    }

    /* compiled from: DivGalleryJsonParser.kt */
    public static final class d extends Lambda implements izs<Object, Boolean> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivGallery.Orientation);
        }
    }

    /* compiled from: DivGalleryJsonParser.kt */
    public static final class e extends Lambda implements izs<Object, Boolean> {
        public static final e i = new e(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivGallery.Scrollbar);
        }
    }

    /* compiled from: DivGalleryJsonParser.kt */
    public static final class f extends Lambda implements izs<Object, Boolean> {
        public static final f i = new f(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivGallery.ScrollMode);
        }
    }

    /* compiled from: DivGalleryJsonParser.kt */
    public static final class g extends Lambda implements izs<Object, Boolean> {
        public static final g i = new g(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivGalleryJsonParser.kt */
    public static final class h implements Serializer, Deserializer {
        public final fe a;

        public h(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivGallery deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.H;
            bpn0 bpn0Var2 = feVar.t9;
            bpn0 bpn0Var3 = feVar.z1;
            bpn0 bpn0Var4 = feVar.Y2;
            bpn0 bpn0Var5 = feVar.Y6;
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", bpn0Var);
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", w4.l, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", w4.m, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            io.reactivex.rxjava3.internal.operators.observable.n0 n0Var = w4.s;
            Expression<Double> expression = w4.a;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, izsVar, n0Var, expression);
            Expression<Double> expression2 = readOptionalExpression3 == null ? expression : readOptionalExpression3;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", feVar.t1);
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
            u1 u1Var = (u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_count", typeHelper2, izsVar2, w4.t);
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, izsVar2, w4.u);
            TypeHelper<DivGallery.CrossContentAlignment> typeHelper3 = w4.n;
            izs<String, DivGallery.CrossContentAlignment> izsVar3 = DivGallery.CrossContentAlignment.FROM_STRING;
            Expression<DivGallery.CrossContentAlignment> expression3 = w4.b;
            Expression<DivGallery.CrossContentAlignment> readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "cross_content_alignment", typeHelper3, izsVar3, expression3);
            Expression<DivGallery.CrossContentAlignment> expression4 = readOptionalExpression6 == null ? expression3 : readOptionalExpression6;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "cross_spacing", typeHelper2, izsVar2, w4.v);
            fr frVar = w4.w;
            Expression<Long> expression5 = w4.c;
            Expression<Long> readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "default_item", typeHelper2, izsVar2, frVar, expression5);
            Expression<Long> expression6 = readOptionalExpression8 == null ? expression5 : readOptionalExpression8;
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", feVar.P2);
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", feVar.b3);
            jln jlnVar = (jln) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", feVar.z3);
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", feVar.I3);
            v9 v9Var = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var5);
            if (v9Var == null) {
                v9Var = w4.d;
            }
            v9 v9Var2 = v9Var;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            o2 o2Var = (o2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_builder", feVar.d2);
            gr grVar = w4.x;
            Expression<Long> expression7 = w4.e;
            Expression<Long> readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_spacing", typeHelper2, izsVar2, grVar, expression7);
            if (readOptionalExpression9 != null) {
                expression7 = readOptionalExpression9;
            }
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", feVar.z9);
            vmn vmnVar = (vmn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", feVar.M4);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", bpn0Var4);
            TypeHelper<DivGallery.Orientation> typeHelper4 = w4.o;
            izs<String, DivGallery.Orientation> izsVar4 = DivGallery.Orientation.FROM_STRING;
            Expression<DivGallery.Orientation> expression8 = w4.f;
            Expression<DivGallery.Orientation> readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.i.n, typeHelper4, izsVar4, expression8);
            Expression<DivGallery.Orientation> expression9 = readOptionalExpression10 == null ? expression8 : readOptionalExpression10;
            y3 y3Var2 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", bpn0Var4);
            TypeHelper<Boolean> typeHelper5 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar5 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression10 = w4.g;
            Expression<Boolean> readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "restrict_parent_scroll", typeHelper5, izsVar5, expression10);
            Expression<Boolean> expression11 = readOptionalExpression11 == null ? expression10 : readOptionalExpression11;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, izsVar2, w4.y);
            TypeHelper<DivGallery.ScrollMode> typeHelper6 = w4.p;
            izs<String, DivGallery.ScrollMode> izsVar6 = DivGallery.ScrollMode.FROM_STRING;
            Expression<DivGallery.ScrollMode> expression12 = w4.h;
            Expression<DivGallery.ScrollMode> readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scroll_mode", typeHelper6, izsVar6, expression12);
            Expression<DivGallery.ScrollMode> expression13 = readOptionalExpression14 == null ? expression12 : readOptionalExpression14;
            TypeHelper<DivGallery.Scrollbar> typeHelper7 = w4.q;
            izs<String, DivGallery.Scrollbar> izsVar7 = DivGallery.Scrollbar.FROM_STRING;
            Expression<DivGallery.Scrollbar> expression14 = w4.i;
            Expression<DivGallery.Scrollbar> readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scrollbar", typeHelper7, izsVar7, expression14);
            Expression<DivGallery.Scrollbar> expression15 = readOptionalExpression15 == null ? expression14 : readOptionalExpression15;
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", feVar.k1);
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", feVar.V8);
            hd hdVar = (hd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", feVar.Y8);
            d2 d2Var = (d2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", feVar.U1);
            e1 e1Var = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", bpn0Var3);
            e1 e1Var2 = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", bpn0Var3);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, w4.z);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", feVar.b9);
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", feVar.h9);
            TypeHelper<DivVisibility> typeHelper8 = w4.r;
            izs<String, DivVisibility> izsVar8 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression16 = w4.j;
            Expression<DivVisibility> readOptionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper8, izsVar8, expression16);
            if (readOptionalExpression16 != null) {
                expression16 = readOptionalExpression16;
            }
            zd zdVar = (zd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", bpn0Var2);
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", bpn0Var2);
            v9 v9Var3 = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var5);
            if (v9Var3 == null) {
                v9Var3 = w4.k;
            }
            return new DivGallery(divAccessibility, readOptionalExpression, readOptionalExpression2, expression2, readOptionalList, readOptionalList2, u1Var, readOptionalExpression4, readOptionalExpression5, expression4, readOptionalExpression7, expression6, readOptionalList3, readOptionalList4, jlnVar, readOptionalList5, v9Var2, str, o2Var, expression7, readOptionalList6, vmnVar, y3Var, expression9, y3Var2, expression11, readOptionalExpression12, readOptionalExpression13, expression13, expression15, readOptionalList7, readOptionalList8, hdVar, d2Var, e1Var, e1Var2, readOptionalList9, readOptionalList10, readOptionalList11, expression16, zdVar, readOptionalList12, v9Var3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivGallery divGallery) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAccessibility divAccessibility = divGallery.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divAccessibility, feVar.H);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divGallery.b, DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divGallery.c, DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divGallery.d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divGallery.e, feVar.t1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, divGallery.f, feVar.F1);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divGallery.g, feVar.L1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_count", divGallery.h);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divGallery.i);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "cross_content_alignment", divGallery.j, DivGallery.CrossContentAlignment.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "cross_spacing", divGallery.k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "default_item", divGallery.l);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divGallery.m, feVar.P2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divGallery.n, feVar.b3);
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divGallery.o, feVar.z3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divGallery.p, feVar.I3);
            v9 v9Var = divGallery.q;
            bpn0 bpn0Var = feVar.Y6;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", v9Var, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divGallery.r);
            JsonPropertyParser.write(parsingContext, jSONObject, "item_builder", divGallery.s, feVar.d2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "item_spacing", divGallery.t);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divGallery.u, feVar.z9);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divGallery.v, feVar.M4);
            y3 y3Var = divGallery.w;
            bpn0 bpn0Var2 = feVar.Y2;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, bpn0Var2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.i.n, divGallery.x, DivGallery.Orientation.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divGallery.y, bpn0Var2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "restrict_parent_scroll", divGallery.z);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divGallery.A);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divGallery.B);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scroll_mode", divGallery.C, DivGallery.ScrollMode.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scrollbar", divGallery.D, DivGallery.Scrollbar.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divGallery.E, feVar.k1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divGallery.F, feVar.V8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divGallery.G, feVar.Y8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divGallery.H, feVar.U1);
            e1 e1Var = divGallery.I;
            bpn0 bpn0Var3 = feVar.z1;
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", e1Var, bpn0Var3);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divGallery.J, bpn0Var3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divGallery.K, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gallery");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divGallery.L, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divGallery.M, feVar.h9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divGallery.N, DivVisibility.TO_STRING);
            zd zdVar = divGallery.O;
            bpn0 bpn0Var4 = feVar.t9;
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", zdVar, bpn0Var4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divGallery.P, bpn0Var4);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divGallery.Q, bpn0Var);
            return jSONObject;
        }
    }

    /* compiled from: DivGalleryJsonParser.kt */
    public static final class i implements Serializer, TemplateDeserializer {
        public final fe a;

        public i(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x4 deserialize(ParsingContext parsingContext, x4 x4Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<com.yandex.div2.f> field = x4Var != null ? x4Var.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, feVar.I);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", w4.l, allowPropertyOverride, x4Var != null ? x4Var.b : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", w4.m, allowPropertyOverride, x4Var != null ? x4Var.c : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, x4Var != null ? x4Var.d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, w4.s);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, x4Var != null ? x4Var.e : null, feVar.u1);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, x4Var != null ? x4Var.f : null, feVar.G1);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, x4Var != null ? x4Var.g : null, feVar.M1);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = x4Var != null ? x4Var.h : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new x4(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_count", typeHelper, allowPropertyOverride, field2, izsVar, w4.t), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, x4Var != null ? x4Var.i : null, izsVar, w4.u), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "cross_content_alignment", w4.n, allowPropertyOverride, x4Var != null ? x4Var.j : null, DivGallery.CrossContentAlignment.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "cross_spacing", typeHelper, allowPropertyOverride, x4Var != null ? x4Var.k : null, izsVar, w4.v), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "default_item", typeHelper, allowPropertyOverride, x4Var != null ? x4Var.l : null, izsVar, w4.w), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, x4Var != null ? x4Var.m : null, feVar.Q2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, x4Var != null ? x4Var.n : null, feVar.c3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, x4Var != null ? x4Var.o : null, feVar.A3), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, x4Var != null ? x4Var.p : null, feVar.J3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, x4Var != null ? x4Var.q : null, feVar.Z6), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, x4Var != null ? x4Var.r : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "item_builder", allowPropertyOverride, x4Var != null ? x4Var.s : null, feVar.e2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "item_spacing", typeHelper, allowPropertyOverride, x4Var != null ? x4Var.t : null, izsVar, w4.x), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "items", allowPropertyOverride, x4Var != null ? x4Var.u : null, feVar.A9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, x4Var != null ? x4Var.v : null, feVar.N4), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, x4Var != null ? x4Var.w : null, feVar.Z2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.i.n, w4.o, allowPropertyOverride, x4Var != null ? x4Var.x : null, DivGallery.Orientation.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, x4Var != null ? x4Var.y : null, feVar.Z2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "restrict_parent_scroll", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, x4Var != null ? x4Var.z : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, x4Var != null ? x4Var.A : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, x4Var != null ? x4Var.B : null, izsVar, w4.y), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "scroll_mode", w4.p, allowPropertyOverride, x4Var != null ? x4Var.C : null, DivGallery.ScrollMode.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "scrollbar", w4.q, allowPropertyOverride, x4Var != null ? x4Var.D : null, DivGallery.Scrollbar.FROM_STRING), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, x4Var != null ? x4Var.E : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, x4Var != null ? x4Var.F : null, feVar.W8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, x4Var != null ? x4Var.G : null, feVar.Z8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, x4Var != null ? x4Var.H : null, feVar.V1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, x4Var != null ? x4Var.I : null, feVar.A1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, x4Var != null ? x4Var.J : null, feVar.A1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, x4Var != null ? x4Var.K : null, DivTransitionTrigger.FROM_STRING, w4.z), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, x4Var != null ? x4Var.L : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, x4Var != null ? x4Var.M : null, feVar.i9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility", w4.r, allowPropertyOverride, x4Var != null ? x4Var.N : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, x4Var != null ? x4Var.O : null, feVar.u9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, x4Var != null ? x4Var.P : null, feVar.u9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, x4Var != null ? x4Var.Q : null, feVar.Z6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, x4 x4Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<com.yandex.div2.f> field = x4Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.I);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", x4Var.b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", x4Var.c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", x4Var.d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", x4Var.e, feVar.u1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, x4Var.f, feVar.G1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", x4Var.g, feVar.M1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_count", x4Var.h);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", x4Var.i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "cross_content_alignment", x4Var.j, DivGallery.CrossContentAlignment.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "cross_spacing", x4Var.k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "default_item", x4Var.l);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", x4Var.m, feVar.Q2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", x4Var.n, feVar.c3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", x4Var.o, feVar.A3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", x4Var.p, feVar.J3);
            Field<z9> field2 = x4Var.q;
            bpn0 bpn0Var = feVar.Z6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field2, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", x4Var.r);
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_builder", x4Var.s, feVar.e2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "item_spacing", x4Var.t);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", x4Var.u, feVar.A9);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", x4Var.v, feVar.N4);
            Field<a4> field3 = x4Var.w;
            bpn0 bpn0Var2 = feVar.Z2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field3, bpn0Var2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.i.n, x4Var.x, DivGallery.Orientation.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", x4Var.y, bpn0Var2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "restrict_parent_scroll", x4Var.z);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", x4Var.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", x4Var.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scroll_mode", x4Var.C, DivGallery.ScrollMode.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scrollbar", x4Var.D, DivGallery.Scrollbar.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", x4Var.E, feVar.l1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", x4Var.F, feVar.W8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", x4Var.G, feVar.Z8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", x4Var.H, feVar.V1);
            Field<i1> field4 = x4Var.I;
            bpn0 bpn0Var3 = feVar.A1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", field4, bpn0Var3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", x4Var.J, bpn0Var3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", x4Var.K, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gallery");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", x4Var.L, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", x4Var.M, feVar.i9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", x4Var.N, DivVisibility.TO_STRING);
            Field<be> field5 = x4Var.O;
            bpn0 bpn0Var4 = feVar.u9;
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", field5, bpn0Var4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", x4Var.P, bpn0Var4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", x4Var.Q, bpn0Var);
            return jSONObject;
        }
    }

    /* compiled from: DivGalleryJsonParser.kt */
    public static final class j implements TemplateResolver<JSONObject, x4, DivGallery> {
        public final fe a;

        public j(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivGallery resolve(ParsingContext parsingContext, x4 x4Var, JSONObject jSONObject) throws ParsingException {
            Field<com.yandex.div2.f> field = x4Var.a;
            fe feVar = this.a;
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "accessibility", feVar.J, feVar.H);
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, x4Var.b, jSONObject, "alignment_horizontal", w4.l, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, x4Var.c, jSONObject, "alignment_vertical", w4.m, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field2 = x4Var.d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            io.reactivex.rxjava3.internal.operators.observable.n0 n0Var = w4.s;
            Expression<Double> expression = w4.a;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alpha", typeHelper, izsVar, n0Var, expression);
            Expression<Double> expression2 = resolveOptionalExpression3 == null ? expression : resolveOptionalExpression3;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, x4Var.e, jSONObject, "animators", feVar.v1, feVar.t1);
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, x4Var.f, jSONObject, L2.g, feVar.H1, feVar.F1);
            u1 u1Var = (u1) JsonFieldResolver.resolveOptional(parsingContext, x4Var.g, jSONObject, "border", feVar.N1, feVar.L1);
            Field<Expression<Long>> field3 = x4Var.h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "column_count", typeHelper2, izsVar2, w4.t);
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, x4Var.i, jSONObject, "column_span", typeHelper2, izsVar2, w4.u);
            Field<Expression<DivGallery.CrossContentAlignment>> field4 = x4Var.j;
            TypeHelper<DivGallery.CrossContentAlignment> typeHelper3 = w4.n;
            izs<String, DivGallery.CrossContentAlignment> izsVar3 = DivGallery.CrossContentAlignment.FROM_STRING;
            Expression<DivGallery.CrossContentAlignment> expression3 = w4.b;
            Expression<DivGallery.CrossContentAlignment> resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "cross_content_alignment", typeHelper3, izsVar3, expression3);
            Expression<DivGallery.CrossContentAlignment> expression4 = resolveOptionalExpression6 == null ? expression3 : resolveOptionalExpression6;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, x4Var.k, jSONObject, "cross_spacing", typeHelper2, izsVar2, w4.v);
            Field<Expression<Long>> field5 = x4Var.l;
            fr frVar = w4.w;
            Expression<Long> expression5 = w4.c;
            Expression<Long> resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "default_item", typeHelper2, izsVar2, frVar, expression5);
            Expression<Long> expression6 = resolveOptionalExpression8 == null ? expression5 : resolveOptionalExpression8;
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, x4Var.m, jSONObject, "disappear_actions", feVar.R2, feVar.P2);
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, x4Var.n, jSONObject, "extensions", feVar.d3, feVar.b3);
            jln jlnVar = (jln) JsonFieldResolver.resolveOptional(parsingContext, x4Var.o, jSONObject, "focus", feVar.B3, feVar.z3);
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, x4Var.p, jSONObject, "functions", feVar.K3, feVar.I3);
            v9 v9Var = (v9) JsonFieldResolver.resolveOptional(parsingContext, x4Var.q, jSONObject, "height", feVar.a7, feVar.Y6);
            if (v9Var == null) {
                v9Var = w4.d;
            }
            v9 v9Var2 = v9Var;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, x4Var.r, jSONObject, "id");
            o2 o2Var = (o2) JsonFieldResolver.resolveOptional(parsingContext, x4Var.s, jSONObject, "item_builder", feVar.f2, feVar.d2);
            Field<Expression<Long>> field6 = x4Var.t;
            gr grVar = w4.x;
            Expression<Long> expression7 = w4.e;
            Expression<Long> resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "item_spacing", typeHelper2, izsVar2, grVar, expression7);
            if (resolveOptionalExpression9 != null) {
                expression7 = resolveOptionalExpression9;
            }
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, x4Var.u, jSONObject, "items", feVar.B9, feVar.z9);
            vmn vmnVar = (vmn) JsonFieldResolver.resolveOptional(parsingContext, x4Var.v, jSONObject, "layout_provider", feVar.O4, feVar.M4);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, x4Var.w, jSONObject, "margins", feVar.a3, feVar.Y2);
            Field<Expression<DivGallery.Orientation>> field7 = x4Var.x;
            TypeHelper<DivGallery.Orientation> typeHelper4 = w4.o;
            izs<String, DivGallery.Orientation> izsVar4 = DivGallery.Orientation.FROM_STRING;
            Expression<DivGallery.Orientation> expression8 = w4.f;
            Expression<DivGallery.Orientation> resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, X3.i.n, typeHelper4, izsVar4, expression8);
            Expression<DivGallery.Orientation> expression9 = resolveOptionalExpression10 == null ? expression8 : resolveOptionalExpression10;
            y3 y3Var2 = (y3) JsonFieldResolver.resolveOptional(parsingContext, x4Var.y, jSONObject, "paddings", feVar.a3, feVar.Y2);
            Field<Expression<Boolean>> field8 = x4Var.z;
            TypeHelper<Boolean> typeHelper5 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar5 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression10 = w4.g;
            Expression<Boolean> resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "restrict_parent_scroll", typeHelper5, izsVar5, expression10);
            Expression<Boolean> expression11 = resolveOptionalExpression11 == null ? expression10 : resolveOptionalExpression11;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, x4Var.A, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, x4Var.B, jSONObject, "row_span", typeHelper2, izsVar2, w4.y);
            Field<Expression<DivGallery.ScrollMode>> field9 = x4Var.C;
            TypeHelper<DivGallery.ScrollMode> typeHelper6 = w4.p;
            izs<String, DivGallery.ScrollMode> izsVar6 = DivGallery.ScrollMode.FROM_STRING;
            Expression<DivGallery.ScrollMode> expression12 = w4.h;
            Expression<DivGallery.ScrollMode> resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "scroll_mode", typeHelper6, izsVar6, expression12);
            Expression<DivGallery.ScrollMode> expression13 = resolveOptionalExpression14 == null ? expression12 : resolveOptionalExpression14;
            Field<Expression<DivGallery.Scrollbar>> field10 = x4Var.D;
            TypeHelper<DivGallery.Scrollbar> typeHelper7 = w4.q;
            izs<String, DivGallery.Scrollbar> izsVar7 = DivGallery.Scrollbar.FROM_STRING;
            Expression<DivGallery.Scrollbar> expression14 = w4.i;
            Expression<DivGallery.Scrollbar> resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "scrollbar", typeHelper7, izsVar7, expression14);
            Expression<DivGallery.Scrollbar> expression15 = resolveOptionalExpression15 == null ? expression14 : resolveOptionalExpression15;
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, x4Var.E, jSONObject, "selected_actions", feVar.m1, feVar.k1);
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, x4Var.F, jSONObject, "tooltips", feVar.X8, feVar.V8);
            hd hdVar = (hd) JsonFieldResolver.resolveOptional(parsingContext, x4Var.G, jSONObject, "transform", feVar.a9, feVar.Y8);
            d2 d2Var = (d2) JsonFieldResolver.resolveOptional(parsingContext, x4Var.H, jSONObject, "transition_change", feVar.W1, feVar.U1);
            e1 e1Var = (e1) JsonFieldResolver.resolveOptional(parsingContext, x4Var.I, jSONObject, "transition_in", feVar.B1, feVar.z1);
            e1 e1Var2 = (e1) JsonFieldResolver.resolveOptional(parsingContext, x4Var.J, jSONObject, "transition_out", feVar.B1, feVar.z1);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, x4Var.K, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, w4.z);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, x4Var.L, jSONObject, "variable_triggers", feVar.d9, feVar.b9);
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, x4Var.M, jSONObject, "variables", feVar.j9, feVar.h9);
            Field<Expression<DivVisibility>> field11 = x4Var.N;
            TypeHelper<DivVisibility> typeHelper8 = w4.r;
            izs<String, DivVisibility> izsVar8 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression16 = w4.j;
            Expression<DivVisibility> resolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "visibility", typeHelper8, izsVar8, expression16);
            if (resolveOptionalExpression16 != null) {
                expression16 = resolveOptionalExpression16;
            }
            zd zdVar = (zd) JsonFieldResolver.resolveOptional(parsingContext, x4Var.O, jSONObject, "visibility_action", feVar.v9, feVar.t9);
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, x4Var.P, jSONObject, "visibility_actions", feVar.v9, feVar.t9);
            v9 v9Var3 = (v9) JsonFieldResolver.resolveOptional(parsingContext, x4Var.Q, jSONObject, "width", feVar.a7, feVar.Y6);
            if (v9Var3 == null) {
                v9Var3 = w4.k;
            }
            return new DivGallery(divAccessibility, resolveOptionalExpression, resolveOptionalExpression2, expression2, resolveOptionalList, resolveOptionalList2, u1Var, resolveOptionalExpression4, resolveOptionalExpression5, expression4, resolveOptionalExpression7, expression6, resolveOptionalList3, resolveOptionalList4, jlnVar, resolveOptionalList5, v9Var2, str, o2Var, expression7, resolveOptionalList6, vmnVar, y3Var, expression9, y3Var2, expression11, resolveOptionalExpression12, resolveOptionalExpression13, expression13, expression15, resolveOptionalList7, resolveOptionalList8, hdVar, d2Var, e1Var, e1Var2, resolveOptionalList9, resolveOptionalList10, resolveOptionalList11, expression16, zdVar, resolveOptionalList12, v9Var3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        DivGallery.CrossContentAlignment crossContentAlignment = DivGallery.CrossContentAlignment.START;
        b = Expression.Companion.constant$default(companion, crossContentAlignment, null, 2, null);
        c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        d = new v9.c(new krn(null, null, null));
        e = Expression.Companion.constant$default(companion, 8L, null, 2, null);
        DivGallery.Orientation orientation = DivGallery.Orientation.HORIZONTAL;
        f = Expression.Companion.constant$default(companion, orientation, null, 2, null);
        g = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivGallery.ScrollMode scrollMode = DivGallery.ScrollMode.DEFAULT;
        h = Expression.Companion.constant$default(companion, scrollMode, null, 2, null);
        DivGallery.Scrollbar scrollbar = DivGallery.Scrollbar.NONE;
        i = Expression.Companion.constant$default(companion, scrollbar, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        j = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        k = new v9.b(new w6(null, null, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        l = companion2.from(rl3.L(DivAlignmentHorizontal.values()), a.i);
        m = companion2.from(rl3.L(DivAlignmentVertical.values()), b.i);
        n = companion2.from(crossContentAlignment, c.i);
        o = companion2.from(orientation, d.i);
        p = companion2.from(scrollMode, f.i);
        q = companion2.from(scrollbar, e.i);
        r = companion2.from(divVisibility, g.i);
        s = new io.reactivex.rxjava3.internal.operators.observable.n0(18);
        t = new dr(13);
        int i2 = 14;
        u = new com.vk.movika.sdk.android.defaultplayer.view.a(i2);
        v = new er(i2);
        w = new fr(15);
        x = new gr(12);
        y = new dn(13);
        z = new en(17);
    }
}
