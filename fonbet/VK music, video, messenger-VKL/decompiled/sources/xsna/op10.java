package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.LayoutInfoFlags;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.kt6;
import xsna.tra0;

/* compiled from: Measurer.kt */
/* loaded from: classes11.dex */
public final class op10 implements kt6.b, a4m {
    public goy a;
    public final androidx.constraintlayout.core.widgets.d b;
    public Map<zo10, tra0> c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final ftk0 f;
    public final int[] g;
    public final int[] h;
    public float i;

    /* compiled from: Measurer.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public op10(azl azlVar) {
        androidx.constraintlayout.core.widgets.d dVar = new androidx.constraintlayout.core.widgets.d(0, 0);
        dVar.v0 = new ArrayList<>();
        dVar.w0 = new kt6(dVar);
        dVar.x0 = new lzl(dVar);
        dVar.z0 = null;
        dVar.A0 = false;
        dVar.B0 = new androidx.constraintlayout.core.c();
        dVar.E0 = 0;
        dVar.F0 = 0;
        dVar.G0 = new androidx.constraintlayout.core.widgets.c[4];
        dVar.H0 = new androidx.constraintlayout.core.widgets.c[4];
        dVar.I0 = 257;
        dVar.J0 = false;
        dVar.K0 = false;
        dVar.L0 = null;
        dVar.M0 = null;
        dVar.N0 = null;
        dVar.O0 = null;
        dVar.P0 = new HashSet<>();
        dVar.Q0 = new kt6.a();
        dVar.z0 = this;
        dVar.x0.f = this;
        this.b = dVar;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new ftk0(azlVar);
        this.g = new int[2];
        this.h = new int[2];
        this.i = Float.NaN;
    }

    public static void d(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, int i2, int i3, boolean z, boolean z2, int i4, int[] iArr) {
        int i5 = a.$EnumSwitchMapping$0[dimensionBehaviour.ordinal()];
        if (i5 == 1) {
            iArr[0] = i;
            iArr[1] = i;
            return;
        }
        if (i5 == 2) {
            iArr[0] = 0;
            iArr[1] = i4;
            return;
        }
        if (i5 == 3) {
            boolean z3 = z2 || ((i3 == 1 || i3 == 2) && (i3 == 2 || i2 != 1 || z));
            iArr[0] = z3 ? i : 0;
            if (!z3) {
                i = i4;
            }
            iArr[1] = i;
            return;
        }
        if (i5 == 4) {
            iArr[0] = i4;
            iArr[1] = i4;
        } else {
            throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        if (r28.t == 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019f  */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    @Override // xsna.kt6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ConstraintWidget constraintWidget, kt6.a aVar) {
        boolean z;
        boolean z2;
        int i;
        Object obj;
        ?? r18;
        Object obj2;
        String str = constraintWidget.k;
        LinkedHashMap linkedHashMap = this.d;
        Integer[] numArr = (Integer[]) linkedHashMap.get(str);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.a;
        int i2 = aVar.c;
        int i3 = constraintWidget.s;
        int i4 = aVar.j;
        boolean z3 = true;
        if ((numArr != null ? numArr[1].intValue() : 0) != constraintWidget.p()) {
            z3 = false;
        }
        boolean F = constraintWidget.F();
        ftk0 ftk0Var = this.f;
        d(dimensionBehaviour, i2, i3, i4, z3, F, o6j.i(ftk0Var.l), this.g);
        d(aVar.b, aVar.d, constraintWidget.t, aVar.j, (numArr != null ? numArr[0].intValue() : 0) == constraintWidget.v(), constraintWidget.G(), o6j.h(ftk0Var.l), this.h);
        int[] iArr = this.g;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int[] iArr2 = this.h;
        long a2 = s6j.a(i5, i6, iArr2[0], iArr2[1]);
        int i7 = aVar.j;
        if (i7 != 1 && i7 != 2) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour2 == dimensionBehaviour3) {
                if (constraintWidget.s == 0) {
                    if (aVar.b == dimensionBehaviour3) {
                    }
                }
            }
        }
        long c = c(constraintWidget, a2);
        constraintWidget.g = false;
        int i8 = (int) (c >> 32);
        Integer valueOf = Integer.valueOf(i8);
        int i9 = constraintWidget.v;
        Integer valueOf2 = Integer.valueOf(i9);
        if (i9 <= 0) {
            valueOf2 = null;
        }
        int i10 = constraintWidget.w;
        int intValue = ((Number) swe0.l(valueOf, valueOf2, i10 > 0 ? Integer.valueOf(i10) : null)).intValue();
        int i11 = (int) (c & 4294967295L);
        Integer valueOf3 = Integer.valueOf(i11);
        int i12 = constraintWidget.y;
        Integer valueOf4 = Integer.valueOf(i12);
        if (i12 <= 0) {
            valueOf4 = null;
        }
        int i13 = constraintWidget.z;
        int intValue2 = ((Number) swe0.l(valueOf3, valueOf4, i13 > 0 ? Integer.valueOf(i13) : null)).intValue();
        if (intValue != i8) {
            a2 = s6j.a(intValue, intValue, o6j.j(a2), o6j.h(a2));
            z = true;
        } else {
            z = false;
        }
        if (intValue2 != i11) {
            a2 = s6j.a(o6j.k(a2), o6j.i(a2), intValue2, intValue2);
            z2 = true;
        } else {
            z2 = z;
        }
        if (z2) {
            c(constraintWidget, a2);
            constraintWidget.g = false;
        }
        tra0 tra0Var = this.c.get(constraintWidget.i0);
        aVar.e = tra0Var != null ? tra0Var.b : constraintWidget.v();
        aVar.f = tra0Var != null ? tra0Var.c : constraintWidget.p();
        if (tra0Var != null) {
            ArrayList<ConstraintWidget> arrayList = ftk0Var.i;
            if (ftk0Var.j) {
                arrayList.clear();
                Iterator<Object> it = ftk0Var.h.iterator();
                while (it.hasNext()) {
                    ConstraintWidget a3 = ftk0Var.c.get(it.next()).a();
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
                ftk0Var.j = false;
            }
            if (arrayList.contains(constraintWidget)) {
                i = tra0Var.g0(ht1.a);
                aVar.h = i == Integer.MIN_VALUE;
                aVar.g = i;
                obj = linkedHashMap.get(str);
                if (obj != null) {
                    r18 = 0;
                    Integer[] numArr2 = {0, 0, Integer.MIN_VALUE};
                    linkedHashMap.put(str, numArr2);
                    obj2 = numArr2;
                } else {
                    r18 = 0;
                    obj2 = obj;
                }
                Integer[] numArr3 = (Integer[]) obj2;
                numArr3[r18] = Integer.valueOf(aVar.e);
                numArr3[1] = Integer.valueOf(aVar.f);
                numArr3[2] = Integer.valueOf(aVar.g);
                aVar.i = (aVar.e == aVar.c || aVar.f != aVar.d) ? true : r18;
            }
        }
        i = Integer.MIN_VALUE;
        aVar.h = i == Integer.MIN_VALUE;
        aVar.g = i;
        obj = linkedHashMap.get(str);
        if (obj != null) {
        }
        Integer[] numArr32 = (Integer[]) obj2;
        numArr32[r18] = Integer.valueOf(aVar.e);
        numArr32[1] = Integer.valueOf(aVar.f);
        numArr32[2] = Integer.valueOf(aVar.g);
        aVar.i = (aVar.e == aVar.c || aVar.f != aVar.d) ? true : r18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c(ConstraintWidget constraintWidget, long j) {
        Object obj = constraintWidget.i0;
        int i = 0;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.i)) {
            if (!(obj instanceof zo10)) {
                return y8x.a(0, 0);
            }
            tra0 N = ((zo10) obj).N(j);
            this.c.put(obj, N);
            return y8x.a(N.b, N.c);
        }
        int i2 = o6j.g(j) ? 1073741824 : o6j.e(j) ? Integer.MIN_VALUE : 0;
        if (o6j.f(j)) {
            i = 1073741824;
        } else if (o6j.d(j)) {
            i = Integer.MIN_VALUE;
        }
        androidx.constraintlayout.core.widgets.i iVar = (androidx.constraintlayout.core.widgets.i) constraintWidget;
        iVar.a0(i2, o6j.i(j), i, o6j.h(j));
        return y8x.a(iVar.E0, iVar.F0);
    }

    public final void e(tra0.a aVar, List<? extends zo10> list, Map<zo10, tra0> map) {
        ConstraintWidget constraintWidget;
        tra0 tra0Var;
        tra0.a aVar2;
        this.c = map;
        LinkedHashMap linkedHashMap = this.e;
        boolean isEmpty = linkedHashMap.isEmpty();
        androidx.constraintlayout.core.widgets.d dVar = this.b;
        if (isEmpty) {
            ArrayList<ConstraintWidget> arrayList = dVar.v0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget2 = arrayList.get(i);
                Object obj = constraintWidget2.i0;
                if (obj instanceof zo10) {
                    bnx0 bnx0Var = constraintWidget2.j;
                    ConstraintWidget constraintWidget3 = bnx0Var.a;
                    if (constraintWidget3 != null) {
                        bnx0Var.b = constraintWidget3.w();
                        bnx0Var.c = constraintWidget3.x();
                        bnx0Var.d = constraintWidget3.w() + constraintWidget3.X;
                        bnx0Var.e = constraintWidget3.x() + constraintWidget3.Y;
                        bnx0Var.c(constraintWidget3.j);
                    }
                    linkedHashMap.put(s101.o((zo10) obj), new bnx0(bnx0Var));
                }
            }
        }
        int size2 = list.size();
        int i2 = 0;
        while (i2 < size2) {
            zo10 zo10Var = list.get(i2);
            bnx0 bnx0Var2 = (bnx0) linkedHashMap.get(s101.o(zo10Var));
            if (bnx0Var2 != null && (tra0Var = this.c.get(zo10Var)) != null && bnx0Var2.q != 8) {
                if (Float.isNaN(bnx0Var2.h) && Float.isNaN(bnx0Var2.i) && Float.isNaN(bnx0Var2.j) && Float.isNaN(bnx0Var2.k) && Float.isNaN(bnx0Var2.l) && Float.isNaN(bnx0Var2.m) && Float.isNaN(bnx0Var2.n) && Float.isNaN(bnx0Var2.o) && Float.isNaN(bnx0Var2.p)) {
                    int i3 = (int) 0;
                    tra0.a.w(aVar, tra0Var, ((bnx0Var2.c - i3) & 4294967295L) | ((bnx0Var2.b - i3) << 32));
                } else {
                    z5j z5jVar = new z5j(bnx0Var2);
                    int i4 = (int) 0;
                    int i5 = bnx0Var2.b - i4;
                    int i6 = bnx0Var2.c - i4;
                    aVar2 = aVar;
                    aVar2.H(tra0Var, i5, i6, Float.isNaN(bnx0Var2.m) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : bnx0Var2.m, z5jVar);
                    i2++;
                    aVar = aVar2;
                }
            }
            aVar2 = aVar;
            i2++;
            aVar = aVar2;
        }
        if (LayoutInfoFlags.BOUNDS == null) {
            StringBuilder e = fw3.e("{   root: {interpolated: { left:  0,  top:  0,");
            e.append("  right:   " + dVar.v() + " ,");
            e.append("  bottom:  " + dVar.p() + " ,");
            e.append(" } }");
            Iterator<ConstraintWidget> it = dVar.v0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                Object obj2 = next.i0;
                if (obj2 instanceof zo10) {
                    if (next.k == null) {
                        zo10 zo10Var2 = (zo10) obj2;
                        Object o = vua0.o(zo10Var2);
                        if (o == null) {
                            o = s490.e(zo10Var2);
                        }
                        next.k = o != null ? o.toString() : null;
                    }
                    bnx0 bnx0Var3 = (bnx0) linkedHashMap.get(s101.o((zo10) obj2));
                    bnx0 bnx0Var4 = (bnx0Var3 == null || (constraintWidget = bnx0Var3.a) == null) ? null : constraintWidget.j;
                    if (bnx0Var4 != null) {
                        e.append(" " + next.k + ": {");
                        e.append(" interpolated : ");
                        HashMap<String, zok> hashMap = bnx0Var4.r;
                        e.append("{\n");
                        bnx0.b(bnx0Var4.b, TtmlNode.LEFT, e);
                        bnx0.b(bnx0Var4.c, "top", e);
                        bnx0.b(bnx0Var4.d, TtmlNode.RIGHT, e);
                        bnx0.b(bnx0Var4.e, "bottom", e);
                        bnx0.a(bnx0Var4.f, "pivotX", e);
                        bnx0.a(bnx0Var4.g, "pivotY", e);
                        bnx0.a(bnx0Var4.h, "rotationX", e);
                        bnx0.a(bnx0Var4.i, "rotationY", e);
                        bnx0.a(bnx0Var4.j, "rotationZ", e);
                        bnx0.a(bnx0Var4.k, "translationX", e);
                        bnx0.a(bnx0Var4.l, "translationY", e);
                        bnx0.a(bnx0Var4.m, "translationZ", e);
                        bnx0.a(bnx0Var4.n, "scaleX", e);
                        bnx0.a(bnx0Var4.o, "scaleY", e);
                        bnx0.a(bnx0Var4.p, "alpha", e);
                        bnx0.b(bnx0Var4.q, "visibility", e);
                        bnx0.a(Float.NaN, "interpolatedPos", e);
                        ConstraintWidget constraintWidget4 = bnx0Var4.a;
                        if (constraintWidget4 != null) {
                            for (ConstraintAnchor.Type type : ConstraintAnchor.Type.values()) {
                                ConstraintAnchor n = constraintWidget4.n(type);
                                if (n != null && n.f != null) {
                                    e.append("Anchor");
                                    e.append(type.name());
                                    e.append(": ['");
                                    String str = n.f.d.k;
                                    if (str == null) {
                                        str = "#PARENT";
                                    }
                                    e.append(str);
                                    e.append("', '");
                                    e.append(n.f.e.name());
                                    e.append("', '");
                                    e.append(n.g);
                                    e.append("'],\n");
                                }
                            }
                        }
                        bnx0.a(Float.NaN, "phone_orientation", e);
                        bnx0.a(Float.NaN, "phone_orientation", e);
                        if (hashMap.size() != 0) {
                            e.append("custom : {\n");
                            for (String str2 : hashMap.keySet()) {
                                zok zokVar = hashMap.get(str2);
                                e.append(str2);
                                e.append(": ");
                                switch (zokVar.b) {
                                    case 900:
                                        e.append(zokVar.c);
                                        e.append(",\n");
                                        break;
                                    case 901:
                                        e.append(zokVar.d);
                                        e.append(",\n");
                                        break;
                                    case 902:
                                        e.append("'");
                                        e.append(zok.a(zokVar.c));
                                        e.append("',\n");
                                        break;
                                    case 903:
                                        jh.f(e, "'", null, "',\n");
                                        break;
                                }
                            }
                            e.append("}\n");
                        }
                        e.append("}\n");
                        e.append("}, ");
                    }
                } else if (next instanceof androidx.constraintlayout.core.widgets.f) {
                    e.append(" " + next.k + ": {");
                    androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) next;
                    if (fVar.z0 == 0) {
                        e.append(" type: 'hGuideline', ");
                    } else {
                        e.append(" type: 'vGuideline', ");
                    }
                    e.append(" interpolated: ");
                    e.append(" { left: " + fVar.w() + ", top: " + fVar.x() + ", right: " + (fVar.v() + fVar.w()) + ", bottom: " + (fVar.p() + fVar.x()) + " }");
                    e.append("}, ");
                }
            }
            e.append(" }");
            goy goyVar = this.a;
            if (goyVar != null) {
                goyVar.a();
            }
        }
    }

    public final long f(long j, LayoutDirection layoutDirection, g6j g6jVar, List list, LinkedHashMap linkedHashMap) {
        xym xymVar;
        xym xymVar2;
        androidx.constraintlayout.core.state.c cVar;
        e2v s;
        e2v s2;
        this.c = linkedHashMap;
        if (list.isEmpty()) {
            return pli.h(o6j.k(j), o6j.j(j));
        }
        boolean g = o6j.g(j);
        String str = xym.i;
        if (g) {
            xymVar = xym.b(o6j.i(j));
        } else {
            xymVar = new xym(str);
            int k = o6j.k(j);
            if (k >= 0) {
                xymVar.a = k;
            }
        }
        ftk0 ftk0Var = this.f;
        androidx.constraintlayout.core.state.a aVar = ftk0Var.f;
        androidx.constraintlayout.core.state.a aVar2 = ftk0Var.f;
        aVar.e0 = xymVar;
        if (o6j.f(j)) {
            xymVar2 = xym.b(o6j.h(j));
        } else {
            xymVar2 = new xym(str);
            int j2 = o6j.j(j);
            if (j2 >= 0) {
                xymVar2.a = j2;
            }
        }
        aVar2.f0 = xymVar2;
        xym xymVar3 = aVar2.e0;
        androidx.constraintlayout.core.widgets.d dVar = this.b;
        xymVar3.a(dVar, 0);
        aVar2.f0.a(dVar, 1);
        ftk0Var.l = j;
        ftk0Var.b = !(layoutDirection == LayoutDirection.Rtl);
        this.c.clear();
        this.d.clear();
        this.e.clear();
        if (g6jVar.a(list)) {
            HashMap<Object, dpf0> hashMap = ftk0Var.c;
            Iterator<Object> it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                hashMap.get(it.next()).a().H();
            }
            hashMap.clear();
            hashMap.put(0, aVar2);
            ftk0Var.d.clear();
            ftk0Var.e.clear();
            ftk0Var.h.clear();
            ftk0Var.j = true;
            g6jVar.b(ftk0Var, list);
            a6j.a(ftk0Var, list);
            HashMap<Object, dpf0> hashMap2 = ftk0Var.c;
            dVar.v0.clear();
            aVar2.e0.a(dVar, 0);
            aVar2.f0.a(dVar, 1);
            HashMap<Object, androidx.constraintlayout.core.state.c> hashMap3 = ftk0Var.d;
            for (Object obj : hashMap3.keySet()) {
                e2v s3 = hashMap3.get(obj).s();
                if (s3 != null) {
                    dpf0 dpf0Var = hashMap2.get(obj);
                    if (dpf0Var == null) {
                        dpf0Var = ftk0Var.b(obj);
                    }
                    dpf0Var.c(s3);
                }
            }
            for (Object obj2 : hashMap2.keySet()) {
                dpf0 dpf0Var2 = hashMap2.get(obj2);
                if (dpf0Var2 != aVar2 && (dpf0Var2.b() instanceof androidx.constraintlayout.core.state.c) && (s2 = ((androidx.constraintlayout.core.state.c) dpf0Var2.b()).s()) != null) {
                    dpf0 dpf0Var3 = hashMap2.get(obj2);
                    if (dpf0Var3 == null) {
                        dpf0Var3 = ftk0Var.b(obj2);
                    }
                    dpf0Var3.c(s2);
                }
            }
            Iterator<Object> it2 = hashMap2.keySet().iterator();
            while (it2.hasNext()) {
                dpf0 dpf0Var4 = hashMap2.get(it2.next());
                if (dpf0Var4 != aVar2) {
                    ConstraintWidget a2 = dpf0Var4.a();
                    a2.l0 = dpf0Var4.getKey().toString();
                    a2.W = null;
                    if (dpf0Var4.b() instanceof xru) {
                        dpf0Var4.apply();
                    }
                    dVar.c(a2);
                } else {
                    dpf0Var4.c(dVar);
                }
            }
            Iterator<Object> it3 = hashMap3.keySet().iterator();
            while (it3.hasNext()) {
                androidx.constraintlayout.core.state.c cVar2 = hashMap3.get(it3.next());
                if (cVar2.s() != null) {
                    Iterator<Object> it4 = cVar2.m0.iterator();
                    while (it4.hasNext()) {
                        cVar2.s().c(hashMap2.get(it4.next()).a());
                    }
                    cVar2.apply();
                } else {
                    cVar2.apply();
                }
            }
            Iterator<Object> it5 = hashMap2.keySet().iterator();
            while (it5.hasNext()) {
                dpf0 dpf0Var5 = hashMap2.get(it5.next());
                if (dpf0Var5 != aVar2 && (dpf0Var5.b() instanceof androidx.constraintlayout.core.state.c) && (s = (cVar = (androidx.constraintlayout.core.state.c) dpf0Var5.b()).s()) != null) {
                    Iterator<Object> it6 = cVar.m0.iterator();
                    while (it6.hasNext()) {
                        Object next = it6.next();
                        dpf0 dpf0Var6 = hashMap2.get(next);
                        if (dpf0Var6 != null) {
                            s.c(dpf0Var6.a());
                        } else if (next instanceof dpf0) {
                            s.c(((dpf0) next).a());
                        } else {
                            System.out.println("couldn't find reference for " + next);
                        }
                    }
                    dpf0Var5.apply();
                }
            }
            for (Object obj3 : hashMap2.keySet()) {
                dpf0 dpf0Var7 = hashMap2.get(obj3);
                dpf0Var7.apply();
                ConstraintWidget a3 = dpf0Var7.a();
                if (a3 != null && obj3 != null) {
                    a3.k = obj3.toString();
                }
            }
        } else {
            a6j.a(ftk0Var, list);
        }
        dVar.W(o6j.i(j));
        dVar.R(o6j.h(j));
        this.i = Float.NaN;
        goy goyVar = this.a;
        if (goyVar != null) {
            goyVar.getClass();
            if (dVar.v() < 0) {
                this.i = dVar.v() / 0;
            } else {
                this.i = 1.0f;
            }
            dVar.W(0);
        }
        goy goyVar2 = this.a;
        if (goyVar2 != null) {
            goyVar2.getClass();
            if (Float.isNaN(this.i)) {
                this.i = 1.0f;
            }
            float p = dVar.p() < 0 ? dVar.p() / 0 : 1.0f;
            if (p < this.i) {
                this.i = p;
            }
            dVar.R(0);
        }
        dVar.w0.c(dVar);
        dVar.I0 = 257;
        androidx.constraintlayout.core.c.q = dVar.f0(512);
        dVar.d0(dVar.I0, 0, 0, 0, 0, 0, 0);
        return pli.h(dVar.v(), dVar.p());
    }

    @Override // xsna.kt6.b
    public final void b() {
    }
}
