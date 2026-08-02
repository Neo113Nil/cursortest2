package xsna;

/* compiled from: MusicMixTransitionConfig.kt */
/* loaded from: classes3.dex */
public final class oo40 {
    public final bo40 a;
    public final bo40 b;
    public final ao40 c;
    public final ao40 d;
    public final do40 e;
    public final do40 f;
    public final long g;
    public final izs<Float, Float> h;
    public final gzs<s3q0> i;

    /* JADX WARN: Multi-variable type inference failed */
    public oo40(bo40 bo40Var, bo40 bo40Var2, ao40 ao40Var, ao40 ao40Var2, do40 do40Var, do40 do40Var2, long j, izs<? super Float, Float> izsVar, gzs<s3q0> gzsVar) {
        this.a = bo40Var;
        this.b = bo40Var2;
        this.c = ao40Var;
        this.d = ao40Var2;
        this.e = do40Var;
        this.f = do40Var2;
        this.g = j;
        this.h = izsVar;
        this.i = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo40)) {
            return false;
        }
        oo40 oo40Var = (oo40) obj;
        return epx.f(this.a, oo40Var.a) && epx.f(this.b, oo40Var.b) && epx.f(this.c, oo40Var.c) && epx.f(this.d, oo40Var.d) && epx.f(this.e, oo40Var.e) && epx.f(this.f, oo40Var.f) && this.g == oo40Var.g && epx.f(this.h, oo40Var.h) && epx.f(this.i, oo40Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + dq.c(bh10.a((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicMixTransitionConfig(sourcePalette=");
        sb.append(this.a);
        sb.append(", targetPalette=");
        sb.append(this.b);
        sb.append(", sourceCircle=");
        sb.append(this.c);
        sb.append(", targetCircle=");
        sb.append(this.d);
        sb.append(", sourceShape=");
        sb.append(this.e);
        sb.append(", targetShape=");
        sb.append(this.f);
        sb.append(", durationMs=");
        sb.append(this.g);
        sb.append(", easingStrategy=");
        sb.append(this.h);
        sb.append(", onAnimationEnd=");
        return uf3.d(sb, this.i, ')');
    }

    public /* synthetic */ oo40(bo40 bo40Var, bo40 bo40Var2, ao40 ao40Var, ao40 ao40Var2, do40 do40Var, do40 do40Var2, long j, izs izsVar, int i) {
        this(bo40Var, bo40Var2, ao40Var, ao40Var2, do40Var, do40Var2, j, (izs<? super Float, Float>) ((i & 128) != 0 ? no40.b : izsVar), new daz(5));
    }
}
