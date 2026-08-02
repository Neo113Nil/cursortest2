package com.yandex.go.taxi.summary.map.focus.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.uiv0;
import defpackage.unr0;
import defpackage.xn11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/map/focus/data/SummaryZoomZonesExperiment;", "Lxn11;", "Companion", "com/yandex/go/taxi/summary/map/focus/data/e", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SummaryZoomZonesExperiment implements xn11 {
    public static final e Companion = new e();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new uiv0(21)), null};
    public static final SummaryZoomZonesExperiment f = new SummaryZoomZonesExperiment(0);
    public final boolean b;
    public final List c;
    public final Integer d;

    public /* synthetic */ SummaryZoomZonesExperiment(int i, boolean z, List list, Integer num) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryZoomZonesExperiment)) {
            return false;
        }
        SummaryZoomZonesExperiment summaryZoomZonesExperiment = (SummaryZoomZonesExperiment) obj;
        return this.b == summaryZoomZonesExperiment.b && jl40.l(this.c, summaryZoomZonesExperiment.c) && jl40.l(this.d, summaryZoomZonesExperiment.d);
    }

    public final int hashCode() {
        int c = unr0.c(Boolean.hashCode(this.b) * 31, 31, this.c);
        Integer num = this.d;
        return c + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SummaryZoomZonesExperiment(enabled=");
        sb.append(this.b);
        sb.append(", summaryZoomZones=");
        sb.append(this.c);
        sb.append(", zoomLevel=");
        return oo31.j(sb, this.d, Extension.C_BRAKE);
    }

    public SummaryZoomZonesExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
        this.d = null;
    }

    public SummaryZoomZonesExperiment() {
        this(0);
    }
}
