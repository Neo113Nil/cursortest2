package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class hod {
    public static final god Companion = new god();
    public final String a;
    public final String b;

    public /* synthetic */ hod(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, fod.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hod)) {
            return false;
        }
        hod hodVar = (hod) obj;
        return jl40.l(this.a, hodVar.a) && jl40.l(this.b, hodVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(text=");
        sb.append(this.a);
        sb.append(", link=");
        return b64.p(sb, this.b, ')');
    }
}
