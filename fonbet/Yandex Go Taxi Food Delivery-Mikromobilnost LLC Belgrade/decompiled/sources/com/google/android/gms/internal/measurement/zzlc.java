package com.google.android.gms.internal.measurement;

import defpackage.unr0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
final class zzlc extends zzlg {
    private final int zzc;

    public zzlc(byte[] bArr, int i) {
        super(bArr);
        zzlh.i(0, i, bArr.length);
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final byte a(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((zzlg) this).zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(unr0.m(i, "Index < 0: ", new StringBuilder(String.valueOf(i).length() + 11)));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
        sb.append("Index > length: ");
        sb.append(i);
        sb.append(Extension.FIX_SPACE);
        sb.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final byte b(int i) {
        return ((zzlg) this).zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final int f() {
        return this.zzc;
    }
}
