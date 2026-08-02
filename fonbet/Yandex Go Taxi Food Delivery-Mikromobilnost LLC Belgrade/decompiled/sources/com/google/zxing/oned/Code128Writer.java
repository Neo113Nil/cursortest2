package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.w8c;
import defpackage.y170;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes11.dex */
public final class Code128Writer extends y170 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CType {
        private static final /* synthetic */ CType[] $VALUES;
        public static final CType FNC_1;
        public static final CType ONE_DIGIT;
        public static final CType TWO_DIGITS;
        public static final CType UNCODABLE;

        static {
            CType cType = new CType("UNCODABLE", 0);
            UNCODABLE = cType;
            CType cType2 = new CType("ONE_DIGIT", 1);
            ONE_DIGIT = cType2;
            CType cType3 = new CType("TWO_DIGITS", 2);
            TWO_DIGITS = cType3;
            CType cType4 = new CType("FNC_1", 3);
            FNC_1 = cType4;
            $VALUES = new CType[]{cType, cType2, cType3, cType4};
        }

        public static CType valueOf(String str) {
            return (CType) Enum.valueOf(CType.class, str);
        }

        public static CType[] values() {
            return (CType[]) $VALUES.clone();
        }
    }

    public static CType h(int i, String str) {
        int length = str.length();
        if (i >= length) {
            return CType.UNCODABLE;
        }
        char charAt = str.charAt(i);
        if (charAt == 241) {
            return CType.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return CType.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return CType.ONE_DIGIT;
        }
        char charAt2 = str.charAt(i2);
        return (charAt2 < '0' || charAt2 > '9') ? CType.ONE_DIGIT : CType.TWO_DIGITS;
    }

    public static boolean[] i(int i, ArrayList arrayList) {
        int i2 = i % 103;
        if (i2 < 0) {
            ny61.g("Unable to compute a valid input checksum");
            return null;
        }
        int[][] iArr = w8c.a;
        arrayList.add(iArr[i2]);
        arrayList.add(iArr[106]);
        Iterator it = arrayList.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            for (int i5 : (int[]) it.next()) {
                i4 += i5;
            }
        }
        boolean[] zArr = new boolean[i4];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            i3 += y170.b(zArr, i3, (int[]) it2.next(), true);
        }
        return zArr;
    }

    @Override // defpackage.y170
    public final boolean[] d(String str) {
        return e(str, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0238, code lost:
    
        if (r4 > 244) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x026d, code lost:
    
        if (h(r5 + 3, r23) == com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x026f, code lost:
    
        r2 = 99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0281, code lost:
    
        if (r4 == com.google.zxing.oned.Code128Writer.CType.ONE_DIGIT) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0290, code lost:
    
        if (r14 == com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS) goto L176;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0197  */
    @Override // defpackage.y170
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean[] e(String str, Map map) {
        int i;
        int length;
        int i2;
        boolean[] zArr;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        CType h;
        Code128Writer$MinimalEncoder$Charset code128Writer$MinimalEncoder$Charset;
        int i7;
        char charAt;
        boolean z2;
        boolean[] zArr2 = null;
        int i8 = 2;
        boolean z3 = true;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.FORCE_CODE_SET;
            if (map.containsKey(encodeHintType)) {
                String obj = map.get(encodeHintType).toString();
                obj.getClass();
                switch (obj.hashCode()) {
                    case 65:
                        if (obj.equals("A")) {
                            z2 = false;
                            break;
                        }
                        z2 = -1;
                        break;
                    case 66:
                        if (obj.equals("B")) {
                            z2 = true;
                            break;
                        }
                        z2 = -1;
                        break;
                    case 67:
                        if (obj.equals(CA20Status.STATUS_REQUEST_C)) {
                            z2 = 2;
                            break;
                        }
                        z2 = -1;
                        break;
                    default:
                        z2 = -1;
                        break;
                }
                switch (z2) {
                    case false:
                        i = 101;
                        break;
                    case true:
                        i = 100;
                        break;
                    case true:
                        i = 99;
                        break;
                    default:
                        ny61.g("Unsupported code set hint: ".concat(obj));
                        return null;
                }
                length = str.length();
                i2 = 0;
                while (true) {
                    char c = HexString.CHAR_SPACE;
                    if (i2 < length) {
                        if (map != null) {
                            EncodeHintType encodeHintType2 = EncodeHintType.CODE128_COMPACT;
                            if (map.containsKey(encodeHintType2) && Boolean.parseBoolean(map.get(encodeHintType2).toString())) {
                                b bVar = new b();
                                bVar.a = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 4, str.length());
                                bVar.b = (Code128Writer$MinimalEncoder$Latch[][]) Array.newInstance((Class<?>) Code128Writer$MinimalEncoder$Latch.class, 4, str.length());
                                Code128Writer$MinimalEncoder$Charset code128Writer$MinimalEncoder$Charset2 = Code128Writer$MinimalEncoder$Charset.NONE;
                                bVar.c(str, code128Writer$MinimalEncoder$Charset2, 0);
                                ArrayList arrayList = new ArrayList();
                                int[] iArr = {0};
                                int[] iArr2 = {1};
                                int length2 = str.length();
                                int i9 = 0;
                                while (i9 < length2) {
                                    char c2 = c;
                                    Code128Writer$MinimalEncoder$Latch code128Writer$MinimalEncoder$Latch = bVar.b[code128Writer$MinimalEncoder$Charset2.ordinal()][i9];
                                    int i10 = a.a[code128Writer$MinimalEncoder$Latch.ordinal()];
                                    if (i10 == 1) {
                                        code128Writer$MinimalEncoder$Charset = Code128Writer$MinimalEncoder$Charset.A;
                                        b.a(arrayList, i9 == 0 ? 103 : 101, iArr, iArr2, i9);
                                    } else if (i10 == i8) {
                                        code128Writer$MinimalEncoder$Charset = Code128Writer$MinimalEncoder$Charset.B;
                                        b.a(arrayList, i9 == 0 ? 104 : 100, iArr, iArr2, i9);
                                    } else if (i10 != 3) {
                                        if (i10 == 4) {
                                            b.a(arrayList, 98, iArr, iArr2, i9);
                                        }
                                        if (code128Writer$MinimalEncoder$Charset2 == Code128Writer$MinimalEncoder$Charset.C) {
                                            switch (str.charAt(i9)) {
                                                case 241:
                                                    i7 = 102;
                                                    break;
                                                case 242:
                                                    i7 = 97;
                                                    break;
                                                case 243:
                                                    i7 = 96;
                                                    break;
                                                case 244:
                                                    if ((code128Writer$MinimalEncoder$Charset2 == Code128Writer$MinimalEncoder$Charset.A && code128Writer$MinimalEncoder$Latch != Code128Writer$MinimalEncoder$Latch.SHIFT) || (code128Writer$MinimalEncoder$Charset2 == Code128Writer$MinimalEncoder$Charset.B && code128Writer$MinimalEncoder$Latch == Code128Writer$MinimalEncoder$Latch.SHIFT)) {
                                                        i7 = 101;
                                                        break;
                                                    } else {
                                                        i7 = 100;
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    i7 = str.charAt(i9) - ' ';
                                                    break;
                                            }
                                            if (((code128Writer$MinimalEncoder$Charset2 == Code128Writer$MinimalEncoder$Charset.A && code128Writer$MinimalEncoder$Latch != Code128Writer$MinimalEncoder$Latch.SHIFT) || (code128Writer$MinimalEncoder$Charset2 == Code128Writer$MinimalEncoder$Charset.B && code128Writer$MinimalEncoder$Latch == Code128Writer$MinimalEncoder$Latch.SHIFT)) && i7 < 0) {
                                                i7 += 96;
                                            }
                                            b.a(arrayList, i7, iArr, iArr2, i9);
                                        } else if (str.charAt(i9) == 241) {
                                            b.a(arrayList, 102, iArr, iArr2, i9);
                                        } else {
                                            b.a(arrayList, Integer.parseInt(str.substring(i9, i9 + 2)), iArr, iArr2, i9);
                                            int i11 = i9 + 1;
                                            if (i11 < length2) {
                                                i9 = i11;
                                            }
                                        }
                                        i9++;
                                        c = c2;
                                        i8 = 2;
                                    } else {
                                        code128Writer$MinimalEncoder$Charset = Code128Writer$MinimalEncoder$Charset.C;
                                        b.a(arrayList, i9 == 0 ? 105 : 99, iArr, iArr2, i9);
                                    }
                                    code128Writer$MinimalEncoder$Charset2 = code128Writer$MinimalEncoder$Charset;
                                    if (code128Writer$MinimalEncoder$Charset2 == Code128Writer$MinimalEncoder$Charset.C) {
                                    }
                                    i9++;
                                    c = c2;
                                    i8 = 2;
                                }
                                bVar.a = null;
                                bVar.b = null;
                                return i(iArr[0], arrayList);
                            }
                        }
                        char c3 = ' ';
                        int length3 = str.length();
                        ArrayList arrayList2 = new ArrayList();
                        int i12 = 1;
                        int i13 = 0;
                        int i14 = 0;
                        int i15 = 0;
                        while (i13 < length3) {
                            if (i == -1) {
                                CType h2 = h(i13, str);
                                CType cType = CType.ONE_DIGIT;
                                if (h2 == cType) {
                                    zArr = zArr2;
                                    i3 = 101;
                                    if (i15 == 101) {
                                        z = z3;
                                    } else {
                                        z = z3;
                                        i3 = 100;
                                    }
                                } else {
                                    zArr = zArr2;
                                    z = z3;
                                    CType cType2 = CType.UNCODABLE;
                                    if (h2 == cType2) {
                                        if (i13 < str.length()) {
                                            char charAt2 = str.charAt(i13);
                                            if (charAt2 >= c3) {
                                                if (i15 == 101) {
                                                    if (charAt2 >= '`') {
                                                        if (charAt2 >= 241) {
                                                        }
                                                        i3 = 100;
                                                    }
                                                }
                                            }
                                            i3 = 101;
                                        }
                                        i3 = 100;
                                    } else {
                                        if (i15 != 101 || h2 != CType.FNC_1) {
                                            i3 = 99;
                                            if (i15 != 99) {
                                                if (i15 == 100) {
                                                    CType cType3 = CType.FNC_1;
                                                    if (h2 != cType3 && (h = h(i13 + 2, str)) != cType2 && h != cType) {
                                                        if (h != cType3) {
                                                            int i16 = i13 + 4;
                                                            while (true) {
                                                                CType h3 = h(i16, str);
                                                                if (h3 == CType.TWO_DIGITS) {
                                                                    i16 += 2;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i3 = 100;
                                                } else if (h2 == CType.FNC_1) {
                                                    h2 = h(i13 + 1, str);
                                                }
                                            }
                                        }
                                        i3 = 101;
                                    }
                                }
                            } else {
                                zArr = zArr2;
                                z = z3;
                                i3 = i;
                            }
                            if (i3 == i15) {
                                switch (str.charAt(i13)) {
                                    case 241:
                                        c3 = HexString.CHAR_SPACE;
                                        i5 = 102;
                                        break;
                                    case 242:
                                        c3 = HexString.CHAR_SPACE;
                                        i5 = 97;
                                        break;
                                    case 243:
                                        c3 = HexString.CHAR_SPACE;
                                        i5 = 96;
                                        break;
                                    case 244:
                                        c3 = HexString.CHAR_SPACE;
                                        if (i15 != 101) {
                                            i5 = 100;
                                            break;
                                        } else {
                                            i5 = 101;
                                            break;
                                        }
                                    default:
                                        if (i15 == 100) {
                                            char charAt3 = str.charAt(i13);
                                            c3 = HexString.CHAR_SPACE;
                                            i5 = charAt3 - ' ';
                                            break;
                                        } else {
                                            if (i15 == 101) {
                                                char charAt4 = str.charAt(i13);
                                                i6 = charAt4 - ' ';
                                                if (i6 < 0) {
                                                    i5 = charAt4 + '@';
                                                    c3 = HexString.CHAR_SPACE;
                                                    break;
                                                }
                                            } else {
                                                int i17 = i13 + 1;
                                                if (i17 == length3) {
                                                    ny61.g("Bad number of characters for digit only encoding.");
                                                    return zArr;
                                                }
                                                i6 = Integer.parseInt(str.substring(i13, i13 + 2));
                                                i13 = i17;
                                            }
                                            i5 = i6;
                                            c3 = HexString.CHAR_SPACE;
                                        }
                                }
                                i13++;
                                i4 = i15;
                            } else {
                                c3 = HexString.CHAR_SPACE;
                                i4 = i3;
                                i5 = i15 == 0 ? i3 != 100 ? i3 != 101 ? 105 : 103 : 104 : i3;
                            }
                            arrayList2.add(w8c.a[i5]);
                            i14 += i5 * i12;
                            if (i13 != 0) {
                                i12++;
                            }
                            i15 = i4;
                            zArr2 = zArr;
                            z3 = z;
                        }
                        return i(i14, arrayList2);
                    }
                    charAt = str.charAt(i2);
                    switch (charAt) {
                        case 241:
                        case 242:
                        case 243:
                        case 244:
                            break;
                        default:
                            if (charAt > 127) {
                                ny61.g(oyr.i(charAt, "Bad character in input: ASCII value="));
                                return null;
                            }
                            break;
                    }
                    switch (i) {
                        case 99:
                            if (charAt >= '0' && ((charAt <= '9' || charAt > 127) && charAt != 242 && charAt != 243 && charAt != 244)) {
                                break;
                            }
                            break;
                        case 100:
                            if (charAt < ' ') {
                                ny61.g(oyr.i(charAt, "Bad character in input for forced code set B: ASCII value="));
                                return null;
                            }
                            break;
                        case 101:
                            if (charAt > '_' && charAt <= 127) {
                                ny61.g(oyr.i(charAt, "Bad character in input for forced code set A: ASCII value="));
                                return null;
                            }
                            break;
                    }
                    i2++;
                }
                ny61.g(oyr.i(charAt, "Bad character in input for forced code set C: ASCII value="));
                return null;
            }
        }
        i = -1;
        length = str.length();
        i2 = 0;
        while (true) {
            char c4 = HexString.CHAR_SPACE;
            if (i2 < length) {
            }
            i2++;
        }
        ny61.g(oyr.i(charAt, "Bad character in input for forced code set C: ASCII value="));
        return null;
    }

    @Override // defpackage.y170
    public final Collection g() {
        return Collections.singleton(BarcodeFormat.CODE_128);
    }
}
