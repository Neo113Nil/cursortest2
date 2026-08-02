package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class ypz0 extends u2u {
    public final a8o0 b;

    public ypz0(Context context, Looper looper, olc olcVar, a8o0 a8o0Var, x3j x3jVar, i380 i380Var) {
        super(context, looper, atv0.b, olcVar, x3jVar, i380Var);
        this.b = a8o0Var;
    }

    @Override // xsna.rd6
    @Nullable
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof xoz0 ? (xoz0) queryLocalInterface : new xoz0(iBinder);
    }

    @Override // xsna.rd6
    public final Feature[] getApiFeatures() {
        return com.google.android.gms.internal.base.zad.zac;
    }

    @Override // xsna.rd6
    public final Bundle getGetServiceRequestExtraArgs() {
        a8o0 a8o0Var = this.b;
        a8o0Var.getClass();
        Bundle bundle = new Bundle();
        String str = a8o0Var.b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // xsna.rd6
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // xsna.rd6
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // xsna.rd6
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
