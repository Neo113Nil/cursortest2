package xsna;

import android.os.Handler;
import android.os.Looper;

/* compiled from: ConcurrencyHelpers.java */
/* loaded from: classes12.dex */
public final class mwi {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
