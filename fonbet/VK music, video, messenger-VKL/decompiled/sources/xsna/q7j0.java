package xsna;

/* compiled from: ShareMessage.kt */
/* loaded from: classes6.dex */
public final class q7j0 {
    public final Long a;
    public final String b;

    public q7j0(Long l, String str) {
        this.a = l;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final Long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7j0)) {
            return false;
        }
        q7j0 q7j0Var = (q7j0) obj;
        return epx.f(this.a, q7j0Var.a) && epx.f(this.b, q7j0Var.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareMessage(userId=");
        sb.append(this.a);
        sb.append(", text=");
        return ho8.a(sb, this.b, ')');
    }
}
