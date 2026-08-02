package xsna;

import android.os.Binder;
import com.google.android.gms.auth.api.signin.RevocationBoundService;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public final class prz0 extends irz0 {
    public final RevocationBoundService a;

    public prz0(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.a = revocationBoundService;
    }

    public final void f() {
        if (!f2q0.a(Binder.getCallingUid(), this.a)) {
            throw new SecurityException(tgw.b(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }
}
