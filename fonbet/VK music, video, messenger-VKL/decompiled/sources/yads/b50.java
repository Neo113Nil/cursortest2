package yads;

import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.n6j;
import xsna.qoy;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class b50 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final a50 g;
    public final List h;

    public b50(String str, String str2, boolean z, String str3, String str4, String str5, a50 a50Var, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = a50Var;
        this.h = arrayList;
    }

    public final a50 a() {
        return this.g;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b50)) {
            return false;
        }
        b50 b50Var = (b50) obj;
        return epx.f(this.a, b50Var.a) && epx.f(this.b, b50Var.b) && this.c == b50Var.c && epx.f(this.d, b50Var.d) && epx.f(this.e, b50Var.e) && epx.f(this.f, b50Var.f) && epx.f(this.g, b50Var.g) && epx.f(this.h, b50Var.h);
    }

    public final String f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode4 = (this.g.hashCode() + ((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        List list = this.h;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        boolean z = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        a50 a50Var = this.g;
        List list = this.h;
        StringBuilder a = xe9.a("DebugPanelAdapterData(name=", str, ", logoUrl=", str2, ", adapterIntegrationStatus=");
        a.append(z);
        a.append(", adapterVersion=");
        a.append(str3);
        a.append(", latestAdapterVersion=");
        n6j.b(a, str4, ", sdkVersion=", str5, ", adapterStatus=");
        a.append(a50Var);
        a.append(", formats=");
        a.append(list);
        a.append(")");
        return a.toString();
    }
}
