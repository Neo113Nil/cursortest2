package xsna;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public interface ynv extends IInterface {
    @NonNull
    LatLng H(@NonNull bq70 bq70Var) throws RemoteException;

    @NonNull
    VisibleRegion Y() throws RemoteException;
}
