package defpackage;

import android.content.Context;
import com.google.android.gms.common.a;

/* loaded from: classes11.dex */
public final class lwt extends ust {
    public static int k = 1;

    public synchronized int e() {
        int i;
        try {
            i = k;
            if (i == 1) {
                Context context = this.a;
                a aVar = a.d;
                int d = aVar.d(context, 12451000);
                if (d == 0) {
                    i = 4;
                    k = 4;
                } else if (aVar.b(context, d, null) != null || gan.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    k = 2;
                } else {
                    i = 3;
                    k = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
