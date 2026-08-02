package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class mr50 implements co50 {
    public static final lr50 Companion = new lr50();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ mr50(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, kr50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr50)) {
            return false;
        }
        mr50 mr50Var = (mr50) obj;
        return jl40.l(this.a, mr50Var.a) && jl40.l(this.b, mr50Var.b) && jl40.l(this.c, mr50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkDeeplinkActionModel(actionContext=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", deeplink=");
        return b64.p(sb, this.c, ')');
    }
}
