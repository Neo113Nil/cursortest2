package com.yandex.go.taxi.experiments;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.vn11;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/experiments/MarketplaceAltDeeplinkExperiment;", "Lvn11;", "Companion", "com/yandex/go/taxi/experiments/h", "$serializer", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarketplaceAltDeeplinkExperiment implements vn11 {
    public static final h Companion = new h();
    public static final MarketplaceAltDeeplinkExperiment c = new MarketplaceAltDeeplinkExperiment(0);
    public final String b;

    public /* synthetic */ MarketplaceAltDeeplinkExperiment(int i, String str) {
        if ((i & 1) == 0) {
            this.b = "yandexyango://marketplace?screen=sell_flex";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketplaceAltDeeplinkExperiment) && jl40.l(this.b, ((MarketplaceAltDeeplinkExperiment) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("MarketplaceAltDeeplinkExperiment(deeplink=", this.b, Extension.C_BRAKE);
    }

    public MarketplaceAltDeeplinkExperiment(int i) {
        this.b = "yandexyango://marketplace?screen=sell_flex";
    }

    public MarketplaceAltDeeplinkExperiment() {
        this(0);
    }
}
