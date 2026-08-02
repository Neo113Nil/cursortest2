package yads;

import android.os.Trace;

/* loaded from: classes10.dex */
public abstract class h83 {
    public static void a(String str) {
        if (mc3.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (mc3.a >= 18) {
            Trace.endSection();
        }
    }
}
