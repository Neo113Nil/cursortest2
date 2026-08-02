package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.cvw;
import defpackage.ny61;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes11.dex */
abstract class zzj extends zzw {
    private final int zza;

    public zzj(byte[] bArr) {
        cvw.e(bArr.length == 25);
        this.zza = Arrays.hashCode(bArr);
    }

    public static byte[] zzf(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            ny61.f(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        IObjectWrapper zzd;
        if (!(obj instanceof zzx)) {
            return false;
        }
        try {
            zzx zzxVar = (zzx) obj;
            if (zzxVar.zze() == this.zza && (zzd = zzxVar.zzd()) != null) {
                return Arrays.equals(zzc(), (byte[]) ObjectWrapper.unwrap(zzd));
            }
            return false;
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public final int hashCode() {
        return this.zza;
    }

    public abstract byte[] zzc();

    @Override // com.google.android.gms.common.internal.zzw, com.google.android.gms.common.internal.zzx
    public final IObjectWrapper zzd() {
        return ObjectWrapper.wrap(zzc());
    }

    @Override // com.google.android.gms.common.internal.zzw, com.google.android.gms.common.internal.zzx
    public final int zze() {
        return this.zza;
    }
}
