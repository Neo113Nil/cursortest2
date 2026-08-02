package yads;

import android.graphics.Bitmap;
import android.util.LruCache;

/* loaded from: classes10.dex */
public final class w92 extends LruCache {
    public w92(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        return bitmap != null ? bitmap.getByteCount() / 1024 : super.sizeOf((String) obj, null);
    }
}
