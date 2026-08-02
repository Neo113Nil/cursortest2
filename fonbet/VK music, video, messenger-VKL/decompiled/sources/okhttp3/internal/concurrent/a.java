package okhttp3.internal.concurrent;

import java.util.Arrays;
import xsna.c5o0;
import xsna.efz;
import xsna.x6o0;

/* compiled from: TaskLogger.kt */
/* loaded from: classes8.dex */
public final class a {
    public static final void a(c5o0 c5o0Var, x6o0 x6o0Var, String str) {
        TaskRunner.h.getClass();
        TaskRunner.j.fine(x6o0Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + c5o0Var.a);
    }

    public static final String b(long j) {
        String b;
        if (j <= -999500000) {
            b = efz.b((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            b = efz.b((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            b = efz.b((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            b = efz.b((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            b = efz.b((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            b = efz.b((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{b}, 1));
    }
}
