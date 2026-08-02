package xsna;

import android.graphics.drawable.LayerDrawable;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: InnerStrokeDrawable.kt */
/* loaded from: classes6.dex */
public final class c1x extends LayerDrawable {
    public static final int b;
    public static final int c;

    static {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        b = View.generateViewId();
        c = View.generateViewId();
    }
}
