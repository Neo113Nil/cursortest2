package xsna;

/* compiled from: TemplatesKeyboardAction.kt */
/* loaded from: classes3.dex */
public final class f9o0 implements j9o0 {
    public final int b;

    public f9o0(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f9o0) && this.b == ((f9o0) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("Delete(id="), this.b, ')');
    }
}
