package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSeparator;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.c3;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class m3k implements c4x {
    public Integer a;
    public Integer b;

    /* JADX WARN: Code restructure failed: missing block: B:511:0x0810, code lost:
    
        if (r3 == null) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x07b0, code lost:
    
        if (r3 == null) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x076d, code lost:
    
        if (r3 == null) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x072a, code lost:
    
        if (r3 == null) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x06b7, code lost:
    
        if (r3 == null) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0662, code lost:
    
        if (r3 == null) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x05f3, code lost:
    
        if (r3 == null) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0548, code lost:
    
        if (r3 == null) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0505, code lost:
    
        if (r3 == null) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x046a, code lost:
    
        if (r3 == null) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x03f9, code lost:
    
        if (r3 == null) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x03b6, code lost:
    
        if (r3 == null) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x034f, code lost:
    
        if (r3 == null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x02fa, code lost:
    
        if (r3 == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x02b7, code lost:
    
        if (r3 == null) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0274, code lost:
    
        if (r3 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0231, code lost:
    
        if (r3 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0188, code lost:
    
        if (r3 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0121, code lost:
    
        if (r3 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x008e, code lost:
    
        if (r3 == null) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(m3k m3kVar, rvo rvoVar, rvo rvoVar2) {
        if (m3kVar != null) {
            if (!(this instanceof n2k)) {
                if (this instanceof l2k) {
                    l2k l2kVar = (l2k) this;
                    egk d = m3kVar.d();
                    return l2kVar.c.B(d instanceof xrk ? (xrk) d : null, rvoVar, rvoVar2);
                }
                if (this instanceof x2k) {
                    x2k x2kVar = (x2k) this;
                    egk d2 = m3kVar.d();
                    return x2kVar.c.C(d2 instanceof ffl ? (ffl) d2 : null, rvoVar, rvoVar2);
                }
                if (this instanceof s2k) {
                    s2k s2kVar = (s2k) this;
                    egk d3 = m3kVar.d();
                    return s2kVar.c.B(d3 instanceof DivSeparator ? (DivSeparator) d3 : null, rvoVar, rvoVar2);
                }
                if (this instanceof i2k) {
                    i2k i2kVar = (i2k) this;
                    egk d4 = m3kVar.d();
                    return i2kVar.c.C(d4 instanceof DivContainer ? (DivContainer) d4 : null, rvoVar, rvoVar2);
                }
                if (this instanceof m2k) {
                    m2k m2kVar = (m2k) this;
                    egk d5 = m3kVar.d();
                    return m2kVar.c.C(d5 instanceof hsk ? (hsk) d5 : null, rvoVar, rvoVar2);
                }
                if (this instanceof k2k) {
                    k2k k2kVar = (k2k) this;
                    egk d6 = m3kVar.d();
                    return k2kVar.c.C(d6 instanceof DivGallery ? (DivGallery) d6 : null, rvoVar, rvoVar2);
                }
                if (this instanceof q2k) {
                    q2k q2kVar = (q2k) this;
                    egk d7 = m3kVar.d();
                    return q2kVar.c.C(d7 instanceof t1l ? (t1l) d7 : null, rvoVar, rvoVar2);
                }
                if (this instanceof w2k) {
                    w2k w2kVar = (w2k) this;
                    egk d8 = m3kVar.d();
                    return w2kVar.c.C(d8 instanceof mdl ? (mdl) d8 : null, rvoVar, rvoVar2);
                }
                if (this instanceof u2k) {
                    u2k u2kVar = (u2k) this;
                    egk d9 = m3kVar.d();
                    return u2kVar.c.C(d9 instanceof dbl ? (dbl) d9 : null, rvoVar, rvoVar2);
                }
                if (this instanceof j2k) {
                    j2k j2kVar = (j2k) this;
                    egk d10 = m3kVar.d();
                    return j2kVar.c.C(d10 instanceof clk ? (clk) d10 : null, rvoVar, rvoVar2);
                }
                if (this instanceof o2k) {
                    o2k o2kVar = (o2k) this;
                    egk d11 = m3kVar.d();
                    return o2kVar.c.B(d11 instanceof DivIndicator ? (DivIndicator) d11 : null, rvoVar, rvoVar2);
                }
                if (this instanceof t2k) {
                    t2k t2kVar = (t2k) this;
                    egk d12 = m3kVar.d();
                    return t2kVar.c.C(d12 instanceof hal ? (hal) d12 : null, rvoVar, rvoVar2);
                }
                if (this instanceof v2k) {
                    v2k v2kVar = (v2k) this;
                    egk d13 = m3kVar.d();
                    return v2kVar.c.B(d13 instanceof ycl ? (ycl) d13 : null, rvoVar, rvoVar2);
                }
                if (this instanceof p2k) {
                    p2k p2kVar = (p2k) this;
                    egk d14 = m3kVar.d();
                    return p2kVar.c.B(d14 instanceof muk ? (muk) d14 : null, rvoVar, rvoVar2);
                }
                if (this instanceof r2k) {
                    r2k r2kVar = (r2k) this;
                    egk d15 = m3kVar.d();
                    return r2kVar.c.C(d15 instanceof x7l ? (x7l) d15 : null, rvoVar, rvoVar2);
                }
                if (!(this instanceof y2k)) {
                    w511.b();
                    return false;
                }
                y2k y2kVar = (y2k) this;
                egk d16 = m3kVar.d();
                return y2kVar.c.C(d16 instanceof ynl ? (ynl) d16 : null, rvoVar, rvoVar2);
            }
            n2k n2kVar = (n2k) this;
            egk d17 = m3kVar.d();
            psk pskVar = d17 instanceof psk ? (psk) d17 : null;
            if (pskVar != null) {
                psk pskVar2 = n2kVar.c;
                DivAccessibility divAccessibility = pskVar2.a;
                DivAccessibility divAccessibility2 = pskVar.a;
                if (divAccessibility != null ? divAccessibility.a(divAccessibility2, rvoVar, rvoVar2) : divAccessibility2 == null) {
                    v3k v3kVar = pskVar2.b;
                    v3k v3kVar2 = pskVar.b;
                    if ((v3kVar != null ? v3kVar.a(v3kVar2, rvoVar, rvoVar2) : v3kVar2 == null) && pskVar2.c.a(pskVar.c, rvoVar, rvoVar2)) {
                        List list = pskVar2.d;
                        List list2 = pskVar.d;
                        if (list != null) {
                            if (list2 != null && list.size() == list2.size()) {
                                int i = 0;
                                for (Object obj : list) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        scc.m();
                                        throw null;
                                    }
                                    if (!((v3k) obj).a((v3k) list2.get(i), rvoVar, rvoVar2)) {
                                        break;
                                    }
                                    i = i2;
                                }
                                Expression expression = pskVar2.e;
                                DivAlignmentHorizontal divAlignmentHorizontal = expression != null ? (DivAlignmentHorizontal) expression.a(rvoVar) : null;
                                Expression expression2 = pskVar.e;
                                if (divAlignmentHorizontal == (expression2 != null ? (DivAlignmentHorizontal) expression2.a(rvoVar2) : null)) {
                                    Expression expression3 = pskVar2.f;
                                    DivAlignmentVertical divAlignmentVertical = expression3 != null ? (DivAlignmentVertical) expression3.a(rvoVar) : null;
                                    Expression expression4 = pskVar.f;
                                    if (divAlignmentVertical == (expression4 != null ? (DivAlignmentVertical) expression4.a(rvoVar2) : null) && ((Number) pskVar2.g.a(rvoVar)).doubleValue() == ((Number) pskVar.g.a(rvoVar2)).doubleValue()) {
                                        List list3 = pskVar2.h;
                                        List list4 = pskVar.h;
                                        if (list3 != null) {
                                            if (list4 != null && list3.size() == list4.size()) {
                                                int i3 = 0;
                                                for (Object obj2 : list3) {
                                                    int i4 = i3 + 1;
                                                    if (i3 < 0) {
                                                        scc.m();
                                                        throw null;
                                                    }
                                                    if (!((ydk) obj2).a((ydk) list4.get(i3), rvoVar, rvoVar2)) {
                                                        break;
                                                    }
                                                    i3 = i4;
                                                }
                                                hpk hpkVar = pskVar2.i;
                                                hpk hpkVar2 = pskVar.i;
                                                if (hpkVar != null ? hpkVar.a(hpkVar2, rvoVar, rvoVar2) : hpkVar2 == null) {
                                                    afk afkVar = pskVar2.j;
                                                    afk afkVar2 = pskVar.j;
                                                    if (afkVar != null ? afkVar.a(afkVar2, rvoVar, rvoVar2) : afkVar2 == null) {
                                                        List list5 = pskVar2.k;
                                                        List list6 = pskVar.k;
                                                        if (list5 != null) {
                                                            if (list6 != null && list5.size() == list6.size()) {
                                                                int i5 = 0;
                                                                for (Object obj3 : list5) {
                                                                    int i6 = i5 + 1;
                                                                    if (i5 < 0) {
                                                                        scc.m();
                                                                        throw null;
                                                                    }
                                                                    if (!((kfk) obj3).a((kfk) list6.get(i5), rvoVar, rvoVar2)) {
                                                                        break;
                                                                    }
                                                                    i5 = i6;
                                                                }
                                                                DivBorder divBorder = pskVar2.l;
                                                                DivBorder divBorder2 = pskVar.l;
                                                                if ((divBorder != null ? divBorder.a(divBorder2, rvoVar, rvoVar2) : divBorder2 == null) && ((Boolean) pskVar2.m.a(rvoVar)).booleanValue() == ((Boolean) pskVar.m.a(rvoVar2)).booleanValue()) {
                                                                    Expression expression5 = pskVar2.n;
                                                                    Long l = expression5 != null ? (Long) expression5.a(rvoVar) : null;
                                                                    Expression expression6 = pskVar.n;
                                                                    if (jl40.l(l, expression6 != null ? (Long) expression6.a(rvoVar2) : null) && pskVar2.o.a(rvoVar) == pskVar.o.a(rvoVar2) && pskVar2.p.a(rvoVar) == pskVar.p.a(rvoVar2)) {
                                                                        List list7 = pskVar2.q;
                                                                        List list8 = pskVar.q;
                                                                        if (list7 != null) {
                                                                            if (list8 != null && list7.size() == list8.size()) {
                                                                                int i7 = 0;
                                                                                for (Object obj4 : list7) {
                                                                                    int i8 = i7 + 1;
                                                                                    if (i7 < 0) {
                                                                                        scc.m();
                                                                                        throw null;
                                                                                    }
                                                                                    if (!((nnk) obj4).f((nnk) list8.get(i7), rvoVar, rvoVar2)) {
                                                                                        break;
                                                                                    }
                                                                                    i7 = i8;
                                                                                }
                                                                                List list9 = pskVar2.r;
                                                                                List list10 = pskVar.r;
                                                                                if (list9 != null) {
                                                                                    if (list10 != null && list9.size() == list10.size()) {
                                                                                        int i9 = 0;
                                                                                        for (Object obj5 : list9) {
                                                                                            int i10 = i9 + 1;
                                                                                            if (i9 < 0) {
                                                                                                scc.m();
                                                                                                throw null;
                                                                                            }
                                                                                            if (!((v3k) obj5).a((v3k) list10.get(i9), rvoVar, rvoVar2)) {
                                                                                                break;
                                                                                            }
                                                                                            i9 = i10;
                                                                                        }
                                                                                        List list11 = pskVar2.s;
                                                                                        List list12 = pskVar.s;
                                                                                        if (list11 != null) {
                                                                                            if (list12 != null && list11.size() == list12.size()) {
                                                                                                int i11 = 0;
                                                                                                for (Object obj6 : list11) {
                                                                                                    int i12 = i11 + 1;
                                                                                                    if (i11 < 0) {
                                                                                                        scc.m();
                                                                                                        throw null;
                                                                                                    }
                                                                                                    if (!((bpk) obj6).a((bpk) list12.get(i11))) {
                                                                                                        break;
                                                                                                    }
                                                                                                    i11 = i12;
                                                                                                }
                                                                                                List list13 = pskVar2.t;
                                                                                                List list14 = pskVar.t;
                                                                                                if (list13 != null) {
                                                                                                    if (list14 != null && list13.size() == list14.size()) {
                                                                                                        int i13 = 0;
                                                                                                        for (Object obj7 : list13) {
                                                                                                            int i14 = i13 + 1;
                                                                                                            if (i13 < 0) {
                                                                                                                scc.m();
                                                                                                                throw null;
                                                                                                            }
                                                                                                            if (!((qpk) obj7).a((qpk) list14.get(i13), rvoVar, rvoVar2)) {
                                                                                                                break;
                                                                                                            }
                                                                                                            i13 = i14;
                                                                                                        }
                                                                                                        DivFocus divFocus = pskVar2.u;
                                                                                                        DivFocus divFocus2 = pskVar.u;
                                                                                                        if (divFocus != null ? divFocus.a(divFocus2, rvoVar, rvoVar2) : divFocus2 == null) {
                                                                                                            List list15 = pskVar2.v;
                                                                                                            List list16 = pskVar.v;
                                                                                                            if (list15 != null) {
                                                                                                                if (list16 != null && list15.size() == list16.size()) {
                                                                                                                    int i15 = 0;
                                                                                                                    for (Object obj8 : list15) {
                                                                                                                        int i16 = i15 + 1;
                                                                                                                        if (i15 < 0) {
                                                                                                                            scc.m();
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        if (!((irk) obj8).a((irk) list16.get(i15))) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        i15 = i16;
                                                                                                                    }
                                                                                                                    if (pskVar2.w.a(pskVar.w, rvoVar, rvoVar2) && ((Boolean) pskVar2.x.a(rvoVar)).booleanValue() == ((Boolean) pskVar.x.a(rvoVar2)).booleanValue()) {
                                                                                                                        List list17 = pskVar2.y;
                                                                                                                        List list18 = pskVar.y;
                                                                                                                        if (list17 != null) {
                                                                                                                            if (list18 != null && list17.size() == list18.size()) {
                                                                                                                                int i17 = 0;
                                                                                                                                for (Object obj9 : list17) {
                                                                                                                                    int i18 = i17 + 1;
                                                                                                                                    if (i17 < 0) {
                                                                                                                                        scc.m();
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    if (!((v3k) obj9).a((v3k) list18.get(i17), rvoVar, rvoVar2)) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    i17 = i18;
                                                                                                                                }
                                                                                                                                List list19 = pskVar2.z;
                                                                                                                                List list20 = pskVar.z;
                                                                                                                                if (list19 != null) {
                                                                                                                                    if (list20 != null && list19.size() == list20.size()) {
                                                                                                                                        int i19 = 0;
                                                                                                                                        for (Object obj10 : list19) {
                                                                                                                                            int i20 = i19 + 1;
                                                                                                                                            if (i19 < 0) {
                                                                                                                                                scc.m();
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            if (!((v3k) obj10).a((v3k) list20.get(i19), rvoVar, rvoVar2)) {
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            i19 = i20;
                                                                                                                                        }
                                                                                                                                        if (jl40.l(pskVar2.A, pskVar.A) && jl40.l(pskVar2.B.a(rvoVar), pskVar.B.a(rvoVar2))) {
                                                                                                                                            DivLayoutProvider divLayoutProvider = pskVar2.C;
                                                                                                                                            DivLayoutProvider divLayoutProvider2 = pskVar.C;
                                                                                                                                            if (divLayoutProvider != null ? divLayoutProvider.a(divLayoutProvider2) : divLayoutProvider2 == null) {
                                                                                                                                                List list21 = pskVar2.D;
                                                                                                                                                List list22 = pskVar.D;
                                                                                                                                                if (list21 != null) {
                                                                                                                                                    if (list22 != null && list21.size() == list22.size()) {
                                                                                                                                                        int i21 = 0;
                                                                                                                                                        for (Object obj11 : list21) {
                                                                                                                                                            int i22 = i21 + 1;
                                                                                                                                                            if (i21 < 0) {
                                                                                                                                                                scc.m();
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            if (!((v3k) obj11).a((v3k) list22.get(i21), rvoVar, rvoVar2)) {
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            i21 = i22;
                                                                                                                                                        }
                                                                                                                                                        DivEdgeInsets divEdgeInsets = pskVar2.E;
                                                                                                                                                        DivEdgeInsets divEdgeInsets2 = pskVar.E;
                                                                                                                                                        if (divEdgeInsets != null ? divEdgeInsets.a(divEdgeInsets2, rvoVar, rvoVar2) : divEdgeInsets2 == null) {
                                                                                                                                                            DivEdgeInsets divEdgeInsets3 = pskVar2.F;
                                                                                                                                                            DivEdgeInsets divEdgeInsets4 = pskVar.F;
                                                                                                                                                            if ((divEdgeInsets3 != null ? divEdgeInsets3.a(divEdgeInsets4, rvoVar, rvoVar2) : divEdgeInsets4 == null) && ((Number) pskVar2.G.a(rvoVar)).intValue() == ((Number) pskVar.G.a(rvoVar2)).intValue() && ((Boolean) pskVar2.H.a(rvoVar)).booleanValue() == ((Boolean) pskVar.H.a(rvoVar2)).booleanValue()) {
                                                                                                                                                                List list23 = pskVar2.I;
                                                                                                                                                                List list24 = pskVar.I;
                                                                                                                                                                if (list23 != null) {
                                                                                                                                                                    if (list24 != null && list23.size() == list24.size()) {
                                                                                                                                                                        int i23 = 0;
                                                                                                                                                                        for (Object obj12 : list23) {
                                                                                                                                                                            int i24 = i23 + 1;
                                                                                                                                                                            if (i23 < 0) {
                                                                                                                                                                                scc.m();
                                                                                                                                                                                throw null;
                                                                                                                                                                            }
                                                                                                                                                                            if (!((v3k) obj12).a((v3k) list24.get(i23), rvoVar, rvoVar2)) {
                                                                                                                                                                                break;
                                                                                                                                                                            }
                                                                                                                                                                            i23 = i24;
                                                                                                                                                                        }
                                                                                                                                                                        List list25 = pskVar2.J;
                                                                                                                                                                        List list26 = pskVar.J;
                                                                                                                                                                        if (list25 != null) {
                                                                                                                                                                            if (list26 != null && list25.size() == list26.size()) {
                                                                                                                                                                                int i25 = 0;
                                                                                                                                                                                for (Object obj13 : list25) {
                                                                                                                                                                                    int i26 = i25 + 1;
                                                                                                                                                                                    if (i25 < 0) {
                                                                                                                                                                                        scc.m();
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (!((v3k) obj13).a((v3k) list26.get(i25), rvoVar, rvoVar2)) {
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    i25 = i26;
                                                                                                                                                                                }
                                                                                                                                                                                Expression expression7 = pskVar2.K;
                                                                                                                                                                                String str = expression7 != null ? (String) expression7.a(rvoVar) : null;
                                                                                                                                                                                Expression expression8 = pskVar.K;
                                                                                                                                                                                if (jl40.l(str, expression8 != null ? (String) expression8.a(rvoVar2) : null)) {
                                                                                                                                                                                    Expression expression9 = pskVar2.L;
                                                                                                                                                                                    String str2 = expression9 != null ? (String) expression9.a(rvoVar) : null;
                                                                                                                                                                                    Expression expression10 = pskVar.L;
                                                                                                                                                                                    if (jl40.l(str2, expression10 != null ? (String) expression10.a(rvoVar2) : null)) {
                                                                                                                                                                                        Expression expression11 = pskVar2.M;
                                                                                                                                                                                        Long l2 = expression11 != null ? (Long) expression11.a(rvoVar) : null;
                                                                                                                                                                                        Expression expression12 = pskVar.M;
                                                                                                                                                                                        if (jl40.l(l2, expression12 != null ? (Long) expression12.a(rvoVar2) : null) && pskVar2.N.a(rvoVar) == pskVar.N.a(rvoVar2)) {
                                                                                                                                                                                            List list27 = pskVar2.O;
                                                                                                                                                                                            List list28 = pskVar.O;
                                                                                                                                                                                            if (list27 != null) {
                                                                                                                                                                                                if (list28 != null && list27.size() == list28.size()) {
                                                                                                                                                                                                    int i27 = 0;
                                                                                                                                                                                                    for (Object obj14 : list27) {
                                                                                                                                                                                                        int i28 = i27 + 1;
                                                                                                                                                                                                        if (i27 < 0) {
                                                                                                                                                                                                            scc.m();
                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (!((v3k) obj14).a((v3k) list28.get(i27), rvoVar, rvoVar2)) {
                                                                                                                                                                                                            break;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        i27 = i28;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    Expression expression13 = pskVar2.P;
                                                                                                                                                                                                    Integer num = expression13 != null ? (Integer) expression13.a(rvoVar) : null;
                                                                                                                                                                                                    Expression expression14 = pskVar.P;
                                                                                                                                                                                                    if (jl40.l(num, expression14 != null ? (Integer) expression14.a(rvoVar2) : null) && pskVar2.Q.a(rvoVar) == pskVar.Q.a(rvoVar2)) {
                                                                                                                                                                                                        List list29 = pskVar2.R;
                                                                                                                                                                                                        List list30 = pskVar.R;
                                                                                                                                                                                                        if (list29 != null) {
                                                                                                                                                                                                            if (list30 != null && list29.size() == list30.size()) {
                                                                                                                                                                                                                int i29 = 0;
                                                                                                                                                                                                                for (Object obj15 : list29) {
                                                                                                                                                                                                                    int i30 = i29 + 1;
                                                                                                                                                                                                                    if (i29 < 0) {
                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (!((gil) obj15).a((gil) list30.get(i29), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    i29 = i30;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                DivTransform divTransform = pskVar2.S;
                                                                                                                                                                                                                DivTransform divTransform2 = pskVar.S;
                                                                                                                                                                                                                if (divTransform != null ? divTransform.a(divTransform2, rvoVar, rvoVar2) : divTransform2 == null) {
                                                                                                                                                                                                                    List list31 = pskVar2.T;
                                                                                                                                                                                                                    List list32 = pskVar.T;
                                                                                                                                                                                                                    if (list31 != null) {
                                                                                                                                                                                                                        if (list32 != null && list31.size() == list32.size()) {
                                                                                                                                                                                                                            int i31 = 0;
                                                                                                                                                                                                                            for (Object obj16 : list31) {
                                                                                                                                                                                                                                int i32 = i31 + 1;
                                                                                                                                                                                                                                if (i31 < 0) {
                                                                                                                                                                                                                                    scc.m();
                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (!((xjl) obj16).a((xjl) list32.get(i31), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                i31 = i32;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            DivChangeTransition divChangeTransition = pskVar2.U;
                                                                                                                                                                                                                            DivChangeTransition divChangeTransition2 = pskVar.U;
                                                                                                                                                                                                                            if (divChangeTransition != null ? divChangeTransition.a(divChangeTransition2, rvoVar, rvoVar2) : divChangeTransition2 == null) {
                                                                                                                                                                                                                                DivAppearanceTransition divAppearanceTransition = pskVar2.V;
                                                                                                                                                                                                                                DivAppearanceTransition divAppearanceTransition2 = pskVar.V;
                                                                                                                                                                                                                                if (divAppearanceTransition != null ? divAppearanceTransition.a(divAppearanceTransition2, rvoVar, rvoVar2) : divAppearanceTransition2 == null) {
                                                                                                                                                                                                                                    DivAppearanceTransition divAppearanceTransition3 = pskVar2.W;
                                                                                                                                                                                                                                    DivAppearanceTransition divAppearanceTransition4 = pskVar.W;
                                                                                                                                                                                                                                    if (divAppearanceTransition3 != null ? divAppearanceTransition3.a(divAppearanceTransition4, rvoVar, rvoVar2) : divAppearanceTransition4 == null) {
                                                                                                                                                                                                                                        List list33 = pskVar2.X;
                                                                                                                                                                                                                                        List list34 = pskVar.X;
                                                                                                                                                                                                                                        if (list33 != null) {
                                                                                                                                                                                                                                            if (list34 != null && list33.size() == list34.size()) {
                                                                                                                                                                                                                                                int i33 = 0;
                                                                                                                                                                                                                                                for (Object obj17 : list33) {
                                                                                                                                                                                                                                                    int i34 = i33 + 1;
                                                                                                                                                                                                                                                    if (i33 < 0) {
                                                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    if (((DivTransitionTrigger) obj17) != ((DivTransitionTrigger) list34.get(i33))) {
                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    i33 = i34;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                List list35 = pskVar2.Y;
                                                                                                                                                                                                                                                List list36 = pskVar.Y;
                                                                                                                                                                                                                                                if (list35 != null) {
                                                                                                                                                                                                                                                    if (list36 != null && list35.size() == list36.size()) {
                                                                                                                                                                                                                                                        int i35 = 0;
                                                                                                                                                                                                                                                        for (Object obj18 : list35) {
                                                                                                                                                                                                                                                            int i36 = i35 + 1;
                                                                                                                                                                                                                                                            if (i35 < 0) {
                                                                                                                                                                                                                                                                scc.m();
                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            if (!((lll) obj18).a((lll) list36.get(i35), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            i35 = i36;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        List list37 = pskVar2.Z;
                                                                                                                                                                                                                                                        List list38 = pskVar.Z;
                                                                                                                                                                                                                                                        if (list37 != null) {
                                                                                                                                                                                                                                                            if (list38 != null && list37.size() == list38.size()) {
                                                                                                                                                                                                                                                                int i37 = 0;
                                                                                                                                                                                                                                                                for (Object obj19 : list37) {
                                                                                                                                                                                                                                                                    int i38 = i37 + 1;
                                                                                                                                                                                                                                                                    if (i37 < 0) {
                                                                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    if (!((c3) obj19).a((c3) list38.get(i37), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    i37 = i38;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                if (pskVar2.a0.a(rvoVar) == pskVar.a0.a(rvoVar2)) {
                                                                                                                                                                                                                                                                    DivVisibilityAction divVisibilityAction = pskVar2.b0;
                                                                                                                                                                                                                                                                    DivVisibilityAction divVisibilityAction2 = pskVar.b0;
                                                                                                                                                                                                                                                                    if (divVisibilityAction != null ? divVisibilityAction.f(divVisibilityAction2, rvoVar, rvoVar2) : divVisibilityAction2 == null) {
                                                                                                                                                                                                                                                                        List list39 = pskVar2.c0;
                                                                                                                                                                                                                                                                        List list40 = pskVar.c0;
                                                                                                                                                                                                                                                                        if (list39 != null) {
                                                                                                                                                                                                                                                                            if (list40 != null && list39.size() == list40.size()) {
                                                                                                                                                                                                                                                                                int i39 = 0;
                                                                                                                                                                                                                                                                                for (Object obj20 : list39) {
                                                                                                                                                                                                                                                                                    int i40 = i39 + 1;
                                                                                                                                                                                                                                                                                    if (i39 < 0) {
                                                                                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    if (!((DivVisibilityAction) obj20).f((DivVisibilityAction) list40.get(i39), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    i39 = i40;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                if (pskVar2.d0.a(pskVar.d0, rvoVar, rvoVar2)) {
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

    public final int b() {
        int D;
        int i;
        int i2;
        int i3;
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(getClass()).hashCode();
        if (this instanceof n2k) {
            D = ((n2k) this).c.C();
        } else if (this instanceof l2k) {
            D = ((l2k) this).c.C();
        } else if (this instanceof x2k) {
            D = ((x2k) this).c.D();
        } else if (this instanceof s2k) {
            D = ((s2k) this).c.C();
        } else {
            int i4 = 0;
            if (this instanceof i2k) {
                DivContainer divContainer = ((i2k) this).c;
                Integer num2 = divContainer.e0;
                if (num2 != null) {
                    D = num2.intValue();
                } else {
                    int D2 = divContainer.D();
                    List list = divContainer.B;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            i4 += ((m3k) it.next()).b();
                        }
                    }
                    i = D2 + i4;
                    divContainer.e0 = Integer.valueOf(i);
                    D = i;
                }
            } else if (this instanceof m2k) {
                hsk hskVar = ((m2k) this).c;
                Integer num3 = hskVar.W;
                if (num3 != null) {
                    D = num3.intValue();
                } else {
                    int D3 = hskVar.D();
                    List list2 = hskVar.y;
                    if (list2 != null) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            i4 += ((m3k) it2.next()).b();
                        }
                    }
                    i = D3 + i4;
                    hskVar.W = Integer.valueOf(i);
                    D = i;
                }
            } else if (this instanceof k2k) {
                DivGallery divGallery = ((k2k) this).c;
                Integer num4 = divGallery.U;
                if (num4 != null) {
                    D = num4.intValue();
                } else {
                    int D4 = divGallery.D();
                    List list3 = divGallery.u;
                    if (list3 != null) {
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            i4 += ((m3k) it3.next()).b();
                        }
                    }
                    i = D4 + i4;
                    divGallery.U = Integer.valueOf(i);
                    D = i;
                }
            } else if (this instanceof q2k) {
                t1l t1lVar = ((q2k) this).c;
                Integer num5 = t1lVar.T;
                if (num5 != null) {
                    D = num5.intValue();
                } else {
                    int D5 = t1lVar.D();
                    List list4 = t1lVar.t;
                    if (list4 != null) {
                        Iterator it4 = list4.iterator();
                        while (it4.hasNext()) {
                            i4 += ((m3k) it4.next()).b();
                        }
                    }
                    i = D5 + i4;
                    t1lVar.T = Integer.valueOf(i);
                    D = i;
                }
            } else if (this instanceof w2k) {
                D = ((w2k) this).c.D();
            } else if (this instanceof u2k) {
                dbl dblVar = ((u2k) this).c;
                Integer num6 = dblVar.Y;
                if (num6 != null) {
                    D = num6.intValue();
                } else {
                    int D6 = dblVar.D();
                    int i5 = 0;
                    for (cbl cblVar : dblVar.I) {
                        Integer num7 = cblVar.f;
                        if (num7 != null) {
                            i3 = num7.intValue();
                        } else {
                            int hashCode2 = qoi0.a(cbl.class).hashCode();
                            pdk pdkVar = cblVar.a;
                            int b = hashCode2 + (pdkVar != null ? pdkVar.b() : 0);
                            pdk pdkVar2 = cblVar.b;
                            int b2 = b + (pdkVar2 != null ? pdkVar2.b() : 0);
                            m3k m3kVar = cblVar.c;
                            int hashCode3 = cblVar.d.hashCode() + b2 + (m3kVar != null ? m3kVar.b() : 0);
                            List list5 = cblVar.e;
                            if (list5 != null) {
                                Iterator it5 = list5.iterator();
                                i2 = 0;
                                while (it5.hasNext()) {
                                    i2 += ((v3k) it5.next()).b();
                                }
                            } else {
                                i2 = 0;
                            }
                            int i6 = hashCode3 + i2;
                            cblVar.f = Integer.valueOf(i6);
                            i3 = i6;
                        }
                        i5 += i3;
                    }
                    i = D6 + i5;
                    dblVar.Y = Integer.valueOf(i);
                    D = i;
                }
            } else if (this instanceof j2k) {
                clk clkVar = ((j2k) this).c;
                Integer num8 = clkVar.L;
                if (num8 != null) {
                    D = num8.intValue();
                } else {
                    int D7 = clkVar.D();
                    List list6 = clkVar.q;
                    if (list6 != null) {
                        Iterator it6 = list6.iterator();
                        while (it6.hasNext()) {
                            i4 += ((m3k) it6.next()).b();
                        }
                    }
                    i = D7 + i4;
                    clkVar.L = Integer.valueOf(i);
                    D = i;
                }
            } else if (this instanceof o2k) {
                D = ((o2k) this).c.C();
            } else if (this instanceof t2k) {
                D = ((t2k) this).c.D();
            } else if (this instanceof v2k) {
                D = ((v2k) this).c.C();
            } else if (this instanceof p2k) {
                D = ((p2k) this).c.C();
            } else if (this instanceof r2k) {
                D = ((r2k) this).c.D();
            } else {
                if (!(this instanceof y2k)) {
                    w511.b();
                    return 0;
                }
                D = ((y2k) this).c.D();
            }
        }
        int i7 = hashCode + D;
        this.b = Integer.valueOf(i7);
        return i7;
    }

    public final int c() {
        int D;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(getClass()).hashCode();
        if (this instanceof n2k) {
            D = ((n2k) this).c.C();
        } else if (this instanceof l2k) {
            D = ((l2k) this).c.C();
        } else if (this instanceof x2k) {
            D = ((x2k) this).c.D();
        } else if (this instanceof s2k) {
            D = ((s2k) this).c.C();
        } else if (this instanceof i2k) {
            D = ((i2k) this).c.D();
        } else if (this instanceof m2k) {
            D = ((m2k) this).c.D();
        } else if (this instanceof k2k) {
            D = ((k2k) this).c.D();
        } else if (this instanceof q2k) {
            D = ((q2k) this).c.D();
        } else if (this instanceof w2k) {
            D = ((w2k) this).c.E();
        } else if (this instanceof u2k) {
            D = ((u2k) this).c.D();
        } else if (this instanceof j2k) {
            D = ((j2k) this).c.D();
        } else if (this instanceof o2k) {
            D = ((o2k) this).c.C();
        } else if (this instanceof t2k) {
            D = ((t2k) this).c.D();
        } else if (this instanceof v2k) {
            D = ((v2k) this).c.C();
        } else if (this instanceof p2k) {
            D = ((p2k) this).c.C();
        } else if (this instanceof r2k) {
            D = ((r2k) this).c.D();
        } else {
            if (!(this instanceof y2k)) {
                w511.b();
                return 0;
            }
            D = ((y2k) this).c.D();
        }
        int i = hashCode + D;
        this.a = Integer.valueOf(i);
        return i;
    }

    public final egk d() {
        if (this instanceof n2k) {
            return ((n2k) this).c;
        }
        if (this instanceof l2k) {
            return ((l2k) this).c;
        }
        if (this instanceof x2k) {
            return ((x2k) this).c;
        }
        if (this instanceof s2k) {
            return ((s2k) this).c;
        }
        if (this instanceof i2k) {
            return ((i2k) this).c;
        }
        if (this instanceof m2k) {
            return ((m2k) this).c;
        }
        if (this instanceof k2k) {
            return ((k2k) this).c;
        }
        if (this instanceof q2k) {
            return ((q2k) this).c;
        }
        if (this instanceof w2k) {
            return ((w2k) this).c;
        }
        if (this instanceof u2k) {
            return ((u2k) this).c;
        }
        if (this instanceof j2k) {
            return ((j2k) this).c;
        }
        if (this instanceof o2k) {
            return ((o2k) this).c;
        }
        if (this instanceof t2k) {
            return ((t2k) this).c;
        }
        if (this instanceof v2k) {
            return ((v2k) this).c;
        }
        if (this instanceof p2k) {
            return ((p2k) this).c;
        }
        if (this instanceof r2k) {
            return ((r2k) this).c;
        }
        if (this instanceof y2k) {
            return ((y2k) this).c;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((exk) ft6.b.X9.getValue()).b(ft6.a, this);
    }
}
