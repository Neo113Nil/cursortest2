package yads;

import android.os.ConditionVariable;

/* loaded from: classes10.dex */
public final class yz2 extends Thread {
    public final /* synthetic */ ConditionVariable b;
    public final /* synthetic */ zz2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz2(zz2 zz2Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.c = zz2Var;
        this.b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            this.b.open();
            this.c.b();
            this.c.b.getClass();
        }
    }
}
