package xsna;

/* compiled from: CommunityAddDescriptionState.kt */
/* loaded from: classes5.dex */
public final class pqg implements km50 {
    public final String b;
    public final qko0 c;

    public pqg(String str, qko0 qko0Var) {
        this.b = str;
        this.c = qko0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqg)) {
            return false;
        }
        pqg pqgVar = (pqg) obj;
        return epx.f(this.b, pqgVar.b) && epx.f(this.c, pqgVar.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        qko0 qko0Var = this.c;
        return hashCode + (qko0Var == null ? 0 : Long.hashCode(qko0Var.a));
    }

    public final String toString() {
        return "CommunityAddDescriptionState(text=" + this.b + ", textSelection=" + this.c + ')';
    }
}
