package xsna;

/* compiled from: RecyclerViewCustomParams.kt */
/* loaded from: classes5.dex */
public final class ojf0 {
    public final int a;
    public final boolean b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public ojf0() {
        this(0, 0 == true ? 1 : 0, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojf0)) {
            return false;
        }
        ojf0 ojf0Var = (ojf0) obj;
        return this.a == ojf0Var.a && this.b == ojf0Var.b && Float.compare(this.c, ojf0Var.c) == 0 && this.d == ojf0Var.d && this.e == ojf0Var.e && this.f == ojf0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + qoy.b(qoy.b(qoy.b(io.reactivex.rxjava3.subjects.b.a(this.c, qoy.b(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecyclerViewCustomParams(paddingBottom=");
        sb.append(this.a);
        sb.append(", clipToPadding=");
        sb.append(this.b);
        sb.append(", startBottomSheetHeight=");
        sb.append(this.c);
        sb.append(", keepCornersRound=");
        sb.append(this.d);
        sb.append(", isDarkTheme=");
        sb.append(this.e);
        sb.append(", isBackgroundTransparent=");
        return n23.b(sb, this.f, ", canHideBottomSheet=false)");
    }

    public ojf0(int i, boolean z, float f, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = z;
        this.c = f;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public /* synthetic */ ojf0(int i, boolean z, int i2) {
        this((i2 & 1) != 0 ? 0 : i, true, 1.7f, (i2 & 8) == 0, (i2 & 16) != 0 ? false : z, false);
    }
}
