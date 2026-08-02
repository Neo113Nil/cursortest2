package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class sx1 {
    public final tx1 a(Context context) {
        tx1 tx1Var;
        tx1 tx1Var2 = tx1.d;
        if (tx1Var2 != null) {
            return tx1Var2;
        }
        synchronized (this) {
            try {
                tx1Var = tx1.d;
                if (tx1Var == null) {
                    qu2 a = gx2.a().a(context);
                    tx1Var = new tx1(a != null ? a.b : 0);
                    tx1.d = tx1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tx1Var;
    }
}
