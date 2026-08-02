package xsna;

import android.graphics.Bitmap;
import com.facebook.common.memory.MemoryTrimType;

/* compiled from: DummyBitmapPool.kt */
/* loaded from: classes.dex */
public final class mno implements sc7 {
    @Override // xsna.avb0, xsna.zag0
    public final void a(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // xsna.avb0
    public final Bitmap get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // xsna.f320
    public final void h(MemoryTrimType memoryTrimType) {
    }
}
