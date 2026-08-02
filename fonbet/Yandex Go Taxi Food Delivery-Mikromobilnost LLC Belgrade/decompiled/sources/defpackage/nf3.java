package defpackage;

import android.os.Process;

/* loaded from: classes10.dex */
public final /* synthetic */ class nf3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ nf3(int i, Runnable runnable) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                Process.setThreadPriority(-16);
                runnable.run();
                break;
            case 1:
                Process.setThreadPriority(-3);
                runnable.run();
                break;
            case 2:
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                runnable.run();
                break;
        }
    }
}
