package xsna;

/* compiled from: ClipsDraftComponent.kt */
/* loaded from: classes17.dex */
public final class edo {
    public final String a;
    public final boolean b;

    public edo(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edo)) {
            return false;
        }
        edo edoVar = (edo) obj;
        return epx.f(this.a, edoVar.a) && this.b == edoVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Added(draftId=");
        sb.append(this.a);
        sb.append(", isActive=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
