package xsna;

import android.util.Size;

/* compiled from: AutoValue_SurfaceSizeDefinition.java */
/* loaded from: classes11.dex */
public final class co5 extends bkn0 {
    public final Size a;
    public final Size b;
    public final Size c;

    public co5(Size size, Size size2, Size size3) {
        this.a = size;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.b = size2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.c = size3;
    }

    @Override // xsna.bkn0
    public final Size a() {
        return this.a;
    }

    @Override // xsna.bkn0
    public final Size b() {
        return this.b;
    }

    @Override // xsna.bkn0
    public final Size c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bkn0)) {
            return false;
        }
        bkn0 bkn0Var = (bkn0) obj;
        return this.a.equals(bkn0Var.a()) && this.b.equals(bkn0Var.b()) && this.c.equals(bkn0Var.c());
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.a + ", previewSize=" + this.b + ", recordSize=" + this.c + "}";
    }
}
