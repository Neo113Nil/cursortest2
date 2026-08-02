package xsna;

/* compiled from: ErrorData.kt */
/* loaded from: classes3.dex */
public final class ivp {
    public final int a;
    public final boolean b;
    public final boolean c;

    public ivp(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivp)) {
            return false;
        }
        ivp ivpVar = (ivp) obj;
        return this.a == ivpVar.a && this.b == ivpVar.b && this.c == ivpVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorData(titleRes=");
        sb.append(this.a);
        sb.append(", canRetry=");
        sb.append(this.b);
        sb.append(", isKidsPlaceholder=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
