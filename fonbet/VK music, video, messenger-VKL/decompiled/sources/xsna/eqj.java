package xsna;

/* compiled from: ControlButton.kt */
/* loaded from: classes16.dex */
public final class eqj {
    public final boolean a;
    public final boolean b;
    public final m9o c;

    public eqj(boolean z, boolean z2, m9o m9oVar) {
        this.a = z;
        this.b = z2;
        this.c = m9oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqj)) {
            return false;
        }
        eqj eqjVar = (eqj) obj;
        return this.a == eqjVar.a && this.b == eqjVar.b && epx.f(this.c, eqjVar.c);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        m9o m9oVar = this.c;
        return b + (m9oVar == null ? 0 : m9oVar.hashCode());
    }

    public final String toString() {
        return "ControlParams(isLiked=" + this.a + ", isFave=" + this.b + ", downloadProgress=" + this.c + ')';
    }
}
