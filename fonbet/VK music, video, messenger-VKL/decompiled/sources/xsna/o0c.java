package xsna;

/* compiled from: CheckInviteUserData.kt */
/* loaded from: classes6.dex */
public final class o0c {
    public final String a;
    public final String b;

    public o0c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0c)) {
            return false;
        }
        o0c o0cVar = (o0c) obj;
        return epx.f(this.a, o0cVar.a) && epx.f(this.b, o0cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckInviteUserData(text=");
        sb.append(this.a);
        sb.append(", photoUrl=");
        return ho8.a(sb, this.b, ')');
    }
}
