package xsna;

import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.proto.m0;
import kotlin.jvm.internal.Lambda;

/* compiled from: HealthPermissionsRequestAppContract.kt */
/* loaded from: classes12.dex */
public final class q0v extends Lambda implements izs<String, Permission> {
    public static final q0v i = new q0v(1);

    @Override // xsna.izs
    public final Permission invoke(String str) {
        m0.a v = androidx.health.platform.client.proto.m0.v();
        v.j();
        androidx.health.platform.client.proto.m0.t((androidx.health.platform.client.proto.m0) v.c, str);
        return new Permission(v.e());
    }
}
