package defpackage;

import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.ybsdk.core.vendor.google.location.a;

/* loaded from: classes11.dex */
public final class jtt extends LocationCallback {
    public final /* synthetic */ j18 b;

    public jtt(a aVar, j18 j18Var) {
        this.b = j18Var;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        this.b.resumeWith(a.h(locationResult.getLastLocation()));
    }
}
