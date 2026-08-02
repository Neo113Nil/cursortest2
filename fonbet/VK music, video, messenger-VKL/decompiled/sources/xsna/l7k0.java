package xsna;

import xsna.clv0;

/* compiled from: VkSnackbarHost.kt */
/* loaded from: classes17.dex */
public final class l7k0 implements i7k0 {
    public final String a;
    public final clv0 b;
    public final acn c;
    public final float d;
    public final boolean e;
    public final clv0.a f;
    public final clv0.b g;
    public final lq9 h;

    public l7k0(String str, clv0 clv0Var, acn acnVar, float f, boolean z, clv0.a aVar, clv0.b bVar, lq9 lq9Var) {
        this.a = str;
        this.b = clv0Var;
        this.c = acnVar;
        this.d = f;
        this.e = z;
        this.f = aVar;
        this.g = bVar;
        this.h = lq9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l7k0.class != obj.getClass()) {
            return false;
        }
        l7k0 l7k0Var = (l7k0) obj;
        return epx.f(this.a, l7k0Var.a) && this.h.equals(l7k0Var.h);
    }

    @Override // xsna.i7k0
    public final String getMessage() {
        return this.a;
    }

    public final int hashCode() {
        return this.h.hashCode() + (this.a.hashCode() * 31);
    }
}
