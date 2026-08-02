package xsna;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public interface fmv extends IInterface {
    @NonNull
    vnv B0() throws RemoteException;

    @NonNull
    vnv T0() throws RemoteException;

    @NonNull
    vnv W0(@NonNull LatLngBounds latLngBounds, int i) throws RemoteException;

    @NonNull
    vnv a0(@NonNull CameraPosition cameraPosition) throws RemoteException;

    @NonNull
    vnv h0(@NonNull LatLng latLng) throws RemoteException;

    @NonNull
    vnv m1(@NonNull LatLng latLng, float f) throws RemoteException;
}
