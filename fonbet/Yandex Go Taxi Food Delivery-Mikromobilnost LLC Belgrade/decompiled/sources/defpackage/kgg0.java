package defpackage;

import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes10.dex */
public abstract class kgg0 {
    public static final a84 a;
    public static final a84 b;
    public static final a84 c;
    public static final a84 d;
    public static final a84 e;
    public static final a84 f;
    public static final a84 g;
    public static final HashSet h;
    public static final List i;

    static {
        a84 a84Var = new a84(4, 2002, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        a = a84Var;
        a84 a84Var2 = new a84(5, 2003, "HD", Collections.singletonList(new Size(1280, 720)));
        b = a84Var2;
        a84 a84Var3 = new a84(6, 2004, "FHD", Collections.singletonList(new Size(1920, 1080)));
        c = a84Var3;
        a84 a84Var4 = new a84(8, 2005, "UHD", Collections.singletonList(new Size(3840, 2160)));
        d = a84Var4;
        List list = Collections.EMPTY_LIST;
        a84 a84Var5 = new a84(0, 2000, "LOWEST", list);
        e = a84Var5;
        a84 a84Var6 = new a84(1, 2001, "HIGHEST", list);
        f = a84Var6;
        g = new a84(-1, -1, JCP.RAW_PREFIX, list);
        h = new HashSet(Arrays.asList(a84Var5, a84Var6, a84Var, a84Var2, a84Var3, a84Var4));
        i = Arrays.asList(a84Var4, a84Var3, a84Var2, a84Var);
    }

    public abstract int a();

    public abstract String b();

    public final int c(int i2) {
        if (i2 == 1) {
            return e();
        }
        if (i2 == 2) {
            return a();
        }
        ny61.f(oyr.i(i2, "Unknown quality source: "));
        return 0;
    }

    public abstract List d();

    public abstract int e();
}
