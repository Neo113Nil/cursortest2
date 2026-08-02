package yads;

import xsna.epx;
import xsna.i5s;

/* loaded from: classes10.dex */
public final class ab {
    public final boolean a;
    public final String b;
    public final String c;

    public ab(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return this.a == abVar.a && epx.f(this.b, abVar.b) && epx.f(this.c, abVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k4.a(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        boolean z = this.a;
        String str = this.b;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder("AdTuneInfo(shouldShow=");
        sb.append(z);
        sb.append(", token=");
        sb.append(str);
        sb.append(", advertiserInfo=");
        return i5s.a(sb, str2, ")");
    }
}
