package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class npg {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    static {
        ge10.a("media3.datasource");
    }

    public npg(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2) {
        d6z.l(j + j2 >= 0);
        d6z.l(j2 >= 0);
        d6z.l(j3 > 0 || j3 == -1);
        uri.getClass();
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
    }

    public static String b(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        ny61.k();
        return null;
    }

    public final mpg a() {
        mpg mpgVar = new mpg();
        mpgVar.a = this.a;
        mpgVar.b = this.b;
        mpgVar.c = this.c;
        mpgVar.d = this.d;
        mpgVar.e = this.e;
        mpgVar.f = this.f;
        mpgVar.g = this.g;
        mpgVar.h = this.h;
        mpgVar.i = this.i;
        return mpgVar;
    }

    public final boolean c(int i) {
        return (this.i & i) == i;
    }

    public final npg d(long j) {
        long j2 = this.g;
        return e(j, j2 != -1 ? j2 - j : -1L);
    }

    public final npg e(long j, long j2) {
        if (j == 0 && this.g == j2) {
            return this;
        }
        return new npg(this.a, this.b, this.c, this.d, this.e, this.f + j, j2, this.h, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b(this.c));
        sb.append(" ");
        sb.append(this.a);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.f);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.g);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.h);
        sb.append(Extension.FIX_SPACE);
        return oyr.m(this.i, "]", sb);
    }

    public npg(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j2, null, 0);
    }

    public npg(Uri uri) {
        this(uri, 0L, -1L);
    }
}
