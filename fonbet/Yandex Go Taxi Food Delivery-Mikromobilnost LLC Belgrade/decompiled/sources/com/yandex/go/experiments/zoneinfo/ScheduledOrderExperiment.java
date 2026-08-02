package com.yandex.go.experiments.zoneinfo;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jrl0;
import defpackage.tse0;
import defpackage.xn11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/experiments/zoneinfo/ScheduledOrderExperiment;", "Lxn11;", "Companion", "com/yandex/go/experiments/zoneinfo/a", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ScheduledOrderExperiment implements xn11 {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(5))};
    public final List b;

    public /* synthetic */ ScheduledOrderExperiment(int i, List list) {
        if ((i & 1) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScheduledOrderExperiment) && jl40.l(this.b, ((ScheduledOrderExperiment) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return tse0.k("ScheduledOrderExperiment(tariffs=", Extension.C_BRAKE, this.b);
    }

    public ScheduledOrderExperiment(int i) {
        this.b = EmptyList.a;
    }

    public ScheduledOrderExperiment() {
        this(0);
    }
}
