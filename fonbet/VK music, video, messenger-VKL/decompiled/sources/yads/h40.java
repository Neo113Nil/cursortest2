package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.i5s;
import xsna.imi0;
import xsna.xe9;

@imi0
/* loaded from: classes10.dex */
public final class h40 {
    public static final g40 Companion = new g40();
    public static final KSerializer[] f = {null, null, new xsna.yk3(n50.a), null, null};
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;

    public /* synthetic */ h40(int i, String str, String str2, List list, String str3, String str4) {
        if (6 != (i & 6)) {
            xsna.sp.x(i, 6, f40.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        this.c = list;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h40)) {
            return false;
        }
        h40 h40Var = (h40) obj;
        return epx.f(this.a, h40Var.a) && epx.f(this.b, h40Var.b) && epx.f(this.c, h40Var.c) && epx.f(this.d, h40Var.d) && epx.f(this.e, h40Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int a = eb.a(this.c, k4.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.d;
        int hashCode = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        List list = this.c;
        String str3 = this.d;
        String str4 = this.e;
        StringBuilder a = xe9.a("DebugPanelAdUnitBiddingMediation(adapter=", str, ", networkName=", str2, ", biddingParameters=");
        xsna.vr.c(", adUnitId=", str3, ", networkAdUnitIdName=", a, list);
        return i5s.a(a, str4, ")");
    }
}
