package xsna;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.media.NotificationAction;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class y801 extends com.google.android.gms.internal.cast.zza implements cc01 {
    @Override // xsna.cc01
    public final ArrayList zzf() throws RemoteException {
        Parcel zzb = zzb(3, zza());
        ArrayList createTypedArrayList = zzb.createTypedArrayList(NotificationAction.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // xsna.cc01
    public final int[] zzg() throws RemoteException {
        Parcel zzb = zzb(4, zza());
        int[] createIntArray = zzb.createIntArray();
        zzb.recycle();
        return createIntArray;
    }
}
