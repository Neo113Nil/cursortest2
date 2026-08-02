package com.ybsdk.feature.transfer.version2.internal.screens.common;

import defpackage.eqb1;
import defpackage.evu0;
import defpackage.go01;
import defpackage.gw00;
import defpackage.ho01;
import defpackage.oau;
import defpackage.rza;
import defpackage.scc;
import defpackage.wce;
import defpackage.xce;
import defpackage.yw01;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes3.dex */
public final class a {
    public static final Map d = b.i(new Pair('a', (char) 1072), new Pair('c', (char) 1089), new Pair('e', (char) 1077), new Pair('o', (char) 1086), new Pair('p', (char) 1088), new Pair('x', (char) 1093), new Pair('y', (char) 1091));
    public static final LinkedHashMap e;
    public final ho01 a;
    public final List b;
    public final List c;

    static {
        List g = scc.g("йцукенгшщзхъ", "фывапролджэ", "ячсмитьбю");
        List g2 = scc.g("qwertyuiop", "asdfghjkl", "zxcvbnm");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : eqb1.f(g).entrySet()) {
            Character ch = (Character) entry.getKey();
            ch.getClass();
            Set set = (Set) entry.getValue();
            Object obj = linkedHashMap.get(ch);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(ch, obj);
            }
            ((Set) obj).addAll(set);
        }
        for (Map.Entry entry2 : eqb1.f(g2).entrySet()) {
            Character ch2 = (Character) entry2.getKey();
            ch2.getClass();
            Set set2 = (Set) entry2.getValue();
            Object obj2 = linkedHashMap.get(ch2);
            if (obj2 == null) {
                obj2 = new LinkedHashSet();
                linkedHashMap.put(ch2, obj2);
            }
            ((Set) obj2).addAll(set2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), kotlin.collections.a.N0((Iterable) entry3.getValue()));
        }
        e = linkedHashMap2;
    }

    public a(ho01 ho01Var) {
        this.a = ho01Var;
        this.b = kotlin.collections.a.x0(ho01Var.b.b, new wce());
        this.c = kotlin.collections.a.x0(ho01Var.c.b, new xce());
    }

    public static List d(String str) {
        return kotlin.sequences.b.s(kotlin.sequences.b.g(new yw01(evu0.O(str, new char[]{HexString.CHAR_SPACE}, 0), new oau(5, str)), ContactsFuzzySearch$splitNameTokens$1.b));
    }

    public final int a(int i) {
        List<go01> list = this.b;
        if (list.isEmpty()) {
            return 0;
        }
        go01 go01Var = (go01) kotlin.collections.a.P(list);
        for (go01 go01Var2 : list) {
            if (i < go01Var2.a) {
                break;
            }
            go01Var = go01Var2;
        }
        return go01Var.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c4, code lost:
    
        if (r1 <= r33) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0193, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0117, code lost:
    
        if (r1.contains(java.lang.Character.valueOf(r7)) == true) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ee A[LOOP:1: B:19:0x0036->B:35:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer b(int i, String str, String str2) {
        boolean z;
        String str3;
        String str4;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Integer num;
        int i8;
        int i9;
        Integer num2;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (str.length() == 0 || str2.length() == 0) {
            return null;
        }
        int length = str.length() - i;
        boolean z2 = true;
        if (length < 1) {
            length = 1;
        }
        int length2 = str.length() + i;
        int length3 = str2.length();
        if (length2 > length3) {
            length2 = length3;
        }
        if (length > length2 || length > length2) {
            return null;
        }
        Integer num3 = null;
        while (true) {
            int length4 = str2.length() - length;
            if (length4 >= 0) {
                int i15 = 0;
                while (true) {
                    int length5 = str.length();
                    if (length5 == 0) {
                        num2 = Integer.valueOf(length);
                        if (length <= i) {
                            i6 = length;
                            i7 = length2;
                            num = num3;
                            i8 = length4;
                            i9 = i15;
                            i5 = 0;
                            z = z2;
                            if (num2 == null) {
                                num3 = (num == null || num2.intValue() < num.intValue()) ? num2 : num;
                                if (num3.intValue() == 0) {
                                    return Integer.valueOf(i5);
                                }
                            } else {
                                num3 = num;
                            }
                            length4 = i8;
                            i14 = i9;
                            if (i14 != length4) {
                                length = i6;
                                length2 = i7;
                                break;
                            }
                            z2 = z;
                            length2 = i7;
                            i15 = i14 + 1;
                            length = i6;
                        }
                        i6 = length;
                        i7 = length2;
                        num = num3;
                        i8 = length4;
                        i9 = i15;
                        num2 = null;
                        i5 = 0;
                        z = z2;
                        if (num2 == null) {
                        }
                        length4 = i8;
                        i14 = i9;
                        if (i14 != length4) {
                        }
                    } else {
                        if (length == 0) {
                            Integer valueOf = Integer.valueOf(length5);
                            if (length5 <= i) {
                                i6 = length;
                                i7 = length2;
                                num = num3;
                                i8 = length4;
                                i9 = i15;
                                num2 = valueOf;
                                i5 = 0;
                                z = z2;
                                if (num2 == null) {
                                }
                                length4 = i8;
                                i14 = i9;
                                if (i14 != length4) {
                                }
                            }
                        } else if (Math.abs(length5 - length) <= i) {
                            if (length5 >= length) {
                                str4 = str;
                                str3 = str2;
                                i4 = i15;
                                i2 = length5;
                                i3 = 0;
                                length5 = length;
                            } else {
                                str3 = str;
                                str4 = str2;
                                i2 = length;
                                i3 = i15;
                                i4 = 0;
                            }
                            int i16 = length5 + 1;
                            int[] iArr2 = new int[i16];
                            i5 = 0;
                            int[] iArr3 = new int[i16];
                            for (int i17 = 0; i17 < i16; i17++) {
                                iArr3[i17] = i17;
                            }
                            int[] iArr4 = new int[i16];
                            int i18 = 1;
                            if (1 <= i2) {
                                while (true) {
                                    iArr4[0] = i18;
                                    int i19 = i3 + i18;
                                    int[] iArr5 = iArr2;
                                    char charAt = str4.charAt(i19 - 1);
                                    int[] iArr6 = iArr4;
                                    int i20 = 1;
                                    if (1 <= length5) {
                                        num = num3;
                                        i12 = i18;
                                        while (true) {
                                            int i21 = i4 + i20;
                                            iArr = iArr3;
                                            char charAt2 = str3.charAt(i21 - 1);
                                            i10 = i3;
                                            int i22 = iArr[i20] + 1;
                                            int i23 = i20 - 1;
                                            i11 = i4;
                                            int i24 = iArr6[i23] + 1;
                                            int i25 = iArr[i23];
                                            i6 = length;
                                            i7 = length2;
                                            ho01 ho01Var = this.a;
                                            if (charAt == charAt2) {
                                                i8 = length4;
                                                i9 = i15;
                                                i13 = 0;
                                            } else if (Character.isDigit(charAt) && Character.isDigit(charAt2)) {
                                                i13 = ho01Var.d.c;
                                                i8 = length4;
                                                i9 = i15;
                                            } else {
                                                Character valueOf2 = Character.valueOf(charAt);
                                                i8 = length4;
                                                LinkedHashMap linkedHashMap = e;
                                                Set set = (Set) linkedHashMap.get(valueOf2);
                                                i9 = i15;
                                                boolean z3 = set != null ? true : true;
                                                Set set2 = (Set) linkedHashMap.get(Character.valueOf(charAt2));
                                                if (set2 == null || set2.contains(Character.valueOf(charAt)) != z3) {
                                                    i13 = ho01Var.d.b;
                                                }
                                                i13 = ho01Var.d.a;
                                            }
                                            int min = Math.min(i22, Math.min(i24, i25 + i13));
                                            z = true;
                                            if (i18 > 1 && i20 > 1) {
                                                char charAt3 = str4.charAt(i19 - 2);
                                                if (charAt == str3.charAt(i21 - 2) && charAt3 == charAt2) {
                                                    min = Math.min(min, iArr5[i20 - 2] + ho01Var.e);
                                                }
                                            }
                                            iArr6[i20] = min;
                                            if (min < i12) {
                                                i12 = min;
                                            }
                                            if (i20 == length5) {
                                                break;
                                            }
                                            i20++;
                                            iArr3 = iArr;
                                            i3 = i10;
                                            length = i6;
                                            i4 = i11;
                                            length2 = i7;
                                            length4 = i8;
                                            i15 = i9;
                                        }
                                    } else {
                                        i6 = length;
                                        i7 = length2;
                                        num = num3;
                                        i8 = length4;
                                        iArr = iArr3;
                                        i9 = i15;
                                        i10 = i3;
                                        i11 = i4;
                                        z = true;
                                        i12 = i18;
                                    }
                                    if (i12 > i) {
                                        break;
                                    }
                                    if (i18 == i2) {
                                        iArr3 = iArr6;
                                        break;
                                    }
                                    i18++;
                                    iArr4 = iArr5;
                                    iArr3 = iArr6;
                                    num3 = num;
                                    iArr2 = iArr;
                                    i3 = i10;
                                    length = i6;
                                    i4 = i11;
                                    length2 = i7;
                                    length4 = i8;
                                    i15 = i9;
                                }
                            } else {
                                i6 = length;
                                i7 = length2;
                                num = num3;
                                i8 = length4;
                                i9 = i15;
                                z = true;
                            }
                            int i26 = iArr3[length5];
                            num2 = Integer.valueOf(i26);
                        }
                        i6 = length;
                        i7 = length2;
                        num = num3;
                        i8 = length4;
                        i9 = i15;
                        num2 = null;
                        i5 = 0;
                        z = z2;
                        if (num2 == null) {
                        }
                        length4 = i8;
                        i14 = i9;
                        if (i14 != length4) {
                        }
                    }
                }
            } else {
                z = z2;
            }
            if (length == length2) {
                return num3;
            }
            length++;
            z2 = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        if (r5 == ' ') goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c(String str, boolean z) {
        Character ch;
        StringBuilder sb = new StringBuilder(str.length());
        boolean z2 = true;
        for (int i = 0; i < str.length(); i++) {
            char lowerCase = Character.toLowerCase(str.charAt(i));
            Character valueOf = Character.valueOf(HexString.CHAR_SPACE);
            if (!z || (lowerCase != 1100 && lowerCase != 1098)) {
                if (!rza.b(lowerCase)) {
                    if (lowerCase == 1098) {
                        valueOf = (char) 1100;
                    } else {
                        if (lowerCase == 1081) {
                            lowerCase = 1080;
                        } else if (lowerCase == 1105) {
                            lowerCase = 1077;
                        }
                        if (this.a.d.d && (ch = (Character) d.get(Character.valueOf(lowerCase))) != null) {
                            lowerCase = ch.charValue();
                        }
                        if (Character.isLetterOrDigit(lowerCase)) {
                            valueOf = Character.valueOf(lowerCase);
                        }
                    }
                }
                if (valueOf != null) {
                    char charValue = valueOf.charValue();
                    if (charValue == ' ') {
                        if (!z2) {
                            sb.append(HexString.CHAR_SPACE);
                        }
                        z2 = true;
                    } else {
                        sb.append(charValue);
                        z2 = false;
                    }
                }
            }
            valueOf = null;
            if (valueOf != null) {
            }
        }
        return evu0.k0(sb.toString()).toString();
    }
}
