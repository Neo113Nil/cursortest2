package xsna;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public interface gmv extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
    public static abstract class a extends com.google.android.gms.internal.common.zzb implements gmv {
        @NonNull
        public static gmv f(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return queryLocalInterface instanceof gmv ? (gmv) queryLocalInterface : new pq01(iBinder, "com.google.android.gms.common.internal.ICancelToken");
        }
    }

    void cancel() throws RemoteException;
}
