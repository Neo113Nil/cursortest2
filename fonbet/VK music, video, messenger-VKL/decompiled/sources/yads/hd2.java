package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class hd2 {
    public final Context a;

    public hd2(Context context) {
        this.a = context.getApplicationContext();
    }

    public final boolean a(String str) {
        try {
            return this.a.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
