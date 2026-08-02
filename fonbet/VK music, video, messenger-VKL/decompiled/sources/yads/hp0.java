package yads;

import android.util.LruCache;

/* loaded from: classes10.dex */
public final class hp0 extends LruCache {
    public hp0(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        q62 q62Var = (q62) obj2;
        if (q62Var != null) {
            q62Var.a();
        }
    }
}
