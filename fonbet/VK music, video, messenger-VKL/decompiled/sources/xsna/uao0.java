package xsna;

/* compiled from: TestResult.kt */
/* loaded from: classes18.dex */
public final class uao0 {
    public final String a;
    public final String b;

    public uao0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uao0)) {
            return false;
        }
        uao0 uao0Var = (uao0) obj;
        return epx.f(this.a, uao0Var.a) && epx.f(this.b, uao0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TestResultDescription(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        return ho8.a(sb, this.b, ')');
    }
}
