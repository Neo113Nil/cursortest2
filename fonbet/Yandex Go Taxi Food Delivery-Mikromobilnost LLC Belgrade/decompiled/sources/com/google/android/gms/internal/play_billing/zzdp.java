package com.google.android.gms.internal.play_billing;

import defpackage.df91;
import defpackage.rzo;
import defpackage.vng;
import defpackage.ye91;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzdp extends zzcr {
    public static final zzcr z = new zzdp(0, null, new Object[0]);
    public final transient Object w;
    public final transient Object[] x;
    public final transient int y;

    public zzdp(int i, Object obj, Object[] objArr) {
        this.w = obj;
        this.x = objArr;
        this.y = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01a0  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzdp b(int i, Object[] objArr, df91 df91Var) {
        boolean z2;
        int i2;
        char c;
        Object obj;
        char c2;
        short[] sArr;
        boolean z3;
        int i3;
        ?? r16;
        boolean z4;
        boolean z5;
        int i4 = i;
        Object[] objArr2 = objArr;
        if (i4 == 0) {
            return (zzdp) z;
        }
        Object obj2 = null;
        boolean z6 = false;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new zzdp(1, null, objArr2);
        }
        vng.R(i4, objArr2.length >> 1);
        int j = zzcv.j(i4);
        char c3 = 2;
        if (i4 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            z5 = false;
            i4 = 1;
            i2 = 1;
        } else {
            int i6 = j - 1;
            if (j <= 128) {
                byte[] bArr = new byte[j];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i8 + i8;
                    int i10 = i7 + i7;
                    Object obj3 = objArr2[i10];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i10 ^ i5];
                    Objects.requireNonNull(obj4);
                    int e0 = rzo.e0(obj3.hashCode());
                    while (true) {
                        int i11 = e0 & i6;
                        z3 = z6;
                        i3 = i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i9;
                            if (i8 < i7) {
                                objArr2[i9] = obj3;
                                objArr2[i9 ^ 1] = obj4;
                            }
                            i8++;
                        } else {
                            if (obj3.equals(objArr2[i12])) {
                                int i13 = i12 ^ 1;
                                Object obj5 = objArr2[i13];
                                Objects.requireNonNull(obj5);
                                ye91 ye91Var = new ye91(obj3, obj4, obj5);
                                objArr2[i13] = obj4;
                                obj2 = ye91Var;
                                break;
                            }
                            e0 = i11 + 1;
                            z6 = z3;
                            i5 = i3;
                        }
                    }
                    i7++;
                    z6 = z3;
                    i5 = i3;
                }
                z2 = z6;
                i2 = i5;
                if (i8 == i4) {
                    obj2 = bArr;
                    z5 = z2;
                } else {
                    sArr = new Object[3];
                    sArr[z2 ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z5 = z2;
                }
            } else {
                z2 = false;
                i2 = 1;
                if (j > 32768) {
                    int[] iArr = new int[j];
                    Arrays.fill(iArr, -1);
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < i4) {
                        int i16 = i15 + i15;
                        int i17 = i14 + i14;
                        Object obj6 = objArr2[i17];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArr2[i17 ^ 1];
                        Objects.requireNonNull(obj7);
                        int e02 = rzo.e0(obj6.hashCode());
                        while (true) {
                            int i18 = e02 & i6;
                            int i19 = iArr[i18];
                            if (i19 == -1) {
                                iArr[i18] = i16;
                                if (i15 < i14) {
                                    objArr2[i16] = obj6;
                                    objArr2[i16 ^ 1] = obj7;
                                }
                                i15++;
                                c2 = c3;
                            } else {
                                c2 = c3;
                                if (obj6.equals(objArr2[i19])) {
                                    int i20 = i19 ^ 1;
                                    Object obj8 = objArr2[i20];
                                    Objects.requireNonNull(obj8);
                                    ye91 ye91Var2 = new ye91(obj6, obj7, obj8);
                                    objArr2[i20] = obj7;
                                    obj2 = ye91Var2;
                                    break;
                                }
                                e02 = i18 + 1;
                                c3 = c2;
                            }
                        }
                        i14++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i15 == i4) {
                        obj = iArr;
                        r16 = z2;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i15);
                        objArr3[c] = obj2;
                        obj = objArr3;
                        r16 = z2;
                    }
                    z4 = obj instanceof Object[];
                    Object obj9 = obj;
                    if (z4) {
                        Object[] objArr4 = (Object[]) obj;
                        ye91 ye91Var3 = (ye91) objArr4[c];
                        if (df91Var == null) {
                            throw ye91Var3.a();
                        }
                        df91Var.c = ye91Var3;
                        Object obj10 = objArr4[r16];
                        int intValue = ((Integer) objArr4[i2]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj9 = obj10;
                        i4 = intValue;
                    }
                    return new zzdp(i4, obj9, objArr2);
                }
                sArr = new short[j];
                Arrays.fill(sArr, (short) -1);
                int i21 = 0;
                for (int i22 = 0; i22 < i4; i22++) {
                    int i23 = i21 + i21;
                    int i24 = i22 + i22;
                    Object obj11 = objArr2[i24];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i24 ^ 1];
                    Objects.requireNonNull(obj12);
                    int e03 = rzo.e0(obj11.hashCode());
                    while (true) {
                        int i25 = e03 & i6;
                        char c4 = (char) sArr[i25];
                        if (c4 == 65535) {
                            sArr[i25] = (short) i23;
                            if (i21 < i22) {
                                objArr2[i23] = obj11;
                                objArr2[i23 ^ 1] = obj12;
                            }
                            i21++;
                        } else {
                            if (obj11.equals(objArr2[c4])) {
                                int i26 = c4 ^ 1;
                                Object obj13 = objArr2[i26];
                                Objects.requireNonNull(obj13);
                                ye91 ye91Var4 = new ye91(obj11, obj12, obj13);
                                objArr2[i26] = obj12;
                                obj2 = ye91Var4;
                                break;
                            }
                            e03 = i25 + 1;
                        }
                    }
                }
                if (i21 != i4) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i21), obj2};
                    z5 = z2;
                }
                obj2 = sArr;
                z5 = z2;
            }
        }
        c = 2;
        obj = obj2;
        r16 = z5;
        z4 = obj instanceof Object[];
        Object obj92 = obj;
        if (z4) {
        }
        return new zzdp(i4, obj92, objArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.play_billing.zzcr, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i = this.y;
            Object[] objArr = this.x;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.w;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int e0 = rzo.e0(obj.hashCode());
                        while (true) {
                            int i2 = e0 & length;
                            int i3 = bArr[i2] & 255;
                            if (i3 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            }
                            e0 = i2 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int e02 = rzo.e0(obj.hashCode());
                        while (true) {
                            int i4 = e02 & length2;
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                                break;
                            }
                            e02 = i4 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int e03 = rzo.e0(obj.hashCode());
                        while (true) {
                            int i5 = e03 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            e03 = i5 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.y;
    }
}
