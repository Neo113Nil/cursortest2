package com.vungle.ads.fpd;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.cti;
import xsna.g18;
import xsna.imi0;
import xsna.lmi0;
import xsna.mqr;
import xsna.ozl;
import xsna.zcl;

@imi0
/* loaded from: classes7.dex */
public final class Revenue {
    public static final Companion Companion = new Companion(null);
    public Float a;
    public Float b;
    public Float c;
    public Boolean d;

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final KSerializer<Revenue> serializer() {
            return Revenue$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    public Revenue() {
    }

    public static final void write$Self(Revenue revenue, cti ctiVar, SerialDescriptor serialDescriptor) {
        if (ctiVar.z() || revenue.a != null) {
            ctiVar.s(serialDescriptor, 0, mqr.a, revenue.a);
        }
        if (ctiVar.z() || revenue.b != null) {
            ctiVar.s(serialDescriptor, 1, mqr.a, revenue.b);
        }
        if (ctiVar.z() || revenue.c != null) {
            ctiVar.s(serialDescriptor, 2, mqr.a, revenue.c);
        }
        if (!ctiVar.z() && revenue.d == null) {
            return;
        }
        ctiVar.s(serialDescriptor, 3, g18.a, revenue.d);
    }

    public final Revenue setIAARevenueUSD(float f) {
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= f && f <= Float.MAX_VALUE) {
            this.a = Float.valueOf(f);
        }
        return this;
    }

    public final Revenue setIAPRevenueUSD(float f) {
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= f && f <= Float.MAX_VALUE) {
            this.b = Float.valueOf(f);
        }
        return this;
    }

    public final Revenue setIsUserAPurchaser(boolean z) {
        this.d = Boolean.valueOf(z);
        return this;
    }

    public final Revenue setTotalRevenueUSD(float f) {
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= f && f <= Float.MAX_VALUE) {
            this.c = Float.valueOf(f);
        }
        return this;
    }

    @ozl
    public /* synthetic */ Revenue(int i, Float f, Float f2, Float f3, Boolean bool, lmi0 lmi0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = f;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    @ozl
    public final Revenue setEarningsByPlacement(float f) {
        return this;
    }

    @ozl
    public final Revenue setIsUserASubscriber(boolean z) {
        return this;
    }

    @ozl
    public final Revenue setLast30DaysMeanSpendUsd(float f) {
        return this;
    }

    @ozl
    public final Revenue setLast30DaysMedianSpendUsd(float f) {
        return this;
    }

    @ozl
    public final Revenue setLast30DaysPlacementFillRate(float f) {
        return this;
    }

    @ozl
    public final Revenue setLast30DaysTotalSpendUsd(float f) {
        return this;
    }

    @ozl
    public final Revenue setLast30DaysUserLtvUsd(float f) {
        return this;
    }

    @ozl
    public final Revenue setLast30DaysUserPltvUsd(float f) {
        return this;
    }

    @ozl
    public final Revenue setLast7DaysMeanSpendUsd(float f) {
        return this;
    }

    @ozl
    public final Revenue setLast7DaysMedianSpendUsd(float f) {
        return this;
    }

    @ozl
    public final Revenue setLast7DaysPlacementFillRate(float f) {
        return this;
    }

    @ozl
    public final Revenue setLast7DaysTotalSpendUsd(float f) {
        return this;
    }

    @ozl
    public final Revenue setLast7DaysUserLtvUsd(float f) {
        return this;
    }

    @ozl
    public final Revenue setLast7DaysUserPltvUsd(float f) {
        return this;
    }

    @ozl
    public final Revenue setTopNAdomain(List<String> list) {
        return this;
    }

    @ozl
    public final Revenue setTotalEarningsUsd(float f) {
        return this;
    }
}
