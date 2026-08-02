package xsna;

/* compiled from: ContentSnapStrategy.kt */
/* loaded from: classes17.dex */
public final class cpo extends com.vk.core.ui.bottomsheet.internal.b {
    public static final int f = iah0.a(254);
    public static final float g = 0.9f;
    public static final float h = 0.777f;
    public final boolean a;
    public final boolean b;
    public final int c;
    public float d;
    public int e;

    public cpo(boolean z, int i, int i2) {
        z = (i2 & 1) != 0 ? true : z;
        boolean z2 = (i2 & 2) == 0;
        i = (i2 & 4) != 0 ? f : i;
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = h;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final boolean a() {
        return this.a;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final boolean b() {
        return this.b;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        int i4 = i2 - i;
        int i5 = this.e;
        if (i5 > 0 || i4 < (i5 = this.c)) {
            i4 = i5;
        } else if (i4 > i2 * g) {
            i4 = i2;
        }
        return i2 - i4;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        float f2 = i2 - i;
        float f3 = i2;
        if (f2 > g * f3) {
            return (int) (f3 * this.d);
        }
        return 0;
    }
}
