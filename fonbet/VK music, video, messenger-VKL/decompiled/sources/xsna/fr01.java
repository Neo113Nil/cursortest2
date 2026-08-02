package xsna;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class fr01 extends com.google.android.gms.internal.common.zza implements fs01 {
    @Override // xsna.fs01
    public final vnv zzd() throws RemoteException {
        return y57.c(zzB(1, zza()));
    }

    @Override // xsna.fs01
    public final int zze() throws RemoteException {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }
}
