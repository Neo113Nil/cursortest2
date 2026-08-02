package xsna;

import android.net.Uri;

/* compiled from: ImageProxyCacheKey.kt */
/* loaded from: classes2.dex */
public final class clw implements ww8 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public clw(String str, int i, int i2, String str2, String str3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = str3;
    }

    @Override // xsna.ww8
    public final String a() {
        return this.a;
    }

    @Override // xsna.ww8
    public final boolean b() {
        return false;
    }

    @Override // xsna.ww8
    public final boolean c(Uri uri) {
        if (uri != null) {
            return drm0.D(this.a, uri.toString(), false);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clw)) {
            return false;
        }
        clw clwVar = (clw) obj;
        return epx.f(this.a, clwVar.a) && this.b == clwVar.b && this.c == clwVar.c && epx.f(this.d, clwVar.d) && epx.f(this.e, clwVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageProxyCacheKey(key=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", basePath=");
        sb.append(this.d);
        sb.append(", additionalParams=");
        return ho8.a(sb, this.e, ')');
    }
}
