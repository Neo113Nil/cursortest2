package defpackage;

import kotlin.io.encoding.Base64$PaddingOption;

/* loaded from: classes4.dex */
public class cw4 {
    public static final aw4 d;
    public final boolean a;
    public final boolean b;
    public final Base64$PaddingOption c;

    static {
        Base64$PaddingOption base64$PaddingOption = Base64$PaddingOption.PRESENT;
        d = new aw4(false, false, -1, base64$PaddingOption);
        new cw4(true, false, -1, base64$PaddingOption);
        new cw4(false, true, 76, base64$PaddingOption);
        new cw4(false, true, 64, base64$PaddingOption);
    }

    public cw4(boolean z, boolean z2, int i, Base64$PaddingOption base64$PaddingOption) {
        this.a = z;
        this.b = z2;
        this.c = base64$PaddingOption;
        if (z && z2) {
            ny61.g("Failed requirement.");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(cw4 cw4Var, CharSequence charSequence, int i, int i2) {
        byte[] bArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        char c;
        int i8 = 0;
        int i9 = (i2 & 2) != 0 ? 0 : i;
        int length = charSequence.length();
        cw4Var.getClass();
        Base64$PaddingOption base64$PaddingOption = cw4Var.c;
        boolean z = cw4Var.b;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            int length2 = str.length();
            k8.Companion.getClass();
            g8.a(i9, length, length2);
            bArr = str.substring(i9, length).getBytes(uza.e);
        } else {
            int length3 = charSequence.length();
            k8.Companion.getClass();
            g8.a(i9, length, length3);
            byte[] bArr2 = new byte[length - i9];
            int i10 = 0;
            while (i9 < length) {
                char charAt = charSequence.charAt(i9);
                if (charAt <= 255) {
                    bArr2[i10] = (byte) charAt;
                    i10++;
                } else {
                    bArr2[i10] = 63;
                    i10++;
                }
                i9++;
            }
            bArr = bArr2;
        }
        int length4 = bArr.length;
        int length5 = bArr.length;
        k8.Companion.getClass();
        g8.a(0, length4, length5);
        int i11 = 1;
        int i12 = -2;
        if (length4 == 0) {
            i4 = 0;
        } else {
            if (length4 == 1) {
                ny61.g(oyr.i(length4, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                return null;
            }
            if (z) {
                i3 = length4;
                int i13 = 0;
                while (true) {
                    if (i13 >= length4) {
                        break;
                    }
                    int i14 = lw4.a[bArr[i13] & 255];
                    if (i14 < 0) {
                        if (i14 == -2) {
                            i3 -= length4 - i13;
                            break;
                        }
                        i3--;
                    }
                    i13++;
                }
            } else if (bArr[length4 - 1] == 61) {
                i3 = length4 - 1;
                if (bArr[length4 - 2] == 61) {
                    i3 = length4 - 2;
                }
            } else {
                i3 = length4;
            }
            i4 = (int) ((i3 * 6) / 8);
        }
        byte[] bArr3 = new byte[i4];
        int[] iArr2 = cw4Var.a ? lw4.b : lw4.a;
        int i15 = -8;
        int i16 = 0;
        int i17 = 0;
        int i18 = -8;
        while (true) {
            int i19 = i11;
            if (i16 >= length4) {
                i5 = 0;
                break;
            }
            if (i18 == i15) {
                i6 = 8;
                int i20 = i16 + 3;
                if (i20 < length4) {
                    int i21 = iArr2[bArr[i16] & 255];
                    iArr = iArr2;
                    int i22 = i16 + 4;
                    int i23 = (iArr[bArr[i16 + 2] & 255] << 6) | (iArr2[bArr[i16 + 1] & 255] << 12) | (i21 << 18) | iArr[bArr[i20] & 255];
                    if (i23 >= 0) {
                        bArr3[i8] = (byte) (i23 >> 16);
                        int i24 = i8 + 2;
                        bArr3[i8 + 1] = (byte) (i23 >> 8);
                        i8 += 3;
                        bArr3[i24] = (byte) i23;
                        i11 = i19;
                        iArr2 = iArr;
                        i16 = i22;
                        i12 = -2;
                        i15 = -8;
                    }
                    int i25 = bArr[i16] & 255;
                    i7 = iArr[i25];
                    if (i7 < 0) {
                        c = '=';
                        i16++;
                        i17 = (i17 << 6) | i7;
                        int i26 = i18 + 6;
                        if (i26 >= 0) {
                            bArr3[i8] = (byte) (i17 >>> i26);
                            i17 &= (i19 << i26) - 1;
                            i18 -= 2;
                            i11 = i19;
                            i8++;
                        } else {
                            i11 = i19;
                            i18 = i26;
                        }
                    } else if (i7 != -2) {
                        c = '=';
                        if (!z) {
                            char c2 = (char) i25;
                            rza.a(i6);
                            throw new IllegalArgumentException("Invalid symbol '" + c2 + "'(" + Integer.toString(i25, i6) + ") at index " + i16);
                        }
                        i16++;
                        i11 = i19;
                    } else {
                        if (i18 == -8) {
                            ny61.g(oyr.i(i16, "Redundant pad character at index "));
                            return null;
                        }
                        if (i18 != -6) {
                            if (i18 != -4) {
                                if (i18 != -2) {
                                    ny61.r("Unreachable");
                                    return null;
                                }
                            } else {
                                if (base64$PaddingOption == Base64$PaddingOption.ABSENT) {
                                    ny61.g(oyr.i(i16, "The padding option is set to ABSENT, but the input has a pad character at index "));
                                    return null;
                                }
                                int i27 = i16 + 1;
                                if (z) {
                                    while (i27 < length4) {
                                        if (lw4.a[bArr[i27] & 255] != -1) {
                                            break;
                                        }
                                        i27++;
                                    }
                                }
                                if (i27 == length4 || bArr[i27] != 61) {
                                    ny61.g(oyr.i(i27, "Missing one pad character at index "));
                                    return null;
                                }
                                i16 = i27 + 1;
                                i5 = i19;
                                i12 = -2;
                            }
                        } else if (base64$PaddingOption == Base64$PaddingOption.ABSENT) {
                            ny61.g(oyr.i(i16, "The padding option is set to ABSENT, but the input has a pad character at index "));
                            return null;
                        }
                        i16++;
                        i5 = i19;
                        i12 = -2;
                    }
                    iArr2 = iArr;
                    i12 = -2;
                    i15 = -8;
                }
            } else {
                i6 = 8;
            }
            iArr = iArr2;
            int i252 = bArr[i16] & 255;
            i7 = iArr[i252];
            if (i7 < 0) {
            }
            iArr2 = iArr;
            i12 = -2;
            i15 = -8;
        }
        if (i18 == i12) {
            ny61.g("The last unit of input does not have enough bits");
            return null;
        }
        if (i18 != -8 && i5 == 0 && base64$PaddingOption == Base64$PaddingOption.PRESENT) {
            ny61.g("The padding option is set to PRESENT, but the input is not properly padded");
            return null;
        }
        if (i17 != 0) {
            ny61.g("The pad bits must be zeros");
            return null;
        }
        if (z) {
            while (i16 < length4) {
                if (lw4.a[bArr[i16] & 255] != -1) {
                    break;
                }
                i16++;
            }
        }
        if (i16 >= length4) {
            if (i8 == i4) {
                return bArr3;
            }
            ny61.r("Check failed.");
            return null;
        }
        int i28 = bArr[i16] & 255;
        StringBuilder sb = new StringBuilder("Symbol '");
        sb.append((char) i28);
        sb.append("'(");
        rza.a(8);
        sb.append(Integer.toString(i28, 8));
        sb.append(") at index ");
        ny61.g(oyr.m(i16 - 1, " is prohibited after the pad character", sb));
        return null;
    }
}
