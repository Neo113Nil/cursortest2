package yads;

import xsna.epx;
import xsna.i5s;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class jk {
    public final String a;
    public final String b;
    public final String c;

    public jk(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk)) {
            return false;
        }
        jk jkVar = (jk) obj;
        return epx.f(this.a, jkVar.a) && epx.f(this.b, jkVar.b) && epx.f(this.c, jkVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k4.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return i5s.a(xe9.a("Attributes(campaignId=", str, ", bannerId=", str2, ", placeId="), this.c, ")");
    }
}
