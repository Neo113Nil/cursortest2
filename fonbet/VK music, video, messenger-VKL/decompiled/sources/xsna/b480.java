package xsna;

/* compiled from: OnDeviceRegisteredForPushes.kt */
/* loaded from: classes2.dex */
public final class b480 extends sxp {
    public final boolean b;

    public b480(boolean z) {
        this.b = z;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b480) && this.b == ((b480) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) * 31;
    }

    public final String toString() {
        return n23.b(new StringBuilder("OnDeviceRegisteredForPushes(isAnonym="), this.b, ", changerTag=null)");
    }
}
