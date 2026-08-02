package yads;

import android.content.Context;
import xsna.epx;

/* loaded from: classes10.dex */
public final class sy2 {
    public final dz a;

    public /* synthetic */ sy2() {
        this(new dz());
    }

    public static boolean a(Context context) {
        qu2 a = gx2.a().a(context);
        return a == null || a.j;
    }

    public final boolean b(Context context) {
        qu2 a = gx2.a().a(context);
        if (a == null || !a.i || a(context)) {
            return true;
        }
        this.a.getClass();
        return !epx.f(gx2.a().b(), a.P) && epx.f(gx2.a().b(), Boolean.TRUE);
    }

    public sy2(dz dzVar) {
        this.a = dzVar;
    }
}
