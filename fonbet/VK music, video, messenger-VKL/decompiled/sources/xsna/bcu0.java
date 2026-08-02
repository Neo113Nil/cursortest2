package xsna;

import java.util.List;

/* compiled from: VkAuthExtendedSilentToken.kt */
/* loaded from: classes6.dex */
public final class bcu0 {
    public final String a;
    public final String b;
    public final long c;
    public final List<String> d;
    public final List<String> e;

    public bcu0(String str, String str2, long j, List<String> list, List<String> list2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcu0)) {
            return false;
        }
        bcu0 bcu0Var = (bcu0) obj;
        return epx.f(this.a, bcu0Var.a) && epx.f(this.b, bcu0Var.b) && this.c == bcu0Var.c && epx.f(this.d, bcu0Var.d) && epx.f(this.e, bcu0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + fw3.a(bh10.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkAuthExtendedSilentToken(silentToken=");
        sb.append(this.a);
        sb.append(", silentTokenUuid=");
        sb.append(this.b);
        sb.append(", expireTime=");
        sb.append(this.c);
        sb.append(", providedHashes=");
        sb.append(this.d);
        sb.append(", providedUuids=");
        return ms9.a(')', sb, this.e);
    }
}
