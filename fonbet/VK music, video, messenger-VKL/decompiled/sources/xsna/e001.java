package xsna;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class e001 extends com.google.android.gms.internal.cast.zza implements g001 {
    @Override // xsna.g001
    public final void C0(m301 m301Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zze(zza, m301Var);
        zzc(2, zza);
    }

    @Override // xsna.g001
    public final void D0(m301 m301Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zze(zza, m301Var);
        zzc(3, zza);
    }

    @Override // xsna.g001
    public final void E1(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = com.google.android.gms.internal.cast.zzc.zza;
        zza.writeInt(1);
        zza.writeInt(z ? 1 : 0);
        zzc(6, zza);
    }

    @Override // xsna.g001
    public final void F(huz0 huz0Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zze(zza, huz0Var);
        zzc(5, zza);
    }

    @Override // xsna.g001
    public final void J(huz0 huz0Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zze(zza, huz0Var);
        zzc(4, zza);
    }

    @Override // xsna.g001
    public final void c1(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza, bundle);
        zzc(9, zza);
    }

    @Override // xsna.g001
    public final vnv zze() throws RemoteException {
        return y57.c(zzb(1, zza()));
    }

    @Override // xsna.g001
    public final vnv zzk() throws RemoteException {
        return y57.c(zzb(7, zza()));
    }

    @Override // xsna.g001
    public final int zzl() throws RemoteException {
        Parcel zzb = zzb(8, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }
}
