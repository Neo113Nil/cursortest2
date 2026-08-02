package xsna;

/* compiled from: CornerSize.kt */
/* loaded from: classes11.dex */
public final class qco implements vuj {
    public final float a;

    public qco(float f) {
        this.a = f;
    }

    @Override // xsna.vuj
    public final float a(long j, azl azlVar) {
        return azlVar.I0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qco) && pco.b(this.a, ((qco) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return shy.c(this.a, ".dp)", new StringBuilder("CornerSize(size = "));
    }
}
