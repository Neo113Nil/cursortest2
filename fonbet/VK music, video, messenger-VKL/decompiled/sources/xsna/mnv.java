package xsna;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMapOptions;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public interface mnv extends IInterface {
    void X(@NonNull bq70 bq70Var, GoogleMapOptions googleMapOptions, @NonNull Bundle bundle) throws RemoteException;

    void b(@NonNull Bundle bundle) throws RemoteException;

    void l(czz0 czz0Var) throws RemoteException;

    @NonNull
    vnv n1(@NonNull bq70 bq70Var, @NonNull bq70 bq70Var2, @NonNull Bundle bundle) throws RemoteException;

    void onCreate(@NonNull Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onDestroyView() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;
}
