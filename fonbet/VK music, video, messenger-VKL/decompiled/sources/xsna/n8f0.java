package xsna;

import java.util.regex.Pattern;
import okhttp3.m;

/* compiled from: RealResponseBody.kt */
/* loaded from: classes8.dex */
public final class n8f0 extends okhttp3.v {
    public final String d;
    public final long e;
    public final bn8 f;

    public n8f0(String str, long j, bn8 bn8Var) {
        this.d = str;
        this.e = j;
        this.f = bn8Var;
    }

    @Override // okhttp3.v
    public final long contentLength() {
        return this.e;
    }

    @Override // okhttp3.v
    public final okhttp3.m contentType() {
        String str = this.d;
        if (str == null) {
            return null;
        }
        Pattern pattern = okhttp3.m.e;
        try {
            return m.a.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // okhttp3.v
    public final bn8 source() {
        return this.f;
    }
}
