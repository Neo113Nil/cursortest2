package com.yandex.go.taxi.order.perf.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.xn11;
import defpackage.z2y0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/perf/experiment/TaxiOrderPerfTweaksExperiment;", "Lxn11;", "Companion", "DelayType", "com/yandex/go/taxi/order/perf/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TaxiOrderPerfTweaksExperiment implements xn11 {
    public static final a Companion = new a();
    public static final i3y[] m;
    public static final TaxiOrderPerfTweaksExperiment n;
    public final boolean b;
    public final boolean c;
    public final DelayType d;
    public final DelayType e;
    public final DelayType f;
    public final boolean g;
    public final boolean h;
    public final DelayType i;
    public final DelayType j;
    public final boolean k;
    public final boolean l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/perf/experiment/TaxiOrderPerfTweaksExperiment$DelayType;", "", "Companion", "com/yandex/go/taxi/order/perf/experiment/b", "FCP", "LCP_DEFAULTS", "LCP", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class DelayType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ DelayType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final DelayType FCP;
        public static final DelayType LCP;
        public static final DelayType LCP_DEFAULTS;

        static {
            DelayType delayType = new DelayType("FCP", 0);
            FCP = delayType;
            DelayType delayType2 = new DelayType("LCP_DEFAULTS", 1);
            LCP_DEFAULTS = delayType2;
            DelayType delayType3 = new DelayType("LCP", 2);
            LCP = delayType3;
            DelayType[] delayTypeArr = {delayType, delayType2, delayType3};
            $VALUES = delayTypeArr;
            $ENTRIES = kotlin.enums.a.a(delayTypeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z2y0(22));
        }

        public static DelayType valueOf(String str) {
            return (DelayType) Enum.valueOf(DelayType.class, str);
        }

        public static DelayType[] values() {
            return (DelayType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        m = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new z2y0(17)), kotlin.a.b(lazyThreadSafetyMode, new z2y0(18)), kotlin.a.b(lazyThreadSafetyMode, new z2y0(19)), null, null, kotlin.a.b(lazyThreadSafetyMode, new z2y0(20)), kotlin.a.b(lazyThreadSafetyMode, new z2y0(21)), null, null};
        n = new TaxiOrderPerfTweaksExperiment(0);
    }

    public /* synthetic */ TaxiOrderPerfTweaksExperiment(int i, boolean z, boolean z2, DelayType delayType, DelayType delayType2, DelayType delayType3, boolean z3, boolean z4, DelayType delayType4, DelayType delayType5, boolean z5, boolean z6) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = delayType;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = delayType2;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = delayType3;
        }
        if ((i & 32) == 0) {
            this.g = false;
        } else {
            this.g = z3;
        }
        if ((i & 64) == 0) {
            this.h = false;
        } else {
            this.h = z4;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = delayType4;
        }
        if ((i & 256) == 0) {
            this.j = null;
        } else {
            this.j = delayType5;
        }
        if ((i & 512) == 0) {
            this.k = false;
        } else {
            this.k = z5;
        }
        if ((i & 1024) == 0) {
            this.l = false;
        } else {
            this.l = z6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiOrderPerfTweaksExperiment)) {
            return false;
        }
        TaxiOrderPerfTweaksExperiment taxiOrderPerfTweaksExperiment = (TaxiOrderPerfTweaksExperiment) obj;
        return this.b == taxiOrderPerfTweaksExperiment.b && this.c == taxiOrderPerfTweaksExperiment.c && this.d == taxiOrderPerfTweaksExperiment.d && this.e == taxiOrderPerfTweaksExperiment.e && this.f == taxiOrderPerfTweaksExperiment.f && this.g == taxiOrderPerfTweaksExperiment.g && this.h == taxiOrderPerfTweaksExperiment.h && this.i == taxiOrderPerfTweaksExperiment.i && this.j == taxiOrderPerfTweaksExperiment.j && this.k == taxiOrderPerfTweaksExperiment.k && this.l == taxiOrderPerfTweaksExperiment.l;
    }

    public final int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.b) * 31, 31, this.c);
        DelayType delayType = this.d;
        int hashCode = (e + (delayType == null ? 0 : delayType.hashCode())) * 31;
        DelayType delayType2 = this.e;
        int hashCode2 = (hashCode + (delayType2 == null ? 0 : delayType2.hashCode())) * 31;
        DelayType delayType3 = this.f;
        int e2 = unr0.e(unr0.e((hashCode2 + (delayType3 == null ? 0 : delayType3.hashCode())) * 31, 31, this.g), 31, this.h);
        DelayType delayType4 = this.i;
        int hashCode3 = (e2 + (delayType4 == null ? 0 : delayType4.hashCode())) * 31;
        DelayType delayType5 = this.j;
        return Boolean.hashCode(this.l) + unr0.e((hashCode3 + (delayType5 != null ? delayType5.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder u = qv10.u("TaxiOrderPerfTweaksExperiment(fastDetailsWatchdogEnabled=", ", panoramaInteractorOffMainThread=", ", trackingBottomContainerDelayType=", this.b, this.c);
        u.append(this.d);
        u.append(", mapOverlayDelayType=");
        u.append(this.e);
        u.append(", orderViewInitDelayType=");
        u.append(this.f);
        u.append(", preventMapOverlayInitialization=");
        u.append(this.g);
        u.append(", preventOverlayRecreationBetweenTrackingAndDetails=");
        u.append(this.h);
        u.append(", webMessengerPreloadDelayType=");
        u.append(this.i);
        u.append(", promotionPopupRouterDelayType=");
        u.append(this.j);
        u.append(", eagerOrderProvisioning=");
        u.append(this.k);
        u.append(", isLightWeightFirstTotwResponseEnabled=");
        return x4e.i(u, this.l, Extension.C_BRAKE);
    }

    public TaxiOrderPerfTweaksExperiment(int i) {
        this.b = false;
        this.c = false;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = false;
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
    }

    public TaxiOrderPerfTweaksExperiment() {
        this(0);
    }
}
