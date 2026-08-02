package xsna;

/* compiled from: LpTextParser.kt */
/* loaded from: classes2.dex */
public final class h900 {
    public static final String a = System.getProperty("line.separator");

    public static String a(String str) {
        int i;
        int i2;
        char c;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        String str2 = str;
        char c2 = '&';
        if (str2.indexOf(38) >= 0) {
            char[] cArr = ohv.a;
            nhv nhvVar = nhv.e;
            int length = str2.length();
            StringBuilder sb = null;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < length) {
                char charAt = str2.charAt(i8);
                if (charAt == c2 && (i2 = i8 + 1) < length) {
                    if (charAt == c2) {
                        char charAt2 = str2.charAt(i2);
                        if (charAt2 != ' ') {
                            char c3 = '\n';
                            if (charAt2 != '\n' && charAt2 != '\t' && charAt2 != '\f' && charAt2 != '<' && charAt2 != c2) {
                                c = 0;
                                int i11 = 1;
                                if (charAt2 == '#') {
                                    int i12 = i8 + 2;
                                    if (i12 < length) {
                                        char charAt3 = str2.charAt(i12);
                                        if ((charAt3 == 'x' || charAt3 == 'X') && (i7 = i8 + 3) < length) {
                                            int i13 = i7;
                                            while (i13 < length) {
                                                char charAt4 = str2.charAt(i13);
                                                if ((charAt4 < '0' || charAt4 > '9') && ((charAt4 < 'A' || charAt4 > 'F') && (charAt4 < 'a' || charAt4 > 'f'))) {
                                                    break;
                                                }
                                                i13++;
                                            }
                                            if (i13 - i7 > 0) {
                                                int a2 = ohv.a(i7, i13, 16, str2);
                                                int i14 = i13 - 1;
                                                if (i13 >= length || str2.charAt(i13) != ';') {
                                                    i13 = i14;
                                                }
                                                i3 = ohv.b(a2);
                                                i10 = i13;
                                            }
                                        } else if (charAt3 >= '0' && charAt3 <= '9') {
                                            int i15 = i12;
                                            while (i15 < length) {
                                                char charAt5 = str2.charAt(i15);
                                                if (charAt5 < '0' || charAt5 > '9') {
                                                    break;
                                                }
                                                i15++;
                                            }
                                            if (i15 - i12 > 0) {
                                                int a3 = ohv.a(i12, i15, 10, str2);
                                                int i16 = i15 - 1;
                                                if (i15 >= length || str2.charAt(i15) != ';') {
                                                    i15 = i16;
                                                }
                                                i3 = ohv.b(a3);
                                                i10 = i15;
                                            }
                                        }
                                    }
                                    i = i10;
                                    i10 = i;
                                    i8++;
                                    c2 = '&';
                                } else {
                                    int i17 = i2;
                                    while (i17 < length) {
                                        char charAt6 = str2.charAt(i17);
                                        char c4 = c3;
                                        if ((charAt6 < 'a' || charAt6 > 'z') && ((charAt6 < 'A' || charAt6 > 'Z') && (charAt6 < '0' || charAt6 > '9'))) {
                                            break;
                                        }
                                        i17++;
                                        c3 = c4;
                                    }
                                    if (i17 - i2 > 0) {
                                        if (i17 < length && str2.charAt(i17) == ';') {
                                            i17++;
                                        }
                                        char[][] cArr2 = nhvVar.b;
                                        int[] iArr2 = nhvVar.c;
                                        int length2 = cArr2.length - 1;
                                        int i18 = 0;
                                        int i19 = Integer.MIN_VALUE;
                                        int i20 = Integer.MIN_VALUE;
                                        while (true) {
                                            if (i18 <= length2) {
                                                int i21 = (i18 + length2) >>> 1;
                                                char[] cArr3 = cArr2[i21];
                                                int i22 = i17 - i8;
                                                char[][] cArr4 = cArr2;
                                                int min = Math.min(cArr3.length, i22);
                                                iArr = iArr2;
                                                int i23 = i11;
                                                while (true) {
                                                    if (i23 < min) {
                                                        int i24 = min;
                                                        char charAt7 = str2.charAt(i8 + i23);
                                                        i = i10;
                                                        char c5 = cArr3[i23];
                                                        if (c5 < charAt7) {
                                                            i6 = -1;
                                                            break;
                                                        }
                                                        if (c5 > charAt7) {
                                                            break;
                                                        }
                                                        i23++;
                                                        min = i24;
                                                        i10 = i;
                                                    } else {
                                                        i = i10;
                                                        if (cArr3.length <= i23) {
                                                            i6 = i22 > i23 ? -((i22 - i23) + 10) : 0;
                                                        }
                                                    }
                                                }
                                                i6 = i11;
                                                if (i6 != -1) {
                                                    if (i6 != i11) {
                                                        if (i6 >= -10) {
                                                            i4 = Integer.MIN_VALUE;
                                                            i5 = i21;
                                                            break;
                                                        }
                                                        i18 = i21 + 1;
                                                        if (i19 == Integer.MIN_VALUE || i20 < i6) {
                                                            i20 = i6;
                                                            i19 = i21;
                                                        }
                                                        cArr2 = cArr4;
                                                        iArr2 = iArr;
                                                        i10 = i;
                                                        i11 = 1;
                                                    } else {
                                                        length2 = i21 - 1;
                                                    }
                                                } else {
                                                    i18 = i21 + 1;
                                                }
                                                cArr2 = cArr4;
                                                iArr2 = iArr;
                                                i10 = i;
                                                i11 = 1;
                                            } else {
                                                iArr = iArr2;
                                                i = i10;
                                                i4 = Integer.MIN_VALUE;
                                                i5 = i19 != Integer.MIN_VALUE ? (i19 + 10) * (-1) : Integer.MIN_VALUE;
                                            }
                                        }
                                        if (i5 >= 0) {
                                            i3 = iArr[i5];
                                        } else {
                                            if (i5 != i4) {
                                                if (i5 >= -10) {
                                                    throw new RuntimeException(lhg.a(i5, "Invalid unescape codepoint after search: "));
                                                }
                                                int i25 = (i5 + 10) * (-1);
                                                char[] cArr5 = nhvVar.b[i25];
                                                i3 = iArr[i25];
                                                i17 -= (i17 - i8) - cArr5.length;
                                            }
                                            i10 = i;
                                            i8++;
                                            c2 = '&';
                                        }
                                        i10 = i17 - 1;
                                    }
                                    i = i10;
                                    i10 = i;
                                    i8++;
                                    c2 = '&';
                                }
                            }
                        }
                    } else {
                        c = 0;
                        i3 = 0;
                    }
                    if (sb == null) {
                        sb = new StringBuilder(length + 5);
                    }
                    if (i8 - i9 > 0) {
                        sb.append((CharSequence) str2, i9, i8);
                    }
                    i9 = i10 + 1;
                    if (i3 > 65535) {
                        sb.append(Character.toChars(i3));
                    } else if (i3 < 0) {
                        int[] iArr3 = nhvVar.d[(i3 * (-1)) - 1];
                        int i26 = iArr3[c];
                        if (i26 > 65535) {
                            sb.append(Character.toChars(i26));
                        } else {
                            sb.append((char) i26);
                        }
                        int i27 = iArr3[1];
                        if (i27 > 65535) {
                            sb.append(Character.toChars(i27));
                        } else {
                            sb.append((char) i27);
                        }
                    } else {
                        sb.append((char) i3);
                    }
                    i8 = i10;
                    i8++;
                    c2 = '&';
                }
                i = i10;
                i10 = i;
                i8++;
                c2 = '&';
            }
            if (sb != null) {
                if (length - i9 > 0) {
                    sb.append((CharSequence) str2, i9, length);
                }
                str2 = sb.toString();
            }
        }
        return brm0.y(str2, "<br>", a);
    }
}
