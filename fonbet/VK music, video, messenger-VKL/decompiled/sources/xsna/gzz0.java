package xsna;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public interface gzz0 extends IInterface {
    void q0() throws RemoteException;

    int r1(int i, int i2, Intent intent) throws RemoteException;

    @Nullable
    IBinder z0(Intent intent) throws RemoteException;

    void zzh() throws RemoteException;
}
