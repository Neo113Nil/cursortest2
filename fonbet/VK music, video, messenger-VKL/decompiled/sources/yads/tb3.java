package yads;

import android.graphics.Bitmap;
import android.util.LruCache;
import android.widget.ImageView;

/* loaded from: classes10.dex */
public final class tb3 {
    public final LruCache a;
    public final m31 b;

    public tb3(w92 w92Var, m31 m31Var) {
        this.a = w92Var;
        this.b = m31Var;
    }

    public final Bitmap a(String str) {
        this.b.getClass();
        return (Bitmap) this.a.get(m31.a(str, ImageView.ScaleType.CENTER_INSIDE));
    }

    public final void a(String str, Bitmap bitmap) {
        this.b.getClass();
        this.a.put(m31.a(str, ImageView.ScaleType.CENTER_INSIDE), bitmap);
    }
}
