package xsna;

import android.os.ConditionVariable;

/* compiled from: SimpleCache.java */
/* loaded from: classes.dex */
public final class npj0 extends Thread {
    public final /* synthetic */ ConditionVariable b;
    public final /* synthetic */ androidx.media3.datasource.cache.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npj0(androidx.media3.datasource.cache.c cVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.c = cVar;
        this.b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            this.b.open();
            androidx.media3.datasource.cache.c.h(this.c);
            this.c.b.onCacheInitialized();
        }
    }
}
