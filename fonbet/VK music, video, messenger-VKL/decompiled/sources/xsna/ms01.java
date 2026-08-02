package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.c;
import com.google.android.gms.internal.cast.zzff;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class ms01 extends u2u {
    public static final o100 f = new o100("CastClientImplCxless", null);
    public final CastDevice b;
    public final long c;
    public final Bundle d;
    public final String e;

    public ms01(Context context, Looper looper, olc olcVar, CastDevice castDevice, long j, Bundle bundle, String str, c.b bVar, c.InterfaceC0114c interfaceC0114c) {
        super(context, looper, 10, olcVar, (x3j) bVar, (i380) interfaceC0114c);
        this.b = castDevice;
        this.c = j;
        this.d = bundle;
        this.e = str;
    }

    @Override // xsna.rd6
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof nwz0 ? (nwz0) queryLocalInterface : new nwz0(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final void disconnect() {
        try {
            try {
                nwz0 nwz0Var = (nwz0) getService();
                ApiMetadata zza = zzff.zza(getContext());
                Parcel zza2 = nwz0Var.zza();
                com.google.android.gms.internal.cast.zzc.zzc(zza2, zza);
                nwz0Var.zzd(1, zza2);
            } catch (RemoteException | IllegalStateException unused) {
                f.b("Error while disconnecting the controller interface", new Object[0]);
            }
        } finally {
            super.disconnect();
        }
    }

    @Override // xsna.rd6
    public final Feature[] getApiFeatures() {
        return wyz0.f;
    }

    @Override // xsna.rd6
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        f.a("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.b;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.c);
        bundle.putString("connectionless_client_record_id", this.e);
        Bundle bundle2 = this.d;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 19390000;
    }

    @Override // xsna.rd6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
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
