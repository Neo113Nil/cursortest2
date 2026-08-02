package com.google.android.gms.internal.fido;

import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.jsa1;
import defpackage.ny61;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

/* loaded from: classes11.dex */
public abstract class e {
    public static final char[] a = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public abstract byte[] a();

    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof e) {
            zzfs zzfsVar = (zzfs) this;
            byte[] bArr = zzfsVar.zza;
            int length = bArr.length * 8;
            zzfs zzfsVar2 = (zzfs) ((e) obj);
            byte[] bArr2 = zzfsVar2.zza;
            if (length == bArr2.length * 8) {
                if (bArr.length == bArr2.length) {
                    int i = 0;
                    z = true;
                    while (true) {
                        byte[] bArr3 = zzfsVar.zza;
                        if (i >= bArr3.length) {
                            break;
                        }
                        z &= bArr3[i] == zzfsVar2.zza[i];
                        i++;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((zzfs) this).zza;
        if (bArr.length * 8 < 32) {
            int i = bArr[0] & 255;
            for (int i2 = 1; i2 < bArr.length; i2++) {
                i |= (bArr[i2] & 255) << (i2 * 8);
            }
            return i;
        }
        int length = bArr.length;
        if (length < 4) {
            ny61.r(jsa1.h("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
            return 0;
        }
        int i3 = bArr[0] & 255;
        int i4 = bArr[1] & 255;
        int i5 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i3 | (i4 << 8) | (i5 << 16);
    }

    public final String toString() {
        byte[] bArr = ((zzfs) this).zza;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & PKIBody._CCP]);
        }
        return sb.toString();
    }
}
