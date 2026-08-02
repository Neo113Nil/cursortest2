package com.yandex.go.taxi.order.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.xn11;
import defpackage.zfj0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/experiments/RideCardComposeExperiment;", "Lxn11;", "Companion", "com/yandex/go/taxi/order/experiments/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RideCardComposeExperiment implements xn11 {
    public static final d Companion = new d();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zfj0(26))};
    public static final RideCardComposeExperiment e = new RideCardComposeExperiment(0);
    public final boolean b;
    public final Map c;

    public /* synthetic */ RideCardComposeExperiment(Map map, boolean z, int i) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardComposeExperiment)) {
            return false;
        }
        RideCardComposeExperiment rideCardComposeExperiment = (RideCardComposeExperiment) obj;
        return this.b == rideCardComposeExperiment.b && jl40.l(this.c, rideCardComposeExperiment.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "RideCardComposeExperiment(enabled=" + this.b + ", items=" + this.c + Extension.C_BRAKE;
    }

    public RideCardComposeExperiment() {
        this(0);
    }

    public RideCardComposeExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
    }
}
