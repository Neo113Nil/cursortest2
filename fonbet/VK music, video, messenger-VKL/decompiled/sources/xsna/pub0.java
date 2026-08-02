package xsna;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.maps.zzaa;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class pub0 {
    public final zzaa a;

    public pub0(zzaa zzaaVar) {
        exc0.i(zzaaVar);
        this.a = zzaaVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof pub0)) {
            return false;
        }
        try {
            return this.a.zzB(((pub0) obj).a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.a.zzi();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
