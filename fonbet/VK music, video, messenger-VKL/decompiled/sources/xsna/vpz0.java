package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.c;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class vpz0 implements c.b, c.InterfaceC0114c {
    public final com.google.android.gms.common.api.a a;
    public final boolean b;

    @Nullable
    public amz0 e;

    public vpz0(com.google.android.gms.common.api.a aVar, boolean z) {
        this.a = aVar;
        this.b = z;
    }

    @Override // xsna.x3j
    public final void f(@Nullable Bundle bundle) {
        exc0.j(this.e, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.e.f(bundle);
    }

    @Override // xsna.i380
    public final void g(@NonNull ConnectionResult connectionResult) {
        com.google.android.gms.common.api.a aVar = this.a;
        boolean z = this.b;
        exc0.j(this.e, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        amz0 amz0Var = this.e;
        amz0Var.a.lock();
        try {
            amz0Var.m.r(connectionResult, aVar, z);
        } finally {
            amz0Var.a.unlock();
        }
    }

    @Override // xsna.x3j
    public final void onConnectionSuspended(int i) {
        exc0.j(this.e, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.e.onConnectionSuspended(i);
    }
}
