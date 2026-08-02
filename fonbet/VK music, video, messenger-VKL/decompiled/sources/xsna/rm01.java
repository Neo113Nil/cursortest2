package xsna;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class rm01 extends u2u {
    @Override // xsna.rd6
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return queryLocalInterface instanceof ixz0 ? (ixz0) queryLocalInterface : new ixz0(iBinder, "com.google.android.gms.cast.internal.ICastService");
    }

    @Override // xsna.rd6
    public final Feature[] getApiFeatures() {
        return wyz0.f;
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // xsna.rd6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // xsna.rd6
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // xsna.rd6
    public final boolean usesClientTelemetry() {
        return true;
    }
}
