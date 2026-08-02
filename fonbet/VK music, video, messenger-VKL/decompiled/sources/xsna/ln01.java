package xsna;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class ln01 extends com.google.android.gms.internal.common.zza {
    public ln01(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final vnv H1(bq70 bq70Var, String str, int i) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, bq70Var);
        zza.writeString(str);
        zza.writeInt(i);
        return y57.c(zzB(4, zza));
    }

    public final int I1(bq70 bq70Var, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, bq70Var);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final vnv J1(bq70 bq70Var, String str, boolean z, long j) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, bq70Var);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        zza.writeLong(j);
        return y57.c(zzB(7, zza));
    }

    public final vnv K1(bq70 bq70Var, String str, int i, bq70 bq70Var2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, bq70Var);
        zza.writeString(str);
        zza.writeInt(i);
        com.google.android.gms.internal.common.zzc.zze(zza, bq70Var2);
        return y57.c(zzB(8, zza));
    }

    public final vnv f(bq70 bq70Var, String str, int i) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, bq70Var);
        zza.writeString(str);
        zza.writeInt(i);
        return y57.c(zzB(2, zza));
    }

    public final int g(bq70 bq70Var, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, bq70Var);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzi() throws RemoteException {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }
}
