package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import defpackage.bpk;
import defpackage.c4x;
import defpackage.egk;
import defpackage.ft6;
import defpackage.gil;
import defpackage.i9l;
import defpackage.irk;
import defpackage.j9l;
import defpackage.jl40;
import defpackage.kfk;
import defpackage.kvo;
import defpackage.lll;
import defpackage.lql;
import defpackage.m3k;
import defpackage.ngd0;
import defpackage.nnk;
import defpackage.nzk;
import defpackage.qoi0;
import defpackage.rvo;
import defpackage.scc;
import defpackage.tls;
import defpackage.v3k;
import defpackage.xjl;
import defpackage.ydk;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes.dex */
public final class DivGallery implements c4x, egk {
    public static final kvo V = ngd0.m(Double.valueOf(1.0d));
    public static final kvo W = ngd0.m(ContentAlignment.START);
    public static final kvo X = ngd0.m(0L);
    public static final j9l Y = new j9l(new lql(null, null, null));
    public static final kvo Z = ngd0.m(8L);
    public static final kvo a0 = ngd0.m(Orientation.HORIZONTAL);
    public static final kvo b0 = ngd0.m(Boolean.FALSE);
    public static final kvo c0 = ngd0.m(ScrollMode.DEFAULT);
    public static final kvo d0 = ngd0.m(Scrollbar.NONE);
    public static final kvo e0 = ngd0.m(DivVisibility.VISIBLE);
    public static final i9l f0 = new i9l(new nzk(null, null, null));
    public final Expression A;
    public final Expression B;
    public final Expression C;
    public final Expression D;
    public final Expression E;
    public final List F;
    public final List G;
    public final DivTransform H;
    public final List I;
    public final DivChangeTransition J;
    public final DivAppearanceTransition K;
    public final DivAppearanceTransition L;
    public final List M;
    public final List N;
    public final List O;
    public final Expression P;
    public final DivVisibilityAction Q;
    public final List R;
    public final DivSize S;
    public Integer T;
    public Integer U;
    public final DivAccessibility a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final List e;
    public final List f;
    public final DivBorder g;
    public final Expression h;
    public final Expression i;
    public final Expression j;
    public final Expression k;
    public final Expression l;
    public final List m;
    public final List n;
    public final DivFocus o;
    public final List p;
    public final DivSize q;
    public final String r;
    public final DivCollectionItemBuilder s;
    public final Expression t;
    public final List u;
    public final DivLayoutProvider v;
    public final DivEdgeInsets w;
    public final Expression x;
    public final DivEdgeInsets y;
    public final Expression z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/div2/DivGallery$ContentAlignment;", "", "", "value", "Ljava/lang/String;", "Converter", "com/yandex/div2/k0", "START", "CENTER", "END", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ContentAlignment {
        START("start"),
        CENTER("center"),
        END("end");

        private final String value;
        public static final k0 Converter = new k0();
        public static final tls TO_STRING = DivGallery$ContentAlignment$Converter$TO_STRING$1.w;
        public static final tls FROM_STRING = DivGallery$ContentAlignment$Converter$FROM_STRING$1.w;

        ContentAlignment(String str) {
            this.value = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/div2/DivGallery$Orientation;", "", "", "value", "Ljava/lang/String;", "Converter", "com/yandex/div2/l0", "HORIZONTAL", "VERTICAL", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Orientation {
        HORIZONTAL("horizontal"),
        VERTICAL("vertical");

        private final String value;
        public static final l0 Converter = new l0();
        public static final tls TO_STRING = DivGallery$Orientation$Converter$TO_STRING$1.w;
        public static final tls FROM_STRING = DivGallery$Orientation$Converter$FROM_STRING$1.w;

        Orientation(String str) {
            this.value = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/div2/DivGallery$ScrollMode;", "", "", "value", "Ljava/lang/String;", "Converter", "com/yandex/div2/m0", "PAGING", "DEFAULT", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ScrollMode {
        PAGING("paging"),
        DEFAULT("default");

        private final String value;
        public static final m0 Converter = new m0();
        public static final tls TO_STRING = DivGallery$ScrollMode$Converter$TO_STRING$1.w;
        public static final tls FROM_STRING = DivGallery$ScrollMode$Converter$FROM_STRING$1.w;

        ScrollMode(String str) {
            this.value = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/div2/DivGallery$Scrollbar;", "", "", "value", "Ljava/lang/String;", "Converter", "com/yandex/div2/n0", JCP.RAW_PREFIX, "AUTO", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Scrollbar {
        NONE("none"),
        AUTO("auto");

        private final String value;
        public static final n0 Converter = new n0();
        public static final tls TO_STRING = DivGallery$Scrollbar$Converter$TO_STRING$1.w;
        public static final tls FROM_STRING = DivGallery$Scrollbar$Converter$FROM_STRING$1.w;

        Scrollbar(String str) {
            this.value = str;
        }
    }

    public DivGallery(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression expression9, List list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression10, DivEdgeInsets divEdgeInsets2, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, Expression expression16, List list7, List list8, DivTransform divTransform, List list9, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list10, List list11, List list12, Expression expression17, DivVisibilityAction divVisibilityAction, List list13, DivSize divSize2) {
        this.a = divAccessibility;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = list;
        this.f = list2;
        this.g = divBorder;
        this.h = expression4;
        this.i = expression5;
        this.j = expression6;
        this.k = expression7;
        this.l = expression8;
        this.m = list3;
        this.n = list4;
        this.o = divFocus;
        this.p = list5;
        this.q = divSize;
        this.r = str;
        this.s = divCollectionItemBuilder;
        this.t = expression9;
        this.u = list6;
        this.v = divLayoutProvider;
        this.w = divEdgeInsets;
        this.x = expression10;
        this.y = divEdgeInsets2;
        this.z = expression11;
        this.A = expression12;
        this.B = expression13;
        this.C = expression14;
        this.D = expression15;
        this.E = expression16;
        this.F = list7;
        this.G = list8;
        this.H = divTransform;
        this.I = list9;
        this.J = divChangeTransition;
        this.K = divAppearanceTransition;
        this.L = divAppearanceTransition2;
        this.M = list10;
        this.N = list11;
        this.O = list12;
        this.P = expression17;
        this.Q = divVisibilityAction;
        this.R = list13;
        this.S = divSize2;
    }

    public static DivGallery B(DivGallery divGallery, String str, List list, int i) {
        DivSize divSize;
        DivAccessibility divAccessibility = divGallery.a;
        Expression expression = divGallery.b;
        Expression expression2 = divGallery.c;
        Expression expression3 = divGallery.d;
        List list2 = divGallery.e;
        List list3 = divGallery.f;
        DivBorder divBorder = divGallery.g;
        Expression expression4 = divGallery.h;
        Expression expression5 = divGallery.i;
        Expression expression6 = divGallery.j;
        Expression expression7 = divGallery.k;
        Expression expression8 = divGallery.l;
        List list4 = divGallery.m;
        List list5 = divGallery.n;
        DivFocus divFocus = divGallery.o;
        List list6 = divGallery.p;
        DivSize divSize2 = divGallery.q;
        if ((i & 131072) != 0) {
            divSize = divSize2;
            str = divGallery.r;
        } else {
            divSize = divSize2;
        }
        DivCollectionItemBuilder divCollectionItemBuilder = divGallery.s;
        Expression expression9 = divGallery.t;
        DivLayoutProvider divLayoutProvider = divGallery.v;
        DivEdgeInsets divEdgeInsets = divGallery.w;
        Expression expression10 = divGallery.x;
        DivEdgeInsets divEdgeInsets2 = divGallery.y;
        Expression expression11 = divGallery.z;
        Expression expression12 = divGallery.A;
        Expression expression13 = divGallery.B;
        Expression expression14 = divGallery.C;
        Expression expression15 = divGallery.D;
        Expression expression16 = divGallery.E;
        List list7 = divGallery.F;
        List list8 = divGallery.G;
        DivTransform divTransform = divGallery.H;
        List list9 = divGallery.I;
        DivChangeTransition divChangeTransition = divGallery.J;
        DivAppearanceTransition divAppearanceTransition = divGallery.K;
        DivAppearanceTransition divAppearanceTransition2 = divGallery.L;
        List list10 = divGallery.M;
        List list11 = divGallery.N;
        List list12 = divGallery.O;
        Expression expression17 = divGallery.P;
        DivVisibilityAction divVisibilityAction = divGallery.Q;
        List list13 = divGallery.R;
        DivSize divSize3 = divGallery.S;
        divGallery.getClass();
        return new DivGallery(divAccessibility, expression, expression2, expression3, list2, list3, divBorder, expression4, expression5, expression6, expression7, expression8, list4, list5, divFocus, list6, divSize, str, divCollectionItemBuilder, expression9, list, divLayoutProvider, divEdgeInsets, expression10, divEdgeInsets2, expression11, expression12, expression13, expression14, expression15, expression16, list7, list8, divTransform, list9, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list10, list11, list12, expression17, divVisibilityAction, list13, divSize3);
    }

    @Override // defpackage.egk
    public final DivBorder A() {
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:372:0x05e7, code lost:
    
        if (r3 == null) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0587, code lost:
    
        if (r3 == null) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0544, code lost:
    
        if (r3 == null) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0501, code lost:
    
        if (r3 == null) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x048e, code lost:
    
        if (r3 == null) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0439, code lost:
    
        if (r3 == null) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x03f6, code lost:
    
        if (r3 == null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x02e3, code lost:
    
        if (r3 == null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x025e, code lost:
    
        if (r3 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0209, code lost:
    
        if (r3 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x01c6, code lost:
    
        if (r3 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x00ed, code lost:
    
        if (r3 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x00aa, code lost:
    
        if (r3 == null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(DivGallery divGallery, rvo rvoVar, rvo rvoVar2) {
        if (divGallery != null) {
            DivAccessibility divAccessibility = divGallery.a;
            DivAccessibility divAccessibility2 = this.a;
            if (divAccessibility2 != null ? divAccessibility2.a(divAccessibility, rvoVar, rvoVar2) : divAccessibility == null) {
                Expression expression = this.b;
                DivAlignmentHorizontal divAlignmentHorizontal = expression != null ? (DivAlignmentHorizontal) expression.a(rvoVar) : null;
                Expression expression2 = divGallery.b;
                if (divAlignmentHorizontal == (expression2 != null ? (DivAlignmentHorizontal) expression2.a(rvoVar2) : null)) {
                    Expression expression3 = this.c;
                    DivAlignmentVertical divAlignmentVertical = expression3 != null ? (DivAlignmentVertical) expression3.a(rvoVar) : null;
                    Expression expression4 = divGallery.c;
                    if (divAlignmentVertical == (expression4 != null ? (DivAlignmentVertical) expression4.a(rvoVar2) : null) && ((Number) this.d.a(rvoVar)).doubleValue() == ((Number) divGallery.d.a(rvoVar2)).doubleValue()) {
                        List list = divGallery.e;
                        List list2 = this.e;
                        if (list2 != null) {
                            if (list != null && list2.size() == list.size()) {
                                int i = 0;
                                for (Object obj : list2) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        scc.m();
                                        throw null;
                                    }
                                    if (!((ydk) obj).a((ydk) list.get(i), rvoVar, rvoVar2)) {
                                        break;
                                    }
                                    i = i2;
                                }
                                List list3 = divGallery.f;
                                List list4 = this.f;
                                if (list4 != null) {
                                    if (list3 != null && list4.size() == list3.size()) {
                                        int i3 = 0;
                                        for (Object obj2 : list4) {
                                            int i4 = i3 + 1;
                                            if (i3 < 0) {
                                                scc.m();
                                                throw null;
                                            }
                                            if (!((kfk) obj2).a((kfk) list3.get(i3), rvoVar, rvoVar2)) {
                                                break;
                                            }
                                            i3 = i4;
                                        }
                                        DivBorder divBorder = divGallery.g;
                                        DivBorder divBorder2 = this.g;
                                        if (divBorder2 != null ? divBorder2.a(divBorder, rvoVar, rvoVar2) : divBorder == null) {
                                            Expression expression5 = this.h;
                                            Long l = expression5 != null ? (Long) expression5.a(rvoVar) : null;
                                            Expression expression6 = divGallery.h;
                                            if (jl40.l(l, expression6 != null ? (Long) expression6.a(rvoVar2) : null)) {
                                                Expression expression7 = this.i;
                                                Long l2 = expression7 != null ? (Long) expression7.a(rvoVar) : null;
                                                Expression expression8 = divGallery.i;
                                                if (jl40.l(l2, expression8 != null ? (Long) expression8.a(rvoVar2) : null) && this.j.a(rvoVar) == divGallery.j.a(rvoVar2)) {
                                                    Expression expression9 = this.k;
                                                    Long l3 = expression9 != null ? (Long) expression9.a(rvoVar) : null;
                                                    Expression expression10 = divGallery.k;
                                                    if (jl40.l(l3, expression10 != null ? (Long) expression10.a(rvoVar2) : null) && ((Number) this.l.a(rvoVar)).longValue() == ((Number) divGallery.l.a(rvoVar2)).longValue()) {
                                                        List list5 = divGallery.m;
                                                        List list6 = this.m;
                                                        if (list6 != null) {
                                                            if (list5 != null && list6.size() == list5.size()) {
                                                                int i5 = 0;
                                                                for (Object obj3 : list6) {
                                                                    int i6 = i5 + 1;
                                                                    if (i5 < 0) {
                                                                        scc.m();
                                                                        throw null;
                                                                    }
                                                                    if (!((nnk) obj3).f((nnk) list5.get(i5), rvoVar, rvoVar2)) {
                                                                        break;
                                                                    }
                                                                    i5 = i6;
                                                                }
                                                                List list7 = divGallery.n;
                                                                List list8 = this.n;
                                                                if (list8 != null) {
                                                                    if (list7 != null && list8.size() == list7.size()) {
                                                                        int i7 = 0;
                                                                        for (Object obj4 : list8) {
                                                                            int i8 = i7 + 1;
                                                                            if (i7 < 0) {
                                                                                scc.m();
                                                                                throw null;
                                                                            }
                                                                            if (!((bpk) obj4).a((bpk) list7.get(i7))) {
                                                                                break;
                                                                            }
                                                                            i7 = i8;
                                                                        }
                                                                        DivFocus divFocus = divGallery.o;
                                                                        DivFocus divFocus2 = this.o;
                                                                        if (divFocus2 != null ? divFocus2.a(divFocus, rvoVar, rvoVar2) : divFocus == null) {
                                                                            List list9 = divGallery.p;
                                                                            List list10 = this.p;
                                                                            if (list10 != null) {
                                                                                if (list9 != null && list10.size() == list9.size()) {
                                                                                    int i9 = 0;
                                                                                    for (Object obj5 : list10) {
                                                                                        int i10 = i9 + 1;
                                                                                        if (i9 < 0) {
                                                                                            scc.m();
                                                                                            throw null;
                                                                                        }
                                                                                        if (!((irk) obj5).a((irk) list9.get(i9))) {
                                                                                            break;
                                                                                        }
                                                                                        i9 = i10;
                                                                                    }
                                                                                    if (this.q.a(divGallery.q, rvoVar, rvoVar2) && jl40.l(this.r, divGallery.r)) {
                                                                                        DivCollectionItemBuilder divCollectionItemBuilder = divGallery.s;
                                                                                        DivCollectionItemBuilder divCollectionItemBuilder2 = this.s;
                                                                                        if ((divCollectionItemBuilder2 != null ? divCollectionItemBuilder2.a(divCollectionItemBuilder, rvoVar, rvoVar2) : divCollectionItemBuilder == null) && ((Number) this.t.a(rvoVar)).longValue() == ((Number) divGallery.t.a(rvoVar2)).longValue()) {
                                                                                            List list11 = divGallery.u;
                                                                                            List list12 = this.u;
                                                                                            if (list12 != null) {
                                                                                                if (list11 != null && list12.size() == list11.size()) {
                                                                                                    int i11 = 0;
                                                                                                    for (Object obj6 : list12) {
                                                                                                        int i12 = i11 + 1;
                                                                                                        if (i11 < 0) {
                                                                                                            scc.m();
                                                                                                            throw null;
                                                                                                        }
                                                                                                        if (!((m3k) obj6).a((m3k) list11.get(i11), rvoVar, rvoVar2)) {
                                                                                                            break;
                                                                                                        }
                                                                                                        i11 = i12;
                                                                                                    }
                                                                                                    DivLayoutProvider divLayoutProvider = divGallery.v;
                                                                                                    DivLayoutProvider divLayoutProvider2 = this.v;
                                                                                                    if (divLayoutProvider2 != null ? divLayoutProvider2.a(divLayoutProvider) : divLayoutProvider == null) {
                                                                                                        DivEdgeInsets divEdgeInsets = divGallery.w;
                                                                                                        DivEdgeInsets divEdgeInsets2 = this.w;
                                                                                                        if ((divEdgeInsets2 != null ? divEdgeInsets2.a(divEdgeInsets, rvoVar, rvoVar2) : divEdgeInsets == null) && this.x.a(rvoVar) == divGallery.x.a(rvoVar2)) {
                                                                                                            DivEdgeInsets divEdgeInsets3 = divGallery.y;
                                                                                                            DivEdgeInsets divEdgeInsets4 = this.y;
                                                                                                            if ((divEdgeInsets4 != null ? divEdgeInsets4.a(divEdgeInsets3, rvoVar, rvoVar2) : divEdgeInsets3 == null) && ((Boolean) this.z.a(rvoVar)).booleanValue() == ((Boolean) divGallery.z.a(rvoVar2)).booleanValue()) {
                                                                                                                Expression expression11 = this.A;
                                                                                                                String str = expression11 != null ? (String) expression11.a(rvoVar) : null;
                                                                                                                Expression expression12 = divGallery.A;
                                                                                                                if (jl40.l(str, expression12 != null ? (String) expression12.a(rvoVar2) : null)) {
                                                                                                                    Expression expression13 = this.B;
                                                                                                                    Long l4 = expression13 != null ? (Long) expression13.a(rvoVar) : null;
                                                                                                                    Expression expression14 = divGallery.B;
                                                                                                                    if (jl40.l(l4, expression14 != null ? (Long) expression14.a(rvoVar2) : null)) {
                                                                                                                        Expression expression15 = this.C;
                                                                                                                        ContentAlignment contentAlignment = expression15 != null ? (ContentAlignment) expression15.a(rvoVar) : null;
                                                                                                                        Expression expression16 = divGallery.C;
                                                                                                                        if (contentAlignment == (expression16 != null ? (ContentAlignment) expression16.a(rvoVar2) : null) && this.D.a(rvoVar) == divGallery.D.a(rvoVar2) && this.E.a(rvoVar) == divGallery.E.a(rvoVar2)) {
                                                                                                                            List list13 = divGallery.F;
                                                                                                                            List list14 = this.F;
                                                                                                                            if (list14 != null) {
                                                                                                                                if (list13 != null && list14.size() == list13.size()) {
                                                                                                                                    int i13 = 0;
                                                                                                                                    for (Object obj7 : list14) {
                                                                                                                                        int i14 = i13 + 1;
                                                                                                                                        if (i13 < 0) {
                                                                                                                                            scc.m();
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        if (!((v3k) obj7).a((v3k) list13.get(i13), rvoVar, rvoVar2)) {
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        i13 = i14;
                                                                                                                                    }
                                                                                                                                    List list15 = divGallery.G;
                                                                                                                                    List list16 = this.G;
                                                                                                                                    if (list16 != null) {
                                                                                                                                        if (list15 != null && list16.size() == list15.size()) {
                                                                                                                                            int i15 = 0;
                                                                                                                                            for (Object obj8 : list16) {
                                                                                                                                                int i16 = i15 + 1;
                                                                                                                                                if (i15 < 0) {
                                                                                                                                                    scc.m();
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                if (!((gil) obj8).a((gil) list15.get(i15), rvoVar, rvoVar2)) {
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                i15 = i16;
                                                                                                                                            }
                                                                                                                                            DivTransform divTransform = divGallery.H;
                                                                                                                                            DivTransform divTransform2 = this.H;
                                                                                                                                            if (divTransform2 != null ? divTransform2.a(divTransform, rvoVar, rvoVar2) : divTransform == null) {
                                                                                                                                                List list17 = divGallery.I;
                                                                                                                                                List list18 = this.I;
                                                                                                                                                if (list18 != null) {
                                                                                                                                                    if (list17 != null && list18.size() == list17.size()) {
                                                                                                                                                        int i17 = 0;
                                                                                                                                                        for (Object obj9 : list18) {
                                                                                                                                                            int i18 = i17 + 1;
                                                                                                                                                            if (i17 < 0) {
                                                                                                                                                                scc.m();
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            if (!((xjl) obj9).a((xjl) list17.get(i17), rvoVar, rvoVar2)) {
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            i17 = i18;
                                                                                                                                                        }
                                                                                                                                                        DivChangeTransition divChangeTransition = divGallery.J;
                                                                                                                                                        DivChangeTransition divChangeTransition2 = this.J;
                                                                                                                                                        if (divChangeTransition2 != null ? divChangeTransition2.a(divChangeTransition, rvoVar, rvoVar2) : divChangeTransition == null) {
                                                                                                                                                            DivAppearanceTransition divAppearanceTransition = divGallery.K;
                                                                                                                                                            DivAppearanceTransition divAppearanceTransition2 = this.K;
                                                                                                                                                            if (divAppearanceTransition2 != null ? divAppearanceTransition2.a(divAppearanceTransition, rvoVar, rvoVar2) : divAppearanceTransition == null) {
                                                                                                                                                                DivAppearanceTransition divAppearanceTransition3 = divGallery.L;
                                                                                                                                                                DivAppearanceTransition divAppearanceTransition4 = this.L;
                                                                                                                                                                if (divAppearanceTransition4 != null ? divAppearanceTransition4.a(divAppearanceTransition3, rvoVar, rvoVar2) : divAppearanceTransition3 == null) {
                                                                                                                                                                    List list19 = divGallery.M;
                                                                                                                                                                    List list20 = this.M;
                                                                                                                                                                    if (list20 != null) {
                                                                                                                                                                        if (list19 != null && list20.size() == list19.size()) {
                                                                                                                                                                            int i19 = 0;
                                                                                                                                                                            for (Object obj10 : list20) {
                                                                                                                                                                                int i20 = i19 + 1;
                                                                                                                                                                                if (i19 < 0) {
                                                                                                                                                                                    scc.m();
                                                                                                                                                                                    throw null;
                                                                                                                                                                                }
                                                                                                                                                                                if (((DivTransitionTrigger) obj10) != ((DivTransitionTrigger) list19.get(i19))) {
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                i19 = i20;
                                                                                                                                                                            }
                                                                                                                                                                            List list21 = divGallery.N;
                                                                                                                                                                            List list22 = this.N;
                                                                                                                                                                            if (list22 != null) {
                                                                                                                                                                                if (list21 != null && list22.size() == list21.size()) {
                                                                                                                                                                                    int i21 = 0;
                                                                                                                                                                                    for (Object obj11 : list22) {
                                                                                                                                                                                        int i22 = i21 + 1;
                                                                                                                                                                                        if (i21 < 0) {
                                                                                                                                                                                            scc.m();
                                                                                                                                                                                            throw null;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (!((lll) obj11).a((lll) list21.get(i21), rvoVar, rvoVar2)) {
                                                                                                                                                                                            break;
                                                                                                                                                                                        }
                                                                                                                                                                                        i21 = i22;
                                                                                                                                                                                    }
                                                                                                                                                                                    List list23 = divGallery.O;
                                                                                                                                                                                    List list24 = this.O;
                                                                                                                                                                                    if (list24 != null) {
                                                                                                                                                                                        if (list23 != null && list24.size() == list23.size()) {
                                                                                                                                                                                            int i23 = 0;
                                                                                                                                                                                            for (Object obj12 : list24) {
                                                                                                                                                                                                int i24 = i23 + 1;
                                                                                                                                                                                                if (i23 < 0) {
                                                                                                                                                                                                    scc.m();
                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (!((c3) obj12).a((c3) list23.get(i23), rvoVar, rvoVar2)) {
                                                                                                                                                                                                    break;
                                                                                                                                                                                                }
                                                                                                                                                                                                i23 = i24;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (this.P.a(rvoVar) == divGallery.P.a(rvoVar2)) {
                                                                                                                                                                                                DivVisibilityAction divVisibilityAction = divGallery.Q;
                                                                                                                                                                                                DivVisibilityAction divVisibilityAction2 = this.Q;
                                                                                                                                                                                                if (divVisibilityAction2 != null ? divVisibilityAction2.f(divVisibilityAction, rvoVar, rvoVar2) : divVisibilityAction == null) {
                                                                                                                                                                                                    List list25 = divGallery.R;
                                                                                                                                                                                                    List list26 = this.R;
                                                                                                                                                                                                    if (list26 != null) {
                                                                                                                                                                                                        if (list25 != null && list26.size() == list25.size()) {
                                                                                                                                                                                                            int i25 = 0;
                                                                                                                                                                                                            for (Object obj13 : list26) {
                                                                                                                                                                                                                int i26 = i25 + 1;
                                                                                                                                                                                                                if (i25 < 0) {
                                                                                                                                                                                                                    scc.m();
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (!((DivVisibilityAction) obj13).f((DivVisibilityAction) list25.get(i25), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                i25 = i26;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (this.S.a(divGallery.S, rvoVar, rvoVar2)) {
                                                                                                                                                                                                                return true;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int D() {
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
        Integer num = this.T;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(DivGallery.class).hashCode();
        int i11 = 0;
        DivAccessibility divAccessibility = this.a;
        int b = hashCode + (divAccessibility != null ? divAccessibility.b() : 0);
        Expression expression = this.b;
        int hashCode2 = b + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.c;
        int hashCode3 = this.d.hashCode() + hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        List list = this.e;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((ydk) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i12 = hashCode3 + i;
        List list2 = this.f;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((kfk) it2.next()).b();
            }
        } else {
            i2 = 0;
        }
        int i13 = i12 + i2;
        DivBorder divBorder = this.g;
        int b2 = i13 + (divBorder != null ? divBorder.b() : 0);
        Expression expression3 = this.h;
        int hashCode4 = b2 + (expression3 != null ? expression3.hashCode() : 0);
        Expression expression4 = this.i;
        int hashCode5 = this.j.hashCode() + hashCode4 + (expression4 != null ? expression4.hashCode() : 0);
        Expression expression5 = this.k;
        int hashCode6 = this.l.hashCode() + hashCode5 + (expression5 != null ? expression5.hashCode() : 0);
        List list3 = this.m;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((nnk) it3.next()).g();
            }
        } else {
            i3 = 0;
        }
        int i14 = hashCode6 + i3;
        List list4 = this.n;
        if (list4 != null) {
            Iterator it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((bpk) it4.next()).b();
            }
        } else {
            i4 = 0;
        }
        int i15 = i14 + i4;
        DivFocus divFocus = this.o;
        int b3 = i15 + (divFocus != null ? divFocus.b() : 0);
        List list5 = this.p;
        if (list5 != null) {
            Iterator it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((irk) it5.next()).b();
            }
        } else {
            i5 = 0;
        }
        int b4 = this.q.b() + b3 + i5;
        String str = this.r;
        int hashCode7 = b4 + (str != null ? str.hashCode() : 0);
        DivCollectionItemBuilder divCollectionItemBuilder = this.s;
        int hashCode8 = this.t.hashCode() + hashCode7 + (divCollectionItemBuilder != null ? divCollectionItemBuilder.b() : 0);
        DivLayoutProvider divLayoutProvider = this.v;
        int b5 = hashCode8 + (divLayoutProvider != null ? divLayoutProvider.b() : 0);
        DivEdgeInsets divEdgeInsets = this.w;
        int hashCode9 = this.x.hashCode() + b5 + (divEdgeInsets != null ? divEdgeInsets.b() : 0);
        DivEdgeInsets divEdgeInsets2 = this.y;
        int hashCode10 = this.z.hashCode() + hashCode9 + (divEdgeInsets2 != null ? divEdgeInsets2.b() : 0);
        Expression expression6 = this.A;
        int hashCode11 = hashCode10 + (expression6 != null ? expression6.hashCode() : 0);
        Expression expression7 = this.B;
        int hashCode12 = hashCode11 + (expression7 != null ? expression7.hashCode() : 0);
        Expression expression8 = this.C;
        int hashCode13 = this.E.hashCode() + this.D.hashCode() + hashCode12 + (expression8 != null ? expression8.hashCode() : 0);
        List list6 = this.F;
        if (list6 != null) {
            Iterator it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((v3k) it6.next()).b();
            }
        } else {
            i6 = 0;
        }
        int i16 = hashCode13 + i6;
        List list7 = this.G;
        if (list7 != null) {
            Iterator it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((gil) it7.next()).b();
            }
        } else {
            i7 = 0;
        }
        int i17 = i16 + i7;
        DivTransform divTransform = this.H;
        int b6 = i17 + (divTransform != null ? divTransform.b() : 0);
        List list8 = this.I;
        if (list8 != null) {
            Iterator it8 = list8.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((xjl) it8.next()).b();
            }
        } else {
            i8 = 0;
        }
        int i18 = b6 + i8;
        DivChangeTransition divChangeTransition = this.J;
        int b7 = i18 + (divChangeTransition != null ? divChangeTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition = this.K;
        int b8 = b7 + (divAppearanceTransition != null ? divAppearanceTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition2 = this.L;
        int b9 = b8 + (divAppearanceTransition2 != null ? divAppearanceTransition2.b() : 0);
        List list9 = this.M;
        int hashCode14 = b9 + (list9 != null ? list9.hashCode() : 0);
        List list10 = this.N;
        if (list10 != null) {
            Iterator it9 = list10.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((lll) it9.next()).b();
            }
        } else {
            i9 = 0;
        }
        int i19 = hashCode14 + i9;
        List list11 = this.O;
        if (list11 != null) {
            Iterator it10 = list11.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((c3) it10.next()).b();
            }
        } else {
            i10 = 0;
        }
        int hashCode15 = this.P.hashCode() + i19 + i10;
        DivVisibilityAction divVisibilityAction = this.Q;
        int g = hashCode15 + (divVisibilityAction != null ? divVisibilityAction.g() : 0);
        List list12 = this.R;
        if (list12 != null) {
            Iterator it11 = list12.iterator();
            while (it11.hasNext()) {
                i11 += ((DivVisibilityAction) it11.next()).g();
            }
        }
        int b10 = this.S.b() + g + i11;
        this.T = Integer.valueOf(b10);
        return b10;
    }

    @Override // defpackage.egk
    public final Expression a() {
        return this.d;
    }

    @Override // defpackage.egk
    public final List b() {
        return this.R;
    }

    @Override // defpackage.egk
    public final Expression c() {
        return this.i;
    }

    @Override // defpackage.egk
    public final List d() {
        return this.O;
    }

    @Override // defpackage.egk
    public final DivEdgeInsets e() {
        return this.w;
    }

    @Override // defpackage.egk
    public final Expression f() {
        return this.B;
    }

    @Override // defpackage.egk
    public final Expression g() {
        return this.A;
    }

    @Override // defpackage.egk
    public final List getBackground() {
        return this.f;
    }

    @Override // defpackage.egk
    public final List getExtensions() {
        return this.n;
    }

    @Override // defpackage.egk
    public final DivSize getHeight() {
        return this.q;
    }

    @Override // defpackage.egk
    public final String getId() {
        return this.r;
    }

    @Override // defpackage.egk
    public final Expression getVisibility() {
        return this.P;
    }

    @Override // defpackage.egk
    public final DivSize getWidth() {
        return this.S;
    }

    @Override // defpackage.egk
    public final Expression h() {
        return this.b;
    }

    @Override // defpackage.egk
    public final List i() {
        return this.G;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition j() {
        return this.L;
    }

    @Override // defpackage.egk
    public final DivChangeTransition k() {
        return this.J;
    }

    @Override // defpackage.egk
    public final List l() {
        return this.m;
    }

    @Override // defpackage.egk
    public final DivTransform m() {
        return this.H;
    }

    @Override // defpackage.egk
    public final List n() {
        return this.M;
    }

    @Override // defpackage.egk
    public final Expression o() {
        return this.c;
    }

    @Override // defpackage.egk
    public final DivFocus p() {
        return this.o;
    }

    @Override // defpackage.egk
    public final DivAccessibility q() {
        return this.a;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((o0) ft6.b.W3.getValue()).b(ft6.a, this);
    }

    @Override // defpackage.egk
    public final DivEdgeInsets s() {
        return this.y;
    }

    @Override // defpackage.egk
    public final List t() {
        return this.F;
    }

    @Override // defpackage.egk
    public final DivLayoutProvider u() {
        return this.v;
    }

    @Override // defpackage.egk
    public final List v() {
        return this.N;
    }

    @Override // defpackage.egk
    public final DivVisibilityAction w() {
        return this.Q;
    }

    @Override // defpackage.egk
    public final List x() {
        return this.p;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition y() {
        return this.K;
    }

    @Override // defpackage.egk
    public final List z() {
        return this.e;
    }

    public DivGallery() {
        this(null, null, null, V, null, null, null, null, null, W, null, X, null, null, null, null, Y, null, null, Z, null, null, null, a0, null, b0, null, null, null, c0, d0, null, null, null, null, null, null, null, null, null, null, e0, null, null, f0);
    }
}
