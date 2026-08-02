package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DataSpec.java */
/* loaded from: classes12.dex */
public final class evk {
    public final Uri a;
    public final long b;
    public final int c;

    @Nullable
    public final byte[] d;
    public final Map<String, String> e;

    @Deprecated
    public final long f;
    public final long g;
    public final long h;

    @Nullable
    public final String i;
    public final int j;

    @Nullable
    public final Object k;

    /* compiled from: DataSpec.java */
    public static final class a {

        @Nullable
        public Uri a;
        public long b;
        public int c;

        @Nullable
        public byte[] d;
        public Map<String, String> e;
        public long f;
        public long g;

        @Nullable
        public String h;
        public int i;

        @Nullable
        public Object j;

        public final evk a() {
            fxc0.t(this.a, "The uri must be set.");
            return new evk(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
    }

    static {
        nr10.a("media3.datasource");
    }

    public evk(Uri uri) {
        this(uri, 0L, -1L, 0);
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
        throw new IllegalStateException();
    }

    public final a a() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.g;
        aVar.g = this.h;
        aVar.h = this.i;
        aVar.i = this.j;
        aVar.j = this.k;
        return aVar;
    }

    public final boolean c(int i) {
        return (this.j & i) == i;
    }

    public final evk d(long j) {
        long j2 = this.h;
        return e(j, j2 != -1 ? j2 - j : -1L);
    }

    public final evk e(long j, long j2) {
        if (j == 0 && this.h == j2) {
            return this;
        }
        return new evk(this.a, this.b, this.c, this.d, this.e, this.g + j, j2, this.i, this.j, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b(this.c));
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        return h5s.c(this.j, X3.j.e, sb);
    }

    @Deprecated
    public evk(Uri uri, long j, long j2, int i) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j2, null, 0, null);
    }

    public evk(Uri uri, long j, int i, @Nullable byte[] bArr, Map<String, String> map, long j2, long j3, @Nullable String str, int i2, @Nullable Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        fxc0.p(j4 >= 0);
        fxc0.p(j2 >= 0);
        fxc0.p(j3 > 0 || j3 == -1);
        uri.getClass();
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.g = j2;
        this.f = j4;
        this.h = j3;
        this.i = str;
        this.j = i2;
        this.k = obj;
    }
}
