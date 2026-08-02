package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class xzx0 {
    public static final xzx0 b;

    @Nullable
    public a890 a;

    static {
        xzx0 xzx0Var = new xzx0();
        xzx0Var.a = null;
        b = xzx0Var;
    }

    @NonNull
    public static a890 a(@NonNull Context context) {
        a890 a890Var;
        xzx0 xzx0Var = b;
        synchronized (xzx0Var) {
            try {
                if (xzx0Var.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    xzx0Var.a = new a890(context);
                }
                a890Var = xzx0Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a890Var;
    }
}
