package yads;

import xsna.epx;
import xsna.h5s;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class dm {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public dm(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) obj;
        return epx.f(this.a, dmVar.a) && epx.f(this.b, dmVar.b) && epx.f(this.c, dmVar.c) && epx.f(this.d, dmVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return h5s.d(xe9.a("BackgroundColors(top=", str, ", right=", str2, ", left="), this.c, ", bottom=", this.d, ")");
    }
}
