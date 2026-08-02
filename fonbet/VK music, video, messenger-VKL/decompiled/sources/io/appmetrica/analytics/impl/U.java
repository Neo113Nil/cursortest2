package io.appmetrica.analytics.impl;

import android.content.Context;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.U;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;
import xsna.gzs;
import xsna.uod;

/* loaded from: classes8.dex */
public final class U implements Ma {
    public final Context a;
    public final ICommonExecutor b;
    public FutureTask i;
    public final J j;
    public boolean m;
    public final String c = "advertising identifiers collecting is forbidden by client configuration";
    public final String d = "advertising identifiers collecting is forbidden by startup";
    public final String e = "advertising identifiers collecting is forbidden by unknown reason";
    public final N f = new N(new Jg(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE));
    public final N g = new N(new Jg("huawei"));
    public final N h = new N(new Jg("yandex"));
    public volatile AdvertisingIdsHolder k = new AdvertisingIdsHolder();
    public G l = new G(4, 4, 4);

    public U(Context context, ICommonExecutor iCommonExecutor, C5100pm c5100pm) {
        this.a = context;
        this.b = iCommonExecutor;
        this.j = new J(c5100pm);
    }

    public static final Void e(U u) {
        u.k = new AdvertisingIdsHolder(u.a(u.l.a, new Q(u)), u.a(u.l.b, new S(u)), u.a(u.l.c, new T(u, new C4911ie())));
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    public final synchronized AdvertisingIdsHolder getIdentifiers(Context context) {
        return getIdentifiers();
    }

    @Override // io.appmetrica.analytics.impl.Ma
    public final synchronized void init() {
        if (this.i == null) {
            this.l = this.j.a();
            FutureTask futureTask = new FutureTask(new uod(this, 2));
            this.i = futureTask;
            this.b.execute(futureTask);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ma, io.appmetrica.analytics.impl.InterfaceC5229um
    public final synchronized void a(C5100pm c5100pm) {
        this.j.a(c5100pm);
        a((Qi) new C4911ie(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ma
    public final synchronized void b(boolean z) {
        this.m = true;
        this.j.b.update(z);
        a((Qi) new C4911ie(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ma
    public final synchronized void c(boolean z) {
        if (!this.m) {
            b(z);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ma
    public final synchronized AdvertisingIdsHolder getIdentifiers() {
        FutureTask futureTask = this.i;
        if (futureTask == null) {
            futureTask = null;
        }
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.k;
    }

    @Override // io.appmetrica.analytics.impl.Ma
    public final synchronized AdvertisingIdsHolder a() {
        return a(new C4911ie());
    }

    @Override // io.appmetrica.analytics.impl.Ma
    public final synchronized AdvertisingIdsHolder a(Qi qi) {
        try {
            a(qi, true).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.k;
    }

    public final FutureTask a(final Qi qi, final boolean z) {
        final G a = this.j.a();
        FutureTask futureTask = new FutureTask(new Callable() { // from class: xsna.ovp0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return U.a(z, a, this, qi);
            }
        });
        this.i = futureTask;
        this.b.execute(futureTask);
        FutureTask futureTask2 = this.i;
        if (futureTask2 == null) {
            return null;
        }
        return futureTask2;
    }

    public static final Void a(boolean z, G g, U u, Qi qi) {
        if (!z && epx.f(g, u.l)) {
            return null;
        }
        AdvertisingIdsHolder advertisingIdsHolder = u.k;
        AdTrackingInfoResult a = u.a(g.a, new Q(u));
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = a.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            a = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, a.mErrorExplanation);
        }
        AdTrackingInfoResult a2 = u.a(g.b, new S(u));
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = a2.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            a2 = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, a2.mErrorExplanation);
        }
        AdTrackingInfoResult a3 = u.a(g.c, new T(u, qi));
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = a3.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            a3 = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, a3.mErrorExplanation);
        }
        u.k = new AdvertisingIdsHolder(a, a2, a3);
        return null;
    }

    public final AdTrackingInfoResult a(int i, gzs gzsVar) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return (AdTrackingInfoResult) gzsVar.invoke();
        }
        if (i2 == 1) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.c);
        }
        if (i2 == 2) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.d);
        }
        if (i2 == 3) {
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.e);
        }
        throw new NoWhenBranchMatchedException();
    }
}
