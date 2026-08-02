package xsna;

import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class o2r0 implements ThreadFactory {
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ o2r0(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.b);
        thread.setDaemon(this.c);
        return thread;
    }
}
