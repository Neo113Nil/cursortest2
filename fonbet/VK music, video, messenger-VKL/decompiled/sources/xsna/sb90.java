package xsna;

import android.os.Trace;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.dak0;
import xsna.dt1;

/* compiled from: PagerMeasurePolicy.kt */
/* loaded from: classes11.dex */
public final class sb90 implements oty {
    public final /* synthetic */ mc90 a;
    public final /* synthetic */ Orientation b;
    public final /* synthetic */ s890 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ aa90 e;
    public final /* synthetic */ gzs<qb90> f;
    public final /* synthetic */ gzs<Integer> g;
    public final /* synthetic */ dt1.c h;
    public final /* synthetic */ dt1.b i;
    public final /* synthetic */ int j;
    public final /* synthetic */ x9k0 k;
    public final /* synthetic */ yvj l;

    public sb90(mc90 mc90Var, Orientation orientation, s890 s890Var, float f, aa90 aa90Var, rcy rcyVar, gzs gzsVar, dt1.c cVar, dt1.b bVar, int i, x9k0 x9k0Var, yvj yvjVar) {
        this.a = mc90Var;
        this.b = orientation;
        this.c = s890Var;
        this.d = f;
        this.e = aa90Var;
        this.f = rcyVar;
        this.g = gzsVar;
        this.h = cVar;
        this.i = bVar;
        this.j = i;
        this.k = x9k0Var;
        this.l = yvjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v47, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v65, types: [kotlin.collections.EmptyList] */
    @Override // xsna.oty
    public final dp10 a(qty qtyVar, long j) {
        int i;
        int i2;
        mc90 mc90Var;
        dt1.c cVar;
        int i3;
        dt1.b bVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        sk3 sk3Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        kp10 kp10Var;
        long j2;
        List list;
        List list2;
        int i17;
        int i18;
        int i19;
        List list3;
        int i20;
        int i21;
        Orientation orientation;
        int i22;
        kp10 kp10Var2;
        int i23;
        ztm0 ztm0Var;
        ArrayList arrayList;
        long j3;
        int i24;
        sk3 sk3Var2;
        List list4;
        ArrayList arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        int i25;
        x9k0 x9k0Var;
        int i26;
        int i27;
        Object obj;
        List list5;
        ArrayList arrayList5;
        int i28;
        tb90 tb90Var;
        qty qtyVar2;
        int[] iArr;
        int i29;
        dt1.c cVar2;
        long j4;
        int i30;
        int i31;
        int i32;
        int i33;
        ArrayList arrayList6;
        int i34;
        sb90 sb90Var = this;
        ztm0 ztm0Var2 = qtyVar.c;
        mc90 mc90Var2 = sb90Var.a;
        mc90Var2.B.getValue();
        Orientation orientation2 = Orientation.Vertical;
        Orientation orientation3 = sb90Var.b;
        boolean z = orientation3 == orientation2;
        rdi.n(j, z ? orientation2 : Orientation.Horizontal);
        s890 s890Var = sb90Var.c;
        int r0 = z ? ztm0Var2.r0(s890Var.c(ztm0Var2.getLayoutDirection())) : ztm0Var2.r0(s200.s(s890Var, ztm0Var2.getLayoutDirection()));
        int r02 = z ? ztm0Var2.r0(s890Var.a(ztm0Var2.getLayoutDirection())) : ztm0Var2.r0(s200.r(s890Var, ztm0Var2.getLayoutDirection()));
        int r03 = ztm0Var2.r0(s890Var.d());
        int r04 = ztm0Var2.r0(s890Var.b()) + r03;
        int i35 = r0 + r02;
        int i36 = z ? r04 : i35;
        if (z) {
            r02 = r03;
        } else if (!z) {
            r02 = r0;
        }
        int i37 = i36 - r02;
        boolean z2 = z;
        long i38 = s6j.i(-i35, -r04, j);
        mc90Var2.n = qtyVar;
        int r05 = ztm0Var2.r0(sb90Var.d);
        int h = z2 ? o6j.h(j) - r04 : o6j.i(j) - i35;
        long j5 = (r0 << 32) | (r03 & 4294967295L);
        int a = sb90Var.e.a(qtyVar, h);
        if (a < 0) {
            a = 0;
        }
        s6j.b(0, orientation3 == orientation2 ? o6j.i(i38) : a, 0, orientation3 != orientation2 ? o6j.h(i38) : a, 5);
        qb90 invoke = sb90Var.f.invoke();
        int i39 = h + r02 + i37;
        x9k0 x9k0Var2 = sb90Var.k;
        dak0 a2 = dak0.a.a();
        izs<Object, s3q0> e = a2 != null ? a2.e() : null;
        long j6 = j5;
        dak0 b = dak0.a.b(a2);
        try {
            int k = mc90Var2.k();
            ztm0 ztm0Var3 = ztm0Var2;
            zb90 zb90Var = mc90Var2.d;
            int f = ine0.f(k, invoke, zb90Var.e);
            if (k != f) {
                ((wak0) ((rg50) zb90Var.c)).C(f);
                ((tty) zb90Var.f).c(k);
            }
            mc90Var2.k();
            float l = mc90Var2.l();
            mc90Var2.o();
            int i40 = a + r05;
            int b2 = an10.b(x9k0Var2.d(i39, a, r02, i37) - (l * i40));
            s3q0 s3q0Var = s3q0.a;
            dak0.a.d(a2, b, e);
            List<Integer> a3 = usy.a(invoke, mc90Var2.z, mc90Var2.v);
            pg50 a4 = g9x.a();
            int intValue = sb90Var.g.invoke().intValue();
            wh50<s3q0> wh50Var = mc90Var2.A;
            if (r02 < 0) {
                xzw.a("negative beforeContentPadding");
            }
            if (i37 < 0) {
                xzw.a("negative afterContentPadding");
            }
            int i41 = i40 < 0 ? 0 : i40;
            int i42 = b2;
            int i43 = sb90Var.j;
            if (i43 > intValue) {
                i43 = intValue;
            }
            Orientation orientation4 = sb90Var.b;
            if (orientation4 == orientation2) {
                i = i43;
                i2 = o6j.i(i38);
            } else {
                i = i43;
                i2 = a;
            }
            wh50<s3q0> wh50Var2 = wh50Var;
            long b3 = s6j.b(0, i2, 0, orientation4 != orientation2 ? o6j.h(i38) : a, 5);
            jgp jgpVar = jgp.b;
            int i44 = i40;
            x9k0 x9k0Var3 = sb90Var.k;
            yvj yvjVar = sb90Var.l;
            if (intValue <= 0) {
                mc90Var = mc90Var2;
                qtyVar2 = qtyVar;
                tb90Var = new tb90(EmptyList.b, a, r05, i37, orientation4, -r02, h + i37, i, x9k0Var3, ztm0Var3.Q(s6j.g(o6j.k(i38) + i35, j), s6j.f(o6j.j(i38) + r04, j), jgpVar, new gvs(19)), yvjVar, qtyVar2, b3);
            } else {
                mc90Var = mc90Var2;
                int i45 = i39;
                int i46 = a;
                int i47 = i37;
                int i48 = f;
                while (i48 > 0 && i42 > 0) {
                    i48--;
                    i42 -= i41;
                }
                int i49 = i42 * (-1);
                if (i48 >= intValue) {
                    i48 = intValue - 1;
                    i49 = 0;
                }
                sk3 sk3Var3 = new sk3();
                List<Integer> list6 = a3;
                int i50 = -r02;
                int i51 = i50 + (r05 < 0 ? r05 : 0);
                int i52 = i49 + i51;
                int i53 = r02;
                int i54 = 0;
                int i55 = r05;
                while (true) {
                    cVar = sb90Var.h;
                    i3 = i41;
                    bVar = sb90Var.i;
                    if (i52 >= 0 || i48 <= 0) {
                        break;
                    }
                    int i56 = i48 - 1;
                    int i57 = i47;
                    qb90 qb90Var = invoke;
                    kp10 a5 = rb90.a(qtyVar, i56, b3, qb90Var, j6, orientation4, bVar, cVar, ztm0Var3.getLayoutDirection(), i46, a4);
                    sk3Var3.add(0, a5);
                    i54 = Math.max(i54, a5.i);
                    i52 += i3;
                    sb90Var = this;
                    i48 = i56;
                    invoke = qb90Var;
                    i47 = i57;
                    i44 = i44;
                    i55 = i55;
                    intValue = intValue;
                    i41 = i3;
                    i45 = i45;
                    wh50Var2 = wh50Var2;
                }
                int i58 = i44;
                int i59 = i47;
                qb90 qb90Var2 = invoke;
                int i60 = i45;
                wh50<s3q0> wh50Var3 = wh50Var2;
                int i61 = i;
                int i62 = i54;
                int i63 = 0;
                int i64 = intValue;
                int i65 = i55;
                if (i52 < i51) {
                    i52 = i51;
                }
                int i66 = i52 - i51;
                int i67 = h + i59;
                int i68 = i67 < 0 ? 0 : i67;
                int i69 = i51;
                long j7 = b3;
                int i70 = i48;
                int i71 = -i66;
                boolean z3 = false;
                while (i63 < sk3Var3.size()) {
                    if (i71 >= i68) {
                        sk3Var3.remove(i63);
                        s3q0 s3q0Var2 = s3q0.a;
                        z3 = true;
                    } else {
                        i70++;
                        i71 += i3;
                        i63++;
                    }
                }
                int i72 = i71;
                int i73 = i64;
                int i74 = i70;
                boolean z4 = z3;
                int i75 = i66;
                int i76 = i48;
                while (i74 < i73 && (i72 < i68 || i72 <= 0 || sk3Var3.isEmpty())) {
                    int i77 = i76;
                    int i78 = i62;
                    long j8 = j6;
                    int i79 = i72;
                    int i80 = i73;
                    int i81 = i69;
                    long j9 = j7;
                    int i82 = i68;
                    int i83 = i74;
                    kp10 a6 = rb90.a(qtyVar, i83, j9, qb90Var2, j8, orientation4, bVar, cVar, ztm0Var3.getLayoutDirection(), i46, a4);
                    int i84 = i80 - 1;
                    j7 = j9;
                    int i85 = i79 + (i83 == i84 ? i46 : i3);
                    if (i85 > i81 || i83 == i84) {
                        int max = Math.max(i78, a6.i);
                        sk3Var3.addLast(a6);
                        i78 = max;
                    } else {
                        i75 -= i3;
                        s3q0 s3q0Var3 = s3q0.a;
                        i77 = i83 + 1;
                        z4 = true;
                    }
                    i74 = i83 + 1;
                    i68 = i82;
                    i69 = i81;
                    i72 = i85;
                    i73 = i80;
                    j6 = j8;
                    i62 = i78;
                    i76 = i77;
                }
                int i86 = i76;
                int i87 = i62;
                long j10 = j6;
                int i88 = i73;
                int i89 = i72;
                int i90 = h;
                if (i89 < i90) {
                    int i91 = i90 - i89;
                    int i92 = i75 - i91;
                    int i93 = i89 + i91;
                    int i94 = i87;
                    int i95 = i92;
                    while (true) {
                        i34 = i53;
                        if (i95 >= i34 || i86 <= 0) {
                            break;
                        }
                        i86--;
                        i53 = i34;
                        kp10 a7 = rb90.a(qtyVar, i86, j7, qb90Var2, j10, orientation4, bVar, cVar, ztm0Var3.getLayoutDirection(), i46, a4);
                        sk3Var3.add(0, a7);
                        i95 += i3;
                        i94 = Math.max(i94, a7.i);
                        i74 = i74;
                    }
                    i4 = i74;
                    i53 = i34;
                    int i96 = i95;
                    int i97 = i94;
                    if (i96 < 0) {
                        int i98 = i93 + i96;
                        i6 = i97;
                        i7 = i98;
                        i5 = 0;
                    } else {
                        i5 = i96;
                        i6 = i97;
                        i7 = i93;
                    }
                } else {
                    i4 = i74;
                    i5 = i75;
                    i6 = i87;
                    i7 = i89;
                }
                if (i5 < 0) {
                    xzw.a("invalid currentFirstPageScrollOffset");
                }
                int i99 = -i5;
                kp10 kp10Var3 = (kp10) sk3Var3.first();
                if (i53 > 0 || i65 < 0) {
                    int size = sk3Var3.size();
                    int i100 = 0;
                    while (i100 < size && i5 != 0) {
                        i8 = i7;
                        i9 = i3;
                        i10 = i5;
                        if (i9 > i5 || i100 == e43.h(sk3Var3)) {
                            break;
                        }
                        i5 = i10 - i9;
                        i100++;
                        kp10Var3 = (kp10) sk3Var3.get(i100);
                        i3 = i9;
                        i7 = i8;
                    }
                }
                i10 = i5;
                i8 = i7;
                i9 = i3;
                int max2 = Math.max(0, i86 - i61);
                int i101 = 1;
                int i102 = i86 - 1;
                if (max2 <= i102) {
                    ArrayList arrayList7 = null;
                    while (true) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        sk3Var = sk3Var3;
                        arrayList6 = arrayList7;
                        i11 = i90;
                        i12 = max2;
                        i13 = i99;
                        int i103 = i102;
                        i14 = i9;
                        i15 = i101;
                        i16 = i61;
                        kp10Var = kp10Var3;
                        j2 = j7;
                        arrayList6.add(rb90.a(qtyVar, i103, j2, qb90Var2, j10, orientation4, bVar, cVar, ztm0Var3.getLayoutDirection(), i46, a4));
                        if (i103 == i12) {
                            break;
                        }
                        int i104 = i103 - 1;
                        arrayList7 = arrayList6;
                        j7 = j2;
                        sk3Var3 = sk3Var;
                        i99 = i13;
                        kp10Var3 = kp10Var;
                        i61 = i16;
                        i102 = i104;
                        i101 = i15;
                        i9 = i14;
                        max2 = i12;
                        i90 = i11;
                    }
                    list = arrayList6;
                } else {
                    sk3Var = sk3Var3;
                    i11 = i90;
                    i12 = max2;
                    i13 = i99;
                    i14 = i9;
                    i15 = 1;
                    i16 = i61;
                    kp10Var = kp10Var3;
                    j2 = j7;
                    list = null;
                }
                List<Integer> list7 = list6;
                int size2 = list7.size();
                int i105 = 0;
                while (i105 < size2) {
                    int i106 = i15;
                    List<Integer> list8 = list6;
                    List<Integer> list9 = list7;
                    int intValue2 = list8.get(i105).intValue();
                    if (intValue2 < i12) {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        List list10 = list;
                        i33 = i105;
                        i32 = size2;
                        list10.add(rb90.a(qtyVar, intValue2, j2, qb90Var2, j10, orientation4, bVar, cVar, ztm0Var3.getLayoutDirection(), i46, a4));
                        list = list10;
                    } else {
                        i32 = size2;
                        i33 = i105;
                    }
                    i105 = i33 + 1;
                    list6 = list8;
                    i15 = i106;
                    list7 = list9;
                    size2 = i32;
                }
                List<Integer> list11 = list7;
                int i107 = i15;
                List<Integer> list12 = list6;
                if (list == null) {
                    list = EmptyList.b;
                }
                List list13 = list;
                int size3 = list13.size();
                int i108 = i6;
                for (int i109 = 0; i109 < size3; i109++) {
                    i108 = Math.max(i108, ((kp10) list13.get(i109)).i);
                }
                int i110 = ((kp10) sk3Var.last()).a;
                int i111 = i16;
                int min = Math.min(i111, (i88 - i110) - 1) + i110;
                int i112 = i110 + 1;
                if (i112 <= min) {
                    List list14 = null;
                    while (true) {
                        if (list14 == null) {
                            list14 = new ArrayList();
                        }
                        int i113 = i112;
                        i19 = i111;
                        list3 = list14;
                        i18 = i108;
                        list2 = list13;
                        i17 = min;
                        list3.add(rb90.a(qtyVar, i113, j2, qb90Var2, j10, orientation4, bVar, cVar, ztm0Var3.getLayoutDirection(), i46, a4));
                        if (i113 == i17) {
                            break;
                        }
                        i108 = i18;
                        i111 = i19;
                        list14 = list3;
                        i112 = i113 + 1;
                        min = i17;
                        list13 = list2;
                    }
                } else {
                    list2 = list13;
                    i17 = min;
                    i18 = i108;
                    i19 = i111;
                    list3 = null;
                }
                int size4 = list11.size();
                int i114 = 0;
                while (i114 < size4) {
                    int intValue3 = list12.get(i114).intValue();
                    int i115 = i17;
                    if (i115 + 1 <= intValue3) {
                        i29 = i88;
                        if (intValue3 < i29) {
                            if (list3 == null) {
                                list3 = new ArrayList();
                            }
                            i30 = i114;
                            i31 = size4;
                            kp10 a8 = rb90.a(qtyVar, intValue3, j2, qb90Var2, j10, orientation4, bVar, cVar, ztm0Var3.getLayoutDirection(), i46, a4);
                            long j11 = j2;
                            cVar2 = cVar;
                            j4 = j11;
                            list3.add(a8);
                            i114 = i30 + 1;
                            long j12 = j4;
                            cVar = cVar2;
                            j2 = j12;
                            size4 = i31;
                            i88 = i29;
                            i17 = i115;
                        } else {
                            long j13 = j2;
                            cVar2 = cVar;
                            j4 = j13;
                            i31 = size4;
                            i30 = i114;
                        }
                    } else {
                        i29 = i88;
                        long j14 = j2;
                        cVar2 = cVar;
                        j4 = j14;
                        i30 = i114;
                        i31 = size4;
                    }
                    i114 = i30 + 1;
                    long j122 = j4;
                    cVar = cVar2;
                    j2 = j122;
                    size4 = i31;
                    i88 = i29;
                    i17 = i115;
                }
                long j15 = j2;
                int i116 = i88;
                if (list3 == null) {
                    list3 = EmptyList.b;
                }
                int size5 = list3.size();
                int i117 = i18;
                for (int i118 = 0; i118 < size5; i118++) {
                    i117 = Math.max(i117, ((kp10) list3.get(i118)).i);
                }
                kp10 kp10Var4 = kp10Var;
                int i119 = (epx.f(kp10Var4, sk3Var.first()) && list2.isEmpty() && list3.isEmpty()) ? i107 : 0;
                Orientation orientation5 = Orientation.Vertical;
                int g = s6j.g(orientation4 == orientation5 ? i117 : i8, i38);
                if (orientation4 == orientation5) {
                    i117 = i8;
                }
                int f2 = s6j.f(i117, i38);
                int i120 = orientation4 == orientation5 ? f2 : g;
                int i121 = i11;
                int i122 = i8;
                int i123 = i122 < Math.min(i120, i121) ? i107 : 0;
                if (i123 == 0 || i13 == 0) {
                    i20 = i121;
                    i21 = i13;
                } else {
                    i20 = i121;
                    StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
                    i21 = i13;
                    sb.append(i21);
                    xzw.c(sb.toString());
                }
                int i124 = i21;
                ArrayList arrayList8 = new ArrayList(list3.size() + list2.size() + sk3Var.size());
                if (i123 != 0) {
                    if (!list2.isEmpty() || !list3.isEmpty()) {
                        xzw.a("No extra pages");
                    }
                    int size6 = sk3Var.size();
                    int[] iArr2 = new int[size6];
                    for (int i125 = 0; i125 < size6; i125++) {
                        iArr2[i125] = i46;
                    }
                    int[] iArr3 = new int[size6];
                    kp10Var2 = kp10Var4;
                    i23 = i119;
                    a.j jVar = new a.j(ztm0Var3.j1(i65), false, null);
                    if (orientation4 == Orientation.Vertical) {
                        jVar.c(qtyVar, i120, iArr2, iArr3);
                        int i126 = i20;
                        orientation = orientation4;
                        i22 = i126;
                        iArr = iArr3;
                        arrayList = arrayList8;
                        ztm0Var = ztm0Var3;
                        j3 = j15;
                        i24 = i122;
                    } else {
                        int i127 = i20;
                        orientation = orientation4;
                        i22 = i127;
                        iArr = iArr3;
                        arrayList = arrayList8;
                        ztm0Var = ztm0Var3;
                        j3 = j15;
                        i24 = i122;
                        jVar.b(qtyVar, i120, iArr2, LayoutDirection.Ltr, iArr);
                    }
                    k9x P = rl3.P(iArr);
                    int i128 = P.b;
                    int i129 = P.c;
                    int i130 = P.d;
                    if ((i130 > 0 && i128 <= i129) || (i130 < 0 && i129 <= i128)) {
                        while (true) {
                            int i131 = iArr[i128];
                            sk3Var2 = sk3Var;
                            kp10 kp10Var5 = (kp10) sk3Var2.get(i128);
                            kp10Var5.b(i131, g, f2);
                            arrayList.add(kp10Var5);
                            if (i128 == i129) {
                                break;
                            }
                            i128 += i130;
                            sk3Var = sk3Var2;
                        }
                    } else {
                        sk3Var2 = sk3Var;
                    }
                    list4 = list2;
                } else {
                    int i132 = i20;
                    orientation = orientation4;
                    i22 = i132;
                    kp10Var2 = kp10Var4;
                    i23 = i119;
                    ztm0Var = ztm0Var3;
                    arrayList = arrayList8;
                    j3 = j15;
                    i24 = i122;
                    sk3Var2 = sk3Var;
                    int size7 = list2.size();
                    int i133 = i124;
                    for (int i134 = 0; i134 < size7; i134++) {
                        kp10 kp10Var6 = (kp10) list2.get(i134);
                        i133 -= i58;
                        kp10Var6.b(i133, g, f2);
                        arrayList.add(kp10Var6);
                    }
                    list4 = list2;
                    int size8 = sk3Var2.size();
                    int i135 = i124;
                    for (int i136 = 0; i136 < size8; i136++) {
                        kp10 kp10Var7 = (kp10) sk3Var2.get(i136);
                        kp10Var7.b(i135, g, f2);
                        arrayList.add(kp10Var7);
                        i135 += i58;
                    }
                    int size9 = list3.size();
                    for (int i137 = 0; i137 < size9; i137++) {
                        kp10 kp10Var8 = (kp10) list3.get(i137);
                        kp10Var8.b(i135, g, f2);
                        arrayList.add(kp10Var8);
                        i135 += i58;
                    }
                }
                if (i23 != 0) {
                    arrayList2 = arrayList;
                } else {
                    ArrayList arrayList9 = new ArrayList(arrayList.size());
                    int size10 = arrayList.size();
                    int i138 = 0;
                    while (i138 < size10) {
                        Object obj2 = arrayList.get(i138);
                        kp10 kp10Var9 = (kp10) obj2;
                        List list15 = list3;
                        int i139 = size10;
                        if (kp10Var9.a >= ((kp10) sk3Var2.first()).a && kp10Var9.a <= ((kp10) sk3Var2.last()).a) {
                            arrayList9.add(obj2);
                        }
                        i138++;
                        list3 = list15;
                        size10 = i139;
                    }
                    arrayList2 = arrayList9;
                }
                List list16 = list3;
                if (list4.isEmpty()) {
                    arrayList3 = EmptyList.b;
                } else {
                    arrayList3 = new ArrayList(arrayList.size());
                    int size11 = arrayList.size();
                    for (int i140 = 0; i140 < size11; i140++) {
                        Object obj3 = arrayList.get(i140);
                        if (((kp10) obj3).a < ((kp10) sk3Var2.first()).a) {
                            arrayList3.add(obj3);
                        }
                    }
                }
                if (list16.isEmpty()) {
                    arrayList4 = EmptyList.b;
                } else {
                    arrayList4 = new ArrayList(arrayList.size());
                    int size12 = arrayList.size();
                    int i141 = 0;
                    arrayList3 = arrayList3;
                    while (i141 < size12) {
                        Object obj4 = arrayList.get(i141);
                        Object obj5 = arrayList3;
                        if (((kp10) obj4).a > ((kp10) sk3Var2.last()).a) {
                            arrayList4.add(obj4);
                        }
                        i141++;
                        arrayList3 = obj5;
                    }
                }
                List list17 = arrayList3;
                if (arrayList2.isEmpty()) {
                    list5 = arrayList4;
                    i28 = g;
                    i25 = i59;
                    x9k0Var = x9k0Var3;
                    i26 = i53;
                    i27 = i60;
                    obj = null;
                    arrayList5 = arrayList2;
                } else {
                    i25 = i59;
                    x9k0Var = x9k0Var3;
                    i26 = i53;
                    i27 = i60;
                    obj = arrayList2.get(0);
                    float f3 = -Math.abs(((kp10) r1).k - x9k0Var.d(i27, i46, i26, i25));
                    int h2 = e43.h(arrayList2);
                    if (i107 <= h2) {
                        List list18 = arrayList4;
                        int i142 = i107;
                        float f4 = f3;
                        list5 = list18;
                        while (true) {
                            Object obj6 = arrayList2.get(i142);
                            arrayList5 = arrayList2;
                            i28 = g;
                            float f5 = -Math.abs(((kp10) obj6).k - x9k0Var.d(i27, i46, i26, i25));
                            if (Float.compare(f4, f5) < 0) {
                                f4 = f5;
                                obj = obj6;
                            }
                            if (i142 == h2) {
                                break;
                            }
                            i142++;
                            arrayList2 = arrayList5;
                            g = i28;
                        }
                    } else {
                        list5 = arrayList4;
                        arrayList5 = arrayList2;
                        i28 = g;
                    }
                }
                kp10 kp10Var10 = (kp10) obj;
                float f6 = i14 == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : swe0.f((x9k0Var.d(i27, i46, i26, i25) - (kp10Var10 != null ? kp10Var10.k : 0)) / i14, -0.5f, 0.5f);
                dp10 Q = ztm0Var.Q(s6j.g(i28 + i35, j), s6j.f(f2 + r04, j), jgpVar, new ma(23, wh50Var3, arrayList));
                ztm0Var3 = ztm0Var;
                ArrayList arrayList10 = arrayList5;
                tb90Var = new tb90(arrayList10, i46, i65, i25, orientation, i50, i67, i19, kp10Var2, kp10Var10, f6, i10, i4 < i116 || i24 > i22, x9k0Var, Q, z4, list17, list5, yvjVar, qtyVar, j3);
                qtyVar2 = qtyVar;
            }
            mc90 mc90Var3 = mc90Var;
            mc90Var3.h(tb90Var, ztm0Var3.z1(), false);
            xa90 xa90Var = mc90Var3.u;
            List<kp10> list19 = tb90Var.a;
            Trace.beginSection("compose:pager:cache_window:keepAroundItems");
            try {
                if (xa90Var.b() && !list19.isEmpty()) {
                    int index = ((e990) j5g.Y(list19)).getIndex();
                    int index2 = ((e990) j5g.i0(list19)).getIndex();
                    for (int i143 = xa90Var.h; i143 < index; i143++) {
                        qtyVar2.c(i143);
                    }
                    int i144 = index2 + 1;
                    int i145 = xa90Var.i;
                    if (i144 <= i145) {
                        while (true) {
                            qtyVar2.c(i144);
                            if (i144 == i145) {
                                break;
                            }
                            i144++;
                        }
                    }
                }
                s3q0 s3q0Var4 = s3q0.a;
                Trace.endSection();
                return tb90Var;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            dak0.a.d(a2, b, e);
            throw th2;
        }
    }
}
