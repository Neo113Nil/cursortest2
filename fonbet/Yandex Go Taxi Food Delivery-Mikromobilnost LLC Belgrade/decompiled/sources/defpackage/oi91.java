package defpackage;

import android.os.RemoteException;
import com.google.android.gms.internal.identity.e;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes11.dex */
public final class oi91 extends LocationCallback {
    public final /* synthetic */ atx0 b;
    public final /* synthetic */ e c;

    public oi91(e eVar, atx0 atx0Var) {
        this.b = atx0Var;
        this.c = eVar;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        this.b.c(locationResult.getLastLocation());
        try {
            this.c.u(puy.c(this, "GetCurrentLocation"), false, new atx0());
        } catch (RemoteException unused) {
        }
    }
}
