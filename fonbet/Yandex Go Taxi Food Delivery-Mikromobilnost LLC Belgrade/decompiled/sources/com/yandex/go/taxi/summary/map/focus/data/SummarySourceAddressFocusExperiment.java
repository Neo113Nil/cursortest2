package com.yandex.go.taxi.summary.map.focus.data;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.xn11;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/map/focus/data/SummarySourceAddressFocusExperiment;", "Lxn11;", "Companion", "com/yandex/go/taxi/summary/map/focus/data/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SummarySourceAddressFocusExperiment implements xn11 {
    public static final d Companion = new d();
    public static final SummarySourceAddressFocusExperiment d = new SummarySourceAddressFocusExperiment(0);
    public final boolean b;
    public final Integer c;

    public /* synthetic */ SummarySourceAddressFocusExperiment(int i, Integer num, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummarySourceAddressFocusExperiment)) {
            return false;
        }
        SummarySourceAddressFocusExperiment summarySourceAddressFocusExperiment = (SummarySourceAddressFocusExperiment) obj;
        return this.b == summarySourceAddressFocusExperiment.b && jl40.l(this.c, summarySourceAddressFocusExperiment.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "SummarySourceAddressFocusExperiment(enabled=" + this.b + ", zoomLevel=" + this.c + Extension.C_BRAKE;
    }

    public SummarySourceAddressFocusExperiment(int i) {
        this.b = false;
        this.c = null;
    }

    public SummarySourceAddressFocusExperiment() {
        this(0);
    }
}
