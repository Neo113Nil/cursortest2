package xsna;

/* compiled from: MarketPaginationDotsDefaults.kt */
/* loaded from: classes18.dex */
public final class o910 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public o910(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o910)) {
            return false;
        }
        o910 o910Var = (o910) obj;
        return pco.b(this.a, o910Var.a) && pco.b(this.b, o910Var.b) && pco.b(this.c, o910Var.c) && pco.b(this.d, o910Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketPaginationDotsDefaults(dotSize=");
        oq.f(this.a, ", gap=", sb);
        oq.f(this.b, ", verticalPadding=", sb);
        oq.f(this.c, ", horizontalPadding=", sb);
        return ir.f(')', this.d, sb);
    }
}
