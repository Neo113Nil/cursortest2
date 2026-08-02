package xsna;

import android.os.Trace;
import androidx.annotation.NonNull;

/* compiled from: TraceApi29Impl.java */
/* loaded from: classes.dex */
public final class odp0 {
    public static void a(int i, @NonNull String str) {
        Trace.beginAsyncSection(str, i);
    }

    public static void b(int i, @NonNull String str) {
        Trace.endAsyncSection(str, i);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
