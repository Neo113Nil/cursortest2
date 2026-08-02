package defpackage;

import com.google.zxing.FormatException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class fr11 extends x170 {
    public static final int[] a = {1, 1, 1};
    public static final int[] b = {1, 1, 1, 1, 1};
    public static final int[] c = {1, 1, 1, 1, 1, 1};
    public static final int[][] d;
    public static final int[][] e;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        d = iArr;
        int[][] iArr2 = new int[20][];
        e = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = d[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            e[i] = iArr4;
        }
    }

    public fr11() {
        new ArrayList();
        new ArrayList();
    }

    public static boolean a(String str) {
        int length = str.length();
        if (length != 0) {
            int i = length - 1;
            if (b(str.subSequence(0, i)) == Character.digit(str.charAt(i), 10)) {
                return true;
            }
        }
        return false;
    }

    public static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.a();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }
}
