package xsna;

/* compiled from: DebugMockApiResponsesScreen.kt */
/* loaded from: classes17.dex */
public final class rh90 {
    public final String a;
    public final String b;

    public rh90() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh90)) {
            return false;
        }
        rh90 rh90Var = (rh90) obj;
        return epx.f(this.a, rh90Var.a) && epx.f(this.b, rh90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParamUi(key=");
        sb.append(this.a);
        sb.append(", value=");
        return ho8.a(sb, this.b, ')');
    }

    public /* synthetic */ rh90(int i) {
        this("", "");
    }

    public rh90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
