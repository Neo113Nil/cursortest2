package xsna;

/* compiled from: PastCallDialogEvent.kt */
/* loaded from: classes7.dex */
public final class fp90 implements u49 {
    public final a59 a;

    public fp90(a59 a59Var) {
        this.a = a59Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fp90) && epx.f(this.a, ((fp90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ConfirmDelete(call=" + this.a + ')';
    }
}
