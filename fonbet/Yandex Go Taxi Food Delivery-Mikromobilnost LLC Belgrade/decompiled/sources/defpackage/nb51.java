package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public class nb51 {
    public static final nb51 b = new nb51();
    public tbz a = null;

    public static tbz a(Context context) {
        tbz tbzVar;
        nb51 nb51Var = b;
        synchronized (nb51Var) {
            try {
                if (nb51Var.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    nb51Var.a = new tbz(context, false);
                }
                tbzVar = nb51Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tbzVar;
    }
}
