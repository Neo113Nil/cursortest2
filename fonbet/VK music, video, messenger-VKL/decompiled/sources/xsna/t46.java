package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class t46 {
    public final u6z0 a;
    public final s3z0.a b;
    public final AtomicBoolean c = new AtomicBoolean();
    public final String d = UUID.randomUUID().toString();

    public t46(@NonNull Context context, int i, @NonNull String str) {
        this.a = new u6z0(i, str);
        this.b = new s3z0.a(i);
        if (xr50.a.get()) {
            return;
        }
        xr50.a(context);
    }

    public final void b(@Nullable String str) {
        if (str.length() > 255) {
            gu8.e(null, "setTag error: tag length must be less or equal to 255");
            return;
        }
        u6z0 u6z0Var = this.a;
        u6z0Var.i = str;
        u6z0Var.j.h = str;
    }
}
