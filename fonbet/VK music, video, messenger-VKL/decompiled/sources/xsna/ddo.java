package xsna;

/* compiled from: ClipsDraftComponent.kt */
/* loaded from: classes17.dex */
public final class ddo {
    public final String a;
    public final boolean b;

    public ddo(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddo)) {
            return false;
        }
        ddo ddoVar = (ddo) obj;
        return epx.f(this.a, ddoVar.a) && this.b == ddoVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveStatusChanged(draftId=");
        sb.append(this.a);
        sb.append(", isActive=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
