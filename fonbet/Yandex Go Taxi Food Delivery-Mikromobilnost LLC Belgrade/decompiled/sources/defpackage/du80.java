package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class du80 {
    public static final cu80 Companion = new cu80();
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;

    public /* synthetic */ du80(String str, int i, String str2, String str3, boolean z) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, bu80.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du80)) {
            return false;
        }
        du80 du80Var = (du80) obj;
        return jl40.l(this.a, du80Var.a) && this.b == du80Var.b && jl40.l(this.c, du80Var.c) && jl40.l(this.d, du80Var.d);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryUrl(url=");
        sb.append(this.a);
        sb.append(", active=");
        sb.append(this.b);
        sb.append(", data=");
        sb.append(this.c);
        sb.append(", storyId=");
        return b64.p(sb, this.d, ')');
    }
}
