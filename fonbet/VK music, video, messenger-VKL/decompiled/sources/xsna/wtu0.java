package xsna;

import android.graphics.Rect;
import xsna.cuu0;

/* compiled from: VkFeedBaseCarouselCardDecorator.kt */
/* loaded from: classes18.dex */
public class wtu0 implements cuu0.b {
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;

    static {
        float f2 = 12;
        a = iah0.a(f2);
        float f3 = 0;
        iah0.a(f3);
        b = iah0.a(f2);
        float f4 = 8;
        c = iah0.a(f4);
        d = iah0.a(f3);
        e = iah0.a(f2);
        f = iah0.a(f4);
        g = iah0.a(f2);
    }

    @Override // xsna.cuu0.b
    public Rect a(cuu0.a aVar) {
        int i = c;
        int i2 = d;
        int i3 = b;
        return new Rect(i3, i, i3, i2);
    }

    @Override // xsna.cuu0.b
    public cuu0.b.C2687b b(cuu0.a aVar) {
        return new cuu0.b.C2687b(16.0f, 13.0f, 13.0f);
    }

    @Override // xsna.cuu0.b
    public final cuu0.b.a c() {
        return new cuu0.b.a(a);
    }

    @Override // xsna.cuu0.b
    public Rect d(cuu0.a aVar) {
        int i = f;
        int i2 = g;
        int i3 = e;
        return new Rect(i3, i, i3, i2);
    }
}
