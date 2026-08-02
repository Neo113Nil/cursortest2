package xsna;

import android.graphics.Bitmap;
import com.facebook.common.memory.MemoryTrimType;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: DummyTrackingInUseBitmapPool.kt */
/* loaded from: classes12.dex */
public final class vno implements sc7 {
    public final Set<Bitmap> b = Collections.newSetFromMap(new IdentityHashMap());

    @Override // xsna.avb0, xsna.zag0
    public final void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        this.b.remove(bitmap);
        bitmap.recycle();
    }

    @Override // xsna.avb0
    public final Bitmap get(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
        this.b.add(createBitmap);
        return createBitmap;
    }

    @Override // xsna.f320
    public final void h(MemoryTrimType memoryTrimType) {
    }
}
