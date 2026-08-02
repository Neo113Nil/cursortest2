package xsna;

/* compiled from: SettingsPayload.kt */
/* loaded from: classes3.dex */
public final class a3j0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public a3j0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3j0)) {
            return false;
        }
        a3j0 a3j0Var = (a3j0) obj;
        return epx.f(this.a, a3j0Var.a) && this.b == a3j0Var.b && this.c == a3j0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsPayload(optionId=");
        sb.append(this.a);
        sb.append(", isPressed=");
        sb.append(this.b);
        sb.append(", isCleared=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
