package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public abstract class zzam extends zzar implements zzan {
    public static zzan zzu(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return queryLocalInterface instanceof zzan ? (zzan) queryLocalInterface : new zzal(iBinder);
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ int zza(int i, String str, String str2) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ int zzc(int i, String str, String str2, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ Bundle zzd(int i, String str, String str2, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ Bundle zze(int i, String str, String str2, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ Bundle zzf(int i, String str, String str2, String str3, String str4) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ Bundle zzg(int i, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ Bundle zzh(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ Bundle zzi(int i, String str, String str2, String str3) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ Bundle zzj(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ Bundle zzk(int i, String str, String str2, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ Bundle zzl(int i, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ void zzm(int i, String str, Bundle bundle, zzy zzyVar) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ void zzn(int i, String str, Bundle bundle, zzaa zzaaVar) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ void zzo(int i, String str, Bundle bundle, zzac zzacVar) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ void zzp(int i, String str, Bundle bundle, zzae zzaeVar) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ void zzq(int i, String str, Bundle bundle, zzag zzagVar) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ void zzr(int i, String str, Bundle bundle, zzai zzaiVar) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ void zzs(int i, String str, Bundle bundle, zzak zzakVar) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ void zzt(int i, String str, Bundle bundle, zzap zzapVar) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzan
    public abstract /* synthetic */ int zzy(int i, String str, String str2) throws RemoteException;
}
