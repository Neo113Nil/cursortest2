package xsna;

/* compiled from: InternalModalBottomSheet.kt */
/* loaded from: classes17.dex */
public final class fw20 {
    public final if2<Float, sq2> a;
    public final yvj b;
    public final gzs<s3q0> c;
    public final izs<Float, s3q0> d;
    public final fdj0 e;
    public final r5j0 f;
    public final xx20 g;
    public final float h;

    /* JADX WARN: Multi-variable type inference failed */
    public fw20(if2<Float, sq2> if2Var, yvj yvjVar, gzs<s3q0> gzsVar, izs<? super Float, s3q0> izsVar, fdj0 fdj0Var, r5j0 r5j0Var, xx20 xx20Var, float f) {
        this.a = if2Var;
        this.b = yvjVar;
        this.c = gzsVar;
        this.d = izsVar;
        this.e = fdj0Var;
        this.f = r5j0Var;
        this.g = xx20Var;
        this.h = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw20)) {
            return false;
        }
        fw20 fw20Var = (fw20) obj;
        return epx.f(this.a, fw20Var.a) && epx.f(this.b, fw20Var.b) && epx.f(this.c, fw20Var.c) && epx.f(this.d, fw20Var.d) && epx.f(this.e, fw20Var.e) && epx.f(this.f, fw20Var.f) && epx.f(this.g, fw20Var.g) && Float.compare(this.h, fw20Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + dq.c(sf3.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalBottomSheetContentParams(predictiveBackProgress=");
        sb.append(this.a);
        sb.append(", scope=");
        sb.append(this.b);
        sb.append(", animateToDismiss=");
        sb.append(this.c);
        sb.append(", settleToDismiss=");
        sb.append(this.d);
        sb.append(", sheetState=");
        sb.append(this.e);
        sb.append(", shape=");
        sb.append(this.f);
        sb.append(", properties=");
        sb.append(this.g);
        sb.append(", peekTopFraction=");
        return xq.c(')', this.h, sb);
    }
}
