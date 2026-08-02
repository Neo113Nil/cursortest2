package defpackage;

/* loaded from: classes.dex */
public final class oiy implements dzr {
    public final float a;

    public oiy(float f) {
        this.a = f;
    }

    @Override // defpackage.dzr
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.dzr
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oiy) && Float.compare(this.a, ((oiy) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return n.n(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
