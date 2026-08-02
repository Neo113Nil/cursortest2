package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.dak0;
import xsna.dt1;
import xsna.tra0;
import xsna.xel0;

/* compiled from: LazyList.kt */
/* loaded from: classes11.dex */
public final class dvy implements oty {
    public final /* synthetic */ xvy a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ s890 c;
    public final /* synthetic */ gzs<yuy> d;
    public final /* synthetic */ a.n e;
    public final /* synthetic */ a.e f;
    public final /* synthetic */ yvj g;
    public final /* synthetic */ kdu h;
    public final /* synthetic */ xel0 i;
    public final /* synthetic */ dt1.b j;
    public final /* synthetic */ dt1.c k;

    public dvy(xvy xvyVar, boolean z, s890 s890Var, rcy rcyVar, a.n nVar, a.e eVar, yvj yvjVar, kdu kduVar, xel0.a.C3999a c3999a, dt1.b bVar, dt1.c cVar) {
        this.a = xvyVar;
        this.b = z;
        this.c = s890Var;
        this.d = rcyVar;
        this.e = nVar;
        this.f = eVar;
        this.g = yvjVar;
        this.h = kduVar;
        this.i = c3999a;
        this.j = bVar;
        this.k = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0796 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0719  */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.Collection, java.util.List, xsna.sk3, xsna.yf] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3, types: [int] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12, types: [int] */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [int] */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47, types: [int] */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v20 */
    @Override // xsna.oty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dp10 a(qty qtyVar, long j) {
        float a;
        int i;
        xvy xvyVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        int i9;
        int i10;
        List list;
        int i11;
        int i12;
        boolean z;
        jgp jgpVar;
        int i13;
        boolean z2;
        cvy cvyVar;
        int i14;
        ?? r4;
        int i15;
        int i16;
        bty<ivy> btyVar;
        boolean z3;
        sk3 sk3Var;
        int i17;
        Integer valueOf;
        Integer valueOf2;
        int i18;
        int i19;
        hvy hvyVar;
        ztm0 ztm0Var;
        boolean z4;
        int i20;
        int[] iArr;
        int i21;
        ztm0 ztm0Var2 = qtyVar.c;
        xvy xvyVar2 = this.a;
        xvyVar2.t.getValue();
        boolean z5 = true;
        boolean z6 = xvyVar2.b || ztm0Var2.z1();
        boolean z7 = this.b;
        rdi.n(j, z7 ? Orientation.Vertical : Orientation.Horizontal);
        s890 s890Var = this.c;
        int r0 = z7 ? ztm0Var2.r0(s890Var.c(ztm0Var2.getLayoutDirection())) : ztm0Var2.r0(s200.s(s890Var, ztm0Var2.getLayoutDirection()));
        int r02 = z7 ? ztm0Var2.r0(s890Var.a(ztm0Var2.getLayoutDirection())) : ztm0Var2.r0(s200.r(s890Var, ztm0Var2.getLayoutDirection()));
        int r03 = ztm0Var2.r0(s890Var.d());
        int r04 = ztm0Var2.r0(s890Var.b()) + r03;
        int i22 = r0 + r02;
        int i23 = z7 ? r04 : i22;
        int i24 = z7 ? r03 : !z7 ? r0 : r02;
        int i25 = i23 - i24;
        long i26 = s6j.i(-i22, -r04, j);
        yuy invoke = this.d.invoke();
        lsy e = invoke.e();
        int i27 = o6j.i(i26);
        int h = o6j.h(i26);
        ((wak0) e.a).C(i27);
        ((wak0) e.b).C(h);
        a.e eVar = this.f;
        a.n nVar = this.e;
        if (z7) {
            if (nVar == null) {
                throw jq.f("null verticalArrangement when isVertical == true");
            }
            a = nVar.a();
        } else {
            if (eVar == null) {
                throw jq.f("null horizontalAlignment when isVertical == false");
            }
            a = eVar.a();
        }
        int r05 = ztm0Var2.r0(a);
        int itemCount = invoke.getItemCount();
        int h2 = z7 ? o6j.h(j) - r04 : o6j.i(j) - i22;
        int i28 = i24;
        cvy cvyVar2 = new cvy(i26, this.b, invoke, qtyVar, itemCount, r05, this.j, this.k, i28, i25, (r0 << 32) | (r03 & 4294967295L), this.a);
        int i29 = itemCount;
        dak0 a2 = dak0.a.a();
        izs<Object, s3q0> e2 = a2 != null ? a2.e() : null;
        dak0 b = dak0.a.b(a2);
        try {
            int h3 = xvyVar2.h();
            ovy ovyVar = xvyVar2.e;
            int f2 = ine0.f(h3, invoke, ovyVar.d);
            if (h3 != f2) {
                i = i25;
                ((wak0) ovyVar.a).C(f2);
                ovyVar.e.c(h3);
            } else {
                i = i25;
            }
            int i30 = xvyVar2.i();
            s3q0 s3q0Var = s3q0.a;
            dak0.a.d(a2, b, e2);
            List<Integer> a3 = usy.a(invoke, xvyVar2.s, xvyVar2.p);
            float floatValue = (ztm0Var2.z1() || !z6) ? xvyVar2.h : ((Number) ((zak0) xvyVar2.x.b.c).getValue()).floatValue();
            bty<ivy> btyVar2 = xvyVar2.o;
            final boolean z1 = ztm0Var2.z1();
            final wh50<s3q0> wh50Var = xvyVar2.w;
            boolean z8 = xvyVar2.i;
            if (i28 < 0) {
                xzw.a("invalid beforeContentPadding");
            }
            if (i < 0) {
                xzw.a("invalid afterContentPadding");
            }
            jgp jgpVar2 = jgp.b;
            int i31 = i30;
            yuy yuyVar = cvyVar2.d;
            boolean z9 = this.b;
            yvj yvjVar = this.g;
            kdu kduVar = this.h;
            if (i29 <= 0) {
                int k = o6j.k(i26);
                int j2 = o6j.j(i26);
                btyVar2.d(0, k, j2, new ArrayList(), yuyVar.a(), cvyVar2, z9, z1, 1, z6, 0, 0, yvjVar, kduVar);
                if (!z1) {
                    long b2 = btyVar2.b();
                    if (!q9x.b(b2, 0L)) {
                        k = s6j.g((int) (b2 >> 32), i26);
                        j2 = s6j.f((int) (b2 & 4294967295L), i26);
                    }
                }
                xvyVar = xvyVar2;
                hvyVar = new hvy(null, 0, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ztm0Var2.Q(s6j.g(k + i22, j), s6j.f(j2 + r04, j), jgpVar2, new oc0(26)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, yvjVar, qtyVar, cvyVar2.f, EmptyList.b, -i28, h2 + i, 0, z9 ? Orientation.Vertical : Orientation.Horizontal, i, r05);
                ztm0Var = ztm0Var2;
                z4 = false;
            } else {
                cvy cvyVar3 = cvyVar2;
                int i32 = i;
                xvyVar = xvyVar2;
                if (f2 >= i29) {
                    f2 = i29 - 1;
                    i31 = 0;
                }
                int round = Math.round(floatValue);
                int i33 = i31 - round;
                if (f2 == 0 && i33 < 0) {
                    round += i33;
                    i33 = 0;
                }
                ?? sk3Var2 = new sk3();
                int i34 = -i28;
                int i35 = f2;
                int i36 = i34 + (r05 < 0 ? r05 : 0);
                int i37 = i33 + i36;
                float f3 = floatValue;
                int i38 = 0;
                while (i37 < 0 && i35 > 0) {
                    int i39 = i34;
                    int i40 = i35 - 1;
                    ztm0 ztm0Var3 = ztm0Var2;
                    ivy L0 = jvy.L0(cvyVar3, i40);
                    i35 = i40;
                    sk3Var2.add(0, L0);
                    i38 = Math.max(i38, L0.s);
                    i37 += L0.r;
                    i34 = i39;
                    ztm0Var2 = ztm0Var3;
                }
                ztm0 ztm0Var4 = ztm0Var2;
                int i41 = i34;
                if (i37 < i36) {
                    round -= i36 - i37;
                    i37 = i36;
                }
                int i42 = round;
                int i43 = i37 - i36;
                int i44 = h2 + i32;
                int i45 = i44 < 0 ? 0 : i44;
                int i46 = i38;
                int i47 = -i43;
                int i48 = i43;
                int i49 = i35;
                int i50 = 0;
                boolean z10 = false;
                while (i50 < sk3Var2.size()) {
                    if (i47 >= i45) {
                        sk3Var2.remove(i50);
                        s3q0 s3q0Var2 = s3q0.a;
                        z10 = true;
                    } else {
                        i49++;
                        i47 += ((ivy) sk3Var2.get(i50)).r;
                        i50++;
                    }
                }
                int i51 = i46;
                int i52 = i49;
                boolean z11 = z10;
                while (i52 < i29 && (i47 < i45 || i47 <= 0 || sk3Var2.isEmpty())) {
                    int i53 = i45;
                    ivy L02 = jvy.L0(cvyVar3, i52);
                    int i54 = i29;
                    int i55 = L02.r;
                    i47 += i55;
                    if (i47 <= i36) {
                        i21 = i36;
                        if (i52 != i54 - 1) {
                            i48 -= i55;
                            s3q0 s3q0Var3 = s3q0.a;
                            i35 = i52 + 1;
                            z11 = true;
                            i52++;
                            i45 = i53;
                            i36 = i21;
                            i29 = i54;
                        }
                    } else {
                        i21 = i36;
                    }
                    int max = Math.max(i51, L02.s);
                    sk3Var2.addLast(L02);
                    i51 = max;
                    i52++;
                    i45 = i53;
                    i36 = i21;
                    i29 = i54;
                }
                int i56 = i29;
                if (i47 < h2) {
                    int i57 = h2 - i47;
                    int i58 = i47 + i57;
                    int i59 = i51;
                    i6 = i48 - i57;
                    while (i6 < i28 && i35 > 0) {
                        int i60 = i35 - 1;
                        int i61 = i57;
                        ivy L03 = jvy.L0(cvyVar3, i60);
                        sk3Var2.add(0, L03);
                        i59 = Math.max(i59, L03.s);
                        i6 += L03.r;
                        i35 = i60;
                        i57 = i61;
                        i58 = i58;
                    }
                    int i62 = i58;
                    i2 = i42 + i57;
                    if (i6 < 0) {
                        i2 += i6;
                        int i63 = i62 + i6;
                        int i64 = i59;
                        i3 = i63;
                        i4 = i64;
                        i5 = i35;
                        i6 = 0;
                    } else {
                        i4 = i59;
                        i5 = i35;
                        i3 = i62;
                    }
                } else {
                    i2 = i42;
                    i3 = i47;
                    i4 = i51;
                    i5 = i35;
                    i6 = i48;
                }
                int i65 = i4;
                float f4 = (Integer.signum(Math.round(f3)) != Integer.signum(i2) || Math.abs(Math.round(f3)) < Math.abs(i2)) ? f3 : i2;
                float f5 = f3 - f4;
                float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (z1 && i2 > i42 && f5 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f6 = (i2 - i42) + f5;
                }
                float f7 = f6;
                if (i6 < 0) {
                    xzw.a("negative currentFirstItemScrollOffset");
                }
                int i66 = -i6;
                ivy ivyVar = (ivy) sk3Var2.first();
                if (i28 > 0 || r05 < 0) {
                    f = f7;
                    int size = sk3Var2.size();
                    i7 = i66;
                    int i67 = i6;
                    int i68 = 0;
                    while (i68 < size) {
                        int i69 = size;
                        int i70 = ((ivy) sk3Var2.get(i68)).r;
                        if (i67 == 0 || i70 > i67 || i68 == e43.h(sk3Var2)) {
                            break;
                        }
                        i67 -= i70;
                        i68++;
                        ivyVar = (ivy) sk3Var2.get(i68);
                        size = i69;
                    }
                    i8 = i67;
                } else {
                    f = f7;
                    i7 = i66;
                    i8 = i6;
                }
                ivy ivyVar2 = ivyVar;
                int max2 = Math.max(0, i5);
                int i71 = i5 - 1;
                List list2 = null;
                if (max2 <= i71) {
                    while (true) {
                        if (list2 == null) {
                            list2 = new ArrayList();
                        }
                        list2.add(jvy.L0(cvyVar3, i71));
                        if (i71 == max2) {
                            break;
                        }
                        i71--;
                    }
                }
                List<Integer> list3 = a3;
                int size2 = list3.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i72 = size2 - 1;
                        int intValue = a3.get(size2).intValue();
                        if (intValue < max2) {
                            if (list2 == null) {
                                list2 = new ArrayList();
                            }
                            list2.add(jvy.L0(cvyVar3, intValue));
                        }
                        if (i72 < 0) {
                            break;
                        }
                        size2 = i72;
                    }
                }
                if (list2 == null) {
                    list2 = EmptyList.b;
                }
                int size3 = list2.size();
                int i73 = i65;
                for (int i74 = 0; i74 < size3; i74++) {
                    i73 = Math.max(i73, ((ivy) list2.get(i74)).s);
                }
                int min = Math.min(((ivy) j5g.i0(sk3Var2)).a, i56 - 1);
                int i75 = ((ivy) j5g.i0(sk3Var2)).a + 1;
                if (i75 <= min) {
                    List list4 = null;
                    while (true) {
                        if (list4 == null) {
                            list4 = new ArrayList();
                        }
                        i9 = i52;
                        i10 = i73;
                        list = list4;
                        list.add(jvy.L0(cvyVar3, i75));
                        if (i75 == min) {
                            break;
                        }
                        i75++;
                        list4 = list;
                        i73 = i10;
                        i52 = i9;
                    }
                } else {
                    i9 = i52;
                    i10 = i73;
                    list = null;
                }
                if (list != null && ((ivy) j5g.i0(list)).a > min) {
                    min = ((ivy) j5g.i0(list)).a;
                }
                int size4 = list3.size();
                int i76 = 0;
                while (i76 < size4) {
                    List<Integer> list5 = a3;
                    int intValue2 = a3.get(i76).intValue();
                    if (intValue2 > min) {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(jvy.L0(cvyVar3, intValue2));
                    }
                    i76++;
                    a3 = list5;
                }
                if (list == null) {
                    list = EmptyList.b;
                }
                int size5 = list.size();
                int i77 = i10;
                for (int i78 = 0; i78 < size5; i78++) {
                    i77 = Math.max(i77, ((ivy) list.get(i78)).s);
                }
                boolean z12 = epx.f(ivyVar2, sk3Var2.first()) && list2.isEmpty() && list.isEmpty();
                int g = s6j.g(z9 ? i77 : i3, i26);
                if (z9) {
                    i77 = i3;
                }
                int f8 = s6j.f(i77, i26);
                if (!z9) {
                    f8 = g;
                }
                boolean z13 = i3 < Math.min(f8, h2);
                if (z13 && i7 != 0) {
                    xzw.c("non-zero itemsScrollOffset");
                }
                boolean z14 = z13;
                ArrayList arrayList = new ArrayList(list.size() + list2.size() + sk3Var2.size());
                if (z14) {
                    if (!list2.isEmpty() || !list.isEmpty()) {
                        xzw.a("no extra items");
                    }
                    int size6 = sk3Var2.size();
                    int[] iArr2 = new int[size6];
                    int i79 = 0;
                    while (i79 < size6) {
                        iArr2[i79] = ((ivy) sk3Var2.get(i79)).p;
                        i79++;
                        cvyVar3 = cvyVar3;
                    }
                    cvy cvyVar4 = cvyVar3;
                    int[] iArr3 = new int[size6];
                    if (z9) {
                        if (nVar == null) {
                            throw jq.f("null verticalArrangement when isVertical == true");
                        }
                        nVar.c(qtyVar, f8, iArr2, iArr3);
                        i11 = h2;
                        i12 = i3;
                        z = z12;
                        jgpVar = jgpVar2;
                        i20 = g;
                        z2 = false;
                        i14 = f8;
                        cvyVar = cvyVar4;
                        iArr = iArr3;
                    } else {
                        if (eVar == null) {
                            throw jq.f("null horizontalArrangement when isVertical == false");
                        }
                        i11 = h2;
                        i12 = i3;
                        z = z12;
                        jgpVar = jgpVar2;
                        i20 = g;
                        z2 = false;
                        i14 = f8;
                        cvyVar = cvyVar4;
                        iArr = iArr3;
                        eVar.b(qtyVar, f8, iArr2, LayoutDirection.Ltr, iArr);
                    }
                    k9x P = rl3.P(iArr);
                    P.getClass();
                    int i80 = P.c;
                    int i81 = P.d;
                    if ((i81 > 0 && i80 >= 0) || (i81 < 0 && i80 <= 0)) {
                        ?? r6 = z2;
                        while (true) {
                            int i82 = iArr[r6];
                            ivy ivyVar3 = (ivy) sk3Var2.get(r6);
                            ivyVar3.i(i82, i20, i14);
                            arrayList.add(ivyVar3);
                            if (r6 == i80) {
                                break;
                            }
                            r6 += i81;
                        }
                    }
                    i13 = i20;
                } else {
                    i11 = h2;
                    i12 = i3;
                    z = z12;
                    jgpVar = jgpVar2;
                    i13 = g;
                    z2 = false;
                    cvyVar = cvyVar3;
                    i14 = f8;
                    int i83 = i7;
                    int i84 = 0;
                    for (int size7 = list2.size(); i84 < size7; size7 = size7) {
                        ivy ivyVar4 = (ivy) list2.get(i84);
                        i83 -= ivyVar4.r;
                        ivyVar4.i(i83, i13, i14);
                        arrayList.add(ivyVar4);
                        i84++;
                    }
                    int size8 = sk3Var2.size();
                    int i85 = i7;
                    for (int i86 = 0; i86 < size8; i86++) {
                        ivy ivyVar5 = (ivy) sk3Var2.get(i86);
                        ivyVar5.i(i85, i13, i14);
                        arrayList.add(ivyVar5);
                        i85 += ivyVar5.r;
                    }
                    int size9 = list.size();
                    for (int i87 = 0; i87 < size9; i87++) {
                        ivy ivyVar6 = (ivy) list.get(i87);
                        ivyVar6.i(i85, i13, i14);
                        arrayList.add(ivyVar6);
                        i85 += ivyVar6.r;
                    }
                }
                if (z8) {
                    r4 = arrayList;
                    i15 = i13;
                    i16 = i14;
                    btyVar = btyVar2;
                } else {
                    int i88 = i13;
                    int i89 = i14;
                    btyVar = btyVar2;
                    btyVar.d((int) f4, i88, i89, arrayList, yuyVar.a(), cvyVar, z9, z1, 1, z6, i8, i12, yvjVar, kduVar);
                    i15 = i88;
                    i16 = i89;
                    r4 = arrayList;
                }
                cvy cvyVar5 = cvyVar;
                int i90 = i12;
                if (z1) {
                    z3 = z9;
                    sk3Var = sk3Var2;
                } else {
                    long b3 = btyVar.b();
                    z3 = z9;
                    sk3Var = sk3Var2;
                    if (!q9x.b(b3, 0L)) {
                        int i91 = z3 ? i16 : i15;
                        int g2 = s6j.g(Math.max(i15, (int) (b3 >> 32)), i26);
                        i16 = s6j.f(Math.max(i16, (int) (b3 & 4294967295L)), i26);
                        int i92 = z3 ? i16 : g2;
                        if (i92 != i91) {
                            int size10 = r4.size();
                            for (?? r8 = z2; r8 < size10; r8++) {
                                ivy ivyVar7 = (ivy) r4.get(r8);
                                ivyVar7.u = i92;
                                ivyVar7.w = ivyVar7.h + i92;
                            }
                        }
                        i17 = g2;
                        int i93 = i16;
                        ivy ivyVar8 = (ivy) sk3Var.d();
                        ?? r19 = ivyVar8 == null ? ivyVar8.a : z2;
                        ivy ivyVar9 = (ivy) sk3Var.g();
                        final ArrayList arrayList2 = r4;
                        final List d = wwf0.d(this.i, r19, ivyVar9 == null ? ivyVar9.a : z2, arrayList2, yuyVar.c(), i28, i32, i17, i93, new r9k(cvyVar5, 21));
                        if (z) {
                            ivy ivyVar10 = (ivy) sk3Var.d();
                            if (ivyVar10 != null) {
                                valueOf = Integer.valueOf(ivyVar10.a);
                                if (z) {
                                }
                                if (i19 >= i18) {
                                }
                                dp10 Q = ztm0Var4.Q(s6j.g(i17 + i22, j), s6j.f(i93 + r04, j), jgpVar, new izs() { // from class: xsna.gvy
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj) {
                                        boolean z15;
                                        tra0.a aVar = (tra0.a) obj;
                                        aVar.b = true;
                                        ArrayList arrayList3 = arrayList2;
                                        int size11 = arrayList3.size();
                                        int i94 = 0;
                                        while (true) {
                                            z15 = z1;
                                            if (i94 >= size11) {
                                                break;
                                            }
                                            ((ivy) arrayList3.get(i94)).e(aVar, z15);
                                            i94++;
                                        }
                                        List list6 = d;
                                        int size12 = list6.size();
                                        for (int i95 = 0; i95 < size12; i95++) {
                                            ((ivy) list6.get(i95)).e(aVar, z15);
                                        }
                                        s3q0 s3q0Var4 = s3q0.a;
                                        aVar.b = false;
                                        wh50.this.getValue();
                                        return s3q0.a;
                                    }
                                });
                                ztm0Var = ztm0Var4;
                                z4 = z2;
                                hvyVar = new hvy(ivyVar2, i8, z5, f4, Q, f, z11, yvjVar, qtyVar, cvyVar5.f, vua0.H(valueOf == null ? valueOf.intValue() : z2, valueOf2 == null ? valueOf2.intValue() : z2, arrayList2, d), i41, i44, i18, !z3 ? Orientation.Vertical : Orientation.Horizontal, i32, r05);
                            }
                            valueOf = null;
                            if (z) {
                            }
                            if (i19 >= i18) {
                            }
                            dp10 Q2 = ztm0Var4.Q(s6j.g(i17 + i22, j), s6j.f(i93 + r04, j), jgpVar, new izs() { // from class: xsna.gvy
                                @Override // xsna.izs
                                public final Object invoke(Object obj) {
                                    boolean z15;
                                    tra0.a aVar = (tra0.a) obj;
                                    aVar.b = true;
                                    ArrayList arrayList3 = arrayList2;
                                    int size11 = arrayList3.size();
                                    int i94 = 0;
                                    while (true) {
                                        z15 = z1;
                                        if (i94 >= size11) {
                                            break;
                                        }
                                        ((ivy) arrayList3.get(i94)).e(aVar, z15);
                                        i94++;
                                    }
                                    List list6 = d;
                                    int size12 = list6.size();
                                    for (int i95 = 0; i95 < size12; i95++) {
                                        ((ivy) list6.get(i95)).e(aVar, z15);
                                    }
                                    s3q0 s3q0Var4 = s3q0.a;
                                    aVar.b = false;
                                    wh50.this.getValue();
                                    return s3q0.a;
                                }
                            });
                            ztm0Var = ztm0Var4;
                            z4 = z2;
                            hvyVar = new hvy(ivyVar2, i8, z5, f4, Q2, f, z11, yvjVar, qtyVar, cvyVar5.f, vua0.H(valueOf == null ? valueOf.intValue() : z2, valueOf2 == null ? valueOf2.intValue() : z2, arrayList2, d), i41, i44, i18, !z3 ? Orientation.Vertical : Orientation.Horizontal, i32, r05);
                        } else {
                            ivy ivyVar11 = (ivy) j5g.a0(arrayList2);
                            if (ivyVar11 != null) {
                                valueOf = Integer.valueOf(ivyVar11.a);
                                if (z) {
                                    ivy ivyVar12 = (ivy) sk3Var.g();
                                    if (ivyVar12 != null) {
                                        valueOf2 = Integer.valueOf(ivyVar12.a);
                                        i18 = i56;
                                        i19 = i9;
                                    }
                                    i18 = i56;
                                    i19 = i9;
                                    valueOf2 = null;
                                } else {
                                    ivy ivyVar13 = (ivy) j5g.k0(arrayList2);
                                    if (ivyVar13 != null) {
                                        valueOf2 = Integer.valueOf(ivyVar13.a);
                                        i18 = i56;
                                        i19 = i9;
                                    }
                                    i18 = i56;
                                    i19 = i9;
                                    valueOf2 = null;
                                }
                                if (i19 >= i18 && i90 <= i11) {
                                    z5 = z2;
                                }
                                dp10 Q22 = ztm0Var4.Q(s6j.g(i17 + i22, j), s6j.f(i93 + r04, j), jgpVar, new izs() { // from class: xsna.gvy
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj) {
                                        boolean z15;
                                        tra0.a aVar = (tra0.a) obj;
                                        aVar.b = true;
                                        ArrayList arrayList3 = arrayList2;
                                        int size11 = arrayList3.size();
                                        int i94 = 0;
                                        while (true) {
                                            z15 = z1;
                                            if (i94 >= size11) {
                                                break;
                                            }
                                            ((ivy) arrayList3.get(i94)).e(aVar, z15);
                                            i94++;
                                        }
                                        List list6 = d;
                                        int size12 = list6.size();
                                        for (int i95 = 0; i95 < size12; i95++) {
                                            ((ivy) list6.get(i95)).e(aVar, z15);
                                        }
                                        s3q0 s3q0Var4 = s3q0.a;
                                        aVar.b = false;
                                        wh50.this.getValue();
                                        return s3q0.a;
                                    }
                                });
                                ztm0Var = ztm0Var4;
                                z4 = z2;
                                hvyVar = new hvy(ivyVar2, i8, z5, f4, Q22, f, z11, yvjVar, qtyVar, cvyVar5.f, vua0.H(valueOf == null ? valueOf.intValue() : z2, valueOf2 == null ? valueOf2.intValue() : z2, arrayList2, d), i41, i44, i18, !z3 ? Orientation.Vertical : Orientation.Horizontal, i32, r05);
                            }
                            valueOf = null;
                            if (z) {
                            }
                            if (i19 >= i18) {
                                z5 = z2;
                            }
                            dp10 Q222 = ztm0Var4.Q(s6j.g(i17 + i22, j), s6j.f(i93 + r04, j), jgpVar, new izs() { // from class: xsna.gvy
                                @Override // xsna.izs
                                public final Object invoke(Object obj) {
                                    boolean z15;
                                    tra0.a aVar = (tra0.a) obj;
                                    aVar.b = true;
                                    ArrayList arrayList3 = arrayList2;
                                    int size11 = arrayList3.size();
                                    int i94 = 0;
                                    while (true) {
                                        z15 = z1;
                                        if (i94 >= size11) {
                                            break;
                                        }
                                        ((ivy) arrayList3.get(i94)).e(aVar, z15);
                                        i94++;
                                    }
                                    List list6 = d;
                                    int size12 = list6.size();
                                    for (int i95 = 0; i95 < size12; i95++) {
                                        ((ivy) list6.get(i95)).e(aVar, z15);
                                    }
                                    s3q0 s3q0Var4 = s3q0.a;
                                    aVar.b = false;
                                    wh50.this.getValue();
                                    return s3q0.a;
                                }
                            });
                            ztm0Var = ztm0Var4;
                            z4 = z2;
                            hvyVar = new hvy(ivyVar2, i8, z5, f4, Q222, f, z11, yvjVar, qtyVar, cvyVar5.f, vua0.H(valueOf == null ? valueOf.intValue() : z2, valueOf2 == null ? valueOf2.intValue() : z2, arrayList2, d), i41, i44, i18, !z3 ? Orientation.Vertical : Orientation.Horizontal, i32, r05);
                        }
                    }
                }
                i17 = i15;
                int i932 = i16;
                ivy ivyVar82 = (ivy) sk3Var.d();
                if (ivyVar82 == null) {
                }
                ivy ivyVar92 = (ivy) sk3Var.g();
                final ArrayList arrayList22 = r4;
                final List d2 = wwf0.d(this.i, r19, ivyVar92 == null ? ivyVar92.a : z2, arrayList22, yuyVar.c(), i28, i32, i17, i932, new r9k(cvyVar5, 21));
                if (z) {
                }
            }
            xvy xvyVar3 = xvyVar;
            xvyVar3.g(hvyVar, ztm0Var.z1(), z4);
            lhl lhlVar = xvyVar3.a;
            return hvyVar;
        } catch (Throwable th) {
            dak0.a.d(a2, b, e2);
            throw th;
        }
    }
}
