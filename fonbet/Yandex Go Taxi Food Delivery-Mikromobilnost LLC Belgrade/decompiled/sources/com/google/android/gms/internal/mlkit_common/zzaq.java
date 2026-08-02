package com.google.android.gms.internal.mlkit_common;

import defpackage.gtq0;
import defpackage.gza1;
import defpackage.h591;
import defpackage.ny61;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes11.dex */
final class zzaq extends zzai {
    public static final zzai z = new zzaq(0, null, new Object[0]);
    public final transient Object w;
    public final transient Object[] x;
    public final transient int y;

    public zzaq(int i, Object obj, Object[] objArr) {
        this.w = obj;
        this.x = objArr;
        this.y = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c0  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaq a(int i, Object[] objArr, a aVar) {
        int i2;
        boolean z2;
        int i3;
        char c;
        Object obj;
        char c2;
        short[] sArr;
        boolean z3;
        int i4;
        ?? r16;
        boolean z4;
        boolean z5;
        int i5 = i;
        Object[] objArr2 = objArr;
        if (i5 == 0) {
            return (zzaq) z;
        }
        Object obj2 = null;
        boolean z6 = false;
        int i6 = 1;
        if (i5 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new zzaq(1, null, objArr2);
        }
        gtq0.X(i5, objArr2.length >> 1);
        char c3 = 2;
        int max = Math.max(i5, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (i2 * 0.7d < max);
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                ny61.g("collection too large");
                return null;
            }
        }
        if (i5 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            z5 = false;
            i5 = 1;
            i3 = 1;
        } else {
            int i7 = i2 - 1;
            if (i2 <= 128) {
                byte[] bArr = new byte[i2];
                Arrays.fill(bArr, (byte) -1);
                int i8 = 0;
                int i9 = 0;
                while (i8 < i5) {
                    int i10 = i9 + i9;
                    int i11 = i8 + i8;
                    Object obj3 = objArr2[i11];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArr2[i11 ^ i6];
                    Objects.requireNonNull(obj4);
                    int c4 = gza1.c(obj3.hashCode());
                    while (true) {
                        int i12 = c4 & i7;
                        z3 = z6;
                        i4 = i6;
                        int i13 = bArr[i12] & 255;
                        if (i13 == 255) {
                            bArr[i12] = (byte) i10;
                            if (i9 < i8) {
                                objArr2[i10] = obj3;
                                objArr2[i10 ^ 1] = obj4;
                            }
                            i9++;
                        } else {
                            if (obj3.equals(objArr2[i13])) {
                                int i14 = i13 ^ 1;
                                Object obj5 = objArr2[i14];
                                Objects.requireNonNull(obj5);
                                h591 h591Var = new h591(obj3, obj4, obj5);
                                objArr2[i14] = obj4;
                                obj2 = h591Var;
                                break;
                            }
                            c4 = i12 + 1;
                            z6 = z3;
                            i6 = i4;
                        }
                    }
                    i8++;
                    z6 = z3;
                    i6 = i4;
                }
                z2 = z6;
                i3 = i6;
                if (i9 == i5) {
                    c = 2;
                    obj = bArr;
                    r16 = z2;
                    z4 = obj instanceof Object[];
                    Object obj6 = obj;
                    if (z4) {
                        Object[] objArr3 = (Object[]) obj;
                        h591 h591Var2 = (h591) objArr3[c];
                        if (aVar == null) {
                            throw h591Var2.a();
                        }
                        aVar.c = h591Var2;
                        Object obj7 = objArr3[r16];
                        int intValue = ((Integer) objArr3[i3]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj6 = obj7;
                        i5 = intValue;
                    }
                    return new zzaq(i5, obj6, objArr2);
                }
                sArr = new Object[3];
                sArr[z2 ? 1 : 0] = bArr;
                sArr[i3] = Integer.valueOf(i9);
                sArr[2] = obj2;
                obj2 = sArr;
                z5 = z2;
            } else {
                z2 = false;
                i3 = 1;
                if (i2 > 32768) {
                    int[] iArr = new int[i2];
                    Arrays.fill(iArr, -1);
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < i5) {
                        int i17 = i16 + i16;
                        int i18 = i15 + i15;
                        Object obj8 = objArr2[i18];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArr2[i18 ^ 1];
                        Objects.requireNonNull(obj9);
                        int c5 = gza1.c(obj8.hashCode());
                        while (true) {
                            int i19 = c5 & i7;
                            int i20 = iArr[i19];
                            if (i20 == -1) {
                                iArr[i19] = i17;
                                if (i16 < i15) {
                                    objArr2[i17] = obj8;
                                    objArr2[i17 ^ 1] = obj9;
                                }
                                i16++;
                                c2 = c3;
                            } else {
                                c2 = c3;
                                if (obj8.equals(objArr2[i20])) {
                                    int i21 = i20 ^ 1;
                                    Object obj10 = objArr2[i21];
                                    Objects.requireNonNull(obj10);
                                    h591 h591Var3 = new h591(obj8, obj9, obj10);
                                    objArr2[i21] = obj9;
                                    obj2 = h591Var3;
                                    break;
                                }
                                c5 = i19 + 1;
                                c3 = c2;
                            }
                        }
                        i15++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i16 == i5) {
                        obj = iArr;
                        r16 = z2;
                    } else {
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = iArr;
                        objArr4[1] = Integer.valueOf(i16);
                        objArr4[c] = obj2;
                        obj = objArr4;
                        r16 = z2;
                    }
                    z4 = obj instanceof Object[];
                    Object obj62 = obj;
                    if (z4) {
                    }
                    return new zzaq(i5, obj62, objArr2);
                }
                sArr = new short[i2];
                Arrays.fill(sArr, (short) -1);
                int i22 = 0;
                for (int i23 = 0; i23 < i5; i23++) {
                    int i24 = i22 + i22;
                    int i25 = i23 + i23;
                    Object obj11 = objArr2[i25];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr2[i25 ^ 1];
                    Objects.requireNonNull(obj12);
                    int c6 = gza1.c(obj11.hashCode());
                    while (true) {
                        int i26 = c6 & i7;
                        char c7 = (char) sArr[i26];
                        if (c7 == 65535) {
                            sArr[i26] = (short) i24;
                            if (i22 < i23) {
                                objArr2[i24] = obj11;
                                objArr2[i24 ^ 1] = obj12;
                            }
                            i22++;
                        } else {
                            if (obj11.equals(objArr2[c7])) {
                                int i27 = c7 ^ 1;
                                Object obj13 = objArr2[i27];
                                Objects.requireNonNull(obj13);
                                h591 h591Var4 = new h591(obj11, obj12, obj13);
                                objArr2[i27] = obj12;
                                obj2 = h591Var4;
                                break;
                            }
                            c6 = i26 + 1;
                        }
                    }
                }
                if (i22 != i5) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i22), obj2};
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
        Object obj622 = obj;
        if (z4) {
        }
        return new zzaq(i5, obj622, objArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.mlkit_common.zzai, java.util.Map
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
                        int c = gza1.c(obj.hashCode());
                        while (true) {
                            int i2 = c & length;
                            int i3 = bArr[i2] & 255;
                            if (i3 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            }
                            c = i2 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int c2 = gza1.c(obj.hashCode());
                        while (true) {
                            int i4 = c2 & length2;
                            char c3 = (char) sArr[i4];
                            if (c3 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c3])) {
                                obj2 = objArr[c3 ^ 1];
                                break;
                            }
                            c2 = i4 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int c4 = gza1.c(obj.hashCode());
                        while (true) {
                            int i5 = c4 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            c4 = i5 + 1;
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
