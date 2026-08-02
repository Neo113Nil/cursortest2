package defpackage;

import android.content.Context;
import android.util.Log;

/* loaded from: classes11.dex */
public final class m2f {
    public static void a(Context context, Throwable th) {
        try {
            cvw.l(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }
}
