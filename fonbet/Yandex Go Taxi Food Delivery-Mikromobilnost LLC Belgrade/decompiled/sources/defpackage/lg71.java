package defpackage;

/* loaded from: classes7.dex */
public final class lg71 {
    public final li61 a;
    public final float b;

    public lg71(li61 li61Var, float f) {
        this.a = li61Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg71)) {
            return false;
        }
        lg71 lg71Var = (lg71) obj;
        return this.a.equals(lg71Var.a) && Float.compare(this.b, lg71Var.b) == 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + g8e.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Media(content=" + this.a + ", aspectRatio=" + this.b + ", hasVideo=false)";
    }
}
