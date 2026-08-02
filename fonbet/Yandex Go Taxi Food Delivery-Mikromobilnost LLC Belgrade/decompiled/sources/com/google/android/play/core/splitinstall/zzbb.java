package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.splitinstall.internal.zzbp;
import defpackage.atx0;
import defpackage.x891;
import java.util.List;

/* loaded from: classes11.dex */
class zzbb extends zzbp {
    final atx0 zza;
    final /* synthetic */ x891 zzb;

    public zzbb(x891 x891Var, atx0 atx0Var) {
        this.zzb = x891Var;
        this.zza = atx0Var;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbp, com.google.android.play.core.splitinstall.internal.zzbq
    public void zzb(int i, Bundle bundle) throws RemoteException {
        this.zzb.b.c(this.zza);
        x891.c.d("onCancelInstall(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbp, com.google.android.play.core.splitinstall.internal.zzbq
    public void zzc(Bundle bundle) throws RemoteException {
        this.zzb.b.c(this.zza);
        x891.c.d("onDeferredInstall", new Object[0]);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbp, com.google.android.play.core.splitinstall.internal.zzbq
    public void zzd(Bundle bundle) throws RemoteException {
        this.zzb.b.c(this.zza);
        x891.c.d("onDeferredLanguageInstall", new Object[0]);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbp, com.google.android.play.core.splitinstall.internal.zzbq
    public void zze(Bundle bundle) throws RemoteException {
        this.zzb.b.c(this.zza);
        x891.c.d("onDeferredLanguageUninstall", new Object[0]);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbp, com.google.android.play.core.splitinstall.internal.zzbq
    public void zzf(Bundle bundle) throws RemoteException {
        this.zzb.b.c(this.zza);
        x891.c.d("onDeferredUninstall", new Object[0]);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbp, com.google.android.play.core.splitinstall.internal.zzbq
    public void zzg(int i, Bundle bundle) throws RemoteException {
        this.zzb.b.c(this.zza);
        x891.c.d("onGetSession(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbp, com.google.android.play.core.splitinstall.internal.zzbq
    public void zzh(List list) throws RemoteException {
        this.zzb.b.c(this.zza);
        x891.c.d("onGetSessionStates", new Object[0]);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbp, com.google.android.play.core.splitinstall.internal.zzbq
    public void zzi(int i, Bundle bundle) throws RemoteException {
        this.zzb.b.c(this.zza);
        x891.c.d("onStartInstall(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbp, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzj(int i, Bundle bundle) throws RemoteException {
        this.zzb.b.c(this.zza);
        x891.c.d("onCompleteInstall(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbp, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzk(Bundle bundle) throws RemoteException {
        this.zzb.b.c(this.zza);
        x891.c.d("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbp, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzl(Bundle bundle) throws RemoteException {
        this.zzb.b.c(this.zza);
        int i = bundle.getInt("error_code");
        x891.c.b("onError(%d)", Integer.valueOf(i));
        this.zza.b(new SplitInstallException(i));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbp, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzm(Bundle bundle) throws RemoteException {
        this.zzb.b.c(this.zza);
        x891.c.d("onGetSplitsForAppUpdate", new Object[0]);
    }
}
