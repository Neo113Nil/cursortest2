package com.google.android.gms.internal.fido;

import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
final class zzgr extends zzgu {
    private final int zzc;
    private final int zzd;

    public zzgr(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgx.k(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final byte a(int i) {
        int i2 = this.zzd;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[this.zzc + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(oyr.i(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(oyr.h(i, i2, "Index > length: ", Extension.FIX_SPACE));
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final byte b(int i) {
        return this.zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final int f() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final void g(int i, byte[] bArr) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.fido.zzgu
    public final int p() {
        return this.zzc;
    }
}
