package com.google.android.gms.internal.play_billing;

import defpackage.ny61;
import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
class zzgi extends zzgh {
    protected final byte[] zza;

    public zzgi(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public byte a(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public byte b(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgk) && f() == ((zzgk) obj).f()) {
            if (f() == 0) {
                return true;
            }
            if (!(obj instanceof zzgi)) {
                return obj.equals(this);
            }
            zzgi zzgiVar = (zzgi) obj;
            int h = h();
            int h2 = zzgiVar.h();
            if (h == 0 || h2 == 0 || h == h2) {
                int f = f();
                if (f > zzgiVar.f()) {
                    ny61.d(f, f());
                    return false;
                }
                if (f > zzgiVar.f()) {
                    ny61.g(oyr.h(f, zzgiVar.f(), "Ran off end of other: 0, ", Extension.FIX_SPACE));
                    return false;
                }
                byte[] bArr = this.zza;
                byte[] bArr2 = zzgiVar.zza;
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

    @Override // com.google.android.gms.internal.play_billing.zzgk
    public int f() {
        return this.zza.length;
    }
}
