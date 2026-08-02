package com.google.android.gms.internal.fido;

import defpackage.ny61;
import defpackage.oyr;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
class zzgu extends zzgt {
    protected final byte[] zza;

    public zzgu(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public byte a(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public byte b(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgx) && f() == ((zzgx) obj).f()) {
            if (f() == 0) {
                return true;
            }
            if (!(obj instanceof zzgu)) {
                return obj.equals(this);
            }
            zzgu zzguVar = (zzgu) obj;
            int l = l();
            int l2 = zzguVar.l();
            if (l == 0 || l2 == 0 || l == l2) {
                int f = f();
                if (f > zzguVar.f()) {
                    ny61.d(f, f());
                    return false;
                }
                if (f > zzguVar.f()) {
                    ny61.g(oyr.h(f, zzguVar.f(), "Ran off end of other: 0, ", Extension.FIX_SPACE));
                    return false;
                }
                byte[] bArr = this.zza;
                byte[] bArr2 = zzguVar.zza;
                int p = p() + f;
                int p2 = p();
                int p3 = zzguVar.p();
                while (p2 < p) {
                    if (bArr[p2] == bArr2[p3]) {
                        p2++;
                        p3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public int f() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public void g(int i, byte[] bArr) {
        System.arraycopy(this.zza, 0, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final zzgx h(int i, int i2) {
        int k = zzgx.k(i, i2, f());
        return k == 0 ? zzgx.a : new zzgr(this.zza, p() + i, k);
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final ByteArrayInputStream i() {
        return new ByteArrayInputStream(this.zza, p(), f());
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final ByteBuffer j() {
        return ByteBuffer.wrap(this.zza, p(), f()).asReadOnlyBuffer();
    }

    public int p() {
        return 0;
    }
}
