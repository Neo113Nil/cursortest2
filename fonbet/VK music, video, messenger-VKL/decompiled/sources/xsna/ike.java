package xsna;

/* compiled from: ClipsLinksEditState.kt */
/* loaded from: classes16.dex */
public final class ike implements km50 {
    public static final ike f = new ike("", "", false, "");
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public ike(String str, String str2, boolean z, String str3) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
    }

    public static ike a(ike ikeVar, String str, String str2, boolean z, int i) {
        if ((i & 1) != 0) {
            str = ikeVar.b;
        }
        if ((i & 2) != 0) {
            str2 = ikeVar.c;
        }
        String str3 = ikeVar.e;
        ikeVar.getClass();
        return new ike(str, str2, z, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ike)) {
            return false;
        }
        ike ikeVar = (ike) obj;
        return epx.f(this.b, ikeVar.b) && epx.f(this.c, ikeVar.c) && this.d == ikeVar.d && epx.f(this.e, ikeVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsLinksEditState(link=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", saveEnabled=");
        sb.append(this.d);
        sb.append(", fragmentResultKey=");
        return ho8.a(sb, this.e, ')');
    }
}
