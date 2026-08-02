package xsna;

/* compiled from: SdkVideoAction.kt */
/* loaded from: classes17.dex */
public final class txr0 extends llh0 {
    public final int a;

    public txr0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txr0) && this.a == ((txr0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("VideoActionPlaylistShift(shift="), this.a, ')');
    }
}
