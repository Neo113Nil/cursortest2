package defpackage;

import android.os.Handler;

/* loaded from: classes7.dex */
public final class il61 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = oo61.h;
        if (handler != null) {
            handler.post(oo61.i);
            oo61.h.postDelayed(oo61.j, 200L);
        }
    }
}
