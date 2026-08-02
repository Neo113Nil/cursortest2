package xsna;

/* compiled from: ZstdToggleConfig.kt */
/* loaded from: classes11.dex */
public final class v7y0 {
    public static final a d = new a();
    public static final v7y0 e = new v7y0(0);
    public final boolean a;
    public final boolean b;
    public final String c;

    /* compiled from: ZstdToggleConfig.kt */
    public static final class a {
    }

    public v7y0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7y0)) {
            return false;
        }
        v7y0 v7y0Var = (v7y0) obj;
        return this.a == v7y0Var.a && this.b == v7y0Var.b && epx.f(this.c, v7y0Var.c);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZstdToggleConfig(zstdEnabled=");
        sb.append(this.a);
        sb.append(", statEnabled=");
        sb.append(this.b);
        sb.append(", overrideDictVersion=");
        return ho8.a(sb, this.c, ')');
    }

    public /* synthetic */ v7y0(int i) {
        this(false, false, null);
    }

    public v7y0(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }
}
