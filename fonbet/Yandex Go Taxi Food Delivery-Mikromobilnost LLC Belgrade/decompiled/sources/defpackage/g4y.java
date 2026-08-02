package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.b;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class g4y implements s5y {
    public final /* synthetic */ b a;
    public final /* synthetic */ j690 b;
    public final /* synthetic */ sls c;
    public final /* synthetic */ s1u d;
    public final /* synthetic */ k43 e;
    public final /* synthetic */ tse f;
    public final /* synthetic */ l0u g;
    public final /* synthetic */ r100 h;

    public g4y(b bVar, j690 j690Var, hgx hgxVar, s1u s1uVar, k43 k43Var, h43 h43Var, tse tseVar, l0u l0uVar, r100 r100Var) {
        this.a = bVar;
        this.b = j690Var;
        this.c = hgxVar;
        this.d = s1uVar;
        this.e = k43Var;
        this.f = tseVar;
        this.g = l0uVar;
        this.h = r100Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x045f A[EDGE_INSN: B:139:0x045f->B:140:0x045f BREAK  A[LOOP:4: B:125:0x0415->B:135:0x0458], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x062d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0641 A[LOOP:12: B:221:0x063f->B:222:0x0641, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x026e  */
    @Override // defpackage.s5y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final aa10 a(t5y t5yVar, long j) {
        zjn zjnVar;
        zjn zjnVar2;
        int i;
        long j2;
        ptw ptwVar;
        tls tlsVar;
        int i2;
        int j3;
        int intValue;
        tyu0 tyu0Var;
        b bVar;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int size;
        int i8;
        s1n s1nVar;
        float f;
        int i9;
        b4y b4yVar;
        List list;
        int size2;
        int i10;
        int size3;
        int i11;
        int i12;
        k4y k4yVar;
        boolean z2;
        int size4;
        int i13;
        e4y e4yVar;
        float f2;
        int i14;
        i4y i4yVar;
        int i15;
        List list2;
        List list3;
        a4y a4yVar;
        int i16;
        j4y j4yVar;
        tyu0 tyu0Var2 = t5yVar.b;
        b bVar2 = this.a;
        oz40 oz40Var = bVar2.s;
        l4y l4yVar = bVar2.d;
        oz40Var.getValue();
        boolean z3 = bVar2.b || tyu0Var2.d0();
        Orientation orientation = Orientation.Vertical;
        alb1.a(j, orientation);
        LayoutDirection layoutDirection = tyu0Var2.getLayoutDirection();
        j690 j690Var = this.b;
        int f0 = tyu0Var2.f0(j690Var.b(layoutDirection));
        int f02 = tyu0Var2.f0(j690Var.c(tyu0Var2.getLayoutDirection()));
        int f03 = tyu0Var2.f0(j690Var.d());
        int f04 = tyu0Var2.f0(j690Var.a()) + f03;
        int i17 = f02 + f0;
        int i18 = f04 - f03;
        long i19 = p8e.i(-i17, -f04, j);
        b4y b4yVar2 = (b4y) this.c.invoke();
        s1n s1nVar2 = b4yVar2.b.a;
        s1u s1uVar = this.d;
        if (s1uVar.d != null && n8e.c(s1uVar.b, i19) && s1uVar.c == tyu0Var2.getDensity()) {
            zjnVar = s1uVar.d;
        } else {
            s1uVar.b = i19;
            s1uVar.c = tyu0Var2.getDensity();
            zjn zjnVar3 = (zjn) s1uVar.a.invoke(t5yVar, new n8e(i19));
            s1uVar.d = zjnVar3;
            zjnVar = zjnVar3;
        }
        int length = zjnVar.a.length;
        if (length != s1nVar2.a) {
            s1nVar2.a = length;
            ArrayList arrayList = (ArrayList) s1nVar2.c;
            arrayList.clear();
            zjnVar2 = zjnVar;
            i = length;
            j2 = i19;
            arrayList.add(new o501(0, 0, 29));
            ((ArrayList) s1nVar2.w).clear();
        } else {
            zjnVar2 = zjnVar;
            i = length;
            j2 = i19;
        }
        k43 k43Var = this.e;
        int f05 = tyu0Var2.f0(k43Var.b());
        int itemCount = b4yVar2.getItemCount();
        int h = n8e.h(j) - f04;
        long j4 = j2;
        e4y e4yVar2 = new e4y(b4yVar2, t5yVar, f05, this.a, f03, i18, (f03 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (f0 << 32));
        f4y f4yVar = new f4y(zjnVar2, itemCount, f05, e4yVar2, s1nVar2);
        int i20 = itemCount;
        mgu mguVar = new mgu(22, s1nVar2, f4yVar);
        ptw ptwVar2 = new ptw(5, s1nVar2);
        i2t0 D = tje.D();
        List list4 = null;
        if (D != null) {
            ptwVar = ptwVar2;
            tlsVar = D.e();
        } else {
            ptwVar = ptwVar2;
            tlsVar = null;
        }
        i2t0 O = tje.O(D);
        try {
            int intValue2 = l4yVar.a.getIntValue();
            f4y f4yVar2 = f4yVar;
            int b = idb1.b(intValue2, b4yVar2, l4yVar.d);
            if (intValue2 != b) {
                i2 = f03;
                l4yVar.a.setIntValue(b);
                l4yVar.e.a(intValue2);
            } else {
                i2 = f03;
            }
            if (b >= i20 && i20 > 0) {
                j3 = s1nVar2.j(i20 - 1);
                intValue = 0;
                tje.W(D, O, tlsVar);
                List b2 = edb1.b(b4yVar2, bVar2.q, bVar2.n);
                float floatValue = (tyu0Var2.d0() && z3) ? ((Number) bVar2.v.b.b.getValue()).floatValue() : bVar2.g;
                c cVar = bVar2.m;
                boolean d0 = tyu0Var2.d0();
                i4y i4yVar2 = bVar2.c;
                oz40 oz40Var2 = bVar2.r;
                if (i2 < 0) {
                    lxv.a("negative beforeContentPadding");
                }
                if (i18 < 0) {
                    lxv.a("negative afterContentPadding");
                }
                b4y b4yVar3 = e4yVar2.b;
                tse tseVar = this.f;
                int i21 = j3;
                l0u l0uVar = this.g;
                float f3 = floatValue;
                EmptyList emptyList = EmptyList.a;
                if (i20 > 0) {
                    int k = n8e.k(j4);
                    int j5 = n8e.j(j4);
                    cVar.d(0, k, j5, new ArrayList(), b4yVar3.c, e4yVar2, true, d0, i, z3, 0, 0, tseVar, l0uVar);
                    if (!d0) {
                        long b3 = cVar.b();
                        if (!k6w.a(b3, 0L)) {
                            k = p8e.g((int) (b3 >> 32), j4);
                            j5 = p8e.f((int) (b3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), j4);
                        }
                    }
                    tyu0Var = tyu0Var2;
                    bVar = bVar2;
                    i4yVar = new i4y(null, 0, false, 0.0f, tyu0Var2.w(p8e.g(k + i17, j), p8e.f(j5 + f04, j), kotlin.collections.b.f(), new p0u(5)), 0.0f, false, tseVar, t5yVar, i, mguVar, ptwVar, emptyList, -i2, h + i18, 0, orientation, i18, f05);
                } else {
                    e4y e4yVar3 = e4yVar2;
                    tyu0Var = tyu0Var2;
                    int i22 = f05;
                    int i23 = i18;
                    ptw ptwVar3 = ptwVar;
                    int i24 = i2;
                    bVar = bVar2;
                    int round = Math.round(f3);
                    int i25 = intValue - round;
                    if (i21 == 0 && i25 < 0) {
                        round += i25;
                        i25 = 0;
                    }
                    x43 x43Var = new x43();
                    int i26 = -i24;
                    int i27 = i26 + (i22 < 0 ? i22 : 0);
                    int i28 = i25 + i27;
                    while (i28 < 0 && i21 > 0) {
                        int i29 = i22;
                        int i30 = i21 - 1;
                        EmptyList emptyList2 = emptyList;
                        f4y f4yVar3 = f4yVar2;
                        int i31 = i23;
                        k4y b4 = f4yVar3.b(i30);
                        i21 = i30;
                        x43Var.add(0, b4);
                        i28 += b4.g;
                        i23 = i31;
                        i22 = i29;
                        f4yVar2 = f4yVar3;
                        emptyList = emptyList2;
                    }
                    int i32 = i22;
                    EmptyList emptyList3 = emptyList;
                    f4y f4yVar4 = f4yVar2;
                    int i33 = i23;
                    if (i28 < i27) {
                        round -= i27 - i28;
                        i28 = i27;
                    }
                    int i34 = round;
                    int i35 = i28 - i27;
                    int i36 = h + i33;
                    int i37 = i36 >= 0 ? i36 : 0;
                    int i38 = i35;
                    int i39 = -i35;
                    int i40 = i21;
                    int i41 = 0;
                    boolean z4 = false;
                    while (i41 < x43Var.size()) {
                        if (i39 >= i37) {
                            x43Var.remove(i41);
                            z4 = true;
                        } else {
                            i40++;
                            i39 += ((k4y) x43Var.get(i41)).g;
                            i41++;
                        }
                    }
                    int i42 = i40;
                    boolean z5 = z4;
                    while (i42 < i20 && (i39 < i37 || i39 <= 0 || x43Var.isEmpty())) {
                        z = z5;
                        k4y b5 = f4yVar4.b(i42);
                        int i43 = i42;
                        int i44 = b5.g;
                        j4y[] j4yVarArr = b5.b;
                        int i45 = i37;
                        if (j4yVarArr.length == 0) {
                            break;
                        }
                        i39 += i44;
                        if (i39 > i27 || ((j4y) j73.O(j4yVarArr)).a == i20 - 1) {
                            x43Var.addLast(b5);
                            z5 = z;
                        } else {
                            i38 -= i44;
                            i21 = i43 + 1;
                            z5 = true;
                        }
                        i42 = i43 + 1;
                        i37 = i45;
                    }
                    z = z5;
                    if (i39 < h) {
                        int i46 = h - i39;
                        int i47 = i39 + i46;
                        i5 = i38 - i46;
                        while (i5 < i24 && i21 > 0) {
                            int i48 = i21 - 1;
                            int i49 = i47;
                            k4y b6 = f4yVar4.b(i48);
                            x43Var.add(0, b6);
                            i5 += b6.g;
                            i47 = i49;
                            i24 = i24;
                            i21 = i48;
                        }
                        int i50 = i47;
                        i3 = i24;
                        i4 = i46 + i34;
                        if (i5 < 0) {
                            i4 += i5;
                            i39 = i50 + i5;
                            i5 = 0;
                        } else {
                            i39 = i50;
                        }
                    } else {
                        i3 = i24;
                        i4 = i34;
                        i5 = i38;
                    }
                    float f4 = (Integer.signum(Math.round(f3)) != Integer.signum(i4) || Math.abs(Math.round(f3)) < Math.abs(i4)) ? f3 : i4;
                    float f5 = f3 - f4;
                    float f6 = 0.0f;
                    if (d0 && i4 > i34 && f5 <= 0.0f) {
                        f6 = (i4 - i34) + f5;
                    }
                    float f7 = f6;
                    if (i5 < 0) {
                        lxv.a("negative initial offset");
                    }
                    int i51 = -i5;
                    k4y k4yVar2 = (k4y) x43Var.f();
                    int i52 = (k4yVar2 == null || (j4yVar = (j4y) j73.D(k4yVar2.b)) == null) ? 0 : j4yVar.a;
                    int i53 = i5;
                    k4y k4yVar3 = (k4y) x43Var.h();
                    if (k4yVar3 != null) {
                        j4y[] j4yVarArr2 = k4yVar3.b;
                        i6 = i51;
                        j4y j4yVar2 = j4yVarArr2.length == 0 ? null : j4yVarArr2[j4yVarArr2.length - 1];
                        if (j4yVar2 != null) {
                            i7 = j4yVar2.a;
                            List list5 = b2;
                            size = list5.size();
                            ArrayList arrayList2 = null;
                            i8 = 0;
                            while (true) {
                                s1nVar = f4yVar4.e;
                                if (i8 < size) {
                                    break;
                                }
                                int i54 = size;
                                int intValue3 = ((Number) b2.get(i8)).intValue();
                                if (intValue3 < 0 || intValue3 >= i52) {
                                    i16 = i52;
                                } else {
                                    i16 = i52;
                                    int i55 = s1nVar.a;
                                    int q = s1nVar.q(intValue3);
                                    j4y c = e4yVar3.c(intValue3, 0, q, e4yVar3.d, f4yVar4.a(0, q));
                                    ArrayList arrayList3 = arrayList2 == null ? new ArrayList() : arrayList2;
                                    arrayList3.add(c);
                                    arrayList2 = arrayList3;
                                }
                                i8++;
                                size = i54;
                                i52 = i16;
                            }
                            int i56 = i52;
                            List list6 = arrayList2 != null ? emptyList3 : arrayList2;
                            int i57 = -1;
                            if (d0 && i4yVar2 != null) {
                                list3 = i4yVar2.m;
                                if (!list3.isEmpty()) {
                                    int size5 = list3.size() - 1;
                                    while (i57 < size5) {
                                        int i58 = i57;
                                        if (((j4y) ((a4y) list3.get(size5))).a > i7 && (size5 == 0 || ((j4y) ((a4y) list3.get(size5 - 1))).a <= i7)) {
                                            a4yVar = (a4y) list3.get(size5);
                                            break;
                                        }
                                        size5--;
                                        i57 = i58;
                                    }
                                    a4yVar = null;
                                    a4y a4yVar2 = (a4y) a.Z(list3);
                                    k4y k4yVar4 = (k4y) a.b0(x43Var);
                                    int i59 = k4yVar4 != null ? k4yVar4.a + 1 : 0;
                                    if (a4yVar != null) {
                                        int i60 = ((j4y) a4yVar).a;
                                        i9 = i7;
                                        int min = Math.min(((j4y) a4yVar2).a, i20 - 1);
                                        if (i60 <= min) {
                                            list = null;
                                            while (true) {
                                                if (list != null) {
                                                    b4yVar = b4yVar3;
                                                    int size6 = list.size();
                                                    f = f4;
                                                    int i61 = 0;
                                                    while (i61 < size6) {
                                                        int i62 = i61;
                                                        j4y[] j4yVarArr3 = ((k4y) list.get(i61)).b;
                                                        List list7 = list;
                                                        int length2 = j4yVarArr3.length;
                                                        int i63 = 0;
                                                        while (i63 < length2) {
                                                            int i64 = i63;
                                                            if (j4yVarArr3[i64].a == i60) {
                                                                list = list7;
                                                                break;
                                                            }
                                                            i63 = i64 + 1;
                                                        }
                                                        i61 = i62 + 1;
                                                        list = list7;
                                                    }
                                                } else {
                                                    f = f4;
                                                    b4yVar = b4yVar3;
                                                }
                                                List list8 = list;
                                                list = list8 == null ? new ArrayList() : list8;
                                                k4y b7 = f4yVar4.b(i59);
                                                i59++;
                                                list.add(b7);
                                                if (i60 == min) {
                                                    break;
                                                }
                                                i60++;
                                                b4yVar3 = b4yVar;
                                                f4 = f;
                                            }
                                            if (list == null) {
                                                list = emptyList3;
                                            }
                                            size2 = list5.size();
                                            i10 = 0;
                                            while (i10 < size2) {
                                                int intValue4 = ((Number) b2.get(i10)).intValue();
                                                if (i9 + 1 > intValue4 || intValue4 >= i20) {
                                                    i15 = i20;
                                                    list2 = b2;
                                                } else {
                                                    if (d0) {
                                                        int size7 = list.size();
                                                        int i65 = 0;
                                                        while (i65 < size7) {
                                                            i15 = i20;
                                                            j4y[] j4yVarArr4 = ((k4y) list.get(i65)).b;
                                                            list2 = b2;
                                                            int length3 = j4yVarArr4.length;
                                                            int i66 = 0;
                                                            while (i66 < length3) {
                                                                int i67 = i66;
                                                                if (j4yVarArr4[i67].a == intValue4) {
                                                                    break;
                                                                }
                                                                i66 = i67 + 1;
                                                            }
                                                            i65++;
                                                            b2 = list2;
                                                            i20 = i15;
                                                        }
                                                    }
                                                    i15 = i20;
                                                    list2 = b2;
                                                    int i68 = s1nVar.a;
                                                    int q2 = s1nVar.q(intValue4);
                                                    j4y c2 = e4yVar3.c(intValue4, 0, q2, e4yVar3.d, f4yVar4.a(0, q2));
                                                    if (list4 == null) {
                                                        list4 = new ArrayList();
                                                    }
                                                    List list9 = list4;
                                                    list9.add(c2);
                                                    list4 = list9;
                                                }
                                                i10++;
                                                b2 = list2;
                                                i20 = i15;
                                            }
                                            int i69 = i20;
                                            List list10 = list4 != null ? emptyList3 : list4;
                                            if (i3 <= 0 || i32 < 0) {
                                                size3 = x43Var.size();
                                                int i70 = i53;
                                                k4y k4yVar5 = k4yVar2;
                                                i11 = 0;
                                                while (i11 < size3) {
                                                    int i71 = ((k4y) x43Var.get(i11)).g;
                                                    if (i70 == 0 || i71 > i70 || i11 == scc.f(x43Var)) {
                                                        break;
                                                    }
                                                    i70 -= i71;
                                                    i11++;
                                                    k4yVar5 = (k4y) x43Var.get(i11);
                                                }
                                                i12 = i70;
                                                k4yVar = k4yVar5;
                                            } else {
                                                i12 = i53;
                                                k4yVar = k4yVar2;
                                            }
                                            int i72 = n8e.i(j4);
                                            int f8 = p8e.f(i39, j4);
                                            List list11 = x43Var;
                                            if (!list.isEmpty()) {
                                                list11 = a.m0(list, x43Var);
                                            }
                                            z2 = i39 >= Math.min(f8, h);
                                            if (z2 && i6 != 0) {
                                                lxv.c("non-zero firstLineScrollOffset");
                                            }
                                            size4 = list11.size();
                                            k4y k4yVar6 = k4yVar;
                                            int i73 = i12;
                                            int i74 = 0;
                                            for (i13 = 0; i13 < size4; i13++) {
                                                i74 += ((k4y) list11.get(i13)).b.length;
                                            }
                                            ArrayList arrayList4 = new ArrayList(i74);
                                            if (z2) {
                                                int size8 = list6.size() - 1;
                                                if (size8 >= 0) {
                                                    int i75 = i6;
                                                    while (true) {
                                                        int i76 = size8 - 1;
                                                        j4y j4yVar3 = (j4y) list6.get(size8);
                                                        e4yVar = e4yVar3;
                                                        i75 -= j4yVar3.o;
                                                        j4yVar3.c(i75, 0, i72, f8);
                                                        arrayList4.add(j4yVar3);
                                                        if (i76 < 0) {
                                                            break;
                                                        }
                                                        size8 = i76;
                                                        e4yVar3 = e4yVar;
                                                    }
                                                } else {
                                                    e4yVar = e4yVar3;
                                                }
                                                int size9 = list11.size();
                                                int i77 = i6;
                                                int i78 = 0;
                                                while (i78 < size9) {
                                                    k4y k4yVar7 = (k4y) list11.get(i78);
                                                    j4y[] a = k4yVar7.a(i77, i72, f8);
                                                    int i79 = size9;
                                                    int i80 = i78;
                                                    int i81 = 0;
                                                    for (int length4 = a.length; i81 < length4; length4 = length4) {
                                                        arrayList4.add(a[i81]);
                                                        i81++;
                                                    }
                                                    i77 += k4yVar7.g;
                                                    i78 = i80 + 1;
                                                    size9 = i79;
                                                }
                                                int size10 = list10.size();
                                                for (int i82 = 0; i82 < size10; i82++) {
                                                    j4y j4yVar4 = (j4y) list10.get(i82);
                                                    j4yVar4.c(i77, 0, i72, f8);
                                                    arrayList4.add(j4yVar4);
                                                    i77 += j4yVar4.o;
                                                }
                                                f2 = f;
                                            } else {
                                                if (!list6.isEmpty() || !list10.isEmpty()) {
                                                    lxv.a("no items");
                                                }
                                                int size11 = list11.size();
                                                int[] iArr = new int[size11];
                                                for (int i83 = 0; i83 < size11; i83++) {
                                                    iArr[i83] = ((k4y) list11.get(i83)).f;
                                                }
                                                int[] iArr2 = new int[size11];
                                                k43Var.m(t5yVar, f8, iArr, iArr2);
                                                d6w E = j73.E(iArr2);
                                                int i84 = E.a;
                                                int i85 = E.b;
                                                int i86 = E.c;
                                                if ((i86 > 0 && i84 <= i85) || (i86 < 0 && i85 <= i84)) {
                                                    while (true) {
                                                        int[] iArr3 = iArr2;
                                                        j4y[] a2 = ((k4y) list11.get(i84)).a(iArr2[i84], i72, f8);
                                                        int length5 = a2.length;
                                                        int i87 = 0;
                                                        while (i87 < length5) {
                                                            int i88 = i87;
                                                            arrayList4.add(a2[i88]);
                                                            i87 = i88 + 1;
                                                        }
                                                        if (i84 == i85) {
                                                            break;
                                                        }
                                                        i84 += i86;
                                                        iArr2 = iArr3;
                                                    }
                                                }
                                                e4yVar = e4yVar3;
                                                f2 = f;
                                            }
                                            b4y b4yVar4 = b4yVar;
                                            cVar.d((int) f2, i72, f8, arrayList4, b4yVar4.c, e4yVar, true, d0, i, z3, i73, i39, tseVar, l0uVar);
                                            e4y e4yVar4 = e4yVar;
                                            if (!d0) {
                                                long b8 = cVar.b();
                                                if (!k6w.a(b8, 0L)) {
                                                    i72 = p8e.g(Math.max(i72, (int) (b8 >> 32)), j4);
                                                    int f9 = p8e.f(Math.max(f8, (int) (b8 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), j4);
                                                    if (f9 != f8) {
                                                        int size12 = arrayList4.size();
                                                        for (int i89 = 0; i89 < size12; i89++) {
                                                            j4y j4yVar5 = (j4y) arrayList4.get(i89);
                                                            j4yVar5.p = f9;
                                                            j4yVar5.r = j4yVar5.f + f9;
                                                        }
                                                    }
                                                    i14 = f9;
                                                    int i90 = i72;
                                                    b4yVar4.b.getClass();
                                                    int i91 = i9;
                                                    List e = mdb1.e(this.h, i56, i91, arrayList4, v5w.a, i3, i90, i14, new mgu(23, f4yVar4, e4yVar4));
                                                    i4yVar = new i4y(k4yVar6, i73, i91 == i69 + (-1) || i39 > h, f2, tyu0Var.w(p8e.g(i90 + i17, j), p8e.f(i14 + f04, j), kotlin.collections.b.f(), new h4y(oz40Var2, arrayList4, e, d0, 0)), f7, z, tseVar, t5yVar, i, mguVar, ptwVar3, wj91.d(i56, i91, arrayList4, e), i26, i36, i69, Orientation.Vertical, i33, i32);
                                                }
                                            }
                                            i14 = f8;
                                            int i902 = i72;
                                            b4yVar4.b.getClass();
                                            int i912 = i9;
                                            List e2 = mdb1.e(this.h, i56, i912, arrayList4, v5w.a, i3, i902, i14, new mgu(23, f4yVar4, e4yVar4));
                                            i4yVar = new i4y(k4yVar6, i73, i912 == i69 + (-1) || i39 > h, f2, tyu0Var.w(p8e.g(i902 + i17, j), p8e.f(i14 + f04, j), kotlin.collections.b.f(), new h4y(oz40Var2, arrayList4, e2, d0, 0)), f7, z, tseVar, t5yVar, i, mguVar, ptwVar3, wj91.d(i56, i912, arrayList4, e2), i26, i36, i69, Orientation.Vertical, i33, i32);
                                        } else {
                                            f = f4;
                                        }
                                    } else {
                                        f = f4;
                                        i9 = i7;
                                    }
                                    b4yVar = b4yVar3;
                                    list = null;
                                    if (list == null) {
                                    }
                                    size2 = list5.size();
                                    i10 = 0;
                                    while (i10 < size2) {
                                    }
                                    int i692 = i20;
                                    if (list4 != null) {
                                    }
                                    if (i3 <= 0) {
                                    }
                                    size3 = x43Var.size();
                                    int i702 = i53;
                                    k4y k4yVar52 = k4yVar2;
                                    i11 = 0;
                                    while (i11 < size3) {
                                    }
                                    i12 = i702;
                                    k4yVar = k4yVar52;
                                    int i722 = n8e.i(j4);
                                    int f82 = p8e.f(i39, j4);
                                    List list112 = x43Var;
                                    if (!list.isEmpty()) {
                                    }
                                    if (i39 >= Math.min(f82, h)) {
                                    }
                                    if (z2) {
                                        lxv.c("non-zero firstLineScrollOffset");
                                    }
                                    size4 = list112.size();
                                    k4y k4yVar62 = k4yVar;
                                    int i732 = i12;
                                    int i742 = 0;
                                    while (i13 < size4) {
                                    }
                                    ArrayList arrayList42 = new ArrayList(i742);
                                    if (z2) {
                                    }
                                    b4y b4yVar42 = b4yVar;
                                    cVar.d((int) f2, i722, f82, arrayList42, b4yVar42.c, e4yVar, true, d0, i, z3, i732, i39, tseVar, l0uVar);
                                    e4y e4yVar42 = e4yVar;
                                    if (!d0) {
                                    }
                                    i14 = f82;
                                    int i9022 = i722;
                                    b4yVar42.b.getClass();
                                    int i9122 = i9;
                                    List e22 = mdb1.e(this.h, i56, i9122, arrayList42, v5w.a, i3, i9022, i14, new mgu(23, f4yVar4, e4yVar42));
                                    i4yVar = new i4y(k4yVar62, i732, i9122 == i692 + (-1) || i39 > h, f2, tyu0Var.w(p8e.g(i9022 + i17, j), p8e.f(i14 + f04, j), kotlin.collections.b.f(), new h4y(oz40Var2, arrayList42, e22, d0, 0)), f7, z, tseVar, t5yVar, i, mguVar, ptwVar3, wj91.d(i56, i9122, arrayList42, e22), i26, i36, i692, Orientation.Vertical, i33, i32);
                                }
                            }
                            f = f4;
                            i9 = i7;
                            b4yVar = b4yVar3;
                            list = null;
                            if (list == null) {
                            }
                            size2 = list5.size();
                            i10 = 0;
                            while (i10 < size2) {
                            }
                            int i6922 = i20;
                            if (list4 != null) {
                            }
                            if (i3 <= 0) {
                            }
                            size3 = x43Var.size();
                            int i7022 = i53;
                            k4y k4yVar522 = k4yVar2;
                            i11 = 0;
                            while (i11 < size3) {
                            }
                            i12 = i7022;
                            k4yVar = k4yVar522;
                            int i7222 = n8e.i(j4);
                            int f822 = p8e.f(i39, j4);
                            List list1122 = x43Var;
                            if (!list.isEmpty()) {
                            }
                            if (i39 >= Math.min(f822, h)) {
                            }
                            if (z2) {
                            }
                            size4 = list1122.size();
                            k4y k4yVar622 = k4yVar;
                            int i7322 = i12;
                            int i7422 = 0;
                            while (i13 < size4) {
                            }
                            ArrayList arrayList422 = new ArrayList(i7422);
                            if (z2) {
                            }
                            b4y b4yVar422 = b4yVar;
                            cVar.d((int) f2, i7222, f822, arrayList422, b4yVar422.c, e4yVar, true, d0, i, z3, i7322, i39, tseVar, l0uVar);
                            e4y e4yVar422 = e4yVar;
                            if (!d0) {
                            }
                            i14 = f822;
                            int i90222 = i7222;
                            b4yVar422.b.getClass();
                            int i91222 = i9;
                            List e222 = mdb1.e(this.h, i56, i91222, arrayList422, v5w.a, i3, i90222, i14, new mgu(23, f4yVar4, e4yVar422));
                            i4yVar = new i4y(k4yVar622, i7322, i91222 == i6922 + (-1) || i39 > h, f2, tyu0Var.w(p8e.g(i90222 + i17, j), p8e.f(i14 + f04, j), kotlin.collections.b.f(), new h4y(oz40Var2, arrayList422, e222, d0, 0)), f7, z, tseVar, t5yVar, i, mguVar, ptwVar3, wj91.d(i56, i91222, arrayList422, e222), i26, i36, i6922, Orientation.Vertical, i33, i32);
                        }
                    } else {
                        i6 = i51;
                    }
                    i7 = 0;
                    List list52 = b2;
                    size = list52.size();
                    ArrayList arrayList22 = null;
                    i8 = 0;
                    while (true) {
                        s1nVar = f4yVar4.e;
                        if (i8 < size) {
                        }
                        i8++;
                        size = i54;
                        i52 = i16;
                    }
                    int i562 = i52;
                    if (arrayList22 != null) {
                    }
                    int i572 = -1;
                    if (d0) {
                        list3 = i4yVar2.m;
                        if (!list3.isEmpty()) {
                        }
                    }
                    f = f4;
                    i9 = i7;
                    b4yVar = b4yVar3;
                    list = null;
                    if (list == null) {
                    }
                    size2 = list52.size();
                    i10 = 0;
                    while (i10 < size2) {
                    }
                    int i69222 = i20;
                    if (list4 != null) {
                    }
                    if (i3 <= 0) {
                    }
                    size3 = x43Var.size();
                    int i70222 = i53;
                    k4y k4yVar5222 = k4yVar2;
                    i11 = 0;
                    while (i11 < size3) {
                    }
                    i12 = i70222;
                    k4yVar = k4yVar5222;
                    int i72222 = n8e.i(j4);
                    int f8222 = p8e.f(i39, j4);
                    List list11222 = x43Var;
                    if (!list.isEmpty()) {
                    }
                    if (i39 >= Math.min(f8222, h)) {
                    }
                    if (z2) {
                    }
                    size4 = list11222.size();
                    k4y k4yVar6222 = k4yVar;
                    int i73222 = i12;
                    int i74222 = 0;
                    while (i13 < size4) {
                    }
                    ArrayList arrayList4222 = new ArrayList(i74222);
                    if (z2) {
                    }
                    b4y b4yVar4222 = b4yVar;
                    cVar.d((int) f2, i72222, f8222, arrayList4222, b4yVar4222.c, e4yVar, true, d0, i, z3, i73222, i39, tseVar, l0uVar);
                    e4y e4yVar4222 = e4yVar;
                    if (!d0) {
                    }
                    i14 = f8222;
                    int i902222 = i72222;
                    b4yVar4222.b.getClass();
                    int i912222 = i9;
                    List e2222 = mdb1.e(this.h, i562, i912222, arrayList4222, v5w.a, i3, i902222, i14, new mgu(23, f4yVar4, e4yVar4222));
                    i4yVar = new i4y(k4yVar6222, i73222, i912222 == i69222 + (-1) || i39 > h, f2, tyu0Var.w(p8e.g(i902222 + i17, j), p8e.f(i14 + f04, j), kotlin.collections.b.f(), new h4y(oz40Var2, arrayList4222, e2222, d0, 0)), f7, z, tseVar, t5yVar, i, mguVar, ptwVar3, wj91.d(i562, i912222, arrayList4222, e2222), i26, i36, i69222, Orientation.Vertical, i33, i32);
                }
                b bVar3 = bVar;
                bVar3.f(i4yVar, tyu0Var.d0(), false);
                tdh tdhVar = bVar3.a;
                return i4yVar;
            }
            j3 = s1nVar2.j(b);
            intValue = l4yVar.b.getIntValue();
            tje.W(D, O, tlsVar);
            List b22 = edb1.b(b4yVar2, bVar2.q, bVar2.n);
            if (tyu0Var2.d0()) {
            }
            c cVar2 = bVar2.m;
            boolean d02 = tyu0Var2.d0();
            i4y i4yVar22 = bVar2.c;
            oz40 oz40Var22 = bVar2.r;
            if (i2 < 0) {
            }
            if (i18 < 0) {
            }
            b4y b4yVar32 = e4yVar2.b;
            tse tseVar2 = this.f;
            int i212 = j3;
            l0u l0uVar2 = this.g;
            float f32 = floatValue;
            EmptyList emptyList4 = EmptyList.a;
            if (i20 > 0) {
            }
            b bVar32 = bVar;
            bVar32.f(i4yVar, tyu0Var.d0(), false);
            tdh tdhVar2 = bVar32.a;
            return i4yVar;
        } catch (Throwable th) {
            tje.W(D, O, tlsVar);
            throw th;
        }
    }
}
