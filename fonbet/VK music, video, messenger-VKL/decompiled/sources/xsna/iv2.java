package xsna;

/* compiled from: AnswerUiState.kt */
/* loaded from: classes4.dex */
public final class iv2 {
    public final long a;
    public final String b;

    public iv2() {
        this((String) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv2)) {
            return false;
        }
        iv2 iv2Var = (iv2) obj;
        return this.a == iv2Var.a && epx.f(this.b, iv2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnswerDataState(id=");
        sb.append(this.a);
        sb.append(", text=");
        return ho8.a(sb, this.b, ')');
    }

    public iv2(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public /* synthetic */ iv2(String str, int i) {
        this(0L, (i & 2) != 0 ? "" : str);
    }
}
