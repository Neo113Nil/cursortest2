package xsna;

/* compiled from: ContentSnapStrategy.kt */
/* loaded from: classes17.dex */
public final class ts90 extends com.vk.core.ui.bottomsheet.internal.b {
    public final float a;

    public ts90(float f, int i) {
        this.a = (i & 1) != 0 ? 0.5f : f;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        return -1;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        int a = iah0.a(16) + ((int) (this.a * i2));
        return Math.max(a, a > 0 ? a : 0);
    }
}
