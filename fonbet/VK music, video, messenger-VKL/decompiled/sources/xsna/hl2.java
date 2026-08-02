package xsna;

import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: AnimatedRotationDrawState.kt */
/* loaded from: classes16.dex */
public final class hl2 {
    public static final /* synthetic */ qcy<Object>[] d;
    public final uru a;
    public final gl2 b;
    public final Path c;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(hl2.class, "needDraw", "getNeedDraw()Z", 0);
        fpf0.a.getClass();
        d = new qcy[]{mutablePropertyReference1Impl};
    }

    public hl2(Paint paint, defpackage.r rVar) {
        Paint paint2 = new Paint(paint);
        paint2.setAlpha(0);
        this.a = new uru(paint2);
        this.b = new gl2(this, rVar);
        this.c = new Path();
    }

    public final void a(boolean z) {
        this.b.setValue(this, d[0], Boolean.valueOf(z));
    }
}
