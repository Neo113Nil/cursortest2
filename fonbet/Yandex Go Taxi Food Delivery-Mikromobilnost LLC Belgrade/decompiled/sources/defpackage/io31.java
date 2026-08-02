package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class io31 {
    public final String a;
    public long b;

    public io31(String str) {
        this.a = str;
    }

    public final void a(String str) {
        Pair pair = new Pair("name", this.a);
        if (str == null) {
            str = "";
        }
        HashMap h = b.h(pair, new Pair("error_message", str), new Pair("processing_duration", Double.valueOf((SystemClock.uptimeMillis() - this.b) / 1000)));
        qgn0 qgn0Var = h2b1.c;
        if (qgn0Var != null) {
            qgn0Var.n("video_uploading_failed", h);
        }
    }

    public final void b() {
        HashMap h = b.h(new Pair("name", this.a), new Pair("processing_duration", Double.valueOf((SystemClock.uptimeMillis() - this.b) / 1000)));
        qgn0 qgn0Var = h2b1.c;
        if (qgn0Var != null) {
            qgn0Var.n("video_uploading_success", h);
        }
    }
}
