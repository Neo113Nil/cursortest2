package yads;

import android.content.Context;
import androidx.media3.datasource.cache.Cache;

/* loaded from: classes10.dex */
public final class dp0 {
    public static final Object c = new Object();
    public static volatile dp0 d;
    public final zo0 a = new zo0();
    public androidx.media3.datasource.cache.c b;

    public final Cache a(Context context) {
        androidx.media3.datasource.cache.c cVar;
        synchronized (c) {
            cVar = this.b;
            if (cVar == null) {
                cVar = this.a.a(context);
                this.b = cVar;
            }
        }
        return cVar;
    }
}
