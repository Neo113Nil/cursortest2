package defpackage;

/* loaded from: classes10.dex */
public final class iwd0 {
    public final int a;

    public /* synthetic */ iwd0(int i) {
        this.a = i;
    }

    public static final /* synthetic */ iwd0 a(int i) {
        return new iwd0(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iwd0) {
            return this.a == ((iwd0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.e(')', this.a, "PointerKeyboardModifiers(packedValue=");
    }
}
