package xsna;

/* compiled from: PlayingUri.kt */
/* loaded from: classes3.dex */
public final class x6b0 {
    private static final x6b0 STUB;
    public static final a d = new a();
    public String a;
    public String b;
    public boolean c;

    /* compiled from: PlayingUri.kt */
    public static final class a {
        public final x6b0 getSTUB() {
            return x6b0.STUB;
        }
    }

    static {
        x6b0 x6b0Var = new x6b0();
        x6b0Var.a = null;
        x6b0Var.b = null;
        x6b0Var.c = false;
        STUB = x6b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6b0)) {
            return false;
        }
        x6b0 x6b0Var = (x6b0) obj;
        return epx.f(this.a, x6b0Var.a) && epx.f(this.b, x6b0Var.b) && this.c == x6b0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayingUri(type=");
        sb.append(this.a);
        sb.append(", uri=");
        sb.append(this.b);
        sb.append(", isDefaultUriUnavailable=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
