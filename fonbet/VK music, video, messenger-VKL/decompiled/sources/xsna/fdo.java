package xsna;

/* compiled from: ClipsDraftComponent.kt */
/* loaded from: classes17.dex */
public final class fdo {
    public final String a;
    public final boolean b;

    public fdo(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdo)) {
            return false;
        }
        fdo fdoVar = (fdo) obj;
        return epx.f(this.a, fdoVar.a) && this.b == fdoVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Modified(draftId=");
        sb.append(this.a);
        sb.append(", updateTimestamp=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
