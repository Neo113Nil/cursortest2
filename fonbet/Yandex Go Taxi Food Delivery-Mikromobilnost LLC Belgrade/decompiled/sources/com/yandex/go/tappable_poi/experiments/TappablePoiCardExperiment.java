package com.yandex.go.tappable_poi.experiments;

import defpackage.dvw0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.n96;
import defpackage.vn11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/tappable_poi/experiments/TappablePoiCardExperiment;", "Lvn11;", "Ln96;", "Companion", "com/yandex/go/tappable_poi/experiments/b", "CardOption", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TappablePoiCardExperiment extends n96 implements vn11 {
    public static final b Companion = new b();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dvw0(21))};
    public static final TappablePoiCardExperiment e = new TappablePoiCardExperiment(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ TappablePoiCardExperiment(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public TappablePoiCardExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public TappablePoiCardExperiment() {
        this(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/tappable_poi/experiments/TappablePoiCardExperiment$CardOption;", "", "Companion", "$serializer", "com/yandex/go/tappable_poi/experiments/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class CardOption {
        public static final a Companion = new a();
        public static final i3y[] l = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dvw0(22)), null, null, null, null, null, null, null, null, null};
        public final String a;
        public final jsq0 b;
        public final boolean c;
        public final boolean d;
        public final int e;
        public final Float f;
        public final boolean g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;

        public /* synthetic */ CardOption(int i, String str, jsq0 jsq0Var, boolean z, boolean z2, int i2, Float f, boolean z3, String str2, String str3, String str4, String str5) {
            this.a = (i & 1) == 0 ? "none" : str;
            if ((i & 2) == 0) {
                this.b = ksq0.a;
            } else {
                this.b = jsq0Var;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
            if ((i & 8) == 0) {
                this.d = false;
            } else {
                this.d = z2;
            }
            if ((i & 16) == 0) {
                this.e = 0;
            } else {
                this.e = i2;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = f;
            }
            if ((i & 64) == 0) {
                this.g = false;
            } else {
                this.g = z3;
            }
            if ((i & 128) == 0) {
                this.h = TariffOrderFlow.ORDER_FLOW_TAXI_KEY;
            } else {
                this.h = str2;
            }
            if ((i & 256) == 0) {
                this.i = TariffOrderFlow.ORDER_FLOW_TAXI_KEY;
            } else {
                this.i = str3;
            }
            if ((i & 512) == 0) {
                this.j = "";
            } else {
                this.j = str4;
            }
            if ((i & 1024) == 0) {
                this.k = "";
            } else {
                this.k = str5;
            }
        }

        public CardOption() {
            jsq0 jsq0Var = ksq0.a;
            this.a = "none";
            this.b = jsq0Var;
            this.c = false;
            this.d = false;
            this.e = 0;
            this.f = null;
            this.g = false;
            this.h = TariffOrderFlow.ORDER_FLOW_TAXI_KEY;
            this.i = TariffOrderFlow.ORDER_FLOW_TAXI_KEY;
            this.j = "";
            this.k = "";
        }
    }
}
