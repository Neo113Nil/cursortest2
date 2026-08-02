package xsna;

import android.text.Layout;
import android.text.StaticLayout;

/* compiled from: ShowMoreExpandSpanMeasureStrategy.kt */
/* loaded from: classes17.dex */
public final class qij0 implements v7q {
    public final fw5 a;
    public Layout b;
    public int c;

    public qij0(fw5 fw5Var) {
        this.a = fw5Var;
    }

    @Override // xsna.v7q
    public final void a(int i) {
        this.c = i;
    }

    @Override // xsna.v7q
    public final void b(Layout layout) {
        this.a.b = layout;
    }

    @Override // xsna.v7q
    public final void c(int i) {
        this.a.a = i;
    }

    @Override // xsna.v7q
    public final void d(StaticLayout staticLayout) {
        this.b = staticLayout;
    }

    @Override // xsna.v7q
    public final int e() {
        Layout layout = this.b;
        if (layout == null) {
            return 0;
        }
        return layout.getLineBottom(0) - layout.getLineTop(0);
    }

    @Override // xsna.v7q
    public final float f(float f) {
        return g() ? f + this.c : this.a.f(f);
    }

    @Override // xsna.v7q
    public final boolean g() {
        return this.c > 0;
    }
}
