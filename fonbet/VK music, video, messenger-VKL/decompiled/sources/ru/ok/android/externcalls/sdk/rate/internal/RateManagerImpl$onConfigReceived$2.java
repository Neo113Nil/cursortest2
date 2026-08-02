package ru.ok.android.externcalls.sdk.rate.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.rate.RateHint;
import xsna.epx;
import xsna.g0t;
import xsna.xzs;

/* compiled from: RateManagerImpl.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class RateManagerImpl$onConfigReceived$2 implements RateHintCollection, g0t {
    final /* synthetic */ RateManagerImpl $tmp0;

    public RateManagerImpl$onConfigReceived$2(RateManagerImpl rateManagerImpl) {
        this.$tmp0 = rateManagerImpl;
    }

    @Override // ru.ok.android.externcalls.sdk.rate.internal.RateHintCollection
    public final void addRateHint(RateHint rateHint) {
        this.$tmp0.addRateHint(rateHint);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof RateHintCollection) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, RateManagerImpl.class, "addRateHint", "addRateHint(Lru/ok/android/externcalls/sdk/rate/RateHint;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
