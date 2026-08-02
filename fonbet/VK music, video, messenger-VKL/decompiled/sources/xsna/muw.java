package xsna;

/* compiled from: IndirectPointerEvent.kt */
@vby
/* loaded from: classes11.dex */
public final class muw {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof muw) {
            return this.a == ((muw) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return uqi.a("IndirectPointerEventPrimaryDirectionalMotionAxis(value=", this.a, ')');
    }
}
