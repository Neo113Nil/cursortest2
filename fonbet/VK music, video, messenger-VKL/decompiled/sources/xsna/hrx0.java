package xsna;

import android.content.Context;
import android.os.Build;

/* compiled from: WindowMetricsCalculatorCompat.kt */
/* loaded from: classes12.dex */
public final class hrx0 implements grx0 {
    public final bzl b;

    public hrx0() {
        this.b = Build.VERSION.SDK_INT >= 34 ? czl.b : f9t.e;
        e43.a(1, 2, 4, 8, 16, 32, 64, 128);
    }

    @Override // xsna.grx0
    public final frx0 a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return (i >= 34 ? krx0.a : i >= 30 ? jrx0.a : lrx0.a).a(context, this.b);
    }
}
