package defpackage;

/* loaded from: classes2.dex */
public final class ecp implements gcp {
    public final String a;
    public final String b;

    public ecp(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecp)) {
            return false;
        }
        ecp ecpVar = (ecp) obj;
        return jl40.l(this.a, ecpVar.a) && jl40.l(this.b, ecpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendMetrics(eventName=");
        sb.append(this.a);
        sb.append(", eventValue=");
        return b64.p(sb, this.b, ')');
    }
}
