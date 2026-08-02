package xsna;

/* compiled from: CommunityAddDescriptionViewState.kt */
/* loaded from: classes5.dex */
public final class x0h {
    public final String a;
    public final String b;
    public final boolean c;
    public final qko0 d;

    public x0h(String str, String str2, boolean z, qko0 qko0Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = qko0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0h)) {
            return false;
        }
        x0h x0hVar = (x0h) obj;
        return epx.f(this.a, x0hVar.a) && epx.f(this.b, x0hVar.b) && this.c == x0hVar.c && epx.f(this.d, x0hVar.d);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        qko0 qko0Var = this.d;
        return b + (qko0Var == null ? 0 : Long.hashCode(qko0Var.a));
    }

    public final String toString() {
        return "CommunityDescriptionViewData(text=" + this.a + ", captionText=" + this.b + ", isSavingEnabled=" + this.c + ", textSelection=" + this.d + ')';
    }
}
