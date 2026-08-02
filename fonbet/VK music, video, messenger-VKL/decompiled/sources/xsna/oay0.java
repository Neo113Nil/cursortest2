package xsna;

import android.os.SystemClock;
import android.util.LruCache;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class oay0 {
    public static final oay0 e = new oay0();
    public static final a f = new a("");
    public final LruCache a = new LruCache(10);
    public long b;
    public long c;
    public boolean d;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a {
        public final long a = SystemClock.elapsedRealtime();
        public final String b;

        public a(String str) {
            this.b = str;
        }
    }

    public static String a(long j, String str) {
        if (str.isEmpty()) {
            return "";
        }
        String a2 = defpackage.k0.a(j, ":2:");
        return str.replace(StringUtils.COMMA, a2 + StringUtils.COMMA) + a2;
    }

    public final synchronized void b(ArrayList arrayList, long j) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((xey0) it.next()).F;
            this.a.put(str, str + ":1:" + j);
        }
    }
}
