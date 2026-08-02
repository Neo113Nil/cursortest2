package defpackage;

import android.content.Context;

/* loaded from: classes6.dex */
public final class dzy0 {
    public final Context a;
    public final zuj0 b;
    public final cjw0 c;

    public dzy0(Context context, zuj0 zuj0Var, cjw0 cjw0Var) {
        this.a = context;
        this.b = zuj0Var;
        this.c = cjw0Var;
    }

    public final ey20 a(bzy0 bzy0Var) {
        String h = ((avj0) this.b).h(kyh0.mt_route_options_title_error);
        hj40 a = bzy0Var.a();
        String str = a != null ? a.a : null;
        if (str == null) {
            str = "";
        }
        return new ey20(b(h, str), null, c(false), 6);
    }

    public final tdu b(String str, String str2) {
        if (str2.length() == 0) {
            return new tdu(str, null, null, null, 14);
        }
        avj0 avj0Var = (avj0) this.b;
        return new tdu(str, avj0Var.i(kyh0.mt_short_stop, str2), null, avj0Var.i(kyh0.mt_stop, str2), 4);
    }

    public final py6 c(boolean z) {
        String h;
        zuj0 zuj0Var = this.b;
        if (!z) {
            h = ((avj0) zuj0Var).h(kyh0.mt_try_refresh);
        } else {
            if (!z) {
                w511.b();
                return null;
            }
            h = ((avj0) zuj0Var).h(kyh0.mt_refreshing);
        }
        return new py6(h, syy0.c, z);
    }
}
