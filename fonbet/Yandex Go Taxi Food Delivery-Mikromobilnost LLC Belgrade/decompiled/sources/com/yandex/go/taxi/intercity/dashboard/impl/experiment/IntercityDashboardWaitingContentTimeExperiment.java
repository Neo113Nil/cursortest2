package com.yandex.go.taxi.intercity.dashboard.impl.experiment;

import defpackage.gsq0;
import defpackage.xn11;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/experiment/IntercityDashboardWaitingContentTimeExperiment;", "Lxn11;", "Companion", "com/yandex/go/taxi/intercity/dashboard/impl/experiment/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class IntercityDashboardWaitingContentTimeExperiment implements xn11 {
    public static final d Companion = new d();
    public final boolean b;
    public final long c;

    public /* synthetic */ IntercityDashboardWaitingContentTimeExperiment(boolean z, int i, long j) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = 0L;
        } else {
            this.c = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercityDashboardWaitingContentTimeExperiment)) {
            return false;
        }
        IntercityDashboardWaitingContentTimeExperiment intercityDashboardWaitingContentTimeExperiment = (IntercityDashboardWaitingContentTimeExperiment) obj;
        return this.b == intercityDashboardWaitingContentTimeExperiment.b && this.c == intercityDashboardWaitingContentTimeExperiment.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "IntercityDashboardWaitingContentTimeExperiment(enabled=" + this.b + ", waitingContentTimeMs=" + this.c + Extension.C_BRAKE;
    }

    public IntercityDashboardWaitingContentTimeExperiment() {
        this.b = false;
        this.c = 0L;
    }
}
