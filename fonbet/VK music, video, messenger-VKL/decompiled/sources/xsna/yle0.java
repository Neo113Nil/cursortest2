package xsna;

/* compiled from: CornerSize.kt */
/* loaded from: classes11.dex */
public final class yle0 implements vuj {
    public final float a;

    public yle0(float f) {
        this.a = f;
    }

    @Override // xsna.vuj
    public final float a(long j, azl azlVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yle0) && Float.compare(this.a, ((yle0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return shy.c(this.a, ".px)", new StringBuilder("CornerSize(size = "));
    }
}
