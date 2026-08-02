package defpackage;

/* loaded from: classes.dex */
public final class iwi implements fwi {
    public final float a;
    public final float b;

    public iwi(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwi)) {
            return false;
        }
        iwi iwiVar = (iwi) obj;
        return Float.compare(this.a, iwiVar.a) == 0 && Float.compare(this.b, iwiVar.b) == 0;
    }

    @Override // defpackage.fwi
    public final float getDensity() {
        return this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.a);
        sb.append(", fontScale=");
        return n.n(sb, this.b, ')');
    }

    @Override // defpackage.fwi
    public final float u0() {
        return this.b;
    }
}
