package com.yandex.go.taxi.order.recalculation.experiment;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.n96;
import defpackage.nnm;
import defpackage.rpe0;
import defpackage.unr0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/recalculation/experiment/PriceRecalculationExperiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/taxi/order/recalculation/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PriceRecalculationExperiment extends n96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rpe0(6)), null, null, null};
    public static final PriceRecalculationExperiment h = new PriceRecalculationExperiment(0);
    public final boolean b;
    public final Map c;
    public final RouteChangeAlert d;
    public final RouteChangeAlert e;
    public final RouteChangeModal f;

    public PriceRecalculationExperiment(int i, boolean z, Map map, RouteChangeAlert routeChangeAlert, RouteChangeAlert routeChangeAlert2, RouteChangeModal routeChangeModal) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        int i2 = i & 4;
        RouteChangeAlert routeChangeAlert3 = RouteChangeAlert.e;
        if (i2 == 0) {
            RouteChangeAlert.Companion.getClass();
            this.d = routeChangeAlert3;
        } else {
            this.d = routeChangeAlert;
        }
        if ((i & 8) == 0) {
            RouteChangeAlert.Companion.getClass();
            this.e = routeChangeAlert3;
        } else {
            this.e = routeChangeAlert2;
        }
        if ((i & 16) != 0) {
            this.f = routeChangeModal;
        } else {
            RouteChangeModal.Companion.getClass();
            this.f = RouteChangeModal.k;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceRecalculationExperiment)) {
            return false;
        }
        PriceRecalculationExperiment priceRecalculationExperiment = (PriceRecalculationExperiment) obj;
        return this.b == priceRecalculationExperiment.b && jl40.l(this.c, priceRecalculationExperiment.c) && jl40.l(this.d, priceRecalculationExperiment.d) && jl40.l(this.e, priceRecalculationExperiment.e) && jl40.l(this.f, priceRecalculationExperiment.f);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.c;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder l = nnm.l("PriceRecalculationExperiment(enabled=", ", l10n=", ", routeChangeAlert=", this.c, this.b);
        l.append(this.d);
        l.append(", routeApplyingAlert=");
        l.append(this.e);
        l.append(", routeChangeModal=");
        l.append(this.f);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public PriceRecalculationExperiment() {
        this(0);
    }

    public PriceRecalculationExperiment(int i) {
        Map f = kotlin.collections.b.f();
        b bVar = RouteChangeAlert.Companion;
        bVar.getClass();
        bVar.getClass();
        RouteChangeModal.Companion.getClass();
        this.b = false;
        this.c = f;
        RouteChangeAlert routeChangeAlert = RouteChangeAlert.e;
        this.d = routeChangeAlert;
        this.e = routeChangeAlert;
        this.f = RouteChangeModal.k;
    }
}
