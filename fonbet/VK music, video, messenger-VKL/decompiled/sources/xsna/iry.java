package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.dak0;
import xsna.tra0;
import xsna.xel0;
import xsna.xry;

/* compiled from: LazyGrid.kt */
/* loaded from: classes11.dex */
public final class iry implements oty {
    public final /* synthetic */ dsy a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ s890 c;
    public final /* synthetic */ gzs<yqy> d;
    public final /* synthetic */ vry e;
    public final /* synthetic */ a.n f;
    public final /* synthetic */ a.e g;
    public final /* synthetic */ yvj h;
    public final /* synthetic */ kdu i;
    public final /* synthetic */ xel0 j;

    public iry(dsy dsyVar, boolean z, s890 s890Var, rcy rcyVar, vry vryVar, a.n nVar, a.e eVar, yvj yvjVar, kdu kduVar, xel0.a.C3999a c3999a) {
        this.a = dsyVar;
        this.b = z;
        this.c = s890Var;
        this.d = rcyVar;
        this.e = vryVar;
        this.f = nVar;
        this.g = eVar;
        this.h = yvjVar;
        this.i = kduVar;
        this.j = c3999a;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0483 A[EDGE_INSN: B:159:0x0483->B:160:0x0483 BREAK  A[LOOP:4: B:146:0x043e->B:156:0x047d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x064a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x065e A[LOOP:12: B:249:0x065c->B:250:0x065e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x082d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0298  */
    @Override // xsna.oty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dp10 a(qty qtyVar, long j) {
        float a;
        int i;
        int c;
        int h;
        dsy dsyVar;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        ory oryVar;
        int i7;
        int size;
        int i8;
        List list;
        xry xryVar;
        int i9;
        int i10;
        float f;
        List list2;
        int size2;
        int i11;
        List list3;
        int size3;
        int i12;
        ory oryVar2;
        int i13;
        long j2;
        int g;
        boolean z2;
        int size4;
        int i14;
        ory oryVar3;
        int i15;
        int i16;
        boolean z3;
        int i17;
        mry mryVar;
        ztm0 ztm0Var;
        int i18;
        int i19;
        int i20;
        List<Integer> list4;
        gry gryVar;
        List<nry> list5;
        nry nryVar;
        gry gryVar2;
        nry nryVar2;
        ztm0 ztm0Var2 = qtyVar.c;
        dsy dsyVar2 = this.a;
        dsyVar2.s.getValue();
        boolean z4 = dsyVar2.b || ztm0Var2.z1();
        boolean z5 = this.b;
        rdi.n(j, z5 ? Orientation.Vertical : Orientation.Horizontal);
        s890 s890Var = this.c;
        int r0 = z5 ? ztm0Var2.r0(s890Var.c(ztm0Var2.getLayoutDirection())) : ztm0Var2.r0(s200.s(s890Var, ztm0Var2.getLayoutDirection()));
        int r02 = z5 ? ztm0Var2.r0(s890Var.a(ztm0Var2.getLayoutDirection())) : ztm0Var2.r0(s200.r(s890Var, ztm0Var2.getLayoutDirection()));
        int r03 = ztm0Var2.r0(s890Var.d());
        int r04 = ztm0Var2.r0(s890Var.b()) + r03;
        int i21 = r0 + r02;
        int i22 = z5 ? r04 : i21;
        int i23 = z5 ? r03 : !z5 ? r0 : r02;
        int i24 = i22 - i23;
        long i25 = s6j.i(-i21, -r04, j);
        yqy invoke = this.d.invoke();
        xry i26 = invoke.i();
        ury a2 = this.e.a(qtyVar, i25);
        int length = a2.a.length;
        if (length != i26.i) {
            i26.i = length;
            ArrayList<xry.a> arrayList = i26.b;
            arrayList.clear();
            arrayList.add(new xry.a(0, 0));
            i26.c = 0;
            i26.d = 0;
            i26.e = 0;
            i26.f = -1;
            i26.g.clear();
        }
        a.e eVar = this.g;
        a.n nVar = this.f;
        if (z5) {
            if (nVar == null) {
                throw jq.f("null verticalArrangement when isVertical == true");
            }
            a = nVar.a();
        } else {
            if (eVar == null) {
                throw jq.f("null horizontalArrangement when isVertical == false");
            }
            a = eVar.a();
        }
        int r05 = ztm0Var2.r0(a);
        int itemCount = invoke.getItemCount();
        int h2 = z5 ? o6j.h(j) - r04 : o6j.i(j) - i21;
        int i27 = i23;
        gry gryVar3 = new gry(invoke, qtyVar, r05, this.a, this.b, i27, i24, (r0 << 32) | (r03 & 4294967295L));
        hry hryVar = new hry(this.b, a2, itemCount, r05, gryVar3, i26);
        cq3 cq3Var = new cq3(18, i26, hryVar);
        igh ighVar = new igh(i26, 22);
        dak0 a3 = dak0.a.a();
        izs<Object, s3q0> e = a3 != null ? a3.e() : null;
        dak0 b = dak0.a.b(a3);
        try {
            int g2 = dsyVar2.g();
            sry sryVar = dsyVar2.d;
            int f2 = ine0.f(g2, invoke, sryVar.d);
            if (g2 != f2) {
                i = h2;
                ((wak0) sryVar.a).C(f2);
                sryVar.e.c(g2);
            } else {
                i = h2;
            }
            if (f2 >= itemCount && itemCount > 0) {
                c = i26.c(itemCount - 1);
                h = 0;
                s3q0 s3q0Var = s3q0.a;
                dak0.a.d(a3, b, e);
                List<Integer> a4 = usy.a(invoke, dsyVar2.q, dsyVar2.n);
                float floatValue = (ztm0Var2.z1() && z4) ? ((Number) ((zak0) dsyVar2.v.b.c).getValue()).floatValue() : dsyVar2.g;
                bty<nry> btyVar = dsyVar2.m;
                final boolean z1 = ztm0Var2.z1();
                mry mryVar2 = dsyVar2.c;
                final wh50<s3q0> wh50Var = dsyVar2.r;
                if (i27 < 0) {
                    xzw.a("negative beforeContentPadding");
                }
                if (i24 < 0) {
                    xzw.a("negative afterContentPadding");
                }
                jgp jgpVar = jgp.b;
                yqy yqyVar = gryVar3.d;
                int i28 = c;
                boolean z6 = this.b;
                yvj yvjVar = this.h;
                kdu kduVar = this.i;
                if (itemCount > 0) {
                    int k = o6j.k(i25);
                    int j3 = o6j.j(i25);
                    btyVar.d(0, k, j3, new ArrayList(), yqyVar.a(), gryVar3, z6, z1, length, z4, 0, 0, yvjVar, kduVar);
                    if (!z1) {
                        long b2 = btyVar.b();
                        if (!q9x.b(b2, 0L)) {
                            k = s6j.g((int) (b2 >> 32), i25);
                            j3 = s6j.f((int) (b2 & 4294967295L), i25);
                        }
                    }
                    dsyVar = dsyVar2;
                    mryVar = new mry(null, 0, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ztm0Var2.Q(s6j.g(k + i21, j), s6j.f(j3 + r04, j), jgpVar, new p60(29)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, yvjVar, qtyVar, length, cq3Var, ighVar, EmptyList.b, -i27, i + i24, 0, z6 ? Orientation.Vertical : Orientation.Horizontal, i24, r05);
                    ztm0Var = ztm0Var2;
                } else {
                    gry gryVar4 = gryVar3;
                    dsyVar = dsyVar2;
                    int round = Math.round(floatValue);
                    int i29 = h - round;
                    if (i28 == 0 && i29 < 0) {
                        round += i29;
                        i29 = 0;
                    }
                    sk3 sk3Var = new sk3();
                    int i30 = -i27;
                    int i31 = i29;
                    int i32 = i30 + (r05 < 0 ? r05 : 0);
                    float f3 = floatValue;
                    int i33 = i31 + i32;
                    while (i33 < 0 && i28 > 0) {
                        int i34 = round;
                        int i35 = i28 - 1;
                        int i36 = i30;
                        ory c2 = hryVar.c(i35);
                        sk3Var.add(0, c2);
                        i33 += c2.h;
                        i28 = i35;
                        round = i34;
                        i30 = i36;
                        ztm0Var2 = ztm0Var2;
                    }
                    ztm0 ztm0Var3 = ztm0Var2;
                    int i37 = round;
                    int i38 = i30;
                    int i39 = 0;
                    if (i33 < i32) {
                        i2 = i37 - (i32 - i33);
                        i33 = i32;
                    } else {
                        i2 = i37;
                    }
                    int i40 = i33 - i32;
                    int i41 = i + i24;
                    if (i41 < 0) {
                        i3 = i41;
                    } else {
                        i39 = i41;
                        i3 = i39;
                    }
                    int i42 = i40;
                    int i43 = -i40;
                    int i44 = i28;
                    int i45 = 0;
                    boolean z7 = false;
                    while (i45 < sk3Var.size()) {
                        if (i43 >= i39) {
                            sk3Var.remove(i45);
                            s3q0 s3q0Var2 = s3q0.a;
                            z7 = true;
                        } else {
                            i44++;
                            i43 += ((ory) sk3Var.get(i45)).h;
                            i45++;
                        }
                    }
                    boolean z8 = z7;
                    int i46 = i44;
                    while (i46 < itemCount && (i43 < i39 || i43 <= 0 || sk3Var.isEmpty())) {
                        int i47 = i39;
                        ory c3 = hryVar.c(i46);
                        z = z8;
                        nry[] nryVarArr = c3.b;
                        int i48 = i46;
                        int i49 = c3.h;
                        if (nryVarArr.length == 0) {
                            break;
                        }
                        i43 += i49;
                        if (i43 > i32 || ((nry) rl3.b0(nryVarArr)).a == itemCount - 1) {
                            sk3Var.addLast(c3);
                            z8 = z;
                        } else {
                            i42 -= i49;
                            s3q0 s3q0Var3 = s3q0.a;
                            i28 = i48 + 1;
                            z8 = true;
                        }
                        i46 = i48 + 1;
                        i39 = i47;
                    }
                    z = z8;
                    int i50 = i;
                    if (i43 < i50) {
                        int i51 = i50 - i43;
                        int i52 = i43 + i51;
                        i6 = i42 - i51;
                        while (i6 < i27 && i28 > 0) {
                            int i53 = i28 - 1;
                            int i54 = i51;
                            ory c4 = hryVar.c(i53);
                            sk3Var.add(0, c4);
                            i6 += c4.h;
                            i51 = i54;
                            i52 = i52;
                            i28 = i53;
                        }
                        int i55 = i52;
                        i5 = i2 + i51;
                        if (i6 < 0) {
                            i5 += i6;
                            i4 = i55 + i6;
                            i6 = 0;
                        } else {
                            i4 = i55;
                        }
                    } else {
                        i4 = i43;
                        i5 = i2;
                        i6 = i42;
                    }
                    float f4 = (Integer.signum(Math.round(f3)) != Integer.signum(i5) || Math.abs(Math.round(f3)) < Math.abs(i5)) ? f3 : i5;
                    float f5 = f3 - f4;
                    float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (z1 && i5 > i2 && f5 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f6 = (i5 - i2) + f5;
                    }
                    float f7 = f6;
                    if (i6 < 0) {
                        xzw.a("negative initial offset");
                    }
                    int i56 = -i6;
                    ory oryVar4 = (ory) sk3Var.d();
                    int i57 = (oryVar4 == null || (nryVar2 = (nry) rl3.O(oryVar4.b)) == null) ? 0 : nryVar2.a;
                    ory oryVar5 = (ory) sk3Var.g();
                    if (oryVar5 != null) {
                        nry[] nryVarArr2 = oryVar5.b;
                        oryVar = oryVar4;
                        nry nryVar3 = nryVarArr2.length == 0 ? null : nryVarArr2[nryVarArr2.length - 1];
                        if (nryVar3 != null) {
                            i7 = nryVar3.a;
                            List<Integer> list6 = a4;
                            size = list6.size();
                            int i58 = i6;
                            i8 = 0;
                            list = null;
                            while (true) {
                                xryVar = hryVar.f;
                                if (i8 < size) {
                                    break;
                                }
                                int i59 = size;
                                int intValue = a4.get(i8).intValue();
                                if (intValue < 0 || intValue >= i57) {
                                    gryVar2 = gryVar4;
                                } else {
                                    int e2 = xryVar.e(intValue);
                                    gry gryVar5 = gryVar4;
                                    nry w0 = gryVar5.w0(intValue, 0, e2, gryVar4.f, hryVar.a(0, e2));
                                    gryVar2 = gryVar5;
                                    if (list == null) {
                                        list = new ArrayList();
                                    }
                                    List list7 = list;
                                    list7.add(w0);
                                    list = list7;
                                }
                                i8++;
                                gryVar4 = gryVar2;
                                size = i59;
                            }
                            gry gryVar6 = gryVar4;
                            if (list == null) {
                                list = EmptyList.b;
                            }
                            List list8 = list;
                            if (z1 && mryVar2 != null) {
                                list5 = mryVar2.m;
                                if (!list5.isEmpty()) {
                                    i10 = i57;
                                    for (int size5 = list5.size() - 1; -1 < size5; size5--) {
                                        if (list5.get(size5).getIndex() > i7 && (size5 == 0 || list5.get(size5 - 1).getIndex() <= i7)) {
                                            nryVar = list5.get(size5);
                                            break;
                                        }
                                    }
                                    nryVar = null;
                                    xqy xqyVar = (xqy) j5g.i0(list5);
                                    ory oryVar6 = (ory) j5g.k0(sk3Var);
                                    int i60 = oryVar6 != null ? oryVar6.a + 1 : 0;
                                    if (nryVar != null) {
                                        int index = nryVar.getIndex();
                                        i9 = i7;
                                        int min = Math.min(xqyVar.getIndex(), itemCount - 1);
                                        if (index <= min) {
                                            list2 = null;
                                            while (true) {
                                                if (list2 != null) {
                                                    int size6 = list2.size();
                                                    f = f4;
                                                    int i61 = 0;
                                                    while (i61 < size6) {
                                                        int i62 = size6;
                                                        nry[] nryVarArr3 = ((ory) list2.get(i61)).b;
                                                        int i63 = i61;
                                                        int length2 = nryVarArr3.length;
                                                        int i64 = 0;
                                                        while (i64 < length2) {
                                                            int i65 = i64;
                                                            if (nryVarArr3[i65].a == index) {
                                                                break;
                                                            }
                                                            i64 = i65 + 1;
                                                        }
                                                        i61 = i63 + 1;
                                                        size6 = i62;
                                                    }
                                                } else {
                                                    f = f4;
                                                }
                                                if (list2 == null) {
                                                    list2 = new ArrayList();
                                                }
                                                ory c5 = hryVar.c(i60);
                                                i60++;
                                                list2.add(c5);
                                                if (index == min) {
                                                    break;
                                                }
                                                index++;
                                                f4 = f;
                                            }
                                            if (list2 == null) {
                                                list2 = EmptyList.b;
                                            }
                                            size2 = list6.size();
                                            i11 = 0;
                                            list3 = null;
                                            while (i11 < size2) {
                                                int intValue2 = a4.get(i11).intValue();
                                                if (i9 + 1 > intValue2 || intValue2 >= itemCount) {
                                                    i20 = size2;
                                                    list4 = a4;
                                                } else {
                                                    if (z1) {
                                                        int size7 = list2.size();
                                                        int i66 = 0;
                                                        while (i66 < size7) {
                                                            i20 = size2;
                                                            nry[] nryVarArr4 = ((ory) list2.get(i66)).b;
                                                            list4 = a4;
                                                            int length3 = nryVarArr4.length;
                                                            int i67 = 0;
                                                            while (i67 < length3) {
                                                                int i68 = i67;
                                                                if (nryVarArr4[i68].a != intValue2) {
                                                                    i67 = i68 + 1;
                                                                }
                                                            }
                                                            i66++;
                                                            a4 = list4;
                                                            size2 = i20;
                                                        }
                                                    }
                                                    i20 = size2;
                                                    list4 = a4;
                                                    int e3 = xryVar.e(intValue2);
                                                    gryVar = gryVar6;
                                                    nry w02 = gryVar.w0(intValue2, 0, e3, gryVar6.f, hryVar.a(0, e3));
                                                    if (list3 == null) {
                                                        list3 = new ArrayList();
                                                    }
                                                    List list9 = list3;
                                                    list9.add(w02);
                                                    list3 = list9;
                                                    i11++;
                                                    a4 = list4;
                                                    gryVar6 = gryVar;
                                                    size2 = i20;
                                                }
                                                gryVar = gryVar6;
                                                i11++;
                                                a4 = list4;
                                                gryVar6 = gryVar;
                                                size2 = i20;
                                            }
                                            gry gryVar7 = gryVar6;
                                            if (list3 == null) {
                                                list3 = EmptyList.b;
                                            }
                                            List list10 = list3;
                                            if (i27 <= 0 || r05 < 0) {
                                                size3 = sk3Var.size();
                                                ory oryVar7 = oryVar;
                                                int i69 = i58;
                                                i12 = 0;
                                                while (i12 < size3) {
                                                    int i70 = ((ory) sk3Var.get(i12)).h;
                                                    if (i69 == 0 || i70 > i69 || i12 == e43.h(sk3Var)) {
                                                        break;
                                                    }
                                                    i69 -= i70;
                                                    i12++;
                                                    oryVar7 = (ory) sk3Var.get(i12);
                                                }
                                                oryVar2 = oryVar7;
                                                i13 = i69;
                                            } else {
                                                oryVar2 = oryVar;
                                                i13 = i58;
                                            }
                                            if (z6) {
                                                j2 = i25;
                                                g = s6j.g(i4, j2);
                                            } else {
                                                g = o6j.i(i25);
                                                j2 = i25;
                                            }
                                            int f8 = !z6 ? s6j.f(i4, j2) : o6j.h(j2);
                                            List list11 = sk3Var;
                                            if (!list2.isEmpty()) {
                                                list11 = j5g.u0(list2, sk3Var);
                                            }
                                            int i71 = !z6 ? f8 : g;
                                            z2 = i4 >= Math.min(i71, i50);
                                            if (z2 && i56 != 0) {
                                                xzw.c("non-zero firstLineScrollOffset");
                                            }
                                            size4 = list11.size();
                                            int i72 = g;
                                            int i73 = f8;
                                            int i74 = 0;
                                            for (i14 = 0; i14 < size4; i14++) {
                                                i74 += ((ory) list11.get(i14)).b.length;
                                            }
                                            final ArrayList arrayList2 = new ArrayList(i74);
                                            if (z2) {
                                                oryVar3 = oryVar2;
                                                i15 = i72;
                                                i16 = i73;
                                                int size8 = list8.size() - 1;
                                                if (size8 >= 0) {
                                                    int i75 = i56;
                                                    while (true) {
                                                        int i76 = size8 - 1;
                                                        nry nryVar4 = (nry) list8.get(size8);
                                                        i75 -= nryVar4.p;
                                                        nryVar4.d(i75, 0, i15, i16);
                                                        arrayList2.add(nryVar4);
                                                        if (i76 < 0) {
                                                            break;
                                                        }
                                                        size8 = i76;
                                                    }
                                                }
                                                int size9 = list11.size();
                                                int i77 = i56;
                                                int i78 = 0;
                                                while (i78 < size9) {
                                                    ory oryVar8 = (ory) list11.get(i78);
                                                    nry[] a5 = oryVar8.a(i77, i15, i16);
                                                    int i79 = size9;
                                                    int i80 = i78;
                                                    int i81 = 0;
                                                    for (int length4 = a5.length; i81 < length4; length4 = length4) {
                                                        arrayList2.add(a5[i81]);
                                                        i81++;
                                                    }
                                                    i77 += oryVar8.h;
                                                    i78 = i80 + 1;
                                                    size9 = i79;
                                                }
                                                int size10 = list10.size();
                                                for (int i82 = 0; i82 < size10; i82++) {
                                                    nry nryVar5 = (nry) list10.get(i82);
                                                    nryVar5.d(i77, 0, i15, i16);
                                                    arrayList2.add(nryVar5);
                                                    i77 += nryVar5.p;
                                                }
                                            } else {
                                                if (!list8.isEmpty() || !list10.isEmpty()) {
                                                    xzw.a("no items");
                                                }
                                                int size11 = list11.size();
                                                int[] iArr = new int[size11];
                                                for (int i83 = 0; i83 < size11; i83++) {
                                                    iArr[i83] = ((ory) list11.get(i83)).g;
                                                }
                                                int[] iArr2 = new int[size11];
                                                if (z6) {
                                                    if (nVar == null) {
                                                        throw jq.f("null verticalArrangement");
                                                    }
                                                    nVar.c(qtyVar, i71, iArr, iArr2);
                                                    oryVar3 = oryVar2;
                                                    i18 = i72;
                                                    i16 = i73;
                                                } else {
                                                    if (eVar == null) {
                                                        throw jq.f("null horizontalArrangement");
                                                    }
                                                    oryVar3 = oryVar2;
                                                    i18 = i72;
                                                    i16 = i73;
                                                    eVar.b(qtyVar, i71, iArr, LayoutDirection.Ltr, iArr2);
                                                }
                                                k9x P = rl3.P(iArr2);
                                                P.getClass();
                                                int i84 = P.c;
                                                int i85 = P.d;
                                                if ((i85 <= 0 || i84 < 0) && (i85 >= 0 || i84 > 0)) {
                                                    i15 = i18;
                                                } else {
                                                    int i86 = 0;
                                                    while (true) {
                                                        nry[] a6 = ((ory) list11.get(i86)).a(iArr2[i86], i18, i16);
                                                        int length5 = a6.length;
                                                        i19 = i18;
                                                        int i87 = 0;
                                                        while (i87 < length5) {
                                                            int i88 = i87;
                                                            arrayList2.add(a6[i88]);
                                                            i87 = i88 + 1;
                                                        }
                                                        if (i86 == i84) {
                                                            break;
                                                        }
                                                        i86 += i85;
                                                        i18 = i19;
                                                    }
                                                    i15 = i19;
                                                }
                                            }
                                            float f9 = f;
                                            int i89 = i15;
                                            int i90 = i4;
                                            btyVar.d((int) f9, i89, i16, arrayList2, yqyVar.a(), gryVar7, z6, z1, length, z4, i13, i90, yvjVar, kduVar);
                                            int i91 = i89;
                                            if (z1) {
                                                long b3 = btyVar.b();
                                                z3 = z6;
                                                i17 = itemCount;
                                                if (!q9x.b(b3, 0L)) {
                                                    int i92 = z3 ? i16 : i91;
                                                    i91 = s6j.g(Math.max(i91, (int) (b3 >> 32)), j2);
                                                    i16 = s6j.f(Math.max(i16, (int) (b3 & 4294967295L)), j2);
                                                    int i93 = z3 ? i16 : i91;
                                                    if (i93 != i92) {
                                                        int size12 = arrayList2.size();
                                                        for (int i94 = 0; i94 < size12; i94++) {
                                                            nry nryVar6 = (nry) arrayList2.get(i94);
                                                            nryVar6.q = i93;
                                                            nryVar6.s = nryVar6.g + i93;
                                                        }
                                                    }
                                                }
                                            } else {
                                                z3 = z6;
                                                i17 = itemCount;
                                            }
                                            int i95 = i91;
                                            int i96 = i16;
                                            int i97 = i10;
                                            int i98 = i9;
                                            final List d = wwf0.d(this.j, i97, i98, arrayList2, yqyVar.c(), i27, i24, i95, i96, new qd1(17, hryVar, gryVar7));
                                            boolean z9 = i98 == i17 + (-1) || i90 > i50;
                                            dp10 Q = ztm0Var3.Q(s6j.g(i95 + i21, j), s6j.f(i96 + r04, j), jgpVar, new izs() { // from class: xsna.lry
                                                @Override // xsna.izs
                                                public final Object invoke(Object obj) {
                                                    boolean z10;
                                                    tra0.a aVar = (tra0.a) obj;
                                                    aVar.b = true;
                                                    ArrayList arrayList3 = arrayList2;
                                                    int size13 = arrayList3.size();
                                                    int i99 = 0;
                                                    while (true) {
                                                        z10 = z1;
                                                        if (i99 >= size13) {
                                                            break;
                                                        }
                                                        ((nry) arrayList3.get(i99)).q(aVar, z10);
                                                        i99++;
                                                    }
                                                    List list12 = d;
                                                    int size14 = list12.size();
                                                    for (int i100 = 0; i100 < size14; i100++) {
                                                        ((nry) list12.get(i100)).q(aVar, z10);
                                                    }
                                                    s3q0 s3q0Var4 = s3q0.a;
                                                    aVar.b = false;
                                                    wh50.this.getValue();
                                                    return s3q0.a;
                                                }
                                            });
                                            ztm0Var = ztm0Var3;
                                            mryVar = new mry(oryVar3, i13, z9, f9, Q, f7, z, yvjVar, qtyVar, length, cq3Var, ighVar, vua0.H(i97, i98, arrayList2, d), i38, i3, i17, !z3 ? Orientation.Vertical : Orientation.Horizontal, i24, r05);
                                        }
                                    } else {
                                        i9 = i7;
                                    }
                                    f = f4;
                                    list2 = null;
                                    if (list2 == null) {
                                    }
                                    size2 = list6.size();
                                    i11 = 0;
                                    list3 = null;
                                    while (i11 < size2) {
                                    }
                                    gry gryVar72 = gryVar6;
                                    if (list3 == null) {
                                    }
                                    List list102 = list3;
                                    if (i27 <= 0) {
                                    }
                                    size3 = sk3Var.size();
                                    ory oryVar72 = oryVar;
                                    int i692 = i58;
                                    i12 = 0;
                                    while (i12 < size3) {
                                    }
                                    oryVar2 = oryVar72;
                                    i13 = i692;
                                    if (z6) {
                                    }
                                    if (!z6) {
                                    }
                                    List list112 = sk3Var;
                                    if (!list2.isEmpty()) {
                                    }
                                    if (!z6) {
                                    }
                                    if (i4 >= Math.min(i71, i50)) {
                                    }
                                    if (z2) {
                                        xzw.c("non-zero firstLineScrollOffset");
                                    }
                                    size4 = list112.size();
                                    int i722 = g;
                                    int i732 = f8;
                                    int i742 = 0;
                                    while (i14 < size4) {
                                    }
                                    final ArrayList arrayList22 = new ArrayList(i742);
                                    if (z2) {
                                    }
                                    float f92 = f;
                                    int i892 = i15;
                                    int i902 = i4;
                                    btyVar.d((int) f92, i892, i16, arrayList22, yqyVar.a(), gryVar72, z6, z1, length, z4, i13, i902, yvjVar, kduVar);
                                    int i912 = i892;
                                    if (z1) {
                                    }
                                    int i952 = i912;
                                    int i962 = i16;
                                    int i972 = i10;
                                    int i982 = i9;
                                    final List d2 = wwf0.d(this.j, i972, i982, arrayList22, yqyVar.c(), i27, i24, i952, i962, new qd1(17, hryVar, gryVar72));
                                    if (i982 == i17 + (-1)) {
                                    }
                                    dp10 Q2 = ztm0Var3.Q(s6j.g(i952 + i21, j), s6j.f(i962 + r04, j), jgpVar, new izs() { // from class: xsna.lry
                                        @Override // xsna.izs
                                        public final Object invoke(Object obj) {
                                            boolean z10;
                                            tra0.a aVar = (tra0.a) obj;
                                            aVar.b = true;
                                            ArrayList arrayList3 = arrayList22;
                                            int size13 = arrayList3.size();
                                            int i99 = 0;
                                            while (true) {
                                                z10 = z1;
                                                if (i99 >= size13) {
                                                    break;
                                                }
                                                ((nry) arrayList3.get(i99)).q(aVar, z10);
                                                i99++;
                                            }
                                            List list12 = d2;
                                            int size14 = list12.size();
                                            for (int i100 = 0; i100 < size14; i100++) {
                                                ((nry) list12.get(i100)).q(aVar, z10);
                                            }
                                            s3q0 s3q0Var4 = s3q0.a;
                                            aVar.b = false;
                                            wh50.this.getValue();
                                            return s3q0.a;
                                        }
                                    });
                                    ztm0Var = ztm0Var3;
                                    mryVar = new mry(oryVar3, i13, z9, f92, Q2, f7, z, yvjVar, qtyVar, length, cq3Var, ighVar, vua0.H(i972, i982, arrayList22, d2), i38, i3, i17, !z3 ? Orientation.Vertical : Orientation.Horizontal, i24, r05);
                                }
                            }
                            i9 = i7;
                            i10 = i57;
                            f = f4;
                            list2 = null;
                            if (list2 == null) {
                            }
                            size2 = list6.size();
                            i11 = 0;
                            list3 = null;
                            while (i11 < size2) {
                            }
                            gry gryVar722 = gryVar6;
                            if (list3 == null) {
                            }
                            List list1022 = list3;
                            if (i27 <= 0) {
                            }
                            size3 = sk3Var.size();
                            ory oryVar722 = oryVar;
                            int i6922 = i58;
                            i12 = 0;
                            while (i12 < size3) {
                            }
                            oryVar2 = oryVar722;
                            i13 = i6922;
                            if (z6) {
                            }
                            if (!z6) {
                            }
                            List list1122 = sk3Var;
                            if (!list2.isEmpty()) {
                            }
                            if (!z6) {
                            }
                            if (i4 >= Math.min(i71, i50)) {
                            }
                            if (z2) {
                            }
                            size4 = list1122.size();
                            int i7222 = g;
                            int i7322 = f8;
                            int i7422 = 0;
                            while (i14 < size4) {
                            }
                            final ArrayList arrayList222 = new ArrayList(i7422);
                            if (z2) {
                            }
                            float f922 = f;
                            int i8922 = i15;
                            int i9022 = i4;
                            btyVar.d((int) f922, i8922, i16, arrayList222, yqyVar.a(), gryVar722, z6, z1, length, z4, i13, i9022, yvjVar, kduVar);
                            int i9122 = i8922;
                            if (z1) {
                            }
                            int i9522 = i9122;
                            int i9622 = i16;
                            int i9722 = i10;
                            int i9822 = i9;
                            final List d22 = wwf0.d(this.j, i9722, i9822, arrayList222, yqyVar.c(), i27, i24, i9522, i9622, new qd1(17, hryVar, gryVar722));
                            if (i9822 == i17 + (-1)) {
                            }
                            dp10 Q22 = ztm0Var3.Q(s6j.g(i9522 + i21, j), s6j.f(i9622 + r04, j), jgpVar, new izs() { // from class: xsna.lry
                                @Override // xsna.izs
                                public final Object invoke(Object obj) {
                                    boolean z10;
                                    tra0.a aVar = (tra0.a) obj;
                                    aVar.b = true;
                                    ArrayList arrayList3 = arrayList222;
                                    int size13 = arrayList3.size();
                                    int i99 = 0;
                                    while (true) {
                                        z10 = z1;
                                        if (i99 >= size13) {
                                            break;
                                        }
                                        ((nry) arrayList3.get(i99)).q(aVar, z10);
                                        i99++;
                                    }
                                    List list12 = d22;
                                    int size14 = list12.size();
                                    for (int i100 = 0; i100 < size14; i100++) {
                                        ((nry) list12.get(i100)).q(aVar, z10);
                                    }
                                    s3q0 s3q0Var4 = s3q0.a;
                                    aVar.b = false;
                                    wh50.this.getValue();
                                    return s3q0.a;
                                }
                            });
                            ztm0Var = ztm0Var3;
                            mryVar = new mry(oryVar3, i13, z9, f922, Q22, f7, z, yvjVar, qtyVar, length, cq3Var, ighVar, vua0.H(i9722, i9822, arrayList222, d22), i38, i3, i17, !z3 ? Orientation.Vertical : Orientation.Horizontal, i24, r05);
                        }
                    } else {
                        oryVar = oryVar4;
                    }
                    i7 = 0;
                    List<Integer> list62 = a4;
                    size = list62.size();
                    int i582 = i6;
                    i8 = 0;
                    list = null;
                    while (true) {
                        xryVar = hryVar.f;
                        if (i8 < size) {
                        }
                        i8++;
                        gryVar4 = gryVar2;
                        size = i59;
                    }
                    gry gryVar62 = gryVar4;
                    if (list == null) {
                    }
                    List list82 = list;
                    if (z1) {
                        list5 = mryVar2.m;
                        if (!list5.isEmpty()) {
                        }
                    }
                    i9 = i7;
                    i10 = i57;
                    f = f4;
                    list2 = null;
                    if (list2 == null) {
                    }
                    size2 = list62.size();
                    i11 = 0;
                    list3 = null;
                    while (i11 < size2) {
                    }
                    gry gryVar7222 = gryVar62;
                    if (list3 == null) {
                    }
                    List list10222 = list3;
                    if (i27 <= 0) {
                    }
                    size3 = sk3Var.size();
                    ory oryVar7222 = oryVar;
                    int i69222 = i582;
                    i12 = 0;
                    while (i12 < size3) {
                    }
                    oryVar2 = oryVar7222;
                    i13 = i69222;
                    if (z6) {
                    }
                    if (!z6) {
                    }
                    List list11222 = sk3Var;
                    if (!list2.isEmpty()) {
                    }
                    if (!z6) {
                    }
                    if (i4 >= Math.min(i71, i50)) {
                    }
                    if (z2) {
                    }
                    size4 = list11222.size();
                    int i72222 = g;
                    int i73222 = f8;
                    int i74222 = 0;
                    while (i14 < size4) {
                    }
                    final ArrayList arrayList2222 = new ArrayList(i74222);
                    if (z2) {
                    }
                    float f9222 = f;
                    int i89222 = i15;
                    int i90222 = i4;
                    btyVar.d((int) f9222, i89222, i16, arrayList2222, yqyVar.a(), gryVar7222, z6, z1, length, z4, i13, i90222, yvjVar, kduVar);
                    int i91222 = i89222;
                    if (z1) {
                    }
                    int i95222 = i91222;
                    int i96222 = i16;
                    int i97222 = i10;
                    int i98222 = i9;
                    final List d222 = wwf0.d(this.j, i97222, i98222, arrayList2222, yqyVar.c(), i27, i24, i95222, i96222, new qd1(17, hryVar, gryVar7222));
                    if (i98222 == i17 + (-1)) {
                    }
                    dp10 Q222 = ztm0Var3.Q(s6j.g(i95222 + i21, j), s6j.f(i96222 + r04, j), jgpVar, new izs() { // from class: xsna.lry
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            boolean z10;
                            tra0.a aVar = (tra0.a) obj;
                            aVar.b = true;
                            ArrayList arrayList3 = arrayList2222;
                            int size13 = arrayList3.size();
                            int i99 = 0;
                            while (true) {
                                z10 = z1;
                                if (i99 >= size13) {
                                    break;
                                }
                                ((nry) arrayList3.get(i99)).q(aVar, z10);
                                i99++;
                            }
                            List list12 = d222;
                            int size14 = list12.size();
                            for (int i100 = 0; i100 < size14; i100++) {
                                ((nry) list12.get(i100)).q(aVar, z10);
                            }
                            s3q0 s3q0Var4 = s3q0.a;
                            aVar.b = false;
                            wh50.this.getValue();
                            return s3q0.a;
                        }
                    });
                    ztm0Var = ztm0Var3;
                    mryVar = new mry(oryVar3, i13, z9, f9222, Q222, f7, z, yvjVar, qtyVar, length, cq3Var, ighVar, vua0.H(i97222, i98222, arrayList2222, d222), i38, i3, i17, !z3 ? Orientation.Vertical : Orientation.Horizontal, i24, r05);
                }
                dsy dsyVar3 = dsyVar;
                dsyVar3.f(mryVar, ztm0Var.z1(), false);
                khl khlVar = dsyVar3.a;
                return mryVar;
            }
            c = i26.c(f2);
            h = dsyVar2.h();
            s3q0 s3q0Var4 = s3q0.a;
            dak0.a.d(a3, b, e);
            List<Integer> a42 = usy.a(invoke, dsyVar2.q, dsyVar2.n);
            if (ztm0Var2.z1()) {
            }
            bty<nry> btyVar2 = dsyVar2.m;
            final boolean z12 = ztm0Var2.z1();
            mry mryVar22 = dsyVar2.c;
            final wh50 wh50Var2 = dsyVar2.r;
            if (i27 < 0) {
            }
            if (i24 < 0) {
            }
            jgp jgpVar2 = jgp.b;
            yqy yqyVar2 = gryVar3.d;
            int i282 = c;
            boolean z62 = this.b;
            yvj yvjVar2 = this.h;
            kdu kduVar2 = this.i;
            if (itemCount > 0) {
            }
            dsy dsyVar32 = dsyVar;
            dsyVar32.f(mryVar, ztm0Var.z1(), false);
            khl khlVar2 = dsyVar32.a;
            return mryVar;
        } catch (Throwable th) {
            dak0.a.d(a3, b, e);
            throw th;
        }
    }
}
