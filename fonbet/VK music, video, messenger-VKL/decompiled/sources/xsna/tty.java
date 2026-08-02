package xsna;

/* compiled from: LazyLayoutNearestRangeState.kt */
/* loaded from: classes11.dex */
public final class tty implements mtk0<k9x> {
    public final int b;
    public final int c;
    public final wh50 d;
    public int e;

    /* compiled from: LazyLayoutNearestRangeState.kt */
    public static final class a {
    }

    public tty(int i, int i2, int i3) {
        this.b = i2;
        this.c = i3;
        int i4 = (i / i2) * i2;
        this.d = androidx.compose.runtime.k.a(swe0.q(Math.max(i4 - i3, 0), i4 + i2 + i3), k0x.c);
        this.e = i;
    }

    public final void c(int i) {
        if (i != this.e) {
            this.e = i;
            int i2 = this.b;
            int i3 = (i / i2) * i2;
            int i4 = this.c;
            ((zak0) this.d).setValue(swe0.q(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // xsna.mtk0
    public final k9x getValue() {
        return (k9x) ((zak0) this.d).getValue();
    }
}
