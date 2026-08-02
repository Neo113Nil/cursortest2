package xsna;

/* compiled from: Density.kt */
/* loaded from: classes11.dex */
public final class dzl implements azl {
    public final float b;
    public final float c;

    public dzl(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzl)) {
            return false;
        }
        dzl dzlVar = (dzl) obj;
        return Float.compare(this.b, dzlVar.b) == 0 && Float.compare(this.c, dzlVar.c) == 0;
    }

    @Override // xsna.azl
    public final float getDensity() {
        return this.b;
    }

    @Override // xsna.azl
    public final float getFontScale() {
        return this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.b);
        sb.append(", fontScale=");
        return xq.c(')', this.c, sb);
    }
}
