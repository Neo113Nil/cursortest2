package xsna;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* compiled from: ViewUtils.java */
/* loaded from: classes12.dex */
public final class y1u0 {
    public static final c2u0 a;
    public static final a b;
    public static final b c;

    /* compiled from: ViewUtils.java */
    public class a extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(y1u0.a.h(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            y1u0.d(view, f.floatValue());
        }
    }

    /* compiled from: ViewUtils.java */
    public class b extends Property<View, Rect> {
        @Override // android.util.Property
        public final Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new d2u0();
        } else {
            a = new c2u0();
        }
        b = new a(Float.class, "translationAlpha");
        c = new b(Rect.class, "clipBounds");
    }

    public static float a(View view) {
        return a.h(view);
    }

    public static void b() {
        a.getClass();
    }

    public static void c(View view, int i, int i2, int i3, int i4) {
        a.s(view, i, i2, i3, i4);
    }

    public static void d(View view, float f) {
        a.m(view, f);
    }

    public static void e(int i, View view) {
        a.n(i, view);
    }
}
