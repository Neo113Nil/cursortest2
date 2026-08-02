package yads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import xsna.epx;

/* loaded from: classes10.dex */
public final class ke3 implements zk3 {
    public final String a;
    public final de1 b;
    public final String c;
    public final Map d;

    public ke3(String str, de1 de1Var, String str2, HashMap hashMap) {
        this.a = str;
        this.b = de1Var;
        this.c = str2;
        this.d = hashMap;
    }

    @Override // yads.zk3
    public final Map a() {
        return Collections.unmodifiableMap(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke3)) {
            return false;
        }
        ke3 ke3Var = (ke3) obj;
        return epx.f(this.a, ke3Var.a) && epx.f(this.b, ke3Var.b) && epx.f(this.c, ke3Var.c) && epx.f(this.d, ke3Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        de1 de1Var = this.b;
        int hashCode2 = (hashCode + (de1Var == null ? 0 : de1Var.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Verification(vendor=" + this.a + ", javaScriptResource=" + this.b + ", parameters=" + this.c + ", events=" + this.d + ")";
    }
}
