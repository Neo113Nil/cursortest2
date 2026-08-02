package com.yandex.go.taxi.order.experiments;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.gjx0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.jyx0;
import defpackage.ksq0;
import defpackage.unr0;
import defpackage.vn11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.object.DriveState;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/experiments/TaxiOrderButtonPositionExperiment;", "Lvn11;", "Companion", "com/yandex/go/taxi/order/experiments/i", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TaxiOrderButtonPositionExperiment implements vn11 {
    public static final i Companion = new i();
    public static final i3y[] e;
    public static final TaxiOrderButtonPositionExperiment f;
    public final boolean b;
    public final jsq0 c;
    public final jsq0 d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new gjx0(8)), kotlin.a.b(lazyThreadSafetyMode, new gjx0(9))};
        f = new TaxiOrderButtonPositionExperiment(0);
    }

    public /* synthetic */ TaxiOrderButtonPositionExperiment(int i, boolean z, jsq0 jsq0Var, jsq0 jsq0Var2) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = ksq0.a;
        } else {
            this.c = jsq0Var;
        }
        if ((i & 4) == 0) {
            this.d = ksq0.a;
        } else {
            this.d = jsq0Var2;
        }
    }

    public final boolean a(DriveState driveState, OrderScreen orderScreen) {
        if (this.b) {
            int i = jyx0.a[orderScreen.ordinal()];
            if (i != 1 ? (i == 2 || i == 3) ? this.c.contains(driveState) : false : this.d.contains(driveState)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiOrderButtonPositionExperiment)) {
            return false;
        }
        TaxiOrderButtonPositionExperiment taxiOrderButtonPositionExperiment = (TaxiOrderButtonPositionExperiment) obj;
        return this.b == taxiOrderButtonPositionExperiment.b && jl40.l(this.c, taxiOrderButtonPositionExperiment.c) && jl40.l(this.d, taxiOrderButtonPositionExperiment.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + unr0.c(Boolean.hashCode(this.b) * 31, 31, this.c.a);
    }

    public final String toString() {
        return "TaxiOrderButtonPositionExperiment(enabled=" + this.b + ", onMinicardStatuses=" + this.c + ", onTopOfDetailsStatuses=" + this.d + Extension.C_BRAKE;
    }

    public TaxiOrderButtonPositionExperiment() {
        this(0);
    }

    public TaxiOrderButtonPositionExperiment(int i) {
        jsq0 jsq0Var = ksq0.a;
        this.b = false;
        this.c = jsq0Var;
        this.d = jsq0Var;
    }
}
