package com.ybsdk.common.repositiories.auth;

import android.os.SystemClock;
import com.ybsdk.rconfig.PinConfig;
import defpackage.dnz0;
import defpackage.ffx;
import defpackage.h3y;
import defpackage.qda0;
import defpackage.saj;
import defpackage.tje;
import defpackage.tse;
import defpackage.tvv;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class g {
    public final h3y a;
    public final com.ybsdk.rconfig.b b;
    public final tse c;
    public final com.ybsdk.feature.pinstorage.internal.data.c d;
    public final tvv e;
    public final AtomicReference f = new AtomicReference(new dnz0(null, null));
    public final n0 g = ffx.c(0, 1, null, 5);

    public g(h3y h3yVar, com.ybsdk.rconfig.b bVar, tse tseVar, com.ybsdk.feature.pinstorage.internal.data.c cVar, tvv tvvVar) {
        this.a = h3yVar;
        this.b = bVar;
        this.c = tseVar;
        this.d = cVar;
        this.e = tvvVar;
    }

    public final void a() {
        this.f.updateAndGet(new saj(4, new qda0(4)));
    }

    public final boolean b() {
        dnz0 dnz0Var;
        Long l;
        if (!this.d.h() || (l = (dnz0Var = (dnz0) this.f.get()).b) == null) {
            return true;
        }
        long longValue = l.longValue();
        if (dnz0Var.a == null) {
            return false;
        }
        com.ybsdk.rconfig.b bVar = this.b;
        return TimeUnit.SECONDS.toMillis((long) ((PinConfig) bVar.d(bVar.i.c).getData()).getValidTimeSeconds()) + longValue > SystemClock.elapsedRealtime();
    }

    public final void c() {
        tje.N(this.c, null, null, new PinTokenCacheManager$validatePinOnReturningToApp$1(this, (com.ybsdk.common.e) this.a.get(), null), 3);
    }
}
