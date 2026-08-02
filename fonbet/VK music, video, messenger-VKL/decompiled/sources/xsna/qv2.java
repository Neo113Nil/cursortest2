package xsna;

/* compiled from: AnswerUiState.kt */
/* loaded from: classes4.dex */
public final class qv2 {
    public final int a;

    public qv2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qv2) && this.a == ((qv2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("AnswerUiState(index="), this.a, ')');
    }
}
