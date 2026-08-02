package xsna;

import android.view.inputmethod.HandwritingGesture;

/* compiled from: HandwritingGesture.android.kt */
/* loaded from: classes11.dex */
public final class rtu {
    public static int a(HandwritingGesture handwritingGesture, o440 o440Var) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        o440Var.invoke(new pgg(fallbackText, 1));
        return 5;
    }

    public static void b(long j, us2 us2Var, boolean z, o440 o440Var) {
        if (z) {
            int i = qko0.c;
            int i2 = (int) (j >> 32);
            int i3 = (int) (j & 4294967295L);
            int codePointBefore = i2 > 0 ? Character.codePointBefore(us2Var, i2) : 10;
            int codePointAt = i3 < us2Var.c.length() ? Character.codePointAt(us2Var, i3) : 10;
            if (ttu.i(codePointBefore) && (ttu.h(codePointAt) || ttu.g(codePointAt))) {
                do {
                    i2 -= Character.charCount(codePointBefore);
                    if (i2 == 0) {
                        break;
                    } else {
                        codePointBefore = Character.codePointBefore(us2Var, i2);
                    }
                } while (ttu.i(codePointBefore));
                j = jgz.c(i2, i3);
            } else if (ttu.i(codePointAt) && (ttu.h(codePointBefore) || ttu.g(codePointBefore))) {
                do {
                    i3 += Character.charCount(codePointAt);
                    if (i3 == us2Var.c.length()) {
                        break;
                    } else {
                        codePointAt = Character.codePointAt(us2Var, i3);
                    }
                } while (ttu.i(codePointAt));
                j = jgz.c(i2, i3);
            }
        }
        int i4 = (int) (4294967295L & j);
        o440Var.invoke(new stu(new pzo[]{new bzi0(i4, i4), new ivl(qko0.d(j), 0)}));
    }
}
