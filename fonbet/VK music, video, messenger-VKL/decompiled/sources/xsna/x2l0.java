package xsna;

import android.graphics.Color;

/* compiled from: StickerColorsFactoryImpl.kt */
/* loaded from: classes6.dex */
public final class x2l0 implements w2l0 {
    @Override // xsna.w2l0
    public final y2l0 a(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        return (Math.abs(red - green) >= 3 || Math.abs(red - blue) >= 3 || Math.abs(green - blue) >= 3) ? new y2l0(Integer.valueOf(i)) : new y2l0(null);
    }
}
