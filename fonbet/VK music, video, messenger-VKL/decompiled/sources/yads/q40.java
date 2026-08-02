package yads;

import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class q40 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final p40 f;

    public q40(String str, String str2, ArrayList arrayList, String str3, String str4, p40 p40Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = p40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q40)) {
            return false;
        }
        q40 q40Var = (q40) obj;
        return epx.f(this.a, q40Var.a) && epx.f(this.b, q40Var.b) && epx.f(this.c, q40Var.c) && epx.f(this.d, q40Var.d) && epx.f(this.e, q40Var.e) && epx.f(this.f, q40Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int a = eb.a(this.c, k4.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.d;
        int hashCode = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return this.f.hashCode() + ((hashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        List list = this.c;
        String str3 = this.d;
        String str4 = this.e;
        p40 p40Var = this.f;
        StringBuilder a = xe9.a("DebugPanelAdUnitMediationAdapterData(logoUrl=", str, ", adapterName=", str2, ", parameters=");
        xsna.vr.c(", adUnitId=", str3, ", networkAdUnitIdName=", a, list);
        a.append(str4);
        a.append(", type=");
        a.append(p40Var);
        a.append(")");
        return a.toString();
    }
}
