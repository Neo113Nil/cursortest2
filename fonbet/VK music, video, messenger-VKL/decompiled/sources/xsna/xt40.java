package xsna;

/* compiled from: MusicPickerPatch.kt */
/* loaded from: classes4.dex */
public final class xt40 implements fu40 {
    public final boolean b;

    public xt40(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xt40) && this.b == ((xt40) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("MusicPrivacy(isClosedByPrivacy="), this.b, ')');
    }
}
