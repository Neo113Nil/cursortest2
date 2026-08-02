package defpackage;

/* loaded from: classes11.dex */
public final class bxg implements cxg {
    public final String a;
    public final String b;
    public final int c;

    public bxg(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxg)) {
            return false;
        }
        bxg bxgVar = (bxg) obj;
        return jl40.l(this.a, bxgVar.a) && jl40.l(this.b, bxgVar.b) && this.c == bxgVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InfoButton(label=");
        sb.append(this.a);
        sb.append(", notificationText=");
        sb.append(this.b);
        sb.append(", background=");
        return oyr.s(sb, this.c, ')');
    }

    public /* synthetic */ bxg(String str, int i) {
        this(str, null, i);
    }
}
