package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes8.dex */
public abstract class D0 {
    public static N6 a(Handler handler, C0 c0) {
        return new N6(handler, c0);
    }

    public static Lf a(Context context, N6 n6) {
        return new Lf(context, n6);
    }

    public static Gi a(Lf lf, Context context, ICommonExecutor iCommonExecutor) {
        C5078p0 c5078p0 = new C5078p0(context, iCommonExecutor);
        return new Gi(c5078p0, new C4766co(new C5293xb()), new R4(lf), new C4916ik(context, c5078p0));
    }

    public static Yl a(Context context, Gi gi, C4834ff c4834ff, Handler handler) {
        return new Yl(gi, new C4867gm(context, c4834ff), handler);
    }

    public static C5197tg a(Gi gi, C4834ff c4834ff, Handler handler) {
        return new C5197tg(gi, c4834ff, handler, c4834ff.s());
    }

    public static C5199ti a(Context context, Lf lf, Gi gi, Handler handler, Yl yl) {
        return new C5199ti(context, lf, gi, handler, yl);
    }

    public static C5039nd a(Context context) {
        return new C5039nd(C5030n4.l().c.a(), C5030n4.l().b(context), "client_modules", new SystemTimeProvider());
    }
}
