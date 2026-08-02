package xsna;

/* compiled from: SelectionEvent.kt */
/* loaded from: classes4.dex */
public final class wci0 {
    public final wq10 a;
    public final boolean b;

    public wci0(wq10 wq10Var, boolean z) {
        this.a = wq10Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wci0)) {
            return false;
        }
        wci0 wci0Var = (wci0) obj;
        return epx.f(this.a, wci0Var.a) && this.b == wci0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionEvent(mediaEntry=");
        sb.append(this.a);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
