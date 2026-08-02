package xsna;

/* compiled from: GroupCellConfiguration.kt */
/* loaded from: classes16.dex */
public final class iju {
    public final String a;
    public final boolean b;
    public final boolean c;

    public iju(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iju)) {
            return false;
        }
        iju ijuVar = (iju) obj;
        return epx.f(this.a, ijuVar.a) && this.b == ijuVar.b && this.c == ijuVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdditionalInfo(location=");
        sb.append(this.a);
        sb.append(", isGovernmentOrganization=");
        sb.append(this.b);
        sb.append(", isNonProfitOrganization=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
