package xsna;

/* compiled from: NativeIcon.kt */
@vby
/* loaded from: classes2.dex */
public final class rv50 {
    public final tb7 a;

    public final boolean equals(Object obj) {
        if (obj instanceof rv50) {
            return epx.f(this.a, ((rv50) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NativeIcon(bitmapDescriptor=" + this.a + ')';
    }
}
