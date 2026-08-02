package xsna;

/* compiled from: AddPhotoSnapStrategy.kt */
/* loaded from: classes3.dex */
public final class en0 extends com.vk.core.ui.bottomsheet.internal.b {
    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final boolean a() {
        return true;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        int i4 = i2 - i;
        float f = i4;
        float f2 = i2 * 0.8f;
        if (f <= f2) {
            i4 = (int) f2;
        } else if (f > f2) {
            i4 = i2;
        }
        return i2 - i4;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        float f = i2 - i;
        float f2 = i2;
        if (f > 0.8f * f2) {
            return (int) (f2 * 0.777f);
        }
        return 0;
    }
}
