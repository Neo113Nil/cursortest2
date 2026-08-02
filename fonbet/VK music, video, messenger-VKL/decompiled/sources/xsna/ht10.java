package xsna;

/* compiled from: MediaPickerBottomSheetBehavior.kt */
/* loaded from: classes4.dex */
public final class ht10 extends com.vk.core.ui.bottomsheet.internal.b {
    public final float a = 0.5f;
    public final int b;
    public final int c;

    public ht10(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        return -1;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        int b = an10.b(this.a * (i2 - this.c));
        if (b < 0) {
            b = 0;
        }
        int i4 = this.b;
        if (b > i4) {
            i4 = b;
        }
        return Math.max(b, i4);
    }
}
