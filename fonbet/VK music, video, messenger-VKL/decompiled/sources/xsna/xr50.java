package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class xr50 {
    public static final AtomicBoolean a = new AtomicBoolean();
    public static volatile pp50 b = new pp50(null);
    public static idy0 c = null;
    public static qjz0 d = null;

    public static void a(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            gu8.d("MyTarget cannot be initialized due to a null application context");
            return;
        }
        if (a.compareAndSet(false, true)) {
            gu8.d("MyTarget initialization");
            idy0 idy0Var = new idy0(applicationContext);
            c = idy0Var;
            o8z0.b.execute(new w4k(1, idy0Var, applicationContext));
        }
    }
}
