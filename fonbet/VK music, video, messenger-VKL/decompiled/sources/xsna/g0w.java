package xsna;

import com.vk.im.engine.internal.storage.ImDatabaseSlowQueryException;
import com.vk.im.engine.reporters.performance.events.LogType;
import io.requery.android.database.SlowQueryLogger;
import kotlin.text.Regex;

/* compiled from: ImDatabaseLogger.kt */
/* loaded from: classes2.dex */
public final class g0w implements SlowQueryLogger {
    public static final Regex b = new Regex("\\s+");
    public static final Regex c = new Regex("[-]?\\d+");
    public static final Regex d = new Regex("'\\w+'");
    public static final Regex e = new Regex("\\?(?:,\\s*\\?)*");
    public final long a;

    public g0w(long j) {
        this.a = j;
    }

    @Override // io.requery.android.database.SlowQueryLogger
    public final void logQuery(String str, String str2, long j) {
        if (j > this.a) {
            String g = e.g(d.g(c.g(drm0.p0(b.g(str, " ")).toString(), "?"), "?"), "?");
            new r3w0(LogType.DB_QUERIES_STAT, g, str2, null, null, null, null, Integer.valueOf((int) j), null, null, null, 16248).q();
            if (g.length() >= 256) {
                com.vk.metrics.eventtracking.b.a.a(new ImDatabaseSlowQueryException(g, str2, j));
            }
        }
    }
}
