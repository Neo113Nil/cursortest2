package xsna;

import android.os.Looper;

/* compiled from: Thread.android.kt */
/* loaded from: classes.dex */
public final class sro0 {
    public static final long a;

    static {
        long j;
        try {
            j = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j = -1;
        }
        a = j;
    }
}
