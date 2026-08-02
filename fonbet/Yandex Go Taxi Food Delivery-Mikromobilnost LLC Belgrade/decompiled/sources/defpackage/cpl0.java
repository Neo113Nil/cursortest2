package defpackage;

import android.os.Process;

/* loaded from: classes.dex */
public final class cpl0 implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ cpl0(int i, Runnable runnable) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                try {
                    runnable.run();
                    break;
                } catch (Exception e) {
                    rzo.v(e, "Executor", "Background execution failure.");
                    return;
                }
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            default:
                Process.setThreadPriority(0);
                runnable.run();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
