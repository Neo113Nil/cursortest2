package defpackage;

/* loaded from: classes11.dex */
public final class gjy extends n85 {
    public int q;
    public int r;
    public boolean s;
    public int t;
    public Integer u;
    public int v;
    public float w;
    public boolean x;
    public boolean y;

    @Override // defpackage.n85
    public final boolean c() {
        return super.c() && e() == a();
    }

    @Override // defpackage.n85
    public final void d() {
        super.d();
        if (this.t < 0) {
            ny61.g("Stop indicator size must be >= 0.");
            return;
        }
        if (this.q == 0) {
            if ((a() > 0 || (this.y && e() > 0)) && this.i == 0) {
                ny61.g("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            } else {
                if (this.e.length >= 3) {
                    return;
                }
                ny61.g("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public final int e() {
        return !this.y ? a() : this.x ? (int) (this.a * this.w) : this.v;
    }
}
