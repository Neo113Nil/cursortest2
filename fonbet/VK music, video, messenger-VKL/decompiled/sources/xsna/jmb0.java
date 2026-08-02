package xsna;

/* compiled from: PointerEvent.kt */
@vby
/* loaded from: classes11.dex */
public final class jmb0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof jmb0) {
            return this.a == ((jmb0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return uqi.a("PointerKeyboardModifiers(packedValue=", this.a, ')');
    }
}
