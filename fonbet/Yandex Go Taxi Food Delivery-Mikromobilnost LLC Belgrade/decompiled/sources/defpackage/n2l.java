package defpackage;

import com.yandex.div.core.view2.divs.pager.a;
import com.yandex.div2.DivPager$ItemAlignment;

/* loaded from: classes.dex */
public final class n2l {
    public final int a;
    public final float b;
    public final p2l c;
    public final l2l d;
    public final boolean e;
    public final a f;
    public final DivPager$ItemAlignment g;

    public n2l(int i, float f, p2l p2lVar, l2l l2lVar, boolean z, a aVar, DivPager$ItemAlignment divPager$ItemAlignment) {
        this.a = i;
        this.b = f;
        this.c = p2lVar;
        this.d = l2lVar;
        this.e = z;
        this.f = aVar;
        this.g = divPager$ItemAlignment;
    }

    public static float a(float f) {
        float abs = Math.abs(f);
        return abs - ((float) Math.floor(abs));
    }

    public final float b(float f, int i, int i2) {
        p2l p2lVar = this.c;
        Float h = p2lVar.h(i);
        if (h == null) {
            return 0.0f;
        }
        float floatValue = h.floatValue();
        Float h2 = p2lVar.h(i2);
        if (h2 == null) {
            return 0.0f;
        }
        return ((h2.floatValue() * f) + ((1.0f - f) * floatValue)) - this.d.g;
    }

    public final float c(int i, int i2) {
        int i3 = i2 > 0 ? i : i + 1;
        p2l p2lVar = this.c;
        Float h = p2lVar.h(i3);
        if (h == null) {
            return 0.0f;
        }
        float floatValue = h.floatValue();
        if (i2 > 0) {
            i--;
        }
        Float g = p2lVar.g(i);
        if (g != null) {
            return ((g.floatValue() + floatValue) - this.b) * i2;
        }
        return 0.0f;
    }
}
