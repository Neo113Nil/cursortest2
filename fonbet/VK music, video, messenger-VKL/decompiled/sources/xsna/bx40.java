package xsna;

/* compiled from: MusicPlayerFeatures.kt */
/* loaded from: classes3.dex */
public final class bx40 {
    public final boolean a;

    public bx40() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bx40) && this.a == ((bx40) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("MusicPlayerFeatures(canStopService="), this.a, ')');
    }

    public bx40(int i) {
        this.a = true;
    }
}
