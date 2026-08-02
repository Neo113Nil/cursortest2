package xsna;

/* compiled from: TextElementEditableData.kt */
/* loaded from: classes4.dex */
public final class gfo0 {
    public final afo0 a;
    public final String b;

    public gfo0(afo0 afo0Var, String str) {
        this.a = afo0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfo0)) {
            return false;
        }
        gfo0 gfo0Var = (gfo0) obj;
        return epx.f(this.a, gfo0Var.a) && epx.f(this.b, gfo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextElementEditableData(config=" + this.a + ", text=" + this.b + ")";
    }
}
