package com.google.android.gms.internal.play_billing;

import defpackage.b64;
import defpackage.kxa1;
import defpackage.mw91;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.q77;
import defpackage.q7a1;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class zzgk implements Iterable, Serializable {
    public static final zzgk a = new zzgi(q7a1.b);
    private int zza = 0;

    static {
        int i = mw91.a;
    }

    public static int g(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            ny61.m(oyr.j(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            ny61.m(oyr.h(i, i2, "Beginning index larger than ending index: ", Extension.FIX_SPACE));
            return 0;
        }
        ny61.m(oyr.h(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static zzgk i(int i, int i2, byte[] bArr) {
        g(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzgi(bArr2);
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
        byte[] bArr = ((zzgi) this).zza;
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
            concat = kxa1.e(this);
        } else {
            zzgi zzgiVar = (zzgi) this;
            int g = g(0, 47, zzgiVar.f());
            concat = kxa1.e(g == 0 ? a : new zzgf(zzgiVar.zza, g)).concat("...");
        }
        return oyr.t(b64.u(f, "<ByteString@", hexString, " size=", " contents=\""), concat, "\">");
    }
}
