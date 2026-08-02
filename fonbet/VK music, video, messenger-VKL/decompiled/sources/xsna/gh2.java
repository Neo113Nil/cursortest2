package xsna;

import android.graphics.Paint;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: AnimatedCenterDrawState.kt */
/* loaded from: classes16.dex */
public final class gh2 implements hmv {
    public static final /* synthetic */ qcy<Object>[] e = {new MutablePropertyReference1Impl(gh2.class, "isDrawVerticalLine", "isDrawVerticalLine()Z", 0), p5j.a(0, gh2.class, "isDrawHorizontalLine", "isDrawHorizontalLine()Z", fpf0.a)};
    public final uru a;
    public final uru b;
    public final eh2 c;
    public final fh2 d;

    public gh2(Paint paint, igg iggVar) {
        Paint paint2 = new Paint(paint);
        paint2.setAlpha(0);
        this.a = new uru(paint2);
        Paint paint3 = new Paint(paint);
        paint3.setAlpha(0);
        this.b = new uru(paint3);
        this.c = new eh2(this, iggVar);
        this.d = new fh2(this, iggVar);
    }

    @Override // xsna.hmv
    public final boolean a() {
        return this.c.getValue(this, e[0]).booleanValue();
    }

    @Override // xsna.hmv
    public final void b(boolean z) {
        this.c.setValue(this, e[0], Boolean.valueOf(z));
    }

    @Override // xsna.hmv
    public final void c(boolean z) {
        this.d.setValue(this, e[1], Boolean.valueOf(z));
    }

    @Override // xsna.hmv
    public final boolean d() {
        return this.d.getValue(this, e[1]).booleanValue();
    }
}
