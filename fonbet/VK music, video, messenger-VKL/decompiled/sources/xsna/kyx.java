package xsna;

import android.os.SystemClock;
import xsna.myx;

/* compiled from: JobScheduler.java */
/* loaded from: classes12.dex */
public final class kyx implements Runnable {
    public final /* synthetic */ myx b;

    public kyx(myx myxVar) {
        this.b = myxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rip ripVar;
        int i;
        myx myxVar = this.b;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (myxVar) {
            ripVar = myxVar.e;
            i = myxVar.f;
            myxVar.e = null;
            myxVar.f = 0;
            myxVar.g = myx.d.RUNNING;
            myxVar.i = uptimeMillis;
        }
        try {
            if (myx.e(ripVar, i)) {
                myxVar.b.a(ripVar, i);
            }
        } finally {
            rip.c(ripVar);
            myxVar.c();
        }
    }
}
