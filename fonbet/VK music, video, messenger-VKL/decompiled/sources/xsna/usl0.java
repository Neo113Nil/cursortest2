package xsna;

/* compiled from: StoriesInMessengerEnabledEvent.kt */
/* loaded from: classes2.dex */
public final class usl0 extends sxp {
    public final boolean b;

    public usl0(boolean z) {
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
        return (obj instanceof usl0) && this.b == ((usl0) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) * 31;
    }

    public final String toString() {
        return n23.b(new StringBuilder("StoriesInMessengerEnabledEvent(isEnabled="), this.b, ", changerTag=null)");
    }
}
