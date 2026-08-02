package xsna;

/* compiled from: VideoFocusTransitionData.kt */
/* loaded from: classes6.dex */
public final class bms0 {
    public final iht0 a;
    public final iht0 b;
    public final boolean c;
    public final String d;

    public bms0(iht0 iht0Var, iht0 iht0Var2, boolean z, String str) {
        this.a = iht0Var;
        this.b = iht0Var2;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bms0)) {
            return false;
        }
        bms0 bms0Var = (bms0) obj;
        return epx.f(this.a, bms0Var.a) && epx.f(this.b, bms0Var.b) && this.c == bms0Var.c && epx.f(this.d, bms0Var.d);
    }

    public final int hashCode() {
        iht0 iht0Var = this.a;
        int hashCode = (iht0Var == null ? 0 : iht0Var.hashCode()) * 31;
        iht0 iht0Var2 = this.b;
        int b = qoy.b((hashCode + (iht0Var2 == null ? 0 : iht0Var2.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoFocusTransitionData(from=");
        sb.append(this.a);
        sb.append(", to=");
        sb.append(this.b);
        sb.append(", isSameVideo=");
        sb.append(this.c);
        sb.append(", reason=");
        return ho8.a(sb, this.d, ')');
    }
}
