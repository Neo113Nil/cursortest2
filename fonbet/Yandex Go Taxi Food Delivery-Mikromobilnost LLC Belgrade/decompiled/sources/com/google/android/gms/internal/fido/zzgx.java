package com.google.android.gms.internal.fido;

import defpackage.b64;
import defpackage.h4a1;
import defpackage.hwa1;
import defpackage.j0a1;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.q77;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class zzgx implements Iterable<Byte>, Serializable {
    public static final zzgx a = new zzgu(h4a1.a);
    private int zzc = 0;

    static {
        int i = j0a1.a;
    }

    public static int k(int i, int i2, int i3) {
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

    public static zzgx m(int i, byte[] bArr) {
        k(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new zzgu(bArr2);
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract boolean equals(Object obj);

    public abstract int f();

    public abstract void g(int i, byte[] bArr);

    public abstract zzgx h(int i, int i2);

    public final int hashCode() {
        int i = this.zzc;
        if (i != 0) {
            return i;
        }
        int f = f();
        zzgu zzguVar = (zzgu) this;
        int p = zzguVar.p();
        byte[] bArr = h4a1.a;
        int i2 = f;
        for (int i3 = p; i3 < p + f; i3++) {
            i2 = (i2 * 31) + zzguVar.zza[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.zzc = i2;
        return i2;
    }

    public abstract ByteArrayInputStream i();

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new q77(this);
    }

    public abstract ByteBuffer j();

    public final int l() {
        return this.zzc;
    }

    public final byte[] n() {
        int f = f();
        if (f == 0) {
            return h4a1.a;
        }
        byte[] bArr = new byte[f];
        g(f, bArr);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return oyr.t(b64.u(f(), "<ByteString@", hexString, " size=", " contents=\""), f() <= 50 ? hwa1.g(this) : hwa1.g(h(0, 47)).concat("..."), "\">");
    }
}
