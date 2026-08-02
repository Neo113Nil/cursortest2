package xsna;

/* compiled from: OwnerData.kt */
/* loaded from: classes6.dex */
public final class zog {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public zog() {
        this(false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zog)) {
            return false;
        }
        zog zogVar = (zog) obj;
        return this.a == zogVar.a && this.b == zogVar.b && this.c == zogVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityAccessLevel(isAdmin=");
        sb.append(this.a);
        sb.append(", isEditor=");
        sb.append(this.b);
        sb.append(", isModerator=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public zog(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
