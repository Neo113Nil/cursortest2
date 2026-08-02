package xsna;

/* compiled from: VoipCallServicePatch.kt */
/* loaded from: classes7.dex */
public final class hiw0 implements giw0 {
    public final String b;
    public final Throwable c;

    public hiw0(String str, Throwable th) {
        this.b = str;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hiw0)) {
            return false;
        }
        hiw0 hiw0Var = (hiw0) obj;
        return epx.f(this.b, hiw0Var.b) && epx.f(this.c, hiw0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(query=");
        sb.append(this.b);
        sb.append(", throwable=");
        return oq.c(sb, this.c, ')');
    }
}
