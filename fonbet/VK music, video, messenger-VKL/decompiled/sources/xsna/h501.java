package xsna;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class h501 extends com.google.android.gms.internal.auth.zza implements i801 {
    @Override // xsna.i801
    public final void L(e101 e101Var, String str) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.auth.zzc.zzd(zza, e101Var);
        zza.writeString(str);
        zzc(2, zza);
    }

    @Override // xsna.i801
    public final void X0(e101 e101Var, Account account) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.auth.zzc.zzd(zza, e101Var);
        com.google.android.gms.internal.auth.zzc.zzc(zza, account);
        zzc(3, zza);
    }

    @Override // xsna.i801
    public final void v(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = com.google.android.gms.internal.auth.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(1, zza);
    }
}
