package com.yandex.go.taxi.order.details.v1.elements.driver;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsDriverExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.go.taxi.order.models.api.objects.TaxiOrderAdditionalData;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch;
import com.yandex.go.taxi.order.models.api.response.r7;
import defpackage.a2k;
import defpackage.amh;
import defpackage.apf;
import defpackage.avj0;
import defpackage.c6j;
import defpackage.d58;
import defpackage.d6j;
import defpackage.e6j;
import defpackage.evu0;
import defpackage.f6j;
import defpackage.g92;
import defpackage.gci0;
import defpackage.gs70;
import defpackage.n4h0;
import defpackage.o5j;
import defpackage.p4j;
import defpackage.p5j;
import defpackage.q5j;
import defpackage.r5j;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.u5j;
import defpackage.vng;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes14.dex */
public final class c implements a2k {
    public final r5j a;
    public final apf b;
    public final gci0 c;

    public c(gs70 gs70Var, r5j r5jVar, apf apfVar) {
        this.a = r5jVar;
        this.b = apfVar;
        this.c = r5jVar.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.q8j
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        tpr a;
        tpr g92Var;
        SearchInfoResponse$TaxiSearch.AccessibilityInfo accessibilityInfo;
        SearchInfoResponse$TaxiSearch.AccessibilityInfo accessibilityInfo2;
        f6j f6jVar = (f6j) this.c.a.getValue();
        apf apfVar = this.b;
        c6j c6jVar = c6j.a;
        OrderDetailsDriverExperiment a2 = gs70.a(taxiOrder);
        if (!a2.b) {
            a = new g92(2, c6jVar);
        } else if (a2.f && taxiOrder.h.b == DriveState.SEARCH) {
            T t = f6jVar instanceof e6j ? ((e6j) f6jVar).e : f6jVar instanceof u5j ? ((u5j) f6jVar).b : 0;
            p5j p5jVar = (p5j) apfVar.b;
            rol0 rol0Var = new rol0(new CarIconStateMapper$map$1((d58) apfVar.x, taxiOrder, null));
            r7 r7Var = taxiOrder.V().l0;
            SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch = r7Var instanceof SearchInfoResponse$TaxiSearch ? (SearchInfoResponse$TaxiSearch) r7Var : null;
            if (searchInfoResponse$TaxiSearch == null) {
                a = new g92(2, c6jVar);
            } else {
                SearchInfoResponse$TaxiSearch.CandidateSearchState candidateSearchState = searchInfoResponse$TaxiSearch.a;
                int i = candidateSearchState == null ? -1 : o5j.a[candidateSearchState.ordinal()];
                if (i == 1) {
                    g92Var = new g92(2, d6j.a);
                } else if (i == 2) {
                    r7 r7Var2 = taxiOrder.V().l0;
                    SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch2 = r7Var2 instanceof SearchInfoResponse$TaxiSearch ? (SearchInfoResponse$TaxiSearch) r7Var2 : null;
                    SearchInfoResponse$TaxiSearch.PerformerInfoResponse performerInfoResponse = searchInfoResponse$TaxiSearch2 != null ? searchInfoResponse$TaxiSearch2.f : null;
                    if (performerInfoResponse == null) {
                        a = new g92(2, c6jVar);
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) performerInfoResponse.e);
                        String str = performerInfoResponse.f;
                        if (str != null && !evu0.J(str)) {
                            Drawable t2 = vng.t(n4h0.ic_details_driver_rating_star, ((avj0) p5jVar.b).a);
                            if (t2 != null) {
                                spannableStringBuilder.append(" ", new CustomImageSpan(t2, 2, false, true, null, 20, null), 33);
                                spannableStringBuilder.append((CharSequence) str);
                            }
                        }
                        CharSequence k0 = evu0.k0(new SpannedString(spannableStringBuilder));
                        r7 r7Var3 = taxiOrder.V().l0;
                        SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch3 = r7Var3 instanceof SearchInfoResponse$TaxiSearch ? (SearchInfoResponse$TaxiSearch) r7Var3 : null;
                        String str2 = (searchInfoResponse$TaxiSearch3 == null || (accessibilityInfo = searchInfoResponse$TaxiSearch3.g) == null) ? null : accessibilityInfo.a;
                        ((p4j) apfVar.w).b("Driver");
                        rol0 c = ((e) p5jVar.a).c(taxiOrder);
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ref$ObjectRef.element = t;
                        g92Var = new m0(rol0Var, c, new DetailsCardDriverCandidateStateMapper$mapWaitingResponseCandidateState$1(k0, str2, performerInfoResponse, ref$ObjectRef, null));
                    }
                } else if (i != 3) {
                    a = new g92(2, c6jVar);
                } else {
                    r7 r7Var4 = taxiOrder.V().l0;
                    SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch4 = r7Var4 instanceof SearchInfoResponse$TaxiSearch ? (SearchInfoResponse$TaxiSearch) r7Var4 : null;
                    SearchInfoResponse$TaxiSearch.PerformerInfoResponse performerInfoResponse2 = searchInfoResponse$TaxiSearch4 != null ? searchInfoResponse$TaxiSearch4.f : null;
                    r7 r7Var5 = taxiOrder.V().l0;
                    SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch5 = r7Var5 instanceof SearchInfoResponse$TaxiSearch ? (SearchInfoResponse$TaxiSearch) r7Var5 : null;
                    String str3 = (searchInfoResponse$TaxiSearch5 == null || (accessibilityInfo2 = searchInfoResponse$TaxiSearch5.g) == null) ? null : accessibilityInfo2.a;
                    if (str3 == null) {
                        str3 = performerInfoResponse2 != null ? performerInfoResponse2.e : null;
                        if (str3 == null) {
                            str3 = "";
                        }
                    }
                    a = new g92(2, new u5j(str3, performerInfoResponse2 != null ? performerInfoResponse2.a : null));
                }
                a = g92Var;
            }
        } else {
            a = ((d) apfVar.c).a(taxiOrder, a2.f, f6jVar, new rol0(new CarIconStateMapper$map$1((d58) apfVar.x, taxiOrder, null)), new amh(19, apfVar));
        }
        return kotlinx.coroutines.flow.e.k(a, new DetailsCardDriverInteractor$onOrderUpdated$2(this, null), continuation);
    }

    @Override // defpackage.a2k
    public final Object b(TaxiOrder taxiOrder) {
        TaxiOrderAdditionalData b = taxiOrder.b();
        OrderDetailsDriverExperiment a = gs70.a(taxiOrder);
        Driver driver = taxiOrder.V().g;
        r7 r7Var = taxiOrder.V().l0;
        return new q5j(b, a, driver, r7Var instanceof SearchInfoResponse$TaxiSearch ? (SearchInfoResponse$TaxiSearch) r7Var : null);
    }
}
