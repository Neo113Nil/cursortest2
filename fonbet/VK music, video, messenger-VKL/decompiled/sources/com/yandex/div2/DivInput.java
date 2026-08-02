package com.yandex.div2;

import com.unity3d.ads.BuildConfig;
import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.b6;
import com.yandex.div2.m4;
import com.yandex.div2.r5;
import com.yandex.div2.s5;
import com.yandex.div2.v9;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.bmn;
import xsna.cmn;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.ikn;
import xsna.izs;
import xsna.jln;
import xsna.kkn;
import xsna.kmn;
import xsna.krn;
import xsna.qmn;
import xsna.vmn;
import xsna.zkn;
import xsna.znn;

/* compiled from: DivInput.kt */
/* loaded from: classes8.dex */
public final class DivInput implements JSONSerializable, Hashable, ikn {
    public final String A;
    public final Expression<Boolean> B;
    public final Expression<KeyboardType> C;
    public final vmn D;
    public final Expression<Double> E;
    public final Expression<Long> F;
    public final y3 G;
    public final s5 H;
    public final Expression<Long> I;
    public final Expression<Long> J;
    public final a K;
    public final y3 L;
    public final Expression<String> M;
    public final Expression<Long> N;
    public final Expression<Boolean> O;
    public final List<DivAction> P;
    public final Expression<DivAlignmentHorizontal> Q;
    public final Expression<DivAlignmentVertical> R;
    public final Expression<Integer> S;
    public final String T;
    public final List<DivTooltip> U;
    public final hd V;
    public final d2 W;
    public final e1 X;
    public final e1 Y;
    public final List<DivTransitionTrigger> Z;
    public final DivAccessibility a;
    public final List<b6> a0;
    public final Expression<DivAlignmentHorizontal> b;
    public final List<DivTrigger> b0;
    public final Expression<DivAlignmentVertical> c;
    public final List<md> c0;
    public final Expression<Double> d;
    public final Expression<DivVisibility> d0;
    public final List<w0> e;
    public final zd e0;
    public final Expression<Autocapitalization> f;
    public final List<zd> f0;
    public final List<m1> g;
    public final v9 g0;
    public final u1 h;
    public Integer h0;
    public final Expression<Long> i;
    public final List<v3> j;
    public final List<DivAction> k;
    public final Expression<EnterKeyType> l;
    public final List<zkn> m;
    public final List<bmn> n;
    public final jln o;
    public final Expression<String> p;
    public final Expression<Long> q;
    public final Expression<DivSizeUnit> r;
    public final Expression<JSONObject> s;
    public final Expression<DivFontWeight> t;
    public final Expression<Long> u;
    public final List<t4> v;
    public final v9 w;
    public final Expression<Integer> x;
    public final Expression<Integer> y;
    public final Expression<String> z;

    /* compiled from: DivInput.kt */
    public enum Autocapitalization {
        AUTO("auto"),
        NONE("none"),
        WORDS("words"),
        SENTENCES("sentences"),
        ALL_CHARACTERS("all_characters");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Autocapitalization, String> TO_STRING = b.i;
        public static final izs<String, Autocapitalization> FROM_STRING = a.i;

        /* compiled from: DivInput.kt */
        public static final class a extends Lambda implements izs<String, Autocapitalization> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Autocapitalization invoke(String str) {
                String str2 = str;
                Autocapitalization.Converter.getClass();
                Autocapitalization autocapitalization = Autocapitalization.AUTO;
                if (epx.f(str2, autocapitalization.value)) {
                    return autocapitalization;
                }
                Autocapitalization autocapitalization2 = Autocapitalization.NONE;
                if (epx.f(str2, autocapitalization2.value)) {
                    return autocapitalization2;
                }
                Autocapitalization autocapitalization3 = Autocapitalization.WORDS;
                if (epx.f(str2, autocapitalization3.value)) {
                    return autocapitalization3;
                }
                Autocapitalization autocapitalization4 = Autocapitalization.SENTENCES;
                if (epx.f(str2, autocapitalization4.value)) {
                    return autocapitalization4;
                }
                Autocapitalization autocapitalization5 = Autocapitalization.ALL_CHARACTERS;
                if (epx.f(str2, autocapitalization5.value)) {
                    return autocapitalization5;
                }
                return null;
            }
        }

        /* compiled from: DivInput.kt */
        public static final class b extends Lambda implements izs<Autocapitalization, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Autocapitalization autocapitalization) {
                Autocapitalization.Converter.getClass();
                return autocapitalization.value;
            }
        }

        /* compiled from: DivInput.kt */
        public static final class c {
        }

        Autocapitalization(String str) {
            this.value = str;
        }
    }

    /* compiled from: DivInput.kt */
    public enum EnterKeyType {
        DEFAULT(BuildConfig.FLAVOR),
        GO("go"),
        SEARCH("search"),
        SEND("send"),
        DONE("done");

        private final String value;
        public static final c Converter = new c();
        public static final izs<EnterKeyType, String> TO_STRING = b.i;
        public static final izs<String, EnterKeyType> FROM_STRING = a.i;

        /* compiled from: DivInput.kt */
        public static final class a extends Lambda implements izs<String, EnterKeyType> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final EnterKeyType invoke(String str) {
                String str2 = str;
                EnterKeyType.Converter.getClass();
                EnterKeyType enterKeyType = EnterKeyType.DEFAULT;
                if (epx.f(str2, enterKeyType.value)) {
                    return enterKeyType;
                }
                EnterKeyType enterKeyType2 = EnterKeyType.GO;
                if (epx.f(str2, enterKeyType2.value)) {
                    return enterKeyType2;
                }
                EnterKeyType enterKeyType3 = EnterKeyType.SEARCH;
                if (epx.f(str2, enterKeyType3.value)) {
                    return enterKeyType3;
                }
                EnterKeyType enterKeyType4 = EnterKeyType.SEND;
                if (epx.f(str2, enterKeyType4.value)) {
                    return enterKeyType4;
                }
                EnterKeyType enterKeyType5 = EnterKeyType.DONE;
                if (epx.f(str2, enterKeyType5.value)) {
                    return enterKeyType5;
                }
                return null;
            }
        }

        /* compiled from: DivInput.kt */
        public static final class b extends Lambda implements izs<EnterKeyType, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(EnterKeyType enterKeyType) {
                EnterKeyType.Converter.getClass();
                return enterKeyType.value;
            }
        }

        /* compiled from: DivInput.kt */
        public static final class c {
        }

        EnterKeyType(String str) {
            this.value = str;
        }
    }

    /* compiled from: DivInput.kt */
    public enum KeyboardType {
        SINGLE_LINE_TEXT("single_line_text"),
        MULTI_LINE_TEXT("multi_line_text"),
        PHONE("phone"),
        NUMBER("number"),
        EMAIL("email"),
        URI("uri"),
        PASSWORD(LoginApiConstants.PARAM_NAME_PASSWORD);

        private final String value;
        public static final c Converter = new c();
        public static final izs<KeyboardType, String> TO_STRING = b.i;
        public static final izs<String, KeyboardType> FROM_STRING = a.i;

        /* compiled from: DivInput.kt */
        public static final class a extends Lambda implements izs<String, KeyboardType> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final KeyboardType invoke(String str) {
                String str2 = str;
                KeyboardType.Converter.getClass();
                KeyboardType keyboardType = KeyboardType.SINGLE_LINE_TEXT;
                if (epx.f(str2, keyboardType.value)) {
                    return keyboardType;
                }
                KeyboardType keyboardType2 = KeyboardType.MULTI_LINE_TEXT;
                if (epx.f(str2, keyboardType2.value)) {
                    return keyboardType2;
                }
                KeyboardType keyboardType3 = KeyboardType.PHONE;
                if (epx.f(str2, keyboardType3.value)) {
                    return keyboardType3;
                }
                KeyboardType keyboardType4 = KeyboardType.NUMBER;
                if (epx.f(str2, keyboardType4.value)) {
                    return keyboardType4;
                }
                KeyboardType keyboardType5 = KeyboardType.EMAIL;
                if (epx.f(str2, keyboardType5.value)) {
                    return keyboardType5;
                }
                KeyboardType keyboardType6 = KeyboardType.URI;
                if (epx.f(str2, keyboardType6.value)) {
                    return keyboardType6;
                }
                KeyboardType keyboardType7 = KeyboardType.PASSWORD;
                if (epx.f(str2, keyboardType7.value)) {
                    return keyboardType7;
                }
                return null;
            }
        }

        /* compiled from: DivInput.kt */
        public static final class b extends Lambda implements izs<KeyboardType, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(KeyboardType keyboardType) {
                KeyboardType.Converter.getClass();
                return keyboardType.value;
            }
        }

        /* compiled from: DivInput.kt */
        public static final class c {
        }

        KeyboardType(String str) {
            this.value = str;
        }
    }

    /* compiled from: DivInput.kt */
    public static final class a implements JSONSerializable, Hashable {
        public final Expression<Integer> a;
        public Integer b;

        public a(Expression<Integer> expression) {
            this.a = expression;
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.b;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = this.a.hashCode() + fpf0.a(a.class).hashCode();
            this.b = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            x5 x5Var = (x5) BuiltInParserKt.getBuiltInParserComponent().J4.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            x5Var.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "color", this.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            return jSONObject;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Expression.Companion.constant$default(companion, Autocapitalization.AUTO, null, 2, null);
        Expression.Companion.constant$default(companion, EnterKeyType.DEFAULT, null, 2, null);
        Expression.Companion.constant$default(companion, 12L, null, 2, null);
        Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, KeyboardType.MULTI_LINE_TEXT, null, 2, null);
        Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivInput(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends w0> list, Expression<Autocapitalization> expression4, List<? extends m1> list2, u1 u1Var, Expression<Long> expression5, List<v3> list3, List<DivAction> list4, Expression<EnterKeyType> expression6, List<zkn> list5, List<? extends bmn> list6, jln jlnVar, Expression<String> expression7, Expression<Long> expression8, Expression<DivSizeUnit> expression9, Expression<JSONObject> expression10, Expression<DivFontWeight> expression11, Expression<Long> expression12, List<t4> list7, v9 v9Var, Expression<Integer> expression13, Expression<Integer> expression14, Expression<String> expression15, String str, Expression<Boolean> expression16, Expression<KeyboardType> expression17, vmn vmnVar, Expression<Double> expression18, Expression<Long> expression19, y3 y3Var, s5 s5Var, Expression<Long> expression20, Expression<Long> expression21, a aVar, y3 y3Var2, Expression<String> expression22, Expression<Long> expression23, Expression<Boolean> expression24, List<DivAction> list8, Expression<DivAlignmentHorizontal> expression25, Expression<DivAlignmentVertical> expression26, Expression<Integer> expression27, String str2, List<DivTooltip> list9, hd hdVar, d2 d2Var, e1 e1Var, e1 e1Var2, List<? extends DivTransitionTrigger> list10, List<? extends b6> list11, List<DivTrigger> list12, List<? extends md> list13, Expression<DivVisibility> expression28, zd zdVar, List<zd> list14, v9 v9Var2) {
        this.a = divAccessibility;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = list;
        this.f = expression4;
        this.g = list2;
        this.h = u1Var;
        this.i = expression5;
        this.j = list3;
        this.k = list4;
        this.l = expression6;
        this.m = list5;
        this.n = list6;
        this.o = jlnVar;
        this.p = expression7;
        this.q = expression8;
        this.r = expression9;
        this.s = expression10;
        this.t = expression11;
        this.u = expression12;
        this.v = list7;
        this.w = v9Var;
        this.x = expression13;
        this.y = expression14;
        this.z = expression15;
        this.A = str;
        this.B = expression16;
        this.C = expression17;
        this.D = vmnVar;
        this.E = expression18;
        this.F = expression19;
        this.G = y3Var;
        this.H = s5Var;
        this.I = expression20;
        this.J = expression21;
        this.K = aVar;
        this.L = y3Var2;
        this.M = expression22;
        this.N = expression23;
        this.O = expression24;
        this.P = list8;
        this.Q = expression25;
        this.R = expression26;
        this.S = expression27;
        this.T = str2;
        this.U = list9;
        this.V = hdVar;
        this.W = d2Var;
        this.X = e1Var;
        this.Y = e1Var2;
        this.Z = list10;
        this.a0 = list11;
        this.b0 = list12;
        this.c0 = list13;
        this.d0 = expression28;
        this.e0 = zdVar;
        this.f0 = list14;
        this.g0 = v9Var2;
    }

    @Override // xsna.ikn
    public final List<t4> A() {
        return this.v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:360:0x064a, code lost:
    
        if (xsna.epx.f(r4.d, r5.d) != false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x06c0, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x09c9, code lost:
    
        if (xsna.epx.f(r6.d, r5.d) != false) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0a4b, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0a49, code lost:
    
        if (xsna.epx.f(r6.d, r5.d) != false) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0b6f, code lost:
    
        if (r17 == null) goto L766;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0b01, code lost:
    
        if (r19 == null) goto L734;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0ab4, code lost:
    
        if (r21 == null) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x0a67, code lost:
    
        if (r22 == null) goto L688;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x0915, code lost:
    
        if (r23 == null) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x0875, code lost:
    
        if (r28 == null) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x07e8, code lost:
    
        if (r29 == null) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x0691, code lost:
    
        if (xsna.epx.f(r4.b, r5.b) != false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x06be, code lost:
    
        if (r7 == null) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x046b, code lost:
    
        if (r9 == null) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x036c, code lost:
    
        if (r11 == null) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x028f, code lost:
    
        if (r12 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x023a, code lost:
    
        if (r13 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x01f3, code lost:
    
        if (r14 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x017a, code lost:
    
        if (r4 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x0124, code lost:
    
        if (r5 == null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0359 A[LOOP:5: B:150:0x02b4->B:158:0x0359, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0a50 A[LOOP:11: B:501:0x093a->B:527:0x0a50, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0a6c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(DivInput divInput, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Hashable hashable;
        Hashable hashable2;
        Hashable hashable3;
        boolean z17;
        Hashable hashable4;
        if (divInput == null) {
            return false;
        }
        List<zd> list = divInput.f0;
        zd zdVar = divInput.e0;
        List<md> list2 = divInput.c0;
        List<DivTrigger> list3 = divInput.b0;
        List<b6> list4 = divInput.a0;
        List<DivTransitionTrigger> list5 = divInput.Z;
        e1 e1Var = divInput.Y;
        e1 e1Var2 = divInput.X;
        d2 d2Var = divInput.W;
        hd hdVar = divInput.V;
        List<DivTooltip> list6 = divInput.U;
        List<DivAction> list7 = divInput.P;
        List<zd> list8 = list;
        y3 y3Var = divInput.L;
        a aVar = divInput.K;
        List<md> list9 = list2;
        s5 s5Var = divInput.H;
        y3 y3Var2 = divInput.G;
        List<DivTrigger> list10 = list3;
        vmn vmnVar = divInput.D;
        List<b6> list11 = list4;
        List<t4> list12 = divInput.v;
        List<DivTransitionTrigger> list13 = list5;
        jln jlnVar = divInput.o;
        List<bmn> list14 = divInput.n;
        List<zkn> list15 = divInput.m;
        List<DivAction> list16 = divInput.k;
        List<v3> list17 = divInput.j;
        List<DivTooltip> list18 = list6;
        u1 u1Var = divInput.h;
        List<DivAction> list19 = list7;
        List<m1> list20 = divInput.g;
        List<w0> list21 = divInput.e;
        DivAccessibility divAccessibility = divInput.a;
        DivAccessibility divAccessibility2 = this.a;
        if (!(divAccessibility2 != null ? divAccessibility2.a(divAccessibility, expressionResolver, expressionResolver2) : divAccessibility == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expression = this.b;
        DivAlignmentHorizontal evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expression2 = divInput.b;
        if (evaluate != (expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expression3 = this.c;
        DivAlignmentVertical evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expression4 = divInput.c;
        if (evaluate2 != (expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(this.d.evaluate(expressionResolver).doubleValue() == divInput.d.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<w0> list22 = this.e;
        if (list22 != null) {
            if (list21 != null) {
                if (list22.size() == list21.size()) {
                    int i = 0;
                    for (Object obj : list22) {
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        List<w0> list23 = list21;
                        if (((w0) obj).a(list21.get(i), expressionResolver, expressionResolver2)) {
                            i = i2;
                            list21 = list23;
                        }
                    }
                    z = true;
                }
                z = false;
                break;
            }
            return false;
        }
        if (!z || this.f.evaluate(expressionResolver) != divInput.f.evaluate(expressionResolver2)) {
            return false;
        }
        List<m1> list24 = this.g;
        if (list24 != null) {
            if (list20 != null) {
                if (list24.size() == list20.size()) {
                    int i3 = 0;
                    for (Object obj2 : list24) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((m1) obj2).a(list20.get(i3), expressionResolver, expressionResolver2)) {
                            i3 = i4;
                        }
                    }
                    z2 = true;
                }
                z2 = false;
                break;
            }
            return false;
        }
        if (!z2) {
            return false;
        }
        u1 u1Var2 = this.h;
        if (!(u1Var2 != null ? u1Var2.a(u1Var, expressionResolver, expressionResolver2) : u1Var == null)) {
            return false;
        }
        Expression<Long> expression5 = this.i;
        Long evaluate3 = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<Long> expression6 = divInput.i;
        if (!epx.f(evaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<v3> list25 = this.j;
        if (list25 != null) {
            if (list17 != null) {
                if (list25.size() == list17.size()) {
                    int i5 = 0;
                    for (Object obj3 : list25) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((v3) obj3).g(list17.get(i5), expressionResolver, expressionResolver2)) {
                            i5 = i6;
                        }
                    }
                    z3 = true;
                }
                z3 = false;
                break;
            }
            return false;
        }
        if (!z3) {
            return false;
        }
        List<DivAction> list26 = this.k;
        if (list26 != null) {
            if (list16 != null) {
                if (list26.size() == list16.size()) {
                    int i7 = 0;
                    for (Object obj4 : list26) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((DivAction) obj4).a(list16.get(i7), expressionResolver, expressionResolver2)) {
                            i7 = i8;
                        }
                    }
                    z4 = true;
                }
                z4 = false;
                break;
            }
            return false;
        }
        if (!z4 || this.l.evaluate(expressionResolver) != divInput.l.evaluate(expressionResolver2)) {
            return false;
        }
        List<zkn> list27 = this.m;
        if (list27 != null) {
            if (list15 != null) {
                if (list27.size() == list15.size()) {
                    int i9 = 0;
                    for (Object obj5 : list27) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((zkn) obj5).a(list15.get(i9))) {
                            i9 = i10;
                        }
                    }
                    z5 = true;
                }
                z5 = false;
                break;
            }
            return false;
        }
        if (!z5) {
            return false;
        }
        List<bmn> list28 = this.n;
        if (list28 != null) {
            if (list14 != null) {
                if (list28.size() == list14.size()) {
                    int i11 = 0;
                    for (Object obj6 : list28) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            e43.t();
                            throw null;
                        }
                        bmn bmnVar = list14.get(i11);
                        bmn bmnVar2 = (bmn) obj6;
                        bmnVar2.getClass();
                        if (bmnVar != null) {
                            if (bmnVar2 instanceof bmn.b) {
                                kmn kmnVar = ((bmn.b) bmnVar2).b;
                                if (bmnVar instanceof bmn.b) {
                                    hashable4 = ((bmn.b) bmnVar).b;
                                } else {
                                    if (!(bmnVar instanceof bmn.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    hashable4 = ((bmn.a) bmnVar).b;
                                }
                                kmn kmnVar2 = hashable4 instanceof kmn ? (kmn) hashable4 : null;
                                if (kmnVar2 == null) {
                                    kmnVar.getClass();
                                } else {
                                    z17 = epx.f(kmnVar.a.evaluate(expressionResolver), kmnVar2.a.evaluate(expressionResolver2));
                                    if (z17) {
                                        i11 = i12;
                                    }
                                }
                            } else {
                                if (!(bmnVar2 instanceof bmn.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cmn cmnVar = ((bmn.a) bmnVar2).b;
                                if (bmnVar instanceof bmn.b) {
                                    hashable3 = ((bmn.b) bmnVar).b;
                                } else {
                                    if (!(bmnVar instanceof bmn.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    hashable3 = ((bmn.a) bmnVar).b;
                                }
                                cmn cmnVar2 = hashable3 instanceof cmn ? (cmn) hashable3 : null;
                                if (cmnVar2 == null) {
                                    cmnVar.getClass();
                                } else if (cmnVar.a.evaluate(expressionResolver).booleanValue() == cmnVar2.a.evaluate(expressionResolver2).booleanValue()) {
                                    z17 = true;
                                    if (z17) {
                                    }
                                }
                            }
                        }
                        z17 = false;
                        if (z17) {
                        }
                    }
                    z6 = true;
                }
                z6 = false;
                break;
            }
            return false;
        }
        if (!z6) {
            return false;
        }
        jln jlnVar2 = this.o;
        if (!(jlnVar2 != null ? jlnVar2.a(jlnVar, expressionResolver, expressionResolver2) : jlnVar == null)) {
            return false;
        }
        Expression<String> expression7 = this.p;
        String evaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<String> expression8 = divInput.p;
        if (!epx.f(evaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null) || this.q.evaluate(expressionResolver).longValue() != divInput.q.evaluate(expressionResolver2).longValue() || this.r.evaluate(expressionResolver) != divInput.r.evaluate(expressionResolver2)) {
            return false;
        }
        Expression<JSONObject> expression9 = this.s;
        JSONObject evaluate5 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
        Expression<JSONObject> expression10 = divInput.s;
        if (!epx.f(evaluate5, expression10 != null ? expression10.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivFontWeight> expression11 = this.t;
        DivFontWeight evaluate6 = expression11 != null ? expression11.evaluate(expressionResolver) : null;
        Expression<DivFontWeight> expression12 = divInput.t;
        if (evaluate6 != (expression12 != null ? expression12.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression13 = this.u;
        Long evaluate7 = expression13 != null ? expression13.evaluate(expressionResolver) : null;
        Expression<Long> expression14 = divInput.u;
        if (!epx.f(evaluate7, expression14 != null ? expression14.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<t4> list29 = this.v;
        if (list29 != null) {
            if (list12 != null) {
                if (list29.size() == list12.size()) {
                    int i13 = 0;
                    for (Object obj7 : list29) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((t4) obj7).a(list12.get(i13))) {
                            i13 = i14;
                        }
                    }
                    z7 = true;
                }
                z7 = false;
                break;
            }
            return false;
        }
        if (!z7 || !this.w.a(divInput.w, expressionResolver, expressionResolver2)) {
            return false;
        }
        Expression<Integer> expression15 = this.x;
        Integer evaluate8 = expression15 != null ? expression15.evaluate(expressionResolver) : null;
        Expression<Integer> expression16 = divInput.x;
        if (!epx.f(evaluate8, expression16 != null ? expression16.evaluate(expressionResolver2) : null) || this.y.evaluate(expressionResolver).intValue() != divInput.y.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        Expression<String> expression17 = this.z;
        String evaluate9 = expression17 != null ? expression17.evaluate(expressionResolver) : null;
        Expression<String> expression18 = divInput.z;
        if (!epx.f(evaluate9, expression18 != null ? expression18.evaluate(expressionResolver2) : null) || !epx.f(this.A, divInput.A) || this.B.evaluate(expressionResolver).booleanValue() != divInput.B.evaluate(expressionResolver2).booleanValue() || this.C.evaluate(expressionResolver) != divInput.C.evaluate(expressionResolver2)) {
            return false;
        }
        vmn vmnVar2 = this.D;
        if (!(vmnVar2 != null ? vmnVar2.a(vmnVar) : vmnVar == null)) {
            return false;
        }
        if (!(this.E.evaluate(expressionResolver).doubleValue() == divInput.E.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        Expression<Long> expression19 = this.F;
        Long evaluate10 = expression19 != null ? expression19.evaluate(expressionResolver) : null;
        Expression<Long> expression20 = divInput.F;
        if (!epx.f(evaluate10, expression20 != null ? expression20.evaluate(expressionResolver2) : null)) {
            return false;
        }
        y3 y3Var3 = this.G;
        if (!(y3Var3 != null ? y3Var3.a(y3Var2, expressionResolver, expressionResolver2) : y3Var2 == null)) {
            return false;
        }
        s5 s5Var2 = this.H;
        if (s5Var2 != null) {
            if (s5Var != null) {
                if (s5Var2 instanceof s5.b) {
                    m4 m4Var = ((s5.b) s5Var2).b;
                    qmn a2 = s5Var.a();
                    m4 m4Var2 = a2 instanceof m4 ? (m4) a2 : null;
                    if (m4Var2 == null) {
                        m4Var.getClass();
                    } else if (m4Var.a.evaluate(expressionResolver).booleanValue() == m4Var2.a.evaluate(expressionResolver2).booleanValue() && epx.f(m4Var.b.evaluate(expressionResolver), m4Var2.b.evaluate(expressionResolver2))) {
                        List<m4.a> list30 = m4Var.c;
                        List<m4.a> list31 = m4Var2.c;
                        if (list30.size() == list31.size()) {
                            Iterator<T> it = list30.iterator();
                            int i15 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    int i16 = i15 + 1;
                                    if (i15 < 0) {
                                        e43.t();
                                        throw null;
                                    }
                                    m4.a aVar2 = list31.get(i15);
                                    m4.a aVar3 = (m4.a) next;
                                    if (aVar2 == null) {
                                        aVar3.getClass();
                                        break;
                                    }
                                    if (!epx.f(aVar3.a.evaluate(expressionResolver), aVar2.a.evaluate(expressionResolver2)) || !epx.f(aVar3.b.evaluate(expressionResolver), aVar2.b.evaluate(expressionResolver2))) {
                                        break;
                                    }
                                    Expression<String> expression21 = aVar3.c;
                                    String evaluate11 = expression21 != null ? expression21.evaluate(expressionResolver) : null;
                                    Expression<String> expression22 = aVar2.c;
                                    if (!epx.f(evaluate11, expression22 != null ? expression22.evaluate(expressionResolver2) : null)) {
                                        break;
                                    }
                                    i15 = i16;
                                }
                            }
                        }
                    }
                } else if (s5Var2 instanceof s5.a) {
                    kkn kknVar = ((s5.a) s5Var2).b;
                    qmn a3 = s5Var.a();
                    kkn kknVar2 = a3 instanceof kkn ? (kkn) a3 : null;
                    if (kknVar2 == null) {
                        kknVar.getClass();
                    } else {
                        Expression<String> expression23 = kknVar.a;
                        String evaluate12 = expression23 != null ? expression23.evaluate(expressionResolver) : null;
                        Expression<String> expression24 = kknVar2.a;
                        if (epx.f(evaluate12, expression24 != null ? expression24.evaluate(expressionResolver2) : null)) {
                        }
                    }
                } else {
                    if (!(s5Var2 instanceof s5.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    znn znnVar = ((s5.c) s5Var2).b;
                    qmn a4 = s5Var.a();
                    znn znnVar2 = a4 instanceof znn ? (znn) a4 : null;
                    if (znnVar2 == null) {
                        znnVar.getClass();
                    } else {
                        z8 = epx.f(znnVar.a, znnVar2.a);
                    }
                }
            }
            z8 = false;
        }
        if (!z8) {
            return false;
        }
        Expression<Long> expression25 = this.I;
        Long evaluate13 = expression25 != null ? expression25.evaluate(expressionResolver) : null;
        Expression<Long> expression26 = divInput.I;
        if (!epx.f(evaluate13, expression26 != null ? expression26.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression27 = this.J;
        Long evaluate14 = expression27 != null ? expression27.evaluate(expressionResolver) : null;
        Expression<Long> expression28 = divInput.J;
        if (!epx.f(evaluate14, expression28 != null ? expression28.evaluate(expressionResolver2) : null)) {
            return false;
        }
        a aVar4 = this.K;
        if (!(aVar4 == null ? aVar == null : !(aVar == null || aVar4.a.evaluate(expressionResolver).intValue() != aVar.a.evaluate(expressionResolver2).intValue()))) {
            return false;
        }
        y3 y3Var4 = this.L;
        if (!(y3Var4 != null ? y3Var4.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null)) {
            return false;
        }
        Expression<String> expression29 = this.M;
        String evaluate15 = expression29 != null ? expression29.evaluate(expressionResolver) : null;
        Expression<String> expression30 = divInput.M;
        if (!epx.f(evaluate15, expression30 != null ? expression30.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression31 = this.N;
        Long evaluate16 = expression31 != null ? expression31.evaluate(expressionResolver) : null;
        Expression<Long> expression32 = divInput.N;
        if (!epx.f(evaluate16, expression32 != null ? expression32.evaluate(expressionResolver2) : null) || this.O.evaluate(expressionResolver).booleanValue() != divInput.O.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivAction> list32 = this.P;
        if (list32 != null) {
            if (list19 != null) {
                if (list32.size() == list19.size()) {
                    int i17 = 0;
                    for (Object obj8 : list32) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivAction> list33 = list19;
                        if (((DivAction) obj8).a(list33.get(i17), expressionResolver, expressionResolver2)) {
                            i17 = i18;
                            list19 = list33;
                        }
                    }
                    z9 = true;
                }
                z9 = false;
                break;
            }
            return false;
        }
        if (!z9 || this.Q.evaluate(expressionResolver) != divInput.Q.evaluate(expressionResolver2) || this.R.evaluate(expressionResolver) != divInput.R.evaluate(expressionResolver2) || this.S.evaluate(expressionResolver).intValue() != divInput.S.evaluate(expressionResolver2).intValue() || !epx.f(this.T, divInput.T)) {
            return false;
        }
        List<DivTooltip> list34 = this.U;
        if (list34 != null) {
            if (list18 != null) {
                if (list34.size() == list18.size()) {
                    int i19 = 0;
                    for (Object obj9 : list34) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTooltip> list35 = list18;
                        if (((DivTooltip) obj9).a(list35.get(i19), expressionResolver, expressionResolver2)) {
                            i19 = i20;
                            list18 = list35;
                        }
                    }
                    z10 = true;
                }
                z10 = false;
                break;
            }
            return false;
        }
        if (!z10) {
            return false;
        }
        hd hdVar2 = this.V;
        if (!(hdVar2 != null ? hdVar2.a(hdVar, expressionResolver, expressionResolver2) : hdVar == null)) {
            return false;
        }
        d2 d2Var2 = this.W;
        if (!(d2Var2 != null ? d2Var2.a(d2Var, expressionResolver, expressionResolver2) : d2Var == null)) {
            return false;
        }
        e1 e1Var3 = this.X;
        if (!(e1Var3 != null ? e1Var3.a(e1Var2, expressionResolver, expressionResolver2) : e1Var2 == null)) {
            return false;
        }
        e1 e1Var4 = this.Y;
        if (!(e1Var4 != null ? e1Var4.a(e1Var, expressionResolver, expressionResolver2) : e1Var == null)) {
            return false;
        }
        List<DivTransitionTrigger> list36 = this.Z;
        if (list36 != null) {
            if (list13 != null) {
                if (list36.size() == list13.size()) {
                    int i21 = 0;
                    for (Object obj10 : list36) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTransitionTrigger> list37 = list13;
                        if (((DivTransitionTrigger) obj10) == list37.get(i21)) {
                            i21 = i22;
                            list13 = list37;
                        }
                    }
                    z11 = true;
                }
                z11 = false;
                break;
            }
            return false;
        }
        if (!z11) {
            return false;
        }
        List<b6> list38 = this.a0;
        if (list38 != null) {
            if (list11 != null) {
                if (list38.size() == list11.size()) {
                    int i23 = 0;
                    for (Object obj11 : list38) {
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<b6> list39 = list11;
                        b6 b6Var = list39.get(i23);
                        b6 b6Var2 = (b6) obj11;
                        b6Var2.getClass();
                        if (b6Var != null) {
                            if (b6Var2 instanceof b6.b) {
                                l6 l6Var = ((b6.b) b6Var2).b;
                                if (b6Var instanceof b6.b) {
                                    hashable2 = ((b6.b) b6Var).b;
                                } else {
                                    if (!(b6Var instanceof b6.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    hashable2 = ((b6.a) b6Var).b;
                                }
                                l6 l6Var2 = hashable2 instanceof l6 ? (l6) hashable2 : null;
                                if (l6Var2 == null) {
                                    l6Var.getClass();
                                } else if (l6Var.a.evaluate(expressionResolver).booleanValue() == l6Var2.a.evaluate(expressionResolver2).booleanValue()) {
                                    if (epx.f(l6Var.b.evaluate(expressionResolver), l6Var2.b.evaluate(expressionResolver2))) {
                                        if (epx.f(l6Var.c.evaluate(expressionResolver), l6Var2.c.evaluate(expressionResolver2))) {
                                        }
                                    }
                                }
                            } else {
                                if (!(b6Var2 instanceof b6.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f6 f6Var = ((b6.a) b6Var2).b;
                                if (b6Var instanceof b6.b) {
                                    hashable = ((b6.b) b6Var).b;
                                } else {
                                    if (!(b6Var instanceof b6.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    hashable = ((b6.a) b6Var).b;
                                }
                                f6 f6Var2 = hashable instanceof f6 ? (f6) hashable : null;
                                if (f6Var2 == null) {
                                    f6Var.getClass();
                                } else if (f6Var.a.evaluate(expressionResolver).booleanValue() == f6Var2.a.evaluate(expressionResolver2).booleanValue()) {
                                    if (f6Var.b.evaluate(expressionResolver).booleanValue() == f6Var2.b.evaluate(expressionResolver2).booleanValue()) {
                                        if (epx.f(f6Var.c.evaluate(expressionResolver), f6Var2.c.evaluate(expressionResolver2))) {
                                        }
                                    }
                                }
                            }
                            if (!z16) {
                                i23 = i24;
                                list11 = list39;
                            }
                        }
                        z16 = false;
                        if (!z16) {
                        }
                    }
                    z12 = true;
                }
                z12 = false;
                break;
            }
            return false;
        }
        if (!z12) {
            return false;
        }
        List<DivTrigger> list40 = this.b0;
        if (list40 != null) {
            if (list10 != null) {
                if (list40.size() == list10.size()) {
                    int i25 = 0;
                    for (Object obj12 : list40) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTrigger> list41 = list10;
                        if (((DivTrigger) obj12).a(list41.get(i25), expressionResolver, expressionResolver2)) {
                            i25 = i26;
                            list10 = list41;
                        }
                    }
                    z13 = true;
                }
                z13 = false;
                break;
            }
            return false;
        }
        if (!z13) {
            return false;
        }
        List<md> list42 = this.c0;
        if (list42 != null) {
            if (list9 != null) {
                if (list42.size() == list9.size()) {
                    int i27 = 0;
                    for (Object obj13 : list42) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<md> list43 = list9;
                        if (((md) obj13).a(list43.get(i27), expressionResolver, expressionResolver2)) {
                            i27 = i28;
                            list9 = list43;
                        }
                    }
                    z14 = true;
                }
                z14 = false;
                break;
            }
            return false;
        }
        if (!z14 || this.d0.evaluate(expressionResolver) != divInput.d0.evaluate(expressionResolver2)) {
            return false;
        }
        zd zdVar2 = this.e0;
        if (!(zdVar2 != null ? zdVar2.g(zdVar, expressionResolver, expressionResolver2) : zdVar == null)) {
            return false;
        }
        List<zd> list44 = this.f0;
        if (list44 != null) {
            if (list8 != null) {
                if (list44.size() == list8.size()) {
                    int i29 = 0;
                    for (Object obj14 : list44) {
                        int i30 = i29 + 1;
                        if (i29 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<zd> list45 = list8;
                        if (((zd) obj14).g(list45.get(i29), expressionResolver, expressionResolver2)) {
                            i29 = i30;
                            list8 = list45;
                        }
                    }
                    z15 = true;
                }
                z15 = false;
                break;
            }
            return false;
        }
        return z15 && this.g0.a(divInput.g0, expressionResolver, expressionResolver2);
    }

    @Override // xsna.ikn
    public final Expression<Double> a() {
        return this.d;
    }

    @Override // xsna.ikn
    public final List<DivTooltip> b() {
        return this.U;
    }

    @Override // xsna.ikn
    public final hd c() {
        return this.V;
    }

    @Override // xsna.ikn
    public final u1 d() {
        return this.h;
    }

    @Override // xsna.ikn
    public final Expression<Long> e() {
        return this.i;
    }

    @Override // xsna.ikn
    public final List<md> f() {
        return this.c0;
    }

    @Override // xsna.ikn
    public final y3 g() {
        return this.G;
    }

    @Override // xsna.ikn
    public final List<m1> getBackground() {
        return this.g;
    }

    @Override // xsna.ikn
    public final v9 getHeight() {
        return this.w;
    }

    @Override // xsna.ikn
    public final String getId() {
        return this.A;
    }

    @Override // xsna.ikn
    public final Expression<DivVisibility> getVisibility() {
        return this.d0;
    }

    @Override // xsna.ikn
    public final v9 getWidth() {
        return this.g0;
    }

    @Override // xsna.ikn
    public final Expression<Long> h() {
        return this.N;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Integer num = this.h0;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(DivInput.class).hashCode();
        int i13 = 0;
        DivAccessibility divAccessibility = this.a;
        int hash = hashCode + (divAccessibility != null ? divAccessibility.hash() : 0);
        Expression<DivAlignmentHorizontal> expression = this.b;
        int hashCode2 = hash + (expression != null ? expression.hashCode() : 0);
        Expression<DivAlignmentVertical> expression2 = this.c;
        int hashCode3 = this.d.hashCode() + hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        List<w0> list = this.e;
        if (list != null) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((w0) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int hashCode4 = this.f.hashCode() + hashCode3 + i;
        List<m1> list2 = this.g;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((m1) it2.next()).hash();
            }
        } else {
            i2 = 0;
        }
        int i14 = hashCode4 + i2;
        u1 u1Var = this.h;
        int hash2 = i14 + (u1Var != null ? u1Var.hash() : 0);
        Expression<Long> expression3 = this.i;
        int hashCode5 = hash2 + (expression3 != null ? expression3.hashCode() : 0);
        List<v3> list3 = this.j;
        if (list3 != null) {
            Iterator<T> it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((v3) it3.next()).hash();
            }
        } else {
            i3 = 0;
        }
        int i15 = hashCode5 + i3;
        List<DivAction> list4 = this.k;
        if (list4 != null) {
            Iterator<T> it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((DivAction) it4.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int hashCode6 = this.l.hashCode() + i15 + i4;
        List<zkn> list5 = this.m;
        if (list5 != null) {
            Iterator<T> it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((zkn) it5.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int i16 = hashCode6 + i5;
        List<bmn> list6 = this.n;
        if (list6 != null) {
            Iterator<T> it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((bmn) it6.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int i17 = i16 + i6;
        jln jlnVar = this.o;
        int hash3 = i17 + (jlnVar != null ? jlnVar.hash() : 0);
        Expression<String> expression4 = this.p;
        int hashCode7 = this.r.hashCode() + this.q.hashCode() + hash3 + (expression4 != null ? expression4.hashCode() : 0);
        Expression<JSONObject> expression5 = this.s;
        int hashCode8 = hashCode7 + (expression5 != null ? expression5.hashCode() : 0);
        Expression<DivFontWeight> expression6 = this.t;
        int hashCode9 = hashCode8 + (expression6 != null ? expression6.hashCode() : 0);
        Expression<Long> expression7 = this.u;
        int hashCode10 = hashCode9 + (expression7 != null ? expression7.hashCode() : 0);
        List<t4> list7 = this.v;
        if (list7 != null) {
            Iterator<T> it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((t4) it7.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int hash4 = this.w.hash() + hashCode10 + i7;
        Expression<Integer> expression8 = this.x;
        int hashCode11 = this.y.hashCode() + hash4 + (expression8 != null ? expression8.hashCode() : 0);
        Expression<String> expression9 = this.z;
        int hashCode12 = hashCode11 + (expression9 != null ? expression9.hashCode() : 0);
        String str = this.A;
        int hashCode13 = this.C.hashCode() + this.B.hashCode() + hashCode12 + (str != null ? str.hashCode() : 0);
        vmn vmnVar = this.D;
        int hashCode14 = this.E.hashCode() + hashCode13 + (vmnVar != null ? vmnVar.hash() : 0);
        Expression<Long> expression10 = this.F;
        int hashCode15 = hashCode14 + (expression10 != null ? expression10.hashCode() : 0);
        y3 y3Var = this.G;
        int hash5 = hashCode15 + (y3Var != null ? y3Var.hash() : 0);
        s5 s5Var = this.H;
        int hash6 = hash5 + (s5Var != null ? s5Var.hash() : 0);
        Expression<Long> expression11 = this.I;
        int hashCode16 = hash6 + (expression11 != null ? expression11.hashCode() : 0);
        Expression<Long> expression12 = this.J;
        int hashCode17 = hashCode16 + (expression12 != null ? expression12.hashCode() : 0);
        a aVar = this.K;
        int hash7 = hashCode17 + (aVar != null ? aVar.hash() : 0);
        y3 y3Var2 = this.L;
        int hash8 = hash7 + (y3Var2 != null ? y3Var2.hash() : 0);
        Expression<String> expression13 = this.M;
        int hashCode18 = hash8 + (expression13 != null ? expression13.hashCode() : 0);
        Expression<Long> expression14 = this.N;
        int hashCode19 = this.O.hashCode() + hashCode18 + (expression14 != null ? expression14.hashCode() : 0);
        List<DivAction> list8 = this.P;
        if (list8 != null) {
            Iterator<T> it8 = list8.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((DivAction) it8.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int hashCode20 = this.T.hashCode() + this.S.hashCode() + this.R.hashCode() + this.Q.hashCode() + hashCode19 + i8;
        List<DivTooltip> list9 = this.U;
        if (list9 != null) {
            Iterator<T> it9 = list9.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((DivTooltip) it9.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int i18 = hashCode20 + i9;
        hd hdVar = this.V;
        int hash9 = i18 + (hdVar != null ? hdVar.hash() : 0);
        d2 d2Var = this.W;
        int hash10 = hash9 + (d2Var != null ? d2Var.hash() : 0);
        e1 e1Var = this.X;
        int hash11 = hash10 + (e1Var != null ? e1Var.hash() : 0);
        e1 e1Var2 = this.Y;
        int hash12 = hash11 + (e1Var2 != null ? e1Var2.hash() : 0);
        List<DivTransitionTrigger> list10 = this.Z;
        int hashCode21 = hash12 + (list10 != null ? list10.hashCode() : 0);
        List<b6> list11 = this.a0;
        if (list11 != null) {
            Iterator<T> it10 = list11.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((b6) it10.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int i19 = hashCode21 + i10;
        List<DivTrigger> list12 = this.b0;
        if (list12 != null) {
            Iterator<T> it11 = list12.iterator();
            i11 = 0;
            while (it11.hasNext()) {
                i11 += ((DivTrigger) it11.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int i20 = i19 + i11;
        List<md> list13 = this.c0;
        if (list13 != null) {
            Iterator<T> it12 = list13.iterator();
            i12 = 0;
            while (it12.hasNext()) {
                i12 += ((md) it12.next()).hash();
            }
        } else {
            i12 = 0;
        }
        int hashCode22 = this.d0.hashCode() + i20 + i12;
        zd zdVar = this.e0;
        int hash13 = hashCode22 + (zdVar != null ? zdVar.hash() : 0);
        List<zd> list14 = this.f0;
        if (list14 != null) {
            Iterator<T> it13 = list14.iterator();
            while (it13.hasNext()) {
                i13 += ((zd) it13.next()).hash();
            }
        }
        int hash14 = this.g0.hash() + hash13 + i13;
        this.h0 = Integer.valueOf(hash14);
        return hash14;
    }

    @Override // xsna.ikn
    public final Expression<String> i() {
        return this.M;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentHorizontal> j() {
        return this.b;
    }

    @Override // xsna.ikn
    public final e1 k() {
        return this.Y;
    }

    @Override // xsna.ikn
    public final List<DivTransitionTrigger> l() {
        return this.Z;
    }

    @Override // xsna.ikn
    public final List<zkn> m() {
        return this.m;
    }

    @Override // xsna.ikn
    public final List<DivAction> n() {
        return this.P;
    }

    @Override // xsna.ikn
    public final vmn o() {
        return this.D;
    }

    @Override // xsna.ikn
    public final List<DivTrigger> p() {
        return this.b0;
    }

    @Override // xsna.ikn
    public final e1 q() {
        return this.X;
    }

    @Override // xsna.ikn
    public final List<w0> r() {
        return this.e;
    }

    @Override // xsna.ikn
    public final List<zd> s() {
        return this.f0;
    }

    @Override // xsna.ikn
    public final d2 t() {
        return this.W;
    }

    @Override // xsna.ikn
    public final List<v3> u() {
        return this.j;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentVertical> v() {
        return this.c;
    }

    @Override // xsna.ikn
    public final jln w() {
        return this.o;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((r5.k) BuiltInParserKt.getBuiltInParserComponent().G4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // xsna.ikn
    public final DivAccessibility x() {
        return this.a;
    }

    @Override // xsna.ikn
    public final y3 y() {
        return this.L;
    }

    @Override // xsna.ikn
    public final zd z() {
        return this.e0;
    }
}
