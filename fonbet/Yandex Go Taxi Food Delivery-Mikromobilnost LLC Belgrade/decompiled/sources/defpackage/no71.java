package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class no71 {
    public static final /* synthetic */ int i = 0;
    public final Uri a;
    public final long b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final String g;
    public final int h;

    static {
        xc81.a("goog.exo.datasource");
    }

    public no71(Uri uri, long j, byte[] bArr, Map map, long j2, long j3, String str, int i2) {
        if (j + j2 < 0) {
            w511.q();
            throw null;
        }
        if (j2 < 0) {
            w511.q();
            throw null;
        }
        if (j3 <= 0 && j3 != -1) {
            w511.q();
            throw null;
        }
        this.a = uri;
        this.b = j;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = Collections.unmodifiableMap(new HashMap(map));
        this.e = j2;
        this.f = j3;
        this.g = str;
        this.h = i2;
    }

    public final no71 a(long j, long j2) {
        if (j == 0 && this.f == j2) {
            return this;
        }
        return new no71(this.a, this.b, this.c, this.d, this.e + j, j2, this.g, this.h);
    }

    public final String toString() {
        StringBuilder x = unr0.x("DataSpec[", "GET", " ");
        x.append(this.a);
        x.append(Extension.FIX_SPACE);
        x.append(this.e);
        x.append(Extension.FIX_SPACE);
        x.append(this.f);
        x.append(Extension.FIX_SPACE);
        x.append(this.g);
        x.append(Extension.FIX_SPACE);
        return oyr.m(this.h, "]", x);
    }
}
