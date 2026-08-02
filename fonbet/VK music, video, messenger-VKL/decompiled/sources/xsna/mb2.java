package xsna;

/* compiled from: PointerIcon.android.kt */
/* loaded from: classes11.dex */
public final class mb2 implements ulb0 {
    public final int b;

    public mb2(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return mb2.class.equals(obj != null ? obj.getClass() : null) && this.b == ((mb2) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return vu5.b(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}
