package yads;

import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.n6j;
import xsna.vp;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class s23 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final dm e;
    public final k23 f;
    public final List g;

    public s23(String str, String str2, String str3, String str4, dm dmVar, k23 k23Var, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = dmVar;
        this.f = k23Var;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s23)) {
            return false;
        }
        s23 s23Var = (s23) obj;
        return epx.f(this.a, s23Var.a) && epx.f(this.b, s23Var.b) && epx.f(this.c, s23Var.c) && epx.f(this.d, s23Var.d) && epx.f(this.e, s23Var.e) && epx.f(this.f, s23Var.f) && epx.f(this.g, s23Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        dm dmVar = this.e;
        int hashCode5 = (hashCode4 + (dmVar == null ? 0 : dmVar.hashCode())) * 31;
        k23 k23Var = this.f;
        int hashCode6 = (hashCode5 + (k23Var == null ? 0 : k23Var.hashCode())) * 31;
        List list = this.g;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        dm dmVar = this.e;
        k23 k23Var = this.f;
        List list = this.g;
        StringBuilder a = xe9.a("SmartCenterSettings(colorWizButton=", str, ", colorWizButtonText=", str2, ", colorWizBack=");
        n6j.b(a, str3, ", colorWizBackRight=", str4, ", backgroundColors=");
        a.append(dmVar);
        a.append(", smartCenter=");
        a.append(k23Var);
        a.append(", smartCenters=");
        return vp.b(")", a, list);
    }
}
