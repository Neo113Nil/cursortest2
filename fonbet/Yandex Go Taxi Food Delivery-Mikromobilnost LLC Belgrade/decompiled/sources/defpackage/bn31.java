package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class bn31 {
    public final String a;
    public long b;

    public bn31(String str) {
        this.a = str;
    }

    public final void a(String str) {
        HashMap h = b.h(new Pair("name", this.a), new Pair("error_message", str), new Pair("processing_duration", Double.valueOf((SystemClock.uptimeMillis() - this.b) / 1000)));
        qgn0 qgn0Var = h2b1.c;
        if (qgn0Var != null) {
            qgn0Var.n("video_processing_failed", h);
        }
    }

    public final void b(Double d) {
        HashMap h = b.h(new Pair("name", this.a), new Pair("processing_duration", Double.valueOf((SystemClock.uptimeMillis() - this.b) / 1000)));
        h.put("video_size_bytes", d);
        qgn0 qgn0Var = h2b1.c;
        if (qgn0Var != null) {
            qgn0Var.n("video_processing_success", h);
        }
    }
}
