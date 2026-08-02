package xsna;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public final class t0k0 extends vcr<Float> {
    public final izs<Float, String> e;
    public Float f;
    public final Float g;
    public final float h;

    public t0k0() {
        this(null, null, null, 63);
    }

    @Override // xsna.vcr
    public final Float b() {
        return this.g;
    }

    @Override // xsna.vcr
    public final Float d() {
        return this.f;
    }

    @Override // xsna.vcr
    public final void e(Float f) {
        this.f = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0k0(js00 js00Var, Float f, Float f2, int i) {
        super(8, null, null);
        js00Var = (i & 1) != 0 ? null : js00Var;
        f = (i & 2) != 0 ? null : f;
        f2 = (i & 4) != 0 ? null : f2;
        this.e = js00Var;
        this.f = f;
        this.g = f2;
        this.h = 1.0f;
    }
}
