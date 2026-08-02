package yads;

import xsna.epx;
import xsna.qoy;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class oi {
    public final String a;
    public final String b;
    public final Object c;
    public final jg1 d;
    public final boolean e;
    public final boolean f;

    public oi(String str, String str2, Object obj, jg1 jg1Var, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = jg1Var;
        this.e = z;
        this.f = z2;
    }

    public final jg1 a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final Object c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi)) {
            return false;
        }
        oi oiVar = (oi) obj;
        return epx.f(this.a, oiVar.a) && epx.f(this.b, oiVar.b) && epx.f(this.c, oiVar.c) && epx.f(this.d, oiVar.d) && this.e == oiVar.e && this.f == oiVar.f;
    }

    public final int hashCode() {
        int a = k4.a(this.b, this.a.hashCode() * 31, 31);
        Object obj = this.c;
        int hashCode = (a + (obj == null ? 0 : obj.hashCode())) * 31;
        jg1 jg1Var = this.d;
        return Boolean.hashCode(this.f) + qoy.b((hashCode + (jg1Var != null ? jg1Var.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        Object obj = this.c;
        jg1 jg1Var = this.d;
        boolean z = this.e;
        boolean z2 = this.f;
        StringBuilder a = xe9.a("Asset(name=", str, ", type=", str2, ", value=");
        a.append(obj);
        a.append(", link=");
        a.append(jg1Var);
        a.append(", isClickable=");
        a.append(z);
        a.append(", isRequired=");
        a.append(z2);
        a.append(")");
        return a.toString();
    }
}
