package yads;

import xsna.epx;
import xsna.i5s;
import xsna.imi0;
import xsna.xe9;

@imi0
/* loaded from: classes10.dex */
public final class g50 {
    public static final f50 Companion = new f50();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ g50(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g50)) {
            return false;
        }
        g50 g50Var = (g50) obj;
        return epx.f(this.a, g50Var.a) && epx.f(this.b, g50Var.b) && epx.f(this.c, g50Var.c);
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
        return i5s.a(xe9.a("DebugPanelAlert(title=", str, ", message=", str2, ", type="), this.c, ")");
    }
}
