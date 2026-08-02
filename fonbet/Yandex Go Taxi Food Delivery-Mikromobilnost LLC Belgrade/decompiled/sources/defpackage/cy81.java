package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* loaded from: classes11.dex */
public final class cy81 implements xst {
    public final /* synthetic */ x8u0 a;

    public cy81(x8u0 x8u0Var) {
        this.a = x8u0Var;
    }

    @Override // defpackage.yx60
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.a.a(new Status(8));
    }
}
