package xsna;

/* compiled from: TemplatesKeyboardAction.kt */
/* loaded from: classes3.dex */
public final class g9o0 implements j9o0 {
    public final int b;

    public g9o0(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g9o0) && this.b == ((g9o0) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("Edit(id="), this.b, ')');
    }
}
