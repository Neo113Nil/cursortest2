package defpackage;

import android.os.ConditionVariable;

/* loaded from: classes.dex */
public final class dds0 extends Thread {
    public final /* synthetic */ ConditionVariable a;
    public final /* synthetic */ eds0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dds0(eds0 eds0Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.b = eds0Var;
        this.a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            this.a.open();
            eds0.a(this.b);
            this.b.b.onCacheInitialized();
        }
    }
}
