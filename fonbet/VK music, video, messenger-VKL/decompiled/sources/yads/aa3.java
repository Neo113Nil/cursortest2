package yads;

import android.os.Handler;

/* loaded from: classes10.dex */
public final class aa3 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = ba3.i;
        if (handler != null) {
            handler.post(ba3.j);
            ba3.i.postDelayed(ba3.k, 200L);
        }
    }
}
