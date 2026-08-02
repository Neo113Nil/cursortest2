package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class dn81 {
    public final lq81 a(Context context) {
        lq81 lq81Var;
        lq81 lq81Var2 = lq81.d;
        if (lq81Var2 != null) {
            return lq81Var2;
        }
        synchronized (this) {
            try {
                lq81Var = lq81.d;
                if (lq81Var == null) {
                    gg81 a = dha1.f().a(context);
                    lq81Var = new lq81(a != null ? a.b : 0);
                    lq81.d = lq81Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lq81Var;
    }
}
