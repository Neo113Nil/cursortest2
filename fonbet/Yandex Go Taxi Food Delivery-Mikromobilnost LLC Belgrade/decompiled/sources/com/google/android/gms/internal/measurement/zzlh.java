package com.google.android.gms.internal.measurement;

import defpackage.ara1;
import defpackage.b64;
import defpackage.dya1;
import defpackage.f1b1;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.q77;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class zzlh implements Iterable, Serializable {
    public static final zzlh a = new zzlg(f1b1.b);
    private int zza = 0;

    static {
        int i = ara1.a;
    }

    public static zzlh g(int i, int i2, byte[] bArr) {
        i(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzlg(bArr2);
    }

    public static int i(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            ny61.m(b64.q(new StringBuilder(String.valueOf(i).length() + 21), "Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb.append("Beginning index larger than ending index: ");
            sb.append(i);
            sb.append(Extension.FIX_SPACE);
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb2.append("End index: ");
        sb2.append(i2);
        sb2.append(" >= ");
        sb2.append(i3);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract boolean equals(Object obj);

    public abstract int f();

    public final int h() {
        return this.zza;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int f = f();
        byte[] bArr = ((zzlg) this).zza;
        int i2 = f;
        for (int i3 = 0; i3 < f; i3++) {
            i2 = (i2 * 31) + bArr[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.zza = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new q77(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int f = f();
        if (f() <= 50) {
            concat = dya1.g(this);
        } else {
            zzlg zzlgVar = (zzlg) this;
            int i = i(0, 47, zzlgVar.f());
            concat = dya1.g(i == 0 ? a : new zzlc(zzlgVar.zza, i)).concat("...");
        }
        return oyr.t(b64.u(f, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }
}
