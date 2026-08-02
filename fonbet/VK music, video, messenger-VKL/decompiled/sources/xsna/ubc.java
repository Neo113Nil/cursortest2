package xsna;

/* compiled from: ChristmasGarlandConfig.kt */
/* loaded from: classes11.dex */
public final class ubc {
    public static final a c = new a();
    public static final ubc d = new ubc(false, false);
    public final boolean a;
    public final boolean b;

    /* compiled from: ChristmasGarlandConfig.kt */
    public static final class a {
    }

    public ubc() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubc)) {
            return false;
        }
        ubc ubcVar = (ubc) obj;
        return this.a == ubcVar.a && this.b == ubcVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChristmasGarlandConfig(isGarlandEnabled=");
        sb.append(this.a);
        sb.append(", isStoryShadowEnabled=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public ubc(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
