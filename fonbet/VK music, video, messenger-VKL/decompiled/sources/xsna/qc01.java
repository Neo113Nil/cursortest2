package xsna;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class qc01 extends isz0 {
    public final /* synthetic */ rd6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc01(rd6 rd6Var, @Nullable int i, Bundle bundle) {
        super(rd6Var, i, bundle);
        this.g = rd6Var;
    }

    @Override // xsna.isz0
    public final boolean b() {
        this.g.zzc.a(ConnectionResult.g);
        return true;
    }

    @Override // xsna.isz0
    public final void c(ConnectionResult connectionResult) {
        rd6 rd6Var = this.g;
        if (rd6Var.enableLocalFallback() && rd6Var.zzg()) {
            rd6Var.zzf(16);
        } else {
            rd6Var.zzc.a(connectionResult);
            rd6Var.onConnectionFailed(connectionResult);
        }
    }
}
