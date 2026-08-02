package com.google.android.gms.internal.measurement;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
class zzlg extends zzlf {
    protected final byte[] zza;

    public zzlg(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public byte a(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public byte b(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzlh) && f() == ((zzlh) obj).f()) {
            if (f() == 0) {
                return true;
            }
            if (!(obj instanceof zzlg)) {
                return obj.equals(this);
            }
            zzlg zzlgVar = (zzlg) obj;
            int h = h();
            int h2 = zzlgVar.h();
            if (h == 0 || h2 == 0 || h == h2) {
                int f = f();
                if (f > zzlgVar.f()) {
                    int f2 = f();
                    StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 18 + String.valueOf(f2).length());
                    sb.append("Length too large: ");
                    sb.append(f);
                    sb.append(f2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (f > zzlgVar.f()) {
                    int f3 = zzlgVar.f();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(f).length() + 27 + String.valueOf(f3).length());
                    sb2.append("Ran off end of other: 0, ");
                    sb2.append(f);
                    sb2.append(Extension.FIX_SPACE);
                    sb2.append(f3);
                    throw new IllegalArgumentException(sb2.toString());
                }
                byte[] bArr = this.zza;
                byte[] bArr2 = zzlgVar.zza;
                int i = 0;
                int i2 = 0;
                while (i < f) {
                    if (bArr[i] == bArr2[i2]) {
                        i++;
                        i2++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public int f() {
        return this.zza.length;
    }
}
