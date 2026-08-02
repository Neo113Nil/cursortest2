package com.yandex.go.superapp.order_tracking.common.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.tsv0;
import defpackage.w96;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/superapp/order_tracking/common/experiments/SuperAppOrderTrackingExperiment;", "Lw96;", "Companion", "x5w0", "com/yandex/go/superapp/order_tracking/common/experiments/g", "com/yandex/go/superapp/order_tracking/common/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SuperAppOrderTrackingExperiment extends w96 {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tsv0(28))};
    public static final SuperAppOrderTrackingExperiment e = new SuperAppOrderTrackingExperiment(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ SuperAppOrderTrackingExperiment(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppOrderTrackingExperiment)) {
            return false;
        }
        SuperAppOrderTrackingExperiment superAppOrderTrackingExperiment = (SuperAppOrderTrackingExperiment) obj;
        return this.b == superAppOrderTrackingExperiment.b && jl40.l(this.c, superAppOrderTrackingExperiment.c);
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "SuperAppOrderTrackingExperiment(enabled=" + this.b + ", services=" + this.c + Extension.C_BRAKE;
    }

    public SuperAppOrderTrackingExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public SuperAppOrderTrackingExperiment() {
        this(0);
    }
}
