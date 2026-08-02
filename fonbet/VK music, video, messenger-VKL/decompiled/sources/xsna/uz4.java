package xsna;

/* compiled from: AudioUrl.kt */
/* loaded from: classes3.dex */
public final class uz4 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public String d;

    public uz4() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz4)) {
            return false;
        }
        uz4 uz4Var = (uz4) obj;
        return epx.f(this.a, uz4Var.a) && this.b == uz4Var.b && this.c == uz4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioUrl(audioUrl=");
        sb.append(this.a);
        sb.append(", isHttpUrl=");
        sb.append(this.b);
        sb.append(", isInCache=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public uz4(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = "";
    }

    public /* synthetic */ uz4(String str, int i) {
        this((i & 1) != 0 ? "" : str, true, false);
    }
}
