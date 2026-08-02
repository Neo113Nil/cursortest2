package com.yandex.go.scooters.offers.v2.analytics;

import android.view.View;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes13.dex */
public final class b implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ c c;

    public b(View view, Ref$ObjectRef ref$ObjectRef, c cVar) {
        this.a = view;
        this.b = ref$ObjectRef;
        this.c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.yandex.go.scooters.offers.v2.analytics.a] */
    @Override // java.lang.Runnable
    public final void run() {
        Ref$ObjectRef ref$ObjectRef = this.b;
        ref$ObjectRef.element = a.a((a) ref$ObjectRef.element, null, 0L, 0L, 0L, 0L, System.currentTimeMillis(), 95);
        i d = ((j) this.c.b).d("Perf.ScootersOffer.Create");
        a aVar = (a) this.b.element;
        d.c(aVar.b - aVar.g, "card_building_duration");
        a aVar2 = (a) this.b.element;
        d.c(aVar2.c - aVar2.b, "request_duration");
        a aVar3 = (a) this.b.element;
        d.c(aVar3.d - aVar3.c, "response_duration");
        a aVar4 = (a) this.b.element;
        d.c(aVar4.e - aVar4.d, "preparing_duration");
        a aVar5 = (a) this.b.element;
        d.c(aVar5.f - aVar5.e, "render_duration");
        a aVar6 = (a) this.b.element;
        d.c(aVar6.f - aVar6.g, "total_duration");
        ScootersOfferCardPerformanceAnalytics$OfferType scootersOfferCardPerformanceAnalytics$OfferType = ((a) this.b.element).a;
        d.d("offer_type", scootersOfferCardPerformanceAnalytics$OfferType != null ? scootersOfferCardPerformanceAnalytics$OfferType.getTypeName() : null);
        d.m();
        c cVar = this.c;
        a aVar7 = (a) this.b.element;
        c.a(cVar, "CardBuilding", aVar7.b - aVar7.g);
        c cVar2 = this.c;
        a aVar8 = (a) this.b.element;
        c.a(cVar2, "Request", aVar8.c - aVar8.b);
        c cVar3 = this.c;
        a aVar9 = (a) this.b.element;
        c.a(cVar3, "Response", aVar9.d - aVar9.c);
        c cVar4 = this.c;
        a aVar10 = (a) this.b.element;
        c.a(cVar4, "Preparing", aVar10.e - aVar10.d);
        c cVar5 = this.c;
        a aVar11 = (a) this.b.element;
        c.a(cVar5, "Render", aVar11.f - aVar11.e);
        c cVar6 = this.c;
        a aVar12 = (a) this.b.element;
        c.a(cVar6, "Total", aVar12.f - aVar12.g);
        this.c.c = null;
    }
}
