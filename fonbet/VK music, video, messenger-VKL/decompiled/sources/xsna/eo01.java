package xsna;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class eo01 extends com.google.android.gms.internal.common.zza {
    public final vnv f(bq70 bq70Var, String str, int i, bq70 bq70Var2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, bq70Var);
        zza.writeString(str);
        zza.writeInt(i);
        com.google.android.gms.internal.common.zzc.zze(zza, bq70Var2);
        return y57.c(zzB(2, zza));
    }

    public final vnv g(bq70 bq70Var, String str, int i, bq70 bq70Var2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, bq70Var);
        zza.writeString(str);
        zza.writeInt(i);
        com.google.android.gms.internal.common.zzc.zze(zza, bq70Var2);
        return y57.c(zzB(3, zza));
    }
}
