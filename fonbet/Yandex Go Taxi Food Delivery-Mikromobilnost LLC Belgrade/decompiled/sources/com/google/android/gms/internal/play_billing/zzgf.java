package com.google.android.gms.internal.play_billing;

import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
final class zzgf extends zzgi {
    private final int zzc;

    public zzgf(byte[] bArr, int i) {
        super(bArr);
        zzgk.g(0, i, bArr.length);
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi, com.google.android.gms.internal.play_billing.zzgk
    public final byte a(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((zzgi) this).zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(oyr.i(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(oyr.h(i, i2, "Index > length: ", Extension.FIX_SPACE));
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi, com.google.android.gms.internal.play_billing.zzgk
    public final byte b(int i) {
        return ((zzgi) this).zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi, com.google.android.gms.internal.play_billing.zzgk
    public final int f() {
        return this.zzc;
    }
}
