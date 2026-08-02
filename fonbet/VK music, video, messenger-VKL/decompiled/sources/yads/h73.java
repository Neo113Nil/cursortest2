package yads;

import android.os.Looper;
import xsna.epx;

/* loaded from: classes10.dex */
public final class h73 {
    public static boolean a() {
        return epx.f(Thread.currentThread(), Looper.getMainLooper().getThread());
    }
}
