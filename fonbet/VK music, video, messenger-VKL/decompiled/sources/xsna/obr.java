package xsna;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;

/* compiled from: FilePathComponents.kt */
/* loaded from: classes11.dex */
public class obr {
    public static bpn0 a;

    public static void a(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(int i, int i2, String str) {
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [0, " + i2 + "] (too low)");
        }
        if (i <= i2) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [0, " + i2 + "] (too high)");
    }

    public static void d(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void f(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static final lu90 g() {
        bpn0 bpn0Var = a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (lu90) bpn0Var.getValue();
    }

    public static final int h(String str) {
        int L;
        char c = File.separatorChar;
        int L2 = drm0.L(str, c, 0, 4);
        if (L2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c || (L = drm0.L(str, c, 2, 4)) < 0) {
                return 1;
            }
            int L3 = drm0.L(str, c, L + 1, 4);
            return L3 >= 0 ? L3 + 1 : str.length();
        }
        if (L2 > 0 && str.charAt(L2 - 1) == ':') {
            return L2 + 1;
        }
        if (L2 == -1 && drm0.G(str, ':')) {
            return str.length();
        }
        return 0;
    }

    public static final q9r i(File file) {
        List list;
        String path = file.getPath();
        int h = h(path);
        String substring = path.substring(0, h);
        String substring2 = path.substring(h);
        if (substring2.length() == 0) {
            list = EmptyList.b;
        } else {
            List b0 = drm0.b0(substring2, new char[]{File.separatorChar}, 0, 6);
            ArrayList arrayList = new ArrayList(c5g.u(b0, 10));
            Iterator it = b0.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new q9r(new File(substring), list);
    }
}
