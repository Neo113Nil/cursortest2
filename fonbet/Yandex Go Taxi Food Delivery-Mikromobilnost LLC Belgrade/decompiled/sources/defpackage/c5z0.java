package defpackage;

import android.util.Log;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class c5z0 extends f5z0 {
    public static final Pattern c = Pattern.compile("(\\$\\d+)+$");
    public final List b = scc.g(h5z0.class.getName(), d5z0.class.getName(), f5z0.class.getName(), c5z0.class.getName());

    @Override // defpackage.f5z0
    public final String g() {
        String g = super.g();
        if (g != null) {
            return g;
        }
        for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
            if (!this.b.contains(stackTraceElement.getClassName())) {
                String className = stackTraceElement.getClassName();
                String e0 = evu0.e0('.', className, className);
                Matcher matcher = c.matcher(e0);
                return matcher.find() ? matcher.replaceAll("") : e0;
            }
        }
        w511.i("Array contains no element matching the predicate.");
        return null;
    }

    @Override // defpackage.f5z0
    public final void k(int i, String str, String str2) {
        int min;
        if (str2.length() < 4000) {
            if (i == 7) {
                Log.wtf(str, str2);
                return;
            } else {
                Log.println(i, str, str2);
                return;
            }
        }
        int length = str2.length();
        int i2 = 0;
        while (i2 < length) {
            int G = evu0.G(str2, '\n', i2, 4);
            if (G == -1) {
                G = length;
            }
            while (true) {
                min = Math.min(G, i2 + 4000);
                String substring = str2.substring(i2, min);
                if (i == 7) {
                    Log.wtf(str, substring);
                } else {
                    Log.println(i, str, substring);
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
}
