package xsna;

import androidx.health.platform.client.permission.Permission;
import kotlin.jvm.internal.Lambda;

/* compiled from: HealthPermissionsRequestAppContract.kt */
/* loaded from: classes12.dex */
public final class r0v extends Lambda implements izs<Permission, String> {
    public static final r0v i = new r0v(1);

    @Override // xsna.izs
    public final String invoke(Permission permission) {
        return permission.c.u();
    }
}
