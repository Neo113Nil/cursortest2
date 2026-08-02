package xsna;

import android.graphics.Paint;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: AnimatedBoundaryDrawState.kt */
/* loaded from: classes16.dex */
public final class vg2 implements emv {
    public static final /* synthetic */ qcy<Object>[] f = {new MutablePropertyReference1Impl(vg2.class, "isDrawWarningLine", "isDrawWarningLine()Z", 0), p5j.a(0, vg2.class, "isDrawLine", "isDrawLine()Z", fpf0.a)};
    public final uru a;
    public final uru b;
    public int c;
    public final tg2 d;
    public final ug2 e;

    public vg2(Paint paint, Paint paint2, igg iggVar) {
        Paint paint3 = new Paint(paint);
        paint3.setAlpha(0);
        this.a = new uru(paint3);
        Paint paint4 = new Paint(paint2);
        paint4.setAlpha(0);
        this.b = new uru(paint4);
        this.d = new tg2(this, iggVar);
        this.e = new ug2(this, iggVar);
    }

    @Override // xsna.emv
    public final void a() {
        c(false);
        b(false);
    }

    @Override // xsna.emv
    public final void b(boolean z) {
        this.e.setValue(this, f[1], Boolean.valueOf(z));
    }

    @Override // xsna.emv
    public final void c(boolean z) {
        this.d.setValue(this, f[0], Boolean.valueOf(z));
    }

    @Override // xsna.emv
    public final boolean d() {
        return this.e.getValue(this, f[1]).booleanValue();
    }
}
