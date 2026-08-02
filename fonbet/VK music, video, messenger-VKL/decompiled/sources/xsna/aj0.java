package xsna;

/* compiled from: AdUserData.kt */
/* loaded from: classes18.dex */
public final class aj0 {
    public final String a;
    public final boolean b;
    public final int c;
    public final String d;

    public aj0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj0)) {
            return false;
        }
        aj0 aj0Var = (aj0) obj;
        return epx.f(this.a, aj0Var.a) && this.b == aj0Var.b && this.c == aj0Var.c && epx.f(this.d, aj0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + shy.a(this.c, qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdUserData(vkId=");
        sb.append(this.a);
        sb.append(", isFemale=");
        sb.append(this.b);
        sb.append(", age=");
        sb.append(this.c);
        sb.append(", appId=");
        return ho8.a(sb, this.d, ')');
    }

    public /* synthetic */ aj0(int i) {
        this(-1, null, "", false);
    }

    public aj0(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = str2;
    }
}
