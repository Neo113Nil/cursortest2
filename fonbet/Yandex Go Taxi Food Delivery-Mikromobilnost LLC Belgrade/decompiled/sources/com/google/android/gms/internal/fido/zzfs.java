package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* loaded from: classes11.dex */
final class zzfs extends e implements Serializable {
    final byte[] zza;

    public zzfs(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.fido.e
    public final byte[] a() {
        return (byte[]) this.zza.clone();
    }
}
