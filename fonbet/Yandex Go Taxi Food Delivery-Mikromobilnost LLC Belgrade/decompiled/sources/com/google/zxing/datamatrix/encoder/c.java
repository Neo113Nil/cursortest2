package com.google.zxing.datamatrix.encoder;

import defpackage.ki20;
import defpackage.qv10;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class c {
    public final byte[] a;

    /* JADX WARN: Multi-variable type inference failed */
    public c(b bVar) {
        int i;
        byte[] bArr;
        int i2;
        int i3;
        byte[] bArr2;
        int i4;
        byte[] bArr3;
        int i5;
        ki20 ki20Var = bVar.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        MinimalEncoder$Mode minimalEncoder$Mode = bVar.b;
        byte b = -2;
        int i6 = 1;
        int i7 = 0;
        int a = ((minimalEncoder$Mode == MinimalEncoder$Mode.C40 || minimalEncoder$Mode == MinimalEncoder$Mode.TEXT || minimalEncoder$Mode == MinimalEncoder$Mode.X12) && bVar.c() != MinimalEncoder$Mode.ASCII) ? a(new byte[]{-2}, arrayList) : 0;
        b bVar2 = bVar;
        while (bVar2 != null) {
            b bVar3 = bVar2.e;
            byte b2 = b;
            MinimalEncoder$Mode minimalEncoder$Mode2 = bVar2.b;
            int i8 = bVar2.d;
            int i9 = bVar2.c;
            ki20 ki20Var2 = bVar2.a;
            int i10 = i6;
            int i11 = ki20Var2.c;
            int i12 = 3;
            switch (a.a[minimalEncoder$Mode2.ordinal()]) {
                case 1:
                    i = a;
                    char c = i7;
                    if (ki20Var2.b(i9)) {
                        byte a2 = (byte) (ki20Var2.a(i9) + i10);
                        byte[] bArr4 = new byte[2];
                        bArr4[c] = -15;
                        bArr4[i10] = a2;
                        bArr = bArr4;
                        break;
                    } else if (d.d(ki20Var2.charAt(i9), i11)) {
                        bArr = new byte[]{-21, (byte) (ki20Var2.charAt(i9) - 127)};
                        break;
                    } else if (i8 == 2) {
                        bArr = new byte[]{(byte) (ki20Var2.charAt(i9 + 1) + ((ki20Var2.charAt(i9) - '0') * 10) + 82)};
                        break;
                    } else if (ki20Var2.e(i9)) {
                        bArr = new byte[]{-24};
                        break;
                    } else {
                        bArr = new byte[]{(byte) (ki20Var2.charAt(i9) + 1)};
                        break;
                    }
                case 2:
                    i = a;
                    byte[] bArr5 = new byte[i10];
                    bArr5[i7] = (byte) ki20Var2.charAt(i9);
                    bArr = bArr5;
                    break;
                case 3:
                    i = a;
                    bArr = bVar2.b(i11, i10);
                    break;
                case 4:
                    i = a;
                    bArr = bVar2.b(i11, i7);
                    break;
                case 5:
                    i = a;
                    int i13 = 2;
                    int i14 = (i8 / 3) * 2;
                    bArr = new byte[i14];
                    int i15 = i7;
                    while (i15 < i14) {
                        int b3 = qv10.b(i15, i13, i12, i9);
                        b.h(i15, b.g(ki20Var2.charAt(b3)), b.g(ki20Var2.charAt(b3 + 1)), b.g(ki20Var2.charAt(b3 + 2)), bArr);
                        i15 += 2;
                        i13 = 2;
                        i12 = 3;
                    }
                    break;
                case 6:
                    int ceil = (int) Math.ceil(i8 / 4.0d);
                    byte[] bArr6 = new byte[ceil * 3];
                    int min = Math.min((i8 + i9) - 1, ki20Var2.b.length - 1);
                    int i16 = i7;
                    int i17 = i7;
                    while (i16 < ceil) {
                        int i18 = a;
                        int i19 = i17;
                        int[] iArr = new int[4];
                        int i20 = i19;
                        for (int i21 = 4; i20 < i21; i21 = 4) {
                            if (i9 <= min) {
                                iArr[i20] = ki20Var2.charAt(i9) & '?';
                                i9++;
                            } else {
                                iArr[i20] = i9 == min + 1 ? 31 : i19;
                            }
                            i20++;
                        }
                        int i22 = (iArr[i19] << 18) | (iArr[i10] << 12) | (iArr[2] << 6) | iArr[3];
                        bArr6[i16] = (byte) ((i22 >> 16) & 255);
                        byte[] bArr7 = bArr6;
                        bArr7[i16 + 1] = (byte) ((i22 >> 8) & 255);
                        bArr7[i16 + 2] = (byte) (i22 & 255);
                        i16 += 3;
                        ceil = ceil;
                        i17 = i19;
                        a = i18;
                        bArr6 = bArr7;
                    }
                    i = a;
                    bArr = bArr6;
                    break;
                default:
                    bArr = new byte[i7];
                    i = a;
                    break;
            }
            int a3 = a(bArr, arrayList) + i;
            if (bVar3 == null || bVar3.b != minimalEncoder$Mode2) {
                if (minimalEncoder$Mode2 == MinimalEncoder$Mode.B256) {
                    if (a3 <= 249) {
                        arrayList.add(0, Byte.valueOf((byte) a3));
                        i5 = a3 + 1;
                    } else {
                        arrayList.add(0, Byte.valueOf((byte) (a3 % 250)));
                        arrayList.add(0, Byte.valueOf((byte) ((a3 / 250) + 249)));
                        i5 = a3 + 2;
                    }
                    arrayList2.add(Integer.valueOf(arrayList.size()));
                    arrayList3.add(Integer.valueOf(i5));
                }
                int[] iArr2 = a.a;
                int i23 = iArr2[(bVar3 == null ? MinimalEncoder$Mode.ASCII : bVar3.c()).ordinal()];
                if (i23 == 1 || i23 == 2) {
                    int i24 = iArr2[minimalEncoder$Mode2.ordinal()];
                    if (i24 == 2) {
                        i2 = 0;
                        i3 = 1;
                        bArr2 = new byte[]{-25};
                    } else if (i24 == 3) {
                        i2 = 0;
                        i3 = 1;
                        bArr2 = new byte[]{-26};
                    } else if (i24 == 4) {
                        i2 = 0;
                        i3 = 1;
                        bArr2 = new byte[]{-17};
                    } else if (i24 == 5) {
                        i2 = 0;
                        i3 = 1;
                        bArr2 = new byte[]{-18};
                    } else if (i24 == 6) {
                        i2 = 0;
                        i3 = 1;
                        bArr2 = new byte[]{-16};
                    }
                    a(bArr2, arrayList);
                    i4 = i2;
                } else if (i23 == 3 || i23 == 4 || i23 == 5) {
                    if (minimalEncoder$Mode2 != (bVar3 == null ? MinimalEncoder$Mode.ASCII : bVar3.c())) {
                        switch (iArr2[minimalEncoder$Mode2.ordinal()]) {
                            case 1:
                                bArr3 = new byte[]{b2};
                                bArr2 = bArr3;
                                i2 = 0;
                                break;
                            case 2:
                                bArr3 = new byte[]{-2, -25};
                                bArr2 = bArr3;
                                i2 = 0;
                                break;
                            case 3:
                                bArr3 = new byte[]{-2, -26};
                                bArr2 = bArr3;
                                i2 = 0;
                                break;
                            case 4:
                                bArr3 = new byte[]{-2, -17};
                                bArr2 = bArr3;
                                i2 = 0;
                                break;
                            case 5:
                                bArr3 = new byte[]{-2, -18};
                                bArr2 = bArr3;
                                i2 = 0;
                                break;
                            case 6:
                                bArr3 = new byte[]{-2, -16};
                                bArr2 = bArr3;
                                i2 = 0;
                                break;
                        }
                        i3 = 1;
                        a(bArr2, arrayList);
                        i4 = i2;
                    }
                }
                i2 = 0;
                bArr2 = new byte[0];
                i3 = 1;
                a(bArr2, arrayList);
                i4 = i2;
            } else {
                i4 = a3;
                i2 = 0;
                i3 = 1;
            }
            i6 = i3;
            b = b2;
            i7 = i2;
            a = i4;
            bVar2 = bVar3;
        }
        int i25 = i7;
        int i26 = i6;
        int i27 = ki20Var.x;
        if (i27 == 5) {
            byte[] bArr8 = new byte[i26];
            bArr8[i25] = -20;
            a(bArr8, arrayList);
        } else if (i27 == 6) {
            byte[] bArr9 = new byte[i26];
            bArr9[i25] = -19;
            a(bArr9, arrayList);
        }
        if (ki20Var.c > 0) {
            byte[] bArr10 = new byte[i26];
            bArr10[i25] = -24;
            a(bArr10, arrayList);
        }
        for (int i28 = i25; i28 < arrayList2.size(); i28++) {
            int size = arrayList.size() - ((Integer) arrayList2.get(i28)).intValue();
            int intValue = ((Integer) arrayList3.get(i28)).intValue();
            for (int i29 = i25; i29 < intValue; i29++) {
                int i30 = size + i29;
                int byteValue = (((i30 + 1) * 149) % 255) + 1 + (((Byte) arrayList.get(i30)).byteValue() & 255);
                if (byteValue > 255) {
                    byteValue -= 256;
                }
                arrayList.set(i30, Byte.valueOf((byte) byteValue));
            }
        }
        int e = bVar.e(arrayList.size());
        if (arrayList.size() < e) {
            arrayList.add((byte) -127);
        }
        while (arrayList.size() < e) {
            int size2 = ((arrayList.size() + 1) * 149) % 253;
            int i31 = size2 + 130;
            if (i31 > 254) {
                i31 = size2 - 124;
            }
            arrayList.add(Byte.valueOf((byte) i31));
        }
        this.a = new byte[arrayList.size()];
        int i32 = i25;
        while (true) {
            byte[] bArr11 = this.a;
            if (i32 >= bArr11.length) {
                return;
            }
            bArr11[i32] = ((Byte) arrayList.get(i32)).byteValue();
            i32++;
        }
    }

    public static int a(byte[] bArr, ArrayList arrayList) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            arrayList.add(0, Byte.valueOf(bArr[length]));
        }
        return bArr.length;
    }
}
