package xsna;

import com.vk.im.nspkchooser.impl.nspk.Source;

/* compiled from: SbpLinkData.kt */
/* loaded from: classes2.dex */
public final class b3h0 {
    public final String a;
    public final Long b;
    public final String c;
    public final String d;
    public final Source e;

    public b3h0(String str, Long l, String str2, String str3, Source source) {
        this.a = str;
        this.b = l;
        this.c = str2;
        this.d = str3;
        this.e = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3h0)) {
            return false;
        }
        b3h0 b3h0Var = (b3h0) obj;
        return epx.f(this.a, b3h0Var.a) && epx.f(this.b, b3h0Var.b) && epx.f(this.c, b3h0Var.c) && epx.f(this.d, b3h0Var.d) && this.e == b3h0Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int a = urd0.a((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Source source = this.e;
        return a + (source != null ? source.hashCode() : 0);
    }

    public final String toString() {
        return "SbpLinkData(linkId=" + this.a + ", sum=" + this.b + ", currency=" + this.c + ", bankId=" + this.d + ", source=" + this.e + ')';
    }
}
