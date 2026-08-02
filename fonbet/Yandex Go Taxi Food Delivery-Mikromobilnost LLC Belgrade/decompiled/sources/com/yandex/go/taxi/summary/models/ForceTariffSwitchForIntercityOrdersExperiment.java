package com.yandex.go.taxi.summary.models;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ogr;
import defpackage.unr0;
import defpackage.xn11;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/summary/models/ForceTariffSwitchForIntercityOrdersExperiment;", "Lxn11;", "Companion", "f2s", "TariffRule", "com/yandex/go/taxi/summary/models/b", "$serializer", "solid"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ForceTariffSwitchForIntercityOrdersExperiment implements xn11 {
    public static final b Companion = new b();
    public static final i3y[] j;
    public static final ForceTariffSwitchForIntercityOrdersExperiment k;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final Map i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new ogr(17)), kotlin.a.b(lazyThreadSafetyMode, new ogr(18))};
        k = new ForceTariffSwitchForIntercityOrdersExperiment(0);
    }

    public /* synthetic */ ForceTariffSwitchForIntercityOrdersExperiment(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List list, Map map) {
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
            this.d = false;
        } else {
            this.d = z3;
        }
        if ((i & 8) == 0) {
            this.e = false;
        } else {
            this.e = z4;
        }
        if ((i & 16) == 0) {
            this.f = false;
        } else {
            this.f = z5;
        }
        if ((i & 32) == 0) {
            this.g = false;
        } else {
            this.g = z6;
        }
        if ((i & 64) == 0) {
            this.h = EmptyList.a;
        } else {
            this.h = list;
        }
        if ((i & 128) == 0) {
            this.i = kotlin.collections.b.f();
        } else {
            this.i = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForceTariffSwitchForIntercityOrdersExperiment)) {
            return false;
        }
        ForceTariffSwitchForIntercityOrdersExperiment forceTariffSwitchForIntercityOrdersExperiment = (ForceTariffSwitchForIntercityOrdersExperiment) obj;
        return this.b == forceTariffSwitchForIntercityOrdersExperiment.b && this.c == forceTariffSwitchForIntercityOrdersExperiment.c && this.d == forceTariffSwitchForIntercityOrdersExperiment.d && this.e == forceTariffSwitchForIntercityOrdersExperiment.e && this.f == forceTariffSwitchForIntercityOrdersExperiment.f && this.g == forceTariffSwitchForIntercityOrdersExperiment.g && jl40.l(this.h, forceTariffSwitchForIntercityOrdersExperiment.h) && jl40.l(this.i, forceTariffSwitchForIntercityOrdersExperiment.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + unr0.c(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/models/ForceTariffSwitchForIntercityOrdersExperiment$TariffRule;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/models/c", "solid"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TariffRule {
        public static final c Companion = new c();
        public static final i3y[] c;
        public final List a;
        public final List b;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new ogr(19)), kotlin.a.b(lazyThreadSafetyMode, new ogr(20))};
        }

        public /* synthetic */ TariffRule(List list, List list2, int i) {
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.a = emptyList;
            } else {
                this.a = list;
            }
            if ((i & 2) == 0) {
                this.b = emptyList;
            } else {
                this.b = list2;
            }
        }

        public TariffRule() {
            EmptyList emptyList = EmptyList.a;
            this.a = emptyList;
            this.b = emptyList;
        }
    }

    public ForceTariffSwitchForIntercityOrdersExperiment() {
        this(0);
    }

    public ForceTariffSwitchForIntercityOrdersExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = EmptyList.a;
        this.i = f;
    }
}
