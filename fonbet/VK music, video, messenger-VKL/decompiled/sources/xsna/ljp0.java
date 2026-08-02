package xsna;

import android.net.Uri;

/* compiled from: SpanContext.kt */
/* loaded from: classes17.dex */
public final class ljp0 {
    public final Uri a;
    public final String b;
    public final String c;

    public ljp0(Uri uri, String str, String str2) {
        this.a = uri;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljp0)) {
            return false;
        }
        ljp0 ljp0Var = (ljp0) obj;
        return epx.f(this.a, ljp0Var.a) && epx.f(this.b, ljp0Var.b) && epx.f(this.c, ljp0Var.c);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferKey(uri=");
        sb.append(this.a);
        sb.append(", httpMethod=");
        sb.append(this.b);
        sb.append(", rangeHeader=");
        return ho8.a(sb, this.c, ')');
    }
}
