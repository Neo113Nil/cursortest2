package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class ev80 implements pw80 {
    public static final dv80 Companion = new dv80();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ ev80(int i, String str, String str2, String str3) {
        if (6 != (i & 6)) {
            qje.Z(i, 6, cv80.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        this.c = str3;
        if (evu0.J(str2)) {
            ny61.g("Error create SendMetricsEvent, eventName is blank");
            throw null;
        }
        if (evu0.J(str3)) {
            ny61.g("Error create SendMetricsEvent, eventValue is blank");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev80)) {
            return false;
        }
        ev80 ev80Var = (ev80) obj;
        return jl40.l(this.a, ev80Var.a) && jl40.l(this.b, ev80Var.b) && jl40.l(this.c, ev80Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendMetricsEvent(trackId=");
        sb.append(this.a);
        sb.append(", eventName=");
        sb.append(this.b);
        sb.append(", eventValue=");
        return b64.p(sb, this.c, ')');
    }
}
