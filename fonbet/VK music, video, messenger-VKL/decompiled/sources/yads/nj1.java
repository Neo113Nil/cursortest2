package yads;

import android.os.Looper;
import android.util.Pair;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class nj1 extends w83 {
    /* JADX WARN: Removed duplicated region for block: B:237:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0469 A[LOOP:22: B:282:0x0465->B:284:0x0469, LOOP_END] */
    @Override // yads.w83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x83 a(ro[] roVarArr, m83 m83Var, zn1 zn1Var, w73 w73Var) {
        af0 af0Var;
        int i;
        String str;
        char c;
        boolean z;
        pp0[] pp0VarArr;
        int i2;
        int i3;
        m83 m83Var2;
        int i4;
        char c2;
        boolean z2;
        tn2 tn2Var;
        boolean z3;
        int i5;
        np0 np0Var;
        int i6;
        int i7;
        m83 m83Var3;
        ye0 ye0Var;
        df0 df0Var;
        int[] iArr;
        m83 m83Var4 = m83Var;
        int i8 = 1;
        int[] iArr2 = new int[roVarArr.length + 1];
        int length = roVarArr.length + 1;
        l83[][] l83VarArr = new l83[length][];
        int[][][] iArr3 = new int[roVarArr.length + 1][][];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = m83Var4.b;
            l83VarArr[i9] = new l83[i10];
            iArr3[i9] = new int[i10][];
        }
        int length2 = roVarArr.length;
        int[] iArr4 = new int[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            iArr4[i11] = roVarArr[i11].l();
        }
        int i12 = 0;
        while (i12 < m83Var4.b) {
            l83 a = m83Var4.a(i12);
            int i13 = a.d == 5 ? i8 : 0;
            int length3 = roVarArr.length;
            int i14 = i8;
            int i15 = 0;
            int i16 = 0;
            while (i15 < roVarArr.length) {
                ro roVar = roVarArr[i15];
                int i17 = i8;
                int i18 = 0;
                for (int i19 = 0; i19 < a.b; i19++) {
                    i18 = Math.max(i18, roVar.a(a.e[i19]) & 7);
                }
                int i20 = iArr2[i15] == 0 ? i17 : 0;
                if (i18 > i16 || (i18 == i16 && i13 != 0 && i14 == 0 && i20 != 0)) {
                    i14 = i20;
                    i16 = i18;
                    length3 = i15;
                }
                i15++;
                i8 = i17;
            }
            int i21 = i8;
            if (length3 == roVarArr.length) {
                iArr = new int[a.b];
            } else {
                ro roVar2 = roVarArr[length3];
                int[] iArr5 = new int[a.b];
                for (int i22 = 0; i22 < a.b; i22++) {
                    iArr5[i22] = roVar2.a(a.e[i22]);
                }
                iArr = iArr5;
            }
            int i23 = iArr2[length3];
            l83VarArr[length3][i23] = a;
            iArr3[length3][i23] = iArr;
            iArr2[length3] = i23 + 1;
            i12++;
            m83Var4 = m83Var;
            i8 = i21;
        }
        int i24 = i8;
        int i25 = 0;
        m83[] m83VarArr = new m83[roVarArr.length];
        String[] strArr = new String[roVarArr.length];
        int[] iArr6 = new int[roVarArr.length];
        for (int i26 = 0; i26 < roVarArr.length; i26++) {
            int i27 = iArr2[i26];
            m83VarArr[i26] = new m83((l83[]) mc3.a(i27, l83VarArr[i26]));
            iArr3[i26] = (int[][]) mc3.a(i27, iArr3[i26]);
            strArr[i26] = roVarArr[i26].d();
            iArr6[i26] = roVarArr[i26].b;
        }
        mj1 mj1Var = new mj1(iArr6, m83VarArr, iArr4, iArr3, new m83((l83[]) mc3.a(iArr2[roVarArr.length], l83VarArr[roVarArr.length])));
        if0 if0Var = (if0) this;
        synchronized (if0Var.c) {
            try {
                af0Var = if0Var.f;
                i = 32;
                if (af0Var.L && mc3.a >= 32 && (df0Var = if0Var.g) != null) {
                    Looper myLooper = Looper.myLooper();
                    if (myLooper == null) {
                        throw new IllegalStateException();
                    }
                    df0Var.a(if0Var, myLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i28 = mj1Var.a;
        np0[] np0VarArr = new np0[i28];
        Pair a2 = if0.a(mj1Var, iArr3, iArr4, af0Var);
        if (a2 != null) {
            np0VarArr[((Integer) a2.second).intValue()] = (np0) a2.first;
        }
        Pair a3 = if0Var.a(mj1Var, iArr3, af0Var);
        if (a3 != null) {
            np0VarArr[((Integer) a3.second).intValue()] = (np0) a3.first;
        }
        if (a3 == null) {
            str = null;
        } else {
            np0 np0Var2 = (np0) a3.first;
            str = np0Var2.a.e[np0Var2.b[0]].d;
        }
        Pair a4 = if0.a(mj1Var, iArr3, af0Var, str);
        if (a4 != null) {
            np0VarArr[((Integer) a4.second).intValue()] = (np0) a4.first;
        }
        int i29 = 0;
        while (i29 < i28) {
            int i30 = mj1Var.b[i29];
            if (i30 == 2 || i30 == i24 || i30 == 3) {
                i6 = i;
                i7 = i29;
            } else {
                m83 m83Var5 = mj1Var.c[i29];
                int[][] iArr7 = iArr3[i29];
                int i31 = i25;
                int i32 = i31;
                l83 l83Var = null;
                ye0 ye0Var2 = null;
                while (i31 < m83Var5.b) {
                    l83 a5 = m83Var5.a(i31);
                    int[] iArr8 = iArr7[i31];
                    int i33 = i;
                    ye0 ye0Var3 = ye0Var2;
                    l83 l83Var2 = l83Var;
                    int i34 = i32;
                    int i35 = i25;
                    while (i35 < a5.b) {
                        int i36 = i29;
                        if (if0.a(af0Var.M, iArr8[i35])) {
                            m83Var3 = m83Var5;
                            ye0 ye0Var4 = new ye0(iArr8[i35], a5.e[i35]);
                            if (ye0Var3 != null) {
                                ye0Var = ye0Var4;
                                if (fy.a(lq.a(ye0Var4.c, ye0Var3.c)).a(ye0Var4.b, ye0Var3.b).a() <= 0) {
                                }
                            } else {
                                ye0Var = ye0Var4;
                            }
                            i34 = i35;
                            l83Var2 = a5;
                            ye0Var3 = ye0Var;
                        } else {
                            m83Var3 = m83Var5;
                        }
                        i35++;
                        i29 = i36;
                        m83Var5 = m83Var3;
                    }
                    i31++;
                    i = i33;
                    i32 = i34;
                    l83Var = l83Var2;
                    ye0Var2 = ye0Var3;
                }
                i6 = i;
                i7 = i29;
                np0VarArr[i7] = l83Var == null ? null : new np0(i25, l83Var, new int[]{i32});
            }
            i29 = i7 + 1;
            i = i6;
            i25 = 0;
            i24 = 1;
        }
        int i37 = i;
        int i38 = mj1Var.a;
        HashMap hashMap = new HashMap();
        for (int i39 = 0; i39 < i38; i39++) {
            if0.a(mj1Var.c[i39], af0Var, hashMap);
        }
        if0.a(mj1Var.f, af0Var, hashMap);
        int i40 = 0;
        while (true) {
            c = 65535;
            if (i40 >= i38) {
                break;
            }
            s83 s83Var = (s83) hashMap.get(Integer.valueOf(mj1Var.b[i40]));
            if (s83Var != null) {
                if (!s83Var.c.isEmpty()) {
                    int indexOf = mj1Var.c[i40].c.indexOf(s83Var.b);
                    if (indexOf >= 0 && indexOf != -1) {
                        np0Var = new np0(0, s83Var.b, wd1.a(s83Var.c));
                        np0VarArr[i40] = np0Var;
                    }
                }
                np0Var = null;
                np0VarArr[i40] = np0Var;
            }
            i40++;
        }
        int i41 = mj1Var.a;
        for (int i42 = 0; i42 < i41; i42++) {
            m83 m83Var6 = mj1Var.c[i42];
            Map map = (Map) af0Var.P.get(i42);
            if (map != null && map.containsKey(m83Var6)) {
                Map map2 = (Map) af0Var.P.get(i42);
                bf0 bf0Var = map2 != null ? (bf0) map2.get(m83Var6) : null;
                np0VarArr[i42] = (bf0Var == null || bf0Var.c.length == 0) ? null : new np0(bf0Var.d, m83Var6.a(bf0Var.b), bf0Var.c);
            }
        }
        for (int i43 = 0; i43 < i28; i43++) {
            int i44 = mj1Var.b[i43];
            if (af0Var.Q.get(i43) || af0Var.A.contains(Integer.valueOf(i44))) {
                np0VarArr[i43] = null;
            }
        }
        op0 op0Var = if0Var.d;
        im imVar = if0Var.b;
        if (imVar == null) {
            throw new IllegalStateException();
        }
        pp0[] a6 = ((dc) op0Var).a(np0VarArr, imVar);
        no2[] no2VarArr = new no2[i28];
        for (int i45 = 0; i45 < i28; i45++) {
            no2VarArr[i45] = (af0Var.Q.get(i45) || af0Var.A.contains(Integer.valueOf(mj1Var.b[i45])) || (mj1Var.b[i45] != -2 && a6[i45] == null)) ? null : no2.b;
        }
        if (af0Var.N) {
            int i46 = -1;
            int i47 = -1;
            int i48 = 0;
            while (i48 < mj1Var.a) {
                int i49 = mj1Var.b[i48];
                pp0 pp0Var = a6[i48];
                if ((i49 == 1 || i49 == 2) && pp0Var != null) {
                    int[][] iArr9 = iArr3[i48];
                    int indexOf2 = mj1Var.c[i48].c.indexOf(pp0Var.b());
                    if (indexOf2 < 0) {
                        indexOf2 = -1;
                    }
                    int i50 = 0;
                    while (true) {
                        if (i50 < pp0Var.f()) {
                            i5 = i37;
                            if ((iArr9[indexOf2][pp0Var.b(i50)] & 32) != i5) {
                                break;
                            }
                            i50++;
                            i37 = i5;
                        } else {
                            i5 = i37;
                            if (i49 == 1) {
                                if (i46 != -1) {
                                    z3 = false;
                                    break;
                                }
                                i46 = i48;
                            } else {
                                if (i47 != -1) {
                                    z3 = false;
                                    break;
                                }
                                i47 = i48;
                            }
                        }
                    }
                } else {
                    i5 = i37;
                }
                i48++;
                i37 = i5;
            }
            z3 = true;
            if (((i46 == -1 || i47 == -1) ? false : true) & z3) {
                z = true;
                no2 no2Var = new no2(true);
                no2VarArr[i46] = no2Var;
                no2VarArr[i47] = no2Var;
                Pair create = Pair.create(no2VarArr, a6);
                pp0VarArr = (pp0[]) create.second;
                List[] listArr = new List[pp0VarArr.length];
                for (i2 = 0; i2 < pp0VarArr.length; i2++) {
                    pp0 pp0Var2 = pp0VarArr[i2];
                    if (pp0Var2 != null) {
                        tn2Var = s51.a(pp0Var2);
                    } else {
                        p51 p51Var = s51.c;
                        tn2Var = tn2.f;
                    }
                    listArr[i2] = tn2Var;
                }
                o51 o51Var = new o51();
                i3 = 0;
                while (i3 < mj1Var.a) {
                    m83 m83Var7 = mj1Var.c[i3];
                    List list = listArr[i3];
                    int i51 = 0;
                    while (i51 < m83Var7.b) {
                        l83 a7 = m83Var7.a(i51);
                        boolean z4 = mj1Var.a(i3, i51) != 0 ? z : false;
                        int i52 = a7.b;
                        int[] iArr10 = new int[i52];
                        boolean[] zArr = new boolean[i52];
                        int i53 = 0;
                        while (i53 < a7.b) {
                            iArr10[i53] = mj1Var.e[i3][i51][i53] & 7;
                            int i54 = 0;
                            while (true) {
                                if (i54 >= list.size()) {
                                    c2 = c;
                                    z2 = false;
                                    break;
                                }
                                pp0 pp0Var3 = (pp0) list.get(i54);
                                if (pp0Var3.b().equals(a7)) {
                                    int c3 = pp0Var3.c(i53);
                                    c2 = 65535;
                                    if (c3 != -1) {
                                        z2 = true;
                                        break;
                                    }
                                } else {
                                    c2 = 65535;
                                }
                                i54++;
                                c = c2;
                            }
                            zArr[i53] = z2;
                            i53++;
                            c = c2;
                        }
                        o51Var.a(new r93(a7, z4, iArr10, zArr));
                        i51++;
                        c = c;
                        z = true;
                    }
                    i3++;
                    z = true;
                }
                m83Var2 = mj1Var.f;
                for (i4 = 0; i4 < m83Var2.b; i4++) {
                    l83 a8 = m83Var2.a(i4);
                    int[] iArr11 = new int[a8.b];
                    Arrays.fill(iArr11, 0);
                    o51Var.a(new r93(a8, false, iArr11, new boolean[a8.b]));
                }
                return new x83((no2[]) create.first, (pp0[]) create.second, new s93(o51Var.a()), mj1Var);
            }
        }
        z = true;
        Pair create2 = Pair.create(no2VarArr, a6);
        pp0VarArr = (pp0[]) create2.second;
        List[] listArr2 = new List[pp0VarArr.length];
        while (i2 < pp0VarArr.length) {
        }
        o51 o51Var2 = new o51();
        i3 = 0;
        while (i3 < mj1Var.a) {
        }
        m83Var2 = mj1Var.f;
        while (i4 < m83Var2.b) {
        }
        return new x83((no2[]) create2.first, (pp0[]) create2.second, new s93(o51Var2.a()), mj1Var);
    }
}
