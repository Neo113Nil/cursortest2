package xsna;

import android.os.Build;
import android.os.Trace;

/* compiled from: AndroidTrace.android.kt */
/* loaded from: classes11.dex */
public final class ld2 {
    public static final void a(long j, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }
}
