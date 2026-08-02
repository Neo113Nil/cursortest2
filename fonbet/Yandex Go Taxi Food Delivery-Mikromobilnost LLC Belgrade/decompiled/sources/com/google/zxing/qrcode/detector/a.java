package com.google.zxing.qrcode.detector;

import defpackage.d8r;
import defpackage.vz5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class a {
    public static final FinderPatternFinder$EstimatedModuleComparator e = new FinderPatternFinder$EstimatedModuleComparator();
    public final vz5 a;
    public boolean c;
    public final ArrayList b = new ArrayList();
    public final int[] d = new int[5];

    public a(vz5 vz5Var) {
        this.a = vz5Var;
    }

    public static float a(int i, int[] iArr) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean b(int[] iArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < 5) {
                int i3 = iArr[i];
                if (i3 == 0) {
                    break;
                }
                i2 += i3;
                i++;
            } else if (i2 >= 7) {
                float f = i2 / 7.0f;
                float f2 = f / 2.0f;
                if (Math.abs(f - iArr[0]) >= f2 || Math.abs(f - iArr[1]) >= f2 || Math.abs((f * 3.0f) - iArr[2]) >= 3.0f * f2 || Math.abs(f - iArr[3]) >= f2 || Math.abs(f - iArr[4]) >= f2) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static double e(d8r d8rVar, d8r d8rVar2) {
        double d = d8rVar.a - d8rVar2.a;
        double d2 = d8rVar.b - d8rVar2.b;
        return (d2 * d2) + (d * d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ee  */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int[] iArr, int i, int i2) {
        char c;
        float a;
        ?? r16;
        char c2;
        ArrayList arrayList;
        d8r d8rVar;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        boolean z = false;
        char c3 = 2;
        char c4 = 3;
        int i6 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a2 = (int) a(i2, iArr);
        int i7 = iArr[2];
        vz5 vz5Var = this.a;
        int i8 = vz5Var.b;
        int i9 = vz5Var.a;
        int[] iArr2 = this.d;
        Arrays.fill(iArr2, 0);
        int i10 = i;
        while (i10 >= 0 && vz5Var.b(a2, i10)) {
            iArr2[2] = iArr2[2] + 1;
            i10--;
        }
        float f3 = Float.NaN;
        if (i10 < 0) {
            c = 2;
        } else {
            while (i10 >= 0 && !vz5Var.b(a2, i10)) {
                c = c3;
                int i11 = iArr2[1];
                if (i11 > i7) {
                    break;
                }
                iArr2[1] = i11 + 1;
                i10--;
                c3 = c;
            }
            c = c3;
            if (i10 >= 0 && iArr2[1] <= i7) {
                while (i10 >= 0 && vz5Var.b(a2, i10)) {
                    int i12 = iArr2[0];
                    if (i12 > i7) {
                        break;
                    }
                    iArr2[0] = i12 + 1;
                    i10--;
                }
                if (iArr2[0] <= i7) {
                    int i13 = i + 1;
                    while (i13 < i8 && vz5Var.b(a2, i13)) {
                        iArr2[c] = iArr2[c] + 1;
                        i13++;
                    }
                    if (i13 != i8) {
                        while (i13 < i8 && !vz5Var.b(a2, i13)) {
                            int i14 = iArr2[3];
                            if (i14 >= i7) {
                                break;
                            }
                            iArr2[3] = i14 + 1;
                            i13++;
                        }
                        if (i13 != i8 && iArr2[3] < i7) {
                            while (i13 < i8 && vz5Var.b(a2, i13)) {
                                int i15 = iArr2[4];
                                if (i15 >= i7) {
                                    break;
                                }
                                iArr2[4] = i15 + 1;
                                i13++;
                            }
                            int i16 = iArr2[4];
                            if (i16 < i7 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c]) + iArr2[3]) + i16) - i6) * 5 < i6 * 2 && b(iArr2)) {
                                a = a(i13, iArr2);
                                if (!Float.isNaN(a)) {
                                    int i17 = (int) a;
                                    int i18 = iArr[c];
                                    Arrays.fill(iArr2, 0);
                                    int i19 = a2;
                                    while (i19 >= 0 && vz5Var.b(i19, i17)) {
                                        iArr2[c] = iArr2[c] + 1;
                                        i19--;
                                    }
                                    if (i19 >= 0) {
                                        while (i19 >= 0 && !vz5Var.b(i19, i17)) {
                                            int i20 = iArr2[1];
                                            if (i20 > i18) {
                                                break;
                                            }
                                            iArr2[1] = i20 + 1;
                                            i19--;
                                        }
                                        if (i19 >= 0 && iArr2[1] <= i18) {
                                            while (i19 >= 0 && vz5Var.b(i19, i17)) {
                                                int i21 = iArr2[0];
                                                if (i21 > i18) {
                                                    break;
                                                }
                                                iArr2[0] = i21 + 1;
                                                i19--;
                                            }
                                            if (iArr2[0] <= i18) {
                                                int i22 = a2 + 1;
                                                while (i22 < i9 && vz5Var.b(i22, i17)) {
                                                    iArr2[c] = iArr2[c] + 1;
                                                    i22++;
                                                }
                                                if (i22 != i9) {
                                                    while (i22 < i9 && !vz5Var.b(i22, i17)) {
                                                        int i23 = iArr2[3];
                                                        if (i23 >= i18) {
                                                            break;
                                                        }
                                                        iArr2[3] = i23 + 1;
                                                        i22++;
                                                    }
                                                    if (i22 != i9 && iArr2[3] < i18) {
                                                        while (i22 < i9 && vz5Var.b(i22, i17)) {
                                                            int i24 = iArr2[4];
                                                            if (i24 >= i18) {
                                                                break;
                                                            }
                                                            iArr2[4] = i24 + 1;
                                                            i22++;
                                                        }
                                                        int i25 = iArr2[4];
                                                        if (i25 < i18 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c]) + iArr2[3]) + i25) - i6) * 5 < i6 && b(iArr2)) {
                                                            f3 = a(i22, iArr2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    float f4 = f3;
                                    if (!Float.isNaN(f4)) {
                                        int i26 = (int) f4;
                                        Arrays.fill(iArr2, 0);
                                        int i27 = 0;
                                        while (i17 >= i27 && i26 >= i27) {
                                            r16 = z;
                                            if (!vz5Var.b(i26 - i27, i17 - i27)) {
                                                break;
                                            }
                                            iArr2[c] = iArr2[c] + 1;
                                            i27++;
                                            z = r16 == true ? 1 : 0;
                                        }
                                        r16 = z;
                                        if (iArr2[c] == 0) {
                                            return r16;
                                        }
                                        while (i17 >= i27 && i26 >= i27 && !vz5Var.b(i26 - i27, i17 - i27)) {
                                            iArr2[1] = iArr2[1] + 1;
                                            i27++;
                                        }
                                        if (iArr2[1] == 0) {
                                            return r16;
                                        }
                                        while (i17 >= i27 && i26 >= i27 && vz5Var.b(i26 - i27, i17 - i27)) {
                                            iArr2[r16] = iArr2[r16] + 1;
                                            i27++;
                                        }
                                        if (iArr2[r16] == 0) {
                                            return r16;
                                        }
                                        int i28 = vz5Var.b;
                                        int i29 = 1;
                                        while (true) {
                                            int i30 = i17 + i29;
                                            c2 = c4;
                                            if (i30 >= i28 || (i5 = i26 + i29) >= i9 || !vz5Var.b(i5, i30)) {
                                                break;
                                            }
                                            iArr2[c] = iArr2[c] + 1;
                                            i29++;
                                            c4 = c2;
                                        }
                                        while (true) {
                                            int i31 = i17 + i29;
                                            if (i31 >= i28 || (i4 = i26 + i29) >= i9 || vz5Var.b(i4, i31)) {
                                                break;
                                            }
                                            iArr2[c2] = iArr2[c2] + 1;
                                            i29++;
                                        }
                                        if (iArr2[c2] == 0) {
                                            return r16;
                                        }
                                        while (true) {
                                            int i32 = i17 + i29;
                                            if (i32 >= i28 || (i3 = i26 + i29) >= i9 || !vz5Var.b(i3, i32)) {
                                                break;
                                            }
                                            iArr2[4] = iArr2[4] + 1;
                                            i29++;
                                        }
                                        if (iArr2[4] == 0) {
                                            return r16;
                                        }
                                        int i33 = r16;
                                        int i34 = i33;
                                        while (i33 < 5) {
                                            int i35 = iArr2[i33];
                                            if (i35 == 0) {
                                                return r16;
                                            }
                                            i34 += i35;
                                            i33++;
                                        }
                                        if (i34 < 7) {
                                            return r16;
                                        }
                                        float f5 = i34 / 7.0f;
                                        float f6 = f5 / 1.333f;
                                        if (Math.abs(f5 - iArr2[r16]) >= f6 || Math.abs(f5 - iArr2[1]) >= f6 || Math.abs((f5 * 3.0f) - iArr2[c]) >= 3.0f * f6 || Math.abs(f5 - iArr2[c2]) >= f6 || Math.abs(f5 - iArr2[4]) >= f6) {
                                            return r16;
                                        }
                                        float f7 = i6 / 7.0f;
                                        int i36 = r16;
                                        while (true) {
                                            arrayList = this.b;
                                            if (i36 >= arrayList.size()) {
                                                arrayList.add(new d8r(f4, a, f7, 1));
                                                return true;
                                            }
                                            d8rVar = (d8r) arrayList.get(i36);
                                            float f8 = d8rVar.c;
                                            f = d8rVar.a;
                                            f2 = d8rVar.b;
                                            if (Math.abs(a - f2) <= f7 && Math.abs(f4 - f) <= f7) {
                                                float abs = Math.abs(f7 - f8);
                                                if (abs <= 1.0f || abs <= f8) {
                                                    break;
                                                }
                                            }
                                            i36++;
                                        }
                                        int i37 = d8rVar.d;
                                        int i38 = i37 + 1;
                                        float f9 = i37;
                                        float f10 = (f * f9) + f4;
                                        float f11 = i38;
                                        arrayList.set(i36, new d8r(f10 / f11, ((f2 * f9) + a) / f11, ((f9 * d8rVar.c) + f7) / f11, i38));
                                        return true;
                                    }
                                }
                                return false;
                            }
                        }
                    }
                }
            }
        }
        a = Float.NaN;
        if (!Float.isNaN(a)) {
        }
        return false;
    }

    public final boolean d() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        while (it.hasNext()) {
            d8r d8rVar = (d8r) it.next();
            if (d8rVar.d >= 2) {
                i++;
                f2 += d8rVar.c;
            }
        }
        if (i >= 3) {
            float f3 = f2 / size;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                f += Math.abs(((d8r) it2.next()).c - f3);
            }
            if (f <= f2 * 0.05f) {
                return true;
            }
        }
        return false;
    }
}
