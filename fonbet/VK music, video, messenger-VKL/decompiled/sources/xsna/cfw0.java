package xsna;

/* compiled from: VoipBroadcastCreateResponse.kt */
/* loaded from: classes7.dex */
public final class cfw0 {
    public final String a;
    public final String b;
    public final String c;

    public cfw0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfw0)) {
            return false;
        }
        cfw0 cfw0Var = (cfw0) obj;
        return epx.f(this.a, cfw0Var.a) && epx.f(this.b, cfw0Var.b) && epx.f(this.c, cfw0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipBroadcastCreateResponse(id=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", streamId=");
        return ho8.a(sb, this.c, ')');
    }
}
