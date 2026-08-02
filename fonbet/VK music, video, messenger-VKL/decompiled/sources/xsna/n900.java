package xsna;

import android.util.LruCache;

/* compiled from: LruCacheAnimation.kt */
/* loaded from: classes18.dex */
public final class n900<T> extends LruCache<T, x6o> {
    @Override // android.util.LruCache
    public final int sizeOf(Object obj, x6o x6oVar) {
        String str;
        x6o x6oVar2 = x6oVar;
        if (x6oVar2 == null || (str = x6oVar2.d) == null) {
            return 0;
        }
        return str.length();
    }
}
