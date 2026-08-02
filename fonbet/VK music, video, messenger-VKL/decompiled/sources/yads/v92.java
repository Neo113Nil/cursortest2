package yads;

import android.graphics.Bitmap;
import android.util.LruCache;

/* loaded from: classes10.dex */
public final class v92 implements k41 {
    public final LruCache a;

    public v92(w92 w92Var) {
        this.a = w92Var;
    }

    public final Bitmap a(String str) {
        return (Bitmap) this.a.get(str);
    }

    public final void a(String str, Bitmap bitmap) {
        this.a.put(str, bitmap);
    }
}
