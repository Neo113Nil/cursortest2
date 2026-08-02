package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.tg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5197tg implements InterfaceC5094pg {
    public final boolean a;
    public final Gi b;
    public final C4834ff c;
    public final X7 d;
    public final Bg e;
    public final Handler f;

    public C5197tg(Gi gi, C4834ff c4834ff, @NonNull Handler handler) {
        this(gi, c4834ff, handler, c4834ff.s());
    }

    public final void a() {
        if (this.a) {
            return;
        }
        Gi gi = this.b;
        Dg dg = new Dg(this.f, this);
        gi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", dg);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = I9.a;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        Y3 y3 = new Y3("", "", 4098, 0, anonymousInstance);
        y3.m = bundle;
        R4 r4 = gi.a;
        gi.a(Gi.a(y3, r4), r4, 1, (Map) null);
    }

    public C5197tg(Gi gi, C4834ff c4834ff, Handler handler, boolean z) {
        this(gi, c4834ff, handler, z, new X7(z), new Bg());
    }

    public C5197tg(Gi gi, C4834ff c4834ff, Handler handler, boolean z, X7 x7, Bg bg) {
        this.b = gi;
        this.c = c4834ff;
        this.a = z;
        this.d = x7;
        this.e = bg;
        this.f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5094pg
    public final void a(@Nullable C5298xg c5298xg) {
        String str = c5298xg == null ? null : c5298xg.a;
        if (this.a) {
            return;
        }
        synchronized (this) {
            X7 x7 = this.d;
            this.e.getClass();
            x7.d = Bg.a(str);
            x7.a();
        }
    }

    public final synchronized void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            X7 x7 = this.d;
            x7.c = deferredDeeplinkParametersListener;
            if (x7.a) {
                x7.a(1);
            } else {
                x7.a();
            }
            this.c.u();
        } catch (Throwable th) {
            this.c.u();
            throw th;
        }
    }

    public final synchronized void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            X7 x7 = this.d;
            x7.b = deferredDeeplinkListener;
            if (x7.a) {
                x7.a(1);
            } else {
                x7.a();
            }
            this.c.u();
        } catch (Throwable th) {
            this.c.u();
            throw th;
        }
    }
}
