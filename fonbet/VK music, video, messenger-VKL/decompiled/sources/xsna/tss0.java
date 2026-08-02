package xsna;

/* compiled from: VideoMaxInstallConfig.kt */
/* loaded from: classes11.dex */
public final class tss0 {
    public static final a d = new a();
    public final String a;
    public final String b;
    public final String c;

    /* compiled from: VideoMaxInstallConfig.kt */
    public static final class a {
    }

    public tss0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tss0)) {
            return false;
        }
        tss0 tss0Var = (tss0) obj;
        return epx.f(this.a, tss0Var.a) && epx.f(this.b, tss0Var.b) && epx.f(this.c, tss0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMaxInstallConfig(fromVideoInstallUrl=");
        sb.append(this.a);
        sb.append(", fromClipInstallUrl=");
        sb.append(this.b);
        sb.append(", fromPlaylistInstallUrl=");
        return ho8.a(sb, this.c, ')');
    }

    public /* synthetic */ tss0(int i) {
        this("", "", "");
    }

    public tss0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
