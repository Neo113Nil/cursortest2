package xsna;

/* compiled from: ReefState.kt */
/* loaded from: classes5.dex */
public final class plc extends wof0 {
    public final String a;
    public final String b;

    public plc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plc)) {
            return false;
        }
        plc plcVar = (plc) obj;
        return epx.f(this.a, plcVar.a) && epx.f(this.b, plcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ss9.a("ClientState(applicationId=", this.a, ", userId=", this.b, ")");
    }
}
