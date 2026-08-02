package defpackage;

import com.yandex.go.superapp.print_animation_text.PrintAnimationTextView;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes11.dex */
public abstract class k5a1 {
    public static final Object a = new Object();
    public static char[] b = new char[24];

    public static int a(int i, int i2) {
        return oyr.b(i, i2, 31);
    }

    public static final void b(PrintAnimationTextView printAnimationTextView, u2f0 u2f0Var) {
        printAnimationTextView.setTextSize(u2f0Var.a);
        int i = u2f0Var.b;
        printAnimationTextView.setTextTypeface(i <= 300 ? 1 : i <= 400 ? 0 : i <= 500 ? 3 : i <= 700 ? 5 : 6);
        printAnimationTextView.setLineHeight((int) tje.b0(printAnimationTextView.getContext(), u2f0Var.c));
        printAnimationTextView.setLetterSpacing(u2f0Var.d);
    }

    public static void c(long j, StringBuilder sb) {
        synchronized (a) {
            sb.append(b, 0, d(j));
        }
    }

    public static int d(long j) {
        char c;
        int i;
        int i2;
        int i3;
        if (b.length < 0) {
            b = new char[0];
        }
        char[] cArr = b;
        if (j == 0) {
            cArr[0] = MoneyInputEditView.DEFAULT_VALUE;
            return 1;
        }
        if (j > 0) {
            c = '+';
        } else {
            j = -j;
            c = LicenseUtility.SEPARATOR;
        }
        int i4 = (int) (j % 1000);
        int floor = (int) Math.floor(j / 1000);
        if (floor > 86400) {
            i = floor / 86400;
            floor -= 86400 * i;
        } else {
            i = 0;
        }
        if (floor > 3600) {
            i2 = floor / 3600;
            floor -= i2 * 3600;
        } else {
            i2 = 0;
        }
        if (floor > 60) {
            int i5 = floor / 60;
            floor -= i5 * 60;
            i3 = i5;
        } else {
            i3 = 0;
        }
        cArr[0] = c;
        int f = f(cArr, i, 'd', 1, false, 0);
        int f2 = f(cArr, i2, 'h', f, f != 1, 0);
        int f3 = f(cArr, i3, 'm', f2, f2 != 1, 0);
        int f4 = f(cArr, i4, 'm', f(cArr, floor, 's', f3, f3 != 1, 0), true, 0);
        cArr[f4] = 's';
        return f4 + 1;
    }

    public static Set e() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static int f(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        cArr[i4 + 1] = c;
        return i4 + 2;
    }
}
