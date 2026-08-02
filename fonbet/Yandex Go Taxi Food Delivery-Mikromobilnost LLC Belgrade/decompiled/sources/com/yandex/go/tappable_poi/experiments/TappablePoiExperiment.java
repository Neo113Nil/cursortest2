package com.yandex.go.tappable_poi.experiments;

import defpackage.dvw0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.xn11;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/tappable_poi/experiments/TappablePoiExperiment;", "Lxn11;", "Companion", "com/yandex/go/tappable_poi/experiments/d", "TappablePoiExpItem", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TappablePoiExperiment implements xn11 {
    public static final d Companion = new d();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dvw0(23))};
    public static final TappablePoiExperiment e = new TappablePoiExperiment(0);
    public final boolean b;
    public final List c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/tappable_poi/experiments/TappablePoiExperiment$TappablePoiExpItem;", "", "Companion", "$serializer", "com/yandex/go/tappable_poi/experiments/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final /* data */ class TappablePoiExpItem {
        public static final e Companion = new e();
        public String a = "org";
        public boolean b = false;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TappablePoiExpItem)) {
                return false;
            }
            TappablePoiExpItem tappablePoiExpItem = (TappablePoiExpItem) obj;
            return jl40.l(this.a, tappablePoiExpItem.a) && this.b == tappablePoiExpItem.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return xvz.k("TappablePoiExpItem(type=", this.a, ", hasName=", this.b, Extension.C_BRAKE);
        }
    }

    public /* synthetic */ TappablePoiExperiment(int i, boolean z, List list) {
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
        if (!(obj instanceof TappablePoiExperiment)) {
            return false;
        }
        TappablePoiExperiment tappablePoiExperiment = (TappablePoiExperiment) obj;
        return this.b == tappablePoiExperiment.b && jl40.l(this.c, tappablePoiExperiment.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "TappablePoiExperiment(isFavoriteTappable=" + this.b + ", relevantPoi=" + this.c + Extension.C_BRAKE;
    }

    public TappablePoiExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public TappablePoiExperiment() {
        this(0);
    }
}
