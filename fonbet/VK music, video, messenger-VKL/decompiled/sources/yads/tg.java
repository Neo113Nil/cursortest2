package yads;

import xsna.epx;
import xsna.i5s;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class tg {
    public final String a;
    public final String b;
    public final String c;

    public tg(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg)) {
            return false;
        }
        tg tgVar = (tg) obj;
        return epx.f(this.a, tgVar.a) && epx.f(this.b, tgVar.b) && epx.f(this.c, tgVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return i5s.a(xe9.a("AppMetricaIdentifiers(adGetUrl=", str, ", deviceId=", str2, ", uuid="), this.c, ")");
    }
}
