package defpackage;

import android.system.Os;
import android.system.OsConstants;
import com.yandex.pulse.metrics.g;

/* loaded from: classes8.dex */
public abstract class q1x0 {
    public static final long a;

    static {
        g gVar = g.a;
        long sysconf = Os.sysconf(OsConstants._SC_PHYS_PAGES);
        long sysconf2 = Os.sysconf(OsConstants._SC_PAGESIZE);
        a = (sysconf == -1 || sysconf2 == -1) ? 0L : sysconf * sysconf2;
    }
}
