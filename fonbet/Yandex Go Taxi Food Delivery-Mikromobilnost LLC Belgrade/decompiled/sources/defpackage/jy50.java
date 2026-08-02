package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class jy50 {
    public static final iy50 Companion = new iy50();
    public final String a;
    public final String b;

    public /* synthetic */ jy50(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, hy50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy50)) {
            return false;
        }
        jy50 jy50Var = (jy50) obj;
        return jl40.l(this.a, jy50Var.a) && jl40.l(this.b, jy50Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkPlaqueSeenRequestModel(feedbackToken=");
        sb.append(this.a);
        sb.append(", seenContext=");
        return b64.p(sb, this.b, ')');
    }

    public jy50(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
