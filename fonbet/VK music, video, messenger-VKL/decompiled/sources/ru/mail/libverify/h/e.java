package ru.mail.libverify.h;

import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import ru.mail.libverify.h.f;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
final class e extends TimerTask {
    final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Timer timer;
        Timer timer2;
        synchronized (this.a) {
            try {
                try {
                    FileLog.v("IpcMessageClient", "startTimer connection timeout expired");
                    f fVar = this.a;
                    FileLog.d("IpcMessageClient", "unbind %d connections", Integer.valueOf(fVar.d.size()));
                    Iterator it = fVar.d.keySet().iterator();
                    while (it.hasNext()) {
                        ((f.d) it.next()).b();
                    }
                    this.a.a(true);
                    f fVar2 = this.a;
                    timer2 = fVar2.e;
                    if (timer2 != null) {
                        timer2.cancel();
                        fVar2.e = null;
                    }
                } catch (Throwable th) {
                    f fVar3 = this.a;
                    timer = fVar3.e;
                    if (timer != null) {
                        timer.cancel();
                        fVar3.e = null;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
