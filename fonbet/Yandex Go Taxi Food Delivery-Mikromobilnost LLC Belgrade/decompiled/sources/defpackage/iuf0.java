package defpackage;

import android.content.Context;
import ru.yandex.taxi.security.c;

/* loaded from: classes6.dex */
public abstract class iuf0 {
    private static volatile iuf0 a;

    public static iuf0 a(iuf0 iuf0Var) {
        a = iuf0Var;
        return iuf0Var;
    }

    public static iuf0 c() {
        if (a == null) {
            synchronized (iuf0.class) {
                try {
                    if (a == null) {
                        a = new huf0();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public abstract n9 b(Context context, h3y h3yVar, lx4 lx4Var, h3y h3yVar2, h3y h3yVar3, c cVar, tt2 tt2Var, hit hitVar);
}
