package xsna;

import android.os.Process;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import xsna.ky6;

/* compiled from: VKThread.kt */
/* loaded from: classes.dex */
public final class fhr0 extends Thread {
    public final Integer b;

    public fhr0(Runnable runnable, String str, Integer num) {
        super(runnable, str);
        this.b = num;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            Integer num = this.b;
            if (num != null) {
                Process.setThreadPriority(num.intValue());
            }
        } catch (Throwable th) {
            L.i(th);
        }
        super.run();
    }

    @Override // java.lang.Thread
    public final void start() {
        try {
            super.start();
        } catch (OutOfMemoryError e) {
            asu0.a.getClass();
            ky6.a aVar = (ky6.a) Preference.j().edit();
            aVar.putBoolean("oom_thread_create", true);
            aVar.commit();
            throw e;
        }
    }
}
