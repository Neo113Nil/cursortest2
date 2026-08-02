package xsna;

/* compiled from: PasskeyBeginResult.kt */
/* loaded from: classes6.dex */
public final class rl90 {
    public final String a;
    public final String b;

    public rl90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl90)) {
            return false;
        }
        rl90 rl90Var = (rl90) obj;
        return epx.f(this.a, rl90Var.a) && epx.f(this.b, rl90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PasskeyBeginResult(passkeyData=");
        sb.append(this.a);
        sb.append(", sid=");
        return ho8.a(sb, this.b, ')');
    }
}
