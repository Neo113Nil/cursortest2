package com.yandex.go.taxi.summary.shared.models;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.x4e;
import defpackage.xn11;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/shared/models/SmallSummaryConfigExperiment;", "Lxn11;", "Companion", "com/yandex/go/taxi/summary/shared/models/a", "$serializer", "shared"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SmallSummaryConfigExperiment implements xn11 {
    public static final a Companion = new a();
    public static final SmallSummaryConfigExperiment e = new SmallSummaryConfigExperiment(0);
    public final boolean b;
    public final float c;
    public final boolean d;

    public /* synthetic */ SmallSummaryConfigExperiment(int i, float f, boolean z, boolean z2) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? 0.0f : f;
        if ((i & 4) == 0) {
            this.d = true;
        } else {
            this.d = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallSummaryConfigExperiment)) {
            return false;
        }
        SmallSummaryConfigExperiment smallSummaryConfigExperiment = (SmallSummaryConfigExperiment) obj;
        return this.b == smallSummaryConfigExperiment.b && Float.compare(this.c, smallSummaryConfigExperiment.c) == 0 && this.d == smallSummaryConfigExperiment.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + g8e.c(this.c, Boolean.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmallSummaryConfigExperiment(enabled=");
        sb.append(this.b);
        sb.append(", minHeight=");
        sb.append(this.c);
        sb.append(", shouldHideBubbles=");
        return x4e.i(sb, this.d, Extension.C_BRAKE);
    }

    public SmallSummaryConfigExperiment(int i) {
        this.b = false;
        this.c = 0.0f;
        this.d = true;
    }

    public SmallSummaryConfigExperiment() {
        this(0);
    }
}
