package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public class mes {
    public final List a;
    public long b = 0;
    public long c = 0;
    public boolean d = false;

    public mes(List list) {
        this.a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        mes mesVar = (mes) obj;
        return this.b == mesVar.b && this.c == mesVar.c && this.d == mesVar.d && jl40.l(this.a, mesVar.a);
    }

    public int hashCode() {
        return this.a.hashCode() + unr0.e(qv10.c(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FrameData(frameStartNanos=");
        sb.append(this.b);
        sb.append(", frameDurationUiNanos=");
        sb.append(this.c);
        sb.append(", isJank=");
        sb.append(this.d);
        sb.append(", states=");
        return unr0.t(sb, this.a, ')');
    }
}
