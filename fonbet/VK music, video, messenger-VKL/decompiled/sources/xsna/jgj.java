package xsna;

import android.view.View;

/* compiled from: ContentSnapStrategy.kt */
/* loaded from: classes17.dex */
public class jgj extends com.vk.core.ui.bottomsheet.internal.b {
    public static final int g = iah0.a(1);
    public final View a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final float f;

    public /* synthetic */ jgj(View view, int i, int i2, int i3) {
        this(view, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? -1 : i2, (i3 & 16) == 0, (i3 & 32) == 0);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final boolean a() {
        return this.d;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final boolean b() {
        return this.e;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public int c(int i, int i2, int i3) {
        View view = this.a;
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight == 0) {
            view.measure(0, 0);
            measuredHeight = view.getMeasuredHeight();
        }
        int i4 = measuredHeight + this.b;
        int i5 = g;
        if (i4 < i5) {
            i4 = i5;
        } else if (i4 > i2 * 0.9f) {
            i4 = i2;
        }
        return Math.max(i2 - i4, 0);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        int i4 = this.c;
        if (i4 >= 0) {
            return i4;
        }
        float f = i2 - i;
        float f2 = i2;
        if (f > 0.9f * f2) {
            return (int) (f2 * this.f);
        }
        return 0;
    }

    public jgj(View view, int i, int i2, boolean z, boolean z2) {
        this.a = view;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = 0.777f;
    }
}
