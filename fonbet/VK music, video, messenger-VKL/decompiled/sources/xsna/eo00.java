package xsna;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class eo00 {
    public final com.google.android.gms.internal.maps.zzx a;

    public eo00(com.google.android.gms.internal.maps.zzx zzxVar) {
        exc0.i(zzxVar);
        this.a = zzxVar;
    }

    @NonNull
    public final LatLng a() {
        try {
            return this.a.zzi();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void b(float f, float f2) {
        try {
            this.a.zzp(f, f2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void c(@Nullable tb7 tb7Var) {
        com.google.android.gms.internal.maps.zzx zzxVar = this.a;
        try {
            if (tb7Var == null) {
                zzxVar.zzs(null);
            } else {
                zzxVar.zzs(tb7Var.a);
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void d(@NonNull LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.a.zzu(latLng);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof eo00)) {
            return false;
        }
        try {
            return this.a.zzC(((eo00) obj).a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.a.zzg();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
