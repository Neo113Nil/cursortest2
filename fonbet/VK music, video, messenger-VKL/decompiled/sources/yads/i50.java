package yads;

import xsna.epx;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class i50 {
    public final String a;
    public final String b;
    public final h50 c;

    public i50(String str, String str2, h50 h50Var) {
        this.a = str;
        this.b = str2;
        this.c = h50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i50)) {
            return false;
        }
        i50 i50Var = (i50) obj;
        return epx.f(this.a, i50Var.a) && epx.f(this.b, i50Var.b) && this.c == i50Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        h50 h50Var = this.c;
        StringBuilder a = xe9.a("DebugPanelAlertData(title=", str, ", message=", str2, ", type=");
        a.append(h50Var);
        a.append(")");
        return a.toString();
    }
}
