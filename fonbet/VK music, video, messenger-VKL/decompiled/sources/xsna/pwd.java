package xsna;

/* compiled from: ClipsEditorAspectRatioProperties.kt */
/* loaded from: classes16.dex */
public final class pwd {
    public static final pwd c = new pwd(0.5625f, 0.5625f);
    public final float a;
    public final float b;

    public pwd(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwd)) {
            return false;
        }
        pwd pwdVar = (pwd) obj;
        return Float.compare(this.a, pwdVar.a) == 0 && Float.compare(this.b, pwdVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsEditorAspectRatioProperties(originalAspectRatio=");
        sb.append(this.a);
        sb.append(", aspectRatio=");
        return xq.c(')', this.b, sb);
    }
}
