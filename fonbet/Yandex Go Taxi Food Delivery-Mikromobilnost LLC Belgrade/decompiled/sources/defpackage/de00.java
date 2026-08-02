package defpackage;

import android.util.Log;
import mango.android.MangoAndroidThrowable;

/* loaded from: classes9.dex */
public abstract class de00 implements ke00 {
    @Override // defpackage.ke00
    public final void a(int i, String str, Throwable th, String str2, fe00 fe00Var) {
        int min;
        int c = c(i);
        String e = e(str, fe00Var);
        String d = d(i, str, th, str2, fe00Var);
        int length = 4034 - e.length();
        if (d.length() < length) {
            if (c == 7) {
                Log.wtf(e, d);
                return;
            } else {
                Log.println(c, e, d);
                return;
            }
        }
        int i2 = 0;
        int codePointCount = d.codePointCount(0, d.length());
        while (i2 < codePointCount) {
            int G = evu0.G(d, '\n', i2, 4);
            if (G == -1) {
                G = codePointCount;
            }
            while (true) {
                min = Math.min(G, i2 + length);
                String substring = d.substring(i2, min);
                if (c == 7) {
                    Log.wtf(e, substring);
                } else {
                    Log.println(c, e, substring);
                }
                if (min >= G) {
                    break;
                } else {
                    i2 = min;
                }
            }
            i2 = min + 1;
        }
    }

    @Override // defpackage.ke00
    public boolean b(int i) {
        return true;
    }

    public abstract int c(int i);

    public String d(int i, String str, Throwable th, String str2, fe00 fe00Var) {
        if (th == null) {
            return str2 == null ? "" : str2;
        }
        String i2 = ffx.i(th);
        return (str2 == null || str2.length() == 0) ? i2 : g8e.p(str2, "\n", i2);
    }

    public String e(String str, fe00 fe00Var) {
        if (str != null) {
            return str;
        }
        String h = ffx.h(new MangoAndroidThrowable());
        return h == null ? "" : h;
    }
}
