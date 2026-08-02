package xsna;

/* compiled from: HelperScrollSettings.kt */
/* loaded from: classes2.dex */
public final class d2v {
    public final boolean a;
    public final boolean b;

    public d2v(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2v)) {
            return false;
        }
        d2v d2vVar = (d2v) obj;
        return this.a == d2vVar.a && this.b == d2vVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HelperScrollSettings(playOnlyOnIdle=");
        sb.append(this.a);
        sb.append(", playOnCacheSupported=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
