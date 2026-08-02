package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class dw01 {
    public static final dw01[] d = {new dw01("", 0, ""), new dw01("", 0, " "), new dw01(" ", 0, " "), new dw01("", 12, ""), new dw01("", 10, " "), new dw01("", 0, " the "), new dw01(" ", 0, ""), new dw01("s ", 0, " "), new dw01("", 0, " of "), new dw01("", 10, ""), new dw01("", 0, " and "), new dw01("", 13, ""), new dw01("", 1, ""), new dw01(Extension.FIX_SPACE, 0, " "), new dw01("", 0, Extension.FIX_SPACE), new dw01(" ", 10, " "), new dw01("", 0, " in "), new dw01("", 0, " to "), new dw01("e ", 0, " "), new dw01("", 0, "\""), new dw01("", 0, Extension.DOT_CHAR), new dw01("", 0, "\">"), new dw01("", 0, "\n"), new dw01("", 3, ""), new dw01("", 0, "]"), new dw01("", 0, " for "), new dw01("", 14, ""), new dw01("", 2, ""), new dw01("", 0, " a "), new dw01("", 0, " that "), new dw01(" ", 10, ""), new dw01("", 0, ". "), new dw01(Extension.DOT_CHAR, 0, ""), new dw01(" ", 0, Extension.FIX_SPACE), new dw01("", 15, ""), new dw01("", 0, " with "), new dw01("", 0, "'"), new dw01("", 0, " from "), new dw01("", 0, " by "), new dw01("", 16, ""), new dw01("", 17, ""), new dw01(" the ", 0, ""), new dw01("", 4, ""), new dw01("", 0, ". The "), new dw01("", 11, ""), new dw01("", 0, " on "), new dw01("", 0, " as "), new dw01("", 0, " is "), new dw01("", 7, ""), new dw01("", 1, "ing "), new dw01("", 0, "\n\t"), new dw01("", 0, ":"), new dw01(" ", 0, ". "), new dw01("", 0, "ed "), new dw01("", 20, ""), new dw01("", 18, ""), new dw01("", 6, ""), new dw01("", 0, Extension.O_BRAKE), new dw01("", 10, Extension.FIX_SPACE), new dw01("", 8, ""), new dw01("", 0, " at "), new dw01("", 0, "ly "), new dw01(" the ", 0, " of "), new dw01("", 5, ""), new dw01("", 9, ""), new dw01(" ", 10, Extension.FIX_SPACE), new dw01("", 10, "\""), new dw01(Extension.DOT_CHAR, 0, Extension.O_BRAKE), new dw01("", 11, " "), new dw01("", 10, "\">"), new dw01("", 0, "=\""), new dw01(" ", 0, Extension.DOT_CHAR), new dw01(".com/", 0, ""), new dw01(" the ", 0, " of the "), new dw01("", 10, "'"), new dw01("", 0, ". This "), new dw01("", 0, ","), new dw01(Extension.DOT_CHAR, 0, " "), new dw01("", 10, Extension.O_BRAKE), new dw01("", 10, Extension.DOT_CHAR), new dw01("", 0, " not "), new dw01(" ", 0, "=\""), new dw01("", 0, "er "), new dw01(" ", 11, " "), new dw01("", 0, "al "), new dw01(" ", 11, ""), new dw01("", 0, "='"), new dw01("", 11, "\""), new dw01("", 10, ". "), new dw01(" ", 0, Extension.O_BRAKE), new dw01("", 0, "ful "), new dw01(" ", 10, ". "), new dw01("", 0, "ive "), new dw01("", 0, "less "), new dw01("", 11, "'"), new dw01("", 0, "est "), new dw01(" ", 10, Extension.DOT_CHAR), new dw01("", 11, "\">"), new dw01(" ", 0, "='"), new dw01("", 10, ","), new dw01("", 0, "ize "), new dw01("", 11, Extension.DOT_CHAR), new dw01("Â ", 0, ""), new dw01(" ", 0, ","), new dw01("", 10, "=\""), new dw01("", 11, "=\""), new dw01("", 0, "ous "), new dw01("", 11, Extension.FIX_SPACE), new dw01("", 10, "='"), new dw01(" ", 10, ","), new dw01(" ", 11, "=\""), new dw01(" ", 11, Extension.FIX_SPACE), new dw01("", 11, ","), new dw01("", 11, Extension.O_BRAKE), new dw01("", 11, ". "), new dw01(" ", 11, Extension.DOT_CHAR), new dw01("", 11, "='"), new dw01(" ", 11, ". "), new dw01(" ", 10, "=\""), new dw01(" ", 11, "='"), new dw01(" ", 10, "='")};
    public final byte[] a;
    public final int b;
    public final byte[] c;

    public dw01(String str, int i, String str2) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) str.charAt(i2);
        }
        this.a = bArr;
        this.b = i;
        int length2 = str2.length();
        byte[] bArr2 = new byte[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            bArr2[i3] = (byte) str2.charAt(i3);
        }
        this.c = bArr2;
    }
}
