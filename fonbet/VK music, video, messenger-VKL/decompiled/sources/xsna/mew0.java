package xsna;

/* compiled from: VoipAsrRecordInfo.kt */
/* loaded from: classes7.dex */
public final class mew0 {
    public final boolean a;
    public final boolean b;
    public final whr0 c;
    public final Boolean d;

    public mew0(boolean z, boolean z2, whr0 whr0Var, Boolean bool) {
        this.a = z;
        this.b = z2;
        this.c = whr0Var;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mew0)) {
            return false;
        }
        mew0 mew0Var = (mew0) obj;
        return this.a == mew0Var.a && this.b == mew0Var.b && epx.f(this.c, mew0Var.c) && epx.f(this.d, mew0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31;
        Boolean bool = this.d;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipAsrRecordInfo(isMeAsrAuthor=");
        sb.append(this.a);
        sb.append(", canStop=");
        sb.append(this.b);
        sb.append(", author=");
        sb.append(this.c);
        sb.append(", amIStopper=");
        return tn.a(sb, this.d, ')');
    }
}
