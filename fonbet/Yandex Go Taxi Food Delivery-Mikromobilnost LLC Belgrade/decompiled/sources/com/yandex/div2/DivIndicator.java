package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import defpackage.bpk;
import defpackage.c4x;
import defpackage.dnk;
import defpackage.egk;
import defpackage.ft6;
import defpackage.gil;
import defpackage.i9l;
import defpackage.irk;
import defpackage.j9l;
import defpackage.jl40;
import defpackage.k7l;
import defpackage.kfk;
import defpackage.kvo;
import defpackage.lll;
import defpackage.lql;
import defpackage.ngd0;
import defpackage.nnk;
import defpackage.nzk;
import defpackage.qoi0;
import defpackage.rvo;
import defpackage.s8l;
import defpackage.scc;
import defpackage.sqk;
import defpackage.t8l;
import defpackage.tls;
import defpackage.utk;
import defpackage.v3k;
import defpackage.vbl;
import defpackage.vtk;
import defpackage.w511;
import defpackage.wtk;
import defpackage.xjl;
import defpackage.ydk;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class DivIndicator implements c4x, egk {
    public static final kvo U = ngd0.m(16768096);
    public static final kvo V = ngd0.m(Double.valueOf(1.3d));
    public static final kvo W = ngd0.m(Double.valueOf(1.0d));
    public static final kvo X = ngd0.m(Animation.SCALE);
    public static final j9l Y = new j9l(new lql(null, null, null));
    public static final kvo Z = ngd0.m(865180853);
    public static final kvo a0 = ngd0.m(Double.valueOf(0.5d));
    public static final s8l b0 = new s8l(new k7l(0));
    public static final sqk c0 = new sqk(ngd0.m(15L));
    public static final kvo d0 = ngd0.m(DivVisibility.VISIBLE);
    public static final i9l e0 = new i9l(new nzk(null, null, null));
    public final String A;
    public final Expression B;
    public final Expression C;
    public final List D;
    public final t8l E;
    public final sqk F;
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
    public final DivAccessibility a;
    public final Expression b;
    public final Expression c;
    public final k7l d;
    public final Expression e;
    public final Expression f;
    public final Expression g;
    public final Expression h;
    public final List i;
    public final List j;
    public final DivBorder k;
    public final Expression l;
    public final List m;
    public final List n;
    public final DivFocus o;
    public final List p;
    public final DivSize q;
    public final String r;
    public final Expression s;
    public final k7l t;
    public final k7l u;
    public final wtk v;
    public final DivLayoutProvider w;
    public final DivEdgeInsets x;
    public final Expression y;
    public final DivEdgeInsets z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/div2/DivIndicator$Animation;", "", "", "value", "Ljava/lang/String;", "Converter", "com/yandex/div2/x0", "SCALE", "WORM", "SLIDER", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Animation {
        SCALE("scale"),
        WORM("worm"),
        SLIDER("slider");

        private final String value;
        public static final x0 Converter = new x0();
        public static final tls TO_STRING = DivIndicator$Animation$Converter$TO_STRING$1.w;
        public static final tls FROM_STRING = DivIndicator$Animation$Converter$FROM_STRING$1.w;

        Animation(String str) {
            this.value = str;
        }
    }

    public DivIndicator(DivAccessibility divAccessibility, Expression expression, Expression expression2, k7l k7lVar, Expression expression3, Expression expression4, Expression expression5, Expression expression6, List list, List list2, DivBorder divBorder, Expression expression7, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression8, k7l k7lVar2, k7l k7lVar3, wtk wtkVar, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression9, DivEdgeInsets divEdgeInsets2, String str2, Expression expression10, Expression expression11, List list6, t8l t8lVar, sqk sqkVar, List list7, DivTransform divTransform, List list8, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list9, List list10, List list11, Expression expression12, DivVisibilityAction divVisibilityAction, List list12, DivSize divSize2) {
        this.a = divAccessibility;
        this.b = expression;
        this.c = expression2;
        this.d = k7lVar;
        this.e = expression3;
        this.f = expression4;
        this.g = expression5;
        this.h = expression6;
        this.i = list;
        this.j = list2;
        this.k = divBorder;
        this.l = expression7;
        this.m = list3;
        this.n = list4;
        this.o = divFocus;
        this.p = list5;
        this.q = divSize;
        this.r = str;
        this.s = expression8;
        this.t = k7lVar2;
        this.u = k7lVar3;
        this.v = wtkVar;
        this.w = divLayoutProvider;
        this.x = divEdgeInsets;
        this.y = expression9;
        this.z = divEdgeInsets2;
        this.A = str2;
        this.B = expression10;
        this.C = expression11;
        this.D = list6;
        this.E = t8lVar;
        this.F = sqkVar;
        this.G = list7;
        this.H = divTransform;
        this.I = list8;
        this.J = divChangeTransition;
        this.K = divAppearanceTransition;
        this.L = divAppearanceTransition2;
        this.M = list9;
        this.N = list10;
        this.O = list11;
        this.P = expression12;
        this.Q = divVisibilityAction;
        this.R = list12;
        this.S = divSize2;
    }

    @Override // defpackage.egk
    public final DivBorder A() {
        return this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:355:0x05f6, code lost:
    
        if (r3 == null) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0596, code lost:
    
        if (r3 == null) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0553, code lost:
    
        if (r3 == null) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0510, code lost:
    
        if (r3 == null) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x049d, code lost:
    
        if (r3 == null) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0448, code lost:
    
        if (r3 == null) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x03f1, code lost:
    
        if (r3 == null) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x024e, code lost:
    
        if (r3 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x01f9, code lost:
    
        if (r3 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x01b6, code lost:
    
        if (r3 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0143, code lost:
    
        if (r3 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0100, code lost:
    
        if (r3 == null) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0318  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(DivIndicator divIndicator, rvo rvoVar, rvo rvoVar2) {
        boolean z;
        c4x a;
        c4x a2;
        if (divIndicator != null) {
            DivAccessibility divAccessibility = divIndicator.a;
            DivAccessibility divAccessibility2 = this.a;
            if ((divAccessibility2 != null ? divAccessibility2.a(divAccessibility, rvoVar, rvoVar2) : divAccessibility == null) && ((Number) this.b.a(rvoVar)).intValue() == ((Number) divIndicator.b.a(rvoVar2)).intValue() && ((Number) this.c.a(rvoVar)).doubleValue() == ((Number) divIndicator.c.a(rvoVar2)).doubleValue()) {
                k7l k7lVar = divIndicator.d;
                k7l k7lVar2 = this.d;
                if (k7lVar2 != null ? k7lVar2.a(k7lVar, rvoVar, rvoVar2) : k7lVar == null) {
                    Expression expression = this.e;
                    DivAlignmentHorizontal divAlignmentHorizontal = expression != null ? (DivAlignmentHorizontal) expression.a(rvoVar) : null;
                    Expression expression2 = divIndicator.e;
                    if (divAlignmentHorizontal == (expression2 != null ? (DivAlignmentHorizontal) expression2.a(rvoVar2) : null)) {
                        Expression expression3 = this.f;
                        DivAlignmentVertical divAlignmentVertical = expression3 != null ? (DivAlignmentVertical) expression3.a(rvoVar) : null;
                        Expression expression4 = divIndicator.f;
                        if (divAlignmentVertical == (expression4 != null ? (DivAlignmentVertical) expression4.a(rvoVar2) : null) && ((Number) this.g.a(rvoVar)).doubleValue() == ((Number) divIndicator.g.a(rvoVar2)).doubleValue() && this.h.a(rvoVar) == divIndicator.h.a(rvoVar2)) {
                            List list = divIndicator.i;
                            List list2 = this.i;
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
                                    List list3 = divIndicator.j;
                                    List list4 = this.j;
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
                                            DivBorder divBorder = divIndicator.k;
                                            DivBorder divBorder2 = this.k;
                                            if (divBorder2 != null ? divBorder2.a(divBorder, rvoVar, rvoVar2) : divBorder == null) {
                                                Expression expression5 = this.l;
                                                Long l = expression5 != null ? (Long) expression5.a(rvoVar) : null;
                                                Expression expression6 = divIndicator.l;
                                                if (jl40.l(l, expression6 != null ? (Long) expression6.a(rvoVar2) : null)) {
                                                    List list5 = divIndicator.m;
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
                                                            List list7 = divIndicator.n;
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
                                                                    DivFocus divFocus = divIndicator.o;
                                                                    DivFocus divFocus2 = this.o;
                                                                    if (divFocus2 != null ? divFocus2.a(divFocus, rvoVar, rvoVar2) : divFocus == null) {
                                                                        List list9 = divIndicator.p;
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
                                                                                if (this.q.a(divIndicator.q, rvoVar, rvoVar2) && jl40.l(this.r, divIndicator.r) && ((Number) this.s.a(rvoVar)).intValue() == ((Number) divIndicator.s.a(rvoVar2)).intValue()) {
                                                                                    k7l k7lVar3 = divIndicator.t;
                                                                                    k7l k7lVar4 = this.t;
                                                                                    if (k7lVar4 != null ? k7lVar4.a(k7lVar3, rvoVar, rvoVar2) : k7lVar3 == null) {
                                                                                        k7l k7lVar5 = divIndicator.u;
                                                                                        k7l k7lVar6 = this.u;
                                                                                        if (k7lVar6 != null ? k7lVar6.a(k7lVar5, rvoVar, rvoVar2) : k7lVar5 == null) {
                                                                                            wtk wtkVar = divIndicator.v;
                                                                                            wtk wtkVar2 = this.v;
                                                                                            if (wtkVar2 != null) {
                                                                                                if (wtkVar != null) {
                                                                                                    if (wtkVar2 instanceof utk) {
                                                                                                        dnk dnkVar = ((utk) wtkVar2).b;
                                                                                                        if (wtkVar instanceof utk) {
                                                                                                            a2 = ((utk) wtkVar).b;
                                                                                                        } else {
                                                                                                            if (!(wtkVar instanceof vtk)) {
                                                                                                                w511.b();
                                                                                                                return false;
                                                                                                            }
                                                                                                            a2 = ((vtk) wtkVar).a();
                                                                                                        }
                                                                                                        dnk dnkVar2 = a2 instanceof dnk ? (dnk) a2 : null;
                                                                                                        if (dnkVar2 != null) {
                                                                                                            z = dnkVar.a.a(dnkVar2.a, rvoVar, rvoVar2);
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (!(wtkVar2 instanceof vtk)) {
                                                                                                            w511.b();
                                                                                                            return false;
                                                                                                        }
                                                                                                        vbl a3 = ((vtk) wtkVar2).a();
                                                                                                        if (wtkVar instanceof utk) {
                                                                                                            a = ((utk) wtkVar).b;
                                                                                                        } else {
                                                                                                            if (!(wtkVar instanceof vtk)) {
                                                                                                                w511.b();
                                                                                                                return false;
                                                                                                            }
                                                                                                            a = ((vtk) wtkVar).a();
                                                                                                        }
                                                                                                        z = a3.a(a instanceof vbl ? (vbl) a : null, rvoVar, rvoVar2);
                                                                                                    }
                                                                                                    if (z) {
                                                                                                        DivLayoutProvider divLayoutProvider = divIndicator.w;
                                                                                                        DivLayoutProvider divLayoutProvider2 = this.w;
                                                                                                        if (divLayoutProvider2 != null ? divLayoutProvider2.a(divLayoutProvider) : divLayoutProvider == null) {
                                                                                                            DivEdgeInsets divEdgeInsets = divIndicator.x;
                                                                                                            DivEdgeInsets divEdgeInsets2 = this.x;
                                                                                                            if ((divEdgeInsets2 != null ? divEdgeInsets2.a(divEdgeInsets, rvoVar, rvoVar2) : divEdgeInsets == null) && ((Number) this.y.a(rvoVar)).doubleValue() == ((Number) divIndicator.y.a(rvoVar2)).doubleValue()) {
                                                                                                                DivEdgeInsets divEdgeInsets3 = divIndicator.z;
                                                                                                                DivEdgeInsets divEdgeInsets4 = this.z;
                                                                                                                if ((divEdgeInsets4 != null ? divEdgeInsets4.a(divEdgeInsets3, rvoVar, rvoVar2) : divEdgeInsets3 == null) && jl40.l(this.A, divIndicator.A)) {
                                                                                                                    Expression expression7 = this.B;
                                                                                                                    String str = expression7 != null ? (String) expression7.a(rvoVar) : null;
                                                                                                                    Expression expression8 = divIndicator.B;
                                                                                                                    if (jl40.l(str, expression8 != null ? (String) expression8.a(rvoVar2) : null)) {
                                                                                                                        Expression expression9 = this.C;
                                                                                                                        Long l2 = expression9 != null ? (Long) expression9.a(rvoVar) : null;
                                                                                                                        Expression expression10 = divIndicator.C;
                                                                                                                        if (jl40.l(l2, expression10 != null ? (Long) expression10.a(rvoVar2) : null)) {
                                                                                                                            List list11 = divIndicator.D;
                                                                                                                            List list12 = this.D;
                                                                                                                            if (list12 != null) {
                                                                                                                                if (list11 != null && list12.size() == list11.size()) {
                                                                                                                                    int i11 = 0;
                                                                                                                                    for (Object obj6 : list12) {
                                                                                                                                        int i12 = i11 + 1;
                                                                                                                                        if (i11 < 0) {
                                                                                                                                            scc.m();
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        if (!((v3k) obj6).a((v3k) list11.get(i11), rvoVar, rvoVar2)) {
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        i11 = i12;
                                                                                                                                    }
                                                                                                                                    if (this.E.a(divIndicator.E, rvoVar, rvoVar2) && this.F.a(divIndicator.F, rvoVar, rvoVar2)) {
                                                                                                                                        List list13 = divIndicator.G;
                                                                                                                                        List list14 = this.G;
                                                                                                                                        if (list14 != null) {
                                                                                                                                            if (list13 != null && list14.size() == list13.size()) {
                                                                                                                                                int i13 = 0;
                                                                                                                                                for (Object obj7 : list14) {
                                                                                                                                                    int i14 = i13 + 1;
                                                                                                                                                    if (i13 < 0) {
                                                                                                                                                        scc.m();
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    if (!((gil) obj7).a((gil) list13.get(i13), rvoVar, rvoVar2)) {
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    i13 = i14;
                                                                                                                                                }
                                                                                                                                                DivTransform divTransform = divIndicator.H;
                                                                                                                                                DivTransform divTransform2 = this.H;
                                                                                                                                                if (divTransform2 != null ? divTransform2.a(divTransform, rvoVar, rvoVar2) : divTransform == null) {
                                                                                                                                                    List list15 = divIndicator.I;
                                                                                                                                                    List list16 = this.I;
                                                                                                                                                    if (list16 != null) {
                                                                                                                                                        if (list15 != null && list16.size() == list15.size()) {
                                                                                                                                                            int i15 = 0;
                                                                                                                                                            for (Object obj8 : list16) {
                                                                                                                                                                int i16 = i15 + 1;
                                                                                                                                                                if (i15 < 0) {
                                                                                                                                                                    scc.m();
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (!((xjl) obj8).a((xjl) list15.get(i15), rvoVar, rvoVar2)) {
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                                i15 = i16;
                                                                                                                                                            }
                                                                                                                                                            DivChangeTransition divChangeTransition = divIndicator.J;
                                                                                                                                                            DivChangeTransition divChangeTransition2 = this.J;
                                                                                                                                                            if (divChangeTransition2 != null ? divChangeTransition2.a(divChangeTransition, rvoVar, rvoVar2) : divChangeTransition == null) {
                                                                                                                                                                DivAppearanceTransition divAppearanceTransition = divIndicator.K;
                                                                                                                                                                DivAppearanceTransition divAppearanceTransition2 = this.K;
                                                                                                                                                                if (divAppearanceTransition2 != null ? divAppearanceTransition2.a(divAppearanceTransition, rvoVar, rvoVar2) : divAppearanceTransition == null) {
                                                                                                                                                                    DivAppearanceTransition divAppearanceTransition3 = divIndicator.L;
                                                                                                                                                                    DivAppearanceTransition divAppearanceTransition4 = this.L;
                                                                                                                                                                    if (divAppearanceTransition4 != null ? divAppearanceTransition4.a(divAppearanceTransition3, rvoVar, rvoVar2) : divAppearanceTransition3 == null) {
                                                                                                                                                                        List list17 = divIndicator.M;
                                                                                                                                                                        List list18 = this.M;
                                                                                                                                                                        if (list18 != null) {
                                                                                                                                                                            if (list17 != null && list18.size() == list17.size()) {
                                                                                                                                                                                int i17 = 0;
                                                                                                                                                                                for (Object obj9 : list18) {
                                                                                                                                                                                    int i18 = i17 + 1;
                                                                                                                                                                                    if (i17 < 0) {
                                                                                                                                                                                        scc.m();
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (((DivTransitionTrigger) obj9) != ((DivTransitionTrigger) list17.get(i17))) {
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    i17 = i18;
                                                                                                                                                                                }
                                                                                                                                                                                List list19 = divIndicator.N;
                                                                                                                                                                                List list20 = this.N;
                                                                                                                                                                                if (list20 != null) {
                                                                                                                                                                                    if (list19 != null && list20.size() == list19.size()) {
                                                                                                                                                                                        int i19 = 0;
                                                                                                                                                                                        for (Object obj10 : list20) {
                                                                                                                                                                                            int i20 = i19 + 1;
                                                                                                                                                                                            if (i19 < 0) {
                                                                                                                                                                                                scc.m();
                                                                                                                                                                                                throw null;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (!((lll) obj10).a((lll) list19.get(i19), rvoVar, rvoVar2)) {
                                                                                                                                                                                                break;
                                                                                                                                                                                            }
                                                                                                                                                                                            i19 = i20;
                                                                                                                                                                                        }
                                                                                                                                                                                        List list21 = divIndicator.O;
                                                                                                                                                                                        List list22 = this.O;
                                                                                                                                                                                        if (list22 != null) {
                                                                                                                                                                                            if (list21 != null && list22.size() == list21.size()) {
                                                                                                                                                                                                int i21 = 0;
                                                                                                                                                                                                for (Object obj11 : list22) {
                                                                                                                                                                                                    int i22 = i21 + 1;
                                                                                                                                                                                                    if (i21 < 0) {
                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (!((c3) obj11).a((c3) list21.get(i21), rvoVar, rvoVar2)) {
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    i21 = i22;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (this.P.a(rvoVar) == divIndicator.P.a(rvoVar2)) {
                                                                                                                                                                                                    DivVisibilityAction divVisibilityAction = divIndicator.Q;
                                                                                                                                                                                                    DivVisibilityAction divVisibilityAction2 = this.Q;
                                                                                                                                                                                                    if (divVisibilityAction2 != null ? divVisibilityAction2.f(divVisibilityAction, rvoVar, rvoVar2) : divVisibilityAction == null) {
                                                                                                                                                                                                        List list23 = divIndicator.R;
                                                                                                                                                                                                        List list24 = this.R;
                                                                                                                                                                                                        if (list24 != null) {
                                                                                                                                                                                                            if (list23 != null && list24.size() == list23.size()) {
                                                                                                                                                                                                                int i23 = 0;
                                                                                                                                                                                                                for (Object obj12 : list24) {
                                                                                                                                                                                                                    int i24 = i23 + 1;
                                                                                                                                                                                                                    if (i23 < 0) {
                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (!((DivVisibilityAction) obj12).f((DivVisibilityAction) list23.get(i23), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    i23 = i24;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (this.S.a(divIndicator.S, rvoVar, rvoVar2)) {
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
                                                                                                z = false;
                                                                                                if (z) {
                                                                                                }
                                                                                            } else {
                                                                                                if (wtkVar == null) {
                                                                                                    z = true;
                                                                                                    if (z) {
                                                                                                    }
                                                                                                }
                                                                                                z = false;
                                                                                                if (z) {
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

    /* JADX WARN: Removed duplicated region for block: B:103:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int C() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        List list;
        int i7;
        List list2;
        int i8;
        List list3;
        int i9;
        List list4;
        int i10;
        List list5;
        int i11;
        List list6;
        int b;
        Integer num = this.T;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(DivIndicator.class).hashCode();
        int i12 = 0;
        DivAccessibility divAccessibility = this.a;
        int hashCode2 = this.c.hashCode() + this.b.hashCode() + hashCode + (divAccessibility != null ? divAccessibility.b() : 0);
        k7l k7lVar = this.d;
        int b2 = hashCode2 + (k7lVar != null ? k7lVar.b() : 0);
        Expression expression = this.e;
        int hashCode3 = b2 + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.f;
        int hashCode4 = this.h.hashCode() + this.g.hashCode() + hashCode3 + (expression2 != null ? expression2.hashCode() : 0);
        List list7 = this.i;
        if (list7 != null) {
            Iterator it = list7.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((ydk) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i13 = hashCode4 + i;
        List list8 = this.j;
        if (list8 != null) {
            Iterator it2 = list8.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((kfk) it2.next()).b();
            }
        } else {
            i2 = 0;
        }
        int i14 = i13 + i2;
        DivBorder divBorder = this.k;
        int b3 = i14 + (divBorder != null ? divBorder.b() : 0);
        Expression expression3 = this.l;
        int hashCode5 = b3 + (expression3 != null ? expression3.hashCode() : 0);
        List list9 = this.m;
        if (list9 != null) {
            Iterator it3 = list9.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((nnk) it3.next()).g();
            }
        } else {
            i3 = 0;
        }
        int i15 = hashCode5 + i3;
        List list10 = this.n;
        if (list10 != null) {
            Iterator it4 = list10.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((bpk) it4.next()).b();
            }
        } else {
            i4 = 0;
        }
        int i16 = i15 + i4;
        DivFocus divFocus = this.o;
        int b4 = i16 + (divFocus != null ? divFocus.b() : 0);
        List list11 = this.p;
        if (list11 != null) {
            Iterator it5 = list11.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((irk) it5.next()).b();
            }
        } else {
            i5 = 0;
        }
        int b5 = this.q.b() + b4 + i5;
        String str = this.r;
        int hashCode6 = this.s.hashCode() + b5 + (str != null ? str.hashCode() : 0);
        k7l k7lVar2 = this.t;
        int b6 = hashCode6 + (k7lVar2 != null ? k7lVar2.b() : 0);
        k7l k7lVar3 = this.u;
        int b7 = b6 + (k7lVar3 != null ? k7lVar3.b() : 0);
        wtk wtkVar = this.v;
        if (wtkVar != null) {
            Integer num2 = wtkVar.a;
            if (num2 != null) {
                i6 = num2.intValue();
            } else {
                int hashCode7 = qoi0.a(wtkVar.getClass()).hashCode();
                if (wtkVar instanceof utk) {
                    dnk dnkVar = ((utk) wtkVar).b;
                    Integer num3 = dnkVar.b;
                    if (num3 != null) {
                        b = num3.intValue();
                    } else {
                        int hashCode8 = qoi0.a(dnk.class).hashCode() + dnkVar.a.b();
                        dnkVar.b = Integer.valueOf(hashCode8);
                        b = hashCode8;
                    }
                } else if (wtkVar instanceof vtk) {
                    b = ((vtk) wtkVar).a().b();
                } else {
                    w511.b();
                }
                int i17 = hashCode7 + b;
                wtkVar.a = Integer.valueOf(i17);
                i6 = i17;
            }
            int i18 = b7 + i6;
            DivLayoutProvider divLayoutProvider = this.w;
            int b8 = i18 + (divLayoutProvider == null ? divLayoutProvider.b() : 0);
            DivEdgeInsets divEdgeInsets = this.x;
            int hashCode9 = this.y.hashCode() + b8 + (divEdgeInsets == null ? divEdgeInsets.b() : 0);
            DivEdgeInsets divEdgeInsets2 = this.z;
            int b9 = hashCode9 + (divEdgeInsets2 == null ? divEdgeInsets2.b() : 0);
            String str2 = this.A;
            int hashCode10 = b9 + (str2 == null ? str2.hashCode() : 0);
            Expression expression4 = this.B;
            int hashCode11 = hashCode10 + (expression4 == null ? expression4.hashCode() : 0);
            Expression expression5 = this.C;
            int hashCode12 = hashCode11 + (expression5 == null ? expression5.hashCode() : 0);
            list = this.D;
            if (list == null) {
                Iterator it6 = list.iterator();
                i7 = 0;
                while (it6.hasNext()) {
                    i7 += ((v3k) it6.next()).b();
                }
            } else {
                i7 = 0;
            }
            int b10 = this.F.b() + this.E.b() + hashCode12 + i7;
            list2 = this.G;
            if (list2 == null) {
                Iterator it7 = list2.iterator();
                i8 = 0;
                while (it7.hasNext()) {
                    i8 += ((gil) it7.next()).b();
                }
            } else {
                i8 = 0;
            }
            int i19 = b10 + i8;
            DivTransform divTransform = this.H;
            int b11 = i19 + (divTransform == null ? divTransform.b() : 0);
            list3 = this.I;
            if (list3 == null) {
                Iterator it8 = list3.iterator();
                i9 = 0;
                while (it8.hasNext()) {
                    i9 += ((xjl) it8.next()).b();
                }
            } else {
                i9 = 0;
            }
            int i20 = b11 + i9;
            DivChangeTransition divChangeTransition = this.J;
            int b12 = i20 + (divChangeTransition == null ? divChangeTransition.b() : 0);
            DivAppearanceTransition divAppearanceTransition = this.K;
            int b13 = b12 + (divAppearanceTransition == null ? divAppearanceTransition.b() : 0);
            DivAppearanceTransition divAppearanceTransition2 = this.L;
            int b14 = b13 + (divAppearanceTransition2 == null ? divAppearanceTransition2.b() : 0);
            List list12 = this.M;
            int hashCode13 = b14 + (list12 == null ? list12.hashCode() : 0);
            list4 = this.N;
            if (list4 == null) {
                Iterator it9 = list4.iterator();
                i10 = 0;
                while (it9.hasNext()) {
                    i10 += ((lll) it9.next()).b();
                }
            } else {
                i10 = 0;
            }
            int i21 = hashCode13 + i10;
            list5 = this.O;
            if (list5 == null) {
                Iterator it10 = list5.iterator();
                i11 = 0;
                while (it10.hasNext()) {
                    i11 += ((c3) it10.next()).b();
                }
            } else {
                i11 = 0;
            }
            int hashCode14 = this.P.hashCode() + i21 + i11;
            DivVisibilityAction divVisibilityAction = this.Q;
            int g = hashCode14 + (divVisibilityAction == null ? divVisibilityAction.g() : 0);
            list6 = this.R;
            if (list6 != null) {
                Iterator it11 = list6.iterator();
                while (it11.hasNext()) {
                    i12 += ((DivVisibilityAction) it11.next()).g();
                }
            }
            int b15 = this.S.b() + g + i12;
            this.T = Integer.valueOf(b15);
            return b15;
        }
        i6 = 0;
        int i182 = b7 + i6;
        DivLayoutProvider divLayoutProvider2 = this.w;
        int b82 = i182 + (divLayoutProvider2 == null ? divLayoutProvider2.b() : 0);
        DivEdgeInsets divEdgeInsets3 = this.x;
        int hashCode92 = this.y.hashCode() + b82 + (divEdgeInsets3 == null ? divEdgeInsets3.b() : 0);
        DivEdgeInsets divEdgeInsets22 = this.z;
        int b92 = hashCode92 + (divEdgeInsets22 == null ? divEdgeInsets22.b() : 0);
        String str22 = this.A;
        int hashCode102 = b92 + (str22 == null ? str22.hashCode() : 0);
        Expression expression42 = this.B;
        int hashCode112 = hashCode102 + (expression42 == null ? expression42.hashCode() : 0);
        Expression expression52 = this.C;
        int hashCode122 = hashCode112 + (expression52 == null ? expression52.hashCode() : 0);
        list = this.D;
        if (list == null) {
        }
        int b102 = this.F.b() + this.E.b() + hashCode122 + i7;
        list2 = this.G;
        if (list2 == null) {
        }
        int i192 = b102 + i8;
        DivTransform divTransform2 = this.H;
        int b112 = i192 + (divTransform2 == null ? divTransform2.b() : 0);
        list3 = this.I;
        if (list3 == null) {
        }
        int i202 = b112 + i9;
        DivChangeTransition divChangeTransition2 = this.J;
        int b122 = i202 + (divChangeTransition2 == null ? divChangeTransition2.b() : 0);
        DivAppearanceTransition divAppearanceTransition3 = this.K;
        int b132 = b122 + (divAppearanceTransition3 == null ? divAppearanceTransition3.b() : 0);
        DivAppearanceTransition divAppearanceTransition22 = this.L;
        int b142 = b132 + (divAppearanceTransition22 == null ? divAppearanceTransition22.b() : 0);
        List list122 = this.M;
        int hashCode132 = b142 + (list122 == null ? list122.hashCode() : 0);
        list4 = this.N;
        if (list4 == null) {
        }
        int i212 = hashCode132 + i10;
        list5 = this.O;
        if (list5 == null) {
        }
        int hashCode142 = this.P.hashCode() + i212 + i11;
        DivVisibilityAction divVisibilityAction2 = this.Q;
        int g2 = hashCode142 + (divVisibilityAction2 == null ? divVisibilityAction2.g() : 0);
        list6 = this.R;
        if (list6 != null) {
        }
        int b152 = this.S.b() + g2 + i12;
        this.T = Integer.valueOf(b152);
        return b152;
    }

    @Override // defpackage.egk
    public final Expression a() {
        return this.g;
    }

    @Override // defpackage.egk
    public final List b() {
        return this.R;
    }

    @Override // defpackage.egk
    public final Expression c() {
        return this.l;
    }

    @Override // defpackage.egk
    public final List d() {
        return this.O;
    }

    @Override // defpackage.egk
    public final DivEdgeInsets e() {
        return this.x;
    }

    @Override // defpackage.egk
    public final Expression f() {
        return this.C;
    }

    @Override // defpackage.egk
    public final Expression g() {
        return this.B;
    }

    @Override // defpackage.egk
    public final List getBackground() {
        return this.j;
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
        return this.e;
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
        return this.f;
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
        return ((y0) ft6.b.o4.getValue()).b(ft6.a, this);
    }

    @Override // defpackage.egk
    public final DivEdgeInsets s() {
        return this.z;
    }

    @Override // defpackage.egk
    public final List t() {
        return this.D;
    }

    @Override // defpackage.egk
    public final DivLayoutProvider u() {
        return this.w;
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
        return this.i;
    }

    public DivIndicator() {
        this(null, U, V, null, null, null, W, X, null, null, null, null, null, null, null, null, Y, null, Z, null, null, null, null, null, a0, null, null, null, null, null, b0, c0, null, null, null, null, null, null, null, null, null, d0, null, null, e0);
    }
}
