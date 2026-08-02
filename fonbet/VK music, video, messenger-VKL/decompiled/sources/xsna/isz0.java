package xsna;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public abstract class isz0 extends y401 {
    public final int d;

    @Nullable
    public final Bundle e;
    public final /* synthetic */ rd6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isz0(rd6 rd6Var, @Nullable int i, Bundle bundle) {
        super(rd6Var);
        this.f = rd6Var;
        this.d = i;
        this.e = bundle;
    }

    @Override // xsna.y401
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        rd6 rd6Var = this.f;
        int i = this.d;
        if (i != 0) {
            rd6Var.zzd(1, null);
            Bundle bundle = this.e;
            c(new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable(rd6.KEY_PENDING_INTENT) : null));
        } else {
            if (b()) {
                return;
            }
            rd6Var.zzd(1, null);
            c(new ConnectionResult(8, null));
        }
    }

    public abstract boolean b();

    public abstract void c(ConnectionResult connectionResult);
}
