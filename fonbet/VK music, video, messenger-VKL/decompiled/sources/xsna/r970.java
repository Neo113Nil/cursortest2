package xsna;

import xsna.i870;

/* compiled from: NotificationDisabledState.kt */
/* loaded from: classes4.dex */
public final class r970 {
    public final String a;
    public final i870.a b;

    public r970(String str, i870.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r970)) {
            return false;
        }
        r970 r970Var = (r970) obj;
        return epx.f(this.a, r970Var.a) && epx.f(this.b, r970Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NotificationDisabledState(title=" + this.a + ", buttons=" + this.b + ')';
    }
}
