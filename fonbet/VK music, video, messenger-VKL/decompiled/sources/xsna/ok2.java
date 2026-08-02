package xsna;

/* compiled from: AnimatedIconState.kt */
/* loaded from: classes16.dex */
public final class ok2 {
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;

    public ok2() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok2)) {
            return false;
        }
        ok2 ok2Var = (ok2) obj;
        return this.a == ok2Var.a && this.b == ok2Var.b && this.c == ok2Var.c && Float.compare(this.d, ok2Var.d) == 0 && Float.compare(this.e, ok2Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + io.reactivex.rxjava3.subjects.b.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimatedIconState(imageRes=");
        sb.append(this.a);
        sb.append(", checkAnimationRes=");
        sb.append(this.b);
        sb.append(", uncheckAnimationRes=");
        sb.append(this.c);
        sb.append(", checkAnimationSpeed=");
        sb.append(this.d);
        sb.append(", uncheckAnimationSpeed=");
        return xq.c(')', this.e, sb);
    }

    public ok2(float f, float f2, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = f2;
    }

    public /* synthetic */ ok2(int i) {
        this(1.0f, -1.0f, 0, 0, 0);
    }
}
