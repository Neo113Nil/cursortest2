package xsna;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import xsna.knv;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes12.dex */
public final class fvv extends u2u<knv> {
    @Override // xsna.rd6
    @NonNull
    public final IInterface createServiceInterface(@NonNull IBinder iBinder) {
        int i = knv.a.a;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return queryLocalInterface instanceof knv ? (knv) queryLocalInterface : new knv.a.C3191a(iBinder, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
    }

    @Override // xsna.rd6
    public final Feature[] getApiFeatures() {
        return com.google.android.gms.internal.identity_credentials.zze.zzd;
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // xsna.rd6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // xsna.rd6
    public final String getStartServiceAction() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // xsna.rd6
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // xsna.rd6
    public final boolean usesClientTelemetry() {
        return true;
    }
}
