package xsna;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public interface oxz0 extends IInterface {
    void e(int i) throws RemoteException;

    void m(ApplicationMetadata applicationMetadata, @Nullable String str, String str2, boolean z) throws RemoteException;

    void o(ConnectionResult connectionResult) throws RemoteException;

    void p0() throws RemoteException;

    void zzf(int i) throws RemoteException;

    void zzj(boolean z) throws RemoteException;
}
