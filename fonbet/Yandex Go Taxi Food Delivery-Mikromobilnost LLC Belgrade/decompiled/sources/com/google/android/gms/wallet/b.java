package com.google.android.gms.wallet;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {
    public final /* synthetic */ IsReadyToPayRequest a;

    public final void a(int i) {
        IsReadyToPayRequest isReadyToPayRequest = this.a;
        if (isReadyToPayRequest.zza == null) {
            isReadyToPayRequest.zza = new ArrayList();
        }
        isReadyToPayRequest.zza.add(Integer.valueOf(i));
    }

    public final void b(int i) {
        IsReadyToPayRequest isReadyToPayRequest = this.a;
        if (isReadyToPayRequest.zzd == null) {
            isReadyToPayRequest.zzd = new ArrayList();
        }
        isReadyToPayRequest.zzd.add(Integer.valueOf(i));
    }

    public final void c(boolean z) {
        this.a.zze = z;
    }
}
