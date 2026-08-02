package xsna;

/* compiled from: ScrollHelperConfig.kt */
/* loaded from: classes17.dex */
public final class mfh0 {
    public final boolean a;

    public mfh0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mfh0) && this.a == ((mfh0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return n23.b(new StringBuilder("ScrollHelperConfig(prepareEnabled="), this.a, ", startPlayAfterOnResume=false)");
    }

    public mfh0(int i) {
        this.a = true;
    }
}
