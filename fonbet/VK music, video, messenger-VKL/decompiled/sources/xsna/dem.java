package xsna;

/* compiled from: DialogGetMembersCmdResponse.kt */
/* loaded from: classes2.dex */
public final class dem {
    public final xpp<ohm> a;
    public final boolean b;

    public dem(xpp<ohm> xppVar, boolean z) {
        this.a = xppVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dem)) {
            return false;
        }
        dem demVar = (dem) obj;
        return epx.f(this.a, demVar.a) && this.b == demVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogGetMembersCmdResponse(list=");
        sb.append(this.a);
        sb.append(", hasMore=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
