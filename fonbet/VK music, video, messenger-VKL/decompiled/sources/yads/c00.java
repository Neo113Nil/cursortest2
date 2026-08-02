package yads;

import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class c00 {
    public final String a;
    public final la b;
    public final String c;
    public final List d;

    public c00(String str, la laVar, String str2, List list) {
        this.a = str;
        this.b = laVar;
        this.c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c00)) {
            return false;
        }
        c00 c00Var = (c00) obj;
        return epx.f(this.a, c00Var.a) && epx.f(this.b, c00Var.b) && epx.f(this.c, c00Var.c) && epx.f(this.d, c00Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        la laVar = this.b;
        int hashCode2 = (hashCode + (laVar == null ? 0 : laVar.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CoreAdInfo(adUnitId=" + this.a + ", adSize=" + this.b + ", data=" + this.c + ", creatives=" + this.d + ")";
    }
}
